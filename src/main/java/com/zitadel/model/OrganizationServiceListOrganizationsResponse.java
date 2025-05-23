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
import com.zitadel.model.OrganizationServiceListDetails;
import com.zitadel.model.OrganizationServiceOrganizationFieldName;
import com.zitadel.model.Zitadelorgv2Organization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * OrganizationServiceListOrganizationsResponse
 */
@JsonPropertyOrder({
  OrganizationServiceListOrganizationsResponse.JSON_PROPERTY_DETAILS,
  OrganizationServiceListOrganizationsResponse.JSON_PROPERTY_SORTING_COLUMN,
  OrganizationServiceListOrganizationsResponse.JSON_PROPERTY_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OrganizationServiceListOrganizationsResponse {
  public static final String JSON_PROPERTY_DETAILS = "details";
  @javax.annotation.Nullable
  private OrganizationServiceListDetails details;

  public static final String JSON_PROPERTY_SORTING_COLUMN = "sortingColumn";
  @javax.annotation.Nullable
  private OrganizationServiceOrganizationFieldName sortingColumn = OrganizationServiceOrganizationFieldName.ORGANIZATION_FIELD_NAME_UNSPECIFIED;

  public static final String JSON_PROPERTY_RESULT = "result";
  @javax.annotation.Nullable
  private List<Zitadelorgv2Organization> result = new ArrayList<>();

  public OrganizationServiceListOrganizationsResponse() {
  }

  public OrganizationServiceListOrganizationsResponse details(@javax.annotation.Nullable OrganizationServiceListDetails details) {
    
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

  public OrganizationServiceListDetails getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(@javax.annotation.Nullable OrganizationServiceListDetails details) {
    this.details = details;
  }

  public OrganizationServiceListOrganizationsResponse sortingColumn(@javax.annotation.Nullable OrganizationServiceOrganizationFieldName sortingColumn) {
    
    this.sortingColumn = sortingColumn;
    return this;
  }

  /**
   * Get sortingColumn
   * @return sortingColumn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORTING_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganizationServiceOrganizationFieldName getSortingColumn() {
    return sortingColumn;
  }


  @JsonProperty(JSON_PROPERTY_SORTING_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortingColumn(@javax.annotation.Nullable OrganizationServiceOrganizationFieldName sortingColumn) {
    this.sortingColumn = sortingColumn;
  }

  public OrganizationServiceListOrganizationsResponse result(@javax.annotation.Nullable List<Zitadelorgv2Organization> result) {
    
    this.result = result;
    return this;
  }

  public OrganizationServiceListOrganizationsResponse addResultItem(Zitadelorgv2Organization resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Zitadelorgv2Organization> getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(@javax.annotation.Nullable List<Zitadelorgv2Organization> result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationServiceListOrganizationsResponse organizationServiceListOrganizationsResponse = (OrganizationServiceListOrganizationsResponse) o;
    return Objects.equals(this.details, organizationServiceListOrganizationsResponse.details) &&
        Objects.equals(this.sortingColumn, organizationServiceListOrganizationsResponse.sortingColumn) &&
        Objects.equals(this.result, organizationServiceListOrganizationsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, sortingColumn, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationServiceListOrganizationsResponse {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    sortingColumn: ").append(toIndentedString(sortingColumn)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

    // add `details` to the URL query string
    if (getDetails() != null) {
      joiner.add(getDetails().toUrlQueryString(prefix + "details" + suffix));
    }

    // add `sortingColumn` to the URL query string
    if (getSortingColumn() != null) {
      try {
        joiner.add(String.format("%ssortingColumn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortingColumn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `result` to the URL query string
    if (getResult() != null) {
      for (int i = 0; i < getResult().size(); i++) {
        if (getResult().get(i) != null) {
          joiner.add(getResult().get(i).toUrlQueryString(String.format("%sresult%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

