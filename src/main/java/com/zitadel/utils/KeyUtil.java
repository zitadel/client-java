package com.zitadel.utils;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

import java.io.IOException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

public class KeyUtil {

    private KeyUtil() {
        //
    }

    /**
     * Converts a PEM-formatted private key string into a {@code PrivateKey} object.
     *
     * @param key the PEM-formatted private key string.
     * @return the corresponding {@code PrivateKey} instance.
     * @throws IOException if the key cannot be parsed.
     */
    public static PrivateKey getPrivateKeyFromString(String key) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
        try (PemReader pemReader = new PemReader(new StringReader(key))) {
            PemObject pemObject = pemReader.readPemObject();

            if (pemObject == null) {
                throw new IOException("Failed to parse PEM object from key string. The input may be malformed or empty.");
            } else {
                byte[] keyBytes = pemObject.getContent();

                if (pemObject.getType().equals("RSA PRIVATE KEY")) {
                    RSAPrivateKey rsaPrivateKey = RSAPrivateKey.getInstance(keyBytes);
                    PrivateKeyInfo privateKeyInfo =
                        new PrivateKeyInfo(
                            new AlgorithmIdentifier(
                                PKCSObjectIdentifiers.rsaEncryption),
                            rsaPrivateKey);
                    keyBytes = privateKeyInfo.getEncoded();
                }

                PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return keyFactory.generatePrivate(keySpec);
            }
        }
    }
}
