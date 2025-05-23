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
import com.zitadel.model.OrganizationServiceAddHumanUserRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * OrganizationServiceAddOrganizationRequestAdmin
 */
@JsonPropertyOrder({
  OrganizationServiceAddOrganizationRequestAdmin.JSON_PROPERTY_USER_ID,
  OrganizationServiceAddOrganizationRequestAdmin.JSON_PROPERTY_HUMAN,
  OrganizationServiceAddOrganizationRequestAdmin.JSON_PROPERTY_ROLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OrganizationServiceAddOrganizationRequestAdmin {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable
  private String userId;

  public static final String JSON_PROPERTY_HUMAN = "human";
  @javax.annotation.Nullable
  private OrganizationServiceAddHumanUserRequest human;

  public static final String JSON_PROPERTY_ROLES = "roles";
  @javax.annotation.Nullable
  private List<String> roles = new ArrayList<>();

  public OrganizationServiceAddOrganizationRequestAdmin() {
  }

  public OrganizationServiceAddOrganizationRequestAdmin userId(@javax.annotation.Nullable String userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
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

  public OrganizationServiceAddOrganizationRequestAdmin human(@javax.annotation.Nullable OrganizationServiceAddHumanUserRequest human) {
    
    this.human = human;
    return this;
  }

  /**
   * Get human
   * @return human
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HUMAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganizationServiceAddHumanUserRequest getHuman() {
    return human;
  }


  @JsonProperty(JSON_PROPERTY_HUMAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHuman(@javax.annotation.Nullable OrganizationServiceAddHumanUserRequest human) {
    this.human = human;
  }

  public OrganizationServiceAddOrganizationRequestAdmin roles(@javax.annotation.Nullable List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public OrganizationServiceAddOrganizationRequestAdmin addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(@javax.annotation.Nullable List<String> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationServiceAddOrganizationRequestAdmin organizationServiceAddOrganizationRequestAdmin = (OrganizationServiceAddOrganizationRequestAdmin) o;
    return Objects.equals(this.userId, organizationServiceAddOrganizationRequestAdmin.userId) &&
        Objects.equals(this.human, organizationServiceAddOrganizationRequestAdmin.human) &&
        Objects.equals(this.roles, organizationServiceAddOrganizationRequestAdmin.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, human, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationServiceAddOrganizationRequestAdmin {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    human: ").append(toIndentedString(human)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

