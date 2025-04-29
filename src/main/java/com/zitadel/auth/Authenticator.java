package com.zitadel.auth;

import java.net.URL;
import java.util.Map;

/**
 * Base abstract class for all authentication strategies.
 *
 * <p>This abstract class defines a standard interface for retrieving authentication headers
 * required for API requests.
 */
public abstract class Authenticator {

  protected final URL hostEndpoint;

  /**
   * Constructs an Authenticator with the specified host.
   *
   * @param hostEndpoint The base URL for all authentication endpoints.
   */
  public Authenticator(URL hostEndpoint) {
    this.hostEndpoint = hostEndpoint;
  }

  /**
   * Retrieves the authentication headers needed for API requests.
   *
   * @return A map of header keys and values.
   */
  public abstract Map<String, String> getAuthHeaders();

  /**
   * Returns the base host URL.
   *
   * @return The host URL.
   */
  public String getHost() {
    return hostEndpoint.toString();
  }
}
