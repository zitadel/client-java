package com.zitadel;

import com.zitadel.api.*;
import com.zitadel.auth.Authenticator;
import com.zitadel.auth.ClientCredentialsAuthenticator;
import com.zitadel.auth.HttpAwareAuthenticator;
import com.zitadel.auth.PersonalAccessTokenAuthenticator;
import com.zitadel.auth.WebTokenAuthenticator;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.util.function.Consumer;

@SuppressWarnings({"unused", "DeprecatedIsStillUsed"})
public final class Zitadel {
  /**
   * The underlying, configured API client.
   *
   * @deprecated As of version 4.2.0, use {@link #getApiClient()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final ApiClient apiClient;

  /**
   * Service for managing Projects (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaProjects()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaProjectServiceApi betaProjects;

  /**
   * Service for managing Applications (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaApps()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final BetaAppServiceApi betaApps;

  /**
   * Service for OIDC operations (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaOidc()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final BetaOIDCServiceApi betaOidc;

  /**
   * Service for managing Users (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaUsers()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final BetaUserServiceApi betaUsers;

  /**
   * Service for managing Organizations (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaOrganizations()} for better testability.
   *     This field will be removed in a future major version.
   */
  @Deprecated public final BetaOrganizationServiceApi betaOrganizations;

  /**
   * Service for managing Settings (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaSettings()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaSettingsServiceApi betaSettings;

  /**
   * Service for managing internal Permissions (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaPermissions()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaInternalPermissionServiceApi betaPermissions;

  /**
   * Service for managing Authorizations (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaAuthorizations()} for better testability.
   *     This field will be removed in a future major version.
   */
  @Deprecated public final BetaAuthorizationServiceApi betaAuthorizations;

  /**
   * Service for managing Sessions (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaSessions()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaSessionServiceApi betaSessions;

  /**
   * Service for managing the Instance (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaInstance()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaInstanceServiceApi betaInstance;

  /**
   * Service for telemetry operations (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaTelemetry()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaTelemetryServiceApi betaTelemetry;

  /**
   * Service for managing Features (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaFeatures()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaFeatureServiceApi betaFeatures;

  /**
   * Service for managing WebKeys (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaWebkeys()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaWebKeyServiceApi betaWebkeys;

  /**
   * Service for managing Actions (beta).
   *
   * @deprecated As of version 4.2.0, use {@link #getBetaActions()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final BetaActionServiceApi betaActions;

  /**
   * Service for managing Actions.
   *
   * @deprecated As of version 4.2.0, use {@link #getActions()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final ActionServiceApi actions;

  /**
   * Service for managing Applications.
   *
   * @deprecated As of version 4.2.0, use {@link #getApplications()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final ApplicationServiceApi applications;

  /**
   * Service for managing Authorizations.
   *
   * @deprecated As of version 4.2.0, use {@link #getAuthorizations()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final AuthorizationServiceApi authorizations;

  /**
   * Service for managing Users.
   *
   * @deprecated As of version 4.2.0, use {@link #getUsers()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final UserServiceApi users;

  /**
   * Service for managing Sessions.
   *
   * @deprecated As of version 4.2.0, use {@link #getSessions()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final SessionServiceApi sessions;

  /**
   * Service for OIDC operations.
   *
   * @deprecated As of version 4.2.0, use {@link #getOidc()} for better testability. This field will
   *     be removed in a future major version.
   */
  @Deprecated public final OIDCServiceApi oidc;

  /**
   * Service for managing Features.
   *
   * @deprecated As of version 4.2.0, use {@link #getFeatures()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final FeatureServiceApi features;

  /**
   * Service for managing Identity Providers.
   *
   * @deprecated As of version 4.2.0, use {@link #getIdps()} for better testability. This field will
   *     be removed in a future major version.
   */
  @Deprecated public final IdentityProviderServiceApi idps;

  /**
   * Service for managing Instances.
   *
   * @deprecated As of version 4.2.0, use {@link #getInstances()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final InstanceServiceApi instances;

  /**
   * Service for managing internal Permissions.
   *
   * @deprecated As of version 4.2.0, use {@link #getInternalPermissions()} for better testability.
   *     This field will be removed in a future major version.
   */
  @Deprecated public final InternalPermissionServiceApi internalPermissions;

  /**
   * Service for managing Organizations.
   *
   * @deprecated As of version 4.2.0, use {@link #getOrganizations()} for better testability. This
   *     field will be removed in a future major version.
   */
  @Deprecated public final OrganizationServiceApi organizations;

  /**
   * Service for managing Projects.
   *
   * @deprecated As of version 4.2.0, use {@link #getProjects()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final ProjectServiceApi projects;

  /**
   * Service for managing Settings.
   *
   * @deprecated As of version 4.2.0, use {@link #getSettings()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final SettingsServiceApi settings;

  /**
   * Service for SAML operations.
   *
   * @deprecated As of version 4.2.0, use {@link #getSaml()} for better testability. This field will
   *     be removed in a future major version.
   */
  @Deprecated public final SAMLServiceApi saml;

  /**
   * Service for managing WebKeys.
   *
   * @deprecated As of version 4.2.0, use {@link #getWebkeys()} for better testability. This field
   *     will be removed in a future major version.
   */
  @Deprecated public final WebKeyServiceApi webkeys;

  public Zitadel(Authenticator authenticator) {
    this(authenticator, apiClient -> {});
  }

  /**
   * @param authenticator the authenticator to use for API requests.
   * @param transportOptions Optional transport options for TLS, proxy, and headers.
   */
  public Zitadel(Authenticator authenticator, TransportOptions transportOptions) {
    this(authenticator, transportOptions, apiClient -> {});
  }

  /**
   * @param authenticator the authenticator to use for API requests.
   * @param transportOptions Optional transport options for TLS, proxy, and headers.
   * @param mutateApiClient a consumer to customize the API client after creation.
   */
  public Zitadel(
      Authenticator authenticator,
      TransportOptions transportOptions,
      Consumer<ApiClient> mutateApiClient) {
    try {
      this.apiClient = new DefaultApiClient(transportOptions);
    } catch (ApiException e) {
      throw new ZitadelException("Failed to initialize the Zitadel API client", e);
    }

    if (authenticator instanceof HttpAwareAuthenticator httpAware) {
      httpAware.setApiClient(this.apiClient);
    }
    if (mutateApiClient != null) {
      mutateApiClient.accept(this.apiClient);
    }

    Configuration config = Configuration.builder().baseUrl(authenticator.getHost()).build();

    this.betaProjects = new BetaProjectServiceApi(apiClient, config, authenticator);
    this.betaApps = new BetaAppServiceApi(apiClient, config, authenticator);
    this.betaOidc = new BetaOIDCServiceApi(apiClient, config, authenticator);
    this.betaUsers = new BetaUserServiceApi(apiClient, config, authenticator);
    this.betaOrganizations = new BetaOrganizationServiceApi(apiClient, config, authenticator);
    this.betaSettings = new BetaSettingsServiceApi(apiClient, config, authenticator);
    this.betaPermissions = new BetaInternalPermissionServiceApi(apiClient, config, authenticator);
    this.betaAuthorizations = new BetaAuthorizationServiceApi(apiClient, config, authenticator);
    this.betaSessions = new BetaSessionServiceApi(apiClient, config, authenticator);
    this.betaInstance = new BetaInstanceServiceApi(apiClient, config, authenticator);
    this.betaTelemetry = new BetaTelemetryServiceApi(apiClient, config, authenticator);
    this.betaFeatures = new BetaFeatureServiceApi(apiClient, config, authenticator);
    this.betaWebkeys = new BetaWebKeyServiceApi(apiClient, config, authenticator);
    this.betaActions = new BetaActionServiceApi(apiClient, config, authenticator);
    this.actions = new ActionServiceApi(apiClient, config, authenticator);
    this.applications = new ApplicationServiceApi(apiClient, config, authenticator);
    this.authorizations = new AuthorizationServiceApi(apiClient, config, authenticator);
    this.users = new UserServiceApi(apiClient, config, authenticator);
    this.sessions = new SessionServiceApi(apiClient, config, authenticator);
    this.oidc = new OIDCServiceApi(apiClient, config, authenticator);
    this.features = new FeatureServiceApi(apiClient, config, authenticator);
    this.idps = new IdentityProviderServiceApi(apiClient, config, authenticator);
    this.instances = new InstanceServiceApi(apiClient, config, authenticator);
    this.internalPermissions = new InternalPermissionServiceApi(apiClient, config, authenticator);
    this.organizations = new OrganizationServiceApi(apiClient, config, authenticator);
    this.projects = new ProjectServiceApi(apiClient, config, authenticator);
    this.settings = new SettingsServiceApi(apiClient, config, authenticator);
    this.saml = new SAMLServiceApi(apiClient, config, authenticator);
    this.webkeys = new WebKeyServiceApi(apiClient, config, authenticator);
  }

  public Zitadel(Authenticator authenticator, Consumer<ApiClient> mutateApiClient) {
    this(authenticator, TransportOptions.builder().build(), mutateApiClient);
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
   * Initialize the SDK with a Personal Access Token (PAT).
   *
   * @param host API URL.
   * @param accessToken Personal Access Token for Bearer authentication.
   * @param transportOptions Optional transport options for TLS, proxy, and headers.
   * @return Configured Zitadel client instance.
   * @see <a
   *     href="https://zitadel.com/docs/guides/integrate/service-users/personal-access-token">PAT
   *     Guide</a>
   */
  public static Zitadel withAccessToken(
      String host, String accessToken, TransportOptions transportOptions) {
    return new Zitadel(new PersonalAccessTokenAuthenticator(host, accessToken), transportOptions);
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
   * Initialize the SDK using OAuth2 Client Credentials flow.
   *
   * @param host API URL.
   * @param clientId OAuth2 client identifier.
   * @param clientSecret OAuth2 client secret.
   * @param transportOptions Optional transport options for TLS, proxy, and headers.
   * @return Configured Zitadel client instance with token auto-refresh.
   * @see <a
   *     href="https://zitadel.com/docs/guides/integrate/service-users/client-credentials">Client
   *     Credentials Guide</a>
   */
  public static Zitadel withClientCredentials(
      String host, String clientId, String clientSecret, TransportOptions transportOptions) {
    return new Zitadel(
        ClientCredentialsAuthenticator.builder(host, clientId, clientSecret).build(),
        transportOptions);
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
  @SuppressFBWarnings({"PATH_TRAVERSAL_IN", "THROWS_METHOD_THROWS_RUNTIMEEXCEPTION"})
  public static Zitadel withPrivateKey(String host, String keyFile) {
    try (java.io.FileInputStream fis = new java.io.FileInputStream(keyFile)) {
      return withPrivateKey(host, fis);
    } catch (IOException e) {
      throw new RuntimeException(
          "Unable to read key file at " + keyFile + ": " + e.getMessage(), e);
    }
  }

  /**
   * Initialize the SDK via Private Key JWT assertion.
   *
   * @param host API URL.
   * @param inputStream Input stream containing service account JSON or PEM key data.
   * @return Configured Zitadel client instance using JWT assertion.
   * @see <a href="https://zitadel.com/docs/guides/integrate/service-users/private-key-jwt">Private
   *     Key JWT Guide</a>
   */
  public static Zitadel withPrivateKey(String host, java.io.InputStream inputStream) {
    return new Zitadel(WebTokenAuthenticator.fromJson(host, inputStream));
  }

  /**
   * Initialize the SDK via Private Key JWT assertion.
   *
   * @param host API URL.
   * @param keyFile Path to service account JSON or PEM key file.
   * @param transportOptions Optional transport options for TLS, proxy, and headers.
   * @return Configured Zitadel client instance using JWT assertion.
   * @see <a href="https://zitadel.com/docs/guides/integrate/service-users/private-key-jwt">Private
   *     Key JWT Guide</a>
   */
  @SuppressFBWarnings({"PATH_TRAVERSAL_IN", "THROWS_METHOD_THROWS_RUNTIMEEXCEPTION"})
  public static Zitadel withPrivateKey(
      String host, String keyFile, TransportOptions transportOptions) {
    try (java.io.FileInputStream fis = new java.io.FileInputStream(keyFile)) {
      return withPrivateKey(host, fis, transportOptions);
    } catch (IOException e) {
      throw new RuntimeException(
          "Unable to read key file at " + keyFile + ": " + e.getMessage(), e);
    }
  }

  /**
   * Initialize the SDK via Private Key JWT assertion.
   *
   * @param host API URL.
   * @param inputStream Input stream containing service account JSON or PEM key data.
   * @param transportOptions Optional transport options for TLS, proxy, and headers.
   * @return Configured Zitadel client instance using JWT assertion.
   * @see <a href="https://zitadel.com/docs/guides/integrate/service-users/private-key-jwt">Private
   *     Key JWT Guide</a>
   */
  public static Zitadel withPrivateKey(
      String host, java.io.InputStream inputStream, TransportOptions transportOptions) {
    return new Zitadel(WebTokenAuthenticator.fromJson(host, inputStream), transportOptions);
  }

  /**
   * Gets the underlying API client. Recommended over direct field access for testability.
   *
   * @return The configured {@link ApiClient}.
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Gets the service for managing Projects (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaProjectServiceApi}.
   */
  public BetaProjectServiceApi getBetaProjects() {
    return betaProjects;
  }

  /**
   * Gets the service for managing Applications (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaAppServiceApi}.
   */
  public BetaAppServiceApi getBetaApps() {
    return betaApps;
  }

  /**
   * Gets the service for OIDC operations (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaOIDCServiceApi}.
   */
  public BetaOIDCServiceApi getBetaOidc() {
    return betaOidc;
  }

  /**
   * Gets the service for managing Users (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaUserServiceApi}.
   */
  public BetaUserServiceApi getBetaUsers() {
    return betaUsers;
  }

  /**
   * Gets the service for managing Organizations (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaOrganizationServiceApi}.
   */
  public BetaOrganizationServiceApi getBetaOrganizations() {
    return betaOrganizations;
  }

  /**
   * Gets the service for managing Settings (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaSettingsServiceApi}.
   */
  public BetaSettingsServiceApi getBetaSettings() {
    return betaSettings;
  }

  /**
   * Gets the service for managing internal Permissions (beta). Recommended over direct field access
   * for testability.
   *
   * @return An instance of {@link BetaInternalPermissionServiceApi}.
   */
  public BetaInternalPermissionServiceApi getBetaPermissions() {
    return betaPermissions;
  }

  /**
   * Gets the service for managing Authorizations (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaAuthorizationServiceApi}.
   */
  public BetaAuthorizationServiceApi getBetaAuthorizations() {
    return betaAuthorizations;
  }

  /**
   * Gets the service for managing Sessions (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaSessionServiceApi}.
   */
  public BetaSessionServiceApi getBetaSessions() {
    return betaSessions;
  }

  /**
   * Gets the service for managing the Instance (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaInstanceServiceApi}.
   */
  public BetaInstanceServiceApi getBetaInstance() {
    return betaInstance;
  }

  /**
   * Gets the service for telemetry operations (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaTelemetryServiceApi}.
   */
  public BetaTelemetryServiceApi getBetaTelemetry() {
    return betaTelemetry;
  }

  /**
   * Gets the service for managing Features (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaFeatureServiceApi}.
   */
  public BetaFeatureServiceApi getBetaFeatures() {
    return betaFeatures;
  }

  /**
   * Gets the service for managing WebKeys (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaWebKeyServiceApi}.
   */
  public BetaWebKeyServiceApi getBetaWebkeys() {
    return betaWebkeys;
  }

  /**
   * Gets the service for managing Actions (beta). Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link BetaActionServiceApi}.
   */
  public BetaActionServiceApi getBetaActions() {
    return betaActions;
  }

  /**
   * Gets the service for managing Actions. Recommended over direct field access for testability.
   *
   * @return An instance of {@link BetaActionServiceApi}.
   */
  public ActionServiceApi getActions() {
    return actions;
  }

  /**
   * Gets the service for managing Applications. Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link ApplicationServiceApi}.
   */
  public ApplicationServiceApi getApplications() {
    return applications;
  }

  /**
   * Gets the service for managing Authorizations. Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link AuthorizationServiceApi}.
   */
  public AuthorizationServiceApi getAuthorizations() {
    return authorizations;
  }

  /**
   * Gets the service for managing Users. Recommended over direct field access for testability.
   *
   * @return An instance of {@link UserServiceApi}.
   */
  public UserServiceApi getUsers() {
    return users;
  }

  /**
   * Gets the service for managing Sessions. Recommended over direct field access for testability.
   *
   * @return An instance of {@link SessionServiceApi}.
   */
  public SessionServiceApi getSessions() {
    return sessions;
  }

  /**
   * Gets the service for OIDC operations. Recommended over direct field access for testability.
   *
   * @return An instance of {@link OIDCServiceApi}.
   */
  public OIDCServiceApi getOidc() {
    return oidc;
  }

  /**
   * Gets the service for managing Features. Recommended over direct field access for testability.
   *
   * @return An instance of {@link FeatureServiceApi}.
   */
  public FeatureServiceApi getFeatures() {
    return features;
  }

  /**
   * Gets the service for managing Identity Providers. Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link IdentityProviderServiceApi}.
   */
  public IdentityProviderServiceApi getIdps() {
    return idps;
  }

  /**
   * Gets the service for managing Instances. Recommended over direct field access for testability.
   *
   * @return An instance of {@link InstanceServiceApi}.
   */
  public InstanceServiceApi getInstances() {
    return instances;
  }

  /**
   * Gets the service for managing internal Permissions. Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link InternalPermissionServiceApi}.
   */
  public InternalPermissionServiceApi getInternalPermissions() {
    return internalPermissions;
  }

  /**
   * Gets the service for managing Organizations. Recommended over direct field access for
   * testability.
   *
   * @return An instance of {@link OrganizationServiceApi}.
   */
  public OrganizationServiceApi getOrganizations() {
    return organizations;
  }

  /**
   * Gets the service for managing Projects. Recommended over direct field access for testability.
   *
   * @return An instance of {@link ProjectServiceApi}.
   */
  public ProjectServiceApi getProjects() {
    return projects;
  }

  /**
   * Gets the service for managing Settings. Recommended over direct field access for testability.
   *
   * @return An instance of {@link SettingsServiceApi}.
   */
  public SettingsServiceApi getSettings() {
    return settings;
  }

  /**
   * Gets the service for SAML operations. Recommended over direct field access for testability.
   *
   * @return An instance of {@link SAMLServiceApi}.
   */
  public SAMLServiceApi getSaml() {
    return saml;
  }

  /**
   * Gets the service for managing WebKeys. Recommended over direct field access for testability.
   *
   * @return An instance of {@link WebKeyServiceApi}.
   */
  public WebKeyServiceApi getWebkeys() {
    return webkeys;
  }
}
