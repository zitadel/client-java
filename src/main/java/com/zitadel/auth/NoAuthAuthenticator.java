package com.zitadel.auth;

import java.util.Collections;
import java.util.Map;

/**
 * Authenticator implementation for testing purposes.
 * <p>
 * This strategy applies no authentication and returns empty headers.
 */
public class NoAuthAuthenticator extends Authenticator {

  /**
   * Constructs a NoAuthAuthenticator.
   *
   * @param host The base URL for authentication endpoints.
   */
  public NoAuthAuthenticator(String host) {
    super(host);
  }

  /**
   * Returns an empty set of authentication headers.
   *
   * @return An empty map.
   */
  @Override
  public Map<String, String> getAuthHeaders() {
    return Collections.emptyMap();
  }
}
