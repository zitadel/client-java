package com.zitadel.auth;

import com.zitadel.ZitadelException;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ClientCredentialsAuthenticatorTest extends OAuthAuthenticatorTest {

    @Test
    void testRefreshToken() throws ZitadelException {
        ClientCredentialsAuthenticator authenticator =
            ClientCredentialsAuthenticator.builder(oauthHost, "dummy-client", "dummy-secret")
                .scopes(new HashSet<>(Arrays.asList("openid", "foo")))
                .build();

        assertNotNull(authenticator.getAuthToken(), "Access token should not be empty");
        OAuthAuthenticator.Token token = authenticator.refreshToken();
        assertEquals(
            Collections.singletonMap("Authorization", "Bearer " + token.accessToken),
            authenticator.getAuthHeaders());
        assertNotNull(token.accessToken, "Access token should not be null");
        assertTrue(token.expiresAt.isAfter(Instant.now()), "Token expiry should be in the future");
        assertEquals(token.accessToken, authenticator.getAuthToken());
        assertEquals(oauthHost, authenticator.getHost());
        assertNotEquals(
            authenticator.refreshToken().accessToken, authenticator.refreshToken().accessToken);
    }
}
