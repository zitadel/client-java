package com.zitadel.auth;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.AbstractIntegrationTest;
import com.zitadel.ApiException;
import com.zitadel.Zitadel;
import com.zitadel.ZitadelException;
import com.zitadel.model.SettingsServiceGetGeneralSettingsResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * SettingsService Integration Tests using Client Credentials
 * <p>
 * Verifies the general settings endpoint with:
 * 1. Valid client credentials
 * 2. Invalid client credentials
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SuppressWarnings("NewClassNamingConvention")
class UseClientCredentialsSpec extends AbstractIntegrationTest {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final HttpClient httpClient = HttpClient.newHttpClient();

    public Map<String, String> generateUserSecret(String token, String loginName) throws Exception {

        HttpRequest userIdRequest = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:18103/management/v1/global/users/_by_login_name?loginName=" + URLEncoder.encode(loginName, StandardCharsets.UTF_8)))
            .header("Authorization", "Bearer " + token)
            .header("Accept", "application/json")
            .build();

        HttpResponse<String> userIdResponse = httpClient.send(userIdRequest, HttpResponse.BodyHandlers.ofString());

        if (userIdResponse != null && userIdResponse.statusCode() < 300) {
            Map<String, Object> userResponseMap = objectMapper.readValue(userIdResponse.body(), new TypeReference<>() {
            });

            @SuppressWarnings("unchecked")
            Map<String, String> userMap = (Map<String, String>) userResponseMap.get("user");
            String userId = (userMap != null) ? userMap.get("id") : null;

            if (userId != null && !userId.isEmpty()) {
                HttpRequest secretRequest = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:18103/management/v1/users/" + userId + "/secret"))
                    .header("Authorization", "Bearer " + token)
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .PUT(HttpRequest.BodyPublishers.ofString("{}"))
                    .build();

                HttpResponse<String> secretResponse = httpClient.send(secretRequest, HttpResponse.BodyHandlers.ofString());

                if (secretResponse != null && secretResponse.statusCode() < 300) {
                    Map<String, Object> secretData = objectMapper.readValue(secretResponse.body(), new TypeReference<>() {
                    });
                    String clientId = (String) secretData.get("clientId");
                    String clientSecret = (String) secretData.get("clientSecret");

                    if (clientId != null && !clientId.isEmpty() && clientSecret != null && !clientSecret.isEmpty()) {
                        return Map.of("clientId", clientId, "clientSecret", clientSecret);
                    } else {
                        System.out.println(secretResponse.body());
                        throw new Exception("API response for secret is missing 'clientId' or 'clientSecret'.");
                    }
                } else {
                    throw new Exception("API call to generate secret failed for user ID: '" + userId + "'. Response: " + (secretResponse != null ? secretResponse.body() : "null"));
                }
            } else {
                System.out.println(userIdResponse.body());
                throw new Exception("Could not parse a valid user ID from API response for login name: '" + loginName + "'.");
            }
        } else {
            throw new Exception("API call to retrieve user failed for login name: '" + loginName + "'. Response: " + (userIdResponse != null ? userIdResponse.body() : "null"));
        }
    }

    /**
     * Retrieves general settings successfully with valid client credentials.
     *
     * @throws ApiException on API error
     */
    @Test
    void testRetrievesGeneralSettingsWithValidAuth() throws Exception {
        Map<String, String> credentials = generateUserSecret(getAuthToken(), "api-user");
        Zitadel client = Zitadel.withAuthenticator(ClientCredentialsAuthenticator.builder(getBaseUrl(), credentials.getOrDefault("clientId", ""), credentials.getOrDefault("clientSecret", "")).build());

        SettingsServiceGetGeneralSettingsResponse response =
            client.settingsService.getGeneralSettings(new Object());
        assertNotNull(response);
    }

    /**
     * Raises ApiException when using invalid client credentials.
     */
    @Test
    void testRaisesApiExceptionWithInvalidAuth() {
        Zitadel invalid = Zitadel.withAuthenticator(ClientCredentialsAuthenticator.builder(getBaseUrl(), "invalid", "invalid").build());

        assertThrows(ZitadelException.class, () -> invalid.settingsService.getGeneralSettings(new Object())
        );
    }
}
