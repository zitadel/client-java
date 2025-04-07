package com.zitadel.auth;

import com.nimbusds.oauth2.sdk.AuthorizationGrant;
import com.nimbusds.oauth2.sdk.ClientCredentialsGrant;
import com.nimbusds.oauth2.sdk.Scope;
import com.nimbusds.oauth2.sdk.auth.ClientSecretBasic;
import com.nimbusds.oauth2.sdk.auth.Secret;
import com.nimbusds.oauth2.sdk.id.ClientID;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

/**
 * OAuth2 Client Credentials Authenticator.
 * <p>
 * Implements the OAuth2 client credentials grant to obtain an access token.
 */
public class ClientCredentialsAuthenticator extends OAuthAuthenticator {

  /**
   * The OAuth2 client secret.
   */
  private final Secret clientSecret;
  private final ClientID clientId;

  /**
   * Constructs a ClientCredentialsAuthenticator.
   *
   * @param openId       The base URL for the API endpoints.
   * @param clientId     The OAuth2 client identifier.clientSecret
   * @param clientSecret The OAuth2 client secret.
   * @param authScopes   The scope for the token request.
   */
  ClientCredentialsAuthenticator(OpenId openId, ClientID clientId, Secret clientSecret, Scope authScopes) throws MalformedURLException, URISyntaxException {
    super(openId, authScopes);
    this.clientSecret = clientSecret;
    this.clientId = clientId;
  }

  /**
   * Returns a new builder instance for ClientCredentialsAuthenticator.
   *
   * @param host         The base URL for API endpoints.
   * @param clientId     The OAuth2 client identifier.
   * @param clientSecret The OAuth2 client secret.
   * @return a new ClientCredentialsAuthenticatorBuilder instance.
   */
  public static Builder builder(String host, String clientId, String clientSecret) {
    return new Builder(host, clientId, clientSecret);
  }

  /**
   * Refreshes the access token using the client credentials grant.
   * <p>
   * This method uses the Nimbus OAuth2 SDK to send a token request.
   */
  @Override
  public Token refreshToken() {
    this.token = super.getToken(new ClientSecretBasic(this.clientId, this.clientSecret));
    return this.token;
  }

  @Override
  public AuthorizationGrant getGrant() {
    return new ClientCredentialsGrant();
  }

  /**
   * Builder for ClientCredentialsAuthenticator.
   */
  public static class Builder extends OAuthAuthenticatorBuilder<Builder> {

    private final ClientID clientId;
    private final Secret clientSecret;

    /**
     * Builder constructor with required parameters.
     *
     * @param host         The base URL for the API endpoints.
     * @param clientId     The OAuth2 client identifier.
     * @param clientSecret The OAuth2 client secret.
     */
    Builder(String host, String clientId, String clientSecret) {
      super(host);
      this.clientId = new ClientID(clientId);
      this.clientSecret = new Secret(clientSecret);
    }

    /**
     * Builds the ClientCredentialsAuthenticator.
     *
     * @return a new ClientCredentialsAuthenticator instance.
     * @throws MalformedURLException if the token URL is malformed.
     * @throws URISyntaxException    if the token URL is not a valid URI.
     */
    public ClientCredentialsAuthenticator build() throws MalformedURLException, URISyntaxException {
      return new ClientCredentialsAuthenticator(openId, clientId, clientSecret, authScopes);
    }
  }
}
