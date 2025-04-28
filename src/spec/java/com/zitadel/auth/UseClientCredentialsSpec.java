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
 * SettingsService Integration Tests using Client Credentials
 * <p>
 * Verifies the general settings endpoint with:
 * 1. Valid client credentials
 * 2. Invalid client credentials
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SuppressWarnings("NewClassNamingConvention")
class UseClientCredentialsSpec extends BaseTest {

    /**
     * Retrieves general settings successfully with valid client credentials.
     *
     * @throws ApiException on API error
     */
    @Test
    void testRetrievesGeneralSettingsWithValidAuth() throws ApiException {
        Zitadel client = Zitadel.withClientCredentials(
            System.getProperty("BASE_URL"),
            System.getProperty("CLIENT_ID"),
            System.getProperty("CLIENT_SECRET")
        );

        SettingsServiceGetGeneralSettingsResponse response =
            client.settings.settingsServiceGetGeneralSettings();
        assertNotNull(response);
    }

    /**
     * Raises ApiException when using invalid client credentials.
     */
    @Test
    void testRaisesApiExceptionWithInvalidAuth() {
        Zitadel invalid = Zitadel.withClientCredentials(
            System.getProperty("BASE_URL"),
            "invalid",
            "invalid"
        );

        assertThrows(RuntimeException.class, invalid.settings::settingsServiceGetGeneralSettings
        );
    }
}
