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
 * IdentityProviderServiceJWTConfig
 */
@JsonPropertyOrder({
  IdentityProviderServiceJWTConfig.JSON_PROPERTY_JWT_ENDPOINT,
  IdentityProviderServiceJWTConfig.JSON_PROPERTY_ISSUER,
  IdentityProviderServiceJWTConfig.JSON_PROPERTY_KEYS_ENDPOINT,
  IdentityProviderServiceJWTConfig.JSON_PROPERTY_HEADER_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class IdentityProviderServiceJWTConfig {
  public static final String JSON_PROPERTY_JWT_ENDPOINT = "jwtEndpoint";
  @javax.annotation.Nullable
  private String jwtEndpoint;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  @javax.annotation.Nullable
  private String issuer;

  public static final String JSON_PROPERTY_KEYS_ENDPOINT = "keysEndpoint";
  @javax.annotation.Nullable
  private String keysEndpoint;

  public static final String JSON_PROPERTY_HEADER_NAME = "headerName";
  @javax.annotation.Nullable
  private String headerName;

  public IdentityProviderServiceJWTConfig() {
  }

  public IdentityProviderServiceJWTConfig jwtEndpoint(@javax.annotation.Nullable String jwtEndpoint) {
    
    this.jwtEndpoint = jwtEndpoint;
    return this;
  }

  /**
   * The endpoint where the JWT can be extracted.
   * @return jwtEndpoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JWT_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJwtEndpoint() {
    return jwtEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_JWT_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJwtEndpoint(@javax.annotation.Nullable String jwtEndpoint) {
    this.jwtEndpoint = jwtEndpoint;
  }

  public IdentityProviderServiceJWTConfig issuer(@javax.annotation.Nullable String issuer) {
    
    this.issuer = issuer;
    return this;
  }

  /**
   * The issuer of the JWT (for validation).
   * @return issuer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
  }

  public IdentityProviderServiceJWTConfig keysEndpoint(@javax.annotation.Nullable String keysEndpoint) {
    
    this.keysEndpoint = keysEndpoint;
    return this;
  }

  /**
   * The endpoint to the key (JWK) which is used to sign the JWT with.
   * @return keysEndpoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYS_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeysEndpoint() {
    return keysEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_KEYS_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeysEndpoint(@javax.annotation.Nullable String keysEndpoint) {
    this.keysEndpoint = keysEndpoint;
  }

  public IdentityProviderServiceJWTConfig headerName(@javax.annotation.Nullable String headerName) {
    
    this.headerName = headerName;
    return this;
  }

  /**
   * The name of the header where the JWT is sent in, default is authorization.
   * @return headerName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeaderName() {
    return headerName;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaderName(@javax.annotation.Nullable String headerName) {
    this.headerName = headerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProviderServiceJWTConfig identityProviderServiceJWTConfig = (IdentityProviderServiceJWTConfig) o;
    return Objects.equals(this.jwtEndpoint, identityProviderServiceJWTConfig.jwtEndpoint) &&
        Objects.equals(this.issuer, identityProviderServiceJWTConfig.issuer) &&
        Objects.equals(this.keysEndpoint, identityProviderServiceJWTConfig.keysEndpoint) &&
        Objects.equals(this.headerName, identityProviderServiceJWTConfig.headerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwtEndpoint, issuer, keysEndpoint, headerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProviderServiceJWTConfig {\n");
    sb.append("    jwtEndpoint: ").append(toIndentedString(jwtEndpoint)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    keysEndpoint: ").append(toIndentedString(keysEndpoint)).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
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

    // add `jwtEndpoint` to the URL query string
    if (getJwtEndpoint() != null) {
      try {
        joiner.add(String.format("%sjwtEndpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJwtEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `issuer` to the URL query string
    if (getIssuer() != null) {
      try {
        joiner.add(String.format("%sissuer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuer()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `keysEndpoint` to the URL query string
    if (getKeysEndpoint() != null) {
      try {
        joiner.add(String.format("%skeysEndpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeysEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `headerName` to the URL query string
    if (getHeaderName() != null) {
      try {
        joiner.add(String.format("%sheaderName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeaderName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

