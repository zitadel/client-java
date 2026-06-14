package com.zitadel.auth;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * OAuth2 Client Credentials Authenticator.
 *
 * <p>Implements the OAuth2 client credentials grant (RFC 6749 §4.4) to obtain an access token.
 * Client credentials are transmitted in the request body (the {@code client_secret_post} method) on
 * the token request, matching the other Zitadel SDKs.
 */
public class ClientCredentialsAuthenticator extends OAuthAuthenticator {

  private static final String GRANT_TYPE = "client_credentials";

  private final String clientId;
  private final String clientSecret;

  /**
   * Constructs a ClientCredentialsAuthenticator.
   *
   * @param openId the OpenID discovery helper for the target host.
   * @param clientId the OAuth2 client identifier.
   * @param clientSecret the OAuth2 client secret.
   * @param scope the space-delimited scope string for the token request.
   */
  ClientCredentialsAuthenticator(
      OpenId openId, String clientId, String clientSecret, String scope) {
    super(openId, scope);
    this.clientId = clientId;
    this.clientSecret = clientSecret;
  }

  /**
   * Returns a new builder instance for ClientCredentialsAuthenticator.
   *
   * @param host the base URL for API endpoints.
   * @param clientId the OAuth2 client identifier.
   * @param clientSecret the OAuth2 client secret.
   * @return a new {@link Builder} instance.
   */
  public static Builder builder(String host, String clientId, String clientSecret) {
    return new Builder(host, clientId, clientSecret);
  }

  @Override
  protected String getGrantType() {
    return GRANT_TYPE;
  }

  @Override
  protected Map<String, String> getTokenRequestParams() {
    Map<String, String> params = new LinkedHashMap<>();
    params.put("client_id", clientId);
    params.put("client_secret", clientSecret);
    return params;
  }

  /** Builder for {@link ClientCredentialsAuthenticator}. */
  public static class Builder extends OAuthAuthenticatorBuilder<Builder> {

    private final String clientId;
    private final String clientSecret;

    /**
     * @param host the base URL for the API endpoints.
     * @param clientId the OAuth2 client identifier.
     * @param clientSecret the OAuth2 client secret.
     */
    Builder(String host, String clientId, String clientSecret) {
      super(host);
      this.clientId = clientId;
      this.clientSecret = clientSecret;
    }

    /**
     * Builds the ClientCredentialsAuthenticator.
     *
     * @return a new {@link ClientCredentialsAuthenticator} instance.
     */
    public ClientCredentialsAuthenticator build() {
      return new ClientCredentialsAuthenticator(openId, clientId, clientSecret, scope);
    }
  }
}
