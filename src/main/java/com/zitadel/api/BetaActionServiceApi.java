package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zitadel.ApiException;
import com.zitadel.model.*;

import java.util.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaActionServiceApi extends BaseApi {

  public BetaActionServiceApi() {
      super(ApiClient.defaultApiClient);
  }

  public BetaActionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * CreateTarget
   * Create Target   Create a new target to your endpoint, which can be used in executions.   Required permission:    - &#x60;action.target.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceCreateTargetRequest  (required)
   * @return BetaActionServiceCreateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceCreateTargetResponse createTarget(BetaActionServiceCreateTargetRequest betaActionServiceCreateTargetRequest) throws ApiException {
    return this.createTarget(betaActionServiceCreateTargetRequest, Collections.emptyMap());
  }


  /**
   * CreateTarget
   * Create Target   Create a new target to your endpoint, which can be used in executions.   Required permission:    - &#x60;action.target.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceCreateTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceCreateTargetResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceCreateTargetResponse createTarget(BetaActionServiceCreateTargetRequest betaActionServiceCreateTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaActionServiceCreateTargetRequest;

    if (betaActionServiceCreateTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaActionServiceCreateTargetRequest' when calling createTarget");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/CreateTarget";

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

    TypeReference<BetaActionServiceCreateTargetResponse> localVarReturnType = new TypeReference<BetaActionServiceCreateTargetResponse>() {};
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
   * @param betaActionServiceDeleteTargetRequest  (required)
   * @return BetaActionServiceDeleteTargetResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceDeleteTargetResponse deleteTarget(BetaActionServiceDeleteTargetRequest betaActionServiceDeleteTargetRequest) throws ApiException {
    return this.deleteTarget(betaActionServiceDeleteTargetRequest, Collections.emptyMap());
  }


  /**
   * DeleteTarget
   * Delete Target   Delete an existing target. This will remove it from any configured execution as well.  In case the target is not found, the request will return a successful response as  the desired state is already achieved.   Required permission:    - &#x60;action.target.delete&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceDeleteTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceDeleteTargetResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceDeleteTargetResponse deleteTarget(BetaActionServiceDeleteTargetRequest betaActionServiceDeleteTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaActionServiceDeleteTargetRequest;

    if (betaActionServiceDeleteTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaActionServiceDeleteTargetRequest' when calling deleteTarget");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/DeleteTarget";

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

    TypeReference<BetaActionServiceDeleteTargetResponse> localVarReturnType = new TypeReference<BetaActionServiceDeleteTargetResponse>() {};
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
   * @param betaActionServiceGetTargetRequest  (required)
   * @return BetaActionServiceGetTargetResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceGetTargetResponse getTarget(BetaActionServiceGetTargetRequest betaActionServiceGetTargetRequest) throws ApiException {
    return this.getTarget(betaActionServiceGetTargetRequest, Collections.emptyMap());
  }


  /**
   * GetTarget
   * Get Target   Returns the target identified by the requested ID.   Required permission:    - &#x60;action.target.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceGetTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceGetTargetResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceGetTargetResponse getTarget(BetaActionServiceGetTargetRequest betaActionServiceGetTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaActionServiceGetTargetRequest;

    if (betaActionServiceGetTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaActionServiceGetTargetRequest' when calling getTarget");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/GetTarget";

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

    TypeReference<BetaActionServiceGetTargetResponse> localVarReturnType = new TypeReference<BetaActionServiceGetTargetResponse>() {};
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
                * @return BetaActionServiceListExecutionFunctionsResponse
              * @throws ApiException if fails to make API call
              */
              public BetaActionServiceListExecutionFunctionsResponse listExecutionFunctions() throws ApiException {
              return this.listExecutionFunctions(new Object());
              }


  /**
   * ListExecutionFunctions
   * List Execution Functions   List all available functions which can be used as condition for executions.
   * @param body  (required)
   * @return BetaActionServiceListExecutionFunctionsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceListExecutionFunctionsResponse listExecutionFunctions(Object body) throws ApiException {
    return this.listExecutionFunctions(body, Collections.emptyMap());
  }


  /**
   * ListExecutionFunctions
   * List Execution Functions   List all available functions which can be used as condition for executions.
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceListExecutionFunctionsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceListExecutionFunctionsResponse listExecutionFunctions(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;

    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listExecutionFunctions");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/ListExecutionFunctions";

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

    TypeReference<BetaActionServiceListExecutionFunctionsResponse> localVarReturnType = new TypeReference<BetaActionServiceListExecutionFunctionsResponse>() {};
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
                * @return BetaActionServiceListExecutionMethodsResponse
              * @throws ApiException if fails to make API call
              */
              public BetaActionServiceListExecutionMethodsResponse listExecutionMethods() throws ApiException {
              return this.listExecutionMethods(new Object());
              }


  /**
   * ListExecutionMethods
   * List Execution Methods   List all available methods which can be used as condition for executions.
   * @param body  (required)
   * @return BetaActionServiceListExecutionMethodsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceListExecutionMethodsResponse listExecutionMethods(Object body) throws ApiException {
    return this.listExecutionMethods(body, Collections.emptyMap());
  }


  /**
   * ListExecutionMethods
   * List Execution Methods   List all available methods which can be used as condition for executions.
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceListExecutionMethodsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceListExecutionMethodsResponse listExecutionMethods(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;

    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listExecutionMethods");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/ListExecutionMethods";

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

    TypeReference<BetaActionServiceListExecutionMethodsResponse> localVarReturnType = new TypeReference<BetaActionServiceListExecutionMethodsResponse>() {};
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
                * @return BetaActionServiceListExecutionServicesResponse
              * @throws ApiException if fails to make API call
              */
              public BetaActionServiceListExecutionServicesResponse listExecutionServices() throws ApiException {
              return this.listExecutionServices(new Object());
              }


  /**
   * ListExecutionServices
   * List Execution Services   List all available services which can be used as condition for executions.
   * @param body  (required)
   * @return BetaActionServiceListExecutionServicesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceListExecutionServicesResponse listExecutionServices(Object body) throws ApiException {
    return this.listExecutionServices(body, Collections.emptyMap());
  }


  /**
   * ListExecutionServices
   * List Execution Services   List all available services which can be used as condition for executions.
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceListExecutionServicesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceListExecutionServicesResponse listExecutionServices(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;

    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling listExecutionServices");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/ListExecutionServices";

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

    TypeReference<BetaActionServiceListExecutionServicesResponse> localVarReturnType = new TypeReference<BetaActionServiceListExecutionServicesResponse>() {};
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
   * @param betaActionServiceListExecutionsRequest  (required)
   * @return BetaActionServiceListExecutionsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceListExecutionsResponse listExecutions(BetaActionServiceListExecutionsRequest betaActionServiceListExecutionsRequest) throws ApiException {
    return this.listExecutions(betaActionServiceListExecutionsRequest, Collections.emptyMap());
  }


  /**
   * ListExecutions
   * List Executions   List all matching executions. By default all executions of the instance are returned that have at least one execution target.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;action.execution.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceListExecutionsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceListExecutionsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceListExecutionsResponse listExecutions(BetaActionServiceListExecutionsRequest betaActionServiceListExecutionsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaActionServiceListExecutionsRequest;

    if (betaActionServiceListExecutionsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaActionServiceListExecutionsRequest' when calling listExecutions");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/ListExecutions";

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

    TypeReference<BetaActionServiceListExecutionsResponse> localVarReturnType = new TypeReference<BetaActionServiceListExecutionsResponse>() {};
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
   * @param betaActionServiceListTargetsRequest  (required)
   * @return BetaActionServiceListTargetsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceListTargetsResponse listTargets(BetaActionServiceListTargetsRequest betaActionServiceListTargetsRequest) throws ApiException {
    return this.listTargets(betaActionServiceListTargetsRequest, Collections.emptyMap());
  }


  /**
   * ListTargets
   * List targets   List all matching targets. By default all targets of the instance are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - &#x60;action.target.read&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceListTargetsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceListTargetsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceListTargetsResponse listTargets(BetaActionServiceListTargetsRequest betaActionServiceListTargetsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaActionServiceListTargetsRequest;

    if (betaActionServiceListTargetsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaActionServiceListTargetsRequest' when calling listTargets");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/ListTargets";

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

    TypeReference<BetaActionServiceListTargetsResponse> localVarReturnType = new TypeReference<BetaActionServiceListTargetsResponse>() {};
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
   * @param betaActionServiceSetExecutionRequest  (required)
   * @return BetaActionServiceSetExecutionResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceSetExecutionResponse setExecution(BetaActionServiceSetExecutionRequest betaActionServiceSetExecutionRequest) throws ApiException {
    return this.setExecution(betaActionServiceSetExecutionRequest, Collections.emptyMap());
  }


  /**
   * SetExecution
   * Set Execution   Sets an execution to call a target or include the targets of another execution.  Setting an empty list of targets will remove all targets from the execution, making it a noop.   Required permission:    - &#x60;action.execution.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceSetExecutionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceSetExecutionResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceSetExecutionResponse setExecution(BetaActionServiceSetExecutionRequest betaActionServiceSetExecutionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaActionServiceSetExecutionRequest;

    if (betaActionServiceSetExecutionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaActionServiceSetExecutionRequest' when calling setExecution");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/SetExecution";

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

    TypeReference<BetaActionServiceSetExecutionResponse> localVarReturnType = new TypeReference<BetaActionServiceSetExecutionResponse>() {};
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
   * @param betaActionServiceUpdateTargetRequest  (required)
   * @return BetaActionServiceUpdateTargetResponse
   * @throws ApiException if fails to make API call
   */
  public BetaActionServiceUpdateTargetResponse updateTarget(BetaActionServiceUpdateTargetRequest betaActionServiceUpdateTargetRequest) throws ApiException {
    return this.updateTarget(betaActionServiceUpdateTargetRequest, Collections.emptyMap());
  }


  /**
   * UpdateTarget
   * Update Target   Update an existing target.  To generate a new signing key set the optional expirationSigningKey.   Required permission:    - &#x60;action.target.write&#x60;   Required feature flag:    - &#x60;actions&#x60;
   * @param betaActionServiceUpdateTargetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaActionServiceUpdateTargetResponse
   * @throws ApiException if fails to make API call
   */
  private BetaActionServiceUpdateTargetResponse updateTarget(BetaActionServiceUpdateTargetRequest betaActionServiceUpdateTargetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaActionServiceUpdateTargetRequest;

    if (betaActionServiceUpdateTargetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaActionServiceUpdateTargetRequest' when calling updateTarget");
    }

    String localVarPath = "/zitadel.action.v2beta.ActionService/UpdateTarget";

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

    TypeReference<BetaActionServiceUpdateTargetResponse> localVarReturnType = new TypeReference<BetaActionServiceUpdateTargetResponse>() {};
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
