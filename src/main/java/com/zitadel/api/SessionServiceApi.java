package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

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

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class SessionServiceApi extends BaseApi {

  public SessionServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SessionServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Create Session
   * Create a new session with initial checks, metadata and challenges for further verification.  A token will be returned, which is required for using the session as authentication, e.g.  when authenticating an OIDC auth request or SAML request.  Additionally, the session token can be used as OAuth2 access token to authenticate against  the ZITADEL APIs.   Required permissions:    - &#x60;session.write&#x60;
   * @param sessionServiceCreateSessionRequest  (required)
   * @return SessionServiceCreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceCreateSessionResponse createSession(SessionServiceCreateSessionRequest sessionServiceCreateSessionRequest) throws ApiException {
    return this.createSession(sessionServiceCreateSessionRequest, Collections.emptyMap());
  }


  /**
   * Create Session
   * Create a new session with initial checks, metadata and challenges for further verification.  A token will be returned, which is required for using the session as authentication, e.g.  when authenticating an OIDC auth request or SAML request.  Additionally, the session token can be used as OAuth2 access token to authenticate against  the ZITADEL APIs.   Required permissions:    - &#x60;session.write&#x60;
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
   * Terminate an existing session. This invalidates the session and its token.  The session can no longer be used for the authentication of other resources  or to authenticate against the ZITADEL APIs.   You can only terminate your own session, unless you are granted the &#x60;session.delete&#x60; permission.   Required permissions:    - &#x60;session.delete&#x60;    - no permission required for own sessions or when providing the current session token
   * @param sessionServiceDeleteSessionRequest  (required)
   * @return SessionServiceDeleteSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceDeleteSessionResponse deleteSession(SessionServiceDeleteSessionRequest sessionServiceDeleteSessionRequest) throws ApiException {
    return this.deleteSession(sessionServiceDeleteSessionRequest, Collections.emptyMap());
  }


  /**
   * DeleteSession
   * Terminate an existing session. This invalidates the session and its token.  The session can no longer be used for the authentication of other resources  or to authenticate against the ZITADEL APIs.   You can only terminate your own session, unless you are granted the &#x60;session.delete&#x60; permission.   Required permissions:    - &#x60;session.delete&#x60;    - no permission required for own sessions or when providing the current session token
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
   * Get Session
   * Retrieve a session by its ID. Returns all information about the session, including  the factors that were verified, the metadata, user agent information and possible expiration date.  The session token is required unless either of the following conditions is met:    - the caller created the session    - the authenticated user requests their own session (checked user)    - the security token provided in the authorization header has the same user agent as the session    - the caller is granted the permission session.read permission on either the instance or on the checked user&#39;s organization   Required permissions:    - &#x60;session.read&#x60;    - no permission required to get own sessions (see above) or when providing the current session token
   * @param sessionServiceGetSessionRequest  (required)
   * @return SessionServiceGetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceGetSessionResponse getSession(SessionServiceGetSessionRequest sessionServiceGetSessionRequest) throws ApiException {
    return this.getSession(sessionServiceGetSessionRequest, Collections.emptyMap());
  }


  /**
   * Get Session
   * Retrieve a session by its ID. Returns all information about the session, including  the factors that were verified, the metadata, user agent information and possible expiration date.  The session token is required unless either of the following conditions is met:    - the caller created the session    - the authenticated user requests their own session (checked user)    - the security token provided in the authorization header has the same user agent as the session    - the caller is granted the permission session.read permission on either the instance or on the checked user&#39;s organization   Required permissions:    - &#x60;session.read&#x60;    - no permission required to get own sessions (see above) or when providing the current session token
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
   * List sessions
   * Searches for sessions matching the given query. You can search by session ID, user ID,  creation date, creator, user agent or expiration date.   Required permissions:    - &#x60;session.read&#x60;    - no permission required to search for own sessions
   * @param sessionServiceListSessionsRequest  (required)
   * @return SessionServiceListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceListSessionsResponse listSessions(SessionServiceListSessionsRequest sessionServiceListSessionsRequest) throws ApiException {
    return this.listSessions(sessionServiceListSessionsRequest, Collections.emptyMap());
  }


  /**
   * List sessions
   * Searches for sessions matching the given query. You can search by session ID, user ID,  creation date, creator, user agent or expiration date.   Required permissions:    - &#x60;session.read&#x60;    - no permission required to search for own sessions
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
   * Set Session
   * Update an existing session with new information like additional checks or metadata  or request additional challenges.  A new session token will be returned. Note that the previous token will be invalidated.   Required permissions:    - &#x60;session.write&#x60;
   * @param sessionServiceSetSessionRequest  (required)
   * @return SessionServiceSetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public SessionServiceSetSessionResponse setSession(SessionServiceSetSessionRequest sessionServiceSetSessionRequest) throws ApiException {
    return this.setSession(sessionServiceSetSessionRequest, Collections.emptyMap());
  }


  /**
   * Set Session
   * Update an existing session with new information like additional checks or metadata  or request additional challenges.  A new session token will be returned. Note that the previous token will be invalidated.   Required permissions:    - &#x60;session.write&#x60;
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
