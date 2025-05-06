package com.zitadel.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.utils.URLUtil;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class OpenId {

    private final URL hostEndpoint;
    private final URL tokenEndpoint;

    @SuppressFBWarnings({"URLCONNECTION_SSRF_FD", "CT_CONSTRUCTOR_THROW"})
    public OpenId(String hostname) {
        HttpURLConnection connection = null;
        try {
            this.hostEndpoint = URLUtil.buildHostname(hostname);
            connection = (HttpURLConnection) buildWellKnownUrl(hostname).openConnection();
            connection.setRequestMethod("GET");

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
