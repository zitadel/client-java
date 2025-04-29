package com.zitadel;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@SuppressWarnings("unused")
public class ApiException extends Exception {
  private static final long serialVersionUID = 1L;

  private int code = 0;
  @Nullable private Map<String, List<String>> responseHeaders = null;
  @Nullable private String responseBody = null;

  public ApiException() {}

  public ApiException(Throwable throwable) {
    super(throwable);
  }

  public ApiException(String message) {
    super(message);
  }

  public ApiException(
      String message,
      @Nullable Throwable throwable,
      int code,
      @Nullable Map<String, List<String>> responseHeaders,
      @Nullable String responseBody) {
    super(message, throwable);
    this.code = code;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  public ApiException(
      String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this(message, null, code, responseHeaders, responseBody);
  }

  public ApiException(
      String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
    this(message, throwable, code, responseHeaders, null);
  }

  public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this(
        "Response Code: " + code + " Response Body: " + responseBody,
        null,
        code,
        responseHeaders,
        responseBody);
  }

  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  public ApiException(
      int code,
      String message,
      @Nullable Map<String, List<String>> responseHeaders,
      @Nullable String responseBody) {
    this(code, message);
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
   * @return A map of list of string
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
