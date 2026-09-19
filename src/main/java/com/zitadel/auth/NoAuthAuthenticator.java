package com.zitadel.auth;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/**
 * Authenticator implementation for testing purposes.
 *
 * <p>This strategy applies no authentication and returns empty headers.
 */
public class NoAuthAuthenticator extends BaseAuthenticator {

  private final String host;

  /**
   * Constructs a NoAuthAuthenticator.
   *
   * @param host the base URL for authentication endpoints.
   */
  public NoAuthAuthenticator(String host) {
    this.host = buildHostname(host).toString();
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

  /** Constructs a NoAuthAuthenticator targeting {@code localhost}. */
  public NoAuthAuthenticator() {
    this("localhost");
  }

  @Override
  public String getHost() {
    return host;
  }

  @Override
  public Map<String, String> getAuthHeaders() {
    return Collections.emptyMap();
  }
}
