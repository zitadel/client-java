package com.zitadel.auth;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.Nullable;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JWTAuthenticatorTest extends OAuthAuthenticatorTest {

  @Test
  void testRefreshTokenUsingBuilder() throws Exception {

    KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
    kpg.initialize(2048);
    KeyPair keyPair = kpg.generateKeyPair();
    RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

    String clientId = "dummy-client";
    Duration tokenLifetime = Duration.ofSeconds(3600);

    JWTAuthenticator authenticator = new JWTAuthenticator.Builder(oauthHost, clientId, clientId, oauthHost, privateKey)
      .tokenLifetime(tokenLifetime)
      .jwtAlgorithm("RS256")
      .build();

    OAuthAuthenticator.Token token = authenticator.refreshToken();
    assertNotNull(token.accessToken, "Access token should not be null");
    assertTrue(token.expiresAt.isAfter(Instant.now()), "Token expiry should be in the future");
  }
}
