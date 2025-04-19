package com.zitadel.utils;

import java.io.StringReader;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

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
    // Use PemReader to extract the key content
    PemReader pemReader = new PemReader(new StringReader(key));
    PemObject pemObject = pemReader.readPemObject();
    pemReader.close();

    byte[] keyBytes = pemObject.getContent();

    // If the key is in PKCS#1 format, convert it into PKCS#8 format.
    if (pemObject.getType().equals("RSA PRIVATE KEY")) {
      // Parse the PKCS#1 structure
      RSAPrivateKey rsaPrivateKey = RSAPrivateKey.getInstance(keyBytes);
      // Wrap it into a PKCS#8 structure using PrivateKeyInfo
      PrivateKeyInfo privateKeyInfo =
          new PrivateKeyInfo(
              new org.bouncycastle.asn1.x509.AlgorithmIdentifier(
                  PKCSObjectIdentifiers.rsaEncryption),
              rsaPrivateKey);
      keyBytes = privateKeyInfo.getEncoded();
    }

    // Generate the PrivateKey from the PKCS8EncodedKeySpec
    PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    return keyFactory.generatePrivate(keySpec);
  }
}
