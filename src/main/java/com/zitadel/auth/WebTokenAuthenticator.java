package com.zitadel.auth;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import com.zitadel.ZitadelException;
import com.zitadel.utils.KeyUtil;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * JWT-based Authenticator using the JWT Bearer Grant (RFC 7523).
 *
 * <p>This class creates a signed JWT assertion (using nimbus-jose-jwt) and exchanges it for an
 * access token via the shared {@link com.zitadel.ApiClient} inherited from {@link
 * OAuthAuthenticator}.
 */
public class WebTokenAuthenticator extends OAuthAuthenticator {

  private static final String GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";

  private final String jwtIssuer;
  private final String jwtSubject;
  private final String jwtAudience;
  private final JWSSigner keySigner;
  private final Duration tokenLifetime;
  private final JWSHeader jwsHeader;

  /**
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
   * Creates a {@code WebTokenAuthenticator} from a JSON service-account file.
   *
   * <p>The JSON must contain {@code userId}, {@code keyId}, and a PEM-encoded {@code key}.
   *
   * @param host the base URL for the API endpoints.
   * @param jsonPath the file path to the JSON configuration file.
   * @return a new instance of {@code WebTokenAuthenticator}.
   */
  @SuppressWarnings("unused")
  @SuppressFBWarnings("PATH_TRAVERSAL_IN")
  public static WebTokenAuthenticator fromJson(String host, String jsonPath) {
    try (FileInputStream fis = new FileInputStream(jsonPath)) {
      return fromJson(host, fis);
    } catch (IOException e) {
      throw new ZitadelException(
          "Unable to read JSON file at " + jsonPath + ": " + e.getMessage(), e);
    }
  }

  /**
   * Creates a {@code WebTokenAuthenticator} from a JSON service-account stream.
   *
   * @param host the base URL for the API endpoints.
   * @param inputStream the input stream containing the JSON configuration.
   * @return a new instance of {@code WebTokenAuthenticator}.
   */
  public static WebTokenAuthenticator fromJson(String host, InputStream inputStream) {
    ObjectMapper mapper = new ObjectMapper();
    Map<String, Object> config;
    try {
      config = mapper.readValue(inputStream, new TypeReference<>() {});
    } catch (IOException e) {
      throw new ZitadelException(
          "Unable to read or parse JSON from input stream: " + e.getMessage(), e);
    }

    if (config == null || config.isEmpty()) {
      throw new ZitadelException("Expected a JSON object in input stream");
    }

    String userId = (String) config.get("userId");
    String keyString = (String) config.get("key");
    String keyId = (String) config.get("keyId");
    if (userId == null || keyString == null || keyId == null) {
      throw new ZitadelException("Missing required keys 'userId', 'keyId' or 'key' in JSON.");
    }

    PrivateKey privateKey;
    try {
      privateKey = KeyUtil.getPrivateKeyFromString(keyString);
    } catch (IOException | InvalidKeySpecException | NoSuchAlgorithmException e) {
      throw new ZitadelException(
          "Unable to convert key string to PrivateKey: " + e.getMessage(), e);
    }

    return WebTokenAuthenticator.builder(host, userId, privateKey).keyId(keyId).build();
  }

  /**
   * Returns a new builder instance for WebTokenAuthenticator.
   *
   * @param host the base URL for API endpoints.
   * @param userId used as both the issuer and subject in the JWT.
   * @param privateKey the private key used to sign the JWT.
   * @return a new {@link Builder} instance.
   */
  public static Builder builder(String host, String userId, PrivateKey privateKey) {
    return new Builder(host, userId, userId, host, privateKey);
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
    try {
      SignedJWT signedJWT =
          new SignedJWT(
              jwsHeader,
              new JWTClaimsSet.Builder()
                  .issuer(jwtIssuer)
                  .subject(jwtSubject)
                  .audience(jwtAudience)
                  .issueTime(Date.from(Instant.now()))
                  .expirationTime(Date.from(Instant.now().plus(tokenLifetime)))
                  .build());
      signedJWT.sign(keySigner);
      return signedJWT.serialize();
    } catch (JOSEException e) {
      throw new ZitadelException("Failed to generate JWT assertion: " + e.getMessage(), e);
    }
  }

  /** Builder for {@link WebTokenAuthenticator}. */
  public static class Builder extends OAuthAuthenticatorBuilder<Builder> {

    private final String jwtIssuer;
    private final String jwtSubject;
    private final String jwtAudience;
    private final RSASSASigner keySigner;
    private Duration tokenLifetime = Duration.ofHours(1);
    @Nullable private String keyId;
    private JWSAlgorithm jwtAlgorithm = JWSAlgorithm.RS256;

    /**
     * @param host the base URL for the API endpoints.
     * @param jwtIssuer the issuer claim for the JWT.
     * @param jwtSubject the subject claim for the JWT.
     * @param jwtAudience the audience claim for the JWT.
     * @param privateKey the private key used to sign the JWT.
     */
    Builder(
        String host,
        String jwtIssuer,
        String jwtSubject,
        String jwtAudience,
        PrivateKey privateKey) {
      super(host);
      this.jwtIssuer = jwtIssuer;
      this.jwtSubject = jwtSubject;
      this.jwtAudience = jwtAudience;
      this.keySigner = new RSASSASigner(privateKey);
    }

    /**
     * Sets the assertion lifetime.
     *
     * @param tokenLifetime the assertion lifetime.
     * @return this builder.
     */
    public Builder tokenLifetime(Duration tokenLifetime) {
      this.tokenLifetime = tokenLifetime;
      return this;
    }

    /**
     * Sets the JWS algorithm used to sign the assertion.
     *
     * @param jwtAlgorithm the JWS algorithm name (for example {@code RS256}).
     * @return this builder.
     */
    public Builder jwtAlgorithm(String jwtAlgorithm) {
      this.jwtAlgorithm = JWSAlgorithm.parse(jwtAlgorithm);
      return this;
    }

    /**
     * Sets the key id placed in the JWS header.
     *
     * @param keyId the key id placed in the JWS header.
     * @return this builder.
     */
    public Builder keyId(String keyId) {
      this.keyId = keyId;
      return this;
    }

    /**
     * Builds the WebTokenAuthenticator.
     *
     * @return a new {@link WebTokenAuthenticator} instance.
     */
    public WebTokenAuthenticator build() {
      return new WebTokenAuthenticator(
          openId,
          jwtIssuer,
          jwtSubject,
          jwtAudience,
          keySigner,
          tokenLifetime,
          new JWSHeader.Builder(jwtAlgorithm).keyID(keyId).build(),
          scope);
    }
  }
}
