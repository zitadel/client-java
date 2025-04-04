package com.zitadel.auth;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClientCredentialsAuthenticatorTest extends OAuthAuthenticatorTest {

  @Test
  void testRefreshToken() throws Exception {
    ClientCredentialsAuthenticator authenticator = new ClientCredentialsAuthenticator.Builder(oauthHost, "dummy-client", "dummy-secret")
      .scopes(new HashSet<>(Arrays.asList("openid", "foo")))
      .build();

    OAuthAuthenticator.Token token = authenticator.refreshToken();
    assertNotNull(token.accessToken, "Access token should not be null");
    assertTrue(token.expiresAt.isAfter(Instant.now()), "Token expiry should be in the future");
  }
}
