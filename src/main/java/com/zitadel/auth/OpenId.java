package com.zitadel.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.utils.URLUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class OpenId {

  private final URL hostEndpoint;
  private final URL tokenEndpoint;

  public OpenId(String hostname) {
    try {
      this.hostEndpoint = URLUtil.buildHostname(hostname);

      HttpURLConnection connection = (HttpURLConnection) buildWellKnownUrl(hostname).openConnection();
      connection.setRequestMethod("GET");

      int status = connection.getResponseCode();
      if (status != 200) {
        throw new IOException("Failed to fetch OpenID configuration: HTTP " + status);
      }

      BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
      StringBuilder responseBuilder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        responseBuilder.append(line);
      }
      reader.close();
      connection.disconnect();

      ObjectMapper mapper = new ObjectMapper();
      JsonNode root = mapper.readTree(responseBuilder.toString());

      this.tokenEndpoint = new URL(root.path("token_endpoint").asText());
    } catch (IOException e) {
      throw new RuntimeException(e);
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
