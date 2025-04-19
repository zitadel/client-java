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
  }

  public static Zitadel withAccessToken(String host, String accessToken) {
    return new Zitadel(new PersonalAccessTokenAuthenticator(host, accessToken));
  }

  public static Zitadel withClientCredentials(String host, String clientId, String clientSecret) {
    return new Zitadel(ClientCredentialsAuthenticator.builder(host, clientId, clientSecret).build());
  }

  public static Zitadel withPrivateKey(String host, String keyFile) {
    return new Zitadel(WebTokenAuthenticator.fromJson(host, keyFile));
  }
}
