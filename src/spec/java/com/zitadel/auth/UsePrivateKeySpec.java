package com.zitadel.auth;

import com.zitadel.AbstractIntegrationTest;
import com.zitadel.ApiException;
import com.zitadel.Zitadel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * SettingsService Integration Tests using Private Key Assertion
 * <p>
 * Verifies the general settings endpoint with:
 * 1. Valid private key assertion
 * 2. Invalid private key assertion
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SuppressWarnings("NewClassNamingConvention")
class UsePrivateKeySpec extends AbstractIntegrationTest {

    /**
     * Retrieves general settings successfully with a valid private key.
     *
     * @throws ApiException on API error
     */
    @Test
    void testRetrievesGeneralSettingsWithValidAuth() throws ApiException {
        Zitadel client = Zitadel.withPrivateKey(getBaseUrl(), getJwtKeyPath());
        client.settings.settingsServiceGetGeneralSettings();
    }

    /**
     * Raises ApiException when using an invalid private key.
     */
    @Test
    void testRaisesApiExceptionWithInvalidAuth() {
        Zitadel invalid = Zitadel.withPrivateKey("https://zitadel.cloud", getJwtKeyPath());

        assertThrows(RuntimeException.class, invalid.settings::settingsServiceGetGeneralSettings);
    }
}
