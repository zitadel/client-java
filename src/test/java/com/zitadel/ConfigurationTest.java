package com.zitadel;

import com.zitadel.auth.NoAuthAuthenticator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConfigurationTest {

    private static final String OAUTH_HOST = "http://zitadel.com";

    /**
     * Test user agent getter.
     */
    @Test
    public void testUserAgent() {
        NoAuthAuthenticator authenticator = new NoAuthAuthenticator(OAUTH_HOST, "test-token");
        Configuration config = new Configuration(authenticator);

        assertTrue(config.getUserAgent().matches(
            "^zitadel-client/\\d+\\.\\d+\\.\\d+(-[a-z]+(\\.\\d+)?)? \\(lang=java; lang_version=[^;]+; os=[^;]+; arch=[^;]+\\)$"
        ));
    }

    /**
     * Test getting access token.
     */
    @Test
    public void testGetAccessToken() {
        NoAuthAuthenticator authenticator = new NoAuthAuthenticator(OAUTH_HOST, "test-token");
        Configuration config = new Configuration(authenticator);

        assertEquals("test-token", config.getAccessToken());
    }

    /**
     * Test getting host from authenticator.
     */
    @Test
    public void testGetHost() {
        NoAuthAuthenticator authenticator = new NoAuthAuthenticator(OAUTH_HOST, "test-token");
        Configuration config = new Configuration(authenticator);

        assertEquals(OAUTH_HOST, config.getHost());
    }

    /**
     * Test connection timeout.
     */
    @Test
    public void testGetConnectTimeout() {
        NoAuthAuthenticator authenticator = new NoAuthAuthenticator(OAUTH_HOST, "test-token");
        Configuration config = new Configuration(authenticator);

        assertEquals(5, config.getConnectTimeout().getSeconds());
    }

    /**
     * Test total timeout.
     */
    @Test
    public void testGetTimeout() {
        NoAuthAuthenticator authenticator = new NoAuthAuthenticator(OAUTH_HOST, "test-token");
        Configuration config = new Configuration(authenticator);

        assertEquals(30, config.getTimeout().getSeconds());
    }
}
