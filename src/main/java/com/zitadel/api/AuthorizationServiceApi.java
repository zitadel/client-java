package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.AuthorizationServiceActivateAuthorizationRequest;
import com.zitadel.model.AuthorizationServiceActivateAuthorizationResponse;
import com.zitadel.model.AuthorizationServiceConnectError;
import com.zitadel.model.AuthorizationServiceCreateAuthorizationRequest;
import com.zitadel.model.AuthorizationServiceCreateAuthorizationResponse;
import com.zitadel.model.AuthorizationServiceDeactivateAuthorizationRequest;
import com.zitadel.model.AuthorizationServiceDeactivateAuthorizationResponse;
import com.zitadel.model.AuthorizationServiceDeleteAuthorizationRequest;
import com.zitadel.model.AuthorizationServiceDeleteAuthorizationResponse;
import com.zitadel.model.AuthorizationServiceListAuthorizationsRequest;
import com.zitadel.model.AuthorizationServiceListAuthorizationsResponse;
import com.zitadel.model.AuthorizationServiceUpdateAuthorizationRequest;
import com.zitadel.model.AuthorizationServiceUpdateAuthorizationResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class AuthorizationServiceApi extends BaseApi {

  public AuthorizationServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public AuthorizationServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Activate Authorization
   * ActivateAuthorization activates an existing but inactive authorization.   In case the authorization is already active, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was activated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceActivateAuthorizationRequest  (required)
   * @return AuthorizationServiceActivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizationServiceActivateAuthorizationResponse activateAuthorization(AuthorizationServiceActivateAuthorizationRequest authorizationServiceActivateAuthorizationRequest) throws ApiException {
    return this.activateAuthorization(authorizationServiceActivateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * Activate Authorization
   * ActivateAuthorization activates an existing but inactive authorization.   In case the authorization is already active, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was activated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceActivateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthorizationServiceActivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private AuthorizationServiceActivateAuthorizationResponse activateAuthorization(AuthorizationServiceActivateAuthorizationRequest authorizationServiceActivateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authorizationServiceActivateAuthorizationRequest;
    
    if (authorizationServiceActivateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authorizationServiceActivateAuthorizationRequest' when calling activateAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2.AuthorizationService/ActivateAuthorization";

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

    TypeReference<AuthorizationServiceActivateAuthorizationResponse> localVarReturnType = new TypeReference<AuthorizationServiceActivateAuthorizationResponse>() {};
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
   * Create Authorization
   * CreateAuthorization creates a new authorization for a user in an owned or granted project.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceCreateAuthorizationRequest  (required)
   * @return AuthorizationServiceCreateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizationServiceCreateAuthorizationResponse createAuthorization(AuthorizationServiceCreateAuthorizationRequest authorizationServiceCreateAuthorizationRequest) throws ApiException {
    return this.createAuthorization(authorizationServiceCreateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * Create Authorization
   * CreateAuthorization creates a new authorization for a user in an owned or granted project.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceCreateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthorizationServiceCreateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private AuthorizationServiceCreateAuthorizationResponse createAuthorization(AuthorizationServiceCreateAuthorizationRequest authorizationServiceCreateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authorizationServiceCreateAuthorizationRequest;
    
    if (authorizationServiceCreateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authorizationServiceCreateAuthorizationRequest' when calling createAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2.AuthorizationService/CreateAuthorization";

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

    TypeReference<AuthorizationServiceCreateAuthorizationResponse> localVarReturnType = new TypeReference<AuthorizationServiceCreateAuthorizationResponse>() {};
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
   * Deactivate Authorization
   * DeactivateAuthorization deactivates an existing and active authorization.   In case the authorization is already inactive, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was deactivated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceDeactivateAuthorizationRequest  (required)
   * @return AuthorizationServiceDeactivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizationServiceDeactivateAuthorizationResponse deactivateAuthorization(AuthorizationServiceDeactivateAuthorizationRequest authorizationServiceDeactivateAuthorizationRequest) throws ApiException {
    return this.deactivateAuthorization(authorizationServiceDeactivateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * Deactivate Authorization
   * DeactivateAuthorization deactivates an existing and active authorization.   In case the authorization is already inactive, the request will return a successful response as  the desired state is already achieved.  You can check the change date in the response to verify if the authorization was deactivated by the request.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceDeactivateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthorizationServiceDeactivateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private AuthorizationServiceDeactivateAuthorizationResponse deactivateAuthorization(AuthorizationServiceDeactivateAuthorizationRequest authorizationServiceDeactivateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authorizationServiceDeactivateAuthorizationRequest;
    
    if (authorizationServiceDeactivateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authorizationServiceDeactivateAuthorizationRequest' when calling deactivateAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2.AuthorizationService/DeactivateAuthorization";

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

    TypeReference<AuthorizationServiceDeactivateAuthorizationResponse> localVarReturnType = new TypeReference<AuthorizationServiceDeactivateAuthorizationResponse>() {};
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
   * Delete Authorization
   * DeleteAuthorization deletes the authorization.   In case the authorization is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the authorization was deleted by the request.   Required permissions:    - \&quot;user.grant.delete\&quot;
   * @param authorizationServiceDeleteAuthorizationRequest  (required)
   * @return AuthorizationServiceDeleteAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizationServiceDeleteAuthorizationResponse deleteAuthorization(AuthorizationServiceDeleteAuthorizationRequest authorizationServiceDeleteAuthorizationRequest) throws ApiException {
    return this.deleteAuthorization(authorizationServiceDeleteAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * Delete Authorization
   * DeleteAuthorization deletes the authorization.   In case the authorization is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the authorization was deleted by the request.   Required permissions:    - \&quot;user.grant.delete\&quot;
   * @param authorizationServiceDeleteAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthorizationServiceDeleteAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private AuthorizationServiceDeleteAuthorizationResponse deleteAuthorization(AuthorizationServiceDeleteAuthorizationRequest authorizationServiceDeleteAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authorizationServiceDeleteAuthorizationRequest;
    
    if (authorizationServiceDeleteAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authorizationServiceDeleteAuthorizationRequest' when calling deleteAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2.AuthorizationService/DeleteAuthorization";

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

    TypeReference<AuthorizationServiceDeleteAuthorizationResponse> localVarReturnType = new TypeReference<AuthorizationServiceDeleteAuthorizationResponse>() {};
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
   * List Authorizations
   * ListAuthorizations returns all authorizations matching the request and necessary permissions.   Required permissions:    - \&quot;user.grant.read\&quot;    - no permissions required for listing own authorizations
   * @param authorizationServiceListAuthorizationsRequest  (required)
   * @return AuthorizationServiceListAuthorizationsResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizationServiceListAuthorizationsResponse listAuthorizations(AuthorizationServiceListAuthorizationsRequest authorizationServiceListAuthorizationsRequest) throws ApiException {
    return this.listAuthorizations(authorizationServiceListAuthorizationsRequest, Collections.emptyMap());
  }


  /**
   * List Authorizations
   * ListAuthorizations returns all authorizations matching the request and necessary permissions.   Required permissions:    - \&quot;user.grant.read\&quot;    - no permissions required for listing own authorizations
   * @param authorizationServiceListAuthorizationsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthorizationServiceListAuthorizationsResponse
   * @throws ApiException if fails to make API call
   */
  private AuthorizationServiceListAuthorizationsResponse listAuthorizations(AuthorizationServiceListAuthorizationsRequest authorizationServiceListAuthorizationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authorizationServiceListAuthorizationsRequest;
    
    if (authorizationServiceListAuthorizationsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authorizationServiceListAuthorizationsRequest' when calling listAuthorizations");
    }
    
    String localVarPath = "/zitadel.authorization.v2.AuthorizationService/ListAuthorizations";

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

    TypeReference<AuthorizationServiceListAuthorizationsResponse> localVarReturnType = new TypeReference<AuthorizationServiceListAuthorizationsResponse>() {};
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
   * Update Authorization
   * UpdateAuthorization updates the authorization.   Note that any role keys previously granted to the user and not present in the request will be revoked.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceUpdateAuthorizationRequest  (required)
   * @return AuthorizationServiceUpdateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizationServiceUpdateAuthorizationResponse updateAuthorization(AuthorizationServiceUpdateAuthorizationRequest authorizationServiceUpdateAuthorizationRequest) throws ApiException {
    return this.updateAuthorization(authorizationServiceUpdateAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * Update Authorization
   * UpdateAuthorization updates the authorization.   Note that any role keys previously granted to the user and not present in the request will be revoked.   Required permissions:    - \&quot;user.grant.write\&quot;
   * @param authorizationServiceUpdateAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return AuthorizationServiceUpdateAuthorizationResponse
   * @throws ApiException if fails to make API call
   */
  private AuthorizationServiceUpdateAuthorizationResponse updateAuthorization(AuthorizationServiceUpdateAuthorizationRequest authorizationServiceUpdateAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = authorizationServiceUpdateAuthorizationRequest;
    
    if (authorizationServiceUpdateAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authorizationServiceUpdateAuthorizationRequest' when calling updateAuthorization");
    }
    
    String localVarPath = "/zitadel.authorization.v2.AuthorizationService/UpdateAuthorization";

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

    TypeReference<AuthorizationServiceUpdateAuthorizationResponse> localVarReturnType = new TypeReference<AuthorizationServiceUpdateAuthorizationResponse>() {};
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
