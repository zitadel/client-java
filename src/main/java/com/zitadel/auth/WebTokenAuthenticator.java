package com.zitadel.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

/**
 * JWT-based Authenticator using the JWT Bearer Grant (RFC 7523).
 *
 * <p>This class creates a signed JWT assertion (using nimbus-jose-jwt) and exchanges it for an
 * access token via the shared {@link com.zitadel.ApiClient} inherited from {@link
 * OAuthAuthenticator}.
 */
public class WebTokenAuthenticator extends OAuthAuthenticator {

  private static final String GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";

  private static final Set<String> ALGORITHMS = Set.of("RS256", "RS384", "RS512");

  private final String jwtIssuer;
  private final String jwtSubject;
  private final String jwtAudience;
  private final JWSSigner keySigner;
  private final Duration tokenLifetime;
  private final JWSHeader jwsHeader;

  /**
   * Constructs a WebTokenAuthenticator.
   *
   * @param openId the OpenID discovery helper for the target host.
   * @param jwtIssuer the issuer claim for the JWT.
   * @param jwtSubject the subject claim for the JWT.
   * @param jwtAudience the audience claim for the JWT.
   * @param keySigner the signer used to sign the JWT.
   * @param tokenLifetime the lifetime of the assertion.
   * @param jwsHeader the JWS header for the JWT.
   * @param scope the scopes for the token request.
   */
  WebTokenAuthenticator(
      OpenId openId,
      String jwtIssuer,
      String jwtSubject,
      String jwtAudience,
      JWSSigner keySigner,
      Duration tokenLifetime,
      JWSHeader jwsHeader,
      String scope) {
    super(openId, scope);
    this.jwtIssuer = jwtIssuer;
    this.jwtSubject = jwtSubject;
    this.jwtAudience = jwtAudience;
    this.keySigner = keySigner;
    this.tokenLifetime = tokenLifetime;
    this.jwsHeader = jwsHeader;
  }

  /**
   * Creates a WebTokenAuthenticator from a Zitadel service-account key file.
   *
   * <p>Expected JSON format:
   *
   * <pre>
   * {
   *   "type": "serviceaccount",
   *   "keyId": "&lt;key-id&gt;",
   *   "key": "&lt;private-key&gt;",
   *   "userId": "&lt;user-id&gt;"
   * }
   * </pre>
   *
   * @param host the base URL for the API endpoints.
   * @param jsonPath the path to the key file.
   * @return a new WebTokenAuthenticator instance.
   * @throws IllegalArgumentException if the file cannot be read, is not a JSON object, lacks the
   *     string fields {@code userId}, {@code keyId} and {@code key}, or holds an invalid key.
   */
  public static WebTokenAuthenticator fromJson(String host, String jsonPath) {
    JsonNode config;
    try (InputStream stream = new FileInputStream(jsonPath)) {
      config = readJson(stream);
    } catch (IOException e) {
      throw new IllegalArgumentException("Unable to read the key file at " + jsonPath, e);
    }
    if (config == null || !config.isObject()) {
      throw new IllegalArgumentException("The key file at " + jsonPath + " is not a JSON object");
    }
    JsonNode userId = config.get("userId");
    JsonNode keyId = config.get("keyId");
    JsonNode key = config.get("key");
    if (userId == null
        || !userId.isTextual()
        || keyId == null
        || !keyId.isTextual()
        || key == null
        || !key.isTextual()) {
      throw new IllegalArgumentException(
          "The key file at " + jsonPath + " must contain the string fields userId, keyId and key");
    }
    return builder(host, userId.asText(), parsePrivateKey(key.asText()))
        .keyId(keyId.asText())
        .build();
  }

  @Nullable
  private static JsonNode readJson(InputStream stream) throws IOException {
    try {
      return new ObjectMapper().readTree(stream);
    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
      return null;
    }
  }

  private static PrivateKey parsePrivateKey(String pem) {
    try (PemReader pemReader = new PemReader(new StringReader(pem))) {
      PemObject pemObject = pemReader.readPemObject();
      if (pemObject == null) {
        throw new IllegalArgumentException("Private key is not a valid RSA private key.");
      }
      byte[] keyBytes = pemObject.getContent();
      if ("RSA PRIVATE KEY".equals(pemObject.getType())) {
        keyBytes =
            new PrivateKeyInfo(
                    new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption),
                    RSAPrivateKey.getInstance(keyBytes))
                .getEncoded();
      }
      return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(keyBytes));
    } catch (IOException | GeneralSecurityException | IllegalStateException e) {
      throw new IllegalArgumentException("Private key is not a valid RSA private key.", e);
    }
  }

  /**
   * Returns a new builder instance for WebTokenAuthenticator.
   *
   * @param host the base URL for the API endpoints.
   * @param userId the user ID, used as both the issuer and the subject of the assertion.
   * @param privateKey the RSA private key used to sign the assertion.
   * @return a new Builder instance.
   * @throws IllegalArgumentException if the host is not a valid http or https URL, the user ID is
   *     empty, or the key is not an RSA private key.
   */
  public static Builder builder(String host, String userId, PrivateKey privateKey) {
    return new Builder(host, userId, privateKey);
  }

  @Override
  protected String getGrantType() {
    return GRANT_TYPE;
  }

  @Override
  protected Map<String, String> getTokenRequestParams() {
    return Collections.singletonMap("assertion", buildAssertion());
  }

  private String buildAssertion() {
    Instant now = Instant.now();
    SignedJWT signedJwt =
        new SignedJWT(
            jwsHeader,
            new JWTClaimsSet.Builder()
                .issuer(jwtIssuer)
                .subject(jwtSubject)
                .audience(jwtAudience)
                .issueTime(Date.from(now))
                .expirationTime(Date.from(now.plus(tokenLifetime)))
                .build());
    try {
      signedJwt.sign(keySigner);
    } catch (JOSEException e) {
      throw new IllegalStateException("Unable to sign the JWT assertion", e);
    }
    return signedJwt.serialize();
  }

  /** Builder for WebTokenAuthenticator. */
  @SuppressFBWarnings("CT_CONSTRUCTOR_THROW")
  public static class Builder extends OAuthAuthenticatorBuilder<Builder> {

    private final String userId;
    private final RSASSASigner keySigner;
    private Duration tokenLifetime = Duration.ofHours(1);
    @Nullable private String keyId;
    private JWSAlgorithm jwtAlgorithm = JWSAlgorithm.RS256;

    /**
     * Initialises the builder.
     *
     * @param host the base URL for the API endpoints.
     * @param userId the user ID, used as both the issuer and the subject of the assertion.
     * @param privateKey the RSA private key used to sign the assertion.
     */
    Builder(String host, String userId, PrivateKey privateKey) {
      super(host);
      this.userId = requireText(userId, "User ID");
      if (privateKey == null || !"RSA".equalsIgnoreCase(privateKey.getAlgorithm())) {
        throw new IllegalArgumentException("Private key is not a valid RSA private key.");
      }
      this.keySigner = new RSASSASigner(privateKey);
    }

    /**
     * Sets the lifetime of the JWT assertion.
     *
     * @param seconds the lifetime in seconds; must be positive.
     * @return this builder.
     * @throws IllegalArgumentException if the lifetime is not positive.
     */
    public Builder tokenLifetimeSeconds(long seconds) {
      if (seconds <= 0) {
        throw new IllegalArgumentException("Token lifetime must be a positive number of seconds.");
      }
      this.tokenLifetime = Duration.ofSeconds(seconds);
      return this;
    }

    /**
     * Sets the JWT signing algorithm.
     *
     * @param jwtAlgorithm one of {@code RS256}, {@code RS384} or {@code RS512}.
     * @return this builder.
     * @throws IllegalArgumentException if the algorithm is not supported.
     */
    public Builder jwtAlgorithm(String jwtAlgorithm) {
      if (jwtAlgorithm == null || !ALGORITHMS.contains(jwtAlgorithm)) {
        throw new IllegalArgumentException(
            "Unsupported JWT algorithm '" + jwtAlgorithm + "'; use RS256, RS384 or RS512.");
      }
      this.jwtAlgorithm = JWSAlgorithm.parse(jwtAlgorithm);
      return this;
    }

    /**
     * Sets the key ID sent as the {@code kid} header of the assertion.
     *
     * @param keyId the key ID.
     * @return this builder.
     * @throws IllegalArgumentException if the key ID is empty.
     */
    public Builder keyId(String keyId) {
      this.keyId = requireText(keyId, "Key ID");
      return this;
    }

    /**
     * Builds the WebTokenAuthenticator.
     *
     * @return a new WebTokenAuthenticator instance.
     */
    public WebTokenAuthenticator build() {
      return new WebTokenAuthenticator(
          openId,
          userId,
          userId,
          openId.getHostEndpoint(),
          keySigner,
          tokenLifetime,
          new JWSHeader.Builder(jwtAlgorithm).keyID(keyId).build(),
          scope);
    }
  }
}
