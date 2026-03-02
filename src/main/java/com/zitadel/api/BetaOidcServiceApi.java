package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaOIDCServiceConnectError;
import com.zitadel.model.BetaOIDCServiceCreateCallbackRequest;
import com.zitadel.model.BetaOIDCServiceCreateCallbackResponse;
import com.zitadel.model.BetaOIDCServiceGetAuthRequestRequest;
import com.zitadel.model.BetaOIDCServiceGetAuthRequestResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class BetaOidcServiceApi extends BaseApi {

  public BetaOidcServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaOidcServiceApi(ApiClient apiClient) {
    super(apiClient);
  }



              /**
              * Create Callback (Convenience Method)
              * Deprecated: please move to the corresponding endpoint under oidc service v2. This endpoint will be removed with the next major version of ZITADEL.   Finalize an Auth Request and get the callback URL for success or failure.  The user must be redirected to the URL in order to inform the application about the success or failure.  On success, the URL contains details for the application to obtain the tokens.  This method can only be called once for an Auth request.
                * @return BetaOIDCServiceCreateCallbackResponse
              * @throws ApiException if fails to make API call
              */
              public BetaOIDCServiceCreateCallbackResponse createCallback() throws ApiException {
              return this.createCallback(new BetaOIDCServiceCreateCallbackRequest());
              }


  /**
   * Create Callback
   * Deprecated: please move to the corresponding endpoint under oidc service v2. This endpoint will be removed with the next major version of ZITADEL.   Finalize an Auth Request and get the callback URL for success or failure.  The user must be redirected to the URL in order to inform the application about the success or failure.  On success, the URL contains details for the application to obtain the tokens.  This method can only be called once for an Auth request.
   * @param betaOIDCServiceCreateCallbackRequest  (required)
   * @return BetaOIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOIDCServiceCreateCallbackResponse createCallback(BetaOIDCServiceCreateCallbackRequest betaOIDCServiceCreateCallbackRequest) throws ApiException {
    return this.createCallback(betaOIDCServiceCreateCallbackRequest, Collections.emptyMap());
  }


  /**
   * Create Callback
   * Deprecated: please move to the corresponding endpoint under oidc service v2. This endpoint will be removed with the next major version of ZITADEL.   Finalize an Auth Request and get the callback URL for success or failure.  The user must be redirected to the URL in order to inform the application about the success or failure.  On success, the URL contains details for the application to obtain the tokens.  This method can only be called once for an Auth request.
   * @param betaOIDCServiceCreateCallbackRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOIDCServiceCreateCallbackResponse createCallback(BetaOIDCServiceCreateCallbackRequest betaOIDCServiceCreateCallbackRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOIDCServiceCreateCallbackRequest;
    
    if (betaOIDCServiceCreateCallbackRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOIDCServiceCreateCallbackRequest' when calling createCallback");
    }
    
    String localVarPath = "/zitadel.oidc.v2beta.OIDCService/CreateCallback";

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

    TypeReference<BetaOIDCServiceCreateCallbackResponse> localVarReturnType = new TypeReference<BetaOIDCServiceCreateCallbackResponse>() {};
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
   * Get AuthRequest
   * Deprecated: please move to the corresponding endpoint under oidc service v2. This endpoint will be removed with the next major version of ZITADEL.   Get OIDC Auth Request details by ID, obtained from the redirect URL. Returns details that are parsed from the application&#39;s Auth Request.
   * @param betaOIDCServiceGetAuthRequestRequest  (required)
   * @return BetaOIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOIDCServiceGetAuthRequestResponse getAuthRequest(BetaOIDCServiceGetAuthRequestRequest betaOIDCServiceGetAuthRequestRequest) throws ApiException {
    return this.getAuthRequest(betaOIDCServiceGetAuthRequestRequest, Collections.emptyMap());
  }


  /**
   * Get AuthRequest
   * Deprecated: please move to the corresponding endpoint under oidc service v2. This endpoint will be removed with the next major version of ZITADEL.   Get OIDC Auth Request details by ID, obtained from the redirect URL. Returns details that are parsed from the application&#39;s Auth Request.
   * @param betaOIDCServiceGetAuthRequestRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOIDCServiceGetAuthRequestResponse getAuthRequest(BetaOIDCServiceGetAuthRequestRequest betaOIDCServiceGetAuthRequestRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOIDCServiceGetAuthRequestRequest;
    
    if (betaOIDCServiceGetAuthRequestRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOIDCServiceGetAuthRequestRequest' when calling getAuthRequest");
    }
    
    String localVarPath = "/zitadel.oidc.v2beta.OIDCService/GetAuthRequest";

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

    TypeReference<BetaOIDCServiceGetAuthRequestResponse> localVarReturnType = new TypeReference<BetaOIDCServiceGetAuthRequestResponse>() {};
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
