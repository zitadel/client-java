package com.zitadel.errors;

import com.zitadel.ZitadelException;

/**
 * Exception for an OAuth2 token endpoint that answered 2xx with a body the SDK cannot use: not a
 * JSON object, or without a non-empty {@code access_token}.
 */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
public class OAuth2TokenException extends ZitadelException {
  @java.io.Serial private static final long serialVersionUID = 1L;

  /**
   * Creates a new exception.
   *
   * @param message the error message
   */
  public OAuth2TokenException(String message) {
    super(message);
  }
}
