package com.zitadel.auth;

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
   * @throws IllegalArgumentException if the host is not a valid http or https URL or the token is
   *     empty.
   */
  public PersonalAccessTokenAuthenticator(String host, String token) {
    this.host = new OpenId(host).getHostEndpoint();
    this.token = OAuthAuthenticator.requireText(token, "Token");
  }

  @Override
  public String getHost() {
    return host;
  }

  /**
   * Returns the authentication headers using the personal access token.
   *
   * @return a map containing the {@code Authorization} header.
   */
  @Override
  public Map<String, String> getAuthHeaders() {
    return Collections.singletonMap("Authorization", "Bearer " + token);
  }

  /**
   * Returns a string representation of this authenticator with the token redacted.
   *
   * @return a string representation with the token redacted.
   */
  @Override
  public String toString() {
    return getClass().getSimpleName() + "(host=" + host + ", token=***)";
  }
}
