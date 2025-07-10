package com.zitadel;

import java.time.Duration;

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

    /**
     * Gets the authentication access token (Bearer Token).
     *
     * @return String The authentication access token.
     */
    public String getAccessToken() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Gets the API host URL (e.g., "<a href="https://api.zitadel.ch">...</a>").
     *
     * @return String The API host URL.
     */
    public String getHost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Gets the User-Agent string for the client.
     *
     * @return String The User-Agent string.
     */
    public String getUserAgent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Gets the total request timeout.
     *
     * @return Duration The total request timeout.
     */
    public Duration getTimeout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Gets the connection timeout.
     *
     * @return Duration The time to wait for a connection to be established.
     */
    public Duration getConnectTimeout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
