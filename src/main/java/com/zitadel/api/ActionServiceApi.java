package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.ActionServiceConnectError;
import com.zitadel.model.ActionServiceCreateTargetRequest;
import com.zitadel.model.ActionServiceCreateTargetResponse;
import com.zitadel.model.ActionServiceDeleteTargetRequest;
import com.zitadel.model.ActionServiceDeleteTargetResponse;
import com.zitadel.model.ActionServiceGetTargetRequest;
import com.zitadel.model.ActionServiceGetTargetResponse;
import com.zitadel.model.ActionServiceListExecutionFunctionsResponse;
import com.zitadel.model.ActionServiceListExecutionMethodsResponse;
import com.zitadel.model.ActionServiceListExecutionServicesResponse;
import com.zitadel.model.ActionServiceListExecutionsRequest;
import com.zitadel.model.ActionServiceListExecutionsResponse;
import com.zitadel.model.ActionServiceListTargetsRequest;
import com.zitadel.model.ActionServiceListTargetsResponse;
import com.zitadel.model.ActionServiceSetExecutionRequest;
import com.zitadel.model.ActionServiceSetExecutionResponse;
import com.zitadel.model.ActionServiceUpdateTargetRequest;
import com.zitadel.model.ActionServiceUpdateTargetResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class ActionServiceApi extends BaseApi {

  public ActionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ActionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * CreateTarget
   * Create Target   Create a new target to your endpoint, which can be used in executions.   Required permission:    - &#x60;action.target.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceCreateTargetRequest  (required)
   * @return ActionServiceCreateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceCreateTargetResponse createTarget(ActionServiceCreateTargetRequest actionServiceCreateTargetRequest) throws ApiException {
    return this.createTarget(actionServiceCreateTargetRequest, Collections.emptyMap());
  }


  /**
   * CreateTarget
   * Create Target   Create a new target to your endpoint, which can be used in executions.   Required permission:    - &#x60;action.target.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceCreateTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceCreateTargetResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceCreateTargetResponse createTarget(ActionServiceCreateTargetRequest actionServiceCreateTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceCreateTargetRequest;
    
    if (actionServiceCreateTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceCreateTargetRequest' when calling createTarget");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/CreateTarget";

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

    TypeReference<ActionServiceCreateTargetResponse> localVarReturnType = new TypeReference<ActionServiceCreateTargetResponse>() {};
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
   * DeleteTarget
   * Delete Target   Delete an existing target. This will remove it from any configured execution as well.  In case the target is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;action.target.delete&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceDeleteTargetRequest  (required)
   * @return ActionServiceDeleteTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceDeleteTargetResponse deleteTarget(ActionServiceDeleteTargetRequest actionServiceDeleteTargetRequest) throws ApiException {
    return this.deleteTarget(actionServiceDeleteTargetRequest, Collections.emptyMap());
  }


  /**
   * DeleteTarget
   * Delete Target   Delete an existing target. This will remove it from any configured execution as well.  In case the target is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;action.target.delete&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceDeleteTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceDeleteTargetResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceDeleteTargetResponse deleteTarget(ActionServiceDeleteTargetRequest actionServiceDeleteTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceDeleteTargetRequest;
    
    if (actionServiceDeleteTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceDeleteTargetRequest' when calling deleteTarget");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/DeleteTarget";

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

    TypeReference<ActionServiceDeleteTargetResponse> localVarReturnType = new TypeReference<ActionServiceDeleteTargetResponse>() {};
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
   * GetTarget
   * Get Target   Returns the target identified by the requested ID.   Required permission:    - &#x60;action.target.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceGetTargetRequest  (required)
   * @return ActionServiceGetTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceGetTargetResponse getTarget(ActionServiceGetTargetRequest actionServiceGetTargetRequest) throws ApiException {
    return this.getTarget(actionServiceGetTargetRequest, Collections.emptyMap());
  }


  /**
   * GetTarget
   * Get Target   Returns the target identified by the requested ID.   Required permission:    - &#x60;action.target.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceGetTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceGetTargetResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceGetTargetResponse getTarget(ActionServiceGetTargetRequest actionServiceGetTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceGetTargetRequest;
    
    if (actionServiceGetTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceGetTargetRequest' when calling getTarget");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/GetTarget";

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

    TypeReference<ActionServiceGetTargetResponse> localVarReturnType = new TypeReference<ActionServiceGetTargetResponse>() {};
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
              * ListExecutionFunctions (Convenience Method)
              * List Execution Functions   List all available functions which can be used as condition for executions.
                * @return ActionServiceListExecutionFunctionsResponse
              * @throws ApiException if fails to make API call
              */
              public ActionServiceListExecutionFunctionsResponse listExecutionFunctions() throws ApiException {
              return this.listExecutionFunctions(new Object());
              }


  /**
   * ListExecutionFunctions
   * List Execution Functions   List all available functions which can be used as condition for executions.
   * @param body  (required)
   * @return ActionServiceListExecutionFunctionsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceListExecutionFunctionsResponse listExecutionFunctions(Object body) throws ApiException {
    return this.listExecutionFunctions(body, Collections.emptyMap());
  }


  /**
   * ListExecutionFunctions
   * List Execution Functions   List all available functions which can be used as condition for executions.
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceListExecutionFunctionsResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceListExecutionFunctionsResponse listExecutionFunctions(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listExecutionFunctions");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/ListExecutionFunctions";

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

    TypeReference<ActionServiceListExecutionFunctionsResponse> localVarReturnType = new TypeReference<ActionServiceListExecutionFunctionsResponse>() {};
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
              * ListExecutionMethods (Convenience Method)
              * List Execution Methods   List all available methods which can be used as condition for executions.
                * @return ActionServiceListExecutionMethodsResponse
              * @throws ApiException if fails to make API call
              */
              public ActionServiceListExecutionMethodsResponse listExecutionMethods() throws ApiException {
              return this.listExecutionMethods(new Object());
              }


  /**
   * ListExecutionMethods
   * List Execution Methods   List all available methods which can be used as condition for executions.
   * @param body  (required)
   * @return ActionServiceListExecutionMethodsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceListExecutionMethodsResponse listExecutionMethods(Object body) throws ApiException {
    return this.listExecutionMethods(body, Collections.emptyMap());
  }


  /**
   * ListExecutionMethods
   * List Execution Methods   List all available methods which can be used as condition for executions.
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceListExecutionMethodsResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceListExecutionMethodsResponse listExecutionMethods(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listExecutionMethods");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/ListExecutionMethods";

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

    TypeReference<ActionServiceListExecutionMethodsResponse> localVarReturnType = new TypeReference<ActionServiceListExecutionMethodsResponse>() {};
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
              * ListExecutionServices (Convenience Method)
              * List Execution Services   List all available services which can be used as condition for executions.
                * @return ActionServiceListExecutionServicesResponse
              * @throws ApiException if fails to make API call
              */
              public ActionServiceListExecutionServicesResponse listExecutionServices() throws ApiException {
              return this.listExecutionServices(new Object());
              }


  /**
   * ListExecutionServices
   * List Execution Services   List all available services which can be used as condition for executions.
   * @param body  (required)
   * @return ActionServiceListExecutionServicesResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceListExecutionServicesResponse listExecutionServices(Object body) throws ApiException {
    return this.listExecutionServices(body, Collections.emptyMap());
  }


  /**
   * ListExecutionServices
   * List Execution Services   List all available services which can be used as condition for executions.
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceListExecutionServicesResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceListExecutionServicesResponse listExecutionServices(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listExecutionServices");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/ListExecutionServices";

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

    TypeReference<ActionServiceListExecutionServicesResponse> localVarReturnType = new TypeReference<ActionServiceListExecutionServicesResponse>() {};
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
   * ListExecutions
   * List Executions   List all matching executions. By default all executions of the instance are returned that have at least one execution target.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;action.execution.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceListExecutionsRequest  (required)
   * @return ActionServiceListExecutionsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceListExecutionsResponse listExecutions(ActionServiceListExecutionsRequest actionServiceListExecutionsRequest) throws ApiException {
    return this.listExecutions(actionServiceListExecutionsRequest, Collections.emptyMap());
  }


  /**
   * ListExecutions
   * List Executions   List all matching executions. By default all executions of the instance are returned that have at least one execution target.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;action.execution.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceListExecutionsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceListExecutionsResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceListExecutionsResponse listExecutions(ActionServiceListExecutionsRequest actionServiceListExecutionsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceListExecutionsRequest;
    
    if (actionServiceListExecutionsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceListExecutionsRequest' when calling listExecutions");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/ListExecutions";

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

    TypeReference<ActionServiceListExecutionsResponse> localVarReturnType = new TypeReference<ActionServiceListExecutionsResponse>() {};
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
   * ListTargets
   * List targets   List all matching targets. By default all targets of the instance are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;action.target.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceListTargetsRequest  (required)
   * @return ActionServiceListTargetsResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceListTargetsResponse listTargets(ActionServiceListTargetsRequest actionServiceListTargetsRequest) throws ApiException {
    return this.listTargets(actionServiceListTargetsRequest, Collections.emptyMap());
  }


  /**
   * ListTargets
   * List targets   List all matching targets. By default all targets of the instance are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;action.target.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceListTargetsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceListTargetsResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceListTargetsResponse listTargets(ActionServiceListTargetsRequest actionServiceListTargetsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceListTargetsRequest;
    
    if (actionServiceListTargetsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceListTargetsRequest' when calling listTargets");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/ListTargets";

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

    TypeReference<ActionServiceListTargetsResponse> localVarReturnType = new TypeReference<ActionServiceListTargetsResponse>() {};
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
   * SetExecution
   * Set Execution   Sets an execution to call a target or include the targets of another execution.  Setting an empty list of targets will remove all targets from the execution, making it a noop.   Required permission:    - &#x60;action.execution.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceSetExecutionRequest  (required)
   * @return ActionServiceSetExecutionResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceSetExecutionResponse setExecution(ActionServiceSetExecutionRequest actionServiceSetExecutionRequest) throws ApiException {
    return this.setExecution(actionServiceSetExecutionRequest, Collections.emptyMap());
  }


  /**
   * SetExecution
   * Set Execution   Sets an execution to call a target or include the targets of another execution.  Setting an empty list of targets will remove all targets from the execution, making it a noop.   Required permission:    - &#x60;action.execution.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceSetExecutionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceSetExecutionResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceSetExecutionResponse setExecution(ActionServiceSetExecutionRequest actionServiceSetExecutionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceSetExecutionRequest;
    
    if (actionServiceSetExecutionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceSetExecutionRequest' when calling setExecution");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/SetExecution";

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

    TypeReference<ActionServiceSetExecutionResponse> localVarReturnType = new TypeReference<ActionServiceSetExecutionResponse>() {};
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
   * UpdateTarget
   * Update Target   Update an existing target.  To generate a new signing key set the optional expirationSigningKey.   Required permission:    - &#x60;action.target.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceUpdateTargetRequest  (required)
   * @return ActionServiceUpdateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public ActionServiceUpdateTargetResponse updateTarget(ActionServiceUpdateTargetRequest actionServiceUpdateTargetRequest) throws ApiException {
    return this.updateTarget(actionServiceUpdateTargetRequest, Collections.emptyMap());
  }


  /**
   * UpdateTarget
   * Update Target   Update an existing target.  To generate a new signing key set the optional expirationSigningKey.   Required permission:    - &#x60;action.target.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param actionServiceUpdateTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ActionServiceUpdateTargetResponse
   * @throws ApiException if fails to make API call
   */
  private ActionServiceUpdateTargetResponse updateTarget(ActionServiceUpdateTargetRequest actionServiceUpdateTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = actionServiceUpdateTargetRequest;
    
    if (actionServiceUpdateTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'actionServiceUpdateTargetRequest' when calling updateTarget");
    }
    
    String localVarPath = "/zitadel.action.v2.ActionService/UpdateTarget";

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

    TypeReference<ActionServiceUpdateTargetResponse> localVarReturnType = new TypeReference<ActionServiceUpdateTargetResponse>() {};
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
