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
import com.zitadel.model.SettingsServiceEmbeddedIframeSettings;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SettingsServiceSetSecuritySettingsRequest
 */
@JsonPropertyOrder({
  SettingsServiceSetSecuritySettingsRequest.JSON_PROPERTY_EMBEDDED_IFRAME,
  SettingsServiceSetSecuritySettingsRequest.JSON_PROPERTY_ENABLE_IMPERSONATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SettingsServiceSetSecuritySettingsRequest {
  public static final String JSON_PROPERTY_EMBEDDED_IFRAME = "embeddedIframe";
  @javax.annotation.Nullable
  private SettingsServiceEmbeddedIframeSettings embeddedIframe;

  public static final String JSON_PROPERTY_ENABLE_IMPERSONATION = "enableImpersonation";
  @javax.annotation.Nullable
  private Boolean enableImpersonation;

  public SettingsServiceSetSecuritySettingsRequest() {
  }

  public SettingsServiceSetSecuritySettingsRequest embeddedIframe(@javax.annotation.Nullable SettingsServiceEmbeddedIframeSettings embeddedIframe) {
    
    this.embeddedIframe = embeddedIframe;
    return this;
  }

  /**
   * Get embeddedIframe
   * @return embeddedIframe
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBEDDED_IFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SettingsServiceEmbeddedIframeSettings getEmbeddedIframe() {
    return embeddedIframe;
  }


  @JsonProperty(JSON_PROPERTY_EMBEDDED_IFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmbeddedIframe(@javax.annotation.Nullable SettingsServiceEmbeddedIframeSettings embeddedIframe) {
    this.embeddedIframe = embeddedIframe;
  }

  public SettingsServiceSetSecuritySettingsRequest enableImpersonation(@javax.annotation.Nullable Boolean enableImpersonation) {
    
    this.enableImpersonation = enableImpersonation;
    return this;
  }

  /**
   * allows users to impersonate other users. The impersonator needs the appropriate &#x60;*_IMPERSONATOR&#x60; roles assigned as well
   * @return enableImpersonation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_IMPERSONATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableImpersonation() {
    return enableImpersonation;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_IMPERSONATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableImpersonation(@javax.annotation.Nullable Boolean enableImpersonation) {
    this.enableImpersonation = enableImpersonation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsServiceSetSecuritySettingsRequest settingsServiceSetSecuritySettingsRequest = (SettingsServiceSetSecuritySettingsRequest) o;
    return Objects.equals(this.embeddedIframe, settingsServiceSetSecuritySettingsRequest.embeddedIframe) &&
        Objects.equals(this.enableImpersonation, settingsServiceSetSecuritySettingsRequest.enableImpersonation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedIframe, enableImpersonation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsServiceSetSecuritySettingsRequest {\n");
    sb.append("    embeddedIframe: ").append(toIndentedString(embeddedIframe)).append("\n");
    sb.append("    enableImpersonation: ").append(toIndentedString(enableImpersonation)).append("\n");
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

    // add `embeddedIframe` to the URL query string
    if (getEmbeddedIframe() != null) {
      joiner.add(getEmbeddedIframe().toUrlQueryString(prefix + "embeddedIframe" + suffix));
    }

    // add `enableImpersonation` to the URL query string
    if (getEnableImpersonation() != null) {
      try {
        joiner.add(String.format("%senableImpersonation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnableImpersonation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

