package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaAppServiceConnectError;
import com.zitadel.model.BetaAppServiceCreateApplicationKeyRequest;
import com.zitadel.model.BetaAppServiceCreateApplicationKeyResponse;
import com.zitadel.model.BetaAppServiceCreateApplicationRequest;
import com.zitadel.model.BetaAppServiceCreateApplicationResponse;
import com.zitadel.model.BetaAppServiceDeactivateApplicationRequest;
import com.zitadel.model.BetaAppServiceDeactivateApplicationResponse;
import com.zitadel.model.BetaAppServiceDeleteApplicationKeyRequest;
import com.zitadel.model.BetaAppServiceDeleteApplicationKeyResponse;
import com.zitadel.model.BetaAppServiceDeleteApplicationRequest;
import com.zitadel.model.BetaAppServiceDeleteApplicationResponse;
import com.zitadel.model.BetaAppServiceGetApplicationKeyRequest;
import com.zitadel.model.BetaAppServiceGetApplicationKeyResponse;
import com.zitadel.model.BetaAppServiceGetApplicationRequest;
import com.zitadel.model.BetaAppServiceGetApplicationResponse;
import com.zitadel.model.BetaAppServiceListApplicationKeysRequest;
import com.zitadel.model.BetaAppServiceListApplicationKeysResponse;
import com.zitadel.model.BetaAppServiceListApplicationsRequest;
import com.zitadel.model.BetaAppServiceListApplicationsResponse;
import com.zitadel.model.BetaAppServiceReactivateApplicationRequest;
import com.zitadel.model.BetaAppServiceReactivateApplicationResponse;
import com.zitadel.model.BetaAppServiceRegenerateClientSecretRequest;
import com.zitadel.model.BetaAppServiceRegenerateClientSecretResponse;
import com.zitadel.model.BetaAppServiceUpdateApplicationRequest;
import com.zitadel.model.BetaAppServiceUpdateApplicationResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class BetaAppServiceApi extends BaseApi {

  public BetaAppServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaAppServiceApi(ApiClient apiClient) {
    super(apiClient);
  }



              /**
              * Create Application (Convenience Method)
              * Deprecated: use [application service v2 CreateApplication](apis/resources/application_service_v2/application-service-create-application.api.mdx) instead.   Create an application. The application can be OIDC, API or SAML type, based on the input.   Required permissions:    - project.app.write
                * @return BetaAppServiceCreateApplicationResponse
              * @throws ApiException if fails to make API call
              */
              public BetaAppServiceCreateApplicationResponse createApplication() throws ApiException {
              return this.createApplication(new BetaAppServiceCreateApplicationRequest());
              }


  /**
   * Create Application
   * Deprecated: use [application service v2 CreateApplication](apis/resources/application_service_v2/application-service-create-application.api.mdx) instead.   Create an application. The application can be OIDC, API or SAML type, based on the input.   Required permissions:    - project.app.write
   * @param betaAppServiceCreateApplicationRequest  (required)
   * @return BetaAppServiceCreateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceCreateApplicationResponse createApplication(BetaAppServiceCreateApplicationRequest betaAppServiceCreateApplicationRequest) throws ApiException {
    return this.createApplication(betaAppServiceCreateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Create Application
   * Deprecated: use [application service v2 CreateApplication](apis/resources/application_service_v2/application-service-create-application.api.mdx) instead.   Create an application. The application can be OIDC, API or SAML type, based on the input.   Required permissions:    - project.app.write
   * @param betaAppServiceCreateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceCreateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceCreateApplicationResponse createApplication(BetaAppServiceCreateApplicationRequest betaAppServiceCreateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceCreateApplicationRequest;
    
    if (betaAppServiceCreateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceCreateApplicationRequest' when calling createApplication");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/CreateApplication";

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

    TypeReference<BetaAppServiceCreateApplicationResponse> localVarReturnType = new TypeReference<BetaAppServiceCreateApplicationResponse>() {};
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
   * Create Application Key
   * Deprecated: use [application service v2 CreateApplicationKey](apis/resources/application_service_v2/application-service-create-application-key.api.mdx) instead.   Create a new application key, which is used to authorize an API application.   Key details are returned in the response. They must be stored safely, as it will not  be possible to retrieve them again.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param betaAppServiceCreateApplicationKeyRequest  (required)
   * @return BetaAppServiceCreateApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceCreateApplicationKeyResponse createApplicationKey(BetaAppServiceCreateApplicationKeyRequest betaAppServiceCreateApplicationKeyRequest) throws ApiException {
    return this.createApplicationKey(betaAppServiceCreateApplicationKeyRequest, Collections.emptyMap());
  }


  /**
   * Create Application Key
   * Deprecated: use [application service v2 CreateApplicationKey](apis/resources/application_service_v2/application-service-create-application-key.api.mdx) instead.   Create a new application key, which is used to authorize an API application.   Key details are returned in the response. They must be stored safely, as it will not  be possible to retrieve them again.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param betaAppServiceCreateApplicationKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceCreateApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceCreateApplicationKeyResponse createApplicationKey(BetaAppServiceCreateApplicationKeyRequest betaAppServiceCreateApplicationKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceCreateApplicationKeyRequest;
    
    if (betaAppServiceCreateApplicationKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceCreateApplicationKeyRequest' when calling createApplicationKey");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/CreateApplicationKey";

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

    TypeReference<BetaAppServiceCreateApplicationKeyResponse> localVarReturnType = new TypeReference<BetaAppServiceCreateApplicationKeyResponse>() {};
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
   * Deactivate Application
   * Deprecated: use [application service v2 DeactivateApplication](apis/resources/application_service_v2/application-service-deactivate-application.api.mdx) instead.   Deactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param betaAppServiceDeactivateApplicationRequest  (required)
   * @return BetaAppServiceDeactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceDeactivateApplicationResponse deactivateApplication(BetaAppServiceDeactivateApplicationRequest betaAppServiceDeactivateApplicationRequest) throws ApiException {
    return this.deactivateApplication(betaAppServiceDeactivateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Deactivate Application
   * Deprecated: use [application service v2 DeactivateApplication](apis/resources/application_service_v2/application-service-deactivate-application.api.mdx) instead.   Deactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param betaAppServiceDeactivateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceDeactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceDeactivateApplicationResponse deactivateApplication(BetaAppServiceDeactivateApplicationRequest betaAppServiceDeactivateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceDeactivateApplicationRequest;
    
    if (betaAppServiceDeactivateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceDeactivateApplicationRequest' when calling deactivateApplication");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/DeactivateApplication";

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

    TypeReference<BetaAppServiceDeactivateApplicationResponse> localVarReturnType = new TypeReference<BetaAppServiceDeactivateApplicationResponse>() {};
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
   * Delete Application
   * Deprecated: use [application service v2 DeleteApplication](apis/resources/application_service_v2/application-service-delete-application.api.mdx) instead.   Deletes the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.delete
   * @param betaAppServiceDeleteApplicationRequest  (required)
   * @return BetaAppServiceDeleteApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceDeleteApplicationResponse deleteApplication(BetaAppServiceDeleteApplicationRequest betaAppServiceDeleteApplicationRequest) throws ApiException {
    return this.deleteApplication(betaAppServiceDeleteApplicationRequest, Collections.emptyMap());
  }


  /**
   * Delete Application
   * Deprecated: use [application service v2 DeleteApplication](apis/resources/application_service_v2/application-service-delete-application.api.mdx) instead.   Deletes the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.delete
   * @param betaAppServiceDeleteApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceDeleteApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceDeleteApplicationResponse deleteApplication(BetaAppServiceDeleteApplicationRequest betaAppServiceDeleteApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceDeleteApplicationRequest;
    
    if (betaAppServiceDeleteApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceDeleteApplicationRequest' when calling deleteApplication");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/DeleteApplication";

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

    TypeReference<BetaAppServiceDeleteApplicationResponse> localVarReturnType = new TypeReference<BetaAppServiceDeleteApplicationResponse>() {};
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
   * Delete Application Key
   * Deprecated: use [application service v2 DeleteApplicationKey](apis/resources/application_service_v2/application-service-delete-application-key.api.mdx) instead.   Deletes an application key matching the provided ID.   Organization ID is not mandatory, but helps with filtering/performance.   The deletion time is returned in response message.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param betaAppServiceDeleteApplicationKeyRequest  (required)
   * @return BetaAppServiceDeleteApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceDeleteApplicationKeyResponse deleteApplicationKey(BetaAppServiceDeleteApplicationKeyRequest betaAppServiceDeleteApplicationKeyRequest) throws ApiException {
    return this.deleteApplicationKey(betaAppServiceDeleteApplicationKeyRequest, Collections.emptyMap());
  }


  /**
   * Delete Application Key
   * Deprecated: use [application service v2 DeleteApplicationKey](apis/resources/application_service_v2/application-service-delete-application-key.api.mdx) instead.   Deletes an application key matching the provided ID.   Organization ID is not mandatory, but helps with filtering/performance.   The deletion time is returned in response message.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param betaAppServiceDeleteApplicationKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceDeleteApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceDeleteApplicationKeyResponse deleteApplicationKey(BetaAppServiceDeleteApplicationKeyRequest betaAppServiceDeleteApplicationKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceDeleteApplicationKeyRequest;
    
    if (betaAppServiceDeleteApplicationKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceDeleteApplicationKeyRequest' when calling deleteApplicationKey");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/DeleteApplicationKey";

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

    TypeReference<BetaAppServiceDeleteApplicationKeyResponse> localVarReturnType = new TypeReference<BetaAppServiceDeleteApplicationKeyResponse>() {};
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
   * Get Application
   * Deprecated: use [application service v2 GetApplication](apis/resources/application_service_v2/application-service-get-application.api.mdx) instead.   Retrieves the application matching the provided ID.   Required permissions:    - project.app.read
   * @param betaAppServiceGetApplicationRequest  (required)
   * @return BetaAppServiceGetApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceGetApplicationResponse getApplication(BetaAppServiceGetApplicationRequest betaAppServiceGetApplicationRequest) throws ApiException {
    return this.getApplication(betaAppServiceGetApplicationRequest, Collections.emptyMap());
  }


  /**
   * Get Application
   * Deprecated: use [application service v2 GetApplication](apis/resources/application_service_v2/application-service-get-application.api.mdx) instead.   Retrieves the application matching the provided ID.   Required permissions:    - project.app.read
   * @param betaAppServiceGetApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceGetApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceGetApplicationResponse getApplication(BetaAppServiceGetApplicationRequest betaAppServiceGetApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceGetApplicationRequest;
    
    if (betaAppServiceGetApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceGetApplicationRequest' when calling getApplication");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/GetApplication";

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

    TypeReference<BetaAppServiceGetApplicationResponse> localVarReturnType = new TypeReference<BetaAppServiceGetApplicationResponse>() {};
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
   * Get Application Key
   * Deprecated: use [application service v2 GetApplicationKey](apis/resources/application_service_v2/application-service-get-application-key.api.mdx) instead.   Retrieves the application key matching the provided ID.   Specifying a project, organization and app ID is optional but help with filtering/performance.   Required permissions:    - project.app.read
   * @param betaAppServiceGetApplicationKeyRequest  (required)
   * @return BetaAppServiceGetApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceGetApplicationKeyResponse getApplicationKey(BetaAppServiceGetApplicationKeyRequest betaAppServiceGetApplicationKeyRequest) throws ApiException {
    return this.getApplicationKey(betaAppServiceGetApplicationKeyRequest, Collections.emptyMap());
  }


  /**
   * Get Application Key
   * Deprecated: use [application service v2 GetApplicationKey](apis/resources/application_service_v2/application-service-get-application-key.api.mdx) instead.   Retrieves the application key matching the provided ID.   Specifying a project, organization and app ID is optional but help with filtering/performance.   Required permissions:    - project.app.read
   * @param betaAppServiceGetApplicationKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceGetApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceGetApplicationKeyResponse getApplicationKey(BetaAppServiceGetApplicationKeyRequest betaAppServiceGetApplicationKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceGetApplicationKeyRequest;
    
    if (betaAppServiceGetApplicationKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceGetApplicationKeyRequest' when calling getApplicationKey");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/GetApplicationKey";

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

    TypeReference<BetaAppServiceGetApplicationKeyResponse> localVarReturnType = new TypeReference<BetaAppServiceGetApplicationKeyResponse>() {};
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
              * List Application Keys (Convenience Method)
              * Deprecated: use [application service v2 ListApplicationKeys](apis/resources/application_service_v2/application-service-list-application-keys.api.mdx) instead.   Returns a list of application keys matching the input parameters.   The result can be sorted by id, aggregate, creation date, expiration date, resource owner or type.  It can also be filtered by app, project or organization ID.   Required permissions:    - project.app.read
                * @return BetaAppServiceListApplicationKeysResponse
              * @throws ApiException if fails to make API call
              */
              public BetaAppServiceListApplicationKeysResponse listApplicationKeys() throws ApiException {
              return this.listApplicationKeys(new BetaAppServiceListApplicationKeysRequest());
              }


  /**
   * List Application Keys
   * Deprecated: use [application service v2 ListApplicationKeys](apis/resources/application_service_v2/application-service-list-application-keys.api.mdx) instead.   Returns a list of application keys matching the input parameters.   The result can be sorted by id, aggregate, creation date, expiration date, resource owner or type.  It can also be filtered by app, project or organization ID.   Required permissions:    - project.app.read
   * @param betaAppServiceListApplicationKeysRequest  (required)
   * @return BetaAppServiceListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceListApplicationKeysResponse listApplicationKeys(BetaAppServiceListApplicationKeysRequest betaAppServiceListApplicationKeysRequest) throws ApiException {
    return this.listApplicationKeys(betaAppServiceListApplicationKeysRequest, Collections.emptyMap());
  }


  /**
   * List Application Keys
   * Deprecated: use [application service v2 ListApplicationKeys](apis/resources/application_service_v2/application-service-list-application-keys.api.mdx) instead.   Returns a list of application keys matching the input parameters.   The result can be sorted by id, aggregate, creation date, expiration date, resource owner or type.  It can also be filtered by app, project or organization ID.   Required permissions:    - project.app.read
   * @param betaAppServiceListApplicationKeysRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceListApplicationKeysResponse listApplicationKeys(BetaAppServiceListApplicationKeysRequest betaAppServiceListApplicationKeysRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceListApplicationKeysRequest;
    
    if (betaAppServiceListApplicationKeysRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceListApplicationKeysRequest' when calling listApplicationKeys");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/ListApplicationKeys";

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

    TypeReference<BetaAppServiceListApplicationKeysResponse> localVarReturnType = new TypeReference<BetaAppServiceListApplicationKeysResponse>() {};
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
   * List Applications
   * Deprecated: use [application service v2 ListApplications](apis/resources/application_service_v2/application-service-list-applications.api.mdx) instead.   Returns a list of applications matching the input parameters that belong to the provided  project.   The result can be sorted by app id, name, creation date, change date or state. It can also  be filtered by app state, app type and app name.   Required permissions:    - project.app.read
   * @param betaAppServiceListApplicationsRequest  (required)
   * @return BetaAppServiceListApplicationsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceListApplicationsResponse listApplications(BetaAppServiceListApplicationsRequest betaAppServiceListApplicationsRequest) throws ApiException {
    return this.listApplications(betaAppServiceListApplicationsRequest, Collections.emptyMap());
  }


  /**
   * List Applications
   * Deprecated: use [application service v2 ListApplications](apis/resources/application_service_v2/application-service-list-applications.api.mdx) instead.   Returns a list of applications matching the input parameters that belong to the provided  project.   The result can be sorted by app id, name, creation date, change date or state. It can also  be filtered by app state, app type and app name.   Required permissions:    - project.app.read
   * @param betaAppServiceListApplicationsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceListApplicationsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceListApplicationsResponse listApplications(BetaAppServiceListApplicationsRequest betaAppServiceListApplicationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceListApplicationsRequest;
    
    if (betaAppServiceListApplicationsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceListApplicationsRequest' when calling listApplications");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/ListApplications";

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

    TypeReference<BetaAppServiceListApplicationsResponse> localVarReturnType = new TypeReference<BetaAppServiceListApplicationsResponse>() {};
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
   * Reactivate Application
   * Deprecated: use [application service v2 ReactivateApplication](apis/resources/application_service_v2/application-service-reactivate-application.api.mdx) instead.   Reactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param betaAppServiceReactivateApplicationRequest  (required)
   * @return BetaAppServiceReactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceReactivateApplicationResponse reactivateApplication(BetaAppServiceReactivateApplicationRequest betaAppServiceReactivateApplicationRequest) throws ApiException {
    return this.reactivateApplication(betaAppServiceReactivateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Reactivate Application
   * Deprecated: use [application service v2 ReactivateApplication](apis/resources/application_service_v2/application-service-reactivate-application.api.mdx) instead.   Reactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param betaAppServiceReactivateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceReactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceReactivateApplicationResponse reactivateApplication(BetaAppServiceReactivateApplicationRequest betaAppServiceReactivateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceReactivateApplicationRequest;
    
    if (betaAppServiceReactivateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceReactivateApplicationRequest' when calling reactivateApplication");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/ReactivateApplication";

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

    TypeReference<BetaAppServiceReactivateApplicationResponse> localVarReturnType = new TypeReference<BetaAppServiceReactivateApplicationResponse>() {};
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
              * Regenerate Client Secret (Convenience Method)
              * Deprecated: use [application service v2 GenerateClientSecret](apis/resources/application_service_v2/application-service-generate-client-secret.api.mdx) instead.   Regenerates the client secret of an API or OIDC application that belongs to the input project.    Required permissions:    - project.app.write
                * @return BetaAppServiceRegenerateClientSecretResponse
              * @throws ApiException if fails to make API call
              */
              public BetaAppServiceRegenerateClientSecretResponse regenerateClientSecret() throws ApiException {
              return this.regenerateClientSecret(new BetaAppServiceRegenerateClientSecretRequest());
              }


  /**
   * Regenerate Client Secret
   * Deprecated: use [application service v2 GenerateClientSecret](apis/resources/application_service_v2/application-service-generate-client-secret.api.mdx) instead.   Regenerates the client secret of an API or OIDC application that belongs to the input project.    Required permissions:    - project.app.write
   * @param betaAppServiceRegenerateClientSecretRequest  (required)
   * @return BetaAppServiceRegenerateClientSecretResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceRegenerateClientSecretResponse regenerateClientSecret(BetaAppServiceRegenerateClientSecretRequest betaAppServiceRegenerateClientSecretRequest) throws ApiException {
    return this.regenerateClientSecret(betaAppServiceRegenerateClientSecretRequest, Collections.emptyMap());
  }


  /**
   * Regenerate Client Secret
   * Deprecated: use [application service v2 GenerateClientSecret](apis/resources/application_service_v2/application-service-generate-client-secret.api.mdx) instead.   Regenerates the client secret of an API or OIDC application that belongs to the input project.    Required permissions:    - project.app.write
   * @param betaAppServiceRegenerateClientSecretRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceRegenerateClientSecretResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceRegenerateClientSecretResponse regenerateClientSecret(BetaAppServiceRegenerateClientSecretRequest betaAppServiceRegenerateClientSecretRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceRegenerateClientSecretRequest;
    
    if (betaAppServiceRegenerateClientSecretRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceRegenerateClientSecretRequest' when calling regenerateClientSecret");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/RegenerateClientSecret";

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

    TypeReference<BetaAppServiceRegenerateClientSecretResponse> localVarReturnType = new TypeReference<BetaAppServiceRegenerateClientSecretResponse>() {};
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
              * Update Application (Convenience Method)
              * Deprecated: use [application service v2 UpdateApplication](apis/resources/application_service_v2/zitadel-app-v-2-application-service-update-application.api.mdx) instead.   Changes the configuration of an OIDC, API or SAML type application, as well as  the application name, based on the input provided.   Required permissions:    - project.app.write
                * @return BetaAppServiceUpdateApplicationResponse
              * @throws ApiException if fails to make API call
              */
              public BetaAppServiceUpdateApplicationResponse updateApplication() throws ApiException {
              return this.updateApplication(new BetaAppServiceUpdateApplicationRequest());
              }


  /**
   * Update Application
   * Deprecated: use [application service v2 UpdateApplication](apis/resources/application_service_v2/zitadel-app-v-2-application-service-update-application.api.mdx) instead.   Changes the configuration of an OIDC, API or SAML type application, as well as  the application name, based on the input provided.   Required permissions:    - project.app.write
   * @param betaAppServiceUpdateApplicationRequest  (required)
   * @return BetaAppServiceUpdateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaAppServiceUpdateApplicationResponse updateApplication(BetaAppServiceUpdateApplicationRequest betaAppServiceUpdateApplicationRequest) throws ApiException {
    return this.updateApplication(betaAppServiceUpdateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Update Application
   * Deprecated: use [application service v2 UpdateApplication](apis/resources/application_service_v2/zitadel-app-v-2-application-service-update-application.api.mdx) instead.   Changes the configuration of an OIDC, API or SAML type application, as well as  the application name, based on the input provided.   Required permissions:    - project.app.write
   * @param betaAppServiceUpdateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaAppServiceUpdateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaAppServiceUpdateApplicationResponse updateApplication(BetaAppServiceUpdateApplicationRequest betaAppServiceUpdateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaAppServiceUpdateApplicationRequest;
    
    if (betaAppServiceUpdateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaAppServiceUpdateApplicationRequest' when calling updateApplication");
    }
    
    String localVarPath = "/zitadel.app.v2beta.AppService/UpdateApplication";

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

    TypeReference<BetaAppServiceUpdateApplicationResponse> localVarReturnType = new TypeReference<BetaAppServiceUpdateApplicationResponse>() {};
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
