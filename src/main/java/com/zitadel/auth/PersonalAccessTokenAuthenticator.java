package com.zitadel.auth;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/**
 * Personal Access Token Authenticator.
 *
 * <p>Uses a static personal access token for API authentication.
 */
public class PersonalAccessTokenAuthenticator extends BaseAuthenticator {

  private final String host;
  private final String token;

  /**
   * Constructs a PersonalAccessTokenAuthenticator.
   *
   * @param host the base URL for the API endpoints.
   * @param token the personal access token.
   */
  public PersonalAccessTokenAuthenticator(String host, String token) {
    this.host = buildHostname(host).toString();
    this.token = token;
  }

  @SuppressWarnings("HttpUrlsUsage")
  private static URL buildHostname(String hostname) {
    try {
      if (!hostname.startsWith("http://") && !hostname.startsWith("https://")) {
        hostname = "https://" + hostname; // default to https
      }

      return new URI(hostname).toURL();
    } catch (URISyntaxException | MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String getHost() {
    return host;
  }

  @Override
  public Map<String, String> getAuthHeaders() {
    return Collections.singletonMap("Authorization", "Bearer " + token);
  }
}
