package com.zitadel;

public class Configuration {

    private static volatile ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API instances without providing
     * an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API instances without providing
     * an API client.
     *
     * @param apiClient API client
     */
    @SuppressWarnings("unused")
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
