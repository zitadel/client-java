package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.OIDCServiceAuthorizeOrDenyDeviceAuthorizationRequest;
import com.zitadel.model.OIDCServiceBetaCreateCallbackResponse;
import com.zitadel.model.OIDCServiceBetaGetAuthRequestResponse;
import com.zitadel.model.OIDCServiceCreateCallbackRequest;
import com.zitadel.model.OIDCServiceCreateCallbackResponse;
import com.zitadel.model.OIDCServiceGetAuthRequestResponse;
import com.zitadel.model.OIDCServiceGetDeviceAuthorizationRequestResponse;
import com.zitadel.model.OIDCServiceRpcStatus;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class OidcServiceApi extends BaseApi {

  public OidcServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public OidcServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Authorize or deny device authorization
   * Authorize or deny the device authorization request based on the provided device authorization id.
   * @param deviceAuthorizationId The device authorization id returned when submitting the user code. (required)
   * @param oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object oIDCServiceAuthorizeOrDenyDeviceAuthorization(String deviceAuthorizationId, OIDCServiceAuthorizeOrDenyDeviceAuthorizationRequest oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest) throws ApiException {
    return this.oIDCServiceAuthorizeOrDenyDeviceAuthorization(deviceAuthorizationId, oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest, Collections.emptyMap());
  }


  /**
   * Authorize or deny device authorization
   * Authorize or deny the device authorization request based on the provided device authorization id.
   * @param deviceAuthorizationId The device authorization id returned when submitting the user code. (required)
   * @param oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object oIDCServiceAuthorizeOrDenyDeviceAuthorization(String deviceAuthorizationId, OIDCServiceAuthorizeOrDenyDeviceAuthorizationRequest oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest;
    
    if (deviceAuthorizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'deviceAuthorizationId' when calling oIDCServiceAuthorizeOrDenyDeviceAuthorization");
    }
    
    if (oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'oiDCServiceAuthorizeOrDenyDeviceAuthorizationRequest' when calling oIDCServiceAuthorizeOrDenyDeviceAuthorization");
    }
    
    String localVarPath = "/v2/oidc/device_authorization/{deviceAuthorizationId}"
      .replaceAll("\\{" + "deviceAuthorizationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(deviceAuthorizationId)));

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
   * Finalize an Auth Request and get the callback URL.
   * Finalize an Auth Request and get the callback URL for success or failure. The user must be redirected to the URL in order to inform the application about the success or failure. On success, the URL contains details for the application to obtain the tokens. This method can only be called once for an Auth request.
   * @param authRequestId ID of the Auth Request. (required)
   * @param oiDCServiceCreateCallbackRequest  (required)
   * @return OIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceCreateCallbackResponse oIDCServiceCreateCallback(String authRequestId, OIDCServiceCreateCallbackRequest oiDCServiceCreateCallbackRequest) throws ApiException {
    return this.oIDCServiceCreateCallback(authRequestId, oiDCServiceCreateCallbackRequest, Collections.emptyMap());
  }


  /**
   * Finalize an Auth Request and get the callback URL.
   * Finalize an Auth Request and get the callback URL for success or failure. The user must be redirected to the URL in order to inform the application about the success or failure. On success, the URL contains details for the application to obtain the tokens. This method can only be called once for an Auth request.
   * @param authRequestId ID of the Auth Request. (required)
   * @param oiDCServiceCreateCallbackRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceCreateCallbackResponse oIDCServiceCreateCallback(String authRequestId, OIDCServiceCreateCallbackRequest oiDCServiceCreateCallbackRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = oiDCServiceCreateCallbackRequest;
    
    if (authRequestId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authRequestId' when calling oIDCServiceCreateCallback");
    }
    
    if (oiDCServiceCreateCallbackRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'oiDCServiceCreateCallbackRequest' when calling oIDCServiceCreateCallback");
    }
    
    String localVarPath = "/v2/oidc/auth_requests/{authRequestId}"
      .replaceAll("\\{" + "authRequestId" + "\\}", apiClient.escapeString(apiClient.parameterToString(authRequestId)));

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
   * Finalize an Auth Request and get the callback URL.
   * Finalize an Auth Request and get the callback URL for success or failure. The user must be redirected to the URL in order to inform the application about the success or failure. On success, the URL contains details for the application to obtain the tokens. This method can only be called once for an Auth request.
   * @param authRequestId Set this field when the authorization flow failed. It creates a callback URL to the application, with the error details set. (required)
   * @param oiDCServiceCreateCallbackRequest  (required)
   * @return OIDCServiceBetaCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceBetaCreateCallbackResponse oIDCServiceCreateCallback_0(String authRequestId, OIDCServiceCreateCallbackRequest oiDCServiceCreateCallbackRequest) throws ApiException {
    return this.oIDCServiceCreateCallback_0(authRequestId, oiDCServiceCreateCallbackRequest, Collections.emptyMap());
  }


  /**
   * Finalize an Auth Request and get the callback URL.
   * Finalize an Auth Request and get the callback URL for success or failure. The user must be redirected to the URL in order to inform the application about the success or failure. On success, the URL contains details for the application to obtain the tokens. This method can only be called once for an Auth request.
   * @param authRequestId Set this field when the authorization flow failed. It creates a callback URL to the application, with the error details set. (required)
   * @param oiDCServiceCreateCallbackRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceBetaCreateCallbackResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceBetaCreateCallbackResponse oIDCServiceCreateCallback_0(String authRequestId, OIDCServiceCreateCallbackRequest oiDCServiceCreateCallbackRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = oiDCServiceCreateCallbackRequest;
    
    if (authRequestId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authRequestId' when calling oIDCServiceCreateCallback_0");
    }
    
    if (oiDCServiceCreateCallbackRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'oiDCServiceCreateCallbackRequest' when calling oIDCServiceCreateCallback_0");
    }
    
    String localVarPath = "/v2beta/oidc/auth_requests/{authRequestId}"
      .replaceAll("\\{" + "authRequestId" + "\\}", apiClient.escapeString(apiClient.parameterToString(authRequestId)));

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

    TypeReference<OIDCServiceBetaCreateCallbackResponse> localVarReturnType = new TypeReference<OIDCServiceBetaCreateCallbackResponse>() {};
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
   * Get OIDC Auth Request details
   * Get OIDC Auth Request details by ID, obtained from the redirect URL. Returns details that are parsed from the application&#39;s Auth Request.
   * @param authRequestId ID of the Auth Request, as obtained from the redirect URL. (required)
   * @return OIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceGetAuthRequestResponse oIDCServiceGetAuthRequest(String authRequestId) throws ApiException {
    return this.oIDCServiceGetAuthRequest(authRequestId, Collections.emptyMap());
  }


  /**
   * Get OIDC Auth Request details
   * Get OIDC Auth Request details by ID, obtained from the redirect URL. Returns details that are parsed from the application&#39;s Auth Request.
   * @param authRequestId ID of the Auth Request, as obtained from the redirect URL. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceGetAuthRequestResponse oIDCServiceGetAuthRequest(String authRequestId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (authRequestId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authRequestId' when calling oIDCServiceGetAuthRequest");
    }
    
    String localVarPath = "/v2/oidc/auth_requests/{authRequestId}"
      .replaceAll("\\{" + "authRequestId" + "\\}", apiClient.escapeString(apiClient.parameterToString(authRequestId)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<OIDCServiceGetAuthRequestResponse> localVarReturnType = new TypeReference<OIDCServiceGetAuthRequestResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
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
   * Get OIDC Auth Request details
   * Get OIDC Auth Request details by ID, obtained from the redirect URL. Returns details that are parsed from the application&#39;s Auth Request.
   * @param authRequestId ID of the Auth Request, as obtained from the redirect URL. (required)
   * @return OIDCServiceBetaGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceBetaGetAuthRequestResponse oIDCServiceGetAuthRequest_0(String authRequestId) throws ApiException {
    return this.oIDCServiceGetAuthRequest_0(authRequestId, Collections.emptyMap());
  }


  /**
   * Get OIDC Auth Request details
   * Get OIDC Auth Request details by ID, obtained from the redirect URL. Returns details that are parsed from the application&#39;s Auth Request.
   * @param authRequestId ID of the Auth Request, as obtained from the redirect URL. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceBetaGetAuthRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceBetaGetAuthRequestResponse oIDCServiceGetAuthRequest_0(String authRequestId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (authRequestId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'authRequestId' when calling oIDCServiceGetAuthRequest_0");
    }
    
    String localVarPath = "/v2beta/oidc/auth_requests/{authRequestId}"
      .replaceAll("\\{" + "authRequestId" + "\\}", apiClient.escapeString(apiClient.parameterToString(authRequestId)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<OIDCServiceBetaGetAuthRequestResponse> localVarReturnType = new TypeReference<OIDCServiceBetaGetAuthRequestResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
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
   * Get device authorization request
   * Get the device authorization based on the provided \&quot;user code\&quot;. This will return the device authorization request, which contains the device authorization id that is required to authorize the request once the user signed in or to deny it.
   * @param userCode The user_code returned by the device authorization request and provided to the user by the device. (required)
   * @return OIDCServiceGetDeviceAuthorizationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceGetDeviceAuthorizationRequestResponse oIDCServiceGetDeviceAuthorizationRequest(String userCode) throws ApiException {
    return this.oIDCServiceGetDeviceAuthorizationRequest(userCode, Collections.emptyMap());
  }


  /**
   * Get device authorization request
   * Get the device authorization based on the provided \&quot;user code\&quot;. This will return the device authorization request, which contains the device authorization id that is required to authorize the request once the user signed in or to deny it.
   * @param userCode The user_code returned by the device authorization request and provided to the user by the device. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return OIDCServiceGetDeviceAuthorizationRequestResponse
   * @throws ApiException if fails to make API call
   */
  public OIDCServiceGetDeviceAuthorizationRequestResponse oIDCServiceGetDeviceAuthorizationRequest(String userCode, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userCode' when calling oIDCServiceGetDeviceAuthorizationRequest");
    }
    
    String localVarPath = "/v2/oidc/device_authorization/{userCode}"
      .replaceAll("\\{" + "userCode" + "\\}", apiClient.escapeString(apiClient.parameterToString(userCode)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<OIDCServiceGetDeviceAuthorizationRequestResponse> localVarReturnType = new TypeReference<OIDCServiceGetDeviceAuthorizationRequestResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
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
