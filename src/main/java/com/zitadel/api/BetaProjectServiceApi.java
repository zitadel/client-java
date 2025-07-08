package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaProjectServiceActivateProjectGrantRequest;
import com.zitadel.model.BetaProjectServiceActivateProjectGrantResponse;
import com.zitadel.model.BetaProjectServiceActivateProjectRequest;
import com.zitadel.model.BetaProjectServiceActivateProjectResponse;
import com.zitadel.model.BetaProjectServiceAddProjectRoleRequest;
import com.zitadel.model.BetaProjectServiceAddProjectRoleResponse;
import com.zitadel.model.BetaProjectServiceConnectError;
import com.zitadel.model.BetaProjectServiceCreateProjectGrantRequest;
import com.zitadel.model.BetaProjectServiceCreateProjectGrantResponse;
import com.zitadel.model.BetaProjectServiceCreateProjectRequest;
import com.zitadel.model.BetaProjectServiceCreateProjectResponse;
import com.zitadel.model.BetaProjectServiceDeactivateProjectGrantRequest;
import com.zitadel.model.BetaProjectServiceDeactivateProjectGrantResponse;
import com.zitadel.model.BetaProjectServiceDeactivateProjectRequest;
import com.zitadel.model.BetaProjectServiceDeactivateProjectResponse;
import com.zitadel.model.BetaProjectServiceDeleteProjectGrantRequest;
import com.zitadel.model.BetaProjectServiceDeleteProjectGrantResponse;
import com.zitadel.model.BetaProjectServiceDeleteProjectRequest;
import com.zitadel.model.BetaProjectServiceDeleteProjectResponse;
import com.zitadel.model.BetaProjectServiceGetProjectRequest;
import com.zitadel.model.BetaProjectServiceGetProjectResponse;
import com.zitadel.model.BetaProjectServiceListProjectGrantsRequest;
import com.zitadel.model.BetaProjectServiceListProjectGrantsResponse;
import com.zitadel.model.BetaProjectServiceListProjectRolesRequest;
import com.zitadel.model.BetaProjectServiceListProjectRolesResponse;
import com.zitadel.model.BetaProjectServiceListProjectsRequest;
import com.zitadel.model.BetaProjectServiceListProjectsResponse;
import com.zitadel.model.BetaProjectServiceRemoveProjectRoleRequest;
import com.zitadel.model.BetaProjectServiceRemoveProjectRoleResponse;
import com.zitadel.model.BetaProjectServiceUpdateProjectGrantRequest;
import com.zitadel.model.BetaProjectServiceUpdateProjectGrantResponse;
import com.zitadel.model.BetaProjectServiceUpdateProjectRequest;
import com.zitadel.model.BetaProjectServiceUpdateProjectResponse;
import com.zitadel.model.BetaProjectServiceUpdateProjectRoleRequest;
import com.zitadel.model.BetaProjectServiceUpdateProjectRoleResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaProjectServiceApi extends BaseApi {

  public BetaProjectServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaProjectServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * ActivateProject
   * Activate Project   Set the state of a project to active. Request returns no error if the project is already activated.   Required permission:    - &#x60;project.write&#x60;
   * @param betaProjectServiceActivateProjectRequest  (required)
   * @return BetaProjectServiceActivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceActivateProjectResponse activateProject(BetaProjectServiceActivateProjectRequest betaProjectServiceActivateProjectRequest) throws ApiException {
    return this.activateProject(betaProjectServiceActivateProjectRequest, Collections.emptyMap());
  }


  /**
   * ActivateProject
   * Activate Project   Set the state of a project to active. Request returns no error if the project is already activated.   Required permission:    - &#x60;project.write&#x60;
   * @param betaProjectServiceActivateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceActivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceActivateProjectResponse activateProject(BetaProjectServiceActivateProjectRequest betaProjectServiceActivateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceActivateProjectRequest;
    
    if (betaProjectServiceActivateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceActivateProjectRequest' when calling activateProject");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/ActivateProject";

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

    TypeReference<BetaProjectServiceActivateProjectResponse> localVarReturnType = new TypeReference<BetaProjectServiceActivateProjectResponse>() {};
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
   * ActivateProjectGrant
   * Activate Project Grant   Set the state of the project grant to activated.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceActivateProjectGrantRequest  (required)
   * @return BetaProjectServiceActivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceActivateProjectGrantResponse activateProjectGrant(BetaProjectServiceActivateProjectGrantRequest betaProjectServiceActivateProjectGrantRequest) throws ApiException {
    return this.activateProjectGrant(betaProjectServiceActivateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * ActivateProjectGrant
   * Activate Project Grant   Set the state of the project grant to activated.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceActivateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceActivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceActivateProjectGrantResponse activateProjectGrant(BetaProjectServiceActivateProjectGrantRequest betaProjectServiceActivateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceActivateProjectGrantRequest;
    
    if (betaProjectServiceActivateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceActivateProjectGrantRequest' when calling activateProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/ActivateProjectGrant";

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

    TypeReference<BetaProjectServiceActivateProjectGrantResponse> localVarReturnType = new TypeReference<BetaProjectServiceActivateProjectGrantResponse>() {};
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
   * AddProjectRole
   * Add Project Role   Add a new project role to a project. The key must be unique within the project.   Required permission:    - &#x60;project.role.write&#x60;
   * @param betaProjectServiceAddProjectRoleRequest  (required)
   * @return BetaProjectServiceAddProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceAddProjectRoleResponse addProjectRole(BetaProjectServiceAddProjectRoleRequest betaProjectServiceAddProjectRoleRequest) throws ApiException {
    return this.addProjectRole(betaProjectServiceAddProjectRoleRequest, Collections.emptyMap());
  }


  /**
   * AddProjectRole
   * Add Project Role   Add a new project role to a project. The key must be unique within the project.   Required permission:    - &#x60;project.role.write&#x60;
   * @param betaProjectServiceAddProjectRoleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceAddProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceAddProjectRoleResponse addProjectRole(BetaProjectServiceAddProjectRoleRequest betaProjectServiceAddProjectRoleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceAddProjectRoleRequest;
    
    if (betaProjectServiceAddProjectRoleRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceAddProjectRoleRequest' when calling addProjectRole");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/AddProjectRole";

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

    TypeReference<BetaProjectServiceAddProjectRoleResponse> localVarReturnType = new TypeReference<BetaProjectServiceAddProjectRoleResponse>() {};
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
   * CreateProject
   * Create Project   Create a new Project.   Required permission:    - &#x60;project.create&#x60;
   * @param betaProjectServiceCreateProjectRequest  (required)
   * @return BetaProjectServiceCreateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceCreateProjectResponse createProject(BetaProjectServiceCreateProjectRequest betaProjectServiceCreateProjectRequest) throws ApiException {
    return this.createProject(betaProjectServiceCreateProjectRequest, Collections.emptyMap());
  }


  /**
   * CreateProject
   * Create Project   Create a new Project.   Required permission:    - &#x60;project.create&#x60;
   * @param betaProjectServiceCreateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceCreateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceCreateProjectResponse createProject(BetaProjectServiceCreateProjectRequest betaProjectServiceCreateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceCreateProjectRequest;
    
    if (betaProjectServiceCreateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceCreateProjectRequest' when calling createProject");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/CreateProject";

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

    TypeReference<BetaProjectServiceCreateProjectResponse> localVarReturnType = new TypeReference<BetaProjectServiceCreateProjectResponse>() {};
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
   * CreateProjectGrant
   * Create Project Grant   Grant a project to another organization.  The project grant will allow the granted organization to access the project and manage the authorizations for its users.   Required permission:    - &#x60;project.grant.create&#x60;
   * @param betaProjectServiceCreateProjectGrantRequest  (required)
   * @return BetaProjectServiceCreateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceCreateProjectGrantResponse createProjectGrant(BetaProjectServiceCreateProjectGrantRequest betaProjectServiceCreateProjectGrantRequest) throws ApiException {
    return this.createProjectGrant(betaProjectServiceCreateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * CreateProjectGrant
   * Create Project Grant   Grant a project to another organization.  The project grant will allow the granted organization to access the project and manage the authorizations for its users.   Required permission:    - &#x60;project.grant.create&#x60;
   * @param betaProjectServiceCreateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceCreateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceCreateProjectGrantResponse createProjectGrant(BetaProjectServiceCreateProjectGrantRequest betaProjectServiceCreateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceCreateProjectGrantRequest;
    
    if (betaProjectServiceCreateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceCreateProjectGrantRequest' when calling createProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/CreateProjectGrant";

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

    TypeReference<BetaProjectServiceCreateProjectGrantResponse> localVarReturnType = new TypeReference<BetaProjectServiceCreateProjectGrantResponse>() {};
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
   * DeactivateProject
   * Deactivate Project   Set the state of a project to deactivated. Request returns no error if the project is already deactivated.  Applications under deactivated projects are not able to login anymore.   Required permission:    - &#x60;project.write&#x60;
   * @param betaProjectServiceDeactivateProjectRequest  (required)
   * @return BetaProjectServiceDeactivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceDeactivateProjectResponse deactivateProject(BetaProjectServiceDeactivateProjectRequest betaProjectServiceDeactivateProjectRequest) throws ApiException {
    return this.deactivateProject(betaProjectServiceDeactivateProjectRequest, Collections.emptyMap());
  }


  /**
   * DeactivateProject
   * Deactivate Project   Set the state of a project to deactivated. Request returns no error if the project is already deactivated.  Applications under deactivated projects are not able to login anymore.   Required permission:    - &#x60;project.write&#x60;
   * @param betaProjectServiceDeactivateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceDeactivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceDeactivateProjectResponse deactivateProject(BetaProjectServiceDeactivateProjectRequest betaProjectServiceDeactivateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceDeactivateProjectRequest;
    
    if (betaProjectServiceDeactivateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceDeactivateProjectRequest' when calling deactivateProject");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/DeactivateProject";

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

    TypeReference<BetaProjectServiceDeactivateProjectResponse> localVarReturnType = new TypeReference<BetaProjectServiceDeactivateProjectResponse>() {};
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
   * DeactivateProjectGrant
   * Deactivate Project Grant   Set the state of the project grant to deactivated.  Applications under deactivated projects grants are not able to login anymore.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceDeactivateProjectGrantRequest  (required)
   * @return BetaProjectServiceDeactivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceDeactivateProjectGrantResponse deactivateProjectGrant(BetaProjectServiceDeactivateProjectGrantRequest betaProjectServiceDeactivateProjectGrantRequest) throws ApiException {
    return this.deactivateProjectGrant(betaProjectServiceDeactivateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * DeactivateProjectGrant
   * Deactivate Project Grant   Set the state of the project grant to deactivated.  Applications under deactivated projects grants are not able to login anymore.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceDeactivateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceDeactivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceDeactivateProjectGrantResponse deactivateProjectGrant(BetaProjectServiceDeactivateProjectGrantRequest betaProjectServiceDeactivateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceDeactivateProjectGrantRequest;
    
    if (betaProjectServiceDeactivateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceDeactivateProjectGrantRequest' when calling deactivateProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/DeactivateProjectGrant";

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

    TypeReference<BetaProjectServiceDeactivateProjectGrantResponse> localVarReturnType = new TypeReference<BetaProjectServiceDeactivateProjectGrantResponse>() {};
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
   * DeleteProject
   * Delete Project   Delete an existing project.  In case the project is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.delete&#x60;
   * @param betaProjectServiceDeleteProjectRequest  (required)
   * @return BetaProjectServiceDeleteProjectResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceDeleteProjectResponse deleteProject(BetaProjectServiceDeleteProjectRequest betaProjectServiceDeleteProjectRequest) throws ApiException {
    return this.deleteProject(betaProjectServiceDeleteProjectRequest, Collections.emptyMap());
  }


  /**
   * DeleteProject
   * Delete Project   Delete an existing project.  In case the project is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.delete&#x60;
   * @param betaProjectServiceDeleteProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceDeleteProjectResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceDeleteProjectResponse deleteProject(BetaProjectServiceDeleteProjectRequest betaProjectServiceDeleteProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceDeleteProjectRequest;
    
    if (betaProjectServiceDeleteProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceDeleteProjectRequest' when calling deleteProject");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/DeleteProject";

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

    TypeReference<BetaProjectServiceDeleteProjectResponse> localVarReturnType = new TypeReference<BetaProjectServiceDeleteProjectResponse>() {};
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
   * DeleteProjectGrant
   * Delete Project Grant   Delete a project grant. All user grants for this project grant will also be removed.  A user will not have access to the project afterward (if permissions are checked).  In case the project grant is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.grant.delete&#x60;
   * @param betaProjectServiceDeleteProjectGrantRequest  (required)
   * @return BetaProjectServiceDeleteProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceDeleteProjectGrantResponse deleteProjectGrant(BetaProjectServiceDeleteProjectGrantRequest betaProjectServiceDeleteProjectGrantRequest) throws ApiException {
    return this.deleteProjectGrant(betaProjectServiceDeleteProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * DeleteProjectGrant
   * Delete Project Grant   Delete a project grant. All user grants for this project grant will also be removed.  A user will not have access to the project afterward (if permissions are checked).  In case the project grant is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.grant.delete&#x60;
   * @param betaProjectServiceDeleteProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceDeleteProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceDeleteProjectGrantResponse deleteProjectGrant(BetaProjectServiceDeleteProjectGrantRequest betaProjectServiceDeleteProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceDeleteProjectGrantRequest;
    
    if (betaProjectServiceDeleteProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceDeleteProjectGrantRequest' when calling deleteProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/DeleteProjectGrant";

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

    TypeReference<BetaProjectServiceDeleteProjectGrantResponse> localVarReturnType = new TypeReference<BetaProjectServiceDeleteProjectGrantResponse>() {};
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
   * GetProject
   * Get Project   Returns the project identified by the requested ID.   Required permission:    - &#x60;project.read&#x60;
   * @param betaProjectServiceGetProjectRequest  (required)
   * @return BetaProjectServiceGetProjectResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceGetProjectResponse getProject(BetaProjectServiceGetProjectRequest betaProjectServiceGetProjectRequest) throws ApiException {
    return this.getProject(betaProjectServiceGetProjectRequest, Collections.emptyMap());
  }


  /**
   * GetProject
   * Get Project   Returns the project identified by the requested ID.   Required permission:    - &#x60;project.read&#x60;
   * @param betaProjectServiceGetProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceGetProjectResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceGetProjectResponse getProject(BetaProjectServiceGetProjectRequest betaProjectServiceGetProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceGetProjectRequest;
    
    if (betaProjectServiceGetProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceGetProjectRequest' when calling getProject");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/GetProject";

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

    TypeReference<BetaProjectServiceGetProjectResponse> localVarReturnType = new TypeReference<BetaProjectServiceGetProjectResponse>() {};
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
   * ListProjectGrants
   * List Project Grants   Returns a list of project grants. A project grant is when the organization grants its project to another organization.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceListProjectGrantsRequest  (required)
   * @return BetaProjectServiceListProjectGrantsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceListProjectGrantsResponse listProjectGrants(BetaProjectServiceListProjectGrantsRequest betaProjectServiceListProjectGrantsRequest) throws ApiException {
    return this.listProjectGrants(betaProjectServiceListProjectGrantsRequest, Collections.emptyMap());
  }


  /**
   * ListProjectGrants
   * List Project Grants   Returns a list of project grants. A project grant is when the organization grants its project to another organization.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceListProjectGrantsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceListProjectGrantsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceListProjectGrantsResponse listProjectGrants(BetaProjectServiceListProjectGrantsRequest betaProjectServiceListProjectGrantsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceListProjectGrantsRequest;
    
    if (betaProjectServiceListProjectGrantsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceListProjectGrantsRequest' when calling listProjectGrants");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/ListProjectGrants";

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

    TypeReference<BetaProjectServiceListProjectGrantsResponse> localVarReturnType = new TypeReference<BetaProjectServiceListProjectGrantsResponse>() {};
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
   * ListProjectRoles
   * List Project Roles   Returns all roles of a project matching the search query.   Required permission:    - &#x60;project.role.read&#x60;
   * @param betaProjectServiceListProjectRolesRequest  (required)
   * @return BetaProjectServiceListProjectRolesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceListProjectRolesResponse listProjectRoles(BetaProjectServiceListProjectRolesRequest betaProjectServiceListProjectRolesRequest) throws ApiException {
    return this.listProjectRoles(betaProjectServiceListProjectRolesRequest, Collections.emptyMap());
  }


  /**
   * ListProjectRoles
   * List Project Roles   Returns all roles of a project matching the search query.   Required permission:    - &#x60;project.role.read&#x60;
   * @param betaProjectServiceListProjectRolesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceListProjectRolesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceListProjectRolesResponse listProjectRoles(BetaProjectServiceListProjectRolesRequest betaProjectServiceListProjectRolesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceListProjectRolesRequest;
    
    if (betaProjectServiceListProjectRolesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceListProjectRolesRequest' when calling listProjectRoles");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/ListProjectRoles";

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

    TypeReference<BetaProjectServiceListProjectRolesResponse> localVarReturnType = new TypeReference<BetaProjectServiceListProjectRolesResponse>() {};
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
   * ListProjects
   * List Projects   List all matching projects. By default all projects of the instance that the caller has permission to read are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;project.read&#x60;
   * @param betaProjectServiceListProjectsRequest  (required)
   * @return BetaProjectServiceListProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceListProjectsResponse listProjects(BetaProjectServiceListProjectsRequest betaProjectServiceListProjectsRequest) throws ApiException {
    return this.listProjects(betaProjectServiceListProjectsRequest, Collections.emptyMap());
  }


  /**
   * ListProjects
   * List Projects   List all matching projects. By default all projects of the instance that the caller has permission to read are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;project.read&#x60;
   * @param betaProjectServiceListProjectsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceListProjectsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceListProjectsResponse listProjects(BetaProjectServiceListProjectsRequest betaProjectServiceListProjectsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceListProjectsRequest;
    
    if (betaProjectServiceListProjectsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceListProjectsRequest' when calling listProjects");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/ListProjects";

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

    TypeReference<BetaProjectServiceListProjectsResponse> localVarReturnType = new TypeReference<BetaProjectServiceListProjectsResponse>() {};
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
   * RemoveProjectRole
   * Remove Project Role   Removes the role from the project and on every resource it has a dependency. This includes project grants and user grants.   Required permission:    - &#x60;project.role.write&#x60;
   * @param betaProjectServiceRemoveProjectRoleRequest  (required)
   * @return BetaProjectServiceRemoveProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceRemoveProjectRoleResponse removeProjectRole(BetaProjectServiceRemoveProjectRoleRequest betaProjectServiceRemoveProjectRoleRequest) throws ApiException {
    return this.removeProjectRole(betaProjectServiceRemoveProjectRoleRequest, Collections.emptyMap());
  }


  /**
   * RemoveProjectRole
   * Remove Project Role   Removes the role from the project and on every resource it has a dependency. This includes project grants and user grants.   Required permission:    - &#x60;project.role.write&#x60;
   * @param betaProjectServiceRemoveProjectRoleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceRemoveProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceRemoveProjectRoleResponse removeProjectRole(BetaProjectServiceRemoveProjectRoleRequest betaProjectServiceRemoveProjectRoleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceRemoveProjectRoleRequest;
    
    if (betaProjectServiceRemoveProjectRoleRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceRemoveProjectRoleRequest' when calling removeProjectRole");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/RemoveProjectRole";

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

    TypeReference<BetaProjectServiceRemoveProjectRoleResponse> localVarReturnType = new TypeReference<BetaProjectServiceRemoveProjectRoleResponse>() {};
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
   * UpdateProject
   * Update Project   Update an existing project.   Required permission:    - &#x60;project.write&#x60;
   * @param betaProjectServiceUpdateProjectRequest  (required)
   * @return BetaProjectServiceUpdateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceUpdateProjectResponse updateProject(BetaProjectServiceUpdateProjectRequest betaProjectServiceUpdateProjectRequest) throws ApiException {
    return this.updateProject(betaProjectServiceUpdateProjectRequest, Collections.emptyMap());
  }


  /**
   * UpdateProject
   * Update Project   Update an existing project.   Required permission:    - &#x60;project.write&#x60;
   * @param betaProjectServiceUpdateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceUpdateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceUpdateProjectResponse updateProject(BetaProjectServiceUpdateProjectRequest betaProjectServiceUpdateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceUpdateProjectRequest;
    
    if (betaProjectServiceUpdateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceUpdateProjectRequest' when calling updateProject");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/UpdateProject";

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

    TypeReference<BetaProjectServiceUpdateProjectResponse> localVarReturnType = new TypeReference<BetaProjectServiceUpdateProjectResponse>() {};
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
   * UpdateProjectGrant
   * Update Project Grant   Change the roles of the project that is granted to another organization.  The project grant will allow the granted organization to access the project and manage the authorizations for its users.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceUpdateProjectGrantRequest  (required)
   * @return BetaProjectServiceUpdateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceUpdateProjectGrantResponse updateProjectGrant(BetaProjectServiceUpdateProjectGrantRequest betaProjectServiceUpdateProjectGrantRequest) throws ApiException {
    return this.updateProjectGrant(betaProjectServiceUpdateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * UpdateProjectGrant
   * Update Project Grant   Change the roles of the project that is granted to another organization.  The project grant will allow the granted organization to access the project and manage the authorizations for its users.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param betaProjectServiceUpdateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceUpdateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceUpdateProjectGrantResponse updateProjectGrant(BetaProjectServiceUpdateProjectGrantRequest betaProjectServiceUpdateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceUpdateProjectGrantRequest;
    
    if (betaProjectServiceUpdateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceUpdateProjectGrantRequest' when calling updateProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/UpdateProjectGrant";

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

    TypeReference<BetaProjectServiceUpdateProjectGrantResponse> localVarReturnType = new TypeReference<BetaProjectServiceUpdateProjectGrantResponse>() {};
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
   * UpdateProjectRole
   * Update Project Role   Change a project role. The key is not editable. If a key should change, remove the role and create a new one.   Required permission:    - &#x60;project.role.write&#x60;
   * @param betaProjectServiceUpdateProjectRoleRequest  (required)
   * @return BetaProjectServiceUpdateProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  public BetaProjectServiceUpdateProjectRoleResponse updateProjectRole(BetaProjectServiceUpdateProjectRoleRequest betaProjectServiceUpdateProjectRoleRequest) throws ApiException {
    return this.updateProjectRole(betaProjectServiceUpdateProjectRoleRequest, Collections.emptyMap());
  }


  /**
   * UpdateProjectRole
   * Update Project Role   Change a project role. The key is not editable. If a key should change, remove the role and create a new one.   Required permission:    - &#x60;project.role.write&#x60;
   * @param betaProjectServiceUpdateProjectRoleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaProjectServiceUpdateProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  private BetaProjectServiceUpdateProjectRoleResponse updateProjectRole(BetaProjectServiceUpdateProjectRoleRequest betaProjectServiceUpdateProjectRoleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaProjectServiceUpdateProjectRoleRequest;
    
    if (betaProjectServiceUpdateProjectRoleRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaProjectServiceUpdateProjectRoleRequest' when calling updateProjectRole");
    }
    
    String localVarPath = "/zitadel.project.v2beta.ProjectService/UpdateProjectRole";

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

    TypeReference<BetaProjectServiceUpdateProjectRoleResponse> localVarReturnType = new TypeReference<BetaProjectServiceUpdateProjectRoleResponse>() {};
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
