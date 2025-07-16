package com.zitadel;

import com.zitadel.api.*;
import com.zitadel.auth.Authenticator;
import com.zitadel.auth.ClientCredentialsAuthenticator;
import com.zitadel.auth.PersonalAccessTokenAuthenticator;
import com.zitadel.auth.WebTokenAuthenticator;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.function.Consumer;
import java.util.function.Function;

@SuppressFBWarnings("URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD")
@SuppressWarnings("unused")
public class Zitadel {
    public final BetaProjectServiceApi betaProjects;
    public final BetaAppServiceApi betaApps;
    public final BetaOidcServiceApi betaOidc;
    public final BetaUserServiceApi betaUsers;
    public final BetaOrganizationServiceApi betaOrganizations;
    public final BetaSettingsServiceApi betaSettings;
    public final BetaInternalPermissionServiceApi betaPermissions;
    public final BetaAuthorizationServiceApi betaAuthorizations;
    public final BetaSessionServiceApi betaSessions;
    public final BetaInstanceServiceApi betaInstance;
    public final BetaTelemetryServiceApi betaTelemetry;
    public final BetaFeatureServiceApi betaFeatures;
    public final BetaWebKeyServiceApi betaWebkeys;
    public final BetaActionServiceApi betaActions;
    public final UserServiceApi users;
    public final SessionServiceApi sessions;
    public final OidcServiceApi oidc;
    public final FeatureServiceApi features;
    public final IdentityProviderServiceApi idps;
    public final OrganizationServiceApi organizations;
    public final SettingsServiceApi settings;
    public final SamlServiceApi saml;
    public final WebKeyServiceApi webkeys;

    public Zitadel(Authenticator authenticator) {
        this(
            authenticator,
            apiClient -> {
                // Dummy lambda that does nothing, can add default behavior here if needed
            });
    }

    public Zitadel(Authenticator authenticator, Consumer<IApiClient> mutateApiClient) {
        var apiClient = new DefaultApiClient(new Configuration(authenticator), Function.identity());

        if (mutateApiClient != null) {
            mutateApiClient.accept(apiClient);
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
}
