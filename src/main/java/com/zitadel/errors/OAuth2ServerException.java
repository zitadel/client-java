package com.zitadel.errors;

import com.zitadel.ZitadelException;
import javax.annotation.Nullable;

/**
 * Exception for an OAuth2 token endpoint that answered with a non-2xx status.
 *
 * <p>Carries the RFC 6749 section 5.2 error fields when the response body holds a well-formed
 * OAuth2 error object, and the raw body in every case.
 */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
public class OAuth2ServerException extends ZitadelException {
  @java.io.Serial private static final long serialVersionUID = 1L;

  private final int statusCode;
  @Nullable private final String code;
  @Nullable private final String description;
  @Nullable private final String uri;
  private final String rawBody;

  /**
   * Creates a new exception.
   *
   * @param statusCode the HTTP status code of the token response
   * @param code the RFC 6749 error code, if present
   * @param description the human-readable error description, if present
   * @param uri a URI describing the error, if present
   * @param rawBody the raw token response body
   */
  public OAuth2ServerException(
      int statusCode,
      @Nullable String code,
      @Nullable String description,
      @Nullable String uri,
      String rawBody) {
    super(buildMessage(statusCode, code, description, rawBody));
    this.statusCode = statusCode;
    this.code = code;
    this.description = description;
    this.uri = uri;
    this.rawBody = rawBody;
  }

  /**
   * Returns the HTTP status code of the token response.
   *
   * @return the HTTP status code
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Returns the RFC 6749 error code.
   *
   * @return the error code, or {@code null} when the body held no OAuth2 error object
   */
  @Nullable
  public String getCode() {
    return code;
  }

  /**
   * Returns the human-readable error description.
   *
   * @return the description, or {@code null} when absent
   */
  @Nullable
  public String getDescription() {
    return description;
  }

  /**
   * Returns the URI describing the error.
   *
   * @return the URI, or {@code null} when absent
   */
  @Nullable
  public String getUri() {
    return uri;
  }

  /**
   * Returns the raw token response body.
   *
   * @return the raw body
   */
  public String getRawBody() {
    return rawBody;
  }

  private static String buildMessage(
      int statusCode, @Nullable String code, @Nullable String description, String rawBody) {
    if (code == null) {
      return "Token request failed with status " + statusCode + ": " + rawBody;
    }
    if (description != null) {
      return "Token request failed with status " + statusCode + ": " + code + " -- " + description;
    }
    return "Token request failed with status " + statusCode + ": " + code;
  }
}
