package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.SAMLServiceConnectError;
import com.zitadel.model.SAMLServiceCreateResponseRequest;
import com.zitadel.model.SAMLServiceCreateResponseResponse;
import com.zitadel.model.SAMLServiceGetSAMLRequestRequest;
import com.zitadel.model.SAMLServiceGetSAMLRequestResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class SamlServiceApi extends BaseApi {

  public SamlServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SamlServiceApi(ApiClient apiClient) {
    super(apiClient);
  }



              /**
              * Create Response (Convenience Method)
              * Finalize a SAML Request and get the response definition for success or failure.  The response must be handled as per the SAML definition to inform the application about the success or failure.  On success, the response contains details for the application to obtain the SAMLResponse.  This method can only be called once for an SAML request.   Required permissions:    - &#x60;session.link&#x60;
                * @return SAMLServiceCreateResponseResponse
              * @throws ApiException if fails to make API call
              */
              public SAMLServiceCreateResponseResponse createResponse() throws ApiException {
              return this.createResponse(new SAMLServiceCreateResponseRequest());
              }


  /**
   * Create Response
   * Finalize a SAML Request and get the response definition for success or failure.  The response must be handled as per the SAML definition to inform the application about the success or failure.  On success, the response contains details for the application to obtain the SAMLResponse.  This method can only be called once for an SAML request.   Required permissions:    - &#x60;session.link&#x60;
   * @param saMLServiceCreateResponseRequest  (required)
   * @return SAMLServiceCreateResponseResponse
   * @throws ApiException if fails to make API call
   */
  public SAMLServiceCreateResponseResponse createResponse(SAMLServiceCreateResponseRequest saMLServiceCreateResponseRequest) throws ApiException {
    return this.createResponse(saMLServiceCreateResponseRequest, Collections.emptyMap());
  }


  /**
   * Create Response
   * Finalize a SAML Request and get the response definition for success or failure.  The response must be handled as per the SAML definition to inform the application about the success or failure.  On success, the response contains details for the application to obtain the SAMLResponse.  This method can only be called once for an SAML request.   Required permissions:    - &#x60;session.link&#x60;
   * @param saMLServiceCreateResponseRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SAMLServiceCreateResponseResponse
   * @throws ApiException if fails to make API call
   */
  private SAMLServiceCreateResponseResponse createResponse(SAMLServiceCreateResponseRequest saMLServiceCreateResponseRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = saMLServiceCreateResponseRequest;
    
    if (saMLServiceCreateResponseRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'saMLServiceCreateResponseRequest' when calling createResponse");
    }
    
    String localVarPath = "/zitadel.saml.v2.SAMLService/CreateResponse";

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

    TypeReference<SAMLServiceCreateResponseResponse> localVarReturnType = new TypeReference<SAMLServiceCreateResponseResponse>() {};
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
   * Get SAML Request
   * Get SAML Request details by ID. Returns details that are parsed from the application&#39;s SAML Request.   Required permissions:    - &#x60;session.read&#x60;
   * @param saMLServiceGetSAMLRequestRequest  (required)
   * @return SAMLServiceGetSAMLRequestResponse
   * @throws ApiException if fails to make API call
   */
  public SAMLServiceGetSAMLRequestResponse getSAMLRequest(SAMLServiceGetSAMLRequestRequest saMLServiceGetSAMLRequestRequest) throws ApiException {
    return this.getSAMLRequest(saMLServiceGetSAMLRequestRequest, Collections.emptyMap());
  }


  /**
   * Get SAML Request
   * Get SAML Request details by ID. Returns details that are parsed from the application&#39;s SAML Request.   Required permissions:    - &#x60;session.read&#x60;
   * @param saMLServiceGetSAMLRequestRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SAMLServiceGetSAMLRequestResponse
   * @throws ApiException if fails to make API call
   */
  private SAMLServiceGetSAMLRequestResponse getSAMLRequest(SAMLServiceGetSAMLRequestRequest saMLServiceGetSAMLRequestRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = saMLServiceGetSAMLRequestRequest;
    
    if (saMLServiceGetSAMLRequestRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'saMLServiceGetSAMLRequestRequest' when calling getSAMLRequest");
    }
    
    String localVarPath = "/zitadel.saml.v2.SAMLService/GetSAMLRequest";

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

    TypeReference<SAMLServiceGetSAMLRequestResponse> localVarReturnType = new TypeReference<SAMLServiceGetSAMLRequestResponse>() {};
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
