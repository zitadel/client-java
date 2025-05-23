/*
 * Zitadel SDK
 * The Zitadel SDK is a convenience wrapper around the Zitadel APIs to assist you in integrating with your Zitadel environment. This SDK enables you to handle resources, settings, and configurations within the Zitadel platform.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zitadel.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zitadel.model.OIDCServiceErrorReason;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * OIDCServiceAuthorizationError
 */
@JsonPropertyOrder({
  OIDCServiceAuthorizationError.JSON_PROPERTY_ERROR,
  OIDCServiceAuthorizationError.JSON_PROPERTY_ERROR_DESCRIPTION,
  OIDCServiceAuthorizationError.JSON_PROPERTY_ERROR_URI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OIDCServiceAuthorizationError {
  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private OIDCServiceErrorReason error = OIDCServiceErrorReason.ERROR_REASON_UNSPECIFIED;

  public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "errorDescription";
  @javax.annotation.Nullable
  private String errorDescription;

  public static final String JSON_PROPERTY_ERROR_URI = "errorUri";
  @javax.annotation.Nullable
  private String errorUri;

  public OIDCServiceAuthorizationError() {
  }

  public OIDCServiceAuthorizationError error(@javax.annotation.Nullable OIDCServiceErrorReason error) {
    
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OIDCServiceErrorReason getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(@javax.annotation.Nullable OIDCServiceErrorReason error) {
    this.error = error;
  }

  public OIDCServiceAuthorizationError errorDescription(@javax.annotation.Nullable String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDescription() {
    return errorDescription;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDescription(@javax.annotation.Nullable String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public OIDCServiceAuthorizationError errorUri(@javax.annotation.Nullable String errorUri) {
    
    this.errorUri = errorUri;
    return this;
  }

  /**
   * Get errorUri
   * @return errorUri
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorUri() {
    return errorUri;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorUri(@javax.annotation.Nullable String errorUri) {
    this.errorUri = errorUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCServiceAuthorizationError oiDCServiceAuthorizationError = (OIDCServiceAuthorizationError) o;
    return Objects.equals(this.error, oiDCServiceAuthorizationError.error) &&
        Objects.equals(this.errorDescription, oiDCServiceAuthorizationError.errorDescription) &&
        Objects.equals(this.errorUri, oiDCServiceAuthorizationError.errorUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription, errorUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCServiceAuthorizationError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorUri: ").append(toIndentedString(errorUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `errorDescription` to the URL query string
    if (getErrorDescription() != null) {
      try {
        joiner.add(String.format("%serrorDescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `errorUri` to the URL query string
    if (getErrorUri() != null) {
      try {
        joiner.add(String.format("%serrorUri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorUri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

