package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.ApplicationServiceConnectError;
import com.zitadel.model.ApplicationServiceCreateApplicationKeyRequest;
import com.zitadel.model.ApplicationServiceCreateApplicationKeyResponse;
import com.zitadel.model.ApplicationServiceCreateApplicationRequest;
import com.zitadel.model.ApplicationServiceCreateApplicationResponse;
import com.zitadel.model.ApplicationServiceDeactivateApplicationRequest;
import com.zitadel.model.ApplicationServiceDeactivateApplicationResponse;
import com.zitadel.model.ApplicationServiceDeleteApplicationKeyRequest;
import com.zitadel.model.ApplicationServiceDeleteApplicationKeyResponse;
import com.zitadel.model.ApplicationServiceDeleteApplicationRequest;
import com.zitadel.model.ApplicationServiceDeleteApplicationResponse;
import com.zitadel.model.ApplicationServiceGenerateClientSecretRequest;
import com.zitadel.model.ApplicationServiceGenerateClientSecretResponse;
import com.zitadel.model.ApplicationServiceGetApplicationKeyRequest;
import com.zitadel.model.ApplicationServiceGetApplicationKeyResponse;
import com.zitadel.model.ApplicationServiceGetApplicationRequest;
import com.zitadel.model.ApplicationServiceGetApplicationResponse;
import com.zitadel.model.ApplicationServiceListApplicationKeysRequest;
import com.zitadel.model.ApplicationServiceListApplicationKeysResponse;
import com.zitadel.model.ApplicationServiceListApplicationsRequest;
import com.zitadel.model.ApplicationServiceListApplicationsResponse;
import com.zitadel.model.ApplicationServiceReactivateApplicationRequest;
import com.zitadel.model.ApplicationServiceReactivateApplicationResponse;
import com.zitadel.model.ApplicationServiceUpdateApplicationRequest;
import com.zitadel.model.ApplicationServiceUpdateApplicationResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class ApplicationServiceApi extends BaseApi {

  public ApplicationServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ApplicationServiceApi(ApiClient apiClient) {
    super(apiClient);
  }



              /**
              * Create Application (Convenience Method)
              * Create an application. The application can be OIDC, API or SAML type, based on the input.   Required permissions:    - project.app.write
                * @return ApplicationServiceCreateApplicationResponse
              * @throws ApiException if fails to make API call
              */
              public ApplicationServiceCreateApplicationResponse createApplication() throws ApiException {
              return this.createApplication(new ApplicationServiceCreateApplicationRequest());
              }


  /**
   * Create Application
   * Create an application. The application can be OIDC, API or SAML type, based on the input.   Required permissions:    - project.app.write
   * @param applicationServiceCreateApplicationRequest  (required)
   * @return ApplicationServiceCreateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceCreateApplicationResponse createApplication(ApplicationServiceCreateApplicationRequest applicationServiceCreateApplicationRequest) throws ApiException {
    return this.createApplication(applicationServiceCreateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Create Application
   * Create an application. The application can be OIDC, API or SAML type, based on the input.   Required permissions:    - project.app.write
   * @param applicationServiceCreateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceCreateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceCreateApplicationResponse createApplication(ApplicationServiceCreateApplicationRequest applicationServiceCreateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceCreateApplicationRequest;
    
    if (applicationServiceCreateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceCreateApplicationRequest' when calling createApplication");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/CreateApplication";

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

    TypeReference<ApplicationServiceCreateApplicationResponse> localVarReturnType = new TypeReference<ApplicationServiceCreateApplicationResponse>() {};
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
   * Create a new application key, which is used to authorize an API application.   Key details are returned in the response. They must be stored safely, as it will not  be possible to retrieve them again.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param applicationServiceCreateApplicationKeyRequest  (required)
   * @return ApplicationServiceCreateApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceCreateApplicationKeyResponse createApplicationKey(ApplicationServiceCreateApplicationKeyRequest applicationServiceCreateApplicationKeyRequest) throws ApiException {
    return this.createApplicationKey(applicationServiceCreateApplicationKeyRequest, Collections.emptyMap());
  }


  /**
   * Create Application Key
   * Create a new application key, which is used to authorize an API application.   Key details are returned in the response. They must be stored safely, as it will not  be possible to retrieve them again.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param applicationServiceCreateApplicationKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceCreateApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceCreateApplicationKeyResponse createApplicationKey(ApplicationServiceCreateApplicationKeyRequest applicationServiceCreateApplicationKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceCreateApplicationKeyRequest;
    
    if (applicationServiceCreateApplicationKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceCreateApplicationKeyRequest' when calling createApplicationKey");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/CreateApplicationKey";

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

    TypeReference<ApplicationServiceCreateApplicationKeyResponse> localVarReturnType = new TypeReference<ApplicationServiceCreateApplicationKeyResponse>() {};
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
   * Deactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param applicationServiceDeactivateApplicationRequest  (required)
   * @return ApplicationServiceDeactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceDeactivateApplicationResponse deactivateApplication(ApplicationServiceDeactivateApplicationRequest applicationServiceDeactivateApplicationRequest) throws ApiException {
    return this.deactivateApplication(applicationServiceDeactivateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Deactivate Application
   * Deactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param applicationServiceDeactivateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceDeactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceDeactivateApplicationResponse deactivateApplication(ApplicationServiceDeactivateApplicationRequest applicationServiceDeactivateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceDeactivateApplicationRequest;
    
    if (applicationServiceDeactivateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceDeactivateApplicationRequest' when calling deactivateApplication");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/DeactivateApplication";

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

    TypeReference<ApplicationServiceDeactivateApplicationResponse> localVarReturnType = new TypeReference<ApplicationServiceDeactivateApplicationResponse>() {};
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
   * Deletes the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.delete
   * @param applicationServiceDeleteApplicationRequest  (required)
   * @return ApplicationServiceDeleteApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceDeleteApplicationResponse deleteApplication(ApplicationServiceDeleteApplicationRequest applicationServiceDeleteApplicationRequest) throws ApiException {
    return this.deleteApplication(applicationServiceDeleteApplicationRequest, Collections.emptyMap());
  }


  /**
   * Delete Application
   * Deletes the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.delete
   * @param applicationServiceDeleteApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceDeleteApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceDeleteApplicationResponse deleteApplication(ApplicationServiceDeleteApplicationRequest applicationServiceDeleteApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceDeleteApplicationRequest;
    
    if (applicationServiceDeleteApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceDeleteApplicationRequest' when calling deleteApplication");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/DeleteApplication";

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

    TypeReference<ApplicationServiceDeleteApplicationResponse> localVarReturnType = new TypeReference<ApplicationServiceDeleteApplicationResponse>() {};
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
   * Deletes an application key matching the provided ID.   Organization ID is not mandatory, but helps with filtering/performance.   The deletion time is returned in response message.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param applicationServiceDeleteApplicationKeyRequest  (required)
   * @return ApplicationServiceDeleteApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceDeleteApplicationKeyResponse deleteApplicationKey(ApplicationServiceDeleteApplicationKeyRequest applicationServiceDeleteApplicationKeyRequest) throws ApiException {
    return this.deleteApplicationKey(applicationServiceDeleteApplicationKeyRequest, Collections.emptyMap());
  }


  /**
   * Delete Application Key
   * Deletes an application key matching the provided ID.   Organization ID is not mandatory, but helps with filtering/performance.   The deletion time is returned in response message.   Required permissions:    - &#x60;project.app.write&#x60;
   * @param applicationServiceDeleteApplicationKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceDeleteApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceDeleteApplicationKeyResponse deleteApplicationKey(ApplicationServiceDeleteApplicationKeyRequest applicationServiceDeleteApplicationKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceDeleteApplicationKeyRequest;
    
    if (applicationServiceDeleteApplicationKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceDeleteApplicationKeyRequest' when calling deleteApplicationKey");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/DeleteApplicationKey";

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

    TypeReference<ApplicationServiceDeleteApplicationKeyResponse> localVarReturnType = new TypeReference<ApplicationServiceDeleteApplicationKeyResponse>() {};
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
   * Generate Client Secret
   * Generates the client secret of an API or OIDC application that belongs to the input project.   Required permissions:    - project.app.write
   * @param applicationServiceGenerateClientSecretRequest  (required)
   * @return ApplicationServiceGenerateClientSecretResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceGenerateClientSecretResponse generateClientSecret(ApplicationServiceGenerateClientSecretRequest applicationServiceGenerateClientSecretRequest) throws ApiException {
    return this.generateClientSecret(applicationServiceGenerateClientSecretRequest, Collections.emptyMap());
  }


  /**
   * Generate Client Secret
   * Generates the client secret of an API or OIDC application that belongs to the input project.   Required permissions:    - project.app.write
   * @param applicationServiceGenerateClientSecretRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceGenerateClientSecretResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceGenerateClientSecretResponse generateClientSecret(ApplicationServiceGenerateClientSecretRequest applicationServiceGenerateClientSecretRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceGenerateClientSecretRequest;
    
    if (applicationServiceGenerateClientSecretRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceGenerateClientSecretRequest' when calling generateClientSecret");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/GenerateClientSecret";

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

    TypeReference<ApplicationServiceGenerateClientSecretResponse> localVarReturnType = new TypeReference<ApplicationServiceGenerateClientSecretResponse>() {};
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
   * Retrieves the application matching the provided ID.   Required permissions:    - project.app.read
   * @param applicationServiceGetApplicationRequest  (required)
   * @return ApplicationServiceGetApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceGetApplicationResponse getApplication(ApplicationServiceGetApplicationRequest applicationServiceGetApplicationRequest) throws ApiException {
    return this.getApplication(applicationServiceGetApplicationRequest, Collections.emptyMap());
  }


  /**
   * Get Application
   * Retrieves the application matching the provided ID.   Required permissions:    - project.app.read
   * @param applicationServiceGetApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceGetApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceGetApplicationResponse getApplication(ApplicationServiceGetApplicationRequest applicationServiceGetApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceGetApplicationRequest;
    
    if (applicationServiceGetApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceGetApplicationRequest' when calling getApplication");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/GetApplication";

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

    TypeReference<ApplicationServiceGetApplicationResponse> localVarReturnType = new TypeReference<ApplicationServiceGetApplicationResponse>() {};
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
   * Retrieves the application key matching the provided ID.   Specifying a project, organization and application ID is optional but help with filtering/performance.   Required permissions:    - project.app.read
   * @param applicationServiceGetApplicationKeyRequest  (required)
   * @return ApplicationServiceGetApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceGetApplicationKeyResponse getApplicationKey(ApplicationServiceGetApplicationKeyRequest applicationServiceGetApplicationKeyRequest) throws ApiException {
    return this.getApplicationKey(applicationServiceGetApplicationKeyRequest, Collections.emptyMap());
  }


  /**
   * Get Application Key
   * Retrieves the application key matching the provided ID.   Specifying a project, organization and application ID is optional but help with filtering/performance.   Required permissions:    - project.app.read
   * @param applicationServiceGetApplicationKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceGetApplicationKeyResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceGetApplicationKeyResponse getApplicationKey(ApplicationServiceGetApplicationKeyRequest applicationServiceGetApplicationKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceGetApplicationKeyRequest;
    
    if (applicationServiceGetApplicationKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceGetApplicationKeyRequest' when calling getApplicationKey");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/GetApplicationKey";

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

    TypeReference<ApplicationServiceGetApplicationKeyResponse> localVarReturnType = new TypeReference<ApplicationServiceGetApplicationKeyResponse>() {};
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
   * List Application Keys
   * Returns a list of application keys matching the input parameters.   The result can be sorted by id, aggregate, creation date, expiration date, resource owner or type.  It can also be filtered by application, project or organization ID.   Required permissions:    - project.app.read
   * @param applicationServiceListApplicationKeysRequest  (required)
   * @return ApplicationServiceListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceListApplicationKeysResponse listApplicationKeys(ApplicationServiceListApplicationKeysRequest applicationServiceListApplicationKeysRequest) throws ApiException {
    return this.listApplicationKeys(applicationServiceListApplicationKeysRequest, Collections.emptyMap());
  }


  /**
   * List Application Keys
   * Returns a list of application keys matching the input parameters.   The result can be sorted by id, aggregate, creation date, expiration date, resource owner or type.  It can also be filtered by application, project or organization ID.   Required permissions:    - project.app.read
   * @param applicationServiceListApplicationKeysRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceListApplicationKeysResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceListApplicationKeysResponse listApplicationKeys(ApplicationServiceListApplicationKeysRequest applicationServiceListApplicationKeysRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceListApplicationKeysRequest;
    
    if (applicationServiceListApplicationKeysRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceListApplicationKeysRequest' when calling listApplicationKeys");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/ListApplicationKeys";

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

    TypeReference<ApplicationServiceListApplicationKeysResponse> localVarReturnType = new TypeReference<ApplicationServiceListApplicationKeysResponse>() {};
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
   * Returns a list of applications matching the input parameters. The results can be filtered  by project, state, type and name. It can be sorted by id, name, creation date, change date or state.   Required permissions:    - project.app.read
   * @param applicationServiceListApplicationsRequest  (required)
   * @return ApplicationServiceListApplicationsResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceListApplicationsResponse listApplications(ApplicationServiceListApplicationsRequest applicationServiceListApplicationsRequest) throws ApiException {
    return this.listApplications(applicationServiceListApplicationsRequest, Collections.emptyMap());
  }


  /**
   * List Applications
   * Returns a list of applications matching the input parameters. The results can be filtered  by project, state, type and name. It can be sorted by id, name, creation date, change date or state.   Required permissions:    - project.app.read
   * @param applicationServiceListApplicationsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceListApplicationsResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceListApplicationsResponse listApplications(ApplicationServiceListApplicationsRequest applicationServiceListApplicationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceListApplicationsRequest;
    
    if (applicationServiceListApplicationsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceListApplicationsRequest' when calling listApplications");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/ListApplications";

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

    TypeReference<ApplicationServiceListApplicationsResponse> localVarReturnType = new TypeReference<ApplicationServiceListApplicationsResponse>() {};
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
   * Reactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param applicationServiceReactivateApplicationRequest  (required)
   * @return ApplicationServiceReactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceReactivateApplicationResponse reactivateApplication(ApplicationServiceReactivateApplicationRequest applicationServiceReactivateApplicationRequest) throws ApiException {
    return this.reactivateApplication(applicationServiceReactivateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Reactivate Application
   * Reactivates the application belonging to the input project and matching the provided  application ID.   Required permissions:    - project.app.write
   * @param applicationServiceReactivateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceReactivateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceReactivateApplicationResponse reactivateApplication(ApplicationServiceReactivateApplicationRequest applicationServiceReactivateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceReactivateApplicationRequest;
    
    if (applicationServiceReactivateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceReactivateApplicationRequest' when calling reactivateApplication");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/ReactivateApplication";

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

    TypeReference<ApplicationServiceReactivateApplicationResponse> localVarReturnType = new TypeReference<ApplicationServiceReactivateApplicationResponse>() {};
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
              * Changes the configuration of an OIDC, API or SAML type application, as well as  the application name, based on the input provided.   Required permissions:    - project.app.write
                * @return ApplicationServiceUpdateApplicationResponse
              * @throws ApiException if fails to make API call
              */
              public ApplicationServiceUpdateApplicationResponse updateApplication() throws ApiException {
              return this.updateApplication(new ApplicationServiceUpdateApplicationRequest());
              }


  /**
   * Update Application
   * Changes the configuration of an OIDC, API or SAML type application, as well as  the application name, based on the input provided.   Required permissions:    - project.app.write
   * @param applicationServiceUpdateApplicationRequest  (required)
   * @return ApplicationServiceUpdateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  public ApplicationServiceUpdateApplicationResponse updateApplication(ApplicationServiceUpdateApplicationRequest applicationServiceUpdateApplicationRequest) throws ApiException {
    return this.updateApplication(applicationServiceUpdateApplicationRequest, Collections.emptyMap());
  }


  /**
   * Update Application
   * Changes the configuration of an OIDC, API or SAML type application, as well as  the application name, based on the input provided.   Required permissions:    - project.app.write
   * @param applicationServiceUpdateApplicationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ApplicationServiceUpdateApplicationResponse
   * @throws ApiException if fails to make API call
   */
  private ApplicationServiceUpdateApplicationResponse updateApplication(ApplicationServiceUpdateApplicationRequest applicationServiceUpdateApplicationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationServiceUpdateApplicationRequest;
    
    if (applicationServiceUpdateApplicationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'applicationServiceUpdateApplicationRequest' when calling updateApplication");
    }
    
    String localVarPath = "/zitadel.application.v2.ApplicationService/UpdateApplication";

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

    TypeReference<ApplicationServiceUpdateApplicationResponse> localVarReturnType = new TypeReference<ApplicationServiceUpdateApplicationResponse>() {};
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
