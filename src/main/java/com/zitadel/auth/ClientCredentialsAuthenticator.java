package com.zitadel.auth;

import com.nimbusds.oauth2.sdk.ClientCredentialsGrant;
import com.nimbusds.oauth2.sdk.Scope;
import com.nimbusds.oauth2.sdk.auth.ClientSecretBasic;
import com.nimbusds.oauth2.sdk.auth.Secret;
import com.nimbusds.oauth2.sdk.id.ClientID;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Set;


/**
 * OAuth2 Client Credentials Authenticator.
 * <p>
 * Implements the OAuth2 client credentials grant to obtain an access token.
 */
public class ClientCredentialsAuthenticator extends OAuthAuthenticator {

  private static final ClientCredentialsGrant GRANT = new ClientCredentialsGrant();

  /**
   * The OAuth2 client secret.
   */
  private final Secret clientSecret;
  private final ClientID clientId;

  /**
   * Constructs a ClientCredentialsAuthenticator.
   *
   * @param host         The base URL for the API endpoints.
   * @param clientId     The OAuth2 client identifier.clientSecret
   * @param clientSecret The OAuth2 client secret.
   * @param tokenUrlStr  The URL (or relative path starting with '/') of the OAuth2 token endpoint.
   * @param scopes       The scope for the token request.
   */
  private ClientCredentialsAuthenticator(String host, ClientID clientId, Secret clientSecret, String tokenUrlStr, Set<String> scopes) throws MalformedURLException, URISyntaxException {
    super(host, GRANT, tokenUrlStr, new Scope(scopes.toArray(new String[0])));
    this.clientSecret = clientSecret;
    this.clientId = clientId;
  }

  /**
   * Refreshes the access token using the client credentials grant.
   * <p>
   * This method uses the Nimbus OAuth2 SDK to send a token request.
   */
  @Override
  public void refreshToken() {
    this.token = super.getToken(new ClientSecretBasic(this.clientId, this.clientSecret));
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
    public Builder(String host, String clientId, String clientSecret) {
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
      return new ClientCredentialsAuthenticator(host, clientId, clientSecret, tokenEndpoint, authScopes);
    }
  }
}
