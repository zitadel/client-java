package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.SettingsServiceGetSecuritySettingsResponse;
import com.zitadel.model.SettingsServiceRpcStatus;
import com.zitadel.model.SettingsServiceSetSecuritySettingsRequest;
import com.zitadel.model.SettingsServiceSetSecuritySettingsResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SettingsApi extends BaseApi {

  public SettingsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Get Security Settings
   * Returns the security settings of the ZITADEL instance.
   * @return SettingsServiceGetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetSecuritySettingsResponse settingsServiceGetSecuritySettings() throws ApiException {
    return this.settingsServiceGetSecuritySettings(Collections.emptyMap());
  }


  /**
   * Get Security Settings
   * Returns the security settings of the ZITADEL instance.
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetSecuritySettingsResponse settingsServiceGetSecuritySettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/security";

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

    TypeReference<SettingsServiceGetSecuritySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetSecuritySettingsResponse>() {};
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

  /**
   * Set Security Settings
   * Set the security settings of the ZITADEL instance.
   * @param settingsServiceSetSecuritySettingsRequest  (required)
   * @return SettingsServiceSetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceSetSecuritySettingsResponse settingsServiceSetSecuritySettings(SettingsServiceSetSecuritySettingsRequest settingsServiceSetSecuritySettingsRequest) throws ApiException {
    return this.settingsServiceSetSecuritySettings(settingsServiceSetSecuritySettingsRequest, Collections.emptyMap());
  }


  /**
   * Set Security Settings
   * Set the security settings of the ZITADEL instance.
   * @param settingsServiceSetSecuritySettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceSetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceSetSecuritySettingsResponse settingsServiceSetSecuritySettings(SettingsServiceSetSecuritySettingsRequest settingsServiceSetSecuritySettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceSetSecuritySettingsRequest;
    
    if (settingsServiceSetSecuritySettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceSetSecuritySettingsRequest' when calling settingsServiceSetSecuritySettings");
    }
    
    String localVarPath = "/v2/policies/security";

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

    TypeReference<SettingsServiceSetSecuritySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceSetSecuritySettingsResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
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
