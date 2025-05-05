package com.zitadel;

import java.util.List;
import java.util.Map;

/**
 * Represents an HTTP error returned from the Zitadel API.
 * <p>
 * Exposes the HTTP status code, response headers, and response body.
 */
public class ApiException extends ZitadelException {
    private static final long serialVersionUID = 1L;

    /** HTTP status code. */
    private final int code;

    /** HTTP response headers. */
    private final Map<String, List<String>> responseHeaders;

    /** HTTP response body (string, decoded JSON, or object). */
    private final String responseBody;

    /**
     * Constructor.
     *
     * @param code            HTTP status code
     * @param responseHeaders HTTP response headers
     * @param responseBody    HTTP response body (string, decoded JSON, or object)
     */
    public ApiException(
        int code,
        Map<String, List<String>> responseHeaders,
        String responseBody
    ) {
        super("Error " + code);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Gets the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Gets the HTTP response headers.
     *
     * @return HTTP response headers
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Gets the HTTP response body (string, decoded JSON, or object).
     *
     * @return HTTP response body
     */
    public String getResponseBody() {
        return responseBody;
    }
}
