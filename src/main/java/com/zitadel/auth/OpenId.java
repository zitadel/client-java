package com.zitadel.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.TransportOptions;
import com.zitadel.utils.URLUtil;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;

public class OpenId {

    private final URL hostEndpoint;
    private final URL tokenEndpoint;

    public OpenId(String hostname) {
        this(hostname, TransportOptions.defaults());
    }

    @SuppressFBWarnings("URLCONNECTION_SSRF_FD")
    public OpenId(String hostname, TransportOptions transportOptions) {
        HttpURLConnection connection = null;
        try {
            this.hostEndpoint = URLUtil.buildHostname(hostname);
            URL wellKnownUrl = buildWellKnownUrl(hostname);
            if (transportOptions.getProxyUrl() != null) {
                URL proxyParsed = new URL(transportOptions.getProxyUrl());
                String proxyHost = proxyParsed.getHost();
                int proxyPort = proxyParsed.getPort() != -1 ? proxyParsed.getPort() : proxyParsed.getDefaultPort();
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
                connection = (HttpURLConnection) wellKnownUrl.openConnection(proxy);
            } else {
                connection = (HttpURLConnection) wellKnownUrl.openConnection();
            }
            connection.setRequestMethod("GET");

            if (connection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsConn = (HttpsURLConnection) connection;
                if (transportOptions.isInsecure()) {
                    SSLContext sslContext = SSLContext.getInstance("TLS");
                    sslContext.init(null, new TrustManager[]{new X509TrustManager() {
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
                    }}, null);
                    httpsConn.setSSLSocketFactory(sslContext.getSocketFactory());
                    httpsConn.setHostnameVerifier((h, s) -> true);
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
                            for (java.security.cert.X509Certificate cert : ((X509TrustManager) tm).getAcceptedIssuers()) {
                                ks.setCertificateEntry("default-" + certIndex++, cert);
                            }
                        }
                    }
                    TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    tmf.init(ks);
                    SSLContext sslContext = SSLContext.getInstance("TLS");
                    sslContext.init(null, tmf.getTrustManagers(), null);
                    httpsConn.setSSLSocketFactory(sslContext.getSocketFactory());
                }
            }

            for (Map.Entry<String, String> entry : transportOptions.getDefaultHeaders().entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }

            int status = connection.getResponseCode();
            if (status != HttpURLConnection.HTTP_OK) {
                throw new IOException("Failed to fetch OpenID configuration: HTTP " + status);
            }

            try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder responseBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    responseBuilder.append(line);
                }
                JsonNode root = new ObjectMapper().readTree(responseBuilder.toString());
                this.tokenEndpoint = new URL(root.path("token_endpoint").asText());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }


    @SuppressWarnings("HttpUrlsUsage")
    private static URL buildWellKnownUrl(String hostname) {
        try {
            if (!hostname.startsWith("http://") && !hostname.startsWith("https://")) {
                hostname = "https://" + hostname; // default to https
            }

            URL base = new URL(hostname);
            return new URL(base, "/.well-known/openid-configuration");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public URL getHostEndpoint() {
        return hostEndpoint;
    }

    public URL getTokenEndpoint() {
        return tokenEndpoint;
    }
}
