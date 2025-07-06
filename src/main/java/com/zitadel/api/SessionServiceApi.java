package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.NoOp200Response4;
import com.zitadel.model.SessionServiceConnectError;
import com.zitadel.model.SessionServiceCreateSessionRequest;
import com.zitadel.model.SessionServiceCreateSessionResponse;
import com.zitadel.model.SessionServiceDeleteSessionRequest;
import com.zitadel.model.SessionServiceDeleteSessionResponse;
import com.zitadel.model.SessionServiceGetSessionRequest;
import com.zitadel.model.SessionServiceGetSessionResponse;
import com.zitadel.model.SessionServiceListSessionsRequest;
import com.zitadel.model.SessionServiceListSessionsResponse;
import com.zitadel.model.SessionServiceSetSessionRequest;
import com.zitadel.model.SessionServiceSetSessionResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class SessionServiceApi extends BaseApi {

  public SessionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SessionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * CreateSession
   * Create a new session
   * @param sessionServiceCreateSessionRequest  (required)
   * @return SessionServiceCreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceCreateSessionResponse createSession(SessionServiceCreateSessionRequest sessionServiceCreateSessionRequest) throws ApiException {
    return this.createSession(sessionServiceCreateSessionRequest, Collections.emptyMap());
  }


  /**
   * CreateSession
   * Create a new session
   * @param sessionServiceCreateSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceCreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  private SessionServiceCreateSessionResponse createSession(SessionServiceCreateSessionRequest sessionServiceCreateSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceCreateSessionRequest;
    
    if (sessionServiceCreateSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceCreateSessionRequest' when calling createSession");
    }
    
    String localVarPath = "/zitadel.session.v2.SessionService/CreateSession";

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

    TypeReference<SessionServiceCreateSessionResponse> localVarReturnType = new TypeReference<SessionServiceCreateSessionResponse>() {};
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
   * @param sessionServiceDeleteSessionRequest  (required)
   * @return SessionServiceDeleteSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceDeleteSessionResponse deleteSession(SessionServiceDeleteSessionRequest sessionServiceDeleteSessionRequest) throws ApiException {
    return this.deleteSession(sessionServiceDeleteSessionRequest, Collections.emptyMap());
  }


  /**
   * DeleteSession
   * Terminate a session
   * @param sessionServiceDeleteSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceDeleteSessionResponse
   * @throws ApiException if fails to make API call
   */
  private SessionServiceDeleteSessionResponse deleteSession(SessionServiceDeleteSessionRequest sessionServiceDeleteSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceDeleteSessionRequest;
    
    if (sessionServiceDeleteSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceDeleteSessionRequest' when calling deleteSession");
    }
    
    String localVarPath = "/zitadel.session.v2.SessionService/DeleteSession";

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

    TypeReference<SessionServiceDeleteSessionResponse> localVarReturnType = new TypeReference<SessionServiceDeleteSessionResponse>() {};
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
   * @param sessionServiceGetSessionRequest  (required)
   * @return SessionServiceGetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceGetSessionResponse getSession(SessionServiceGetSessionRequest sessionServiceGetSessionRequest) throws ApiException {
    return this.getSession(sessionServiceGetSessionRequest, Collections.emptyMap());
  }


  /**
   * GetSession
   * GetSession a session
   * @param sessionServiceGetSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceGetSessionResponse
   * @throws ApiException if fails to make API call
   */
  private SessionServiceGetSessionResponse getSession(SessionServiceGetSessionRequest sessionServiceGetSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceGetSessionRequest;
    
    if (sessionServiceGetSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceGetSessionRequest' when calling getSession");
    }
    
    String localVarPath = "/zitadel.session.v2.SessionService/GetSession";

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

    TypeReference<SessionServiceGetSessionResponse> localVarReturnType = new TypeReference<SessionServiceGetSessionResponse>() {};
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
   * @param sessionServiceListSessionsRequest  (required)
   * @return SessionServiceListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceListSessionsResponse listSessions(SessionServiceListSessionsRequest sessionServiceListSessionsRequest) throws ApiException {
    return this.listSessions(sessionServiceListSessionsRequest, Collections.emptyMap());
  }


  /**
   * ListSessions
   * Search sessions
   * @param sessionServiceListSessionsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  private SessionServiceListSessionsResponse listSessions(SessionServiceListSessionsRequest sessionServiceListSessionsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceListSessionsRequest;
    
    if (sessionServiceListSessionsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceListSessionsRequest' when calling listSessions");
    }
    
    String localVarPath = "/zitadel.session.v2.SessionService/ListSessions";

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

    TypeReference<SessionServiceListSessionsResponse> localVarReturnType = new TypeReference<SessionServiceListSessionsResponse>() {};
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
   * Dummy endpoint to retain union-member schemas
   * 
   * @return NoOp200Response4
   * @throws ApiException if fails to make API call
   */
  public NoOp200Response4 noOp() throws ApiException {
    return this.noOp(Collections.emptyMap());
  }


  /**
   * Dummy endpoint to retain union-member schemas
   * 
   * @param additionalHeaders additionalHeaders for this call
   * @return NoOp200Response4
   * @throws ApiException if fails to make API call
   */
  private NoOp200Response4 noOp(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/202bd4b3";

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

    TypeReference<NoOp200Response4> localVarReturnType = new TypeReference<NoOp200Response4>() {};
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
   * SetSession
   * Update a session
   * @param sessionServiceSetSessionRequest  (required)
   * @return SessionServiceSetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceSetSessionResponse setSession(SessionServiceSetSessionRequest sessionServiceSetSessionRequest) throws ApiException {
    return this.setSession(sessionServiceSetSessionRequest, Collections.emptyMap());
  }


  /**
   * SetSession
   * Update a session
   * @param sessionServiceSetSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceSetSessionResponse
   * @throws ApiException if fails to make API call
   */
  private SessionServiceSetSessionResponse setSession(SessionServiceSetSessionRequest sessionServiceSetSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceSetSessionRequest;
    
    if (sessionServiceSetSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceSetSessionRequest' when calling setSession");
    }
    
    String localVarPath = "/zitadel.session.v2.SessionService/SetSession";

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

    TypeReference<SessionServiceSetSessionResponse> localVarReturnType = new TypeReference<SessionServiceSetSessionResponse>() {};
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
