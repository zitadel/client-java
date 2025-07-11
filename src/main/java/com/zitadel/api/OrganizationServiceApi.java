package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Pair;

import com.zitadel.model.OrganizationServiceAddOrganizationRequest;
import com.zitadel.model.OrganizationServiceAddOrganizationResponse;
import com.zitadel.model.OrganizationServiceListOrganizationsRequest;
import com.zitadel.model.OrganizationServiceListOrganizationsResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class OrganizationServiceApi extends BaseApi {

  public OrganizationServiceApi() {
      super(ApiClient.defaultApiClient);
  }

  public OrganizationServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * AddOrganization
   * Create an Organization   Create a new organization with an administrative user. If no specific roles are sent for the users, they will be granted the role ORG_OWNER.
   * @param organizationServiceAddOrganizationRequest  (required)
   * @return OrganizationServiceAddOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceAddOrganizationResponse addOrganization(OrganizationServiceAddOrganizationRequest organizationServiceAddOrganizationRequest) throws ApiException {
    return this.addOrganization(organizationServiceAddOrganizationRequest, Collections.emptyMap());
  }


  /**
   * AddOrganization
   * Create an Organization   Create a new organization with an administrative user. If no specific roles are sent for the users, they will be granted the role ORG_OWNER.
   * @param organizationServiceAddOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceAddOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceAddOrganizationResponse addOrganization(OrganizationServiceAddOrganizationRequest organizationServiceAddOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceAddOrganizationRequest;

    if (organizationServiceAddOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceAddOrganizationRequest' when calling addOrganization");
    }

    String localVarPath = "/zitadel.org.v2.OrganizationService/AddOrganization";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    localVarHeaderParams.putAll(additionalHeaders);



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<OrganizationServiceAddOrganizationResponse> localVarReturnType = new TypeReference<OrganizationServiceAddOrganizationResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }




  /**
   * ListOrganizations
   * Search Organizations   Search for Organizations. By default, we will return all organization of the instance. Make sure to include a limit and sorting for pagination..
   * @param organizationServiceListOrganizationsRequest  (required)
   * @return OrganizationServiceListOrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceListOrganizationsResponse listOrganizations(OrganizationServiceListOrganizationsRequest organizationServiceListOrganizationsRequest) throws ApiException {
    return this.listOrganizations(organizationServiceListOrganizationsRequest, Collections.emptyMap());
  }


  /**
   * ListOrganizations
   * Search Organizations   Search for Organizations. By default, we will return all organization of the instance. Make sure to include a limit and sorting for pagination..
   * @param organizationServiceListOrganizationsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceListOrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceListOrganizationsResponse listOrganizations(OrganizationServiceListOrganizationsRequest organizationServiceListOrganizationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceListOrganizationsRequest;

    if (organizationServiceListOrganizationsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceListOrganizationsRequest' when calling listOrganizations");
    }

    String localVarPath = "/zitadel.org.v2.OrganizationService/ListOrganizations";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    localVarHeaderParams.putAll(additionalHeaders);



    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<OrganizationServiceListOrganizationsResponse> localVarReturnType = new TypeReference<OrganizationServiceListOrganizationsResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
