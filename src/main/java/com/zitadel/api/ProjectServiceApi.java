package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.ProjectServiceActivateProjectGrantRequest;
import com.zitadel.model.ProjectServiceActivateProjectGrantResponse;
import com.zitadel.model.ProjectServiceActivateProjectRequest;
import com.zitadel.model.ProjectServiceActivateProjectResponse;
import com.zitadel.model.ProjectServiceAddProjectRoleRequest;
import com.zitadel.model.ProjectServiceAddProjectRoleResponse;
import com.zitadel.model.ProjectServiceConnectError;
import com.zitadel.model.ProjectServiceCreateProjectGrantRequest;
import com.zitadel.model.ProjectServiceCreateProjectGrantResponse;
import com.zitadel.model.ProjectServiceCreateProjectRequest;
import com.zitadel.model.ProjectServiceCreateProjectResponse;
import com.zitadel.model.ProjectServiceDeactivateProjectGrantRequest;
import com.zitadel.model.ProjectServiceDeactivateProjectGrantResponse;
import com.zitadel.model.ProjectServiceDeactivateProjectRequest;
import com.zitadel.model.ProjectServiceDeactivateProjectResponse;
import com.zitadel.model.ProjectServiceDeleteProjectGrantRequest;
import com.zitadel.model.ProjectServiceDeleteProjectGrantResponse;
import com.zitadel.model.ProjectServiceDeleteProjectRequest;
import com.zitadel.model.ProjectServiceDeleteProjectResponse;
import com.zitadel.model.ProjectServiceGetProjectRequest;
import com.zitadel.model.ProjectServiceGetProjectResponse;
import com.zitadel.model.ProjectServiceListProjectGrantsRequest;
import com.zitadel.model.ProjectServiceListProjectGrantsResponse;
import com.zitadel.model.ProjectServiceListProjectRolesRequest;
import com.zitadel.model.ProjectServiceListProjectRolesResponse;
import com.zitadel.model.ProjectServiceListProjectsRequest;
import com.zitadel.model.ProjectServiceListProjectsResponse;
import com.zitadel.model.ProjectServiceRemoveProjectRoleRequest;
import com.zitadel.model.ProjectServiceRemoveProjectRoleResponse;
import com.zitadel.model.ProjectServiceUpdateProjectGrantRequest;
import com.zitadel.model.ProjectServiceUpdateProjectGrantResponse;
import com.zitadel.model.ProjectServiceUpdateProjectRequest;
import com.zitadel.model.ProjectServiceUpdateProjectResponse;
import com.zitadel.model.ProjectServiceUpdateProjectRoleRequest;
import com.zitadel.model.ProjectServiceUpdateProjectRoleResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class ProjectServiceApi extends BaseApi {

  public ProjectServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ProjectServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Activate Project
   * Set the state of a project to active. Request returns no error if the project is already activated.   Required permission:    - &#x60;project.write&#x60;
   * @param projectServiceActivateProjectRequest  (required)
   * @return ProjectServiceActivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceActivateProjectResponse activateProject(ProjectServiceActivateProjectRequest projectServiceActivateProjectRequest) throws ApiException {
    return this.activateProject(projectServiceActivateProjectRequest, Collections.emptyMap());
  }


  /**
   * Activate Project
   * Set the state of a project to active. Request returns no error if the project is already activated.   Required permission:    - &#x60;project.write&#x60;
   * @param projectServiceActivateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceActivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceActivateProjectResponse activateProject(ProjectServiceActivateProjectRequest projectServiceActivateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceActivateProjectRequest;
    
    if (projectServiceActivateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceActivateProjectRequest' when calling activateProject");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/ActivateProject";

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

    TypeReference<ProjectServiceActivateProjectResponse> localVarReturnType = new TypeReference<ProjectServiceActivateProjectResponse>() {};
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
   * Activate Project Grant
   * Set the state of the project grant to activated.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param projectServiceActivateProjectGrantRequest  (required)
   * @return ProjectServiceActivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceActivateProjectGrantResponse activateProjectGrant(ProjectServiceActivateProjectGrantRequest projectServiceActivateProjectGrantRequest) throws ApiException {
    return this.activateProjectGrant(projectServiceActivateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * Activate Project Grant
   * Set the state of the project grant to activated.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param projectServiceActivateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceActivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceActivateProjectGrantResponse activateProjectGrant(ProjectServiceActivateProjectGrantRequest projectServiceActivateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceActivateProjectGrantRequest;
    
    if (projectServiceActivateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceActivateProjectGrantRequest' when calling activateProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/ActivateProjectGrant";

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

    TypeReference<ProjectServiceActivateProjectGrantResponse> localVarReturnType = new TypeReference<ProjectServiceActivateProjectGrantResponse>() {};
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
   * Add Project Role
   * Add a new project role to a project. The key must be unique within the project.   Required permission:    - &#x60;project.role.write&#x60;
   * @param projectServiceAddProjectRoleRequest  (required)
   * @return ProjectServiceAddProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceAddProjectRoleResponse addProjectRole(ProjectServiceAddProjectRoleRequest projectServiceAddProjectRoleRequest) throws ApiException {
    return this.addProjectRole(projectServiceAddProjectRoleRequest, Collections.emptyMap());
  }


  /**
   * Add Project Role
   * Add a new project role to a project. The key must be unique within the project.   Required permission:    - &#x60;project.role.write&#x60;
   * @param projectServiceAddProjectRoleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceAddProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceAddProjectRoleResponse addProjectRole(ProjectServiceAddProjectRoleRequest projectServiceAddProjectRoleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceAddProjectRoleRequest;
    
    if (projectServiceAddProjectRoleRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceAddProjectRoleRequest' when calling addProjectRole");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/AddProjectRole";

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

    TypeReference<ProjectServiceAddProjectRoleResponse> localVarReturnType = new TypeReference<ProjectServiceAddProjectRoleResponse>() {};
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
   * Create Project
   * Create a new project. A project is a vessel to group applications, roles and  authorizations. Every project belongs to exactly one organization, but  can be granted to other organizations for self-management of their authorizations.   Required permission:    - &#x60;project.create&#x60;
   * @param projectServiceCreateProjectRequest  (required)
   * @return ProjectServiceCreateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceCreateProjectResponse createProject(ProjectServiceCreateProjectRequest projectServiceCreateProjectRequest) throws ApiException {
    return this.createProject(projectServiceCreateProjectRequest, Collections.emptyMap());
  }


  /**
   * Create Project
   * Create a new project. A project is a vessel to group applications, roles and  authorizations. Every project belongs to exactly one organization, but  can be granted to other organizations for self-management of their authorizations.   Required permission:    - &#x60;project.create&#x60;
   * @param projectServiceCreateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceCreateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceCreateProjectResponse createProject(ProjectServiceCreateProjectRequest projectServiceCreateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceCreateProjectRequest;
    
    if (projectServiceCreateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceCreateProjectRequest' when calling createProject");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/CreateProject";

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

    TypeReference<ProjectServiceCreateProjectResponse> localVarReturnType = new TypeReference<ProjectServiceCreateProjectResponse>() {};
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
   * Create Project Grant
   * Grant a project to another organization.  The project grant will allow the granted organization to access the project and manage  the authorizations for its users.   Required permission:    - &#x60;project.grant.create&#x60;
   * @param projectServiceCreateProjectGrantRequest  (required)
   * @return ProjectServiceCreateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceCreateProjectGrantResponse createProjectGrant(ProjectServiceCreateProjectGrantRequest projectServiceCreateProjectGrantRequest) throws ApiException {
    return this.createProjectGrant(projectServiceCreateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * Create Project Grant
   * Grant a project to another organization.  The project grant will allow the granted organization to access the project and manage  the authorizations for its users.   Required permission:    - &#x60;project.grant.create&#x60;
   * @param projectServiceCreateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceCreateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceCreateProjectGrantResponse createProjectGrant(ProjectServiceCreateProjectGrantRequest projectServiceCreateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceCreateProjectGrantRequest;
    
    if (projectServiceCreateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceCreateProjectGrantRequest' when calling createProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/CreateProjectGrant";

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

    TypeReference<ProjectServiceCreateProjectGrantResponse> localVarReturnType = new TypeReference<ProjectServiceCreateProjectGrantResponse>() {};
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
   * Deactivate Project
   * Set the state of a project to deactivated. Request returns no error if the project is already deactivated.  Applications under deactivated projects are not able to login anymore.   Required permission:    - &#x60;project.write&#x60;
   * @param projectServiceDeactivateProjectRequest  (required)
   * @return ProjectServiceDeactivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceDeactivateProjectResponse deactivateProject(ProjectServiceDeactivateProjectRequest projectServiceDeactivateProjectRequest) throws ApiException {
    return this.deactivateProject(projectServiceDeactivateProjectRequest, Collections.emptyMap());
  }


  /**
   * Deactivate Project
   * Set the state of a project to deactivated. Request returns no error if the project is already deactivated.  Applications under deactivated projects are not able to login anymore.   Required permission:    - &#x60;project.write&#x60;
   * @param projectServiceDeactivateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceDeactivateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceDeactivateProjectResponse deactivateProject(ProjectServiceDeactivateProjectRequest projectServiceDeactivateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceDeactivateProjectRequest;
    
    if (projectServiceDeactivateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceDeactivateProjectRequest' when calling deactivateProject");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/DeactivateProject";

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

    TypeReference<ProjectServiceDeactivateProjectResponse> localVarReturnType = new TypeReference<ProjectServiceDeactivateProjectResponse>() {};
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
   * Deactivate Project Grant
   * Set the state of the project grant to deactivated.  Applications under deactivated projects grants are not able to login anymore.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param projectServiceDeactivateProjectGrantRequest  (required)
   * @return ProjectServiceDeactivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceDeactivateProjectGrantResponse deactivateProjectGrant(ProjectServiceDeactivateProjectGrantRequest projectServiceDeactivateProjectGrantRequest) throws ApiException {
    return this.deactivateProjectGrant(projectServiceDeactivateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * Deactivate Project Grant
   * Set the state of the project grant to deactivated.  Applications under deactivated projects grants are not able to login anymore.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param projectServiceDeactivateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceDeactivateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceDeactivateProjectGrantResponse deactivateProjectGrant(ProjectServiceDeactivateProjectGrantRequest projectServiceDeactivateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceDeactivateProjectGrantRequest;
    
    if (projectServiceDeactivateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceDeactivateProjectGrantRequest' when calling deactivateProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/DeactivateProjectGrant";

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

    TypeReference<ProjectServiceDeactivateProjectGrantResponse> localVarReturnType = new TypeReference<ProjectServiceDeactivateProjectGrantResponse>() {};
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
   * Delete Project
   * Delete an existing project.  In case the project is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.delete&#x60;
   * @param projectServiceDeleteProjectRequest  (required)
   * @return ProjectServiceDeleteProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceDeleteProjectResponse deleteProject(ProjectServiceDeleteProjectRequest projectServiceDeleteProjectRequest) throws ApiException {
    return this.deleteProject(projectServiceDeleteProjectRequest, Collections.emptyMap());
  }


  /**
   * Delete Project
   * Delete an existing project.  In case the project is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.delete&#x60;
   * @param projectServiceDeleteProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceDeleteProjectResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceDeleteProjectResponse deleteProject(ProjectServiceDeleteProjectRequest projectServiceDeleteProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceDeleteProjectRequest;
    
    if (projectServiceDeleteProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceDeleteProjectRequest' when calling deleteProject");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/DeleteProject";

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

    TypeReference<ProjectServiceDeleteProjectResponse> localVarReturnType = new TypeReference<ProjectServiceDeleteProjectResponse>() {};
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
   * Delete Project Grant
   * Delete a project grant. All user grants for this project grant will also be removed.  A user will not have access to the project afterward (if permissions are checked).  In case the project grant is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.grant.delete&#x60;
   * @param projectServiceDeleteProjectGrantRequest  (required)
   * @return ProjectServiceDeleteProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceDeleteProjectGrantResponse deleteProjectGrant(ProjectServiceDeleteProjectGrantRequest projectServiceDeleteProjectGrantRequest) throws ApiException {
    return this.deleteProjectGrant(projectServiceDeleteProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * Delete Project Grant
   * Delete a project grant. All user grants for this project grant will also be removed.  A user will not have access to the project afterward (if permissions are checked).  In case the project grant is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;project.grant.delete&#x60;
   * @param projectServiceDeleteProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceDeleteProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceDeleteProjectGrantResponse deleteProjectGrant(ProjectServiceDeleteProjectGrantRequest projectServiceDeleteProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceDeleteProjectGrantRequest;
    
    if (projectServiceDeleteProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceDeleteProjectGrantRequest' when calling deleteProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/DeleteProjectGrant";

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

    TypeReference<ProjectServiceDeleteProjectGrantResponse> localVarReturnType = new TypeReference<ProjectServiceDeleteProjectGrantResponse>() {};
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
   * Get Project
   * Returns the project identified by the requested ID.   Required permission:    - &#x60;project.read&#x60;
   * @param projectServiceGetProjectRequest  (required)
   * @return ProjectServiceGetProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceGetProjectResponse getProject(ProjectServiceGetProjectRequest projectServiceGetProjectRequest) throws ApiException {
    return this.getProject(projectServiceGetProjectRequest, Collections.emptyMap());
  }


  /**
   * Get Project
   * Returns the project identified by the requested ID.   Required permission:    - &#x60;project.read&#x60;
   * @param projectServiceGetProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceGetProjectResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceGetProjectResponse getProject(ProjectServiceGetProjectRequest projectServiceGetProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceGetProjectRequest;
    
    if (projectServiceGetProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceGetProjectRequest' when calling getProject");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/GetProject";

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

    TypeReference<ProjectServiceGetProjectResponse> localVarReturnType = new TypeReference<ProjectServiceGetProjectResponse>() {};
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
   * List Project Grants
   * Returns a list of project grants. A project grant is when the organization grants its project  to another organization.   Required permission:    - &#x60;project.grant.read&#x60;
   * @param projectServiceListProjectGrantsRequest  (required)
   * @return ProjectServiceListProjectGrantsResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceListProjectGrantsResponse listProjectGrants(ProjectServiceListProjectGrantsRequest projectServiceListProjectGrantsRequest) throws ApiException {
    return this.listProjectGrants(projectServiceListProjectGrantsRequest, Collections.emptyMap());
  }


  /**
   * List Project Grants
   * Returns a list of project grants. A project grant is when the organization grants its project  to another organization.   Required permission:    - &#x60;project.grant.read&#x60;
   * @param projectServiceListProjectGrantsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceListProjectGrantsResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceListProjectGrantsResponse listProjectGrants(ProjectServiceListProjectGrantsRequest projectServiceListProjectGrantsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceListProjectGrantsRequest;
    
    if (projectServiceListProjectGrantsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceListProjectGrantsRequest' when calling listProjectGrants");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/ListProjectGrants";

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

    TypeReference<ProjectServiceListProjectGrantsResponse> localVarReturnType = new TypeReference<ProjectServiceListProjectGrantsResponse>() {};
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
   * List Project Roles
   * Returns all roles of a project matching the search query.   Required permission:    - &#x60;project.role.read&#x60;
   * @param projectServiceListProjectRolesRequest  (required)
   * @return ProjectServiceListProjectRolesResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceListProjectRolesResponse listProjectRoles(ProjectServiceListProjectRolesRequest projectServiceListProjectRolesRequest) throws ApiException {
    return this.listProjectRoles(projectServiceListProjectRolesRequest, Collections.emptyMap());
  }


  /**
   * List Project Roles
   * Returns all roles of a project matching the search query.   Required permission:    - &#x60;project.role.read&#x60;
   * @param projectServiceListProjectRolesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceListProjectRolesResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceListProjectRolesResponse listProjectRoles(ProjectServiceListProjectRolesRequest projectServiceListProjectRolesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceListProjectRolesRequest;
    
    if (projectServiceListProjectRolesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceListProjectRolesRequest' when calling listProjectRoles");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/ListProjectRoles";

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

    TypeReference<ProjectServiceListProjectRolesResponse> localVarReturnType = new TypeReference<ProjectServiceListProjectRolesResponse>() {};
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
   * List Projects
   * List all matching projects. By default all projects of the instance that the caller  has permission to read are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;project.read&#x60;
   * @param projectServiceListProjectsRequest  (required)
   * @return ProjectServiceListProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceListProjectsResponse listProjects(ProjectServiceListProjectsRequest projectServiceListProjectsRequest) throws ApiException {
    return this.listProjects(projectServiceListProjectsRequest, Collections.emptyMap());
  }


  /**
   * List Projects
   * List all matching projects. By default all projects of the instance that the caller  has permission to read are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;project.read&#x60;
   * @param projectServiceListProjectsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceListProjectsResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceListProjectsResponse listProjects(ProjectServiceListProjectsRequest projectServiceListProjectsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceListProjectsRequest;
    
    if (projectServiceListProjectsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceListProjectsRequest' when calling listProjects");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/ListProjects";

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

    TypeReference<ProjectServiceListProjectsResponse> localVarReturnType = new TypeReference<ProjectServiceListProjectsResponse>() {};
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
   * Remove Project Role
   * Removes the role from the project and on every resource it has a dependency.  This includes project grants and user grants.   Required permission:    - &#x60;project.role.write&#x60;
   * @param projectServiceRemoveProjectRoleRequest  (required)
   * @return ProjectServiceRemoveProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceRemoveProjectRoleResponse removeProjectRole(ProjectServiceRemoveProjectRoleRequest projectServiceRemoveProjectRoleRequest) throws ApiException {
    return this.removeProjectRole(projectServiceRemoveProjectRoleRequest, Collections.emptyMap());
  }


  /**
   * Remove Project Role
   * Removes the role from the project and on every resource it has a dependency.  This includes project grants and user grants.   Required permission:    - &#x60;project.role.write&#x60;
   * @param projectServiceRemoveProjectRoleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceRemoveProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceRemoveProjectRoleResponse removeProjectRole(ProjectServiceRemoveProjectRoleRequest projectServiceRemoveProjectRoleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceRemoveProjectRoleRequest;
    
    if (projectServiceRemoveProjectRoleRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceRemoveProjectRoleRequest' when calling removeProjectRole");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/RemoveProjectRole";

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

    TypeReference<ProjectServiceRemoveProjectRoleResponse> localVarReturnType = new TypeReference<ProjectServiceRemoveProjectRoleResponse>() {};
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
   * Update Project
   * Update an existing project.   Required permission:    - &#x60;project.write&#x60;
   * @param projectServiceUpdateProjectRequest  (required)
   * @return ProjectServiceUpdateProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceUpdateProjectResponse updateProject(ProjectServiceUpdateProjectRequest projectServiceUpdateProjectRequest) throws ApiException {
    return this.updateProject(projectServiceUpdateProjectRequest, Collections.emptyMap());
  }


  /**
   * Update Project
   * Update an existing project.   Required permission:    - &#x60;project.write&#x60;
   * @param projectServiceUpdateProjectRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceUpdateProjectResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceUpdateProjectResponse updateProject(ProjectServiceUpdateProjectRequest projectServiceUpdateProjectRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceUpdateProjectRequest;
    
    if (projectServiceUpdateProjectRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceUpdateProjectRequest' when calling updateProject");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/UpdateProject";

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

    TypeReference<ProjectServiceUpdateProjectResponse> localVarReturnType = new TypeReference<ProjectServiceUpdateProjectResponse>() {};
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
   * Update Project Grant
   * Change the roles of the project that is granted to another organization.  The project grant will allow the granted organization to access the project and manage  the authorizations for its users.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param projectServiceUpdateProjectGrantRequest  (required)
   * @return ProjectServiceUpdateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceUpdateProjectGrantResponse updateProjectGrant(ProjectServiceUpdateProjectGrantRequest projectServiceUpdateProjectGrantRequest) throws ApiException {
    return this.updateProjectGrant(projectServiceUpdateProjectGrantRequest, Collections.emptyMap());
  }


  /**
   * Update Project Grant
   * Change the roles of the project that is granted to another organization.  The project grant will allow the granted organization to access the project and manage  the authorizations for its users.   Required permission:    - &#x60;project.grant.write&#x60;
   * @param projectServiceUpdateProjectGrantRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceUpdateProjectGrantResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceUpdateProjectGrantResponse updateProjectGrant(ProjectServiceUpdateProjectGrantRequest projectServiceUpdateProjectGrantRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceUpdateProjectGrantRequest;
    
    if (projectServiceUpdateProjectGrantRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceUpdateProjectGrantRequest' when calling updateProjectGrant");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/UpdateProjectGrant";

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

    TypeReference<ProjectServiceUpdateProjectGrantResponse> localVarReturnType = new TypeReference<ProjectServiceUpdateProjectGrantResponse>() {};
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
   * Update Project Role
   * Change a project role. The key is not editable. If a key should change, remove the role and create a new one.   Required permission:    - &#x60;project.role.write&#x60;
   * @param projectServiceUpdateProjectRoleRequest  (required)
   * @return ProjectServiceUpdateProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectServiceUpdateProjectRoleResponse updateProjectRole(ProjectServiceUpdateProjectRoleRequest projectServiceUpdateProjectRoleRequest) throws ApiException {
    return this.updateProjectRole(projectServiceUpdateProjectRoleRequest, Collections.emptyMap());
  }


  /**
   * Update Project Role
   * Change a project role. The key is not editable. If a key should change, remove the role and create a new one.   Required permission:    - &#x60;project.role.write&#x60;
   * @param projectServiceUpdateProjectRoleRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProjectServiceUpdateProjectRoleResponse
   * @throws ApiException if fails to make API call
   */
  private ProjectServiceUpdateProjectRoleResponse updateProjectRole(ProjectServiceUpdateProjectRoleRequest projectServiceUpdateProjectRoleRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = projectServiceUpdateProjectRoleRequest;
    
    if (projectServiceUpdateProjectRoleRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'projectServiceUpdateProjectRoleRequest' when calling updateProjectRole");
    }
    
    String localVarPath = "/zitadel.project.v2.ProjectService/UpdateProjectRole";

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

    TypeReference<ProjectServiceUpdateProjectRoleResponse> localVarReturnType = new TypeReference<ProjectServiceUpdateProjectRoleResponse>() {};
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
