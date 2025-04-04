package com.zitadel.auth;

import java.util.Map;

/**
 * Base abstract class for all authentication strategies.
 * <p>
 * This abstract class defines a standard interface for retrieving authentication
 * headers required for API requests.
 */
public abstract class Authenticator {

  /**
   * The base URL for authentication endpoints.
   */
  protected final String host;

  /**
   * Constructs an Authenticator with the specified host.
   *
   * @param host The base URL for all authentication endpoints.
   */
  public Authenticator(String host) {
    this.host = host;
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
    return host;
  }
}
