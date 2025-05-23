package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.ActionServiceBetaCreateTargetResponse;
import com.zitadel.model.ActionServiceBetaDeleteTargetResponse;
import com.zitadel.model.ActionServiceBetaGetTargetResponse;
import com.zitadel.model.ActionServiceBetaListExecutionFunctionsResponse;
import com.zitadel.model.ActionServiceBetaListExecutionMethodsResponse;
import com.zitadel.model.ActionServiceBetaListExecutionServicesResponse;
import com.zitadel.model.ActionServiceBetaListExecutionsResponse;
import com.zitadel.model.ActionServiceBetaListTargetsResponse;
import com.zitadel.model.ActionServiceBetaSetExecutionResponse;
import com.zitadel.model.ActionServiceBetaUpdateTargetResponse;
import com.zitadel.model.ActionServiceCreateTargetRequest;
import com.zitadel.model.ActionServiceListTargetsRequest;
import com.zitadel.model.ActionServiceRpcStatus;
import com.zitadel.model.ActionServiceSetExecutionRequest;
import com.zitadel.model.ActionServiceUpdateTargetRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ActionServiceApi extends BaseApi {

  public ActionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ActionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Create Target
   * Create a new target to your endpoint, which can be used in executions.  Required permission:   - &#x60;action.target.write&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param actionServiceCreateTargetRequest  (required)
   * @return ActionServiceBetaCreateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaCreateTargetResponse actionServiceCreateTarget(ActionServiceCreateTargetRequest actionServiceCreateTargetRequest) throws ApiException {
    return this.actionServiceCreateTarget(actionServiceCreateTargetRequest, Collections.emptyMap());
  }


  /**
   * Create Target
   * Create a new target to your endpoint, which can be used in executions.  Required permission:   - &#x60;action.target.write&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param actionServiceCreateTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaCreateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaCreateTargetResponse actionServiceCreateTarget(ActionServiceCreateTargetRequest actionServiceCreateTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceCreateTargetRequest;
    
    if (actionServiceCreateTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceCreateTargetRequest' when calling actionServiceCreateTarget");
    }
    
    String localVarPath = "/v2beta/actions/targets";

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

    TypeReference<ActionServiceBetaCreateTargetResponse> localVarReturnType = new TypeReference<ActionServiceBetaCreateTargetResponse>() {};
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
   * Delete Target
   * Delete an existing target. This will remove it from any configured execution as well. In case the target is not found, the request will return a successful response as the desired state is already achieved.  Required permission:   - &#x60;action.target.delete&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param id  (required)
   * @return ActionServiceBetaDeleteTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaDeleteTargetResponse actionServiceDeleteTarget(String id) throws ApiException {
    return this.actionServiceDeleteTarget(id, Collections.emptyMap());
  }


  /**
   * Delete Target
   * Delete an existing target. This will remove it from any configured execution as well. In case the target is not found, the request will return a successful response as the desired state is already achieved.  Required permission:   - &#x60;action.target.delete&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param id  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaDeleteTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaDeleteTargetResponse actionServiceDeleteTarget(String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling actionServiceDeleteTarget");
    }
    
    String localVarPath = "/v2beta/actions/targets/{id}"
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

    TypeReference<ActionServiceBetaDeleteTargetResponse> localVarReturnType = new TypeReference<ActionServiceBetaDeleteTargetResponse>() {};
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
   * Get Target
   * Returns the target identified by the requested ID.  Required permission:   - &#x60;action.target.read&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param id  (required)
   * @return ActionServiceBetaGetTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaGetTargetResponse actionServiceGetTarget(String id) throws ApiException {
    return this.actionServiceGetTarget(id, Collections.emptyMap());
  }


  /**
   * Get Target
   * Returns the target identified by the requested ID.  Required permission:   - &#x60;action.target.read&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param id  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaGetTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaGetTargetResponse actionServiceGetTarget(String id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling actionServiceGetTarget");
    }
    
    String localVarPath = "/v2beta/actions/targets/{id}"
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

    TypeReference<ActionServiceBetaGetTargetResponse> localVarReturnType = new TypeReference<ActionServiceBetaGetTargetResponse>() {};
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
   * List Execution Functions
   * List all available functions which can be used as condition for executions.
   * @return ActionServiceBetaListExecutionFunctionsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionFunctionsResponse actionServiceListExecutionFunctions() throws ApiException {
    return this.actionServiceListExecutionFunctions(Collections.emptyMap());
  }


  /**
   * List Execution Functions
   * List all available functions which can be used as condition for executions.
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaListExecutionFunctionsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionFunctionsResponse actionServiceListExecutionFunctions(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2beta/actions/executions/functions";

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

    TypeReference<ActionServiceBetaListExecutionFunctionsResponse> localVarReturnType = new TypeReference<ActionServiceBetaListExecutionFunctionsResponse>() {};
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
   * List Execution Methods
   * List all available methods which can be used as condition for executions.
   * @return ActionServiceBetaListExecutionMethodsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionMethodsResponse actionServiceListExecutionMethods() throws ApiException {
    return this.actionServiceListExecutionMethods(Collections.emptyMap());
  }


  /**
   * List Execution Methods
   * List all available methods which can be used as condition for executions.
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaListExecutionMethodsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionMethodsResponse actionServiceListExecutionMethods(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2beta/actions/executions/methods";

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

    TypeReference<ActionServiceBetaListExecutionMethodsResponse> localVarReturnType = new TypeReference<ActionServiceBetaListExecutionMethodsResponse>() {};
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
   * List Execution Services
   * List all available services which can be used as condition for executions.
   * @return ActionServiceBetaListExecutionServicesResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionServicesResponse actionServiceListExecutionServices() throws ApiException {
    return this.actionServiceListExecutionServices(Collections.emptyMap());
  }


  /**
   * List Execution Services
   * List all available services which can be used as condition for executions.
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaListExecutionServicesResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionServicesResponse actionServiceListExecutionServices(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2beta/actions/executions/services";

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

    TypeReference<ActionServiceBetaListExecutionServicesResponse> localVarReturnType = new TypeReference<ActionServiceBetaListExecutionServicesResponse>() {};
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
   * List Executions
   * List all matching executions. By default all executions of the instance are returned that have at least one execution target. Make sure to include a limit and sorting for pagination.  Required permission:   - &#x60;action.execution.read&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param paginationOffset Starting point for retrieval, in combination of offset used to query a set list of objects. (optional)
   * @param paginationLimit limit is the maximum amount of objects returned. The default is set to 100 with a maximum of 1000 in the runtime configuration. If the limit exceeds the maximum configured ZITADEL will throw an error. If no limit is present the default is taken. (optional)
   * @param paginationAsc Asc is the sorting order. If true the list is sorted ascending, if false the list is sorted descending. The default is descending. (optional)
   * @param sortingColumn The field the result is sorted by. The default is the creation date. Beware that if you change this, your result pagination might be inconsistent. (optional, default to EXECUTION_FIELD_NAME_UNSPECIFIED)
   * @return ActionServiceBetaListExecutionsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionsResponse actionServiceListExecutions(String paginationOffset, Long paginationLimit, Boolean paginationAsc, String sortingColumn) throws ApiException {
    return this.actionServiceListExecutions(paginationOffset, paginationLimit, paginationAsc, sortingColumn, Collections.emptyMap());
  }


  /**
   * List Executions
   * List all matching executions. By default all executions of the instance are returned that have at least one execution target. Make sure to include a limit and sorting for pagination.  Required permission:   - &#x60;action.execution.read&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param paginationOffset Starting point for retrieval, in combination of offset used to query a set list of objects. (optional)
   * @param paginationLimit limit is the maximum amount of objects returned. The default is set to 100 with a maximum of 1000 in the runtime configuration. If the limit exceeds the maximum configured ZITADEL will throw an error. If no limit is present the default is taken. (optional)
   * @param paginationAsc Asc is the sorting order. If true the list is sorted ascending, if false the list is sorted descending. The default is descending. (optional)
   * @param sortingColumn The field the result is sorted by. The default is the creation date. Beware that if you change this, your result pagination might be inconsistent. (optional, default to EXECUTION_FIELD_NAME_UNSPECIFIED)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaListExecutionsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListExecutionsResponse actionServiceListExecutions(String paginationOffset, Long paginationLimit, Boolean paginationAsc, String sortingColumn, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2beta/actions/executions/_search";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("pagination.offset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPair("pagination.limit", paginationLimit));
    localVarQueryParams.addAll(apiClient.parameterToPair("pagination.asc", paginationAsc));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortingColumn", sortingColumn));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<ActionServiceBetaListExecutionsResponse> localVarReturnType = new TypeReference<ActionServiceBetaListExecutionsResponse>() {};
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
   * List targets
   * List all matching targets. By default all targets of the instance are returned. Make sure to include a limit and sorting for pagination.  Required permission:   - &#x60;action.target.read&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param actionServiceListTargetsRequest  (required)
   * @return ActionServiceBetaListTargetsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListTargetsResponse actionServiceListTargets(ActionServiceListTargetsRequest actionServiceListTargetsRequest) throws ApiException {
    return this.actionServiceListTargets(actionServiceListTargetsRequest, Collections.emptyMap());
  }


  /**
   * List targets
   * List all matching targets. By default all targets of the instance are returned. Make sure to include a limit and sorting for pagination.  Required permission:   - &#x60;action.target.read&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param actionServiceListTargetsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaListTargetsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaListTargetsResponse actionServiceListTargets(ActionServiceListTargetsRequest actionServiceListTargetsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceListTargetsRequest;
    
    if (actionServiceListTargetsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceListTargetsRequest' when calling actionServiceListTargets");
    }
    
    String localVarPath = "/v2beta/actions/targets/_search";

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

    TypeReference<ActionServiceBetaListTargetsResponse> localVarReturnType = new TypeReference<ActionServiceBetaListTargetsResponse>() {};
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
   * Set Execution
   * Sets an execution to call a target or include the targets of another execution. Setting an empty list of targets will remove all targets from the execution, making it a noop.  Required permission:   - &#x60;action.execution.write&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param actionServiceSetExecutionRequest  (required)
   * @return ActionServiceBetaSetExecutionResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaSetExecutionResponse actionServiceSetExecution(ActionServiceSetExecutionRequest actionServiceSetExecutionRequest) throws ApiException {
    return this.actionServiceSetExecution(actionServiceSetExecutionRequest, Collections.emptyMap());
  }


  /**
   * Set Execution
   * Sets an execution to call a target or include the targets of another execution. Setting an empty list of targets will remove all targets from the execution, making it a noop.  Required permission:   - &#x60;action.execution.write&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param actionServiceSetExecutionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaSetExecutionResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaSetExecutionResponse actionServiceSetExecution(ActionServiceSetExecutionRequest actionServiceSetExecutionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceSetExecutionRequest;
    
    if (actionServiceSetExecutionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceSetExecutionRequest' when calling actionServiceSetExecution");
    }
    
    String localVarPath = "/v2beta/actions/executions";

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

    TypeReference<ActionServiceBetaSetExecutionResponse> localVarReturnType = new TypeReference<ActionServiceBetaSetExecutionResponse>() {};
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

  /**
   * Update Target
   * Update an existing target. To generate a new signing key set the optional expirationSigningKey.  Required permission:   - &#x60;action.target.write&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param id  (required)
   * @param actionServiceUpdateTargetRequest  (required)
   * @return ActionServiceBetaUpdateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaUpdateTargetResponse actionServiceUpdateTarget(String id, ActionServiceUpdateTargetRequest actionServiceUpdateTargetRequest) throws ApiException {
    return this.actionServiceUpdateTarget(id, actionServiceUpdateTargetRequest, Collections.emptyMap());
  }


  /**
   * Update Target
   * Update an existing target. To generate a new signing key set the optional expirationSigningKey.  Required permission:   - &#x60;action.target.write&#x60;  Required feature flag:   - &#x60;actions&#x60;
   * @param id  (required)
   * @param actionServiceUpdateTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceBetaUpdateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceBetaUpdateTargetResponse actionServiceUpdateTarget(String id, ActionServiceUpdateTargetRequest actionServiceUpdateTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceUpdateTargetRequest;
    
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling actionServiceUpdateTarget");
    }
    
    if (actionServiceUpdateTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceUpdateTargetRequest' when calling actionServiceUpdateTarget");
    }
    
    String localVarPath = "/v2beta/actions/targets/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<ActionServiceBetaUpdateTargetResponse> localVarReturnType = new TypeReference<ActionServiceBetaUpdateTargetResponse>() {};
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
