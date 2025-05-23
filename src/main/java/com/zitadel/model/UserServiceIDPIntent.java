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
 * UserServiceIDPIntent
 */
@JsonPropertyOrder({
  UserServiceIDPIntent.JSON_PROPERTY_IDP_INTENT_ID,
  UserServiceIDPIntent.JSON_PROPERTY_IDP_INTENT_TOKEN,
  UserServiceIDPIntent.JSON_PROPERTY_USER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UserServiceIDPIntent {
  public static final String JSON_PROPERTY_IDP_INTENT_ID = "idpIntentId";
  @javax.annotation.Nullable
  private String idpIntentId;

  public static final String JSON_PROPERTY_IDP_INTENT_TOKEN = "idpIntentToken";
  @javax.annotation.Nullable
  private String idpIntentToken;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable
  private String userId;

  public UserServiceIDPIntent() {
  }

  public UserServiceIDPIntent idpIntentId(@javax.annotation.Nullable String idpIntentId) {
    
    this.idpIntentId = idpIntentId;
    return this;
  }

  /**
   * ID of the IDP intent
   * @return idpIntentId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDP_INTENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdpIntentId() {
    return idpIntentId;
  }


  @JsonProperty(JSON_PROPERTY_IDP_INTENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpIntentId(@javax.annotation.Nullable String idpIntentId) {
    this.idpIntentId = idpIntentId;
  }

  public UserServiceIDPIntent idpIntentToken(@javax.annotation.Nullable String idpIntentToken) {
    
    this.idpIntentToken = idpIntentToken;
    return this;
  }

  /**
   * token of the IDP intent
   * @return idpIntentToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDP_INTENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdpIntentToken() {
    return idpIntentToken;
  }


  @JsonProperty(JSON_PROPERTY_IDP_INTENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpIntentToken(@javax.annotation.Nullable String idpIntentToken) {
    this.idpIntentToken = idpIntentToken;
  }

  public UserServiceIDPIntent userId(@javax.annotation.Nullable String userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * ID of the ZITADEL user if external user already linked
   * @return userId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserServiceIDPIntent userServiceIDPIntent = (UserServiceIDPIntent) o;
    return Objects.equals(this.idpIntentId, userServiceIDPIntent.idpIntentId) &&
        Objects.equals(this.idpIntentToken, userServiceIDPIntent.idpIntentToken) &&
        Objects.equals(this.userId, userServiceIDPIntent.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpIntentId, idpIntentToken, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserServiceIDPIntent {\n");
    sb.append("    idpIntentId: ").append(toIndentedString(idpIntentId)).append("\n");
    sb.append("    idpIntentToken: ").append(toIndentedString(idpIntentToken)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

    // add `idpIntentId` to the URL query string
    if (getIdpIntentId() != null) {
      try {
        joiner.add(String.format("%sidpIntentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdpIntentId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `idpIntentToken` to the URL query string
    if (getIdpIntentToken() != null) {
      try {
        joiner.add(String.format("%sidpIntentToken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdpIntentToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      try {
        joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

