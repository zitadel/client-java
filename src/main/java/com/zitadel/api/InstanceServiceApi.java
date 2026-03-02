package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.InstanceServiceAddCustomDomainRequest;
import com.zitadel.model.InstanceServiceAddCustomDomainResponse;
import com.zitadel.model.InstanceServiceAddTrustedDomainRequest;
import com.zitadel.model.InstanceServiceAddTrustedDomainResponse;
import com.zitadel.model.InstanceServiceConnectError;
import com.zitadel.model.InstanceServiceDeleteInstanceRequest;
import com.zitadel.model.InstanceServiceDeleteInstanceResponse;
import com.zitadel.model.InstanceServiceGetInstanceRequest;
import com.zitadel.model.InstanceServiceGetInstanceResponse;
import com.zitadel.model.InstanceServiceListCustomDomainsRequest;
import com.zitadel.model.InstanceServiceListCustomDomainsResponse;
import com.zitadel.model.InstanceServiceListInstancesRequest;
import com.zitadel.model.InstanceServiceListInstancesResponse;
import com.zitadel.model.InstanceServiceListTrustedDomainsRequest;
import com.zitadel.model.InstanceServiceListTrustedDomainsResponse;
import com.zitadel.model.InstanceServiceRemoveCustomDomainRequest;
import com.zitadel.model.InstanceServiceRemoveCustomDomainResponse;
import com.zitadel.model.InstanceServiceRemoveTrustedDomainRequest;
import com.zitadel.model.InstanceServiceRemoveTrustedDomainResponse;
import com.zitadel.model.InstanceServiceUpdateInstanceRequest;
import com.zitadel.model.InstanceServiceUpdateInstanceResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class InstanceServiceApi extends BaseApi {

  public InstanceServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public InstanceServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Add Custom Domain
   * Adds a custom domain to the instance.  The custom domain must be unique across all instances.  Once the domain is added, it will be used to route requests to this instance.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:    - &#x60;system.domain.write&#x60;
   * @param instanceServiceAddCustomDomainRequest  (required)
   * @return InstanceServiceAddCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceAddCustomDomainResponse addCustomDomain(InstanceServiceAddCustomDomainRequest instanceServiceAddCustomDomainRequest) throws ApiException {
    return this.addCustomDomain(instanceServiceAddCustomDomainRequest, Collections.emptyMap());
  }


  /**
   * Add Custom Domain
   * Adds a custom domain to the instance.  The custom domain must be unique across all instances.  Once the domain is added, it will be used to route requests to this instance.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:    - &#x60;system.domain.write&#x60;
   * @param instanceServiceAddCustomDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceAddCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceAddCustomDomainResponse addCustomDomain(InstanceServiceAddCustomDomainRequest instanceServiceAddCustomDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceAddCustomDomainRequest;
    
    if (instanceServiceAddCustomDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceAddCustomDomainRequest' when calling addCustomDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/AddCustomDomain";

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

    TypeReference<InstanceServiceAddCustomDomainResponse> localVarReturnType = new TypeReference<InstanceServiceAddCustomDomainResponse>() {};
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
   * Add Trusted Domain
   * Adds a trusted domain to the instance.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   It must be a valid domain name.  Once the domain is added, it can be used in API responses like OIDC discovery,  email templates, and more.  This can be used in cases where the API is accessed through a different domain  than the instance domain, e.g. proxy setups and custom login UIs.  Unlike custom domain, trusted domains are not used to route requests to this instance  and therefore do not need to be uniquely assigned to an instance.   Required permissions:   - &#x60;iam.write&#x60;   - &#x60;system.instance.write&#x60; (if InstanceID is set)
   * @param instanceServiceAddTrustedDomainRequest  (required)
   * @return InstanceServiceAddTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceAddTrustedDomainResponse addTrustedDomain(InstanceServiceAddTrustedDomainRequest instanceServiceAddTrustedDomainRequest) throws ApiException {
    return this.addTrustedDomain(instanceServiceAddTrustedDomainRequest, Collections.emptyMap());
  }


  /**
   * Add Trusted Domain
   * Adds a trusted domain to the instance.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   It must be a valid domain name.  Once the domain is added, it can be used in API responses like OIDC discovery,  email templates, and more.  This can be used in cases where the API is accessed through a different domain  than the instance domain, e.g. proxy setups and custom login UIs.  Unlike custom domain, trusted domains are not used to route requests to this instance  and therefore do not need to be uniquely assigned to an instance.   Required permissions:   - &#x60;iam.write&#x60;   - &#x60;system.instance.write&#x60; (if InstanceID is set)
   * @param instanceServiceAddTrustedDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceAddTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceAddTrustedDomainResponse addTrustedDomain(InstanceServiceAddTrustedDomainRequest instanceServiceAddTrustedDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceAddTrustedDomainRequest;
    
    if (instanceServiceAddTrustedDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceAddTrustedDomainRequest' when calling addTrustedDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/AddTrustedDomain";

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

    TypeReference<InstanceServiceAddTrustedDomainResponse> localVarReturnType = new TypeReference<InstanceServiceAddTrustedDomainResponse>() {};
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
   * Delete Instance
   * Deletes an instance with the given ID.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:    - &#x60;system.instance.delete&#x60;
   * @param instanceServiceDeleteInstanceRequest  (required)
   * @return InstanceServiceDeleteInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceDeleteInstanceResponse deleteInstance(InstanceServiceDeleteInstanceRequest instanceServiceDeleteInstanceRequest) throws ApiException {
    return this.deleteInstance(instanceServiceDeleteInstanceRequest, Collections.emptyMap());
  }


  /**
   * Delete Instance
   * Deletes an instance with the given ID.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:    - &#x60;system.instance.delete&#x60;
   * @param instanceServiceDeleteInstanceRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceDeleteInstanceResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceDeleteInstanceResponse deleteInstance(InstanceServiceDeleteInstanceRequest instanceServiceDeleteInstanceRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceDeleteInstanceRequest;
    
    if (instanceServiceDeleteInstanceRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceDeleteInstanceRequest' when calling deleteInstance");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/DeleteInstance";

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

    TypeReference<InstanceServiceDeleteInstanceResponse> localVarReturnType = new TypeReference<InstanceServiceDeleteInstanceResponse>() {};
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
   * Get Instance
   * Returns the instance in the current context or by its ID.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to retrieve a specific instance.  This requires additional permissions.   Required permissions:    - &#x60;iam.read&#x60;    - &#x60;system.instance.read&#x60; (if InstanceID is set)
   * @param instanceServiceGetInstanceRequest  (required)
   * @return InstanceServiceGetInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceGetInstanceResponse getInstance(InstanceServiceGetInstanceRequest instanceServiceGetInstanceRequest) throws ApiException {
    return this.getInstance(instanceServiceGetInstanceRequest, Collections.emptyMap());
  }


  /**
   * Get Instance
   * Returns the instance in the current context or by its ID.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to retrieve a specific instance.  This requires additional permissions.   Required permissions:    - &#x60;iam.read&#x60;    - &#x60;system.instance.read&#x60; (if InstanceID is set)
   * @param instanceServiceGetInstanceRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceGetInstanceResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceGetInstanceResponse getInstance(InstanceServiceGetInstanceRequest instanceServiceGetInstanceRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceGetInstanceRequest;
    
    if (instanceServiceGetInstanceRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceGetInstanceRequest' when calling getInstance");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/GetInstance";

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

    TypeReference<InstanceServiceGetInstanceResponse> localVarReturnType = new TypeReference<InstanceServiceGetInstanceResponse>() {};
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
   * List Custom Domains
   * Lists custom domains of the instance.   By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   Required permissions:   - &#x60;iam.read&#x60;   - &#x60;system.instance.read&#x60; (if InstanceID is set)
   * @param instanceServiceListCustomDomainsRequest  (required)
   * @return InstanceServiceListCustomDomainsResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceListCustomDomainsResponse listCustomDomains(InstanceServiceListCustomDomainsRequest instanceServiceListCustomDomainsRequest) throws ApiException {
    return this.listCustomDomains(instanceServiceListCustomDomainsRequest, Collections.emptyMap());
  }


  /**
   * List Custom Domains
   * Lists custom domains of the instance.   By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   Required permissions:   - &#x60;iam.read&#x60;   - &#x60;system.instance.read&#x60; (if InstanceID is set)
   * @param instanceServiceListCustomDomainsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceListCustomDomainsResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceListCustomDomainsResponse listCustomDomains(InstanceServiceListCustomDomainsRequest instanceServiceListCustomDomainsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceListCustomDomainsRequest;
    
    if (instanceServiceListCustomDomainsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceListCustomDomainsRequest' when calling listCustomDomains");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/ListCustomDomains";

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

    TypeReference<InstanceServiceListCustomDomainsResponse> localVarReturnType = new TypeReference<InstanceServiceListCustomDomainsResponse>() {};
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
   * List Instances
   * Lists instances matching the given query.  The query can be used to filter either by instance ID or domain.  The request is paginated and returns 100 results by default.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:   - &#x60;system.instance.read&#x60;
   * @param instanceServiceListInstancesRequest  (required)
   * @return InstanceServiceListInstancesResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceListInstancesResponse listInstances(InstanceServiceListInstancesRequest instanceServiceListInstancesRequest) throws ApiException {
    return this.listInstances(instanceServiceListInstancesRequest, Collections.emptyMap());
  }


  /**
   * List Instances
   * Lists instances matching the given query.  The query can be used to filter either by instance ID or domain.  The request is paginated and returns 100 results by default.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:   - &#x60;system.instance.read&#x60;
   * @param instanceServiceListInstancesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceListInstancesResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceListInstancesResponse listInstances(InstanceServiceListInstancesRequest instanceServiceListInstancesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceListInstancesRequest;
    
    if (instanceServiceListInstancesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceListInstancesRequest' when calling listInstances");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/ListInstances";

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

    TypeReference<InstanceServiceListInstancesResponse> localVarReturnType = new TypeReference<InstanceServiceListInstancesResponse>() {};
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
   * List Trusted Domains
   * Lists trusted domains of the instance.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   Required permissions:    - &#x60;iam.read&#x60;    - &#x60;system.instance.read&#x60; (if InstanceID is set)
   * @param instanceServiceListTrustedDomainsRequest  (required)
   * @return InstanceServiceListTrustedDomainsResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceListTrustedDomainsResponse listTrustedDomains(InstanceServiceListTrustedDomainsRequest instanceServiceListTrustedDomainsRequest) throws ApiException {
    return this.listTrustedDomains(instanceServiceListTrustedDomainsRequest, Collections.emptyMap());
  }


  /**
   * List Trusted Domains
   * Lists trusted domains of the instance.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   Required permissions:    - &#x60;iam.read&#x60;    - &#x60;system.instance.read&#x60; (if InstanceID is set)
   * @param instanceServiceListTrustedDomainsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceListTrustedDomainsResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceListTrustedDomainsResponse listTrustedDomains(InstanceServiceListTrustedDomainsRequest instanceServiceListTrustedDomainsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceListTrustedDomainsRequest;
    
    if (instanceServiceListTrustedDomainsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceListTrustedDomainsRequest' when calling listTrustedDomains");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/ListTrustedDomains";

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

    TypeReference<InstanceServiceListTrustedDomainsResponse> localVarReturnType = new TypeReference<InstanceServiceListTrustedDomainsResponse>() {};
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
   * Remove Custom Domain
   * Removes a custom domain from the instance.  Be aware that this will stop routing requests from this domain to the instance and  might break existing setups or integrations.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:   - &#x60;system.domain.write&#x60;
   * @param instanceServiceRemoveCustomDomainRequest  (required)
   * @return InstanceServiceRemoveCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceRemoveCustomDomainResponse removeCustomDomain(InstanceServiceRemoveCustomDomainRequest instanceServiceRemoveCustomDomainRequest) throws ApiException {
    return this.removeCustomDomain(instanceServiceRemoveCustomDomainRequest, Collections.emptyMap());
  }


  /**
   * Remove Custom Domain
   * Removes a custom domain from the instance.  Be aware that this will stop routing requests from this domain to the instance and  might break existing setups or integrations.  This method requires system level permissions and cannot be called from an instance context.   Required permissions:   - &#x60;system.domain.write&#x60;
   * @param instanceServiceRemoveCustomDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceRemoveCustomDomainResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceRemoveCustomDomainResponse removeCustomDomain(InstanceServiceRemoveCustomDomainRequest instanceServiceRemoveCustomDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceRemoveCustomDomainRequest;
    
    if (instanceServiceRemoveCustomDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceRemoveCustomDomainRequest' when calling removeCustomDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/RemoveCustomDomain";

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

    TypeReference<InstanceServiceRemoveCustomDomainResponse> localVarReturnType = new TypeReference<InstanceServiceRemoveCustomDomainResponse>() {};
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
   * Remove Trusted Domain
   * Removes a trusted domain from the instance.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   Required permissions:   - &#x60;iam.write&#x60;   - &#x60;system.instance.write&#x60; (if InstanceID is set)
   * @param instanceServiceRemoveTrustedDomainRequest  (required)
   * @return InstanceServiceRemoveTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceRemoveTrustedDomainResponse removeTrustedDomain(InstanceServiceRemoveTrustedDomainRequest instanceServiceRemoveTrustedDomainRequest) throws ApiException {
    return this.removeTrustedDomain(instanceServiceRemoveTrustedDomainRequest, Collections.emptyMap());
  }


  /**
   * Remove Trusted Domain
   * Removes a trusted domain from the instance.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to list the domains of a specific instance.  This requires additional permissions.   Required permissions:   - &#x60;iam.write&#x60;   - &#x60;system.instance.write&#x60; (if InstanceID is set)
   * @param instanceServiceRemoveTrustedDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceRemoveTrustedDomainResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceRemoveTrustedDomainResponse removeTrustedDomain(InstanceServiceRemoveTrustedDomainRequest instanceServiceRemoveTrustedDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceRemoveTrustedDomainRequest;
    
    if (instanceServiceRemoveTrustedDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceRemoveTrustedDomainRequest' when calling removeTrustedDomain");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/RemoveTrustedDomain";

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

    TypeReference<InstanceServiceRemoveTrustedDomainResponse> localVarReturnType = new TypeReference<InstanceServiceRemoveTrustedDomainResponse>() {};
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
   * Update Instance
   * Updates instance&#39;s name in the current context or by its ID.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to update a specific instance.  This requires additional permissions.   Required permissions:    - &#x60;iam.write&#x60;    - &#x60;system.instance.write&#x60; (if InstanceID is set)
   * @param instanceServiceUpdateInstanceRequest  (required)
   * @return InstanceServiceUpdateInstanceResponse
   * @throws ApiException if fails to make API call
   */
  public InstanceServiceUpdateInstanceResponse updateInstance(InstanceServiceUpdateInstanceRequest instanceServiceUpdateInstanceRequest) throws ApiException {
    return this.updateInstance(instanceServiceUpdateInstanceRequest, Collections.emptyMap());
  }


  /**
   * Update Instance
   * Updates instance&#39;s name in the current context or by its ID.  By default the instance will be determined by the context of the request,  e.g. the host header.  You can optionally pass an InstanceID to update a specific instance.  This requires additional permissions.   Required permissions:    - &#x60;iam.write&#x60;    - &#x60;system.instance.write&#x60; (if InstanceID is set)
   * @param instanceServiceUpdateInstanceRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return InstanceServiceUpdateInstanceResponse
   * @throws ApiException if fails to make API call
   */
  private InstanceServiceUpdateInstanceResponse updateInstance(InstanceServiceUpdateInstanceRequest instanceServiceUpdateInstanceRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = instanceServiceUpdateInstanceRequest;
    
    if (instanceServiceUpdateInstanceRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'instanceServiceUpdateInstanceRequest' when calling updateInstance");
    }
    
    String localVarPath = "/zitadel.instance.v2.InstanceService/UpdateInstance";

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

    TypeReference<InstanceServiceUpdateInstanceResponse> localVarReturnType = new TypeReference<InstanceServiceUpdateInstanceResponse>() {};
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
