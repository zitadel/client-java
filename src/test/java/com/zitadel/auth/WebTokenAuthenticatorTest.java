package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.time.Instant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies that {@link WebTokenAuthenticator} redacts its in-memory secret in its {@code
 * toString()} representation so it cannot leak into logs, matching the Python, PHP and Ruby SDKs.
 *
 * <p>{@code WebTokenAuthenticator} inherits the masking from {@link OAuthAuthenticator} and only
 * ever surfaces the cached access token (never the signing key), so the cached token is seeded
 * directly and asserted to be masked. Construction never touches the network.
 */
class WebTokenAuthenticatorTest {

  private static final String TOKEN = "minted-web-token-do-not-leak";

  /** The web token authenticator must mask the cached access token in {@code toString()}. */
  @Test
  @DisplayName("WebTokenAuthenticator masks the cached access token")
  void redactsSecret() throws GeneralSecurityException, ReflectiveOperationException {
    PrivateKey privateKey = KeyPairGenerator.getInstance("RSA").generateKeyPair().getPrivate();
    WebTokenAuthenticator authenticator =
        WebTokenAuthenticator.builder("https://example.zitadel.cloud", "user-1", privateKey)
            .keyId("key-1")
            .build();
    seedCachedToken(authenticator);

    String rendered = authenticator.toString();

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
  private static void seedCachedToken(WebTokenAuthenticator authenticator)
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
