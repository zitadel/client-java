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
import com.zitadel.model.UserServiceAuthFactorState;
import com.zitadel.model.UserServiceAuthFactorU2F;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * UserServiceAuthFactor
 */
@JsonPropertyOrder({
  UserServiceAuthFactor.JSON_PROPERTY_STATE,
  UserServiceAuthFactor.JSON_PROPERTY_OTP,
  UserServiceAuthFactor.JSON_PROPERTY_U2F,
  UserServiceAuthFactor.JSON_PROPERTY_OTP_SMS,
  UserServiceAuthFactor.JSON_PROPERTY_OTP_EMAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UserServiceAuthFactor {
  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private UserServiceAuthFactorState state = UserServiceAuthFactorState.AUTH_FACTOR_STATE_UNSPECIFIED;

  public static final String JSON_PROPERTY_OTP = "otp";
  @javax.annotation.Nullable
  private Object otp;

  public static final String JSON_PROPERTY_U2F = "u2f";
  @javax.annotation.Nullable
  private UserServiceAuthFactorU2F u2f;

  public static final String JSON_PROPERTY_OTP_SMS = "otpSms";
  @javax.annotation.Nullable
  private Object otpSms;

  public static final String JSON_PROPERTY_OTP_EMAIL = "otpEmail";
  @javax.annotation.Nullable
  private Object otpEmail;

  public UserServiceAuthFactor() {
  }

  public UserServiceAuthFactor state(@javax.annotation.Nullable UserServiceAuthFactorState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserServiceAuthFactorState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable UserServiceAuthFactorState state) {
    this.state = state;
  }

  public UserServiceAuthFactor otp(@javax.annotation.Nullable Object otp) {
    
    this.otp = otp;
    return this;
  }

  /**
   * Get otp
   * @return otp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getOtp() {
    return otp;
  }


  @JsonProperty(JSON_PROPERTY_OTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtp(@javax.annotation.Nullable Object otp) {
    this.otp = otp;
  }

  public UserServiceAuthFactor u2f(@javax.annotation.Nullable UserServiceAuthFactorU2F u2f) {
    
    this.u2f = u2f;
    return this;
  }

  /**
   * Get u2f
   * @return u2f
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_U2F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserServiceAuthFactorU2F getU2f() {
    return u2f;
  }


  @JsonProperty(JSON_PROPERTY_U2F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setU2f(@javax.annotation.Nullable UserServiceAuthFactorU2F u2f) {
    this.u2f = u2f;
  }

  public UserServiceAuthFactor otpSms(@javax.annotation.Nullable Object otpSms) {
    
    this.otpSms = otpSms;
    return this;
  }

  /**
   * Get otpSms
   * @return otpSms
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTP_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getOtpSms() {
    return otpSms;
  }


  @JsonProperty(JSON_PROPERTY_OTP_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtpSms(@javax.annotation.Nullable Object otpSms) {
    this.otpSms = otpSms;
  }

  public UserServiceAuthFactor otpEmail(@javax.annotation.Nullable Object otpEmail) {
    
    this.otpEmail = otpEmail;
    return this;
  }

  /**
   * Get otpEmail
   * @return otpEmail
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTP_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getOtpEmail() {
    return otpEmail;
  }


  @JsonProperty(JSON_PROPERTY_OTP_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtpEmail(@javax.annotation.Nullable Object otpEmail) {
    this.otpEmail = otpEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserServiceAuthFactor userServiceAuthFactor = (UserServiceAuthFactor) o;
    return Objects.equals(this.state, userServiceAuthFactor.state) &&
        Objects.equals(this.otp, userServiceAuthFactor.otp) &&
        Objects.equals(this.u2f, userServiceAuthFactor.u2f) &&
        Objects.equals(this.otpSms, userServiceAuthFactor.otpSms) &&
        Objects.equals(this.otpEmail, userServiceAuthFactor.otpEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, otp, u2f, otpSms, otpEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserServiceAuthFactor {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    u2f: ").append(toIndentedString(u2f)).append("\n");
    sb.append("    otpSms: ").append(toIndentedString(otpSms)).append("\n");
    sb.append("    otpEmail: ").append(toIndentedString(otpEmail)).append("\n");
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

