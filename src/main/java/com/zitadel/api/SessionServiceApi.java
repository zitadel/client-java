package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.SessionServiceCreateSessionRequest;
import com.zitadel.model.SessionServiceCreateSessionResponse;
import com.zitadel.model.SessionServiceDeleteSessionRequest;
import com.zitadel.model.SessionServiceDeleteSessionResponse;
import com.zitadel.model.SessionServiceGetSessionResponse;
import com.zitadel.model.SessionServiceListSessionsRequest;
import com.zitadel.model.SessionServiceListSessionsResponse;
import com.zitadel.model.SessionServiceRpcStatus;
import com.zitadel.model.SessionServiceSetSessionRequest;
import com.zitadel.model.SessionServiceSetSessionResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SessionServiceApi extends BaseApi {

  public SessionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SessionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Create a new session
   * Create a new session. A token will be returned, which is required for further updates of the session.
   * @param sessionServiceCreateSessionRequest  (required)
   * @return SessionServiceCreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceCreateSessionResponse sessionServiceCreateSession(SessionServiceCreateSessionRequest sessionServiceCreateSessionRequest) throws ApiException {
    return this.sessionServiceCreateSession(sessionServiceCreateSessionRequest, Collections.emptyMap());
  }


  /**
   * Create a new session
   * Create a new session. A token will be returned, which is required for further updates of the session.
   * @param sessionServiceCreateSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceCreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceCreateSessionResponse sessionServiceCreateSession(SessionServiceCreateSessionRequest sessionServiceCreateSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceCreateSessionRequest;
    
    if (sessionServiceCreateSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceCreateSessionRequest' when calling sessionServiceCreateSession");
    }
    
    String localVarPath = "/v2/sessions";

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
   * Terminate an existing session
   * Terminate your own session or if granted any other session.
   * @param sessionId \&quot;id of the session to terminate\&quot; (required)
   * @param sessionServiceDeleteSessionRequest  (required)
   * @return SessionServiceDeleteSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceDeleteSessionResponse sessionServiceDeleteSession(String sessionId, SessionServiceDeleteSessionRequest sessionServiceDeleteSessionRequest) throws ApiException {
    return this.sessionServiceDeleteSession(sessionId, sessionServiceDeleteSessionRequest, Collections.emptyMap());
  }


  /**
   * Terminate an existing session
   * Terminate your own session or if granted any other session.
   * @param sessionId \&quot;id of the session to terminate\&quot; (required)
   * @param sessionServiceDeleteSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceDeleteSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceDeleteSessionResponse sessionServiceDeleteSession(String sessionId, SessionServiceDeleteSessionRequest sessionServiceDeleteSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceDeleteSessionRequest;
    
    if (sessionId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionId' when calling sessionServiceDeleteSession");
    }
    
    if (sessionServiceDeleteSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceDeleteSessionRequest' when calling sessionServiceDeleteSession");
    }
    
    String localVarPath = "/v2/sessions/{sessionId}"
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(sessionId)));

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
        "DELETE",
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
   * Get a session
   * Get a session and all its information like the time of the user or password verification
   * @param sessionId  (required)
   * @param sessionToken  (optional)
   * @return SessionServiceGetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceGetSessionResponse sessionServiceGetSession(String sessionId, String sessionToken) throws ApiException {
    return this.sessionServiceGetSession(sessionId, sessionToken, Collections.emptyMap());
  }


  /**
   * Get a session
   * Get a session and all its information like the time of the user or password verification
   * @param sessionId  (required)
   * @param sessionToken  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceGetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceGetSessionResponse sessionServiceGetSession(String sessionId, String sessionToken, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (sessionId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionId' when calling sessionServiceGetSession");
    }
    
    String localVarPath = "/v2/sessions/{sessionId}"
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(sessionId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("sessionToken", sessionToken));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SessionServiceGetSessionResponse> localVarReturnType = new TypeReference<SessionServiceGetSessionResponse>() {};
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
   * Search sessions
   * Search for sessions
   * @param sessionServiceListSessionsRequest  (required)
   * @return SessionServiceListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceListSessionsResponse sessionServiceListSessions(SessionServiceListSessionsRequest sessionServiceListSessionsRequest) throws ApiException {
    return this.sessionServiceListSessions(sessionServiceListSessionsRequest, Collections.emptyMap());
  }


  /**
   * Search sessions
   * Search for sessions
   * @param sessionServiceListSessionsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceListSessionsResponse sessionServiceListSessions(SessionServiceListSessionsRequest sessionServiceListSessionsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceListSessionsRequest;
    
    if (sessionServiceListSessionsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceListSessionsRequest' when calling sessionServiceListSessions");
    }
    
    String localVarPath = "/v2/sessions/search";

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
   * Update an existing session
   * Update an existing session with new information.
   * @param sessionId \&quot;id of the session to update\&quot; (required)
   * @param sessionServiceSetSessionRequest  (required)
   * @return SessionServiceSetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceSetSessionResponse sessionServiceSetSession(String sessionId, SessionServiceSetSessionRequest sessionServiceSetSessionRequest) throws ApiException {
    return this.sessionServiceSetSession(sessionId, sessionServiceSetSessionRequest, Collections.emptyMap());
  }


  /**
   * Update an existing session
   * Update an existing session with new information.
   * @param sessionId \&quot;id of the session to update\&quot; (required)
   * @param sessionServiceSetSessionRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SessionServiceSetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceSetSessionResponse sessionServiceSetSession(String sessionId, SessionServiceSetSessionRequest sessionServiceSetSessionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = sessionServiceSetSessionRequest;
    
    if (sessionId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionId' when calling sessionServiceSetSession");
    }
    
    if (sessionServiceSetSessionRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sessionServiceSetSessionRequest' when calling sessionServiceSetSession");
    }
    
    String localVarPath = "/v2/sessions/{sessionId}"
      .replaceAll("\\{" + "sessionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(sessionId)));

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
        "PATCH",
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
