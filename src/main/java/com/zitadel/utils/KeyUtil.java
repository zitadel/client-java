package com.zitadel.utils;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class KeyUtil {

  private KeyUtil() {
    //
  }

  /**
   * Converts a PEM-formatted private key string into a {@code PrivateKey} object.
   *
   * @param key the PEM-formatted private key string.
   * @return the corresponding {@code PrivateKey} instance.
   * @throws Exception if the key cannot be parsed.
   */
  public static PrivateKey getPrivateKeyFromString(String key) throws Exception {
    String privateKeyPEM = key
      .replace("-----BEGIN PRIVATE KEY-----", "")
      .replace("-----END PRIVATE KEY-----", "")
      .replaceAll("\\s+", "");
    byte[] encoded = Base64.getDecoder().decode(privateKeyPEM);
    PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    return keyFactory.generatePrivate(keySpec);
  }
}
