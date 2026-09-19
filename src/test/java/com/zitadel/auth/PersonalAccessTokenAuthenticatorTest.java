package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies that {@link PersonalAccessTokenAuthenticator} redacts the personal access token in its
 * {@code toString()} representation so it cannot leak into logs, matching the Python, PHP and Ruby
 * SDKs.
 */
class PersonalAccessTokenAuthenticatorTest {

  private static final String TOKEN = "tkn-abcdef-do-not-leak";

  /** The personal access token authenticator must mask the token in {@code toString()}. */
  @Test
  @DisplayName("PersonalAccessTokenAuthenticator masks the token")
  void redactsSecret() {
    PersonalAccessTokenAuthenticator authenticator =
        new PersonalAccessTokenAuthenticator("https://example.zitadel.cloud", TOKEN);

    String rendered = authenticator.toString();

    assertFalse(rendered.contains(TOKEN), "toString must not contain the token");
    assertTrue(rendered.contains("***"), "toString must redact the token with ***");
  }
}
