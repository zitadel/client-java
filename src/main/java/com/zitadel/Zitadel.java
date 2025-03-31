package com.zitadel;

import java.util.function.Consumer;
import com.zitadel.api.FeatureServiceApi;
import com.zitadel.api.IdentityProviderServiceApi;
import com.zitadel.api.OidcServiceApi;
import com.zitadel.api.OrganizationServiceApi;
import com.zitadel.api.SessionServiceApi;
import com.zitadel.api.SettingsServiceApi;
import com.zitadel.api.UserServiceApi;

public class Zitadel {
	public final ApiClient apiClient;
	public final FeatureServiceApi features;
	public final IdentityProviderServiceApi idps;
	public final OidcServiceApi oidc;
	public final OrganizationServiceApi organizations;
	public final SessionServiceApi sessions;
	public final SettingsServiceApi settings;
	public final UserServiceApi users;

	public Zitadel(String host, String accessToken) {
		this(host, accessToken, apiClient -> {
			// Dummy lambda that does nothing, can add default behavior here if needed
		});
	}

	public Zitadel(String host, String accessToken, Consumer<ApiClient> mutateApiClient) {
		this.apiClient = new ApiClient();
		this.apiClient.setBasePath(host).setBearerToken(accessToken);

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
}
