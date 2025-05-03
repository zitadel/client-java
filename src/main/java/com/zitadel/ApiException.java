package com.zitadel;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@SuppressWarnings("unused")
public class ApiException extends Exception {
  private static final long serialVersionUID = 1L;

  private final int code;
  private final Map<String, List<String>> responseHeaders;
  private final String responseBody;

  public ApiException(String message, int statusCode, Map<String, List<String>> responseHeaders, String responseBody) {
      super(message);
      this.code = statusCode;
      this.responseHeaders = responseHeaders;
      this.responseBody = responseBody;
  }

  /**
   * Get the HTTP status code.
   *
   * @return HTTP status code
   */
  public int getCode() {
    return code;
  }

  /**
   * Get the HTTP response headers.
   *
   * @return A map of a list of string
   */
  @Nullable
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get the HTTP response body.
   *
   * @return Response body in the form of string
   */
  @Nullable
  public String getResponseBody() {
    return responseBody;
  }
}
