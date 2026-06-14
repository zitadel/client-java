package com.zitadel.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.ApiClient;
import com.zitadel.ApiException;
import com.zitadel.ApiHttpResponse;
import com.zitadel.TransportOptions;
import com.zitadel.ZitadelException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
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
 * HttpAwareAuthenticator}: the shared {@link ApiClient} is injected by the {@code Client} / {@code
 * Zitadel} constructor and the token POST is sent through it. Sharing the SDK transport means token
 * exchange honours the same proxy, TLS, timeout and redirect configuration as regular API calls.
 */
@SuppressFBWarnings("URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD")
public abstract class OAuthAuthenticator extends BaseAuthenticator
    implements HttpAwareAuthenticator {

  /** Seconds before expiry at which a cached token is treated as stale. */
  private static final long REFRESH_SKEW_SECONDS = 300;

  /** The space-delimited scope string for the token request. */
  protected final String scope;

  private final OpenId openId;

  @Nullable private volatile ApiClient apiClient;

  /** The cached OAuth token. */
  @Nullable protected volatile Token token;

  /**
   * Constructs an OAuthAuthenticator.
   *
   * @param openId the OpenID discovery helper for the target host.
   * @param scope the space-delimited scope string for the token request.
   */
  protected OAuthAuthenticator(OpenId openId, String scope) {
    this.openId = openId;
    this.scope = scope;
    this.token = null;
  }

  @Override
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public String getHost() {
    return openId.getHostEndpoint().toString();
  }

  /**
   * Returns a valid access token, minting (or re-minting) one if the cache is empty or within the
   * refresh skew of expiring.
   *
   * @return a valid access token.
   * @throws ZitadelException if the token cannot be obtained.
   */
  public String getAuthToken() throws ZitadelException {
    Token current = token;
    if (current == null || current.isExpired()) {
      synchronized (this) {
        current = token;
        if (current == null || current.isExpired()) {
          current = refreshToken();
        }
      }
    }
    if (current == null) {
      throw new IllegalStateException("Token could not be refreshed successfully.");
    }
    return current.accessToken;
  }

  /**
   * Retrieves the authentication headers.
   *
   * <p>If no token is available or the current token is expired, refreshes the token.
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
   * <p>POSTs an {@code application/x-www-form-urlencoded} body to the token endpoint through the
   * injected {@link ApiClient}. Subclasses contribute the grant_type, the grant-specific parameters
   * (scope, assertion, ...) and any grant-specific request headers (e.g. HTTP Basic client
   * authentication).
   *
   * @return the freshly minted token.
   * @throws ZitadelException if the client is not yet injected or the exchange fails.
   */
  public Token refreshToken() throws ZitadelException {
    ApiClient client = apiClient;
    if (client == null) {
      throw new ZitadelException(
          "OAuthAuthenticator has no ApiClient; it must be used via the SDK Client/Zitadel"
              + " entry point, which injects the shared transport before any token exchange.");
    }

    Map<String, String> params = new LinkedHashMap<>();
    params.put("grant_type", getGrantType());
    params.put("scope", scope);
    params.putAll(getTokenRequestParams());

    Map<String, String> headers = new LinkedHashMap<>();
    headers.put("Content-Type", "application/x-www-form-urlencoded");
    headers.put("Accept", "application/json");
    headers.putAll(getTokenRequestHeaders());

    try {
      ApiHttpResponse response =
          client.sendRequest(
              "POST",
              openId.getTokenEndpoint(client).toString(),
              headers,
              encodeForm(params),
              // never replay a token POST across a redirect — a malicious
              // 307/308 could otherwise leak the assertion/secret.
              true);

      if (response.statusCode() < 200 || response.statusCode() >= 300) {
        throw new ZitadelException(
            "Token refresh failed: token endpoint returned HTTP " + response.statusCode());
      }

      JsonNode payload = new ObjectMapper().readTree(response.body());
      JsonNode accessTokenNode = payload.path("access_token");
      if (!accessTokenNode.isTextual()) {
        throw new ZitadelException(
            "Token refresh failed: token endpoint response did not contain an access_token.");
      }

      Instant expiresAt;
      JsonNode expiresIn = payload.path("expires_in");
      if (expiresIn.isNumber() && expiresIn.asLong() > 0) {
        expiresAt = Instant.now().plusSeconds(expiresIn.asLong());
      } else {
        expiresAt = Instant.MAX;
      }

      Token fresh = new Token(accessTokenNode.asText(), expiresAt);
      this.token = fresh;
      return fresh;
    } catch (ApiException | IOException e) {
      throw new ZitadelException("Failed to refresh token: " + e.getMessage(), e);
    }
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
   * Grant-specific token-request headers (e.g. HTTP Basic client authentication).
   *
   * @return additional headers for the token request; empty by default.
   */
  protected Map<String, String> getTokenRequestHeaders() {
    return Collections.emptyMap();
  }

  /** A simple POJO representing an OAuth token. */
  public static class Token {

    protected final String accessToken;
    protected final Instant expiresAt;

    /**
     * Constructs a Token.
     *
     * @param accessToken the access token string.
     * @param expiresAt the expiration time.
     */
    private Token(String accessToken, Instant expiresAt) {
      this.accessToken = accessToken;
      this.expiresAt = expiresAt;
    }

    /**
     * Checks if the token is expired (within the refresh skew).
     *
     * @return true if expired; false otherwise.
     */
    private boolean isExpired() {
      if (expiresAt.equals(Instant.MAX)) {
        return false;
      }
      return Instant.now().isAfter(expiresAt.minus(REFRESH_SKEW_SECONDS, ChronoUnit.SECONDS));
    }
  }

  /**
   * Abstract builder for OAuth authenticator instances.
   *
   * @param <T> the concrete builder type.
   */
  protected abstract static class OAuthAuthenticatorBuilder<
      T extends OAuthAuthenticatorBuilder<?>> {

    /** The OpenID discovery helper for the target host. */
    protected final OpenId openId;

    /** The space-delimited scope string for the token request. */
    protected String scope = "openid urn:zitadel:iam:org:project:id:zitadel:aud";

    /**
     * @param host the base URL for the API endpoints.
     */
    protected OAuthAuthenticatorBuilder(String host) {
      this.openId = new OpenId(host);
    }

    /**
     * @param host the base URL for the API endpoints.
     * @param transportOptions optional transport options for TLS, proxy, and headers.
     */
    protected OAuthAuthenticatorBuilder(String host, @Nullable TransportOptions transportOptions) {
      this.openId = new OpenId(host);
    }

    /**
     * Overrides the default scopes.
     *
     * @param authScopes a set of scopes for the token request.
     * @return the builder instance.
     */
    @SuppressWarnings("unchecked")
    public final T scopes(Set<String> authScopes) {
      this.scope = String.join(" ", authScopes);
      return (T) this;
    }
  }
}
