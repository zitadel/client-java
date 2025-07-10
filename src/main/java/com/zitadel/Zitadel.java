package com.zitadel;

import com.zitadel.api.*;
import com.zitadel.auth.Authenticator;
import com.zitadel.auth.ClientCredentialsAuthenticator;
import com.zitadel.auth.PersonalAccessTokenAuthenticator;
import com.zitadel.auth.WebTokenAuthenticator;

import java.util.function.Consumer;

@SuppressWarnings({"unused", "DeprecatedIsStillUsed"})
public class Zitadel {
    /**
     * The underlying, configured API client.
     *
     * @deprecated As of version 4.2.0, use {@link #getApiClient()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final ApiClient apiClient;
    /**
     * Service for managing Projects (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaProjects()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaProjectServiceApi betaProjects;
    /**
     * Service for managing Applications (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaApps()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaAppServiceApi betaApps;
    /**
     * Service for OIDC operations (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaOidc()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaOidcServiceApi betaOidc;
    /**
     * Service for managing Users (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaUsers()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaUserServiceApi betaUsers;
    /**
     * Service for managing Organizations (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaOrganizations()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaOrganizationServiceApi betaOrganizations;
    /**
     * Service for managing Settings (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaSettings()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaSettingsServiceApi betaSettings;
    /**
     * Service for managing internal Permissions (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaPermissions()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaInternalPermissionServiceApi betaPermissions;
    /**
     * Service for managing Authorizations (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaAuthorizations()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaAuthorizationServiceApi betaAuthorizations;
    /**
     * Service for managing Sessions (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaSessions()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaSessionServiceApi betaSessions;
    /**
     * Service for managing the Instance (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaInstance()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaInstanceServiceApi betaInstance;
    /**
     * Service for telemetry operations (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaTelemetry()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaTelemetryServiceApi betaTelemetry;
    /**
     * Service for managing Features (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaFeatures()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaFeatureServiceApi betaFeatures;
    /**
     * Service for managing WebKeys (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaWebkeys()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaWebKeyServiceApi betaWebkeys;
    /**
     * Service for managing Actions (beta).
     *
     * @deprecated As of version 4.2.0, use {@link #getBetaActions()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final BetaActionServiceApi betaActions;
    /**
     * Service for managing Users.
     *
     * @deprecated As of version 4.2.0, use {@link #getUsers()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final UserServiceApi users;
    /**
     * Service for managing Sessions.
     *
     * @deprecated As of version 4.2.0, use {@link #getSessions()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final SessionServiceApi sessions;
    /**
     * Service for OIDC operations.
     *
     * @deprecated As of version 4.2.0, use {@link #getOidc()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final OidcServiceApi oidc;
    /**
     * Service for managing Features.
     *
     * @deprecated As of version 4.2.0, use {@link #getFeatures()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final FeatureServiceApi features;
    /**
     * Service for managing Identity Providers.
     *
     * @deprecated As of version 4.2.0, use {@link #getIdps()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final IdentityProviderServiceApi idps;
    /**
     * Service for managing Organizations.
     *
     * @deprecated As of version 4.2.0, use {@link #getOrganizations()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final OrganizationServiceApi organizations;
    /**
     * Service for managing Settings.
     *
     * @deprecated As of version 4.2.0, use {@link #getSettings()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final SettingsServiceApi settings;
    /**
     * Service for SAML operations.
     *
     * @deprecated As of version 4.2.0, use {@link #getSaml()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final SamlServiceApi saml;
    /**
     * Service for managing WebKeys.
     *
     * @deprecated As of version 4.2.0, use {@link #getWebkeys()} for better testability. This field will be removed in a future major version.
     */
    @Deprecated
    public final WebKeyServiceApi webkeys;

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

        this.betaProjects = new BetaProjectServiceApi(apiClient);
        this.betaApps = new BetaAppServiceApi(apiClient);
        this.betaOidc = new BetaOidcServiceApi(apiClient);
        this.betaUsers = new BetaUserServiceApi(apiClient);
        this.betaOrganizations = new BetaOrganizationServiceApi(apiClient);
        this.betaSettings = new BetaSettingsServiceApi(apiClient);
        this.betaPermissions = new BetaInternalPermissionServiceApi(apiClient);
        this.betaAuthorizations = new BetaAuthorizationServiceApi(apiClient);
        this.betaSessions = new BetaSessionServiceApi(apiClient);
        this.betaInstance = new BetaInstanceServiceApi(apiClient);
        this.betaTelemetry = new BetaTelemetryServiceApi(apiClient);
        this.betaFeatures = new BetaFeatureServiceApi(apiClient);
        this.betaWebkeys = new BetaWebKeyServiceApi(apiClient);
        this.betaActions = new BetaActionServiceApi(apiClient);
        this.users = new UserServiceApi(apiClient);
        this.sessions = new SessionServiceApi(apiClient);
        this.oidc = new OidcServiceApi(apiClient);
        this.features = new FeatureServiceApi(apiClient);
        this.idps = new IdentityProviderServiceApi(apiClient);
        this.organizations = new OrganizationServiceApi(apiClient);
        this.settings = new SettingsServiceApi(apiClient);
        this.saml = new SamlServiceApi(apiClient);
        this.webkeys = new WebKeyServiceApi(apiClient);
    }

    /**
     * Initialize the SDK with a Personal Access Token (PAT).
     *
     * @param host        API URL (e.g. "<a href="https://api.zitadel.example.com">...</a>").
     * @param accessToken Personal Access Token for Bearer authentication.
     * @return Configured Zitadel client instance.
     * @see <a
     * href="https://zitadel.com/docs/guides/integrate/service-users/personal-access-token">PAT
     * Guide</a>
     */
    public static Zitadel withAccessToken(String host, String accessToken) {
        return new Zitadel(new PersonalAccessTokenAuthenticator(host, accessToken));
    }

    /**
     * Initialize the SDK using OAuth2 Client Credentials flow.
     *
     * @param host         API URL.
     * @param clientId     OAuth2 client identifier.
     * @param clientSecret OAuth2 client secret.
     * @return Configured Zitadel client instance with token auto-refresh.
     * @see <a
     * href="https://zitadel.com/docs/guides/integrate/service-users/client-credentials">Client
     * Credentials Guide</a>
     */
    public static Zitadel withClientCredentials(String host, String clientId, String clientSecret) {
        return new Zitadel(
            ClientCredentialsAuthenticator.builder(host, clientId, clientSecret).build());
    }

    /**
     * Initialize the SDK via Private Key JWT assertion.
     *
     * @param host    API URL.
     * @param keyFile Path to service account JSON or PEM key file.
     * @return Configured Zitadel client instance using JWT assertion.
     * @see <a href="https://zitadel.com/docs/guides/integrate/service-users/private-key-jwt">Private
     * Key JWT Guide</a>
     */
    public static Zitadel withPrivateKey(String host, String keyFile) {
        return new Zitadel(WebTokenAuthenticator.fromJson(host, keyFile));
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
     * Gets the service for managing Projects (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaProjectServiceApi}.
     */
    public BetaProjectServiceApi getBetaProjects() {
        return betaProjects;
    }

    /**
     * Gets the service for managing Applications (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaAppServiceApi}.
     */
    public BetaAppServiceApi getBetaApps() {
        return betaApps;
    }

    /**
     * Gets the service for OIDC operations (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaOidcServiceApi}.
     */
    public BetaOidcServiceApi getBetaOidc() {
        return betaOidc;
    }

    /**
     * Gets the service for managing Users (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaUserServiceApi}.
     */
    public BetaUserServiceApi getBetaUsers() {
        return betaUsers;
    }

    /**
     * Gets the service for managing Organizations (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaOrganizationServiceApi}.
     */
    public BetaOrganizationServiceApi getBetaOrganizations() {
        return betaOrganizations;
    }

    /**
     * Gets the service for managing Settings (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaSettingsServiceApi}.
     */
    public BetaSettingsServiceApi getBetaSettings() {
        return betaSettings;
    }

    /**
     * Gets the service for managing internal Permissions (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaInternalPermissionServiceApi}.
     */
    public BetaInternalPermissionServiceApi getBetaPermissions() {
        return betaPermissions;
    }

    /**
     * Gets the service for managing Authorizations (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaAuthorizationServiceApi}.
     */
    public BetaAuthorizationServiceApi getBetaAuthorizations() {
        return betaAuthorizations;
    }

    /**
     * Gets the service for managing Sessions (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaSessionServiceApi}.
     */
    public BetaSessionServiceApi getBetaSessions() {
        return betaSessions;
    }

    /**
     * Gets the service for managing the Instance (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaInstanceServiceApi}.
     */
    public BetaInstanceServiceApi getBetaInstance() {
        return betaInstance;
    }

    /**
     * Gets the service for telemetry operations (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaTelemetryServiceApi}.
     */
    public BetaTelemetryServiceApi getBetaTelemetry() {
        return betaTelemetry;
    }

    /**
     * Gets the service for managing Features (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaFeatureServiceApi}.
     */
    public BetaFeatureServiceApi getBetaFeatures() {
        return betaFeatures;
    }

    /**
     * Gets the service for managing WebKeys (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaWebKeyServiceApi}.
     */
    public BetaWebKeyServiceApi getBetaWebkeys() {
        return betaWebkeys;
    }

    /**
     * Gets the service for managing Actions (beta). Recommended over direct field access for testability.
     *
     * @return An instance of {@link BetaActionServiceApi}.
     */
    public BetaActionServiceApi getBetaActions() {
        return betaActions;
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
     * @return An instance of {@link OidcServiceApi}.
     */
    public OidcServiceApi getOidc() {
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
     * Gets the service for managing Identity Providers. Recommended over direct field access for testability.
     *
     * @return An instance of {@link IdentityProviderServiceApi}.
     */
    public IdentityProviderServiceApi getIdps() {
        return idps;
    }

    /**
     * Gets the service for managing Organizations. Recommended over direct field access for testability.
     *
     * @return An instance of {@link OrganizationServiceApi}.
     */
    public OrganizationServiceApi getOrganizations() {
        return organizations;
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
     * @return An instance of {@link SamlServiceApi}.
     */
    public SamlServiceApi getSaml() {
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
