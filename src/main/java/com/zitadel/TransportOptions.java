package com.zitadel;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Immutable transport options for configuring HTTP connections.
 *
 * <p>Provides settings for default headers, custom CA certificate paths, insecure
 * (trust-all) TLS connections, and proxy configuration. Use the {@link Builder} to construct instances.
 */
public class TransportOptions {

    private final Map<String, String> defaultHeaders;
    @Nullable
    private final String caCertPath;
    private final boolean insecure;
    @Nullable
    private final String proxyUrl;
    @Nullable
    private volatile SSLContext cachedSSLContext;
    private volatile boolean sslContextBuilt;

    private TransportOptions(Map<String, String> defaultHeaders, @Nullable String caCertPath, boolean insecure, @Nullable String proxyUrl) {
        this.defaultHeaders = Collections.unmodifiableMap(new LinkedHashMap<>(defaultHeaders));
        this.caCertPath = caCertPath;
        this.insecure = insecure;
        this.proxyUrl = proxyUrl;
    }

    /**
     * Returns a default {@code TransportOptions} instance with no custom headers,
     * no CA cert path, and insecure mode disabled.
     *
     * @return the default transport options.
     */
    public static TransportOptions defaults() {
        return new TransportOptions(Collections.emptyMap(), null, false, null);
    }

    /**
     * Returns the default headers to include in every request.
     *
     * @return an unmodifiable map of header names to values.
     */
    public Map<String, String> getDefaultHeaders() {
        return defaultHeaders;
    }

    /**
     * Returns the path to a custom CA certificate file used for TLS verification.
     *
     * @return the CA cert file path, or {@code null} if not set.
     */
    @Nullable
    public String getCaCertPath() {
        return caCertPath;
    }

    /**
     * Returns whether insecure (trust-all) TLS mode is enabled.
     *
     * @return {@code true} if insecure mode is enabled; {@code false} otherwise.
     */
    public boolean isInsecure() {
        return insecure;
    }

    /**
     * Returns the proxy URL used for HTTP connections.
     *
     * @return the proxy URL, or {@code null} if not set.
     */
    @Nullable
    public String getProxyUrl() {
        return proxyUrl;
    }

    /**
     * Builds an {@link SSLContext} from these transport options.
     *
     * <p>If insecure mode is enabled, returns a trust-all SSLContext.
     * If a custom CA cert path is set, returns an SSLContext that trusts
     * both the custom CA and the system default CAs.
     * Otherwise returns {@code null} (use JVM defaults).
     *
     * @return the configured SSLContext, or {@code null} if no custom SSL is needed.
     * @throws GeneralSecurityException if SSL context creation fails.
     * @throws IOException if the CA cert file cannot be read.
     */
    @Nullable
    @SuppressFBWarnings("PATH_TRAVERSAL_IN")
    public SSLContext buildSSLContext() throws GeneralSecurityException, IOException {
        if (sslContextBuilt) {
            return cachedSSLContext;
        }
        synchronized (this) {
            if (sslContextBuilt) {
                return cachedSSLContext;
            }
            cachedSSLContext = buildSSLContextInternal();
            sslContextBuilt = true;
            return cachedSSLContext;
        }
    }

    @Nullable
    @SuppressFBWarnings("PATH_TRAVERSAL_IN")
    private SSLContext buildSSLContextInternal() throws GeneralSecurityException, IOException {
        if (insecure) {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[]{new InsecureTrustManager()}, null);
            return sslContext;
        } else if (caCertPath != null) {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            java.security.cert.Certificate caCert;
            try (FileInputStream fis = new FileInputStream(caCertPath)) {
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
            return sslContext;
        }
        return null;
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

    /**
     * Builder for constructing {@link TransportOptions} instances.
     */
    public static class Builder {

        private final Map<String, String> defaultHeaders = new LinkedHashMap<>();
        @Nullable
        private String caCertPath;
        private boolean insecure;
        @Nullable
        private String proxyUrl;

        /**
         * Adds a default header to include in every request.
         *
         * @param key   the header name.
         * @param value the header value.
         * @return this builder.
         */
        public Builder defaultHeader(String key, String value) {
            if (key == null || key.isBlank()) {
                throw new IllegalArgumentException("Header name must not be null or blank");
            }
            if (value == null) {
                throw new IllegalArgumentException("Header value must not be null");
            }
            this.defaultHeaders.put(key, value);
            return this;
        }

        /**
         * Sets the path to a custom CA certificate file for TLS verification.
         *
         * @param path the CA cert file path.
         * @return this builder.
         */
        public Builder caCertPath(String path) {
            this.caCertPath = path;
            return this;
        }

        /**
         * Sets whether insecure (trust-all) TLS mode should be enabled.
         *
         * @param insecure {@code true} to trust all certificates; {@code false} otherwise.
         * @return this builder.
         */
        public Builder insecure(boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * Sets the proxy URL for HTTP connections.
         *
         * @param proxyUrl the proxy URL (e.g. {@code "http://proxy:8080"}).
         * @return this builder.
         */
        public Builder proxyUrl(String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * Builds the {@link TransportOptions} instance.
         *
         * @return a new immutable {@code TransportOptions}.
         */
        public TransportOptions build() {
            return new TransportOptions(defaultHeaders, caCertPath, insecure, proxyUrl);
        }
    }
}
