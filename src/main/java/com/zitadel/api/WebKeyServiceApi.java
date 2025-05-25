package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.WebKeyServiceBetaActivateWebKeyResponse;
import com.zitadel.model.WebKeyServiceBetaCreateWebKeyResponse;
import com.zitadel.model.WebKeyServiceBetaDeleteWebKeyResponse;
import com.zitadel.model.WebKeyServiceBetaListWebKeysResponse;
import com.zitadel.model.WebKeyServiceCreateWebKeyRequest;
import com.zitadel.model.WebKeyServiceRpcStatus;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class WebKeyServiceApi extends BaseApi {

  public WebKeyServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public WebKeyServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Activate Web Key
   * Switch the active signing web key. The previously active key will be deactivated. Note that the JWKs OIDC endpoint returns a cacheable response. Therefore it is not advised to activate a key that has been created within the cache duration (default is 5min), as the public key may not have been propagated to caches and clients yet.  Required permission:   - &#x60;iam.web_key.write&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @param id  (required)
   * @return WebKeyServiceBetaActivateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaActivateWebKeyResponse webKeyServiceActivateWebKey(String id) throws ApiException {
    return this.webKeyServiceActivateWebKey(id, Collections.emptyMap());
  }


  /**
   * Activate Web Key
   * Switch the active signing web key. The previously active key will be deactivated. Note that the JWKs OIDC endpoint returns a cacheable response. Therefore it is not advised to activate a key that has been created within the cache duration (default is 5min), as the public key may not have been propagated to caches and clients yet.  Required permission:   - &#x60;iam.web_key.write&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @param id  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceBetaActivateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaActivateWebKeyResponse webKeyServiceActivateWebKey(String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling webKeyServiceActivateWebKey");
    }
    
    String localVarPath = "/v2beta/web_keys/{id}/activate"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    TypeReference<WebKeyServiceBetaActivateWebKeyResponse> localVarReturnType = new TypeReference<WebKeyServiceBetaActivateWebKeyResponse>() {};
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
   * Create Web Key
   * Generate a private and public key pair. The private key can be used to sign OIDC tokens after activation. The public key can be used to validate OIDC tokens. The newly created key will have the state &#x60;STATE_INITIAL&#x60; and is published to the public key endpoint. Note that the JWKs OIDC endpoint returns a cacheable response.  If no key type is provided, a RSA key pair with 2048 bits and SHA256 hashing will be created.  Required permission:   - &#x60;iam.web_key.write&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @param webKeyServiceCreateWebKeyRequest  (required)
   * @return WebKeyServiceBetaCreateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaCreateWebKeyResponse webKeyServiceCreateWebKey(WebKeyServiceCreateWebKeyRequest webKeyServiceCreateWebKeyRequest) throws ApiException {
    return this.webKeyServiceCreateWebKey(webKeyServiceCreateWebKeyRequest, Collections.emptyMap());
  }


  /**
   * Create Web Key
   * Generate a private and public key pair. The private key can be used to sign OIDC tokens after activation. The public key can be used to validate OIDC tokens. The newly created key will have the state &#x60;STATE_INITIAL&#x60; and is published to the public key endpoint. Note that the JWKs OIDC endpoint returns a cacheable response.  If no key type is provided, a RSA key pair with 2048 bits and SHA256 hashing will be created.  Required permission:   - &#x60;iam.web_key.write&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @param webKeyServiceCreateWebKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceBetaCreateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaCreateWebKeyResponse webKeyServiceCreateWebKey(WebKeyServiceCreateWebKeyRequest webKeyServiceCreateWebKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webKeyServiceCreateWebKeyRequest;
    
    if (webKeyServiceCreateWebKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'webKeyServiceCreateWebKeyRequest' when calling webKeyServiceCreateWebKey");
    }
    
    String localVarPath = "/v2beta/web_keys";

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

    TypeReference<WebKeyServiceBetaCreateWebKeyResponse> localVarReturnType = new TypeReference<WebKeyServiceBetaCreateWebKeyResponse>() {};
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
   * Delete Web Key
   * Delete a web key pair. Only inactive keys can be deleted. Once a key is deleted, any tokens signed by this key will be invalid. Note that the JWKs OIDC endpoint returns a cacheable response. In case the web key is not found, the request will return a successful response as the desired state is already achieved. You can check the change date in the response to verify if the web key was deleted during the request.  Required permission:   - &#x60;iam.web_key.delete&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @param id  (required)
   * @return WebKeyServiceBetaDeleteWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaDeleteWebKeyResponse webKeyServiceDeleteWebKey(String id) throws ApiException {
    return this.webKeyServiceDeleteWebKey(id, Collections.emptyMap());
  }


  /**
   * Delete Web Key
   * Delete a web key pair. Only inactive keys can be deleted. Once a key is deleted, any tokens signed by this key will be invalid. Note that the JWKs OIDC endpoint returns a cacheable response. In case the web key is not found, the request will return a successful response as the desired state is already achieved. You can check the change date in the response to verify if the web key was deleted during the request.  Required permission:   - &#x60;iam.web_key.delete&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @param id  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceBetaDeleteWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaDeleteWebKeyResponse webKeyServiceDeleteWebKey(String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling webKeyServiceDeleteWebKey");
    }
    
    String localVarPath = "/v2beta/web_keys/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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

    TypeReference<WebKeyServiceBetaDeleteWebKeyResponse> localVarReturnType = new TypeReference<WebKeyServiceBetaDeleteWebKeyResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
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
   * List Web Keys
   * List all web keys and their states.  Required permission:   - &#x60;iam.web_key.read&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @return WebKeyServiceBetaListWebKeysResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaListWebKeysResponse webKeyServiceListWebKeys() throws ApiException {
    return this.webKeyServiceListWebKeys(Collections.emptyMap());
  }


  /**
   * List Web Keys
   * List all web keys and their states.  Required permission:   - &#x60;iam.web_key.read&#x60;  Required feature flag:   - &#x60;web_key&#x60;
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceBetaListWebKeysResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceBetaListWebKeysResponse webKeyServiceListWebKeys(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2beta/web_keys";

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

    TypeReference<WebKeyServiceBetaListWebKeysResponse> localVarReturnType = new TypeReference<WebKeyServiceBetaListWebKeysResponse>() {};
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
