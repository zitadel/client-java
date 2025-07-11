package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Pair;

import com.zitadel.model.BetaOrganizationServiceActivateOrganizationRequest;
import com.zitadel.model.BetaOrganizationServiceActivateOrganizationResponse;
import com.zitadel.model.BetaOrganizationServiceAddOrganizationDomainRequest;
import com.zitadel.model.BetaOrganizationServiceAddOrganizationDomainResponse;
import com.zitadel.model.BetaOrganizationServiceCreateOrganizationRequest;
import com.zitadel.model.BetaOrganizationServiceCreateOrganizationResponse;
import com.zitadel.model.BetaOrganizationServiceDeactivateOrganizationRequest;
import com.zitadel.model.BetaOrganizationServiceDeactivateOrganizationResponse;
import com.zitadel.model.BetaOrganizationServiceDeleteOrganizationDomainRequest;
import com.zitadel.model.BetaOrganizationServiceDeleteOrganizationDomainResponse;
import com.zitadel.model.BetaOrganizationServiceDeleteOrganizationMetadataRequest;
import com.zitadel.model.BetaOrganizationServiceDeleteOrganizationMetadataResponse;
import com.zitadel.model.BetaOrganizationServiceDeleteOrganizationRequest;
import com.zitadel.model.BetaOrganizationServiceDeleteOrganizationResponse;
import com.zitadel.model.BetaOrganizationServiceGenerateOrganizationDomainValidationRequest;
import com.zitadel.model.BetaOrganizationServiceGenerateOrganizationDomainValidationResponse;
import com.zitadel.model.BetaOrganizationServiceListOrganizationDomainsRequest;
import com.zitadel.model.BetaOrganizationServiceListOrganizationDomainsResponse;
import com.zitadel.model.BetaOrganizationServiceListOrganizationMetadataRequest;
import com.zitadel.model.BetaOrganizationServiceListOrganizationMetadataResponse;
import com.zitadel.model.BetaOrganizationServiceListOrganizationsRequest;
import com.zitadel.model.BetaOrganizationServiceListOrganizationsResponse;
import com.zitadel.model.BetaOrganizationServiceSetOrganizationMetadataRequest;
import com.zitadel.model.BetaOrganizationServiceSetOrganizationMetadataResponse;
import com.zitadel.model.BetaOrganizationServiceUpdateOrganizationRequest;
import com.zitadel.model.BetaOrganizationServiceUpdateOrganizationResponse;
import com.zitadel.model.BetaOrganizationServiceVerifyOrganizationDomainRequest;
import com.zitadel.model.BetaOrganizationServiceVerifyOrganizationDomainResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaOrganizationServiceApi extends BaseApi {

  public BetaOrganizationServiceApi() {
      super(ApiClient.defaultApiClient);
  }

  public BetaOrganizationServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * ActivateOrganization
   * Activate Organization   Set the state of my organization to active. The state of the organization has to be deactivated to perform the request. Users of this organization will be able to log in again.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceActivateOrganizationRequest  (required)
   * @return BetaOrganizationServiceActivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceActivateOrganizationResponse activateOrganization(BetaOrganizationServiceActivateOrganizationRequest betaOrganizationServiceActivateOrganizationRequest) throws ApiException {
    return this.activateOrganization(betaOrganizationServiceActivateOrganizationRequest, Collections.emptyMap());
  }


  /**
   * ActivateOrganization
   * Activate Organization   Set the state of my organization to active. The state of the organization has to be deactivated to perform the request. Users of this organization will be able to log in again.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceActivateOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceActivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceActivateOrganizationResponse activateOrganization(BetaOrganizationServiceActivateOrganizationRequest betaOrganizationServiceActivateOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceActivateOrganizationRequest;

    if (betaOrganizationServiceActivateOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceActivateOrganizationRequest' when calling activateOrganization");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/ActivateOrganization";

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

    TypeReference<BetaOrganizationServiceActivateOrganizationResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceActivateOrganizationResponse>() {};
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
   * AddOrganizationDomain
   * Add Organization Domain   Add a new domain to an organization. The domains are used to identify to which organization a user belongs.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceAddOrganizationDomainRequest  (required)
   * @return BetaOrganizationServiceAddOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceAddOrganizationDomainResponse addOrganizationDomain(BetaOrganizationServiceAddOrganizationDomainRequest betaOrganizationServiceAddOrganizationDomainRequest) throws ApiException {
    return this.addOrganizationDomain(betaOrganizationServiceAddOrganizationDomainRequest, Collections.emptyMap());
  }


  /**
   * AddOrganizationDomain
   * Add Organization Domain   Add a new domain to an organization. The domains are used to identify to which organization a user belongs.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceAddOrganizationDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceAddOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceAddOrganizationDomainResponse addOrganizationDomain(BetaOrganizationServiceAddOrganizationDomainRequest betaOrganizationServiceAddOrganizationDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceAddOrganizationDomainRequest;

    if (betaOrganizationServiceAddOrganizationDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceAddOrganizationDomainRequest' when calling addOrganizationDomain");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/AddOrganizationDomain";

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

    TypeReference<BetaOrganizationServiceAddOrganizationDomainResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceAddOrganizationDomainResponse>() {};
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
   * CreateOrganization
   * Create Organization   Create a new organization with an administrative user. If no specific roles are sent for the users, they will be granted the role ORG_OWNER.   Required permission:   - &#x60;org.create&#x60;
   * @param betaOrganizationServiceCreateOrganizationRequest  (required)
   * @return BetaOrganizationServiceCreateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceCreateOrganizationResponse createOrganization(BetaOrganizationServiceCreateOrganizationRequest betaOrganizationServiceCreateOrganizationRequest) throws ApiException {
    return this.createOrganization(betaOrganizationServiceCreateOrganizationRequest, Collections.emptyMap());
  }


  /**
   * CreateOrganization
   * Create Organization   Create a new organization with an administrative user. If no specific roles are sent for the users, they will be granted the role ORG_OWNER.   Required permission:   - &#x60;org.create&#x60;
   * @param betaOrganizationServiceCreateOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceCreateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceCreateOrganizationResponse createOrganization(BetaOrganizationServiceCreateOrganizationRequest betaOrganizationServiceCreateOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceCreateOrganizationRequest;

    if (betaOrganizationServiceCreateOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceCreateOrganizationRequest' when calling createOrganization");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/CreateOrganization";

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

    TypeReference<BetaOrganizationServiceCreateOrganizationResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceCreateOrganizationResponse>() {};
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
   * DeactivateOrganization
   * Deactivate Organization   Sets the state of my organization to deactivated. Users of this organization will not be able to log in.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceDeactivateOrganizationRequest  (required)
   * @return BetaOrganizationServiceDeactivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceDeactivateOrganizationResponse deactivateOrganization(BetaOrganizationServiceDeactivateOrganizationRequest betaOrganizationServiceDeactivateOrganizationRequest) throws ApiException {
    return this.deactivateOrganization(betaOrganizationServiceDeactivateOrganizationRequest, Collections.emptyMap());
  }


  /**
   * DeactivateOrganization
   * Deactivate Organization   Sets the state of my organization to deactivated. Users of this organization will not be able to log in.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceDeactivateOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceDeactivateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceDeactivateOrganizationResponse deactivateOrganization(BetaOrganizationServiceDeactivateOrganizationRequest betaOrganizationServiceDeactivateOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceDeactivateOrganizationRequest;

    if (betaOrganizationServiceDeactivateOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceDeactivateOrganizationRequest' when calling deactivateOrganization");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/DeactivateOrganization";

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

    TypeReference<BetaOrganizationServiceDeactivateOrganizationResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceDeactivateOrganizationResponse>() {};
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
   * DeleteOrganization
   * Delete Organization   Deletes the organization and all its resources (Users, Projects, Grants to and from the org). Users of this organization will not be able to log in.   Required permission:   - &#x60;org.delete&#x60;
   * @param betaOrganizationServiceDeleteOrganizationRequest  (required)
   * @return BetaOrganizationServiceDeleteOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceDeleteOrganizationResponse deleteOrganization(BetaOrganizationServiceDeleteOrganizationRequest betaOrganizationServiceDeleteOrganizationRequest) throws ApiException {
    return this.deleteOrganization(betaOrganizationServiceDeleteOrganizationRequest, Collections.emptyMap());
  }


  /**
   * DeleteOrganization
   * Delete Organization   Deletes the organization and all its resources (Users, Projects, Grants to and from the org). Users of this organization will not be able to log in.   Required permission:   - &#x60;org.delete&#x60;
   * @param betaOrganizationServiceDeleteOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceDeleteOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceDeleteOrganizationResponse deleteOrganization(BetaOrganizationServiceDeleteOrganizationRequest betaOrganizationServiceDeleteOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceDeleteOrganizationRequest;

    if (betaOrganizationServiceDeleteOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceDeleteOrganizationRequest' when calling deleteOrganization");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/DeleteOrganization";

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

    TypeReference<BetaOrganizationServiceDeleteOrganizationResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceDeleteOrganizationResponse>() {};
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
   * DeleteOrganizationDomain
   * Delete Organization Domain   Delete a new domain from an organization. The domains are used to identify to which organization a user belongs. If the uses use the domain for login, this will not be possible afterwards. They have to use another domain instead.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceDeleteOrganizationDomainRequest  (required)
   * @return BetaOrganizationServiceDeleteOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceDeleteOrganizationDomainResponse deleteOrganizationDomain(BetaOrganizationServiceDeleteOrganizationDomainRequest betaOrganizationServiceDeleteOrganizationDomainRequest) throws ApiException {
    return this.deleteOrganizationDomain(betaOrganizationServiceDeleteOrganizationDomainRequest, Collections.emptyMap());
  }


  /**
   * DeleteOrganizationDomain
   * Delete Organization Domain   Delete a new domain from an organization. The domains are used to identify to which organization a user belongs. If the uses use the domain for login, this will not be possible afterwards. They have to use another domain instead.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceDeleteOrganizationDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceDeleteOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceDeleteOrganizationDomainResponse deleteOrganizationDomain(BetaOrganizationServiceDeleteOrganizationDomainRequest betaOrganizationServiceDeleteOrganizationDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceDeleteOrganizationDomainRequest;

    if (betaOrganizationServiceDeleteOrganizationDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceDeleteOrganizationDomainRequest' when calling deleteOrganizationDomain");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/DeleteOrganizationDomain";

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

    TypeReference<BetaOrganizationServiceDeleteOrganizationDomainResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceDeleteOrganizationDomainResponse>() {};
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
   * DeleteOrganizationMetadata
   * Delete Organization Metadata   Delete metadata objects from an organization with a specific key.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceDeleteOrganizationMetadataRequest  (required)
   * @return BetaOrganizationServiceDeleteOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceDeleteOrganizationMetadataResponse deleteOrganizationMetadata(BetaOrganizationServiceDeleteOrganizationMetadataRequest betaOrganizationServiceDeleteOrganizationMetadataRequest) throws ApiException {
    return this.deleteOrganizationMetadata(betaOrganizationServiceDeleteOrganizationMetadataRequest, Collections.emptyMap());
  }


  /**
   * DeleteOrganizationMetadata
   * Delete Organization Metadata   Delete metadata objects from an organization with a specific key.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceDeleteOrganizationMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceDeleteOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceDeleteOrganizationMetadataResponse deleteOrganizationMetadata(BetaOrganizationServiceDeleteOrganizationMetadataRequest betaOrganizationServiceDeleteOrganizationMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceDeleteOrganizationMetadataRequest;

    if (betaOrganizationServiceDeleteOrganizationMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceDeleteOrganizationMetadataRequest' when calling deleteOrganizationMetadata");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/DeleteOrganizationMetadata";

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

    TypeReference<BetaOrganizationServiceDeleteOrganizationMetadataResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceDeleteOrganizationMetadataResponse>() {};
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
   * GenerateOrganizationDomainValidation
   * Generate Organization Domain Validation   Generate a new file to be able to verify your domain with DNS or HTTP challenge.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceGenerateOrganizationDomainValidationRequest  (required)
   * @return BetaOrganizationServiceGenerateOrganizationDomainValidationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceGenerateOrganizationDomainValidationResponse generateOrganizationDomainValidation(BetaOrganizationServiceGenerateOrganizationDomainValidationRequest betaOrganizationServiceGenerateOrganizationDomainValidationRequest) throws ApiException {
    return this.generateOrganizationDomainValidation(betaOrganizationServiceGenerateOrganizationDomainValidationRequest, Collections.emptyMap());
  }


  /**
   * GenerateOrganizationDomainValidation
   * Generate Organization Domain Validation   Generate a new file to be able to verify your domain with DNS or HTTP challenge.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceGenerateOrganizationDomainValidationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceGenerateOrganizationDomainValidationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceGenerateOrganizationDomainValidationResponse generateOrganizationDomainValidation(BetaOrganizationServiceGenerateOrganizationDomainValidationRequest betaOrganizationServiceGenerateOrganizationDomainValidationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceGenerateOrganizationDomainValidationRequest;

    if (betaOrganizationServiceGenerateOrganizationDomainValidationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceGenerateOrganizationDomainValidationRequest' when calling generateOrganizationDomainValidation");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/GenerateOrganizationDomainValidation";

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

    TypeReference<BetaOrganizationServiceGenerateOrganizationDomainValidationResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceGenerateOrganizationDomainValidationResponse>() {};
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
   * ListOrganizationDomains
   * List Organization Domains   Returns the list of registered domains of an organization. The domains are used to identify to which organization a user belongs.    Required permission:   - &#x60;org.read&#x60;
   * @param betaOrganizationServiceListOrganizationDomainsRequest  (required)
   * @return BetaOrganizationServiceListOrganizationDomainsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceListOrganizationDomainsResponse listOrganizationDomains(BetaOrganizationServiceListOrganizationDomainsRequest betaOrganizationServiceListOrganizationDomainsRequest) throws ApiException {
    return this.listOrganizationDomains(betaOrganizationServiceListOrganizationDomainsRequest, Collections.emptyMap());
  }


  /**
   * ListOrganizationDomains
   * List Organization Domains   Returns the list of registered domains of an organization. The domains are used to identify to which organization a user belongs.    Required permission:   - &#x60;org.read&#x60;
   * @param betaOrganizationServiceListOrganizationDomainsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceListOrganizationDomainsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceListOrganizationDomainsResponse listOrganizationDomains(BetaOrganizationServiceListOrganizationDomainsRequest betaOrganizationServiceListOrganizationDomainsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceListOrganizationDomainsRequest;

    if (betaOrganizationServiceListOrganizationDomainsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceListOrganizationDomainsRequest' when calling listOrganizationDomains");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/ListOrganizationDomains";

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

    TypeReference<BetaOrganizationServiceListOrganizationDomainsResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceListOrganizationDomainsResponse>() {};
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
   * ListOrganizationMetadata
   * List Organization Metadata   List metadata of an organization filtered by query.   Required permission:   - &#x60;org.read&#x60;
   * @param betaOrganizationServiceListOrganizationMetadataRequest  (required)
   * @return BetaOrganizationServiceListOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceListOrganizationMetadataResponse listOrganizationMetadata(BetaOrganizationServiceListOrganizationMetadataRequest betaOrganizationServiceListOrganizationMetadataRequest) throws ApiException {
    return this.listOrganizationMetadata(betaOrganizationServiceListOrganizationMetadataRequest, Collections.emptyMap());
  }


  /**
   * ListOrganizationMetadata
   * List Organization Metadata   List metadata of an organization filtered by query.   Required permission:   - &#x60;org.read&#x60;
   * @param betaOrganizationServiceListOrganizationMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceListOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceListOrganizationMetadataResponse listOrganizationMetadata(BetaOrganizationServiceListOrganizationMetadataRequest betaOrganizationServiceListOrganizationMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceListOrganizationMetadataRequest;

    if (betaOrganizationServiceListOrganizationMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceListOrganizationMetadataRequest' when calling listOrganizationMetadata");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/ListOrganizationMetadata";

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

    TypeReference<BetaOrganizationServiceListOrganizationMetadataResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceListOrganizationMetadataResponse>() {};
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
   * ListOrganizations
   * List Organizations   Returns a list of organizations that match the requesting filters. All filters are applied with an AND condition.   Required permission:   - &#x60;iam.read&#x60;
   * @param betaOrganizationServiceListOrganizationsRequest  (required)
   * @return BetaOrganizationServiceListOrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceListOrganizationsResponse listOrganizations(BetaOrganizationServiceListOrganizationsRequest betaOrganizationServiceListOrganizationsRequest) throws ApiException {
    return this.listOrganizations(betaOrganizationServiceListOrganizationsRequest, Collections.emptyMap());
  }


  /**
   * ListOrganizations
   * List Organizations   Returns a list of organizations that match the requesting filters. All filters are applied with an AND condition.   Required permission:   - &#x60;iam.read&#x60;
   * @param betaOrganizationServiceListOrganizationsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceListOrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceListOrganizationsResponse listOrganizations(BetaOrganizationServiceListOrganizationsRequest betaOrganizationServiceListOrganizationsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceListOrganizationsRequest;

    if (betaOrganizationServiceListOrganizationsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceListOrganizationsRequest' when calling listOrganizations");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/ListOrganizations";

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

    TypeReference<BetaOrganizationServiceListOrganizationsResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceListOrganizationsResponse>() {};
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
   * SetOrganizationMetadata
   * Set Organization Metadata   Adds or updates a metadata value for the requested key. Make sure the value is base64 encoded.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceSetOrganizationMetadataRequest  (required)
   * @return BetaOrganizationServiceSetOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceSetOrganizationMetadataResponse setOrganizationMetadata(BetaOrganizationServiceSetOrganizationMetadataRequest betaOrganizationServiceSetOrganizationMetadataRequest) throws ApiException {
    return this.setOrganizationMetadata(betaOrganizationServiceSetOrganizationMetadataRequest, Collections.emptyMap());
  }


  /**
   * SetOrganizationMetadata
   * Set Organization Metadata   Adds or updates a metadata value for the requested key. Make sure the value is base64 encoded.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceSetOrganizationMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceSetOrganizationMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceSetOrganizationMetadataResponse setOrganizationMetadata(BetaOrganizationServiceSetOrganizationMetadataRequest betaOrganizationServiceSetOrganizationMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceSetOrganizationMetadataRequest;

    if (betaOrganizationServiceSetOrganizationMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceSetOrganizationMetadataRequest' when calling setOrganizationMetadata");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/SetOrganizationMetadata";

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

    TypeReference<BetaOrganizationServiceSetOrganizationMetadataResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceSetOrganizationMetadataResponse>() {};
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
   * UpdateOrganization
   * Update Organization   Change the name of the organization.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceUpdateOrganizationRequest  (required)
   * @return BetaOrganizationServiceUpdateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceUpdateOrganizationResponse updateOrganization(BetaOrganizationServiceUpdateOrganizationRequest betaOrganizationServiceUpdateOrganizationRequest) throws ApiException {
    return this.updateOrganization(betaOrganizationServiceUpdateOrganizationRequest, Collections.emptyMap());
  }


  /**
   * UpdateOrganization
   * Update Organization   Change the name of the organization.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceUpdateOrganizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceUpdateOrganizationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceUpdateOrganizationResponse updateOrganization(BetaOrganizationServiceUpdateOrganizationRequest betaOrganizationServiceUpdateOrganizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceUpdateOrganizationRequest;

    if (betaOrganizationServiceUpdateOrganizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceUpdateOrganizationRequest' when calling updateOrganization");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/UpdateOrganization";

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

    TypeReference<BetaOrganizationServiceUpdateOrganizationResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceUpdateOrganizationResponse>() {};
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
   * VerifyOrganizationDomain
   * Verify Organization Domain   Make sure you have added the required verification to your domain, depending on the method you have chosen (HTTP or DNS challenge). ZITADEL will check it and set the domain as verified if it was successful. A verify domain has to be unique.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceVerifyOrganizationDomainRequest  (required)
   * @return BetaOrganizationServiceVerifyOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOrganizationServiceVerifyOrganizationDomainResponse verifyOrganizationDomain(BetaOrganizationServiceVerifyOrganizationDomainRequest betaOrganizationServiceVerifyOrganizationDomainRequest) throws ApiException {
    return this.verifyOrganizationDomain(betaOrganizationServiceVerifyOrganizationDomainRequest, Collections.emptyMap());
  }


  /**
   * VerifyOrganizationDomain
   * Verify Organization Domain   Make sure you have added the required verification to your domain, depending on the method you have chosen (HTTP or DNS challenge). ZITADEL will check it and set the domain as verified if it was successful. A verify domain has to be unique.   Required permission:   - &#x60;org.write&#x60;
   * @param betaOrganizationServiceVerifyOrganizationDomainRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOrganizationServiceVerifyOrganizationDomainResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOrganizationServiceVerifyOrganizationDomainResponse verifyOrganizationDomain(BetaOrganizationServiceVerifyOrganizationDomainRequest betaOrganizationServiceVerifyOrganizationDomainRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOrganizationServiceVerifyOrganizationDomainRequest;

    if (betaOrganizationServiceVerifyOrganizationDomainRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOrganizationServiceVerifyOrganizationDomainRequest' when calling verifyOrganizationDomain");
    }

    String localVarPath = "/zitadel.org.v2beta.OrganizationService/VerifyOrganizationDomain";

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

    TypeReference<BetaOrganizationServiceVerifyOrganizationDomainResponse> localVarReturnType = new TypeReference<BetaOrganizationServiceVerifyOrganizationDomainResponse>() {};
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
