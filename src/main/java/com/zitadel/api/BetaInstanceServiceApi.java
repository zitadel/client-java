package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaInstanceServiceAddCustomDomainRequest;
import com.zitadel.model.BetaInstanceServiceAddCustomDomainResponse;
import com.zitadel.model.BetaInstanceServiceAddTrustedDomainRequest;
import com.zitadel.model.BetaInstanceServiceAddTrustedDomainResponse;
import com.zitadel.model.BetaInstanceServiceConnectError;
import com.zitadel.model.BetaInstanceServiceDeleteInstanceRequest;
import com.zitadel.model.BetaInstanceServiceDeleteInstanceResponse;
import com.zitadel.model.BetaInstanceServiceGetInstanceRequest;
import com.zitadel.model.BetaInstanceServiceGetInstanceResponse;
import com.zitadel.model.BetaInstanceServiceListCustomDomainsRequest;
import com.zitadel.model.BetaInstanceServiceListCustomDomainsResponse;
import com.zitadel.model.BetaInstanceServiceListInstancesRequest;
import com.zitadel.model.BetaInstanceServiceListInstancesResponse;
import com.zitadel.model.BetaInstanceServiceListTrustedDomainsRequest;
import com.zitadel.model.BetaInstanceServiceListTrustedDomainsResponse;
import com.zitadel.model.BetaInstanceServiceRemoveCustomDomainRequest;
import com.zitadel.model.BetaInstanceServiceRemoveCustomDomainResponse;
import com.zitadel.model.BetaInstanceServiceRemoveTrustedDomainRequest;
import com.zitadel.model.BetaInstanceServiceRemoveTrustedDomainResponse;
import com.zitadel.model.BetaInstanceServiceUpdateInstanceRequest;
import com.zitadel.model.BetaInstanceServiceUpdateInstanceResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaInstanceServiceApi extends BaseApi {

  public BetaInstanceServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaInstanceServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * AddCustomDomain
   * Add Custom Domain   Adds a custom domain to the instance in context.   The instance_id in the input message will be used in the future   Required permissions:    - &#x60;system.domain.write&#x60;
   * @param betaInstanceServiceAddCustomDomainRequest  (required)
   * @return BetaInstanceServiceAddCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceAddCustomDomainResponse addCustomDomain(BetaInstanceServiceAddCustomDomainRequest betaInstanceServiceAddCustomDomainRequest) throws ApiException {
    return this.addCustomDomain(betaInstanceServiceAddCustomDomainRequest, Collections.emptyMap());
  }


  /**
   * AddCustomDomain
   * Add Custom Domain   Adds a custom domain to the instance in context.   The instance_id in the input message will be used in the future   Required permissions:    - &#x60;system.domain.write&#x60;
   * @param betaInstanceServiceAddCustomDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceAddCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceAddCustomDomainResponse addCustomDomain(BetaInstanceServiceAddCustomDomainRequest betaInstanceServiceAddCustomDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceAddCustomDomainRequest;
    
    if (betaInstanceServiceAddCustomDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceAddCustomDomainRequest' when calling addCustomDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/AddCustomDomain";

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

    TypeReference<BetaInstanceServiceAddCustomDomainResponse> localVarReturnType = new TypeReference<BetaInstanceServiceAddCustomDomainResponse>() {};
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
   * AddTrustedDomain
   * Add Trusted Domain   Adds a trusted domain to the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;iam.write&#x60;
   * @param betaInstanceServiceAddTrustedDomainRequest  (required)
   * @return BetaInstanceServiceAddTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceAddTrustedDomainResponse addTrustedDomain(BetaInstanceServiceAddTrustedDomainRequest betaInstanceServiceAddTrustedDomainRequest) throws ApiException {
    return this.addTrustedDomain(betaInstanceServiceAddTrustedDomainRequest, Collections.emptyMap());
  }


  /**
   * AddTrustedDomain
   * Add Trusted Domain   Adds a trusted domain to the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;iam.write&#x60;
   * @param betaInstanceServiceAddTrustedDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceAddTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceAddTrustedDomainResponse addTrustedDomain(BetaInstanceServiceAddTrustedDomainRequest betaInstanceServiceAddTrustedDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceAddTrustedDomainRequest;
    
    if (betaInstanceServiceAddTrustedDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceAddTrustedDomainRequest' when calling addTrustedDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/AddTrustedDomain";

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

    TypeReference<BetaInstanceServiceAddTrustedDomainResponse> localVarReturnType = new TypeReference<BetaInstanceServiceAddTrustedDomainResponse>() {};
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
   * DeleteInstance
   * Delete Instance   Deletes an instance with the given ID.   Required permissions:    - &#x60;system.instance.delete&#x60;
   * @param betaInstanceServiceDeleteInstanceRequest  (required)
   * @return BetaInstanceServiceDeleteInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceDeleteInstanceResponse deleteInstance(BetaInstanceServiceDeleteInstanceRequest betaInstanceServiceDeleteInstanceRequest) throws ApiException {
    return this.deleteInstance(betaInstanceServiceDeleteInstanceRequest, Collections.emptyMap());
  }


  /**
   * DeleteInstance
   * Delete Instance   Deletes an instance with the given ID.   Required permissions:    - &#x60;system.instance.delete&#x60;
   * @param betaInstanceServiceDeleteInstanceRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceDeleteInstanceResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceDeleteInstanceResponse deleteInstance(BetaInstanceServiceDeleteInstanceRequest betaInstanceServiceDeleteInstanceRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceDeleteInstanceRequest;
    
    if (betaInstanceServiceDeleteInstanceRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceDeleteInstanceRequest' when calling deleteInstance");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/DeleteInstance";

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

    TypeReference<BetaInstanceServiceDeleteInstanceResponse> localVarReturnType = new TypeReference<BetaInstanceServiceDeleteInstanceResponse>() {};
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
   * GetInstance
   * Get Instance   Returns the instance in the current context.   The instace_id in the input message will be used in the future.   Required permissions:    - &#x60;iam.read&#x60;
   * @param betaInstanceServiceGetInstanceRequest  (required)
   * @return BetaInstanceServiceGetInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceGetInstanceResponse getInstance(BetaInstanceServiceGetInstanceRequest betaInstanceServiceGetInstanceRequest) throws ApiException {
    return this.getInstance(betaInstanceServiceGetInstanceRequest, Collections.emptyMap());
  }


  /**
   * GetInstance
   * Get Instance   Returns the instance in the current context.   The instace_id in the input message will be used in the future.   Required permissions:    - &#x60;iam.read&#x60;
   * @param betaInstanceServiceGetInstanceRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceGetInstanceResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceGetInstanceResponse getInstance(BetaInstanceServiceGetInstanceRequest betaInstanceServiceGetInstanceRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceGetInstanceRequest;
    
    if (betaInstanceServiceGetInstanceRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceGetInstanceRequest' when calling getInstance");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/GetInstance";

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

    TypeReference<BetaInstanceServiceGetInstanceResponse> localVarReturnType = new TypeReference<BetaInstanceServiceGetInstanceResponse>() {};
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
   * ListCustomDomains
   * List Custom Domains   Lists custom domains of the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;iam.read&#x60;
   * @param betaInstanceServiceListCustomDomainsRequest  (required)
   * @return BetaInstanceServiceListCustomDomainsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceListCustomDomainsResponse listCustomDomains(BetaInstanceServiceListCustomDomainsRequest betaInstanceServiceListCustomDomainsRequest) throws ApiException {
    return this.listCustomDomains(betaInstanceServiceListCustomDomainsRequest, Collections.emptyMap());
  }


  /**
   * ListCustomDomains
   * List Custom Domains   Lists custom domains of the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;iam.read&#x60;
   * @param betaInstanceServiceListCustomDomainsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceListCustomDomainsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceListCustomDomainsResponse listCustomDomains(BetaInstanceServiceListCustomDomainsRequest betaInstanceServiceListCustomDomainsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceListCustomDomainsRequest;
    
    if (betaInstanceServiceListCustomDomainsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceListCustomDomainsRequest' when calling listCustomDomains");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/ListCustomDomains";

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

    TypeReference<BetaInstanceServiceListCustomDomainsResponse> localVarReturnType = new TypeReference<BetaInstanceServiceListCustomDomainsResponse>() {};
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
   * ListInstances
   * List Instances   Lists instances matching the given query.  The query can be used to filter either by instance ID or domain.  The request is paginated and returns 100 results by default.   Required permissions:   - &#x60;system.instance.read&#x60;
   * @param betaInstanceServiceListInstancesRequest  (required)
   * @return BetaInstanceServiceListInstancesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceListInstancesResponse listInstances(BetaInstanceServiceListInstancesRequest betaInstanceServiceListInstancesRequest) throws ApiException {
    return this.listInstances(betaInstanceServiceListInstancesRequest, Collections.emptyMap());
  }


  /**
   * ListInstances
   * List Instances   Lists instances matching the given query.  The query can be used to filter either by instance ID or domain.  The request is paginated and returns 100 results by default.   Required permissions:   - &#x60;system.instance.read&#x60;
   * @param betaInstanceServiceListInstancesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceListInstancesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceListInstancesResponse listInstances(BetaInstanceServiceListInstancesRequest betaInstanceServiceListInstancesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceListInstancesRequest;
    
    if (betaInstanceServiceListInstancesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceListInstancesRequest' when calling listInstances");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/ListInstances";

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

    TypeReference<BetaInstanceServiceListInstancesResponse> localVarReturnType = new TypeReference<BetaInstanceServiceListInstancesResponse>() {};
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
   * ListTrustedDomains
   * List Trusted Domains   Lists trusted domains of the instance.   The instance_id in the input message will be used in the future.   Required permissions:    - &#x60;iam.read&#x60;
   * @param betaInstanceServiceListTrustedDomainsRequest  (required)
   * @return BetaInstanceServiceListTrustedDomainsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceListTrustedDomainsResponse listTrustedDomains(BetaInstanceServiceListTrustedDomainsRequest betaInstanceServiceListTrustedDomainsRequest) throws ApiException {
    return this.listTrustedDomains(betaInstanceServiceListTrustedDomainsRequest, Collections.emptyMap());
  }


  /**
   * ListTrustedDomains
   * List Trusted Domains   Lists trusted domains of the instance.   The instance_id in the input message will be used in the future.   Required permissions:    - &#x60;iam.read&#x60;
   * @param betaInstanceServiceListTrustedDomainsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceListTrustedDomainsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceListTrustedDomainsResponse listTrustedDomains(BetaInstanceServiceListTrustedDomainsRequest betaInstanceServiceListTrustedDomainsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceListTrustedDomainsRequest;
    
    if (betaInstanceServiceListTrustedDomainsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceListTrustedDomainsRequest' when calling listTrustedDomains");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/ListTrustedDomains";

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

    TypeReference<BetaInstanceServiceListTrustedDomainsResponse> localVarReturnType = new TypeReference<BetaInstanceServiceListTrustedDomainsResponse>() {};
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
   * RemoveCustomDomain
   * Remove Custom Domain   Removes a custom domain from the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;system.domain.write&#x60;
   * @param betaInstanceServiceRemoveCustomDomainRequest  (required)
   * @return BetaInstanceServiceRemoveCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceRemoveCustomDomainResponse removeCustomDomain(BetaInstanceServiceRemoveCustomDomainRequest betaInstanceServiceRemoveCustomDomainRequest) throws ApiException {
    return this.removeCustomDomain(betaInstanceServiceRemoveCustomDomainRequest, Collections.emptyMap());
  }


  /**
   * RemoveCustomDomain
   * Remove Custom Domain   Removes a custom domain from the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;system.domain.write&#x60;
   * @param betaInstanceServiceRemoveCustomDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceRemoveCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceRemoveCustomDomainResponse removeCustomDomain(BetaInstanceServiceRemoveCustomDomainRequest betaInstanceServiceRemoveCustomDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceRemoveCustomDomainRequest;
    
    if (betaInstanceServiceRemoveCustomDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceRemoveCustomDomainRequest' when calling removeCustomDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/RemoveCustomDomain";

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

    TypeReference<BetaInstanceServiceRemoveCustomDomainResponse> localVarReturnType = new TypeReference<BetaInstanceServiceRemoveCustomDomainResponse>() {};
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
   * RemoveTrustedDomain
   * Remove Trusted Domain   Removes a trusted domain from the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;iam.write&#x60;
   * @param betaInstanceServiceRemoveTrustedDomainRequest  (required)
   * @return BetaInstanceServiceRemoveTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceRemoveTrustedDomainResponse removeTrustedDomain(BetaInstanceServiceRemoveTrustedDomainRequest betaInstanceServiceRemoveTrustedDomainRequest) throws ApiException {
    return this.removeTrustedDomain(betaInstanceServiceRemoveTrustedDomainRequest, Collections.emptyMap());
  }


  /**
   * RemoveTrustedDomain
   * Remove Trusted Domain   Removes a trusted domain from the instance.   The instance_id in the input message will be used in the future.   Required permissions:   - &#x60;iam.write&#x60;
   * @param betaInstanceServiceRemoveTrustedDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceRemoveTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceRemoveTrustedDomainResponse removeTrustedDomain(BetaInstanceServiceRemoveTrustedDomainRequest betaInstanceServiceRemoveTrustedDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceRemoveTrustedDomainRequest;
    
    if (betaInstanceServiceRemoveTrustedDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceRemoveTrustedDomainRequest' when calling removeTrustedDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/RemoveTrustedDomain";

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

    TypeReference<BetaInstanceServiceRemoveTrustedDomainResponse> localVarReturnType = new TypeReference<BetaInstanceServiceRemoveTrustedDomainResponse>() {};
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
   * UpdateInstance
   * Update Instance   Updates instance in context with the given name.   The instance_id in the input message will be used in the future.   Required permissions:    - &#x60;iam.write&#x60;
   * @param betaInstanceServiceUpdateInstanceRequest  (required)
   * @return BetaInstanceServiceUpdateInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public BetaInstanceServiceUpdateInstanceResponse updateInstance(BetaInstanceServiceUpdateInstanceRequest betaInstanceServiceUpdateInstanceRequest) throws ApiException {
    return this.updateInstance(betaInstanceServiceUpdateInstanceRequest, Collections.emptyMap());
  }


  /**
   * UpdateInstance
   * Update Instance   Updates instance in context with the given name.   The instance_id in the input message will be used in the future.   Required permissions:    - &#x60;iam.write&#x60;
   * @param betaInstanceServiceUpdateInstanceRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaInstanceServiceUpdateInstanceResponse
   * @throws ApiException if fails to make API call
   */
  private BetaInstanceServiceUpdateInstanceResponse updateInstance(BetaInstanceServiceUpdateInstanceRequest betaInstanceServiceUpdateInstanceRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaInstanceServiceUpdateInstanceRequest;
    
    if (betaInstanceServiceUpdateInstanceRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaInstanceServiceUpdateInstanceRequest' when calling updateInstance");
    }
    
    String localVarPath = "/zitadel.instance.v2beta.InstanceService/UpdateInstance";

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

    TypeReference<BetaInstanceServiceUpdateInstanceResponse> localVarReturnType = new TypeReference<BetaInstanceServiceUpdateInstanceResponse>() {};
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
