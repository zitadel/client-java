package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies that {@link PersonalAccessTokenAuthenticator} redacts the personal access token in its
 * {@code toString()} representation so it cannot leak into logs, and validates its arguments.
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

  /** The token is sent as a bearer credential and a schemeless host defaults to https. */
  @Test
  @DisplayName("PersonalAccessTokenAuthenticator sends the token as a bearer credential")
  void returnsHeadersAndHost() {
    PersonalAccessTokenAuthenticator authenticator =
        new PersonalAccessTokenAuthenticator("example.zitadel.cloud", TOKEN);

    assertEquals(Map.of("Authorization", "Bearer " + TOKEN), authenticator.getAuthHeaders());
    assertEquals("https://example.zitadel.cloud", authenticator.getHost());
  }

  /** An empty token or an invalid host is a caller mistake. */
  @Test
  @DisplayName("PersonalAccessTokenAuthenticator rejects an empty token and a bad host")
  void rejectsBadArguments() {
    assertThrowsExactly(
        IllegalArgumentException.class,
        () -> new PersonalAccessTokenAuthenticator("https://example.zitadel.cloud", ""));
    assertThrowsExactly(
        IllegalArgumentException.class,
        () -> new PersonalAccessTokenAuthenticator("ftp://example.zitadel.cloud", TOKEN));
  }
}
