package com.zitadel.auth;

import com.zitadel.auth.OAuthAuthenticator.Token;
import org.junit.jupiter.api.Test;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class WebTokenAuthenticatorTest extends OAuthAuthenticatorTest {

    @Test
    void testRefreshTokenUsingBuilder() throws Exception {

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);
        KeyPair keyPair = kpg.generateKeyPair();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

        WebTokenAuthenticator authenticator =
            WebTokenAuthenticator.builder(oauthHost, "dummy-client", privateKey)
                .keyId("dummy-key-id")
                .tokenLifetime(Duration.ofHours(1))
                .jwtAlgorithm("RS256")
                .build();

        assertNotNull(authenticator.getAuthToken(), "Access token should not be empty");
        Token token = authenticator.refreshToken();
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
