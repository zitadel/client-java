package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.InternalPermissionServiceConnectError;
import com.zitadel.model.InternalPermissionServiceCreateAdministratorRequest;
import com.zitadel.model.InternalPermissionServiceCreateAdministratorResponse;
import com.zitadel.model.InternalPermissionServiceDeleteAdministratorRequest;
import com.zitadel.model.InternalPermissionServiceDeleteAdministratorResponse;
import com.zitadel.model.InternalPermissionServiceListAdministratorsRequest;
import com.zitadel.model.InternalPermissionServiceListAdministratorsResponse;
import com.zitadel.model.InternalPermissionServiceUpdateAdministratorRequest;
import com.zitadel.model.InternalPermissionServiceUpdateAdministratorResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class InternalPermissionServiceApi extends BaseApi {

  public InternalPermissionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public InternalPermissionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Create Administrator
   * CreateAdministrator grants an administrator role to a user for a specific resource.   Note that the roles are specific to the resource type.  This means that if you want to grant a user the administrator role for an organization and a project,  you need to create two administrator roles.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param internalPermissionServiceCreateAdministratorRequest  (required)
   * @return InternalPermissionServiceCreateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  public InternalPermissionServiceCreateAdministratorResponse createAdministrator(InternalPermissionServiceCreateAdministratorRequest internalPermissionServiceCreateAdministratorRequest) throws ApiException {
    return this.createAdministrator(internalPermissionServiceCreateAdministratorRequest, Collections.emptyMap());
  }


  /**
   * Create Administrator
   * CreateAdministrator grants an administrator role to a user for a specific resource.   Note that the roles are specific to the resource type.  This means that if you want to grant a user the administrator role for an organization and a project,  you need to create two administrator roles.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param internalPermissionServiceCreateAdministratorRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InternalPermissionServiceCreateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  private InternalPermissionServiceCreateAdministratorResponse createAdministrator(InternalPermissionServiceCreateAdministratorRequest internalPermissionServiceCreateAdministratorRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = internalPermissionServiceCreateAdministratorRequest;
    
    if (internalPermissionServiceCreateAdministratorRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'internalPermissionServiceCreateAdministratorRequest' when calling createAdministrator");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2.InternalPermissionService/CreateAdministrator";

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

    TypeReference<InternalPermissionServiceCreateAdministratorResponse> localVarReturnType = new TypeReference<InternalPermissionServiceCreateAdministratorResponse>() {};
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
   * Delete Administrator
   * DeleteAdministrator revokes an administrator role from a user.   In case the administrator role is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the administrator role was deleted during the request.   Required permissions depend on the resource type:    - \&quot;iam.member.delete\&quot; for instance administrators    - \&quot;org.member.delete\&quot; for organization administrators    - \&quot;project.member.delete\&quot; for project administrators    - \&quot;project.grant.member.delete\&quot; for project grant administrators
   * @param internalPermissionServiceDeleteAdministratorRequest  (required)
   * @return InternalPermissionServiceDeleteAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  public InternalPermissionServiceDeleteAdministratorResponse deleteAdministrator(InternalPermissionServiceDeleteAdministratorRequest internalPermissionServiceDeleteAdministratorRequest) throws ApiException {
    return this.deleteAdministrator(internalPermissionServiceDeleteAdministratorRequest, Collections.emptyMap());
  }


  /**
   * Delete Administrator
   * DeleteAdministrator revokes an administrator role from a user.   In case the administrator role is not found, the request will return a successful response as  the desired state is already achieved.  You can check the deletion date in the response to verify if the administrator role was deleted during the request.   Required permissions depend on the resource type:    - \&quot;iam.member.delete\&quot; for instance administrators    - \&quot;org.member.delete\&quot; for organization administrators    - \&quot;project.member.delete\&quot; for project administrators    - \&quot;project.grant.member.delete\&quot; for project grant administrators
   * @param internalPermissionServiceDeleteAdministratorRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InternalPermissionServiceDeleteAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  private InternalPermissionServiceDeleteAdministratorResponse deleteAdministrator(InternalPermissionServiceDeleteAdministratorRequest internalPermissionServiceDeleteAdministratorRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = internalPermissionServiceDeleteAdministratorRequest;
    
    if (internalPermissionServiceDeleteAdministratorRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'internalPermissionServiceDeleteAdministratorRequest' when calling deleteAdministrator");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2.InternalPermissionService/DeleteAdministrator";

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

    TypeReference<InternalPermissionServiceDeleteAdministratorResponse> localVarReturnType = new TypeReference<InternalPermissionServiceDeleteAdministratorResponse>() {};
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
   * List Administrators
   * ListAdministrators returns all administrators and their roles matching the request and the caller&#39;s permissions to retrieve.   Required permissions depend on the resource type:    - \&quot;iam.member.read\&quot; for instance administrators    - \&quot;org.member.read\&quot; for organization administrators    - \&quot;project.member.read\&quot; for project administrators    - \&quot;project.grant.member.read\&quot; for project grant administrators    - no permissions required for listing own administrator roles
   * @param internalPermissionServiceListAdministratorsRequest  (required)
   * @return InternalPermissionServiceListAdministratorsResponse
   * @throws ApiException if fails to make API call
   */
  public InternalPermissionServiceListAdministratorsResponse listAdministrators(InternalPermissionServiceListAdministratorsRequest internalPermissionServiceListAdministratorsRequest) throws ApiException {
    return this.listAdministrators(internalPermissionServiceListAdministratorsRequest, Collections.emptyMap());
  }


  /**
   * List Administrators
   * ListAdministrators returns all administrators and their roles matching the request and the caller&#39;s permissions to retrieve.   Required permissions depend on the resource type:    - \&quot;iam.member.read\&quot; for instance administrators    - \&quot;org.member.read\&quot; for organization administrators    - \&quot;project.member.read\&quot; for project administrators    - \&quot;project.grant.member.read\&quot; for project grant administrators    - no permissions required for listing own administrator roles
   * @param internalPermissionServiceListAdministratorsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InternalPermissionServiceListAdministratorsResponse
   * @throws ApiException if fails to make API call
   */
  private InternalPermissionServiceListAdministratorsResponse listAdministrators(InternalPermissionServiceListAdministratorsRequest internalPermissionServiceListAdministratorsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = internalPermissionServiceListAdministratorsRequest;
    
    if (internalPermissionServiceListAdministratorsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'internalPermissionServiceListAdministratorsRequest' when calling listAdministrators");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2.InternalPermissionService/ListAdministrators";

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

    TypeReference<InternalPermissionServiceListAdministratorsResponse> localVarReturnType = new TypeReference<InternalPermissionServiceListAdministratorsResponse>() {};
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
   * Update Administrator
   * UpdateAdministrator updates the specific administrator role.   Note that any role previously granted to the user and not present in the request will be revoked.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param internalPermissionServiceUpdateAdministratorRequest  (required)
   * @return InternalPermissionServiceUpdateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  public InternalPermissionServiceUpdateAdministratorResponse updateAdministrator(InternalPermissionServiceUpdateAdministratorRequest internalPermissionServiceUpdateAdministratorRequest) throws ApiException {
    return this.updateAdministrator(internalPermissionServiceUpdateAdministratorRequest, Collections.emptyMap());
  }


  /**
   * Update Administrator
   * UpdateAdministrator updates the specific administrator role.   Note that any role previously granted to the user and not present in the request will be revoked.   Required permissions depend on the resource type:    - \&quot;iam.member.write\&quot; for instance administrators    - \&quot;org.member.write\&quot; for organization administrators    - \&quot;project.member.write\&quot; for project administrators    - \&quot;project.grant.member.write\&quot; for project grant administrators
   * @param internalPermissionServiceUpdateAdministratorRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InternalPermissionServiceUpdateAdministratorResponse
   * @throws ApiException if fails to make API call
   */
  private InternalPermissionServiceUpdateAdministratorResponse updateAdministrator(InternalPermissionServiceUpdateAdministratorRequest internalPermissionServiceUpdateAdministratorRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = internalPermissionServiceUpdateAdministratorRequest;
    
    if (internalPermissionServiceUpdateAdministratorRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'internalPermissionServiceUpdateAdministratorRequest' when calling updateAdministrator");
    }
    
    String localVarPath = "/zitadel.internal_permission.v2.InternalPermissionService/UpdateAdministrator";

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

    TypeReference<InternalPermissionServiceUpdateAdministratorResponse> localVarReturnType = new TypeReference<InternalPermissionServiceUpdateAdministratorResponse>() {};
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
