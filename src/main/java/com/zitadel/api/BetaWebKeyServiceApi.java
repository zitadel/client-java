package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaWebKeyServiceActivateWebKeyRequest;
import com.zitadel.model.BetaWebKeyServiceActivateWebKeyResponse;
import com.zitadel.model.BetaWebKeyServiceConnectError;
import com.zitadel.model.BetaWebKeyServiceCreateWebKeyRequest;
import com.zitadel.model.BetaWebKeyServiceCreateWebKeyResponse;
import com.zitadel.model.BetaWebKeyServiceDeleteWebKeyRequest;
import com.zitadel.model.BetaWebKeyServiceDeleteWebKeyResponse;
import com.zitadel.model.BetaWebKeyServiceListWebKeysResponse;
import com.zitadel.model.NoOp200Response3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class BetaWebKeyServiceApi extends BaseApi {

  public BetaWebKeyServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaWebKeyServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * ActivateWebKey
   * Activate Web Key   Switch the active signing web key. The previously active key will be deactivated.  Note that the JWKs OIDC endpoint returns a cacheable response.  Therefore it is not advised to activate a key that has been created within the cache duration (default is 5min),  as the public key may not have been propagated to caches and clients yet.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param betaWebKeyServiceActivateWebKeyRequest  (required)
   * @return BetaWebKeyServiceActivateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceActivateWebKeyResponse activateWebKey(BetaWebKeyServiceActivateWebKeyRequest betaWebKeyServiceActivateWebKeyRequest) throws ApiException {
    return this.activateWebKey(betaWebKeyServiceActivateWebKeyRequest, Collections.emptyMap());
  }


  /**
   * ActivateWebKey
   * Activate Web Key   Switch the active signing web key. The previously active key will be deactivated.  Note that the JWKs OIDC endpoint returns a cacheable response.  Therefore it is not advised to activate a key that has been created within the cache duration (default is 5min),  as the public key may not have been propagated to caches and clients yet.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param betaWebKeyServiceActivateWebKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaWebKeyServiceActivateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceActivateWebKeyResponse activateWebKey(BetaWebKeyServiceActivateWebKeyRequest betaWebKeyServiceActivateWebKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaWebKeyServiceActivateWebKeyRequest;
    
    if (betaWebKeyServiceActivateWebKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaWebKeyServiceActivateWebKeyRequest' when calling activateWebKey");
    }
    
    String localVarPath = "/zitadel.webkey.v2beta.WebKeyService/ActivateWebKey";

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

    TypeReference<BetaWebKeyServiceActivateWebKeyResponse> localVarReturnType = new TypeReference<BetaWebKeyServiceActivateWebKeyResponse>() {};
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
   * CreateWebKey
   * Create Web Key   Generate a private and public key pair. The private key can be used to sign OIDC tokens after activation.  The public key can be used to validate OIDC tokens.  The newly created key will have the state &#x60;STATE_INITIAL&#x60; and is published to the public key endpoint.  Note that the JWKs OIDC endpoint returns a cacheable response.   If no key type is provided, a RSA key pair with 2048 bits and SHA256 hashing will be created.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param betaWebKeyServiceCreateWebKeyRequest  (required)
   * @return BetaWebKeyServiceCreateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceCreateWebKeyResponse createWebKey(BetaWebKeyServiceCreateWebKeyRequest betaWebKeyServiceCreateWebKeyRequest) throws ApiException {
    return this.createWebKey(betaWebKeyServiceCreateWebKeyRequest, Collections.emptyMap());
  }


  /**
   * CreateWebKey
   * Create Web Key   Generate a private and public key pair. The private key can be used to sign OIDC tokens after activation.  The public key can be used to validate OIDC tokens.  The newly created key will have the state &#x60;STATE_INITIAL&#x60; and is published to the public key endpoint.  Note that the JWKs OIDC endpoint returns a cacheable response.   If no key type is provided, a RSA key pair with 2048 bits and SHA256 hashing will be created.   Required permission:    - &#x60;iam.web_key.write&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param betaWebKeyServiceCreateWebKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaWebKeyServiceCreateWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceCreateWebKeyResponse createWebKey(BetaWebKeyServiceCreateWebKeyRequest betaWebKeyServiceCreateWebKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaWebKeyServiceCreateWebKeyRequest;
    
    if (betaWebKeyServiceCreateWebKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaWebKeyServiceCreateWebKeyRequest' when calling createWebKey");
    }
    
    String localVarPath = "/zitadel.webkey.v2beta.WebKeyService/CreateWebKey";

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

    TypeReference<BetaWebKeyServiceCreateWebKeyResponse> localVarReturnType = new TypeReference<BetaWebKeyServiceCreateWebKeyResponse>() {};
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
   * DeleteWebKey
   * Delete Web Key   Delete a web key pair. Only inactive keys can be deleted. Once a key is deleted,  any tokens signed by this key will be invalid.  Note that the JWKs OIDC endpoint returns a cacheable response.  In case the web key is not found, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the web key was deleted during the request.   Required permission:    - &#x60;iam.web_key.delete&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param betaWebKeyServiceDeleteWebKeyRequest  (required)
   * @return BetaWebKeyServiceDeleteWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceDeleteWebKeyResponse deleteWebKey(BetaWebKeyServiceDeleteWebKeyRequest betaWebKeyServiceDeleteWebKeyRequest) throws ApiException {
    return this.deleteWebKey(betaWebKeyServiceDeleteWebKeyRequest, Collections.emptyMap());
  }


  /**
   * DeleteWebKey
   * Delete Web Key   Delete a web key pair. Only inactive keys can be deleted. Once a key is deleted,  any tokens signed by this key will be invalid.  Note that the JWKs OIDC endpoint returns a cacheable response.  In case the web key is not found, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the web key was deleted during the request.   Required permission:    - &#x60;iam.web_key.delete&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param betaWebKeyServiceDeleteWebKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaWebKeyServiceDeleteWebKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceDeleteWebKeyResponse deleteWebKey(BetaWebKeyServiceDeleteWebKeyRequest betaWebKeyServiceDeleteWebKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaWebKeyServiceDeleteWebKeyRequest;
    
    if (betaWebKeyServiceDeleteWebKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaWebKeyServiceDeleteWebKeyRequest' when calling deleteWebKey");
    }
    
    String localVarPath = "/zitadel.webkey.v2beta.WebKeyService/DeleteWebKey";

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

    TypeReference<BetaWebKeyServiceDeleteWebKeyResponse> localVarReturnType = new TypeReference<BetaWebKeyServiceDeleteWebKeyResponse>() {};
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
   * ListWebKeys
   * List Web Keys   List all web keys and their states.   Required permission:    - &#x60;iam.web_key.read&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param body  (required)
   * @return BetaWebKeyServiceListWebKeysResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceListWebKeysResponse listWebKeys(Object body) throws ApiException {
    return this.listWebKeys(body, Collections.emptyMap());
  }


  /**
   * ListWebKeys
   * List Web Keys   List all web keys and their states.   Required permission:    - &#x60;iam.web_key.read&#x60;   Required feature flag:    - &#x60;web_key&#x60;
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaWebKeyServiceListWebKeysResponse
   * @throws ApiException if fails to make API call
   */
  public BetaWebKeyServiceListWebKeysResponse listWebKeys(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listWebKeys");
    }
    
    String localVarPath = "/zitadel.webkey.v2beta.WebKeyService/ListWebKeys";

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

    TypeReference<BetaWebKeyServiceListWebKeysResponse> localVarReturnType = new TypeReference<BetaWebKeyServiceListWebKeysResponse>() {};
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
   * @return NoOp200Response3
   * @throws ApiException if fails to make API call
   */
  public NoOp200Response3 noOp() throws ApiException {
    return this.noOp(Collections.emptyMap());
  }


  /**
   * Dummy endpoint to retain union-member schemas
   * 
   * @param additionalHeaders additionalHeaders for this call
   * @return NoOp200Response3
   * @throws ApiException if fails to make API call
   */
  public NoOp200Response3 noOp(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/5b6ad408";

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

    TypeReference<NoOp200Response3> localVarReturnType = new TypeReference<NoOp200Response3>() {};
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
