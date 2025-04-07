package com.zitadel.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import com.nimbusds.oauth2.sdk.AuthorizationGrant;
import com.nimbusds.oauth2.sdk.JWTBearerGrant;
import com.nimbusds.oauth2.sdk.Scope;
import com.nimbusds.oauth2.sdk.auth.ClientAuthentication;
import com.nimbusds.oauth2.sdk.auth.ClientAuthenticationMethod;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.id.ClientID;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * JWT-based Authenticator using the JWT Bearer Grant (RFC7523).
 * <p>
 * This class creates a JWT assertion and exchanges it for an access token.
 */
public class WebTokenAuthenticator extends OAuthAuthenticator {

  private final String jwtIssuer;
  private final String jwtSubject;
  private final String jwtAudience;
  private final JWSSigner keySigner;
  private final Duration tokenLifetime;
  private final JWSHeader jwsHeader;

  WebTokenAuthenticator(
    OpenId openId,
    String jwtIssuer,
    String jwtSubject,
    String jwtAudience,
    JWSSigner keySigner,
    Duration tokenLifetime,
    JWSHeader jwsHeader,
    Scope authScopes
  ) {
    super(openId, authScopes);
    this.jwtIssuer = jwtIssuer;
    this.jwtSubject = jwtSubject;
    this.jwtAudience = jwtAudience;
    this.keySigner = keySigner;
    this.tokenLifetime = tokenLifetime;
    this.jwsHeader = jwsHeader;
  }

  /**
   * Returns a new builder instance for JWTAuthenticator.
   *
   * @param host       The base URL for API endpoints.
   * @param userId     Used as both the issuer and subject in the JWT.
   * @param privateKey The private key used to sign the JWT.
   * @return a new JWTAuthenticatorBuilder instance.
   */
  public static Builder builder(String host, String userId, PrivateKey privateKey) {
    return new Builder(host, userId, userId, host, privateKey);
  }

  /**
   * Refreshes the access token using a JWT assertion.
   * <p>
   * This method generates a JWT assertion and exchanges it for an access token.
   */
  @Override
  public Token refreshToken() {
    this.token = super.getToken(new ClientAuthentication(ClientAuthenticationMethod.NONE, new ClientID()) {

      @Override
      public Set<String> getFormParameterNames() {
        return new HashSet<>();
      }

      @Override
      public void applyTo(HTTPRequest httpRequest) {
        //
      }
    });
    return token;
  }

  @Override
  public AuthorizationGrant getGrant() {
    try {
      SignedJWT signedJWT = new SignedJWT(
        jwsHeader,
        new JWTClaimsSet.Builder()
          .issuer(jwtIssuer)
          .subject(jwtSubject)
          .audience(jwtAudience)
          .issueTime(Date.from(Instant.now()))
          .expirationTime(Date.from(Instant.now().plus(tokenLifetime)))
          .build()
      );

      signedJWT.sign(keySigner);
      return new JWTBearerGrant(SignedJWT.parse(signedJWT.serialize()));

    } catch (JOSEException | ParseException e) {
      throw new RuntimeException("Failed to generate JWT assertion: " + e.getMessage(), e);
    }
  }

  /**
   * Immutable POJO for deserializing service account configuration.
   * <p>
   * Expects a JSON structure similar to:
   * <p>
   * {
   * "type": "serviceaccount",
   * "keyId": "100509901696068329",
   * "key": "-----BEGIN PRIVATE KEY----- ... -----END PRIVATE KEY-----",
   * "userId": "100507859606888466"
   * }
   */
  public static class ServiceAccountConfig {

    private static final KeyFactory KEY_FACTORY;

    static {
      try {
        KEY_FACTORY = KeyFactory.getInstance("RSA");
      } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException(e);
      }
    }

    private final String keyType;
    private final String userId;
    private final String keyId;
    private final PrivateKey keySpec;

    /**
     * Constructs a ServiceAccountConfig.
     *
     * @param keyType   The type field (expected to be "serviceaccount").
     * @param userId    The service account user ID.
     * @param keyId     The key identifier.
     * @param keyString The PEM-formatted private key string.
     */
    @JsonCreator
    public ServiceAccountConfig(
      @JsonProperty("type") String keyType,
      @JsonProperty("userId") String userId,
      @JsonProperty("keyId") String keyId,
      @JsonProperty("key") String keyString) throws InvalidKeySpecException {
      this.keyType = keyType;
      this.userId = userId;
      this.keyId = keyId;
      // Clean the key string by removing PEM header, footer, and whitespace.
      String cleanedKey = keyString
        .replace("-----BEGIN PRIVATE KEY-----", "")
        .replace("-----END PRIVATE KEY-----", "")
        .replaceAll("\\s+", "");
      byte[] decoded = Base64.getDecoder().decode(cleanedKey);
      this.keySpec = KEY_FACTORY.generatePrivate(new PKCS8EncodedKeySpec(decoded));
    }

    public static ServiceAccountConfig fromPath(Path path) {
      try {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(path.toFile(), ServiceAccountConfig.class);
      } catch (IOException e) {
        throw new RuntimeException("Failed to load service account config from file: " + e.getMessage(), e);
      }
    }

    /**
     * Returns the type.
     *
     * @return the type.
     */
    public String getKeyType() {
      return keyType;
    }

    /**
     * Returns the service account user ID.
     *
     * @return the userId.
     */
    public String getUserId() {
      return userId;
    }

    /**
     * Returns the key identifier.
     *
     * @return the keyId.
     */
    public String getKeyId() {
      return keyId;
    }

    /**
     * Returns the PKCS8EncodedKeySpec representing the private key.
     *
     * @return the keySpec.
     */
    public PrivateKey getKeySpec() {
      return keySpec;
    }
  }

  /**
   * Builder for JWTAuthenticator.
   */
  public static class Builder extends OAuthAuthenticatorBuilder<Builder> {

    private final String jwtIssuer;
    private final String jwtSubject;
    private final String jwtAudience;
    private final RSASSASigner keySigner;
    private Duration tokenLifetime = Duration.ofHours(1);
    private JWSHeader jwsHeader = new JWSHeader.Builder(JWSAlgorithm.RS256).build();

    /**
     * Builder constructor with required parameters.
     *
     * @param host        The base URL for the API endpoints.
     * @param jwtIssuer   The issuer claim for the JWT.
     * @param jwtSubject  The subject claim for the JWT.
     * @param jwtAudience The audience claim for the JWT.
     * @param privateKey  The RSAPrivateKey used to sign the JWT.
     */
    Builder(String host,
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

    public static Builder fromKeyfile(String host, String jsonPath) {
      ServiceAccountConfig config = ServiceAccountConfig.fromPath(new File(jsonPath).toPath());
      return new Builder(host, config.getUserId(), config.getUserId(), host, config.getKeySpec());
    }

    public Builder tokenLifetime(Duration tokenLifetime) {
      this.tokenLifetime = tokenLifetime;
      return this;
    }

    public Builder jwtAlgorithm(String jwtAlgorithm) {
      this.jwsHeader = new JWSHeader.Builder(JWSAlgorithm.parse(jwtAlgorithm)).build();
      return this;
    }

    /**
     * Builds the JWTAuthenticator.
     * <p>
     * Prepares all required values for JWT-based authentication.
     *
     * @return a new JWTAuthenticator instance.
     */
    public WebTokenAuthenticator build() {
      return new WebTokenAuthenticator(
        openId,
        jwtIssuer,
        jwtSubject,
        jwtAudience,
        keySigner,
        tokenLifetime,
        jwsHeader,
        authScopes
      );
    }
  }
}
