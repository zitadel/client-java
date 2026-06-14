package com.zitadel.auth;

import com.zitadel.utils.URLUtil;
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
    this.host = URLUtil.buildHostname(host).toString();
    this.token = token;
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
