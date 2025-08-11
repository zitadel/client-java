package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaSessionServiceConnectError;
import com.zitadel.model.BetaSessionServiceCreateSessionRequest;
import com.zitadel.model.BetaSessionServiceCreateSessionResponse;
import com.zitadel.model.BetaSessionServiceDeleteSessionRequest;
import com.zitadel.model.BetaSessionServiceDeleteSessionResponse;
import com.zitadel.model.BetaSessionServiceGetSessionRequest;
import com.zitadel.model.BetaSessionServiceGetSessionResponse;
import com.zitadel.model.BetaSessionServiceListSessionsRequest;
import com.zitadel.model.BetaSessionServiceListSessionsResponse;
import com.zitadel.model.BetaSessionServiceSetSessionRequest;
import com.zitadel.model.BetaSessionServiceSetSessionResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class BetaSessionServiceApi extends BaseApi {

  public BetaSessionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaSessionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * CreateSession
   * Create a new session
   * @param betaSessionServiceCreateSessionRequest  (required)
   * @return BetaSessionServiceCreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSessionServiceCreateSessionResponse createSession(BetaSessionServiceCreateSessionRequest betaSessionServiceCreateSessionRequest) throws ApiException {
    return this.createSession(betaSessionServiceCreateSessionRequest, Collections.emptyMap());
  }


  /**
   * CreateSession
   * Create a new session
   * @param betaSessionServiceCreateSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSessionServiceCreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSessionServiceCreateSessionResponse createSession(BetaSessionServiceCreateSessionRequest betaSessionServiceCreateSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSessionServiceCreateSessionRequest;
    
    if (betaSessionServiceCreateSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSessionServiceCreateSessionRequest' when calling createSession");
    }
    
    String localVarPath = "/zitadel.session.v2beta.SessionService/CreateSession";

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

    TypeReference<BetaSessionServiceCreateSessionResponse> localVarReturnType = new TypeReference<BetaSessionServiceCreateSessionResponse>() {};
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
   * DeleteSession
   * Terminate a session
   * @param betaSessionServiceDeleteSessionRequest  (required)
   * @return BetaSessionServiceDeleteSessionResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSessionServiceDeleteSessionResponse deleteSession(BetaSessionServiceDeleteSessionRequest betaSessionServiceDeleteSessionRequest) throws ApiException {
    return this.deleteSession(betaSessionServiceDeleteSessionRequest, Collections.emptyMap());
  }


  /**
   * DeleteSession
   * Terminate a session
   * @param betaSessionServiceDeleteSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSessionServiceDeleteSessionResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSessionServiceDeleteSessionResponse deleteSession(BetaSessionServiceDeleteSessionRequest betaSessionServiceDeleteSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSessionServiceDeleteSessionRequest;
    
    if (betaSessionServiceDeleteSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSessionServiceDeleteSessionRequest' when calling deleteSession");
    }
    
    String localVarPath = "/zitadel.session.v2beta.SessionService/DeleteSession";

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

    TypeReference<BetaSessionServiceDeleteSessionResponse> localVarReturnType = new TypeReference<BetaSessionServiceDeleteSessionResponse>() {};
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
   * GetSession
   * GetSession a session
   * @param betaSessionServiceGetSessionRequest  (required)
   * @return BetaSessionServiceGetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSessionServiceGetSessionResponse getSession(BetaSessionServiceGetSessionRequest betaSessionServiceGetSessionRequest) throws ApiException {
    return this.getSession(betaSessionServiceGetSessionRequest, Collections.emptyMap());
  }


  /**
   * GetSession
   * GetSession a session
   * @param betaSessionServiceGetSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSessionServiceGetSessionResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSessionServiceGetSessionResponse getSession(BetaSessionServiceGetSessionRequest betaSessionServiceGetSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSessionServiceGetSessionRequest;
    
    if (betaSessionServiceGetSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSessionServiceGetSessionRequest' when calling getSession");
    }
    
    String localVarPath = "/zitadel.session.v2beta.SessionService/GetSession";

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

    TypeReference<BetaSessionServiceGetSessionResponse> localVarReturnType = new TypeReference<BetaSessionServiceGetSessionResponse>() {};
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
   * ListSessions
   * Search sessions
   * @param betaSessionServiceListSessionsRequest  (required)
   * @return BetaSessionServiceListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSessionServiceListSessionsResponse listSessions(BetaSessionServiceListSessionsRequest betaSessionServiceListSessionsRequest) throws ApiException {
    return this.listSessions(betaSessionServiceListSessionsRequest, Collections.emptyMap());
  }


  /**
   * ListSessions
   * Search sessions
   * @param betaSessionServiceListSessionsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSessionServiceListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSessionServiceListSessionsResponse listSessions(BetaSessionServiceListSessionsRequest betaSessionServiceListSessionsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSessionServiceListSessionsRequest;
    
    if (betaSessionServiceListSessionsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSessionServiceListSessionsRequest' when calling listSessions");
    }
    
    String localVarPath = "/zitadel.session.v2beta.SessionService/ListSessions";

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

    TypeReference<BetaSessionServiceListSessionsResponse> localVarReturnType = new TypeReference<BetaSessionServiceListSessionsResponse>() {};
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
   * SetSession
   * Update a session
   * @param betaSessionServiceSetSessionRequest  (required)
   * @return BetaSessionServiceSetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSessionServiceSetSessionResponse setSession(BetaSessionServiceSetSessionRequest betaSessionServiceSetSessionRequest) throws ApiException {
    return this.setSession(betaSessionServiceSetSessionRequest, Collections.emptyMap());
  }


  /**
   * SetSession
   * Update a session
   * @param betaSessionServiceSetSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSessionServiceSetSessionResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSessionServiceSetSessionResponse setSession(BetaSessionServiceSetSessionRequest betaSessionServiceSetSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSessionServiceSetSessionRequest;
    
    if (betaSessionServiceSetSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSessionServiceSetSessionRequest' when calling setSession");
    }
    
    String localVarPath = "/zitadel.session.v2beta.SessionService/SetSession";

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

    TypeReference<BetaSessionServiceSetSessionResponse> localVarReturnType = new TypeReference<BetaSessionServiceSetSessionResponse>() {};
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
