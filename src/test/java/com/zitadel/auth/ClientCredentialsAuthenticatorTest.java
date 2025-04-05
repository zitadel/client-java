package com.zitadel.auth;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ClientCredentialsAuthenticatorTest extends OAuthAuthenticatorTest {

  @Test
  void testRefreshToken() throws Exception {
    ClientCredentialsAuthenticator authenticator = new ClientCredentialsAuthenticator.Builder(oauthHost, "dummy-client", "dummy-secret")
      .scopes(new HashSet<>(Arrays.asList("openid", "foo")))
      .build();

    OAuthAuthenticator.Token token = authenticator.refreshToken();
    assertNotNull(token.accessToken, "Access token should not be null");
    assertTrue(token.expiresAt.isAfter(Instant.now()), "Token expiry should be in the future");
    assertEquals(Collections.singletonMap("Authorization", "Bearer " + token.accessToken), authenticator.getAuthHeaders());
  }
}
