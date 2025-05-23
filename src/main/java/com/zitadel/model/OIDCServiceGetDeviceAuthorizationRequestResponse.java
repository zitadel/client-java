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
import com.zitadel.model.OIDCServiceDeviceAuthorizationRequest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * OIDCServiceGetDeviceAuthorizationRequestResponse
 */
@JsonPropertyOrder({
  OIDCServiceGetDeviceAuthorizationRequestResponse.JSON_PROPERTY_DEVICE_AUTHORIZATION_REQUEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OIDCServiceGetDeviceAuthorizationRequestResponse {
  public static final String JSON_PROPERTY_DEVICE_AUTHORIZATION_REQUEST = "deviceAuthorizationRequest";
  @javax.annotation.Nullable
  private OIDCServiceDeviceAuthorizationRequest deviceAuthorizationRequest;

  public OIDCServiceGetDeviceAuthorizationRequestResponse() {
  }

  public OIDCServiceGetDeviceAuthorizationRequestResponse deviceAuthorizationRequest(@javax.annotation.Nullable OIDCServiceDeviceAuthorizationRequest deviceAuthorizationRequest) {
    
    this.deviceAuthorizationRequest = deviceAuthorizationRequest;
    return this;
  }

  /**
   * Get deviceAuthorizationRequest
   * @return deviceAuthorizationRequest
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_AUTHORIZATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OIDCServiceDeviceAuthorizationRequest getDeviceAuthorizationRequest() {
    return deviceAuthorizationRequest;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_AUTHORIZATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceAuthorizationRequest(@javax.annotation.Nullable OIDCServiceDeviceAuthorizationRequest deviceAuthorizationRequest) {
    this.deviceAuthorizationRequest = deviceAuthorizationRequest;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OIDCServiceGetDeviceAuthorizationRequestResponse oiDCServiceGetDeviceAuthorizationRequestResponse = (OIDCServiceGetDeviceAuthorizationRequestResponse) o;
    return Objects.equals(this.deviceAuthorizationRequest, oiDCServiceGetDeviceAuthorizationRequestResponse.deviceAuthorizationRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAuthorizationRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCServiceGetDeviceAuthorizationRequestResponse {\n");
    sb.append("    deviceAuthorizationRequest: ").append(toIndentedString(deviceAuthorizationRequest)).append("\n");
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

    // add `deviceAuthorizationRequest` to the URL query string
    if (getDeviceAuthorizationRequest() != null) {
      joiner.add(getDeviceAuthorizationRequest().toUrlQueryString(prefix + "deviceAuthorizationRequest" + suffix));
    }

    return joiner.toString();
  }

}

