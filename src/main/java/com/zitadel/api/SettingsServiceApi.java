package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zitadel.ApiException;
import com.zitadel.IApiClient;
import com.zitadel.model.SettingsServiceGetGeneralSettingsResponse;

public class SettingsServiceApi {

    private final IApiClient apiClient;

    public SettingsServiceApi(IApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * GetGeneralSettings (Convenience Method)
     * Get basic information over the instance
     *
     * @return SettingsServiceGetGeneralSettingsResponse
     * @throws ApiException if fails to make API call
     */
    public SettingsServiceGetGeneralSettingsResponse getGeneralSettings() throws ApiException {
        return this.getGeneralSettings(new Object());
    }


    /**
     * GetGeneralSettings
     * Get basic information over the instance
     *
     * @param body (required)
     * @return SettingsServiceGetGeneralSettingsResponse
     * @throws ApiException if fails to make API call
     */
    public SettingsServiceGetGeneralSettingsResponse getGeneralSettings(Object body) throws ApiException {
        if (body == null) {
            throw new IllegalArgumentException("Missing the required parameter 'body' when calling getGeneralSettings");
        }

        TypeReference<SettingsServiceGetGeneralSettingsResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "getGeneralSettings",
            "/zitadel.settings.v2.SettingsService/GetGeneralSettings",
            "POST",
            null,
            null,
            null,
            body,
            successType,
            null
        );
    }
}
