package com.zitadel.auth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.ApiClient;
import com.zitadel.ApiHttpResponse;
import com.zitadel.errors.OAuth2ServerException;
import com.zitadel.errors.OAuth2TokenException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/**
 * Abstract base class for OAuth-based, token-minting authenticators.
 *
 * <p>Mints a bearer token by POSTing an OAuth2 grant (client-credentials or a signed JWT-bearer
 * assertion) to the provider's token endpoint, then attaches the resulting access token on every
 * API request. The minted token is cached together with its expiry and only re-minted once it is
 * within the refresh skew of expiring.
 *
 * <p>Token-minting requires an outbound HTTP call, so this class implements {@link
 * HttpAwareAuthenticator}: the shared {@link ApiClient} is injected by the {@code Zitadel}
 * constructor and both OpenID discovery and the token POST are sent through it. A token request
 * fails with:
 *
 * <ul>
 *   <li>{@link IllegalStateException} when no {@link ApiClient} has been injected;
 *   <li>{@link com.zitadel.errors.NetworkException} or {@link
 *       com.zitadel.errors.NetworkTimeoutException} when no HTTP response arrived;
 *   <li>{@link OAuth2ServerException} when the token endpoint answered with a non-2xx status;
 *   <li>{@link OAuth2TokenException} when it answered 2xx without a usable access token.
 * </ul>
 */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
public abstract class OAuthAuthenticator extends BaseAuthenticator
    implements HttpAwareAuthenticator {

  /** Seconds before expiry at which a cached token is treated as stale. */
  private static final long REFRESH_SKEW_SECONDS = 300;

  /** The default scopes requested when none are configured. */
  private static final String DEFAULT_SCOPE = "openid urn:zitadel:iam:org:project:id:zitadel:aud";

  private static final Pattern WHITESPACE = Pattern.compile("\\s");

  /** The space-delimited scope string for the token request. */
  protected final String scope;

  private final OpenId openId;

  @Nullable private volatile ApiClient apiClient;

  @Nullable private volatile String accessToken;

  @Nullable private volatile Instant expiresAt;

  /**
   * Constructs an OAuthAuthenticator.
   *
   * @param openId the OpenID discovery helper for the target host.
   * @param scope the space-delimited scope string for the token request.
   */
  protected OAuthAuthenticator(OpenId openId, String scope) {
    this.openId = openId;
    this.scope = scope;
  }

  @Override
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public String getHost() {
    return openId.getHostEndpoint();
  }

  /**
   * Returns a valid access token, minting (or re-minting) one if the cache is empty or within the
   * refresh skew of expiring.
   *
   * @return a valid access token.
   */
  public String getAuthToken() {
    String current = accessToken;
    if (current == null || isStale()) {
      synchronized (this) {
        current = accessToken;
        if (current == null || isStale()) {
          current = refreshToken();
        }
      }
    }
    return current;
  }

  private boolean isStale() {
    Instant expiry = expiresAt;
    return expiry != null && !Instant.now().isBefore(expiry.minusSeconds(REFRESH_SKEW_SECONDS));
  }

  /**
   * Retrieves the authentication headers, minting a token first when needed.
   *
   * @return a map containing the {@code Authorization} header.
   */
  @Override
  public Map<String, String> getAuthHeaders() {
    return Collections.singletonMap("Authorization", "Bearer " + getAuthToken());
  }

  /**
   * Exchanges the configured grant for a fresh access token and caches it.
   *
   * @return the freshly minted access token.
   */
  public synchronized String refreshToken() {
    ApiClient client = apiClient;
    if (client == null) {
      throw new IllegalStateException(
          "OAuthAuthenticator has no ApiClient; use it through the Zitadel client, which injects"
              + " one before the first token request.");
    }

    Map<String, String> params = new LinkedHashMap<>();
    params.put("grant_type", getGrantType());
    params.put("scope", scope);
    params.putAll(getTokenRequestParams());

    Map<String, String> headers = new LinkedHashMap<>();
    headers.put("Content-Type", "application/x-www-form-urlencoded");
    headers.put("Accept", "application/json");

    ApiHttpResponse response =
        client.sendRequest(
            "POST",
            openId.getTokenEndpoint(client),
            headers,
            encodeForm(params),
            // never replay a token POST across a redirect: a malicious 307/308 could otherwise
            // leak the assertion or secret.
            true);

    int status = response.statusCode();
    if (status < 200 || status >= 300) {
      throw serverError(status, response.body());
    }

    JsonNode payload = parseObject(response.body());
    if (payload == null) {
      throw new OAuth2TokenException("Token response is not a JSON object");
    }
    JsonNode token = payload.get("access_token");
    if (token == null || !token.isTextual() || token.asText().isEmpty()) {
      throw new OAuth2TokenException("Token response missing or empty access_token field");
    }
    JsonNode expiresIn = payload.get("expires_in");
    this.expiresAt =
        expiresIn != null && expiresIn.isNumber() && expiresIn.asLong() > 0
            ? Instant.now().plusSeconds(expiresIn.asLong())
            : null;
    this.accessToken = token.asText();
    return token.asText();
  }

  @Nullable
  private static JsonNode parseObject(String body) {
    try {
      JsonNode node = new ObjectMapper().readTree(body);
      return node != null && node.isObject() ? node : null;
    } catch (JsonProcessingException e) {
      return null;
    }
  }

  private static OAuth2ServerException serverError(int status, String body) {
    JsonNode payload = parseObject(body);
    JsonNode code = payload == null ? null : payload.get("error");
    if (payload == null || code == null || !code.isTextual() || code.asText().isEmpty()) {
      return new OAuth2ServerException(status, null, null, null, body);
    }
    JsonNode description = payload.get("error_description");
    JsonNode uri = payload.get("error_uri");
    return new OAuth2ServerException(
        status,
        code.asText(),
        description != null && description.isTextual() ? description.asText() : null,
        uri != null && uri.isTextual() ? uri.asText() : null,
        body);
  }

  /**
   * Returns a string representation of this authenticator with the cached access token redacted.
   *
   * @return a string representation with the cached token redacted.
   */
  @Override
  public String toString() {
    return getClass().getSimpleName()
        + "(host="
        + getHost()
        + ", scope="
        + scope
        + ", accessToken="
        + maskedToken()
        + ")";
  }

  /**
   * Returns {@code ***} when a token is cached and {@code null} otherwise.
   *
   * @return the masked token.
   */
  @Nullable
  protected final String maskedToken() {
    return accessToken == null ? null : "***";
  }

  private static String encodeForm(Map<String, String> params) {
    StringJoiner joiner = new StringJoiner("&");
    for (Map.Entry<String, String> entry : params.entrySet()) {
      joiner.add(
          URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8)
              + "="
              + URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
    }
    return joiner.toString();
  }

  /**
   * Throws {@link IllegalArgumentException} when the value is null or blank.
   *
   * @param value the value to check.
   * @param label the name used in the error message.
   * @return the value.
   */
  static String requireText(@Nullable String value, String label) {
    if (value == null || value.trim().isEmpty()) {
      throw new IllegalArgumentException(label + " cannot be empty.");
    }
    return value;
  }

  /**
   * The OAuth2 {@code grant_type} value sent in the token request.
   *
   * @return the grant type.
   */
  protected abstract String getGrantType();

  /**
   * Grant-specific token-request parameters (e.g. assertion).
   *
   * @return additional form parameters for the token request.
   */
  protected abstract Map<String, String> getTokenRequestParams();

  /**
   * Abstract builder for OAuth authenticator instances.
   *
   * @param <T> the concrete builder type.
   */
  @SuppressWarnings("checkstyle:AbbreviationAsWordInName")
  protected abstract static class OAuthAuthenticatorBuilder<
      T extends OAuthAuthenticatorBuilder<?>> {

    /** The OpenID discovery helper for the target host. */
    protected final OpenId openId;

    /** The space-delimited scope string for the token request. */
    protected String scope = DEFAULT_SCOPE;

    /**
     * Initialises the builder for the given host.
     *
     * @param host the base URL for the API endpoints.
     * @throws IllegalArgumentException if the host is not a valid http or https URL.
     */
    protected OAuthAuthenticatorBuilder(String host) {
      this.openId = new OpenId(host);
    }

    /**
     * Overrides the default scopes. Duplicates are dropped; order is kept.
     *
     * @param authScopes the scopes for the token request.
     * @return the builder instance.
     * @throws IllegalArgumentException if no scope is given, or a scope is empty or contains
     *     whitespace.
     */
    @SuppressWarnings("unchecked")
    public final T scopes(String... authScopes) {
      if (authScopes == null || authScopes.length == 0) {
        throw new IllegalArgumentException("At least one scope is required.");
      }
      Set<String> unique = new LinkedHashSet<>();
      for (String authScope : authScopes) {
        if (authScope == null || authScope.isEmpty() || WHITESPACE.matcher(authScope).find()) {
          throw new IllegalArgumentException(
              "Scope must be a non-empty string without whitespace: '" + authScope + "'");
        }
        unique.add(authScope);
      }
      this.scope = String.join(" ", unique);
      return (T) this;
    }
  }
}
