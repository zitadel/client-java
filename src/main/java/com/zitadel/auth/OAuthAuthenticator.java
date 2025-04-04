package com.zitadel.auth;

import com.nimbusds.oauth2.sdk.*;
import com.nimbusds.oauth2.sdk.auth.ClientAuthentication;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.token.BearerAccessToken;

import javax.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * Abstract base class for OAuth-based authenticators.
 * <p>
 * Provides common functionality for OAuth authenticators, including token management
 * and header construction.
 */
public abstract class OAuthAuthenticator extends Authenticator {

  /**
   * The URL of the OAuth2 token endpoint.
   */
  protected final URL tokenUrl;
  /**
   * The scope for the token request.
   */
  protected final Scope scope;
  protected final AuthorizationGrant grant;
  /**
   * The OAuth token.
   */
  @Nullable
  protected Token token;

  /**
   * Constructs an OAuthAuthenticator.
   *
   * @param host     The base URL for API endpoints.
   * @param tokenUrl The URL of the OAuth2 token endpoint.
   * @param scope    The scope for the token request.
   */
  public OAuthAuthenticator(String host, AuthorizationGrant grant, String tokenUrl, Scope scope) throws URISyntaxException, MalformedURLException {
    super(host);
    this.grant = grant;
    this.tokenUrl = new URI(host).resolve(tokenUrl).toURL();
    this.scope = scope;
    this.token = null;
  }

  /**
   * Retrieves the authentication headers.
   * <p>
   * If no token is available or the current token is expired, refreshes the token.
   *
   * @return A map containing the 'Authorization' header.
   */
  @Override
  public Map<String, String> getAuthHeaders() {
    if (token == null || token.isExpired()) {
      refreshToken();
    }

    return Collections.singletonMap("Authorization", "Bearer " + token.accessToken);
  }

  /**
   * Refreshes the access token.
   * <p>
   * Subclasses must implement this method using their specific OAuth flow.
   */
  public abstract void refreshToken();

  protected Token getToken(ClientAuthentication authentication) {
    try {
      URI tokenEndpoint = tokenUrl.toURI();
      TokenRequest request = new TokenRequest(tokenEndpoint, authentication, this.grant, this.scope);
      HTTPRequest httpRequest = request.toHTTPRequest();
      TokenResponse tokenResponse = TokenResponse.parse(httpRequest.send());

      if (!tokenResponse.indicatesSuccess()) {
        TokenErrorResponse errorResponse = tokenResponse.toErrorResponse();
        throw new RuntimeException("Token request failed: " + errorResponse.getErrorObject().toString());
      } else {
        AccessTokenResponse successResponse = (AccessTokenResponse) tokenResponse;
        BearerAccessToken accessToken = (BearerAccessToken) successResponse.getTokens().getAccessToken();
        return new Token(accessToken.getValue(), Instant.now().plusSeconds(accessToken.getLifetime()));
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to refresh token: " + e.getMessage(), e);
    }
  }

  /**
   * A simple POJO representing an OAuth token.
   */
  public static class Token {

    protected final String accessToken;
    protected final Instant expiresAt;

    /**
     * Constructs a Token.
     *
     * @param accessToken The access token string.
     * @param expiresAt   The expiration time as an epoch second.
     */
    public Token(String accessToken, Instant expiresAt) {
      this.accessToken = accessToken;
      this.expiresAt = expiresAt;
    }

    /**
     * Checks if the token is expired.
     *
     * @return true if expired; false otherwise.
     */
    public boolean isExpired() {
      return Instant.now().isAfter(expiresAt);
    }
  }

  protected static abstract class OAuthAuthenticatorBuilder<T extends OAuthAuthenticatorBuilder<?>> {

    protected final String host;
    protected Set<String> authScopes = Collections.singleton("openid");
    protected String tokenEndpoint = "/oauth/v2/token";

    protected OAuthAuthenticatorBuilder(String host) {
      this.host = host;
    }

    /**
     * Overrides the default token URL.
     *
     * @param tokenEndpoint The URL (or relative path starting with '/') of the OAuth2 token endpoint.
     * @return The builder instance.
     */
    public final OAuthAuthenticatorBuilder<T> tokenEndpoint(String tokenEndpoint) {
      this.tokenEndpoint = tokenEndpoint;
      return this;
    }

    /**
     * Overrides the default scopes.
     *
     * @param authScopes A set of scopes for the token request.
     * @return The builder instance.
     */
    public final OAuthAuthenticatorBuilder<T> scopes(Set<String> authScopes) {
      this.authScopes = authScopes;
      return this;
    }
  }
}
