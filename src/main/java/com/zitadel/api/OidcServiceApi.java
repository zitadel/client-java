package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.OIDCServiceAuthorizeOrDenyDeviceAuthorizationRequest;
import com.zitadel.model.OIDCServiceConnectError;
import com.zitadel.model.OIDCServiceCreateCallbackRequest;
import com.zitadel.model.OIDCServiceCreateCallbackResponse;
import com.zitadel.model.OIDCServiceGetAuthRequestRequest;
import com.zitadel.model.OIDCServiceGetAuthRequestResponse;
import com.zitadel.model.OIDCServiceGetDeviceAuthorizationRequestRequest;
import com.zitadel.model.OIDCServiceGetDeviceAuthorizationRequestResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class OidcServiceApi extends BaseApi {

  public OidcServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public OidcServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * AuthorizeOrDenyDeviceAuthorization
   * Authorize or deny device authorization   Authorize or deny the device authorization request based on the provided device authorization id.
   * @param oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object authorizeOrDenyDeviceAuthorization(OIDCServiceAuthorizeOrDenyDeviceAuthorizationRequest oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest) throws ApiException {
    return this.authorizeOrDenyDeviceAuthorization(oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * AuthorizeOrDenyDeviceAuthorization
   * Authorize or deny device authorization   Authorize or deny the device authorization request based on the provided device authorization id.
   * @param oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  private Object authorizeOrDenyDeviceAuthorization(OIDCServiceAuthorizeOrDenyDeviceAuthorizationRequest oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest;
    
    if (oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest' when calling authorizeOrDenyDeviceAuthorization");
    }
    
    String localVarPath = "/zitadel.oidc.v2.OIDCService/AuthorizeOrDenyDeviceAuthorization";

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

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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
   * CreateCallback
   * 
   * @param oiDCServiceCreateCallbackRequest  (required)
   * @return OIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceCreateCallbackResponse createCallback(OIDCServiceCreateCallbackRequest oiDCServiceCreateCallbackRequest) throws ApiException {
    return this.createCallback(oiDCServiceCreateCallbackRequest, Collections.emptyMap());
  }


  /**
   * CreateCallback
   * 
   * @param oiDCServiceCreateCallbackRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  private OIDCServiceCreateCallbackResponse createCallback(OIDCServiceCreateCallbackRequest oiDCServiceCreateCallbackRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = oiDCServiceCreateCallbackRequest;
    
    if (oiDCServiceCreateCallbackRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'oiDCServiceCreateCallbackRequest' when calling createCallback");
    }
    
    String localVarPath = "/zitadel.oidc.v2.OIDCService/CreateCallback";

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

    TypeReference<OIDCServiceCreateCallbackResponse> localVarReturnType = new TypeReference<OIDCServiceCreateCallbackResponse>() {};
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
   * @param oiDCServiceGetAuthRequestRequest  (required)
   * @return OIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceGetAuthRequestResponse getAuthRequest(OIDCServiceGetAuthRequestRequest oiDCServiceGetAuthRequestRequest) throws ApiException {
    return this.getAuthRequest(oiDCServiceGetAuthRequestRequest, Collections.emptyMap());
  }


  /**
   * GetAuthRequest
   * 
   * @param oiDCServiceGetAuthRequestRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  private OIDCServiceGetAuthRequestResponse getAuthRequest(OIDCServiceGetAuthRequestRequest oiDCServiceGetAuthRequestRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = oiDCServiceGetAuthRequestRequest;
    
    if (oiDCServiceGetAuthRequestRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'oiDCServiceGetAuthRequestRequest' when calling getAuthRequest");
    }
    
    String localVarPath = "/zitadel.oidc.v2.OIDCService/GetAuthRequest";

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

    TypeReference<OIDCServiceGetAuthRequestResponse> localVarReturnType = new TypeReference<OIDCServiceGetAuthRequestResponse>() {};
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
   * GetDeviceAuthorizationRequest
   * Get device authorization request   Get the device authorization based on the provided \&quot;user code\&quot;.  This will return the device authorization request, which contains the device authorization id  that is required to authorize the request once the user signed in or to deny it.
   * @param oiDCServiceGetDeviceAuthorizationRequestRequest  (required)
   * @return OIDCServiceGetDeviceAuthorizationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceGetDeviceAuthorizationRequestResponse getDeviceAuthorizationRequest(OIDCServiceGetDeviceAuthorizationRequestRequest oiDCServiceGetDeviceAuthorizationRequestRequest) throws ApiException {
    return this.getDeviceAuthorizationRequest(oiDCServiceGetDeviceAuthorizationRequestRequest, Collections.emptyMap());
  }


  /**
   * GetDeviceAuthorizationRequest
   * Get device authorization request   Get the device authorization based on the provided \&quot;user code\&quot;.  This will return the device authorization request, which contains the device authorization id  that is required to authorize the request once the user signed in or to deny it.
   * @param oiDCServiceGetDeviceAuthorizationRequestRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceGetDeviceAuthorizationRequestResponse
   * @throws ApiException if fails to make API call
   */
  private OIDCServiceGetDeviceAuthorizationRequestResponse getDeviceAuthorizationRequest(OIDCServiceGetDeviceAuthorizationRequestRequest oiDCServiceGetDeviceAuthorizationRequestRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = oiDCServiceGetDeviceAuthorizationRequestRequest;
    
    if (oiDCServiceGetDeviceAuthorizationRequestRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'oiDCServiceGetDeviceAuthorizationRequestRequest' when calling getDeviceAuthorizationRequest");
    }
    
    String localVarPath = "/zitadel.oidc.v2.OIDCService/GetDeviceAuthorizationRequest";

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

    TypeReference<OIDCServiceGetDeviceAuthorizationRequestResponse> localVarReturnType = new TypeReference<OIDCServiceGetDeviceAuthorizationRequestResponse>() {};
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
