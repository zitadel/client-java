package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies that authenticators holding secrets or cached tokens redact those values in their {@code
 * toString()} representation so they cannot leak into logs, matching the Python, PHP and Ruby SDKs.
 */
class AuthenticatorRedactionTest {

  private static final String SECRET = "super-secret-value-9000";
  private static final String TOKEN = "tkn-abcdef-do-not-leak";

  /** The client credentials authenticator must mask the client secret in {@code toString()}. */
  @Test
  @DisplayName("ClientCredentialsAuthenticator masks the client secret")
  void clientCredentialsMasksSecret() {
    ClientCredentialsAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder("https://example.zitadel.cloud", "client-1", SECRET)
            .build();

    String rendered = authenticator.toString();

    assertFalse(rendered.contains(SECRET), "toString must not contain the client secret");
    assertTrue(rendered.contains("***"), "toString must redact the secret with ***");
    assertTrue(rendered.contains("client-1"), "toString should keep the non-secret client id");
  }

  /** The personal access token authenticator must mask the token in {@code toString()}. */
  @Test
  @DisplayName("PersonalAccessTokenAuthenticator masks the token")
  void personalAccessTokenMasksToken() {
    PersonalAccessTokenAuthenticator authenticator =
        new PersonalAccessTokenAuthenticator("https://example.zitadel.cloud", TOKEN);

    String rendered = authenticator.toString();

    assertFalse(rendered.contains(TOKEN), "toString must not contain the token");
    assertTrue(rendered.contains("***"), "toString must redact the token with ***");
  }

  /** The bearer authenticator must mask the token in {@code toString()}. */
  @Test
  @DisplayName("BearerAuthenticator masks the token")
  void bearerMasksToken() {
    BearerAuthenticator authenticator =
        new BearerAuthenticator("https://example.zitadel.cloud", TOKEN);

    String rendered = authenticator.toString();

    assertFalse(rendered.contains(TOKEN), "toString must not contain the token");
    assertTrue(rendered.contains("***"), "toString must redact the token with ***");
  }

  /** The zitadel access token authenticator must mask the token in {@code toString()}. */
  @Test
  @DisplayName("ZitadelAccessTokenAuthenticator masks the token")
  void zitadelAccessTokenMasksToken() {
    ZitadelAccessTokenAuthenticator authenticator =
        new ZitadelAccessTokenAuthenticator("https://example.zitadel.cloud", TOKEN);

    String rendered = authenticator.toString();

    assertFalse(rendered.contains(TOKEN), "toString must not contain the token");
    assertTrue(rendered.contains("***"), "toString must redact the token with ***");
  }
}
