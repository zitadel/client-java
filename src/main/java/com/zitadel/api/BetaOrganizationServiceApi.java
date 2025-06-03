package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaOrganizationServiceAddOrganizationRequest;
import com.zitadel.model.BetaOrganizationServiceAddOrganizationResponse;
import com.zitadel.model.BetaOrganizationServiceConnectError;
import com.zitadel.model.NoOp200Response10;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class BetaOrganizationServiceApi extends BaseApi {

  public BetaOrganizationServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaOrganizationServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * AddOrganization
   * Create a new organization and grant the user(s) permission to manage it
   * @param betaOrganizationServiceAddOrganizationRequest  (required)
   * @return BetaOrganizationServiceAddOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceAddOrganizationResponse addOrganization(BetaOrganizationServiceAddOrganizationRequest betaOrganizationServiceAddOrganizationRequest) throws ApiException {
    return this.addOrganization(betaOrganizationServiceAddOrganizationRequest, Collections.emptyMap());
  }


  /**
   * AddOrganization
   * Create a new organization and grant the user(s) permission to manage it
   * @param betaOrganizationServiceAddOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceAddOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceAddOrganizationResponse addOrganization(BetaOrganizationServiceAddOrganizationRequest betaOrganizationServiceAddOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceAddOrganizationRequest;
    
    if (betaOrganizationServiceAddOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceAddOrganizationRequest' when calling addOrganization");
    }
    
    String localVarPath = "/zitadel.org.v2beta.OrganizationService/AddOrganization";

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

    TypeReference<BetaOrganizationServiceAddOrganizationResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceAddOrganizationResponse>() {};
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
   * Dummy endpoint to retain union-member schemas
   * 
   * @return NoOp200Response10
   * @throws ApiException if fails to make API call
   */
  public NoOp200Response10 noOp() throws ApiException {
    return this.noOp(Collections.emptyMap());
  }


  /**
   * Dummy endpoint to retain union-member schemas
   * 
   * @param additionalHeaders additionalHeaders for this call
   * @return NoOp200Response10
   * @throws ApiException if fails to make API call
   */
  public NoOp200Response10 noOp(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/7c423390";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<NoOp200Response10> localVarReturnType = new TypeReference<NoOp200Response10>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
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
