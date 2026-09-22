package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.zitadel.ApiClient;
import com.zitadel.ApiException;
import com.zitadel.ApiHttpResponse;
import com.zitadel.DefaultApiClient;
import com.zitadel.ObjectSerializer.SerializationException;
import com.zitadel.ZitadelException;
import com.zitadel.errors.InternalServerErrorException;
import com.zitadel.errors.NetworkException;
import com.zitadel.errors.NotFoundException;
import com.zitadel.errors.OAuth2ServerException;
import com.zitadel.errors.OAuth2TokenException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies the {@link OAuthAuthenticator} contract shared by every OAuth authenticator: token
 * redaction, host validation, OpenID discovery failures and token endpoint failures.
 *
 * <p>No test reaches a real host. HTTP-level cases use an in-memory {@link ApiClient} that answers
 * with canned responses; the transport case uses the real {@link DefaultApiClient} against a local
 * port nothing listens on.
 */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
class OAuthAuthenticatorTest {

  private static final String TOKEN = "minted-access-token-do-not-leak";

  private static final String HOST = "https://zitadel.example.com";

  private static final String DISCOVERY =
      "{\"issuer\":\"" + HOST + "\",\"token_endpoint\":\"" + HOST + "/oauth/v2/token\"}";

  /** An {@link ApiClient} that records requests and answers discovery and token calls. */
  private static final class StubApiClient implements ApiClient {
    private final ApiHttpResponse discovery;
    private final ApiHttpResponse token;
    private final List<String> bodies = new ArrayList<>();

    StubApiClient(ApiHttpResponse discovery, ApiHttpResponse token) {
      this.discovery = discovery;
      this.token = token;
    }

    @Override
    public ApiHttpResponse sendRequest(
        String method, String url, Map<String, String> headers, @Nullable Object body) {
      if (url.endsWith("/.well-known/openid-configuration")) {
        return discovery;
      }
      bodies.add(String.valueOf(body));
      return token;
    }
  }

  private static ApiHttpResponse response(int status, String body) {
    return new ApiHttpResponse(status, body, Map.of());
  }

  private static ClientCredentialsAuthenticator authenticator(ApiClient apiClient) {
    ClientCredentialsAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder(HOST, "client-1", "client-secret").build();
    authenticator.setApiClient(apiClient);
    return authenticator;
  }

  private static ClientCredentialsAuthenticator authenticator(int status, String tokenBody) {
    return authenticator(new StubApiClient(response(200, DISCOVERY), response(status, tokenBody)));
  }

  /** The OAuth authenticator must mask the cached access token in {@code toString()}. */
  @Test
  @DisplayName("OAuthAuthenticator masks the cached access token")
  void redactsSecret() throws ReflectiveOperationException {
    OAuthAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder(HOST, "client-1", "client-secret").build();
    Field field = OAuthAuthenticator.class.getDeclaredField("accessToken");
    field.setAccessible(true);
    field.set(authenticator, TOKEN);

    String rendered = OAuthAuthenticator.class.cast(authenticator).toString();

    assertFalse(rendered.contains(TOKEN), "toString must not contain the cached token");
    assertTrue(rendered.contains("***"), "toString must redact the token with ***");
  }

  @Test
  @DisplayName("a successful exchange caches the token")
  void mintsAndCachesToken() {
    StubApiClient apiClient =
        new StubApiClient(
            response(200, DISCOVERY),
            response(200, "{\"access_token\":\"" + TOKEN + "\",\"expires_in\":3600}"));
    ClientCredentialsAuthenticator authenticator = authenticator(apiClient);

    assertEquals(TOKEN, authenticator.getAuthToken());
    assertEquals(Map.of("Authorization", "Bearer " + TOKEN), authenticator.getAuthHeaders());
    assertEquals(1, apiClient.bodies.size(), "a cached token must not be minted again");
    assertTrue(apiClient.bodies.get(0).startsWith("grant_type=client_credentials&scope=openid"));
  }

  @Test
  @DisplayName("an empty, non-http or host-less URL is an IllegalArgumentException")
  void rejectsBadHost() {
    for (String host : new String[] {"", "ftp://example.com", "https://"}) {
      assertThrowsExactly(
          IllegalArgumentException.class,
          () -> ClientCredentialsAuthenticator.builder(host, "client-1", "client-secret"));
    }
  }

  @Test
  @DisplayName("requesting a token before the ApiClient is injected is an IllegalStateException")
  void requiresApiClient() {
    ClientCredentialsAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder(HOST, "client-1", "client-secret").build();

    assertThrowsExactly(IllegalStateException.class, authenticator::getAuthToken);
  }

  @Test
  @DisplayName("unreachable OpenID discovery is a NetworkException with status 0")
  void discoveryUnreachable() {
    ClientCredentialsAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder("http://127.0.0.1:1", "client-1", "client-secret")
            .build();
    authenticator.setApiClient(new DefaultApiClient());

    NetworkException error =
        assertThrowsExactly(NetworkException.class, authenticator::getAuthToken);
    assertInstanceOf(ApiException.class, error);
    assertEquals(0, error.getStatusCode());
  }

  @Test
  @DisplayName("a non-2xx OpenID discovery response is the ApiException for that status")
  void discoveryNon2xx() {
    NotFoundException notFound =
        assertThrowsExactly(
            NotFoundException.class,
            authenticator(new StubApiClient(response(404, "{}"), response(200, "{}")))
                ::getAuthToken);
    assertEquals(404, notFound.getStatusCode());
    assertInstanceOf(ZitadelException.class, notFound);

    assertThrowsExactly(
        InternalServerErrorException.class,
        authenticator(new StubApiClient(response(500, "{}"), response(200, "{}")))::getAuthToken);
  }

  @Test
  @DisplayName("an unusable OpenID discovery document is a SerializationException")
  void discoveryMalformed() {
    for (String body : new String[] {"not json", "[]", "{\"issuer\":\"x\"}"}) {
      SerializationException error =
          assertThrowsExactly(
              SerializationException.class,
              authenticator(new StubApiClient(response(200, body), response(200, "{}")))
                  ::getAuthToken);
      assertInstanceOf(ZitadelException.class, error);
    }
  }

  @Test
  @DisplayName("a non-2xx token response is an OAuth2ServerException")
  void tokenEndpointRejects() {
    OAuth2ServerException error =
        assertThrowsExactly(
            OAuth2ServerException.class,
            authenticator(401, "{\"error\":\"invalid_client\",\"error_description\":\"bad\"}")
                ::getAuthToken);
    assertEquals(401, error.getStatusCode());
    assertEquals("invalid_client", error.getCode());
    assertEquals("bad", error.getDescription());
    assertInstanceOf(ZitadelException.class, error);

    OAuth2ServerException raw =
        assertThrowsExactly(OAuth2ServerException.class, authenticator(503, "down")::getAuthToken);
    assertEquals(503, raw.getStatusCode());
    assertEquals("down", raw.getRawBody());
  }

  @Test
  @DisplayName("a 2xx token response without an access token is an OAuth2TokenException")
  void tokenEndpointUnusable() {
    for (String body :
        new String[] {"{\"token_type\":\"Bearer\"}", "not json", "{\"access_token\":\"\"}"}) {
      OAuth2TokenException error =
          assertThrowsExactly(OAuth2TokenException.class, authenticator(200, body)::getAuthToken);
      assertInstanceOf(ZitadelException.class, error);
    }
  }

  @Test
  @DisplayName("scopes must be non-empty strings without whitespace")
  void rejectsBadScopes() {
    ClientCredentialsAuthenticator.Builder builder =
        ClientCredentialsAuthenticator.builder(HOST, "client-1", "client-secret");

    assertThrowsExactly(IllegalArgumentException.class, builder::scopes);
    assertThrowsExactly(IllegalArgumentException.class, () -> builder.scopes("open id"));
    assertThrowsExactly(IllegalArgumentException.class, () -> builder.scopes(""));
  }

  @Test
  @DisplayName("scopes keep their order and drop duplicates")
  void joinsScopes() {
    StubApiClient apiClient =
        new StubApiClient(response(200, DISCOVERY), response(200, "{\"access_token\":\"t\"}"));
    ClientCredentialsAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder(HOST, "client-1", "client-secret")
            .scopes("openid", "profile", "openid")
            .build();
    authenticator.setApiClient(apiClient);

    authenticator.getAuthToken();

    assertTrue(apiClient.bodies.get(0).contains("&scope=openid+profile&"));
  }
}
