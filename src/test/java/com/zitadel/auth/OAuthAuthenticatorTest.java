package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.time.Instant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies that {@link OAuthAuthenticator} redacts the cached/minted access token in its {@code
 * toString()} representation so it cannot leak into logs, matching the Python, PHP and Ruby SDKs.
 *
 * <p>Construction never touches the network: a concrete {@link ClientCredentialsAuthenticator} is
 * built and its cached token is seeded directly, mirroring how the Python and Ruby SDKs build their
 * OAuth redaction test.
 */
class OAuthAuthenticatorTest {

  private static final String TOKEN = "minted-access-token-do-not-leak";

  /** The OAuth authenticator must mask the cached access token in {@code toString()}. */
  @Test
  @DisplayName("OAuthAuthenticator masks the cached access token")
  void redactsSecret() throws ReflectiveOperationException {
    OAuthAuthenticator authenticator =
        ClientCredentialsAuthenticator.builder(
                "https://example.zitadel.cloud", "client-1", "client-secret")
            .build();
    seedCachedToken(authenticator);

    String rendered = OAuthAuthenticator.class.cast(authenticator).toString();

    assertFalse(rendered.contains(TOKEN), "toString must not contain the cached token");
    assertTrue(rendered.contains("***"), "toString must redact the token with ***");
  }

  /**
   * Seeds the protected cached-token field with a known access token so masking can be asserted
   * without minting a token over the network.
   *
   * @param authenticator the authenticator whose cached token is seeded.
   * @throws ReflectiveOperationException if the cached-token field cannot be set.
   */
  private static void seedCachedToken(OAuthAuthenticator authenticator)
      throws ReflectiveOperationException {
    Constructor<OAuthAuthenticator.Token> constructor =
        OAuthAuthenticator.Token.class.getDeclaredConstructor(String.class, Instant.class);
    constructor.setAccessible(true);
    OAuthAuthenticator.Token token = constructor.newInstance(TOKEN, Instant.MAX);

    Field field = OAuthAuthenticator.class.getDeclaredField("token");
    field.setAccessible(true);
    field.set(authenticator, token);
  }
}
