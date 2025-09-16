package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.WebKeyServiceActivateWebKeyRequest;
import com.zitadel.model.WebKeyServiceActivateWebKeyResponse;
import com.zitadel.model.WebKeyServiceConnectError;
import com.zitadel.model.WebKeyServiceCreateWebKeyRequest;
import com.zitadel.model.WebKeyServiceCreateWebKeyResponse;
import com.zitadel.model.WebKeyServiceDeleteWebKeyRequest;
import com.zitadel.model.WebKeyServiceDeleteWebKeyResponse;
import com.zitadel.model.WebKeyServiceListWebKeysResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class WebKeyServiceApi extends BaseApi {

  public WebKeyServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public WebKeyServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Activate Web Key
   * Switch the active signing web key. The previously active key will be deactivated.  Note that the JWKs OIDC endpoint returns a cacheable response.  Therefore it is not advised to activate a key that has been created within the cache duration (default is 5min),  as the public key may not have been propagated to caches and clients yet.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param webKeyServiceActivateWebKeyRequest  (required)
   * @return WebKeyServiceActivateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceActivateWebKeyResponse activateWebKey(WebKeyServiceActivateWebKeyRequest webKeyServiceActivateWebKeyRequest) throws ApiException {
    return this.activateWebKey(webKeyServiceActivateWebKeyRequest, Collections.emptyMap());
  }


  /**
   * Activate Web Key
   * Switch the active signing web key. The previously active key will be deactivated.  Note that the JWKs OIDC endpoint returns a cacheable response.  Therefore it is not advised to activate a key that has been created within the cache duration (default is 5min),  as the public key may not have been propagated to caches and clients yet.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param webKeyServiceActivateWebKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceActivateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  private WebKeyServiceActivateWebKeyResponse activateWebKey(WebKeyServiceActivateWebKeyRequest webKeyServiceActivateWebKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webKeyServiceActivateWebKeyRequest;
    
    if (webKeyServiceActivateWebKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'webKeyServiceActivateWebKeyRequest' when calling activateWebKey");
    }
    
    String localVarPath = "/zitadel.webkey.v2.WebKeyService/ActivateWebKey";

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

    TypeReference<WebKeyServiceActivateWebKeyResponse> localVarReturnType = new TypeReference<WebKeyServiceActivateWebKeyResponse>() {};
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
   * Generate a private and public key pair. The private key can be used to sign OIDC tokens after activation.  The public key can be used to validate OIDC tokens.  The newly created key will have the state &#x60;STATE_INITIAL&#x60; and is published to the public key endpoint.  Note that the JWKs OIDC endpoint returns a cacheable response.   If no key type is provided, a RSA key pair with 2048 bits and SHA256 hashing will be created.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param webKeyServiceCreateWebKeyRequest  (required)
   * @return WebKeyServiceCreateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceCreateWebKeyResponse createWebKey(WebKeyServiceCreateWebKeyRequest webKeyServiceCreateWebKeyRequest) throws ApiException {
    return this.createWebKey(webKeyServiceCreateWebKeyRequest, Collections.emptyMap());
  }


  /**
   * Create Web Key
   * Generate a private and public key pair. The private key can be used to sign OIDC tokens after activation.  The public key can be used to validate OIDC tokens.  The newly created key will have the state &#x60;STATE_INITIAL&#x60; and is published to the public key endpoint.  Note that the JWKs OIDC endpoint returns a cacheable response.   If no key type is provided, a RSA key pair with 2048 bits and SHA256 hashing will be created.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param webKeyServiceCreateWebKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceCreateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  private WebKeyServiceCreateWebKeyResponse createWebKey(WebKeyServiceCreateWebKeyRequest webKeyServiceCreateWebKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webKeyServiceCreateWebKeyRequest;
    
    if (webKeyServiceCreateWebKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'webKeyServiceCreateWebKeyRequest' when calling createWebKey");
    }
    
    String localVarPath = "/zitadel.webkey.v2.WebKeyService/CreateWebKey";

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

    TypeReference<WebKeyServiceCreateWebKeyResponse> localVarReturnType = new TypeReference<WebKeyServiceCreateWebKeyResponse>() {};
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
   * Delete a web key pair. Only inactive keys can be deleted. Once a key is deleted,  any tokens signed by this key will be invalid.  Note that the JWKs OIDC endpoint returns a cacheable response.  In case the web key is not found, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the web key was deleted during the request.   Required permission:    - &#x60;iam.web_key.delete&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param webKeyServiceDeleteWebKeyRequest  (required)
   * @return WebKeyServiceDeleteWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceDeleteWebKeyResponse deleteWebKey(WebKeyServiceDeleteWebKeyRequest webKeyServiceDeleteWebKeyRequest) throws ApiException {
    return this.deleteWebKey(webKeyServiceDeleteWebKeyRequest, Collections.emptyMap());
  }


  /**
   * Delete Web Key
   * Delete a web key pair. Only inactive keys can be deleted. Once a key is deleted,  any tokens signed by this key will be invalid.  Note that the JWKs OIDC endpoint returns a cacheable response.  In case the web key is not found, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the web key was deleted during the request.   Required permission:    - &#x60;iam.web_key.delete&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param webKeyServiceDeleteWebKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceDeleteWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  private WebKeyServiceDeleteWebKeyResponse deleteWebKey(WebKeyServiceDeleteWebKeyRequest webKeyServiceDeleteWebKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webKeyServiceDeleteWebKeyRequest;
    
    if (webKeyServiceDeleteWebKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'webKeyServiceDeleteWebKeyRequest' when calling deleteWebKey");
    }
    
    String localVarPath = "/zitadel.webkey.v2.WebKeyService/DeleteWebKey";

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

    TypeReference<WebKeyServiceDeleteWebKeyResponse> localVarReturnType = new TypeReference<WebKeyServiceDeleteWebKeyResponse>() {};
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
              * List Web Keys (Convenience Method)
              * List all web keys and their states.   Required permission:    - &#x60;iam.web_key.read&#x60;   Required feature flag:    - &#x60;web_key&#x60;
                * @return WebKeyServiceListWebKeysResponse
              * @throws ApiException if fails to make API call
              */
              public WebKeyServiceListWebKeysResponse listWebKeys() throws ApiException {
              return this.listWebKeys(new Object());
              }


  /**
   * List Web Keys
   * List all web keys and their states.   Required permission:    - &#x60;iam.web_key.read&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param body  (required)
   * @return WebKeyServiceListWebKeysResponse
   * @throws ApiException if fails to make API call
   */
  public WebKeyServiceListWebKeysResponse listWebKeys(Object body) throws ApiException {
    return this.listWebKeys(body, Collections.emptyMap());
  }


  /**
   * List Web Keys
   * List all web keys and their states.   Required permission:    - &#x60;iam.web_key.read&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return WebKeyServiceListWebKeysResponse
   * @throws ApiException if fails to make API call
   */
  private WebKeyServiceListWebKeysResponse listWebKeys(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listWebKeys");
    }
    
    String localVarPath = "/zitadel.webkey.v2.WebKeyService/ListWebKeys";

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

    TypeReference<WebKeyServiceListWebKeysResponse> localVarReturnType = new TypeReference<WebKeyServiceListWebKeysResponse>() {};
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
