package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zitadel.ApiException;
import com.zitadel.model.BetaOIDCServiceCreateCallbackRequest;
import com.zitadel.model.BetaOIDCServiceCreateCallbackResponse;
import com.zitadel.model.BetaOIDCServiceGetAuthRequestRequest;
import com.zitadel.model.BetaOIDCServiceGetAuthRequestResponse;

import java.util.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaOidcServiceApi extends BaseApi {

  public BetaOidcServiceApi() {
      super(ApiClient.defaultApiClient);
  }

  public BetaOidcServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * CreateCallback
   *
   * @param betaOIDCServiceCreateCallbackRequest  (required)
   * @return BetaOIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOIDCServiceCreateCallbackResponse createCallback(BetaOIDCServiceCreateCallbackRequest betaOIDCServiceCreateCallbackRequest) throws ApiException {
    return this.createCallback(betaOIDCServiceCreateCallbackRequest, Collections.emptyMap());
  }


  /**
   * CreateCallback
   *
   * @param betaOIDCServiceCreateCallbackRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOIDCServiceCreateCallbackResponse createCallback(BetaOIDCServiceCreateCallbackRequest betaOIDCServiceCreateCallbackRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOIDCServiceCreateCallbackRequest;

    if (betaOIDCServiceCreateCallbackRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOIDCServiceCreateCallbackRequest' when calling createCallback");
    }

    String localVarPath = "/zitadel.oidc.v2beta.OIDCService/CreateCallback";

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

    TypeReference<BetaOIDCServiceCreateCallbackResponse> localVarReturnType = new TypeReference<BetaOIDCServiceCreateCallbackResponse>() {};
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
   * GetAuthRequest
   *
   * @param betaOIDCServiceGetAuthRequestRequest  (required)
   * @return BetaOIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  public BetaOIDCServiceGetAuthRequestResponse getAuthRequest(BetaOIDCServiceGetAuthRequestRequest betaOIDCServiceGetAuthRequestRequest) throws ApiException {
    return this.getAuthRequest(betaOIDCServiceGetAuthRequestRequest, Collections.emptyMap());
  }


  /**
   * GetAuthRequest
   *
   * @param betaOIDCServiceGetAuthRequestRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaOIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  private BetaOIDCServiceGetAuthRequestResponse getAuthRequest(BetaOIDCServiceGetAuthRequestRequest betaOIDCServiceGetAuthRequestRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaOIDCServiceGetAuthRequestRequest;

    if (betaOIDCServiceGetAuthRequestRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaOIDCServiceGetAuthRequestRequest' when calling getAuthRequest");
    }

    String localVarPath = "/zitadel.oidc.v2beta.OIDCService/GetAuthRequest";

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

    TypeReference<BetaOIDCServiceGetAuthRequestResponse> localVarReturnType = new TypeReference<BetaOIDCServiceGetAuthRequestResponse>() {};
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
