package com.zitadel.auth;

import com.nimbusds.oauth2.sdk.*;
import com.nimbusds.oauth2.sdk.auth.ClientAuthentication;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.token.BearerAccessToken;
import com.zitadel.ZitadelException;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * Abstract base class for OAuth-based authenticators.
 *
 * <p>Provides common functionality for OAuth authenticators, including token management and header
 * construction.
 */
public abstract class OAuthAuthenticator extends Authenticator {

    /**
     * The scope for the token request.
     */
    protected final Scope scope;

    private final OpenId openId;
    /**
     * The OAuth token.
     */
    @Nullable
    protected Token token;

    /**
     * Constructs an OAuthAuthenticator.
     *
     * @param openId The URL of the OAuth2 token endpoint.
     * @param scope  The scope for the token request.
     */
    public OAuthAuthenticator(OpenId openId, Scope scope) {
        super(openId.getHostEndpoint());
        this.scope = new Scope(scope);
        this.token = null;
        this.openId = openId;
    }

    public String getAuthToken() throws ZitadelException {
        if (token == null || token.isExpired()) {
            refreshToken();
        }

        if (token == null) {
            throw new RuntimeException();
        }
        return token.accessToken;
    }

    /**
     * Retrieves the authentication headers.
     *
     * <p>If no token is available or the current token is expired, refreshes the token.
     *
     * @return A map containing the 'Authorization' header.
     */
    @Override
    public Map<String, String> getAuthHeaders() throws ZitadelException {
        return Collections.singletonMap("Authorization", "Bearer " + getAuthToken());
    }

    /**
     * Refreshes the access token.
     *
     * <p>Subclasses must implement this method using their specific OAuth flow.
     */
    public abstract Token refreshToken() throws ZitadelException;

    protected abstract AuthorizationGrant getGrant();

    protected Token getToken(ClientAuthentication authentication) throws ZitadelException {
        try {
            URI tokenEndpoint = openId.getTokenEndpoint().toURI();
            TokenRequest request =
                new TokenRequest(tokenEndpoint, authentication, this.getGrant(), this.scope);
            HTTPRequest httpRequest = request.toHTTPRequest();
            TokenResponse tokenResponse = TokenResponse.parse(httpRequest.send());

            if (!tokenResponse.indicatesSuccess()) {
                TokenErrorResponse errorResponse = tokenResponse.toErrorResponse();
                throw new ZitadelException(
                    "Token request failed: " + errorResponse.getErrorObject().toString());
            } else {
                AccessTokenResponse successResponse = (AccessTokenResponse) tokenResponse;
                BearerAccessToken accessToken =
                    (BearerAccessToken) successResponse.getTokens().getAccessToken();
                return new Token(
                    accessToken.getValue(), Instant.now().plusSeconds(accessToken.getLifetime()));
            }
        } catch (RuntimeException | IOException | ParseException | URISyntaxException e) {
            throw new ZitadelException("Failed to refresh token: " + e.getMessage(), e);
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
        private Token(String accessToken, Instant expiresAt) {
            this.accessToken = accessToken;
            this.expiresAt = expiresAt;
        }

        /**
         * Checks if the token is expired.
         *
         * @return true if expired; false otherwise.
         */
        private boolean isExpired() {
            return Instant.now().isAfter(expiresAt);
        }
    }

    protected abstract static class OAuthAuthenticatorBuilder<
        T extends OAuthAuthenticatorBuilder<?>> {

        protected final OpenId openId;
        protected Scope authScopes = Scope.parse("openid urn:zitadel:iam:org:project:id:zitadel:aud");

        protected OAuthAuthenticatorBuilder(String host) {
            this.openId = new OpenId(host);
        }

        /**
         * Overrides the default scopes.
         *
         * @param authScopes A set of scopes for the token request.
         * @return The builder instance.
         */
        @SuppressWarnings("unchecked")
        public final T scopes(Set<String> authScopes) {
            this.authScopes = Scope.parse(authScopes);
            return (T) this;
        }
    }
}
