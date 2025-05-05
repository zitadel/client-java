package com.zitadel.auth;

import com.zitadel.ApiException;
import com.zitadel.BaseTest;
import com.zitadel.Zitadel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

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
class UsePrivateKeySpec extends BaseTest {

    private String keyFile;

    /**
     * Prepare a temporary JWT key file before each test.
     * Reads the raw key from the JWT_KEY system property and writes it to a temp file.
     * Exits if the key is missing.
     *
     * @throws IOException on file I/O errors
     */
    @BeforeAll
    void setUp() throws Exception {
        String k = System.getProperty("JWT_KEY");
        if (k != null) {
            k = k.replace("\\\"", "\"");
        }
        if (k == null) System.exit(1);
        File f = File.createTempFile("jwt_", null);
        Files.write(f.toPath(), k.getBytes(StandardCharsets.UTF_8));
        keyFile = f.getAbsolutePath();
    }

    /**
     * Retrieves general settings successfully with a valid private key.
     *
     * @throws ApiException on API error
     */
    @Test
    void testRetrievesGeneralSettingsWithValidAuth() throws ApiException {
        Zitadel client = Zitadel.withPrivateKey(
            System.getProperty("BASE_URL"),
            keyFile
        );

        client.settings.settingsServiceGetGeneralSettings();
    }

    /**
     * Raises ApiException when using an invalid private key.
     */
    @Test
    void testRaisesApiExceptionWithInvalidAuth() {
        Zitadel invalid = Zitadel.withPrivateKey(
            "https://zitadel.cloud",
            keyFile
        );

        assertThrows(RuntimeException.class, invalid.settings::settingsServiceGetGeneralSettings);
    }
}
