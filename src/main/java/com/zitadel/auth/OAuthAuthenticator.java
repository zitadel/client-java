package com.zitadel.auth;

import com.nimbusds.oauth2.sdk.*;
import com.nimbusds.oauth2.sdk.auth.ClientAuthentication;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.token.BearerAccessToken;
import com.zitadel.TransportOptions;
import com.zitadel.ZitadelException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
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
    private final TransportOptions transportOptions;
    /**
     * The OAuth token.
     */
    @Nullable
    protected volatile Token token;

    /**
     * Constructs an OAuthAuthenticator.
     *
     * @param openId           The URL of the OAuth2 token endpoint.
     * @param scope            The scope for the token request.
     * @param transportOptions The transport options for HTTP connections.
     */
    public OAuthAuthenticator(OpenId openId, Scope scope, TransportOptions transportOptions) {
        super(openId.getHostEndpoint());
        this.scope = new Scope(scope);
        this.token = null;
        this.openId = openId;
        this.transportOptions = transportOptions != null ? transportOptions : TransportOptions.defaults();
    }

    public String getAuthToken() throws ZitadelException {
        //noinspection DataFlowIssue
        if (token == null || token.isExpired()) {
            synchronized (this) {
                //noinspection DataFlowIssue
                if (token == null || token.isExpired()) {
                    refreshToken();
                }
            }
        }

        if (token == null) {
            throw new IllegalStateException("Token could not be refreshed successfully.");
        } else {
            //noinspection DataFlowIssue
            return token.accessToken;
        }
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

    @SuppressFBWarnings("PATH_TRAVERSAL_IN")
    protected Token getToken(ClientAuthentication authentication) throws ZitadelException {
        try {
            URI tokenEndpoint = openId.getTokenEndpoint().toURI();
            TokenRequest request =
                new TokenRequest(tokenEndpoint, authentication, this.getGrant(), this.scope);
            HTTPRequest httpRequest = request.toHTTPRequest();

            // Apply proxy settings
            if (transportOptions.getProxyUrl() != null) {
                URL proxyParsed = new URL(transportOptions.getProxyUrl());
                httpRequest.setProxy(new Proxy(Proxy.Type.HTTP,
                    new InetSocketAddress(proxyParsed.getHost(),
                        proxyParsed.getPort() != -1 ? proxyParsed.getPort() : proxyParsed.getDefaultPort())));
                if (proxyParsed.getUserInfo() != null) {
                    String encoded = java.util.Base64.getEncoder()
                        .encodeToString(proxyParsed.getUserInfo().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                    httpRequest.setHeader("Proxy-Authorization", "Basic " + encoded);
                }
            }

            // Apply SSL settings
            if (transportOptions.isInsecure()) {
                SSLContext sslContext = SSLContext.getInstance("TLS");
                sslContext.init(null, new TrustManager[]{new InsecureTrustManager()}, null);
                httpRequest.setSSLSocketFactory(sslContext.getSocketFactory());
                httpRequest.setHostnameVerifier((h, s) -> true);
            } else if (transportOptions.getCaCertPath() != null) {
                CertificateFactory cf = CertificateFactory.getInstance("X.509");
                java.security.cert.Certificate caCert;
                try (FileInputStream fis = new FileInputStream(transportOptions.getCaCertPath())) {
                    caCert = cf.generateCertificate(fis);
                }
                KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
                ks.load(null, null);
                ks.setCertificateEntry("custom-ca", caCert);
                TrustManagerFactory defaultTmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                defaultTmf.init((KeyStore) null);
                int certIndex = 0;
                for (TrustManager tm : defaultTmf.getTrustManagers()) {
                    if (tm instanceof X509TrustManager) {
                        for (X509Certificate cert : ((X509TrustManager) tm).getAcceptedIssuers()) {
                            ks.setCertificateEntry("default-" + certIndex++, cert);
                        }
                    }
                }
                TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                tmf.init(ks);
                SSLContext sslContext = SSLContext.getInstance("TLS");
                sslContext.init(null, tmf.getTrustManagers(), null);
                httpRequest.setSSLSocketFactory(sslContext.getSocketFactory());
            }

            // Apply default headers
            for (Map.Entry<String, String> entry : transportOptions.getDefaultHeaders().entrySet()) {
                httpRequest.setHeader(entry.getKey(), entry.getValue());
            }

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
        } catch (Exception e) {
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
            return Instant.now().isAfter(expiresAt.minus(5, ChronoUnit.MINUTES));
        }
    }

    @SuppressFBWarnings("WEAK_TRUST_MANAGER")
    private static final class InsecureTrustManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
            // trust all
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
            // trust all
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    protected abstract static class OAuthAuthenticatorBuilder<
        T extends OAuthAuthenticatorBuilder<?>> {

        protected final OpenId openId;
        protected TransportOptions transportOptions = TransportOptions.defaults();
        protected Scope authScopes = Scope.parse("openid urn:zitadel:iam:org:project:id:zitadel:aud");

        protected OAuthAuthenticatorBuilder(String host) {
            this.openId = new OpenId(host);
        }

        protected OAuthAuthenticatorBuilder(String host, TransportOptions transportOptions) {
            this.transportOptions = transportOptions != null ? transportOptions : TransportOptions.defaults();
            this.openId = new OpenId(host, this.transportOptions);
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
