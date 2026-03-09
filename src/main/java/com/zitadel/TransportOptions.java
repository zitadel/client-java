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
 * (trust-all) TLS connections, and proxy configuration.
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

    /**
     * @param defaultHeaders Default headers sent to the origin server with every request.
     * @param caCertPath     path to a custom CA certificate file for TLS verification, or {@code null}.
     * @param insecure       whether to disable TLS certificate verification.
     * @param proxyUrl       proxy URL for HTTP connections, or {@code null}.
     */
    public TransportOptions(Map<String, String> defaultHeaders, @Nullable String caCertPath, boolean insecure, @Nullable String proxyUrl) {
        this.defaultHeaders = Collections.unmodifiableMap(new LinkedHashMap<>(defaultHeaders));
        this.caCertPath = caCertPath;
        this.insecure = insecure;
        this.proxyUrl = proxyUrl;
    }

    /**
     * Returns a {@code TransportOptions} instance with all default values.
     *
     * @return the default transport options.
     */
    public static TransportOptions defaults() {
        return new TransportOptions(Collections.emptyMap(), null, false, null);
    }

    /**
     * Returns the default headers sent to the origin server with every request.
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
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

}
