package com.zitadel.auth;

import com.zitadel.ApiException;
import com.zitadel.BaseTest;
import com.zitadel.Zitadel;
import com.zitadel.model.SettingsServiceGetGeneralSettingsResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * SettingsService Integration Tests using Personal Access Token
 * <p>
 * Verifies the general settings endpoint with:
 * 1. Valid personal access token
 * 2. Invalid personal access token
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SuppressWarnings("NewClassNamingConvention")
class UseAccessTokenSpec extends BaseTest {

    /**
     * Retrieves general settings successfully with a valid access token.
     *
     * @throws ApiException on API error
     */
    @Test
    void testRetrievesGeneralSettingsWithValidAuth() throws ApiException {
        Zitadel client = Zitadel.withAccessToken(
            System.getProperty("BASE_URL"),
            System.getProperty("AUTH_TOKEN")
        );

        SettingsServiceGetGeneralSettingsResponse response =
            client.settings.settingsServiceGetGeneralSettings();
        assertNotNull(response);
    }

    /**
     * Raises ApiException when using an invalid access token.
     */
    @Test
    void testRaisesApiExceptionWithInvalidAuth() {
        Zitadel invalid = Zitadel.withAccessToken(
            System.getProperty("BASE_URL"),
            "invalid"
        );

        assertThrows(ApiException.class, invalid.settings::settingsServiceGetGeneralSettings
        );
    }
}
