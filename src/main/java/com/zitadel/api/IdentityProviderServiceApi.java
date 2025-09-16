package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.IdentityProviderServiceConnectError;
import com.zitadel.model.IdentityProviderServiceGetIDPByIDRequest;
import com.zitadel.model.IdentityProviderServiceGetIDPByIDResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class IdentityProviderServiceApi extends BaseApi {

  public IdentityProviderServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public IdentityProviderServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Get identity provider (IdP) by ID
   * Returns an identity provider (social/enterprise login) by its ID, which can be of the type Google, AzureAD, etc.
   * @param identityProviderServiceGetIDPByIDRequest  (required)
   * @return IdentityProviderServiceGetIDPByIDResponse
   * @throws ApiException if fails to make API call
   */
  public IdentityProviderServiceGetIDPByIDResponse getIDPByID(IdentityProviderServiceGetIDPByIDRequest identityProviderServiceGetIDPByIDRequest) throws ApiException {
    return this.getIDPByID(identityProviderServiceGetIDPByIDRequest, Collections.emptyMap());
  }


  /**
   * Get identity provider (IdP) by ID
   * Returns an identity provider (social/enterprise login) by its ID, which can be of the type Google, AzureAD, etc.
   * @param identityProviderServiceGetIDPByIDRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return IdentityProviderServiceGetIDPByIDResponse
   * @throws ApiException if fails to make API call
   */
  private IdentityProviderServiceGetIDPByIDResponse getIDPByID(IdentityProviderServiceGetIDPByIDRequest identityProviderServiceGetIDPByIDRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = identityProviderServiceGetIDPByIDRequest;
    
    if (identityProviderServiceGetIDPByIDRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'identityProviderServiceGetIDPByIDRequest' when calling getIDPByID");
    }
    
    String localVarPath = "/zitadel.idp.v2.IdentityProviderService/GetIDPByID";

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

    TypeReference<IdentityProviderServiceGetIDPByIDResponse> localVarReturnType = new TypeReference<IdentityProviderServiceGetIDPByIDResponse>() {};
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
