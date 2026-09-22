package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.util.Base64;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Verifies that {@link WebTokenAuthenticator} redacts its cached token, loads Zitadel key files,
 * and rejects unusable key files and builder arguments with {@link IllegalArgumentException}.
 * Construction never touches the network.
 */
class WebTokenAuthenticatorTest {

  private static final String TOKEN = "minted-web-token-do-not-leak";

  private static final String HOST = "https://example.zitadel.cloud";

  private static PrivateKey newKey() throws GeneralSecurityException {
    return KeyPairGenerator.getInstance("RSA").generateKeyPair().getPrivate();
  }

  private static String pem(PrivateKey key) {
    return "-----BEGIN PRIVATE KEY-----\n"
        + Base64.getEncoder().encodeToString(key.getEncoded())
        + "\n-----END PRIVATE KEY-----\n";
  }

  private static String keyFile(String content) throws IOException {
    Path path = Files.createTempFile("zitadel-key", ".json");
    path.toFile().deleteOnExit();
    Files.writeString(path, content, StandardCharsets.UTF_8);
    return path.toString();
  }

  /** The web token authenticator must mask the cached access token in {@code toString()}. */
  @Test
  @DisplayName("WebTokenAuthenticator masks the cached access token")
  void redactsSecret() throws GeneralSecurityException, ReflectiveOperationException {
    WebTokenAuthenticator authenticator =
        WebTokenAuthenticator.builder(HOST, "user-1", newKey()).keyId("key-1").build();
    Field field = OAuthAuthenticator.class.getDeclaredField("accessToken");
    field.setAccessible(true);
    field.set(authenticator, TOKEN);

    String rendered = authenticator.toString();

    assertFalse(rendered.contains(TOKEN), "toString must not contain the cached token");
    assertTrue(rendered.contains("***"), "toString must redact the token with ***");
  }

  @Test
  @DisplayName("a Zitadel key file builds an authenticator for the host")
  void loadsKeyFile() throws GeneralSecurityException, IOException {
    String json =
        "{\"type\":\"serviceaccount\",\"keyId\":\"key-1\",\"userId\":\"user-1\",\"key\":"
            + "\""
            + pem(newKey()).replace("\n", "\\n")
            + "\"}";

    WebTokenAuthenticator authenticator = WebTokenAuthenticator.fromJson(HOST, keyFile(json));

    assertEquals(HOST, authenticator.getHost());
  }

  @Test
  @DisplayName("a missing or malformed key file is an IllegalArgumentException")
  void rejectsBadKeyFile() throws IOException {
    String missing = Files.createTempDirectory("zitadel-key").resolve("absent.json").toString();
    assertThrowsExactly(
        IllegalArgumentException.class, () -> WebTokenAuthenticator.fromJson(HOST, missing));

    for (String json :
        new String[] {
          "not json",
          "[]",
          "{\"userId\":\"user-1\",\"keyId\":\"key-1\"}",
          "{\"userId\":\"user-1\",\"keyId\":\"key-1\",\"key\":\"not a pem\"}"
        }) {
      String path = keyFile(json);
      assertThrowsExactly(
          IllegalArgumentException.class, () -> WebTokenAuthenticator.fromJson(HOST, path));
    }
  }

  @Test
  @DisplayName("invalid builder arguments are an IllegalArgumentException")
  void rejectsBadBuilderArguments() throws GeneralSecurityException {
    PrivateKey key = newKey();
    PrivateKey ecKey = KeyPairGenerator.getInstance("EC").generateKeyPair().getPrivate();
    WebTokenAuthenticator.Builder builder = WebTokenAuthenticator.builder(HOST, "user-1", key);

    assertThrowsExactly(
        IllegalArgumentException.class, () -> WebTokenAuthenticator.builder(HOST, "", key));
    assertThrowsExactly(
        IllegalArgumentException.class, () -> WebTokenAuthenticator.builder(HOST, "u", ecKey));
    assertThrowsExactly(IllegalArgumentException.class, () -> builder.jwtAlgorithm("HS256"));
    assertThrowsExactly(IllegalArgumentException.class, () -> builder.tokenLifetimeSeconds(0));
    assertThrowsExactly(IllegalArgumentException.class, () -> builder.keyId(""));
  }
}
