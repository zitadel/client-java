package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaAuthorizationServiceActivateAuthorizationRequest;
import com.zitadel.model.BetaAuthorizationServiceActivateAuthorizationResponse;
import com.zitadel.model.BetaAuthorizationServiceConnectError;
import com.zitadel.model.BetaAuthorizationServiceCreateAuthorizationRequest;
import com.zitadel.model.BetaAuthorizationServiceCreateAuthorizationResponse;
import com.zitadel.model.BetaAuthorizationServiceDeactivateAuthorizationRequest;
import com.zitadel.model.BetaAuthorizationServiceDeactivateAuthorizationResponse;
import com.zitadel.model.BetaAuthorizationServiceDeleteAuthorizationRequest;
import com.zitadel.model.BetaAuthorizationServiceDeleteAuthorizationResponse;
import com.zitadel.model.BetaAuthorizationServiceListAuthorizationsRequest;
import com.zitadel.model.BetaAuthorizationServiceListAuthorizationsResponse;
import com.zitadel.model.BetaAuthorizationServiceUpdateAuthorizationRequest;
import com.zitadel.model.BetaAuthorizationServiceUpdateAuthorizationResponse;
import com.zitadel.model.NoOp200Response11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaAuthorizationServiceApi extends BaseApi {

  public BetaAuthorizationServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaAuthorizationServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * ActivateAuthorization
   * Activate Authorization   ActivateAuthorization activates an existing but inactive authorization.   In case the authorization is already active, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was activated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceActivateAuthorizationRequest  (required)
   * @return BetaAuthorizationServiceActivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAuthorizationServiceActivateAuthorizationResponse activateAuthorization(BetaAuthorizationServiceActivateAuthorizationRequest betaAuthorizationServiceActivateAuthorizationRequest) throws ApiException {
    return this.activateAuthorization(betaAuthorizationServiceActivateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * ActivateAuthorization
   * Activate Authorization   ActivateAuthorization activates an existing but inactive authorization.   In case the authorization is already active, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was activated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceActivateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAuthorizationServiceActivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAuthorizationServiceActivateAuthorizationResponse activateAuthorization(BetaAuthorizationServiceActivateAuthorizationRequest betaAuthorizationServiceActivateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAuthorizationServiceActivateAuthorizationRequest;
    
    if (betaAuthorizationServiceActivateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAuthorizationServiceActivateAuthorizationRequest' when calling activateAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2beta.AuthorizationService/ActivateAuthorization";

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

    TypeReference<BetaAuthorizationServiceActivateAuthorizationResponse> localVarReturnType = new TypeReference<BetaAuthorizationServiceActivateAuthorizationResponse>() {};
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
   * CreateAuthorization
   * Create Authorization   CreateAuthorization creates a new authorization for a user in an owned or granted project.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceCreateAuthorizationRequest  (required)
   * @return BetaAuthorizationServiceCreateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAuthorizationServiceCreateAuthorizationResponse createAuthorization(BetaAuthorizationServiceCreateAuthorizationRequest betaAuthorizationServiceCreateAuthorizationRequest) throws ApiException {
    return this.createAuthorization(betaAuthorizationServiceCreateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * CreateAuthorization
   * Create Authorization   CreateAuthorization creates a new authorization for a user in an owned or granted project.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceCreateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAuthorizationServiceCreateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAuthorizationServiceCreateAuthorizationResponse createAuthorization(BetaAuthorizationServiceCreateAuthorizationRequest betaAuthorizationServiceCreateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAuthorizationServiceCreateAuthorizationRequest;
    
    if (betaAuthorizationServiceCreateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAuthorizationServiceCreateAuthorizationRequest' when calling createAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2beta.AuthorizationService/CreateAuthorization";

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

    TypeReference<BetaAuthorizationServiceCreateAuthorizationResponse> localVarReturnType = new TypeReference<BetaAuthorizationServiceCreateAuthorizationResponse>() {};
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
   * DeactivateAuthorization
   * Deactivate Authorization   DeactivateAuthorization deactivates an existing and active authorization.   In case the authorization is already inactive, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was deactivated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceDeactivateAuthorizationRequest  (required)
   * @return BetaAuthorizationServiceDeactivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAuthorizationServiceDeactivateAuthorizationResponse deactivateAuthorization(BetaAuthorizationServiceDeactivateAuthorizationRequest betaAuthorizationServiceDeactivateAuthorizationRequest) throws ApiException {
    return this.deactivateAuthorization(betaAuthorizationServiceDeactivateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * DeactivateAuthorization
   * Deactivate Authorization   DeactivateAuthorization deactivates an existing and active authorization.   In case the authorization is already inactive, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was deactivated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceDeactivateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAuthorizationServiceDeactivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAuthorizationServiceDeactivateAuthorizationResponse deactivateAuthorization(BetaAuthorizationServiceDeactivateAuthorizationRequest betaAuthorizationServiceDeactivateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAuthorizationServiceDeactivateAuthorizationRequest;
    
    if (betaAuthorizationServiceDeactivateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAuthorizationServiceDeactivateAuthorizationRequest' when calling deactivateAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2beta.AuthorizationService/DeactivateAuthorization";

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

    TypeReference<BetaAuthorizationServiceDeactivateAuthorizationResponse> localVarReturnType = new TypeReference<BetaAuthorizationServiceDeactivateAuthorizationResponse>() {};
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
   * DeleteAuthorization
   * Delete Authorization   DeleteAuthorization deletes the authorization.   In case the authorization is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the authorization was deleted by the request.   Required permissions:    - \&quot;user.grant.delete\&quot;
   * @param betaAuthorizationServiceDeleteAuthorizationRequest  (required)
   * @return BetaAuthorizationServiceDeleteAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAuthorizationServiceDeleteAuthorizationResponse deleteAuthorization(BetaAuthorizationServiceDeleteAuthorizationRequest betaAuthorizationServiceDeleteAuthorizationRequest) throws ApiException {
    return this.deleteAuthorization(betaAuthorizationServiceDeleteAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * DeleteAuthorization
   * Delete Authorization   DeleteAuthorization deletes the authorization.   In case the authorization is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the authorization was deleted by the request.   Required permissions:    - \&quot;user.grant.delete\&quot;
   * @param betaAuthorizationServiceDeleteAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAuthorizationServiceDeleteAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAuthorizationServiceDeleteAuthorizationResponse deleteAuthorization(BetaAuthorizationServiceDeleteAuthorizationRequest betaAuthorizationServiceDeleteAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAuthorizationServiceDeleteAuthorizationRequest;
    
    if (betaAuthorizationServiceDeleteAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAuthorizationServiceDeleteAuthorizationRequest' when calling deleteAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2beta.AuthorizationService/DeleteAuthorization";

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

    TypeReference<BetaAuthorizationServiceDeleteAuthorizationResponse> localVarReturnType = new TypeReference<BetaAuthorizationServiceDeleteAuthorizationResponse>() {};
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
   * ListAuthorizations
   * List Authorizations   ListAuthorizations returns all authorizations matching the request and necessary permissions.   Required permissions:    - \&quot;user.grant.read\&quot;    - no permissions required for listing own authorizations
   * @param betaAuthorizationServiceListAuthorizationsRequest  (required)
   * @return BetaAuthorizationServiceListAuthorizationsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAuthorizationServiceListAuthorizationsResponse listAuthorizations(BetaAuthorizationServiceListAuthorizationsRequest betaAuthorizationServiceListAuthorizationsRequest) throws ApiException {
    return this.listAuthorizations(betaAuthorizationServiceListAuthorizationsRequest, Collections.emptyMap());
  }


  /**
   * ListAuthorizations
   * List Authorizations   ListAuthorizations returns all authorizations matching the request and necessary permissions.   Required permissions:    - \&quot;user.grant.read\&quot;    - no permissions required for listing own authorizations
   * @param betaAuthorizationServiceListAuthorizationsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAuthorizationServiceListAuthorizationsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAuthorizationServiceListAuthorizationsResponse listAuthorizations(BetaAuthorizationServiceListAuthorizationsRequest betaAuthorizationServiceListAuthorizationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAuthorizationServiceListAuthorizationsRequest;
    
    if (betaAuthorizationServiceListAuthorizationsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAuthorizationServiceListAuthorizationsRequest' when calling listAuthorizations");
    }
    
    String localVarPath = "/zitadel.authorization.v2beta.AuthorizationService/ListAuthorizations";

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

    TypeReference<BetaAuthorizationServiceListAuthorizationsResponse> localVarReturnType = new TypeReference<BetaAuthorizationServiceListAuthorizationsResponse>() {};
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
   * @return NoOp200Response11
   * @throws ApiException if fails to make API call
   */
  public NoOp200Response11 noOp() throws ApiException {
    return this.noOp(Collections.emptyMap());
  }


  /**
   * Dummy endpoint to retain union-member schemas
   * 
   * @param additionalHeaders additionalHeaders for this call
   * @return NoOp200Response11
   * @throws ApiException if fails to make API call
   */
  private NoOp200Response11 noOp(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/829fb3d5";

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

    TypeReference<NoOp200Response11> localVarReturnType = new TypeReference<NoOp200Response11>() {};
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
   * UpdateAuthorization
   * Update Authorization   UpdateAuthorization updates the authorization.   Note that any role keys previously granted to the user and not present in the request will be revoked.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceUpdateAuthorizationRequest  (required)
   * @return BetaAuthorizationServiceUpdateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAuthorizationServiceUpdateAuthorizationResponse updateAuthorization(BetaAuthorizationServiceUpdateAuthorizationRequest betaAuthorizationServiceUpdateAuthorizationRequest) throws ApiException {
    return this.updateAuthorization(betaAuthorizationServiceUpdateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * UpdateAuthorization
   * Update Authorization   UpdateAuthorization updates the authorization.   Note that any role keys previously granted to the user and not present in the request will be revoked.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param betaAuthorizationServiceUpdateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAuthorizationServiceUpdateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAuthorizationServiceUpdateAuthorizationResponse updateAuthorization(BetaAuthorizationServiceUpdateAuthorizationRequest betaAuthorizationServiceUpdateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAuthorizationServiceUpdateAuthorizationRequest;
    
    if (betaAuthorizationServiceUpdateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAuthorizationServiceUpdateAuthorizationRequest' when calling updateAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2beta.AuthorizationService/UpdateAuthorization";

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

    TypeReference<BetaAuthorizationServiceUpdateAuthorizationResponse> localVarReturnType = new TypeReference<BetaAuthorizationServiceUpdateAuthorizationResponse>() {};
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
