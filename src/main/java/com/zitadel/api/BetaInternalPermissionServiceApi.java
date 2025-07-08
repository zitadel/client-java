package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaInternalPermissionServiceConnectError;
import com.zitadel.model.BetaInternalPermissionServiceCreateAdministratorRequest;
import com.zitadel.model.BetaInternalPermissionServiceCreateAdministratorResponse;
import com.zitadel.model.BetaInternalPermissionServiceDeleteAdministratorRequest;
import com.zitadel.model.BetaInternalPermissionServiceDeleteAdministratorResponse;
import com.zitadel.model.BetaInternalPermissionServiceListAdministratorsRequest;
import com.zitadel.model.BetaInternalPermissionServiceListAdministratorsResponse;
import com.zitadel.model.BetaInternalPermissionServiceUpdateAdministratorRequest;
import com.zitadel.model.BetaInternalPermissionServiceUpdateAdministratorResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaInternalPermissionServiceApi extends BaseApi {

  public BetaInternalPermissionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaInternalPermissionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * CreateAdministrator
   * CreateAdministrator grants a administrator role to a user for a specific resource.   Note that the roles are specific to the resource type.  This means that if you want to grant a user the administrator role for an organization and a project,  you need to create two administrator roles.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param betaInternalPermissionServiceCreateAdministratorRequest  (required)
   * @return BetaInternalPermissionServiceCreateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInternalPermissionServiceCreateAdministratorResponse createAdministrator(BetaInternalPermissionServiceCreateAdministratorRequest betaInternalPermissionServiceCreateAdministratorRequest) throws ApiException {
    return this.createAdministrator(betaInternalPermissionServiceCreateAdministratorRequest, Collections.emptyMap());
  }


  /**
   * CreateAdministrator
   * CreateAdministrator grants a administrator role to a user for a specific resource.   Note that the roles are specific to the resource type.  This means that if you want to grant a user the administrator role for an organization and a project,  you need to create two administrator roles.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param betaInternalPermissionServiceCreateAdministratorRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInternalPermissionServiceCreateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInternalPermissionServiceCreateAdministratorResponse createAdministrator(BetaInternalPermissionServiceCreateAdministratorRequest betaInternalPermissionServiceCreateAdministratorRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInternalPermissionServiceCreateAdministratorRequest;
    
    if (betaInternalPermissionServiceCreateAdministratorRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInternalPermissionServiceCreateAdministratorRequest' when calling createAdministrator");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2beta.InternalPermissionService/CreateAdministrator";

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

    TypeReference<BetaInternalPermissionServiceCreateAdministratorResponse> localVarReturnType = new TypeReference<BetaInternalPermissionServiceCreateAdministratorResponse>() {};
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
   * DeleteAdministrator
   * DeleteAdministrator revokes a administrator role from a user.   In case the administrator role is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the administrator role was deleted during the request.   Required permissions depend on the resource type:    - \&quot;iam.member.delete\&quot; for instance administrators    - \&quot;org.member.delete\&quot; for organization administrators    - \&quot;project.member.delete\&quot; for project administrators    - \&quot;project.grant.member.delete\&quot; for project grant administrators
   * @param betaInternalPermissionServiceDeleteAdministratorRequest  (required)
   * @return BetaInternalPermissionServiceDeleteAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInternalPermissionServiceDeleteAdministratorResponse deleteAdministrator(BetaInternalPermissionServiceDeleteAdministratorRequest betaInternalPermissionServiceDeleteAdministratorRequest) throws ApiException {
    return this.deleteAdministrator(betaInternalPermissionServiceDeleteAdministratorRequest, Collections.emptyMap());
  }


  /**
   * DeleteAdministrator
   * DeleteAdministrator revokes a administrator role from a user.   In case the administrator role is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the administrator role was deleted during the request.   Required permissions depend on the resource type:    - \&quot;iam.member.delete\&quot; for instance administrators    - \&quot;org.member.delete\&quot; for organization administrators    - \&quot;project.member.delete\&quot; for project administrators    - \&quot;project.grant.member.delete\&quot; for project grant administrators
   * @param betaInternalPermissionServiceDeleteAdministratorRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInternalPermissionServiceDeleteAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInternalPermissionServiceDeleteAdministratorResponse deleteAdministrator(BetaInternalPermissionServiceDeleteAdministratorRequest betaInternalPermissionServiceDeleteAdministratorRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInternalPermissionServiceDeleteAdministratorRequest;
    
    if (betaInternalPermissionServiceDeleteAdministratorRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInternalPermissionServiceDeleteAdministratorRequest' when calling deleteAdministrator");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2beta.InternalPermissionService/DeleteAdministrator";

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

    TypeReference<BetaInternalPermissionServiceDeleteAdministratorResponse> localVarReturnType = new TypeReference<BetaInternalPermissionServiceDeleteAdministratorResponse>() {};
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
   * ListAdministrators
   * ListAdministrators returns all administrators and its roles matching the request and necessary permissions.   Required permissions depend on the resource type:    - \&quot;iam.member.read\&quot; for instance administrators    - \&quot;org.member.read\&quot; for organization administrators    - \&quot;project.member.read\&quot; for project administrators    - \&quot;project.grant.member.read\&quot; for project grant administrators    - no permissions required for listing own administrator roles
   * @param betaInternalPermissionServiceListAdministratorsRequest  (required)
   * @return BetaInternalPermissionServiceListAdministratorsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInternalPermissionServiceListAdministratorsResponse listAdministrators(BetaInternalPermissionServiceListAdministratorsRequest betaInternalPermissionServiceListAdministratorsRequest) throws ApiException {
    return this.listAdministrators(betaInternalPermissionServiceListAdministratorsRequest, Collections.emptyMap());
  }


  /**
   * ListAdministrators
   * ListAdministrators returns all administrators and its roles matching the request and necessary permissions.   Required permissions depend on the resource type:    - \&quot;iam.member.read\&quot; for instance administrators    - \&quot;org.member.read\&quot; for organization administrators    - \&quot;project.member.read\&quot; for project administrators    - \&quot;project.grant.member.read\&quot; for project grant administrators    - no permissions required for listing own administrator roles
   * @param betaInternalPermissionServiceListAdministratorsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInternalPermissionServiceListAdministratorsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInternalPermissionServiceListAdministratorsResponse listAdministrators(BetaInternalPermissionServiceListAdministratorsRequest betaInternalPermissionServiceListAdministratorsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInternalPermissionServiceListAdministratorsRequest;
    
    if (betaInternalPermissionServiceListAdministratorsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInternalPermissionServiceListAdministratorsRequest' when calling listAdministrators");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2beta.InternalPermissionService/ListAdministrators";

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

    TypeReference<BetaInternalPermissionServiceListAdministratorsResponse> localVarReturnType = new TypeReference<BetaInternalPermissionServiceListAdministratorsResponse>() {};
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
   * UpdateAdministrator
   * UpdateAdministrator updates the specific administrator role.   Note that any role previously granted to the user and not present in the request will be revoked.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param betaInternalPermissionServiceUpdateAdministratorRequest  (required)
   * @return BetaInternalPermissionServiceUpdateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInternalPermissionServiceUpdateAdministratorResponse updateAdministrator(BetaInternalPermissionServiceUpdateAdministratorRequest betaInternalPermissionServiceUpdateAdministratorRequest) throws ApiException {
    return this.updateAdministrator(betaInternalPermissionServiceUpdateAdministratorRequest, Collections.emptyMap());
  }


  /**
   * UpdateAdministrator
   * UpdateAdministrator updates the specific administrator role.   Note that any role previously granted to the user and not present in the request will be revoked.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param betaInternalPermissionServiceUpdateAdministratorRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInternalPermissionServiceUpdateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInternalPermissionServiceUpdateAdministratorResponse updateAdministrator(BetaInternalPermissionServiceUpdateAdministratorRequest betaInternalPermissionServiceUpdateAdministratorRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInternalPermissionServiceUpdateAdministratorRequest;
    
    if (betaInternalPermissionServiceUpdateAdministratorRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInternalPermissionServiceUpdateAdministratorRequest' when calling updateAdministrator");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2beta.InternalPermissionService/UpdateAdministrator";

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

    TypeReference<BetaInternalPermissionServiceUpdateAdministratorResponse> localVarReturnType = new TypeReference<BetaInternalPermissionServiceUpdateAdministratorResponse>() {};
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
