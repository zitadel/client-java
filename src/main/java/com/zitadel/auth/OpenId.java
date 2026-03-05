package com.zitadel.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.TransportOptions;
import com.zitadel.utils.URLUtil;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.net.MalformedURLException;
import java.security.GeneralSecurityException;
import java.util.Map;

public class OpenId {

    private final URL hostEndpoint;
    private final URL tokenEndpoint;

    public OpenId(String hostname) {
        this(hostname, TransportOptions.defaults());
    }

    @SuppressFBWarnings("URLCONNECTION_SSRF_FD")
    public OpenId(String hostname, TransportOptions transportOptions) {
        TransportOptions opts = transportOptions != null ? transportOptions : TransportOptions.defaults();
        HttpURLConnection connection = null;
        try {
            this.hostEndpoint = URLUtil.buildHostname(hostname);
            URL wellKnownUrl = buildWellKnownUrl(hostname);
            if (opts.getProxyUrl() != null) {
                URL proxyParsed = new URL(opts.getProxyUrl());
                String proxyHost = proxyParsed.getHost();
                int proxyPort = proxyParsed.getPort() != -1 ? proxyParsed.getPort() : proxyParsed.getDefaultPort();
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
                connection = (HttpURLConnection) wellKnownUrl.openConnection(proxy);
                if (proxyParsed.getUserInfo() != null) {
                    String encoded = java.util.Base64.getEncoder()
                        .encodeToString(proxyParsed.getUserInfo().getBytes(StandardCharsets.UTF_8));
                    connection.setRequestProperty("Proxy-Authorization", "Basic " + encoded);
                }
            } else {
                connection = (HttpURLConnection) wellKnownUrl.openConnection();
            }
            connection.setRequestMethod("GET");

            if (connection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsConn = (HttpsURLConnection) connection;
                SSLContext sslContext = opts.buildSSLContext();
                if (sslContext != null) {
                    httpsConn.setSSLSocketFactory(sslContext.getSocketFactory());
                    if (opts.isInsecure()) {
                        httpsConn.setHostnameVerifier((h, s) -> true);
                    }
                }
            }

            for (Map.Entry<String, String> entry : opts.getDefaultHeaders().entrySet()) {
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
        } catch (IOException | GeneralSecurityException e) {
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
        } catch (MalformedURLException e) {
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
