package com.zitadel.auth;

import com.zitadel.AbstractIntegrationTest;
import com.zitadel.Zitadel;
import com.zitadel.errors.ApiException;
import com.zitadel.errors.OAuth2ServerException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

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
        Zitadel client = Zitadel.withAuthenticator(WebTokenAuthenticator.fromJson(getBaseUrl(), getJwtKeyPath()));
        client.settingsService.getGeneralSettings(new Object());
    }

    /**
     * Raises OAuth2ServerException when signing with a key the instance does not know.
     *
     * @throws NoSuchAlgorithmException if RSA key generation is unavailable
     */
    @Test
    void testRaisesApiExceptionWithInvalidAuth() throws NoSuchAlgorithmException {
        Zitadel invalid = Zitadel.withAuthenticator(WebTokenAuthenticator.builder(getBaseUrl(), "invalid",
            KeyPairGenerator.getInstance("RSA").generateKeyPair().getPrivate()).keyId("invalid").build());

        assertThrowsExactly(OAuth2ServerException.class, () -> invalid.settingsService.getGeneralSettings(new Object()));
    }
}
