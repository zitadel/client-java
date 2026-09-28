package com.zitadel.auth;

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
   * @param host the base URL for the API endpoints.
   * @throws IllegalArgumentException if the host is not a valid http or https URL.
   */
  public NoAuthAuthenticator(String host) {
    this.host = new OpenId(host).getHostEndpoint();
  }

  /** Constructs a NoAuthAuthenticator for {@code http://localhost}. */
  public NoAuthAuthenticator() {
    this("http://localhost");
  }

  @Override
  public String getHost() {
    return host;
  }

  /**
   * Returns an empty map, since no authentication is performed.
   *
   * @return an empty map.
   */
  @Override
  public Map<String, String> getAuthHeaders() {
    return Collections.emptyMap();
  }
}
