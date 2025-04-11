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
import com.nimbusds.oauth2.sdk.AuthorizationGrant;
import com.nimbusds.oauth2.sdk.JWTBearerGrant;
import com.nimbusds.oauth2.sdk.Scope;
import com.nimbusds.oauth2.sdk.auth.ClientAuthentication;
import com.nimbusds.oauth2.sdk.auth.ClientAuthenticationMethod;
import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.zitadel.utils.KeyUtil;

import java.io.File;
import java.io.IOException;
import java.security.PrivateKey;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
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
   * Creates a {@code WebTokenAuthenticator} instance from a JSON configuration file.
   *
   * <p>The JSON file must be formatted as follows:
   * <pre>
   * {
   *   "type": "serviceaccount",
   *   "keyId": "<key-id>",
   *   "key": "<private-key in PEM format>",
   *   "userId": "<user-id>"
   * }
   * </pre>
   *
   * @param host     the base URL for the API endpoints.
   * @param jsonPath the file path to the JSON configuration file.
   * @return a new instance of {@code WebTokenAuthenticator}.
   * @throws RuntimeException if the file cannot be read, the JSON is invalid,
   *                          or required keys are missing or invalid.
   */
  public static WebTokenAuthenticator fromJson(String host, String jsonPath) {
    ObjectMapper mapper = new ObjectMapper();
    Map<String, Object> config;
    try {
      config = mapper.readValue(new File(jsonPath), new TypeReference<Map<String, Object>>() {
      });
    } catch (IOException e) {
      throw new RuntimeException("Unable to read or parse JSON file at " + jsonPath + ": " + e.getMessage(), e);
    }

    if (config == null || config.isEmpty()) {
      throw new RuntimeException("Expected a JSON object in file at " + jsonPath);
    }

    String userId = (String) config.get("userId");
    String keyString = (String) config.get("key");

    if (userId == null || keyString == null) {
      throw new RuntimeException("Missing required keys 'userId' or 'key' in JSON file.");
    }

    PrivateKey privateKey;
    try {
      privateKey = KeyUtil.getPrivateKeyFromString(keyString);
    } catch (Exception e) {
      throw new RuntimeException("Unable to convert key string to PrivateKey: " + e.getMessage(), e);
    }

    return WebTokenAuthenticator.builder(host, userId, privateKey).build();
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
