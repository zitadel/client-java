package com.zitadel.auth;

import java.util.Collections;
import java.util.Map;

/**
 * Personal Access Token Authenticator.
 * <p>
 * Uses a static personal access token for API authentication.
 */
public class PersonalAccessAuthenticator extends Authenticator {

  /**
   * The personal access token.
   */
  private final String token;

  /**
   * Constructs a PersonalAccessAuthenticator.
   *
   * @param host  The base URL for the API endpoints.
   * @param token The personal access token.
   */
  public PersonalAccessAuthenticator(String host, String token) {
    super(host);
    this.token = token;
  }

  /**
   * Returns the authentication headers using the personal access token.
   *
   * @return A map containing the 'Authorization' header.
   */
  @Override
  public Map<String, String> getAuthHeaders() {
    return Collections.singletonMap("Authorization", "Bearer " + token);
  }
}
