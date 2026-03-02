package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.OrganizationServiceActivateOrganizationRequest;
import com.zitadel.model.OrganizationServiceActivateOrganizationResponse;
import com.zitadel.model.OrganizationServiceAddOrganizationDomainRequest;
import com.zitadel.model.OrganizationServiceAddOrganizationDomainResponse;
import com.zitadel.model.OrganizationServiceAddOrganizationRequest;
import com.zitadel.model.OrganizationServiceAddOrganizationResponse;
import com.zitadel.model.OrganizationServiceConnectError;
import com.zitadel.model.OrganizationServiceDeactivateOrganizationRequest;
import com.zitadel.model.OrganizationServiceDeactivateOrganizationResponse;
import com.zitadel.model.OrganizationServiceDeleteOrganizationDomainRequest;
import com.zitadel.model.OrganizationServiceDeleteOrganizationDomainResponse;
import com.zitadel.model.OrganizationServiceDeleteOrganizationMetadataRequest;
import com.zitadel.model.OrganizationServiceDeleteOrganizationMetadataResponse;
import com.zitadel.model.OrganizationServiceDeleteOrganizationRequest;
import com.zitadel.model.OrganizationServiceDeleteOrganizationResponse;
import com.zitadel.model.OrganizationServiceGenerateOrganizationDomainValidationRequest;
import com.zitadel.model.OrganizationServiceGenerateOrganizationDomainValidationResponse;
import com.zitadel.model.OrganizationServiceListOrganizationDomainsRequest;
import com.zitadel.model.OrganizationServiceListOrganizationDomainsResponse;
import com.zitadel.model.OrganizationServiceListOrganizationMetadataRequest;
import com.zitadel.model.OrganizationServiceListOrganizationMetadataResponse;
import com.zitadel.model.OrganizationServiceListOrganizationsRequest;
import com.zitadel.model.OrganizationServiceListOrganizationsResponse;
import com.zitadel.model.OrganizationServiceSetOrganizationMetadataRequest;
import com.zitadel.model.OrganizationServiceSetOrganizationMetadataResponse;
import com.zitadel.model.OrganizationServiceUpdateOrganizationRequest;
import com.zitadel.model.OrganizationServiceUpdateOrganizationResponse;
import com.zitadel.model.OrganizationServiceVerifyOrganizationDomainRequest;
import com.zitadel.model.OrganizationServiceVerifyOrganizationDomainResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class OrganizationServiceApi extends BaseApi {

  public OrganizationServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public OrganizationServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Activate Organization
   * Set the state of my organization to active. The state of the organization has to be deactivated to perform the request. Users of this organization will be able to log in again.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceActivateOrganizationRequest  (required)
   * @return OrganizationServiceActivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceActivateOrganizationResponse activateOrganization(OrganizationServiceActivateOrganizationRequest organizationServiceActivateOrganizationRequest) throws ApiException {
    return this.activateOrganization(organizationServiceActivateOrganizationRequest, Collections.emptyMap());
  }


  /**
   * Activate Organization
   * Set the state of my organization to active. The state of the organization has to be deactivated to perform the request. Users of this organization will be able to log in again.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceActivateOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceActivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceActivateOrganizationResponse activateOrganization(OrganizationServiceActivateOrganizationRequest organizationServiceActivateOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceActivateOrganizationRequest;
    
    if (organizationServiceActivateOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceActivateOrganizationRequest' when calling activateOrganization");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/ActivateOrganization";

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

    TypeReference<OrganizationServiceActivateOrganizationResponse> localVarReturnType = new TypeReference<OrganizationServiceActivateOrganizationResponse>() {};
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
   * Add Organization
   * Create a new organization with an administrative user. If no specific roles are sent for the users, they will be granted the role ORG_OWNER.   Required permission:   - &#x60;org.create&#x60;
   * @param organizationServiceAddOrganizationRequest  (required)
   * @return OrganizationServiceAddOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceAddOrganizationResponse addOrganization(OrganizationServiceAddOrganizationRequest organizationServiceAddOrganizationRequest) throws ApiException {
    return this.addOrganization(organizationServiceAddOrganizationRequest, Collections.emptyMap());
  }


  /**
   * Add Organization
   * Create a new organization with an administrative user. If no specific roles are sent for the users, they will be granted the role ORG_OWNER.   Required permission:   - &#x60;org.create&#x60;
   * @param organizationServiceAddOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceAddOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceAddOrganizationResponse addOrganization(OrganizationServiceAddOrganizationRequest organizationServiceAddOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceAddOrganizationRequest;
    
    if (organizationServiceAddOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceAddOrganizationRequest' when calling addOrganization");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/AddOrganization";

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

    TypeReference<OrganizationServiceAddOrganizationResponse> localVarReturnType = new TypeReference<OrganizationServiceAddOrganizationResponse>() {};
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
   * Add Organization Domain
   * Add a new domain to an organization. The domains are used to identify to which organization a user belongs.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceAddOrganizationDomainRequest  (required)
   * @return OrganizationServiceAddOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceAddOrganizationDomainResponse addOrganizationDomain(OrganizationServiceAddOrganizationDomainRequest organizationServiceAddOrganizationDomainRequest) throws ApiException {
    return this.addOrganizationDomain(organizationServiceAddOrganizationDomainRequest, Collections.emptyMap());
  }


  /**
   * Add Organization Domain
   * Add a new domain to an organization. The domains are used to identify to which organization a user belongs.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceAddOrganizationDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceAddOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceAddOrganizationDomainResponse addOrganizationDomain(OrganizationServiceAddOrganizationDomainRequest organizationServiceAddOrganizationDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceAddOrganizationDomainRequest;
    
    if (organizationServiceAddOrganizationDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceAddOrganizationDomainRequest' when calling addOrganizationDomain");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/AddOrganizationDomain";

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

    TypeReference<OrganizationServiceAddOrganizationDomainResponse> localVarReturnType = new TypeReference<OrganizationServiceAddOrganizationDomainResponse>() {};
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
   * Deactivate Organization
   * Sets the state of my organization to deactivated. Users of this organization will not be able to log in.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceDeactivateOrganizationRequest  (required)
   * @return OrganizationServiceDeactivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceDeactivateOrganizationResponse deactivateOrganization(OrganizationServiceDeactivateOrganizationRequest organizationServiceDeactivateOrganizationRequest) throws ApiException {
    return this.deactivateOrganization(organizationServiceDeactivateOrganizationRequest, Collections.emptyMap());
  }


  /**
   * Deactivate Organization
   * Sets the state of my organization to deactivated. Users of this organization will not be able to log in.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceDeactivateOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceDeactivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceDeactivateOrganizationResponse deactivateOrganization(OrganizationServiceDeactivateOrganizationRequest organizationServiceDeactivateOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceDeactivateOrganizationRequest;
    
    if (organizationServiceDeactivateOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceDeactivateOrganizationRequest' when calling deactivateOrganization");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/DeactivateOrganization";

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

    TypeReference<OrganizationServiceDeactivateOrganizationResponse> localVarReturnType = new TypeReference<OrganizationServiceDeactivateOrganizationResponse>() {};
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
   * Delete Organization
   * Deletes the organization and all its resources (Users, Projects, Grants to and from the org). Users of this organization will not be able to log in.   Required permission:   - &#x60;org.delete&#x60;
   * @param organizationServiceDeleteOrganizationRequest  (required)
   * @return OrganizationServiceDeleteOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceDeleteOrganizationResponse deleteOrganization(OrganizationServiceDeleteOrganizationRequest organizationServiceDeleteOrganizationRequest) throws ApiException {
    return this.deleteOrganization(organizationServiceDeleteOrganizationRequest, Collections.emptyMap());
  }


  /**
   * Delete Organization
   * Deletes the organization and all its resources (Users, Projects, Grants to and from the org). Users of this organization will not be able to log in.   Required permission:   - &#x60;org.delete&#x60;
   * @param organizationServiceDeleteOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceDeleteOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceDeleteOrganizationResponse deleteOrganization(OrganizationServiceDeleteOrganizationRequest organizationServiceDeleteOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceDeleteOrganizationRequest;
    
    if (organizationServiceDeleteOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceDeleteOrganizationRequest' when calling deleteOrganization");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/DeleteOrganization";

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

    TypeReference<OrganizationServiceDeleteOrganizationResponse> localVarReturnType = new TypeReference<OrganizationServiceDeleteOrganizationResponse>() {};
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
   * Delete Organization Domain
   * Delete a new domain from an organization. The domains are used to identify to which organization a user belongs. If the uses use the domain for login, this will not be possible afterwards. They have to use another domain instead.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceDeleteOrganizationDomainRequest  (required)
   * @return OrganizationServiceDeleteOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceDeleteOrganizationDomainResponse deleteOrganizationDomain(OrganizationServiceDeleteOrganizationDomainRequest organizationServiceDeleteOrganizationDomainRequest) throws ApiException {
    return this.deleteOrganizationDomain(organizationServiceDeleteOrganizationDomainRequest, Collections.emptyMap());
  }


  /**
   * Delete Organization Domain
   * Delete a new domain from an organization. The domains are used to identify to which organization a user belongs. If the uses use the domain for login, this will not be possible afterwards. They have to use another domain instead.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceDeleteOrganizationDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceDeleteOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceDeleteOrganizationDomainResponse deleteOrganizationDomain(OrganizationServiceDeleteOrganizationDomainRequest organizationServiceDeleteOrganizationDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceDeleteOrganizationDomainRequest;
    
    if (organizationServiceDeleteOrganizationDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceDeleteOrganizationDomainRequest' when calling deleteOrganizationDomain");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/DeleteOrganizationDomain";

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

    TypeReference<OrganizationServiceDeleteOrganizationDomainResponse> localVarReturnType = new TypeReference<OrganizationServiceDeleteOrganizationDomainResponse>() {};
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
   * Delete Organization Metadata
   * Delete metadata objects from an organization with a specific key.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceDeleteOrganizationMetadataRequest  (required)
   * @return OrganizationServiceDeleteOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceDeleteOrganizationMetadataResponse deleteOrganizationMetadata(OrganizationServiceDeleteOrganizationMetadataRequest organizationServiceDeleteOrganizationMetadataRequest) throws ApiException {
    return this.deleteOrganizationMetadata(organizationServiceDeleteOrganizationMetadataRequest, Collections.emptyMap());
  }


  /**
   * Delete Organization Metadata
   * Delete metadata objects from an organization with a specific key.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceDeleteOrganizationMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceDeleteOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceDeleteOrganizationMetadataResponse deleteOrganizationMetadata(OrganizationServiceDeleteOrganizationMetadataRequest organizationServiceDeleteOrganizationMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceDeleteOrganizationMetadataRequest;
    
    if (organizationServiceDeleteOrganizationMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceDeleteOrganizationMetadataRequest' when calling deleteOrganizationMetadata");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/DeleteOrganizationMetadata";

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

    TypeReference<OrganizationServiceDeleteOrganizationMetadataResponse> localVarReturnType = new TypeReference<OrganizationServiceDeleteOrganizationMetadataResponse>() {};
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
   * Generate Organization Domain Validation
   * Generate a new file to be able to verify your domain with DNS or HTTP challenge.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceGenerateOrganizationDomainValidationRequest  (required)
   * @return OrganizationServiceGenerateOrganizationDomainValidationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceGenerateOrganizationDomainValidationResponse generateOrganizationDomainValidation(OrganizationServiceGenerateOrganizationDomainValidationRequest organizationServiceGenerateOrganizationDomainValidationRequest) throws ApiException {
    return this.generateOrganizationDomainValidation(organizationServiceGenerateOrganizationDomainValidationRequest, Collections.emptyMap());
  }


  /**
   * Generate Organization Domain Validation
   * Generate a new file to be able to verify your domain with DNS or HTTP challenge.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceGenerateOrganizationDomainValidationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceGenerateOrganizationDomainValidationResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceGenerateOrganizationDomainValidationResponse generateOrganizationDomainValidation(OrganizationServiceGenerateOrganizationDomainValidationRequest organizationServiceGenerateOrganizationDomainValidationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceGenerateOrganizationDomainValidationRequest;
    
    if (organizationServiceGenerateOrganizationDomainValidationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceGenerateOrganizationDomainValidationRequest' when calling generateOrganizationDomainValidation");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/GenerateOrganizationDomainValidation";

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

    TypeReference<OrganizationServiceGenerateOrganizationDomainValidationResponse> localVarReturnType = new TypeReference<OrganizationServiceGenerateOrganizationDomainValidationResponse>() {};
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
   * List Organization Domains
   * Returns the list of registered domains of an organization. The domains are used to identify to which organization a user belongs.   Required permission:   - &#x60;org.read&#x60;
   * @param organizationServiceListOrganizationDomainsRequest  (required)
   * @return OrganizationServiceListOrganizationDomainsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceListOrganizationDomainsResponse listOrganizationDomains(OrganizationServiceListOrganizationDomainsRequest organizationServiceListOrganizationDomainsRequest) throws ApiException {
    return this.listOrganizationDomains(organizationServiceListOrganizationDomainsRequest, Collections.emptyMap());
  }


  /**
   * List Organization Domains
   * Returns the list of registered domains of an organization. The domains are used to identify to which organization a user belongs.   Required permission:   - &#x60;org.read&#x60;
   * @param organizationServiceListOrganizationDomainsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceListOrganizationDomainsResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceListOrganizationDomainsResponse listOrganizationDomains(OrganizationServiceListOrganizationDomainsRequest organizationServiceListOrganizationDomainsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceListOrganizationDomainsRequest;
    
    if (organizationServiceListOrganizationDomainsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceListOrganizationDomainsRequest' when calling listOrganizationDomains");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/ListOrganizationDomains";

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

    TypeReference<OrganizationServiceListOrganizationDomainsResponse> localVarReturnType = new TypeReference<OrganizationServiceListOrganizationDomainsResponse>() {};
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
   * List Organization Metadata
   * List metadata of an organization filtered by query.   Required permission:   - &#x60;org.read&#x60;
   * @param organizationServiceListOrganizationMetadataRequest  (required)
   * @return OrganizationServiceListOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceListOrganizationMetadataResponse listOrganizationMetadata(OrganizationServiceListOrganizationMetadataRequest organizationServiceListOrganizationMetadataRequest) throws ApiException {
    return this.listOrganizationMetadata(organizationServiceListOrganizationMetadataRequest, Collections.emptyMap());
  }


  /**
   * List Organization Metadata
   * List metadata of an organization filtered by query.   Required permission:   - &#x60;org.read&#x60;
   * @param organizationServiceListOrganizationMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceListOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceListOrganizationMetadataResponse listOrganizationMetadata(OrganizationServiceListOrganizationMetadataRequest organizationServiceListOrganizationMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceListOrganizationMetadataRequest;
    
    if (organizationServiceListOrganizationMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceListOrganizationMetadataRequest' when calling listOrganizationMetadata");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/ListOrganizationMetadata";

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

    TypeReference<OrganizationServiceListOrganizationMetadataResponse> localVarReturnType = new TypeReference<OrganizationServiceListOrganizationMetadataResponse>() {};
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
   * List Organizations
   * Search for Organizations. By default, we will return all organization of the instance that you have permission to read.  Make sure to include a limit and sorting for pagination.   Required permission:   - &#x60;org.read&#x60;
   * @param organizationServiceListOrganizationsRequest  (required)
   * @return OrganizationServiceListOrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceListOrganizationsResponse listOrganizations(OrganizationServiceListOrganizationsRequest organizationServiceListOrganizationsRequest) throws ApiException {
    return this.listOrganizations(organizationServiceListOrganizationsRequest, Collections.emptyMap());
  }


  /**
   * List Organizations
   * Search for Organizations. By default, we will return all organization of the instance that you have permission to read.  Make sure to include a limit and sorting for pagination.   Required permission:   - &#x60;org.read&#x60;
   * @param organizationServiceListOrganizationsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceListOrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceListOrganizationsResponse listOrganizations(OrganizationServiceListOrganizationsRequest organizationServiceListOrganizationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceListOrganizationsRequest;
    
    if (organizationServiceListOrganizationsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceListOrganizationsRequest' when calling listOrganizations");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/ListOrganizations";

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

    TypeReference<OrganizationServiceListOrganizationsResponse> localVarReturnType = new TypeReference<OrganizationServiceListOrganizationsResponse>() {};
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
   * Set Organization Metadata
   * Adds or updates a metadata value for the requested key. Make sure the value is base64 encoded.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceSetOrganizationMetadataRequest  (required)
   * @return OrganizationServiceSetOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceSetOrganizationMetadataResponse setOrganizationMetadata(OrganizationServiceSetOrganizationMetadataRequest organizationServiceSetOrganizationMetadataRequest) throws ApiException {
    return this.setOrganizationMetadata(organizationServiceSetOrganizationMetadataRequest, Collections.emptyMap());
  }


  /**
   * Set Organization Metadata
   * Adds or updates a metadata value for the requested key. Make sure the value is base64 encoded.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceSetOrganizationMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceSetOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceSetOrganizationMetadataResponse setOrganizationMetadata(OrganizationServiceSetOrganizationMetadataRequest organizationServiceSetOrganizationMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceSetOrganizationMetadataRequest;
    
    if (organizationServiceSetOrganizationMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceSetOrganizationMetadataRequest' when calling setOrganizationMetadata");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/SetOrganizationMetadata";

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

    TypeReference<OrganizationServiceSetOrganizationMetadataResponse> localVarReturnType = new TypeReference<OrganizationServiceSetOrganizationMetadataResponse>() {};
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
   * Update Organization
   * Change the name of the organization.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceUpdateOrganizationRequest  (required)
   * @return OrganizationServiceUpdateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceUpdateOrganizationResponse updateOrganization(OrganizationServiceUpdateOrganizationRequest organizationServiceUpdateOrganizationRequest) throws ApiException {
    return this.updateOrganization(organizationServiceUpdateOrganizationRequest, Collections.emptyMap());
  }


  /**
   * Update Organization
   * Change the name of the organization.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceUpdateOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceUpdateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceUpdateOrganizationResponse updateOrganization(OrganizationServiceUpdateOrganizationRequest organizationServiceUpdateOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceUpdateOrganizationRequest;
    
    if (organizationServiceUpdateOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceUpdateOrganizationRequest' when calling updateOrganization");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/UpdateOrganization";

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

    TypeReference<OrganizationServiceUpdateOrganizationResponse> localVarReturnType = new TypeReference<OrganizationServiceUpdateOrganizationResponse>() {};
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
   * Verify Organization Domain
   * Make sure you have added the required verification to your domain, depending on the method you have chosen (HTTP or DNS challenge). ZITADEL will check it and set the domain as verified if it was successful. A verify domain has to be unique.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceVerifyOrganizationDomainRequest  (required)
   * @return OrganizationServiceVerifyOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationServiceVerifyOrganizationDomainResponse verifyOrganizationDomain(OrganizationServiceVerifyOrganizationDomainRequest organizationServiceVerifyOrganizationDomainRequest) throws ApiException {
    return this.verifyOrganizationDomain(organizationServiceVerifyOrganizationDomainRequest, Collections.emptyMap());
  }


  /**
   * Verify Organization Domain
   * Make sure you have added the required verification to your domain, depending on the method you have chosen (HTTP or DNS challenge). ZITADEL will check it and set the domain as verified if it was successful. A verify domain has to be unique.   Required permission:   - &#x60;org.write&#x60;
   * @param organizationServiceVerifyOrganizationDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OrganizationServiceVerifyOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  private OrganizationServiceVerifyOrganizationDomainResponse verifyOrganizationDomain(OrganizationServiceVerifyOrganizationDomainRequest organizationServiceVerifyOrganizationDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = organizationServiceVerifyOrganizationDomainRequest;
    
    if (organizationServiceVerifyOrganizationDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationServiceVerifyOrganizationDomainRequest' when calling verifyOrganizationDomain");
    }
    
    String localVarPath = "/zitadel.org.v2.OrganizationService/VerifyOrganizationDomain";

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

    TypeReference<OrganizationServiceVerifyOrganizationDomainResponse> localVarReturnType = new TypeReference<OrganizationServiceVerifyOrganizationDomainResponse>() {};
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
