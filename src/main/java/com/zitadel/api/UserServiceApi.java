package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zitadel.ApiException;
import com.zitadel.IApiClient;
import com.zitadel.model.*;

public class UserServiceApi {

    private final IApiClient apiClient;

    public UserServiceApi(IApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public UserServiceGetUserByIDResponse getUserByID(UserServiceGetUserByIDRequest userServiceGetUserByIDRequest) throws ApiException {
        if (userServiceGetUserByIDRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userServiceGetUserByIDRequest' when calling getUserByID");
        }

        TypeReference<UserServiceGetUserByIDResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "getUserByID",
            "/zitadel.user.v2.UserService/GetUserByID",
            "POST",
            null,
            null,
            null,
            userServiceGetUserByIDRequest,
            successType,
            null
        );
    }

    public UserServiceDeleteUserResponse deleteUser(UserServiceDeleteUserRequest userServiceDeleteUserRequest) throws ApiException {
        if (userServiceDeleteUserRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userServiceDeleteUserRequest' when calling deleteUser");
        }

        TypeReference<UserServiceDeleteUserResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "deleteUser",
            "/zitadel.user.v2.UserService/DeleteUser",
            "POST",
            null,
            null,
            null,
            userServiceDeleteUserRequest,
            successType,
            null
        );
    }

    public UserServiceAddHumanUserResponse addHumanUser(UserServiceAddHumanUserRequest userServiceAddHumanUserRequest) throws ApiException {
        if (userServiceAddHumanUserRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userServiceAddHumanUserRequest' when calling addHumanUser");
        }

        TypeReference<UserServiceAddHumanUserResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "addHumanUser",
            "/zitadel.user.v2.UserService/AddHumanUser",
            "POST",
            null,
            null,
            null,
            userServiceAddHumanUserRequest,
            successType,
            null
        );
    }

    public UserServiceUpdateHumanUserResponse updateHumanUser(UserServiceUpdateHumanUserRequest userServiceUpdateHumanUserRequest) throws ApiException {
        if (userServiceUpdateHumanUserRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userServiceUpdateHumanUserRequest' when calling updateHumanUser");
        }

        TypeReference<UserServiceUpdateHumanUserResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "updateHumanUser",
            "/zitadel.user.v2.UserService/UpdateHumanUser",
            "POST",
            null,
            null,
            null,
            userServiceUpdateHumanUserRequest,
            successType,
            null
        );
    }

    public UserServiceListUsersResponse listUsers(UserServiceListUsersRequest userServiceListUsersRequest) throws ApiException {
        if (userServiceListUsersRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userServiceListUsersRequest' when calling listUsers");
        }

        TypeReference<UserServiceListUsersResponse> successType = new TypeReference<>() {
        };

        return apiClient.invokeAPI(
            "listUsers",
            "/zitadel.user.v2.UserService/ListUsers",
            "POST",
            null,
            null,
            null,
            userServiceListUsersRequest,
            successType,
            null
        );
    }
}
