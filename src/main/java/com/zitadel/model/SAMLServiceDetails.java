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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SAMLServiceDetails
 */
@JsonPropertyOrder({
  SAMLServiceDetails.JSON_PROPERTY_SEQUENCE,
  SAMLServiceDetails.JSON_PROPERTY_CHANGE_DATE,
  SAMLServiceDetails.JSON_PROPERTY_RESOURCE_OWNER,
  SAMLServiceDetails.JSON_PROPERTY_CREATION_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SAMLServiceDetails {
  public static final String JSON_PROPERTY_SEQUENCE = "sequence";
  @javax.annotation.Nullable
  private String sequence;

  public static final String JSON_PROPERTY_CHANGE_DATE = "changeDate";
  @javax.annotation.Nullable
  private OffsetDateTime changeDate;

  public static final String JSON_PROPERTY_RESOURCE_OWNER = "resourceOwner";
  @javax.annotation.Nullable
  private String resourceOwner;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  @javax.annotation.Nullable
  private OffsetDateTime creationDate;

  public SAMLServiceDetails() {
  }

  public SAMLServiceDetails sequence(@javax.annotation.Nullable String sequence) {
    
    this.sequence = sequence;
    return this;
  }

  /**
   * on read: the sequence of the last event reduced by the projection  on manipulation: the timestamp of the event(s) added by the manipulation
   * @return sequence
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSequence() {
    return sequence;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSequence(@javax.annotation.Nullable String sequence) {
    this.sequence = sequence;
  }

  public SAMLServiceDetails changeDate(@javax.annotation.Nullable OffsetDateTime changeDate) {
    
    this.changeDate = changeDate;
    return this;
  }

  /**
   * on read: the timestamp of the last event reduced by the projection  on manipulation: the timestamp of the event(s) added by the manipulation
   * @return changeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getChangeDate() {
    return changeDate;
  }


  @JsonProperty(JSON_PROPERTY_CHANGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeDate(@javax.annotation.Nullable OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public SAMLServiceDetails resourceOwner(@javax.annotation.Nullable String resourceOwner) {
    
    this.resourceOwner = resourceOwner;
    return this;
  }

  /**
   * Get resourceOwner
   * @return resourceOwner
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceOwner() {
    return resourceOwner;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceOwner(@javax.annotation.Nullable String resourceOwner) {
    this.resourceOwner = resourceOwner;
  }

  public SAMLServiceDetails creationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(@javax.annotation.Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLServiceDetails saMLServiceDetails = (SAMLServiceDetails) o;
    return Objects.equals(this.sequence, saMLServiceDetails.sequence) &&
        Objects.equals(this.changeDate, saMLServiceDetails.changeDate) &&
        Objects.equals(this.resourceOwner, saMLServiceDetails.resourceOwner) &&
        Objects.equals(this.creationDate, saMLServiceDetails.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, changeDate, resourceOwner, creationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLServiceDetails {\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    resourceOwner: ").append(toIndentedString(resourceOwner)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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

    // add `sequence` to the URL query string
    if (getSequence() != null) {
      try {
        joiner.add(String.format("%ssequence%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSequence()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `changeDate` to the URL query string
    if (getChangeDate() != null) {
      try {
        joiner.add(String.format("%schangeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChangeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resourceOwner` to the URL query string
    if (getResourceOwner() != null) {
      try {
        joiner.add(String.format("%sresourceOwner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResourceOwner()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `creationDate` to the URL query string
    if (getCreationDate() != null) {
      try {
        joiner.add(String.format("%screationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreationDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

