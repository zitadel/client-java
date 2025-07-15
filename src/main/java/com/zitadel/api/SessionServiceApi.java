package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zitadel.ApiException;
import com.zitadel.IApiClient;
import com.zitadel.model.*;

public class SessionServiceApi {


    private final IApiClient apiClient;

    public SessionServiceApi(IApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public SessionServiceCreateSessionResponse createSession(SessionServiceCreateSessionRequest sessionServiceCreateSessionRequest) throws ApiException {
        if (sessionServiceCreateSessionRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sessionServiceCreateSessionRequest' when calling createSession");
        }

        TypeReference<SessionServiceCreateSessionResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "createSession",
            "/zitadel.session.v2.SessionService/CreateSession",
            "POST",
            null,
            null,
            null,
            sessionServiceCreateSessionRequest,
            successType,
            null
        );
    }

    public SessionServiceDeleteSessionResponse deleteSession(SessionServiceDeleteSessionRequest sessionServiceDeleteSessionRequest) throws ApiException {
        if (sessionServiceDeleteSessionRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sessionServiceDeleteSessionRequest' when calling deleteSession");
        }

        TypeReference<SessionServiceDeleteSessionResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "deleteSession",
            "/zitadel.session.v2.SessionService/DeleteSession",
            "POST",
            null,
            null,
            null,
            sessionServiceDeleteSessionRequest,
            successType,
            null
        );
    }

    public SessionServiceGetSessionResponse getSession(SessionServiceGetSessionRequest sessionServiceGetSessionRequest) throws ApiException {
        if (sessionServiceGetSessionRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sessionServiceGetSessionRequest' when calling getSession");
        }

        TypeReference<SessionServiceGetSessionResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "getSession",
            "/zitadel.session.v2.SessionService/GetSession",
            "POST",
            null,
            null,
            null,
            sessionServiceGetSessionRequest,
            successType,
            null
        );
    }

    public SessionServiceListSessionsResponse listSessions(SessionServiceListSessionsRequest sessionServiceListSessionsRequest) throws ApiException {
        if (sessionServiceListSessionsRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sessionServiceListSessionsRequest' when calling listSessions");
        }

        TypeReference<SessionServiceListSessionsResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "listSessions",
            "/zitadel.session.v2.SessionService/ListSessions",
            "POST",
            null,
            null,
            null,
            sessionServiceListSessionsRequest,
            successType,
            null
        );
    }

    public SessionServiceSetSessionResponse setSession(SessionServiceSetSessionRequest sessionServiceSetSessionRequest) throws ApiException {
        if (sessionServiceSetSessionRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sessionServiceSetSessionRequest' when calling setSession");
        }

        TypeReference<SessionServiceSetSessionResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "setSession",
            "/zitadel.session.v2.SessionService/SetSession",
            "POST",
            null,
            null,
            null,
            sessionServiceSetSessionRequest,
            successType,
            null
        );
    }
}
