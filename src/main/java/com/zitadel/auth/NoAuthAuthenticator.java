package com.zitadel.auth;

import com.zitadel.utils.URLUtil;
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
    this.host = URLUtil.buildHostname(host).toString();
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
