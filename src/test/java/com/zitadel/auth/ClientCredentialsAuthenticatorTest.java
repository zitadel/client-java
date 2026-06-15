package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies that {@link ClientCredentialsAuthenticator} redacts the OAuth2 client secret in its
 * {@code toString()} representation so it cannot leak into logs, matching the Python, PHP and Ruby
 * SDKs.
 */
class ClientCredentialsAuthenticatorTest {

  private static final String SECRET = "super-secret-value-9000";

  /** The client credentials authenticator must mask the client secret in {@code toString()}. */
  @Test
  @DisplayName("ClientCredentialsAuthenticator masks the client secret")
  void redactsSecret() {
    ClientCredentialsAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder("https://example.zitadel.cloud", "client-1", SECRET)
            .build();

    String rendered = authenticator.toString();

    assertFalse(rendered.contains(SECRET), "toString must not contain the client secret");
    assertTrue(rendered.contains("***"), "toString must redact the secret with ***");
    assertTrue(rendered.contains("client-1"), "toString should keep the non-secret client id");
  }
}
