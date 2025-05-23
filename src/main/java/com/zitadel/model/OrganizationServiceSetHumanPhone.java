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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * OrganizationServiceSetHumanPhone
 */
@JsonPropertyOrder({
  OrganizationServiceSetHumanPhone.JSON_PROPERTY_PHONE,
  OrganizationServiceSetHumanPhone.JSON_PROPERTY_SEND_CODE,
  OrganizationServiceSetHumanPhone.JSON_PROPERTY_RETURN_CODE,
  OrganizationServiceSetHumanPhone.JSON_PROPERTY_IS_VERIFIED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OrganizationServiceSetHumanPhone {
  public static final String JSON_PROPERTY_PHONE = "phone";
  @javax.annotation.Nullable
  private String phone;

  public static final String JSON_PROPERTY_SEND_CODE = "sendCode";
  @javax.annotation.Nullable
  private Object sendCode;

  public static final String JSON_PROPERTY_RETURN_CODE = "returnCode";
  @javax.annotation.Nullable
  private Object returnCode;

  public static final String JSON_PROPERTY_IS_VERIFIED = "isVerified";
  @javax.annotation.Nullable
  private Boolean isVerified;

  public OrganizationServiceSetHumanPhone() {
  }

  public OrganizationServiceSetHumanPhone phone(@javax.annotation.Nullable String phone) {
    
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }

  public OrganizationServiceSetHumanPhone sendCode(@javax.annotation.Nullable Object sendCode) {
    
    this.sendCode = sendCode;
    return this;
  }

  /**
   * Get sendCode
   * @return sendCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSendCode() {
    return sendCode;
  }


  @JsonProperty(JSON_PROPERTY_SEND_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendCode(@javax.annotation.Nullable Object sendCode) {
    this.sendCode = sendCode;
  }

  public OrganizationServiceSetHumanPhone returnCode(@javax.annotation.Nullable Object returnCode) {
    
    this.returnCode = returnCode;
    return this;
  }

  /**
   * Get returnCode
   * @return returnCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getReturnCode() {
    return returnCode;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnCode(@javax.annotation.Nullable Object returnCode) {
    this.returnCode = returnCode;
  }

  public OrganizationServiceSetHumanPhone isVerified(@javax.annotation.Nullable Boolean isVerified) {
    
    this.isVerified = isVerified;
    return this;
  }

  /**
   * Get isVerified
   * @return isVerified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsVerified() {
    return isVerified;
  }


  @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsVerified(@javax.annotation.Nullable Boolean isVerified) {
    this.isVerified = isVerified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationServiceSetHumanPhone organizationServiceSetHumanPhone = (OrganizationServiceSetHumanPhone) o;
    return Objects.equals(this.phone, organizationServiceSetHumanPhone.phone) &&
        Objects.equals(this.sendCode, organizationServiceSetHumanPhone.sendCode) &&
        Objects.equals(this.returnCode, organizationServiceSetHumanPhone.returnCode) &&
        Objects.equals(this.isVerified, organizationServiceSetHumanPhone.isVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, sendCode, returnCode, isVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationServiceSetHumanPhone {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    sendCode: ").append(toIndentedString(sendCode)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
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

    return joiner.toString();
  }

}

