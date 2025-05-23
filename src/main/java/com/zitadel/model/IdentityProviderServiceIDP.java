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
import com.zitadel.model.IdentityProviderServiceDetails;
import com.zitadel.model.IdentityProviderServiceIDPConfig;
import com.zitadel.model.IdentityProviderServiceIDPState;
import com.zitadel.model.IdentityProviderServiceIDPType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * IdentityProviderServiceIDP
 */
@JsonPropertyOrder({
  IdentityProviderServiceIDP.JSON_PROPERTY_ID,
  IdentityProviderServiceIDP.JSON_PROPERTY_DETAILS,
  IdentityProviderServiceIDP.JSON_PROPERTY_STATE,
  IdentityProviderServiceIDP.JSON_PROPERTY_NAME,
  IdentityProviderServiceIDP.JSON_PROPERTY_TYPE,
  IdentityProviderServiceIDP.JSON_PROPERTY_CONFIG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class IdentityProviderServiceIDP {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_DETAILS = "details";
  @javax.annotation.Nullable
  private IdentityProviderServiceDetails details;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private IdentityProviderServiceIDPState state = IdentityProviderServiceIDPState.IDP_STATE_UNSPECIFIED;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private IdentityProviderServiceIDPType type = IdentityProviderServiceIDPType.IDP_TYPE_UNSPECIFIED;

  public static final String JSON_PROPERTY_CONFIG = "config";
  @javax.annotation.Nullable
  private IdentityProviderServiceIDPConfig config;

  public IdentityProviderServiceIDP() {
  }

  public IdentityProviderServiceIDP id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the identity provider.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public IdentityProviderServiceIDP details(@javax.annotation.Nullable IdentityProviderServiceDetails details) {
    
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentityProviderServiceDetails getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(@javax.annotation.Nullable IdentityProviderServiceDetails details) {
    this.details = details;
  }

  public IdentityProviderServiceIDP state(@javax.annotation.Nullable IdentityProviderServiceIDPState state) {
    
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

  public IdentityProviderServiceIDPState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable IdentityProviderServiceIDPState state) {
    this.state = state;
  }

  public IdentityProviderServiceIDP name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public IdentityProviderServiceIDP type(@javax.annotation.Nullable IdentityProviderServiceIDPType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentityProviderServiceIDPType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable IdentityProviderServiceIDPType type) {
    this.type = type;
  }

  public IdentityProviderServiceIDP config(@javax.annotation.Nullable IdentityProviderServiceIDPConfig config) {
    
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentityProviderServiceIDPConfig getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(@javax.annotation.Nullable IdentityProviderServiceIDPConfig config) {
    this.config = config;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProviderServiceIDP identityProviderServiceIDP = (IdentityProviderServiceIDP) o;
    return Objects.equals(this.id, identityProviderServiceIDP.id) &&
        Objects.equals(this.details, identityProviderServiceIDP.details) &&
        Objects.equals(this.state, identityProviderServiceIDP.state) &&
        Objects.equals(this.name, identityProviderServiceIDP.name) &&
        Objects.equals(this.type, identityProviderServiceIDP.type) &&
        Objects.equals(this.config, identityProviderServiceIDP.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, details, state, name, type, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProviderServiceIDP {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      joiner.add(getDetails().toUrlQueryString(prefix + "details" + suffix));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `config` to the URL query string
    if (getConfig() != null) {
      joiner.add(getConfig().toUrlQueryString(prefix + "config" + suffix));
    }

    return joiner.toString();
  }

}

