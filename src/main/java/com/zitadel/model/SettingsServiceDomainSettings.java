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
import com.zitadel.model.SettingsServiceResourceOwnerType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SettingsServiceDomainSettings
 */
@JsonPropertyOrder({
  SettingsServiceDomainSettings.JSON_PROPERTY_LOGIN_NAME_INCLUDES_DOMAIN,
  SettingsServiceDomainSettings.JSON_PROPERTY_REQUIRE_ORG_DOMAIN_VERIFICATION,
  SettingsServiceDomainSettings.JSON_PROPERTY_SMTP_SENDER_ADDRESS_MATCHES_INSTANCE_DOMAIN,
  SettingsServiceDomainSettings.JSON_PROPERTY_RESOURCE_OWNER_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SettingsServiceDomainSettings {
  public static final String JSON_PROPERTY_LOGIN_NAME_INCLUDES_DOMAIN = "loginNameIncludesDomain";
  @javax.annotation.Nullable
  private Boolean loginNameIncludesDomain;

  public static final String JSON_PROPERTY_REQUIRE_ORG_DOMAIN_VERIFICATION = "requireOrgDomainVerification";
  @javax.annotation.Nullable
  private Boolean requireOrgDomainVerification;

  public static final String JSON_PROPERTY_SMTP_SENDER_ADDRESS_MATCHES_INSTANCE_DOMAIN = "smtpSenderAddressMatchesInstanceDomain";
  @javax.annotation.Nullable
  private Boolean smtpSenderAddressMatchesInstanceDomain;

  public static final String JSON_PROPERTY_RESOURCE_OWNER_TYPE = "resourceOwnerType";
  @javax.annotation.Nullable
  private SettingsServiceResourceOwnerType resourceOwnerType = SettingsServiceResourceOwnerType.RESOURCE_OWNER_TYPE_UNSPECIFIED;

  public SettingsServiceDomainSettings() {
  }

  public SettingsServiceDomainSettings loginNameIncludesDomain(@javax.annotation.Nullable Boolean loginNameIncludesDomain) {
    
    this.loginNameIncludesDomain = loginNameIncludesDomain;
    return this;
  }

  /**
   * the username has to end with the domain of its organization
   * @return loginNameIncludesDomain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_NAME_INCLUDES_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLoginNameIncludesDomain() {
    return loginNameIncludesDomain;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_NAME_INCLUDES_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginNameIncludesDomain(@javax.annotation.Nullable Boolean loginNameIncludesDomain) {
    this.loginNameIncludesDomain = loginNameIncludesDomain;
  }

  public SettingsServiceDomainSettings requireOrgDomainVerification(@javax.annotation.Nullable Boolean requireOrgDomainVerification) {
    
    this.requireOrgDomainVerification = requireOrgDomainVerification;
    return this;
  }

  /**
   * defines if organization domains should be verified upon creation, otherwise will be created already verified
   * @return requireOrgDomainVerification
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_ORG_DOMAIN_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequireOrgDomainVerification() {
    return requireOrgDomainVerification;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_ORG_DOMAIN_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequireOrgDomainVerification(@javax.annotation.Nullable Boolean requireOrgDomainVerification) {
    this.requireOrgDomainVerification = requireOrgDomainVerification;
  }

  public SettingsServiceDomainSettings smtpSenderAddressMatchesInstanceDomain(@javax.annotation.Nullable Boolean smtpSenderAddressMatchesInstanceDomain) {
    
    this.smtpSenderAddressMatchesInstanceDomain = smtpSenderAddressMatchesInstanceDomain;
    return this;
  }

  /**
   * defines if the SMTP sender address domain should match an existing domain on the instance
   * @return smtpSenderAddressMatchesInstanceDomain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMTP_SENDER_ADDRESS_MATCHES_INSTANCE_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSmtpSenderAddressMatchesInstanceDomain() {
    return smtpSenderAddressMatchesInstanceDomain;
  }


  @JsonProperty(JSON_PROPERTY_SMTP_SENDER_ADDRESS_MATCHES_INSTANCE_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmtpSenderAddressMatchesInstanceDomain(@javax.annotation.Nullable Boolean smtpSenderAddressMatchesInstanceDomain) {
    this.smtpSenderAddressMatchesInstanceDomain = smtpSenderAddressMatchesInstanceDomain;
  }

  public SettingsServiceDomainSettings resourceOwnerType(@javax.annotation.Nullable SettingsServiceResourceOwnerType resourceOwnerType) {
    
    this.resourceOwnerType = resourceOwnerType;
    return this;
  }

  /**
   * Get resourceOwnerType
   * @return resourceOwnerType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_OWNER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SettingsServiceResourceOwnerType getResourceOwnerType() {
    return resourceOwnerType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_OWNER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceOwnerType(@javax.annotation.Nullable SettingsServiceResourceOwnerType resourceOwnerType) {
    this.resourceOwnerType = resourceOwnerType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsServiceDomainSettings settingsServiceDomainSettings = (SettingsServiceDomainSettings) o;
    return Objects.equals(this.loginNameIncludesDomain, settingsServiceDomainSettings.loginNameIncludesDomain) &&
        Objects.equals(this.requireOrgDomainVerification, settingsServiceDomainSettings.requireOrgDomainVerification) &&
        Objects.equals(this.smtpSenderAddressMatchesInstanceDomain, settingsServiceDomainSettings.smtpSenderAddressMatchesInstanceDomain) &&
        Objects.equals(this.resourceOwnerType, settingsServiceDomainSettings.resourceOwnerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginNameIncludesDomain, requireOrgDomainVerification, smtpSenderAddressMatchesInstanceDomain, resourceOwnerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsServiceDomainSettings {\n");
    sb.append("    loginNameIncludesDomain: ").append(toIndentedString(loginNameIncludesDomain)).append("\n");
    sb.append("    requireOrgDomainVerification: ").append(toIndentedString(requireOrgDomainVerification)).append("\n");
    sb.append("    smtpSenderAddressMatchesInstanceDomain: ").append(toIndentedString(smtpSenderAddressMatchesInstanceDomain)).append("\n");
    sb.append("    resourceOwnerType: ").append(toIndentedString(resourceOwnerType)).append("\n");
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

    // add `loginNameIncludesDomain` to the URL query string
    if (getLoginNameIncludesDomain() != null) {
      try {
        joiner.add(String.format("%sloginNameIncludesDomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoginNameIncludesDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requireOrgDomainVerification` to the URL query string
    if (getRequireOrgDomainVerification() != null) {
      try {
        joiner.add(String.format("%srequireOrgDomainVerification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequireOrgDomainVerification()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `smtpSenderAddressMatchesInstanceDomain` to the URL query string
    if (getSmtpSenderAddressMatchesInstanceDomain() != null) {
      try {
        joiner.add(String.format("%ssmtpSenderAddressMatchesInstanceDomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmtpSenderAddressMatchesInstanceDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resourceOwnerType` to the URL query string
    if (getResourceOwnerType() != null) {
      try {
        joiner.add(String.format("%sresourceOwnerType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResourceOwnerType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

