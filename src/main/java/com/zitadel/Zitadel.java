package com.zitadel;

import com.zitadel.api.*;
import com.zitadel.auth.Authenticator;
import com.zitadel.auth.ClientCredentialsAuthenticator;
import com.zitadel.auth.PersonalAccessTokenAuthenticator;
import com.zitadel.auth.WebTokenAuthenticator;
import java.util.function.Consumer;

public class Zitadel {
  public final ApiClient apiClient;
  public final FeatureServiceApi features;
  public final IdentityProviderServiceApi idps;
  public final OidcServiceApi oidc;
  public final OrganizationServiceApi organizations;
  public final SessionServiceApi sessions;
  public final SettingsServiceApi settings;
  public final SamlServiceApi saml;

  @SuppressWarnings("unused")
  public final UserServiceApi users;

  public Zitadel(Authenticator authenticator) {
    this(
        authenticator,
        apiClient -> {
          // Dummy lambda that does nothing, can add default behavior here if needed
        });
  }

  public Zitadel(Authenticator authenticator, Consumer<ApiClient> mutateApiClient) {
    this.apiClient = new ApiClient(authenticator);

    if (mutateApiClient != null) {
      mutateApiClient.accept(this.apiClient);
    }

    this.features = new FeatureServiceApi(apiClient);
    this.idps = new IdentityProviderServiceApi(apiClient);
    this.oidc = new OidcServiceApi(apiClient);
    this.organizations = new OrganizationServiceApi(apiClient);
    this.sessions = new SessionServiceApi(apiClient);
    this.settings = new SettingsServiceApi(apiClient);
    this.users = new UserServiceApi(apiClient);
    this.saml = new SamlServiceApi(apiClient);
  }

  /**
   * Initialize the SDK with a Personal Access Token (PAT).
   *
   * @param host API URL (e.g. "<a href="https://api.zitadel.example.com">...</a>").
   * @param accessToken Personal Access Token for Bearer authentication.
   * @return Configured Zitadel client instance.
   * @see <a
   *     href="https://zitadel.com/docs/guides/integrate/service-users/personal-access-token">PAT
   *     Guide</a>
   */
  public static Zitadel withAccessToken(String host, String accessToken) {
    return new Zitadel(new PersonalAccessTokenAuthenticator(host, accessToken));
  }

  /**
   * Initialize the SDK using OAuth2 Client Credentials flow.
   *
   * @param host API URL.
   * @param clientId OAuth2 client identifier.
   * @param clientSecret OAuth2 client secret.
   * @return Configured Zitadel client instance with token auto-refresh.
   * @see <a
   *     href="https://zitadel.com/docs/guides/integrate/service-users/client-credentials">Client
   *     Credentials Guide</a>
   */
  public static Zitadel withClientCredentials(String host, String clientId, String clientSecret) {
    return new Zitadel(
        ClientCredentialsAuthenticator.builder(host, clientId, clientSecret).build());
  }

  /**
   * Initialize the SDK via Private Key JWT assertion.
   *
   * @param host API URL.
   * @param keyFile Path to service account JSON or PEM key file.
   * @return Configured Zitadel client instance using JWT assertion.
   * @see <a href="https://zitadel.com/docs/guides/integrate/service-users/private-key-jwt">Private
   *     Key JWT Guide</a>
   */
  public static Zitadel withPrivateKey(String host, String keyFile) {
    return new Zitadel(WebTokenAuthenticator.fromJson(host, keyFile));
  }
}
