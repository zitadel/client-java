package com.zitadel.auth;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.Nullable;

public abstract class OAuthAuthenticatorTest {

  protected static String oauthHost;
  @Nullable
  private static GenericContainer<?> mockOAuth2Server;

  @SuppressWarnings({"resource", "HttpUrlsUsage"})
  @BeforeAll
  static void setUp() {
    mockOAuth2Server = new GenericContainer<>(DockerImageName.parse("ghcr.io/navikt/mock-oauth2-server:2.1.10"))
      .withExposedPorts(8080)
      .waitingFor(Wait.forHttp("/").forStatusCode(405));

    mockOAuth2Server.start();

    oauthHost = "http://" + mockOAuth2Server.getHost() + ":" + mockOAuth2Server.getMappedPort(8080);
  }

  @AfterAll
  static void tearDown() {
    if (mockOAuth2Server != null) {
      mockOAuth2Server.stop();
    }
  }
}
