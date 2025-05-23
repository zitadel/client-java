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
 * UserServiceSendInviteCode
 */
@JsonPropertyOrder({
  UserServiceSendInviteCode.JSON_PROPERTY_URL_TEMPLATE,
  UserServiceSendInviteCode.JSON_PROPERTY_APPLICATION_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UserServiceSendInviteCode {
  public static final String JSON_PROPERTY_URL_TEMPLATE = "urlTemplate";
  @javax.annotation.Nullable
  private String urlTemplate;

  public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
  @javax.annotation.Nullable
  private String applicationName;

  public UserServiceSendInviteCode() {
  }

  public UserServiceSendInviteCode urlTemplate(@javax.annotation.Nullable String urlTemplate) {
    
    this.urlTemplate = urlTemplate;
    return this;
  }

  /**
   * Optionally set a url_template, which will be used in the invite mail sent by ZITADEL to guide the user to your invitation page. If no template is set, the default ZITADEL url will be used.  The following placeholders can be used: UserID, OrgID, Code
   * @return urlTemplate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlTemplate() {
    return urlTemplate;
  }


  @JsonProperty(JSON_PROPERTY_URL_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlTemplate(@javax.annotation.Nullable String urlTemplate) {
    this.urlTemplate = urlTemplate;
  }

  public UserServiceSendInviteCode applicationName(@javax.annotation.Nullable String applicationName) {
    
    this.applicationName = applicationName;
    return this;
  }

  /**
   * Optionally set an application name, which will be used in the invite mail sent by ZITADEL. If no application name is set, ZITADEL will be used as default.
   * @return applicationName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplicationName() {
    return applicationName;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationName(@javax.annotation.Nullable String applicationName) {
    this.applicationName = applicationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserServiceSendInviteCode userServiceSendInviteCode = (UserServiceSendInviteCode) o;
    return Objects.equals(this.urlTemplate, userServiceSendInviteCode.urlTemplate) &&
        Objects.equals(this.applicationName, userServiceSendInviteCode.applicationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlTemplate, applicationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserServiceSendInviteCode {\n");
    sb.append("    urlTemplate: ").append(toIndentedString(urlTemplate)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
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

    // add `urlTemplate` to the URL query string
    if (getUrlTemplate() != null) {
      try {
        joiner.add(String.format("%surlTemplate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrlTemplate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `applicationName` to the URL query string
    if (getApplicationName() != null) {
      try {
        joiner.add(String.format("%sapplicationName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApplicationName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

