package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.UserServiceAddHumanUserRequest;
import com.zitadel.model.UserServiceAddHumanUserResponse;
import com.zitadel.model.UserServiceAddIDPLinkRequest;
import com.zitadel.model.UserServiceAddIDPLinkResponse;
import com.zitadel.model.UserServiceAddOTPEmailResponse;
import com.zitadel.model.UserServiceAddOTPSMSResponse;
import com.zitadel.model.UserServiceBetaAddHumanUserResponse;
import com.zitadel.model.UserServiceBetaAddIDPLinkResponse;
import com.zitadel.model.UserServiceBetaAddOTPEmailResponse;
import com.zitadel.model.UserServiceBetaAddOTPSMSResponse;
import com.zitadel.model.UserServiceBetaCreatePasskeyRegistrationLinkResponse;
import com.zitadel.model.UserServiceBetaDeactivateUserResponse;
import com.zitadel.model.UserServiceBetaDeleteUserResponse;
import com.zitadel.model.UserServiceBetaGetUserByIDResponse;
import com.zitadel.model.UserServiceBetaListAuthenticationMethodTypesResponse;
import com.zitadel.model.UserServiceBetaListUsersResponse;
import com.zitadel.model.UserServiceBetaLockUserResponse;
import com.zitadel.model.UserServiceBetaPasswordResetResponse;
import com.zitadel.model.UserServiceBetaReactivateUserResponse;
import com.zitadel.model.UserServiceBetaRegisterPasskeyResponse;
import com.zitadel.model.UserServiceBetaRegisterTOTPResponse;
import com.zitadel.model.UserServiceBetaRegisterU2FResponse;
import com.zitadel.model.UserServiceBetaRemoveOTPEmailResponse;
import com.zitadel.model.UserServiceBetaRemoveOTPSMSResponse;
import com.zitadel.model.UserServiceBetaRemovePhoneResponse;
import com.zitadel.model.UserServiceBetaRemoveTOTPResponse;
import com.zitadel.model.UserServiceBetaResendEmailCodeResponse;
import com.zitadel.model.UserServiceBetaResendPhoneCodeResponse;
import com.zitadel.model.UserServiceBetaRetrieveIdentityProviderIntentResponse;
import com.zitadel.model.UserServiceBetaSetEmailResponse;
import com.zitadel.model.UserServiceBetaSetPasswordResponse;
import com.zitadel.model.UserServiceBetaSetPhoneResponse;
import com.zitadel.model.UserServiceBetaStartIdentityProviderIntentResponse;
import com.zitadel.model.UserServiceBetaUnlockUserResponse;
import com.zitadel.model.UserServiceBetaUpdateHumanUserResponse;
import com.zitadel.model.UserServiceBetaUserServiceSetPasswordRequest;
import com.zitadel.model.UserServiceBetaVerifyEmailResponse;
import com.zitadel.model.UserServiceBetaVerifyPasskeyRegistrationResponse;
import com.zitadel.model.UserServiceBetaVerifyPhoneResponse;
import com.zitadel.model.UserServiceBetaVerifyTOTPRegistrationResponse;
import com.zitadel.model.UserServiceBetaVerifyU2FRegistrationResponse;
import com.zitadel.model.UserServiceCreateInviteCodeRequest;
import com.zitadel.model.UserServiceCreateInviteCodeResponse;
import com.zitadel.model.UserServiceCreatePasskeyRegistrationLinkRequest;
import com.zitadel.model.UserServiceCreatePasskeyRegistrationLinkResponse;
import com.zitadel.model.UserServiceDeactivateUserResponse;
import com.zitadel.model.UserServiceDeleteUserResponse;
import com.zitadel.model.UserServiceGetUserByIDResponse;
import com.zitadel.model.UserServiceHumanMFAInitSkippedResponse;
import com.zitadel.model.UserServiceListAuthenticationFactorsResponse;
import com.zitadel.model.UserServiceListAuthenticationMethodTypesResponse;
import com.zitadel.model.UserServiceListIDPLinksRequest;
import com.zitadel.model.UserServiceListIDPLinksResponse;
import com.zitadel.model.UserServiceListPasskeysResponse;
import com.zitadel.model.UserServiceListUsersRequest;
import com.zitadel.model.UserServiceListUsersResponse;
import com.zitadel.model.UserServiceLockUserResponse;
import com.zitadel.model.UserServicePasswordResetRequest;
import com.zitadel.model.UserServicePasswordResetResponse;
import com.zitadel.model.UserServiceReactivateUserResponse;
import com.zitadel.model.UserServiceRegisterPasskeyRequest;
import com.zitadel.model.UserServiceRegisterPasskeyResponse;
import com.zitadel.model.UserServiceRegisterTOTPResponse;
import com.zitadel.model.UserServiceRegisterU2FRequest;
import com.zitadel.model.UserServiceRegisterU2FResponse;
import com.zitadel.model.UserServiceRemoveIDPLinkResponse;
import com.zitadel.model.UserServiceRemoveOTPEmailResponse;
import com.zitadel.model.UserServiceRemoveOTPSMSResponse;
import com.zitadel.model.UserServiceRemovePasskeyResponse;
import com.zitadel.model.UserServiceRemovePhoneResponse;
import com.zitadel.model.UserServiceRemoveTOTPResponse;
import com.zitadel.model.UserServiceRemoveU2FResponse;
import com.zitadel.model.UserServiceResendEmailCodeRequest;
import com.zitadel.model.UserServiceResendEmailCodeResponse;
import com.zitadel.model.UserServiceResendInviteCodeResponse;
import com.zitadel.model.UserServiceResendPhoneCodeRequest;
import com.zitadel.model.UserServiceResendPhoneCodeResponse;
import com.zitadel.model.UserServiceRetrieveIdentityProviderIntentRequest;
import com.zitadel.model.UserServiceRetrieveIdentityProviderIntentResponse;
import com.zitadel.model.UserServiceRpcStatus;
import com.zitadel.model.UserServiceSendEmailCodeRequest;
import com.zitadel.model.UserServiceSendEmailCodeResponse;
import com.zitadel.model.UserServiceSetEmailRequest;
import com.zitadel.model.UserServiceSetEmailResponse;
import com.zitadel.model.UserServiceSetPasswordRequest;
import com.zitadel.model.UserServiceSetPasswordResponse;
import com.zitadel.model.UserServiceSetPhoneRequest;
import com.zitadel.model.UserServiceSetPhoneResponse;
import com.zitadel.model.UserServiceStartIdentityProviderIntentRequest;
import com.zitadel.model.UserServiceStartIdentityProviderIntentResponse;
import com.zitadel.model.UserServiceUnlockUserResponse;
import com.zitadel.model.UserServiceUpdateHumanUserRequest;
import com.zitadel.model.UserServiceUpdateHumanUserResponse;
import com.zitadel.model.UserServiceVerifyEmailRequest;
import com.zitadel.model.UserServiceVerifyEmailResponse;
import com.zitadel.model.UserServiceVerifyInviteCodeRequest;
import com.zitadel.model.UserServiceVerifyInviteCodeResponse;
import com.zitadel.model.UserServiceVerifyPasskeyRegistrationRequest;
import com.zitadel.model.UserServiceVerifyPasskeyRegistrationResponse;
import com.zitadel.model.UserServiceVerifyPhoneRequest;
import com.zitadel.model.UserServiceVerifyPhoneResponse;
import com.zitadel.model.UserServiceVerifyTOTPRegistrationRequest;
import com.zitadel.model.UserServiceVerifyTOTPRegistrationResponse;
import com.zitadel.model.UserServiceVerifyU2FRegistrationRequest;
import com.zitadel.model.UserServiceVerifyU2FRegistrationResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class UserServiceApi extends BaseApi {

  public UserServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public UserServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Create a new human user
   * Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.
   * @param userServiceAddHumanUserRequest  (required)
   * @return UserServiceAddHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddHumanUserResponse userServiceAddHumanUser(UserServiceAddHumanUserRequest userServiceAddHumanUserRequest) throws ApiException {
    return this.userServiceAddHumanUser(userServiceAddHumanUserRequest, Collections.emptyMap());
  }


  /**
   * Create a new human user
   * Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.
   * @param userServiceAddHumanUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddHumanUserResponse userServiceAddHumanUser(UserServiceAddHumanUserRequest userServiceAddHumanUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddHumanUserRequest;
    
    if (userServiceAddHumanUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddHumanUserRequest' when calling userServiceAddHumanUser");
    }
    
    String localVarPath = "/v2/users/human";

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

    TypeReference<UserServiceAddHumanUserResponse> localVarReturnType = new TypeReference<UserServiceAddHumanUserResponse>() {};
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
   * Create a new human user
   * Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.  Deprecated: please move to the corresponding endpoint under user service v2 (GA)
   * @param userServiceAddHumanUserRequest  (required)
   * @return UserServiceBetaAddHumanUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddHumanUserResponse userServiceAddHumanUser_0(UserServiceAddHumanUserRequest userServiceAddHumanUserRequest) throws ApiException {
    return this.userServiceAddHumanUser_0(userServiceAddHumanUserRequest, Collections.emptyMap());
  }


  /**
   * Create a new human user
   * Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.  Deprecated: please move to the corresponding endpoint under user service v2 (GA)
   * @param userServiceAddHumanUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaAddHumanUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddHumanUserResponse userServiceAddHumanUser_0(UserServiceAddHumanUserRequest userServiceAddHumanUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddHumanUserRequest;
    
    if (userServiceAddHumanUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddHumanUserRequest' when calling userServiceAddHumanUser_0");
    }
    
    String localVarPath = "/v2beta/users/human";

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

    TypeReference<UserServiceBetaAddHumanUserResponse> localVarReturnType = new TypeReference<UserServiceBetaAddHumanUserResponse>() {};
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
   * Add link to an identity provider to an user
   * Add link to an identity provider to an user..
   * @param userId  (required)
   * @param userServiceAddIDPLinkRequest  (required)
   * @return UserServiceAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddIDPLinkResponse userServiceAddIDPLink(String userId, UserServiceAddIDPLinkRequest userServiceAddIDPLinkRequest) throws ApiException {
    return this.userServiceAddIDPLink(userId, userServiceAddIDPLinkRequest, Collections.emptyMap());
  }


  /**
   * Add link to an identity provider to an user
   * Add link to an identity provider to an user..
   * @param userId  (required)
   * @param userServiceAddIDPLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddIDPLinkResponse userServiceAddIDPLink(String userId, UserServiceAddIDPLinkRequest userServiceAddIDPLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddIDPLinkRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceAddIDPLink");
    }
    
    if (userServiceAddIDPLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddIDPLinkRequest' when calling userServiceAddIDPLink");
    }
    
    String localVarPath = "/v2/users/{userId}/links"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceAddIDPLinkResponse> localVarReturnType = new TypeReference<UserServiceAddIDPLinkResponse>() {};
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
   * Add link to an identity provider to an user
   * Add link to an identity provider to an user.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceAddIDPLinkRequest  (required)
   * @return UserServiceBetaAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddIDPLinkResponse userServiceAddIDPLink_0(String userId, UserServiceAddIDPLinkRequest userServiceAddIDPLinkRequest) throws ApiException {
    return this.userServiceAddIDPLink_0(userId, userServiceAddIDPLinkRequest, Collections.emptyMap());
  }


  /**
   * Add link to an identity provider to an user
   * Add link to an identity provider to an user.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceAddIDPLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddIDPLinkResponse userServiceAddIDPLink_0(String userId, UserServiceAddIDPLinkRequest userServiceAddIDPLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddIDPLinkRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceAddIDPLink_0");
    }
    
    if (userServiceAddIDPLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddIDPLinkRequest' when calling userServiceAddIDPLink_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/links"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaAddIDPLinkResponse> localVarReturnType = new TypeReference<UserServiceBetaAddIDPLinkResponse>() {};
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
   * Add OTP Email for a user
   * Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor..
   * @param userId  (required)
   * @return UserServiceAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddOTPEmailResponse userServiceAddOTPEmail(String userId) throws ApiException {
    return this.userServiceAddOTPEmail(userId, Collections.emptyMap());
  }


  /**
   * Add OTP Email for a user
   * Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddOTPEmailResponse userServiceAddOTPEmail(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceAddOTPEmail");
    }
    
    String localVarPath = "/v2/users/{userId}/otp_email"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceAddOTPEmailResponse> localVarReturnType = new TypeReference<UserServiceAddOTPEmailResponse>() {};
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
   * Add OTP Email for a user
   * Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddOTPEmailResponse userServiceAddOTPEmail_0(String userId) throws ApiException {
    return this.userServiceAddOTPEmail_0(userId, Collections.emptyMap());
  }


  /**
   * Add OTP Email for a user
   * Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddOTPEmailResponse userServiceAddOTPEmail_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceAddOTPEmail_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/otp_email"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaAddOTPEmailResponse> localVarReturnType = new TypeReference<UserServiceBetaAddOTPEmailResponse>() {};
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
   * Add OTP SMS for a user
   * Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor..
   * @param userId  (required)
   * @return UserServiceAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddOTPSMSResponse userServiceAddOTPSMS(String userId) throws ApiException {
    return this.userServiceAddOTPSMS(userId, Collections.emptyMap());
  }


  /**
   * Add OTP SMS for a user
   * Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddOTPSMSResponse userServiceAddOTPSMS(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceAddOTPSMS");
    }
    
    String localVarPath = "/v2/users/{userId}/otp_sms"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceAddOTPSMSResponse> localVarReturnType = new TypeReference<UserServiceAddOTPSMSResponse>() {};
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
   * Add OTP SMS for a user
   * Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddOTPSMSResponse userServiceAddOTPSMS_0(String userId) throws ApiException {
    return this.userServiceAddOTPSMS_0(userId, Collections.emptyMap());
  }


  /**
   * Add OTP SMS for a user
   * Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaAddOTPSMSResponse userServiceAddOTPSMS_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceAddOTPSMS_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/otp_sms"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaAddOTPSMSResponse> localVarReturnType = new TypeReference<UserServiceBetaAddOTPSMSResponse>() {};
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
   * Create an invite code for a user
   * Create an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.
   * @param userId  (required)
   * @param userServiceCreateInviteCodeRequest  (required)
   * @return UserServiceCreateInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceCreateInviteCodeResponse userServiceCreateInviteCode(String userId, UserServiceCreateInviteCodeRequest userServiceCreateInviteCodeRequest) throws ApiException {
    return this.userServiceCreateInviteCode(userId, userServiceCreateInviteCodeRequest, Collections.emptyMap());
  }


  /**
   * Create an invite code for a user
   * Create an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.
   * @param userId  (required)
   * @param userServiceCreateInviteCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceCreateInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceCreateInviteCodeResponse userServiceCreateInviteCode(String userId, UserServiceCreateInviteCodeRequest userServiceCreateInviteCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceCreateInviteCodeRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceCreateInviteCode");
    }
    
    if (userServiceCreateInviteCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceCreateInviteCodeRequest' when calling userServiceCreateInviteCode");
    }
    
    String localVarPath = "/v2/users/{userId}/invite_code"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceCreateInviteCodeResponse> localVarReturnType = new TypeReference<UserServiceCreateInviteCodeResponse>() {};
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
   * Create a passkey registration link for a user
   * Create a passkey registration link which includes a code and either return it or send it to the user..
   * @param userId  (required)
   * @param userServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @return UserServiceCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceCreatePasskeyRegistrationLinkResponse userServiceCreatePasskeyRegistrationLink(String userId, UserServiceCreatePasskeyRegistrationLinkRequest userServiceCreatePasskeyRegistrationLinkRequest) throws ApiException {
    return this.userServiceCreatePasskeyRegistrationLink(userId, userServiceCreatePasskeyRegistrationLinkRequest, Collections.emptyMap());
  }


  /**
   * Create a passkey registration link for a user
   * Create a passkey registration link which includes a code and either return it or send it to the user..
   * @param userId  (required)
   * @param userServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceCreatePasskeyRegistrationLinkResponse userServiceCreatePasskeyRegistrationLink(String userId, UserServiceCreatePasskeyRegistrationLinkRequest userServiceCreatePasskeyRegistrationLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceCreatePasskeyRegistrationLinkRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceCreatePasskeyRegistrationLink");
    }
    
    if (userServiceCreatePasskeyRegistrationLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceCreatePasskeyRegistrationLinkRequest' when calling userServiceCreatePasskeyRegistrationLink");
    }
    
    String localVarPath = "/v2/users/{userId}/passkeys/registration_link"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceCreatePasskeyRegistrationLinkResponse> localVarReturnType = new TypeReference<UserServiceCreatePasskeyRegistrationLinkResponse>() {};
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
   * Create a passkey registration link for a user
   * Create a passkey registration link which includes a code and either return it or send it to the user.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @return UserServiceBetaCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaCreatePasskeyRegistrationLinkResponse userServiceCreatePasskeyRegistrationLink_0(String userId, UserServiceCreatePasskeyRegistrationLinkRequest userServiceCreatePasskeyRegistrationLinkRequest) throws ApiException {
    return this.userServiceCreatePasskeyRegistrationLink_0(userId, userServiceCreatePasskeyRegistrationLinkRequest, Collections.emptyMap());
  }


  /**
   * Create a passkey registration link for a user
   * Create a passkey registration link which includes a code and either return it or send it to the user.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaCreatePasskeyRegistrationLinkResponse userServiceCreatePasskeyRegistrationLink_0(String userId, UserServiceCreatePasskeyRegistrationLinkRequest userServiceCreatePasskeyRegistrationLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceCreatePasskeyRegistrationLinkRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceCreatePasskeyRegistrationLink_0");
    }
    
    if (userServiceCreatePasskeyRegistrationLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceCreatePasskeyRegistrationLinkRequest' when calling userServiceCreatePasskeyRegistrationLink_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/passkeys/registration_link"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaCreatePasskeyRegistrationLinkResponse> localVarReturnType = new TypeReference<UserServiceBetaCreatePasskeyRegistrationLinkResponse>() {};
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
   * Deactivate user
   * The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data..
   * @param userId  (required)
   * @return UserServiceDeactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceDeactivateUserResponse userServiceDeactivateUser(String userId) throws ApiException {
    return this.userServiceDeactivateUser(userId, Collections.emptyMap());
  }


  /**
   * Deactivate user
   * The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceDeactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceDeactivateUserResponse userServiceDeactivateUser(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceDeactivateUser");
    }
    
    String localVarPath = "/v2/users/{userId}/deactivate"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceDeactivateUserResponse> localVarReturnType = new TypeReference<UserServiceDeactivateUserResponse>() {};
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
   * Deactivate user
   * The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaDeactivateUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaDeactivateUserResponse userServiceDeactivateUser_0(String userId) throws ApiException {
    return this.userServiceDeactivateUser_0(userId, Collections.emptyMap());
  }


  /**
   * Deactivate user
   * The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaDeactivateUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaDeactivateUserResponse userServiceDeactivateUser_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceDeactivateUser_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/deactivate"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaDeactivateUserResponse> localVarReturnType = new TypeReference<UserServiceBetaDeactivateUserResponse>() {};
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
   * Delete user
   * The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found..
   * @param userId  (required)
   * @return UserServiceDeleteUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceDeleteUserResponse userServiceDeleteUser(String userId) throws ApiException {
    return this.userServiceDeleteUser(userId, Collections.emptyMap());
  }


  /**
   * Delete user
   * The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceDeleteUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceDeleteUserResponse userServiceDeleteUser(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceDeleteUser");
    }
    
    String localVarPath = "/v2/users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceDeleteUserResponse> localVarReturnType = new TypeReference<UserServiceDeleteUserResponse>() {};
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
   * Delete user
   * The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaDeleteUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaDeleteUserResponse userServiceDeleteUser_0(String userId) throws ApiException {
    return this.userServiceDeleteUser_0(userId, Collections.emptyMap());
  }


  /**
   * Delete user
   * The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaDeleteUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaDeleteUserResponse userServiceDeleteUser_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceDeleteUser_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaDeleteUserResponse> localVarReturnType = new TypeReference<UserServiceBetaDeleteUserResponse>() {};
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
   * User by ID
   * Returns the full user object (human or machine) including the profile, email, etc..
   * @param userId User ID of the user you like to get. (required)
   * @return UserServiceGetUserByIDResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceGetUserByIDResponse userServiceGetUserByID(String userId) throws ApiException {
    return this.userServiceGetUserByID(userId, Collections.emptyMap());
  }


  /**
   * User by ID
   * Returns the full user object (human or machine) including the profile, email, etc..
   * @param userId User ID of the user you like to get. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceGetUserByIDResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceGetUserByIDResponse userServiceGetUserByID(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceGetUserByID");
    }
    
    String localVarPath = "/v2/users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceGetUserByIDResponse> localVarReturnType = new TypeReference<UserServiceGetUserByIDResponse>() {};
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
   * User by ID
   * Returns the full user object (human or machine) including the profile, email, etc.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId User ID of the user you like to get. (required)
   * @return UserServiceBetaGetUserByIDResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaGetUserByIDResponse userServiceGetUserByID_0(String userId) throws ApiException {
    return this.userServiceGetUserByID_0(userId, Collections.emptyMap());
  }


  /**
   * User by ID
   * Returns the full user object (human or machine) including the profile, email, etc.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId User ID of the user you like to get. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaGetUserByIDResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaGetUserByIDResponse userServiceGetUserByID_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceGetUserByID_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaGetUserByIDResponse> localVarReturnType = new TypeReference<UserServiceBetaGetUserByIDResponse>() {};
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
   * MFA Init Skipped
   * Update the last time the user has skipped MFA initialization. The server timestamp is used.
   * @param userId  (required)
   * @return UserServiceHumanMFAInitSkippedResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceHumanMFAInitSkippedResponse userServiceHumanMFAInitSkipped(String userId) throws ApiException {
    return this.userServiceHumanMFAInitSkipped(userId, Collections.emptyMap());
  }


  /**
   * MFA Init Skipped
   * Update the last time the user has skipped MFA initialization. The server timestamp is used.
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceHumanMFAInitSkippedResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceHumanMFAInitSkippedResponse userServiceHumanMFAInitSkipped(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceHumanMFAInitSkipped");
    }
    
    String localVarPath = "/v2/users/{userId}/mfa_init_skipped"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceHumanMFAInitSkippedResponse> localVarReturnType = new TypeReference<UserServiceHumanMFAInitSkippedResponse>() {};
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
   * 
   * 
   * @param userId  (required)
   * @param authFactors Specify the Auth Factors you are interested in (optional)
   * @param states Specify the state of the Auth Factors (optional)
   * @return UserServiceListAuthenticationFactorsResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListAuthenticationFactorsResponse userServiceListAuthenticationFactors(String userId, List<String> authFactors, List<String> states) throws ApiException {
    return this.userServiceListAuthenticationFactors(userId, authFactors, states, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param userId  (required)
   * @param authFactors Specify the Auth Factors you are interested in (optional)
   * @param states Specify the state of the Auth Factors (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListAuthenticationFactorsResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListAuthenticationFactorsResponse userServiceListAuthenticationFactors(String userId, List<String> authFactors, List<String> states, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceListAuthenticationFactors");
    }
    
    String localVarPath = "/v2/users/{userId}/authentication_factors/_search"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "authFactors", authFactors));
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "states", states));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<UserServiceListAuthenticationFactorsResponse> localVarReturnType = new TypeReference<UserServiceListAuthenticationFactorsResponse>() {};
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
   * List all possible authentication methods of a user
   * List all possible authentication methods of a user like password, passwordless, (T)OTP and more..
   * @param userId  (required)
   * @param domainQueryIncludeWithoutDomain List also auth method types without domain information like passkey and U2F added through V1 APIs / Login UI. (optional)
   * @param domainQueryDomain List only auth methods with specific domain. (optional)
   * @return UserServiceListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListAuthenticationMethodTypesResponse userServiceListAuthenticationMethodTypes(String userId, Boolean domainQueryIncludeWithoutDomain, String domainQueryDomain) throws ApiException {
    return this.userServiceListAuthenticationMethodTypes(userId, domainQueryIncludeWithoutDomain, domainQueryDomain, Collections.emptyMap());
  }


  /**
   * List all possible authentication methods of a user
   * List all possible authentication methods of a user like password, passwordless, (T)OTP and more..
   * @param userId  (required)
   * @param domainQueryIncludeWithoutDomain List also auth method types without domain information like passkey and U2F added through V1 APIs / Login UI. (optional)
   * @param domainQueryDomain List only auth methods with specific domain. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListAuthenticationMethodTypesResponse userServiceListAuthenticationMethodTypes(String userId, Boolean domainQueryIncludeWithoutDomain, String domainQueryDomain, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceListAuthenticationMethodTypes");
    }
    
    String localVarPath = "/v2/users/{userId}/authentication_methods"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("domainQuery.includeWithoutDomain", domainQueryIncludeWithoutDomain));
    localVarQueryParams.addAll(apiClient.parameterToPair("domainQuery.domain", domainQueryDomain));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<UserServiceListAuthenticationMethodTypesResponse> localVarReturnType = new TypeReference<UserServiceListAuthenticationMethodTypesResponse>() {};
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
   * List all possible authentication methods of a user
   * List all possible authentication methods of a user like password, passwordless, (T)OTP and more.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaListAuthenticationMethodTypesResponse userServiceListAuthenticationMethodTypes_0(String userId) throws ApiException {
    return this.userServiceListAuthenticationMethodTypes_0(userId, Collections.emptyMap());
  }


  /**
   * List all possible authentication methods of a user
   * List all possible authentication methods of a user like password, passwordless, (T)OTP and more.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaListAuthenticationMethodTypesResponse userServiceListAuthenticationMethodTypes_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceListAuthenticationMethodTypes_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/authentication_methods"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaListAuthenticationMethodTypesResponse> localVarReturnType = new TypeReference<UserServiceBetaListAuthenticationMethodTypesResponse>() {};
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
   * List links to an identity provider of an user
   * List links to an identity provider of an user.
   * @param userId  (required)
   * @param userServiceListIDPLinksRequest  (required)
   * @return UserServiceListIDPLinksResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListIDPLinksResponse userServiceListIDPLinks(String userId, UserServiceListIDPLinksRequest userServiceListIDPLinksRequest) throws ApiException {
    return this.userServiceListIDPLinks(userId, userServiceListIDPLinksRequest, Collections.emptyMap());
  }


  /**
   * List links to an identity provider of an user
   * List links to an identity provider of an user.
   * @param userId  (required)
   * @param userServiceListIDPLinksRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListIDPLinksResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListIDPLinksResponse userServiceListIDPLinks(String userId, UserServiceListIDPLinksRequest userServiceListIDPLinksRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListIDPLinksRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceListIDPLinks");
    }
    
    if (userServiceListIDPLinksRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListIDPLinksRequest' when calling userServiceListIDPLinks");
    }
    
    String localVarPath = "/v2/users/{userId}/links/_search"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceListIDPLinksResponse> localVarReturnType = new TypeReference<UserServiceListIDPLinksResponse>() {};
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
   * List passkeys of an user
   * List passkeys of an user
   * @param userId  (required)
   * @return UserServiceListPasskeysResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListPasskeysResponse userServiceListPasskeys(String userId) throws ApiException {
    return this.userServiceListPasskeys(userId, Collections.emptyMap());
  }


  /**
   * List passkeys of an user
   * List passkeys of an user
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListPasskeysResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListPasskeysResponse userServiceListPasskeys(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceListPasskeys");
    }
    
    String localVarPath = "/v2/users/{userId}/passkeys/_search"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceListPasskeysResponse> localVarReturnType = new TypeReference<UserServiceListPasskeysResponse>() {};
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
   * Search Users
   * Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.
   * @param userServiceListUsersRequest  (required)
   * @return UserServiceListUsersResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListUsersResponse userServiceListUsers(UserServiceListUsersRequest userServiceListUsersRequest) throws ApiException {
    return this.userServiceListUsers(userServiceListUsersRequest, Collections.emptyMap());
  }


  /**
   * Search Users
   * Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.
   * @param userServiceListUsersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListUsersResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListUsersResponse userServiceListUsers(UserServiceListUsersRequest userServiceListUsersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListUsersRequest;
    
    if (userServiceListUsersRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListUsersRequest' when calling userServiceListUsers");
    }
    
    String localVarPath = "/v2/users";

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

    TypeReference<UserServiceListUsersResponse> localVarReturnType = new TypeReference<UserServiceListUsersResponse>() {};
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
   * Search Users
   * Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userServiceListUsersRequest  (required)
   * @return UserServiceBetaListUsersResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaListUsersResponse userServiceListUsers_0(UserServiceListUsersRequest userServiceListUsersRequest) throws ApiException {
    return this.userServiceListUsers_0(userServiceListUsersRequest, Collections.emptyMap());
  }


  /**
   * Search Users
   * Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userServiceListUsersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaListUsersResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaListUsersResponse userServiceListUsers_0(UserServiceListUsersRequest userServiceListUsersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListUsersRequest;
    
    if (userServiceListUsersRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListUsersRequest' when calling userServiceListUsers_0");
    }
    
    String localVarPath = "/v2beta/users";

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

    TypeReference<UserServiceBetaListUsersResponse> localVarReturnType = new TypeReference<UserServiceBetaListUsersResponse>() {};
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
   * Lock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.)..
   * @param userId  (required)
   * @return UserServiceLockUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceLockUserResponse userServiceLockUser(String userId) throws ApiException {
    return this.userServiceLockUser(userId, Collections.emptyMap());
  }


  /**
   * Lock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.)..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceLockUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceLockUserResponse userServiceLockUser(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceLockUser");
    }
    
    String localVarPath = "/v2/users/{userId}/lock"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceLockUserResponse> localVarReturnType = new TypeReference<UserServiceLockUserResponse>() {};
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
   * Lock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaLockUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaLockUserResponse userServiceLockUser_0(String userId) throws ApiException {
    return this.userServiceLockUser_0(userId, Collections.emptyMap());
  }


  /**
   * Lock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaLockUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaLockUserResponse userServiceLockUser_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceLockUser_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/lock"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaLockUserResponse> localVarReturnType = new TypeReference<UserServiceBetaLockUserResponse>() {};
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
   * Request a code to reset a password
   * Request a code to reset a password..
   * @param userId  (required)
   * @param userServicePasswordResetRequest  (required)
   * @return UserServicePasswordResetResponse
   * @throws ApiException if fails to make API call
   */
  public UserServicePasswordResetResponse userServicePasswordReset(String userId, UserServicePasswordResetRequest userServicePasswordResetRequest) throws ApiException {
    return this.userServicePasswordReset(userId, userServicePasswordResetRequest, Collections.emptyMap());
  }


  /**
   * Request a code to reset a password
   * Request a code to reset a password..
   * @param userId  (required)
   * @param userServicePasswordResetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServicePasswordResetResponse
   * @throws ApiException if fails to make API call
   */
  public UserServicePasswordResetResponse userServicePasswordReset(String userId, UserServicePasswordResetRequest userServicePasswordResetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServicePasswordResetRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServicePasswordReset");
    }
    
    if (userServicePasswordResetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServicePasswordResetRequest' when calling userServicePasswordReset");
    }
    
    String localVarPath = "/v2/users/{userId}/password_reset"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServicePasswordResetResponse> localVarReturnType = new TypeReference<UserServicePasswordResetResponse>() {};
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
   * Request a code to reset a password
   * Request a code to reset a password.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServicePasswordResetRequest  (required)
   * @return UserServiceBetaPasswordResetResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaPasswordResetResponse userServicePasswordReset_0(String userId, UserServicePasswordResetRequest userServicePasswordResetRequest) throws ApiException {
    return this.userServicePasswordReset_0(userId, userServicePasswordResetRequest, Collections.emptyMap());
  }


  /**
   * Request a code to reset a password
   * Request a code to reset a password.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServicePasswordResetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaPasswordResetResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaPasswordResetResponse userServicePasswordReset_0(String userId, UserServicePasswordResetRequest userServicePasswordResetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServicePasswordResetRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServicePasswordReset_0");
    }
    
    if (userServicePasswordResetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServicePasswordResetRequest' when calling userServicePasswordReset_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/password_reset"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaPasswordResetResponse> localVarReturnType = new TypeReference<UserServiceBetaPasswordResetResponse>() {};
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
   * Reactivate user
   * Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;..
   * @param userId  (required)
   * @return UserServiceReactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceReactivateUserResponse userServiceReactivateUser(String userId) throws ApiException {
    return this.userServiceReactivateUser(userId, Collections.emptyMap());
  }


  /**
   * Reactivate user
   * Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceReactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceReactivateUserResponse userServiceReactivateUser(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceReactivateUser");
    }
    
    String localVarPath = "/v2/users/{userId}/reactivate"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceReactivateUserResponse> localVarReturnType = new TypeReference<UserServiceReactivateUserResponse>() {};
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
   * Reactivate user
   * Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaReactivateUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaReactivateUserResponse userServiceReactivateUser_0(String userId) throws ApiException {
    return this.userServiceReactivateUser_0(userId, Collections.emptyMap());
  }


  /**
   * Reactivate user
   * Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaReactivateUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaReactivateUserResponse userServiceReactivateUser_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceReactivateUser_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/reactivate"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaReactivateUserResponse> localVarReturnType = new TypeReference<UserServiceBetaReactivateUserResponse>() {};
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
   * Start the registration of passkey for a user
   * Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey..
   * @param userId  (required)
   * @param userServiceRegisterPasskeyRequest  (required)
   * @return UserServiceRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterPasskeyResponse userServiceRegisterPasskey(String userId, UserServiceRegisterPasskeyRequest userServiceRegisterPasskeyRequest) throws ApiException {
    return this.userServiceRegisterPasskey(userId, userServiceRegisterPasskeyRequest, Collections.emptyMap());
  }


  /**
   * Start the registration of passkey for a user
   * Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey..
   * @param userId  (required)
   * @param userServiceRegisterPasskeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterPasskeyResponse userServiceRegisterPasskey(String userId, UserServiceRegisterPasskeyRequest userServiceRegisterPasskeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRegisterPasskeyRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRegisterPasskey");
    }
    
    if (userServiceRegisterPasskeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRegisterPasskeyRequest' when calling userServiceRegisterPasskey");
    }
    
    String localVarPath = "/v2/users/{userId}/passkeys"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceRegisterPasskeyResponse> localVarReturnType = new TypeReference<UserServiceRegisterPasskeyResponse>() {};
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
   * Start the registration of passkey for a user
   * Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceRegisterPasskeyRequest  (required)
   * @return UserServiceBetaRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRegisterPasskeyResponse userServiceRegisterPasskey_0(String userId, UserServiceRegisterPasskeyRequest userServiceRegisterPasskeyRequest) throws ApiException {
    return this.userServiceRegisterPasskey_0(userId, userServiceRegisterPasskeyRequest, Collections.emptyMap());
  }


  /**
   * Start the registration of passkey for a user
   * Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceRegisterPasskeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRegisterPasskeyResponse userServiceRegisterPasskey_0(String userId, UserServiceRegisterPasskeyRequest userServiceRegisterPasskeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRegisterPasskeyRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRegisterPasskey_0");
    }
    
    if (userServiceRegisterPasskeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRegisterPasskeyRequest' when calling userServiceRegisterPasskey_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/passkeys"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaRegisterPasskeyResponse> localVarReturnType = new TypeReference<UserServiceBetaRegisterPasskeyResponse>() {};
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
   * Start the registration of a TOTP generator for a user
   * Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device..
   * @param userId  (required)
   * @return UserServiceRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterTOTPResponse userServiceRegisterTOTP(String userId) throws ApiException {
    return this.userServiceRegisterTOTP(userId, Collections.emptyMap());
  }


  /**
   * Start the registration of a TOTP generator for a user
   * Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterTOTPResponse userServiceRegisterTOTP(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRegisterTOTP");
    }
    
    String localVarPath = "/v2/users/{userId}/totp"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceRegisterTOTPResponse> localVarReturnType = new TypeReference<UserServiceRegisterTOTPResponse>() {};
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
   * Start the registration of a TOTP generator for a user
   * Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRegisterTOTPResponse userServiceRegisterTOTP_0(String userId) throws ApiException {
    return this.userServiceRegisterTOTP_0(userId, Collections.emptyMap());
  }


  /**
   * Start the registration of a TOTP generator for a user
   * Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRegisterTOTPResponse userServiceRegisterTOTP_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRegisterTOTP_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/totp"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaRegisterTOTPResponse> localVarReturnType = new TypeReference<UserServiceBetaRegisterTOTPResponse>() {};
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
   * Start the registration of a u2f token for a user
   * Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token..
   * @param userId  (required)
   * @param userServiceRegisterU2FRequest  (required)
   * @return UserServiceRegisterU2FResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterU2FResponse userServiceRegisterU2F(String userId, UserServiceRegisterU2FRequest userServiceRegisterU2FRequest) throws ApiException {
    return this.userServiceRegisterU2F(userId, userServiceRegisterU2FRequest, Collections.emptyMap());
  }


  /**
   * Start the registration of a u2f token for a user
   * Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token..
   * @param userId  (required)
   * @param userServiceRegisterU2FRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRegisterU2FResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterU2FResponse userServiceRegisterU2F(String userId, UserServiceRegisterU2FRequest userServiceRegisterU2FRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRegisterU2FRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRegisterU2F");
    }
    
    if (userServiceRegisterU2FRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRegisterU2FRequest' when calling userServiceRegisterU2F");
    }
    
    String localVarPath = "/v2/users/{userId}/u2f"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceRegisterU2FResponse> localVarReturnType = new TypeReference<UserServiceRegisterU2FResponse>() {};
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
   * Start the registration of a u2f token for a user
   * Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceRegisterU2FRequest  (required)
   * @return UserServiceBetaRegisterU2FResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRegisterU2FResponse userServiceRegisterU2F_0(String userId, UserServiceRegisterU2FRequest userServiceRegisterU2FRequest) throws ApiException {
    return this.userServiceRegisterU2F_0(userId, userServiceRegisterU2FRequest, Collections.emptyMap());
  }


  /**
   * Start the registration of a u2f token for a user
   * Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceRegisterU2FRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRegisterU2FResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRegisterU2FResponse userServiceRegisterU2F_0(String userId, UserServiceRegisterU2FRequest userServiceRegisterU2FRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRegisterU2FRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRegisterU2F_0");
    }
    
    if (userServiceRegisterU2FRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRegisterU2FRequest' when calling userServiceRegisterU2F_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/u2f"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaRegisterU2FResponse> localVarReturnType = new TypeReference<UserServiceBetaRegisterU2FResponse>() {};
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
   * Remove link of an identity provider to an user
   * Remove link of an identity provider to an user.
   * @param userId  (required)
   * @param idpId  (required)
   * @param linkedUserId  (required)
   * @return UserServiceRemoveIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveIDPLinkResponse userServiceRemoveIDPLink(String userId, String idpId, String linkedUserId) throws ApiException {
    return this.userServiceRemoveIDPLink(userId, idpId, linkedUserId, Collections.emptyMap());
  }


  /**
   * Remove link of an identity provider to an user
   * Remove link of an identity provider to an user.
   * @param userId  (required)
   * @param idpId  (required)
   * @param linkedUserId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveIDPLinkResponse userServiceRemoveIDPLink(String userId, String idpId, String linkedUserId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveIDPLink");
    }
    
    if (idpId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'idpId' when calling userServiceRemoveIDPLink");
    }
    
    if (linkedUserId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'linkedUserId' when calling userServiceRemoveIDPLink");
    }
    
    String localVarPath = "/v2/users/{userId}/links/{idpId}/{linkedUserId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "idpId" + "\\}", apiClient.escapeString(apiClient.parameterToString(idpId)))
      .replaceAll("\\{" + "linkedUserId" + "\\}", apiClient.escapeString(apiClient.parameterToString(linkedUserId)));

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

    TypeReference<UserServiceRemoveIDPLinkResponse> localVarReturnType = new TypeReference<UserServiceRemoveIDPLinkResponse>() {};
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
   * Remove One-Time Password (OTP) Email from a user
   * Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.
   * @param userId  (required)
   * @return UserServiceRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveOTPEmailResponse userServiceRemoveOTPEmail(String userId) throws ApiException {
    return this.userServiceRemoveOTPEmail(userId, Collections.emptyMap());
  }


  /**
   * Remove One-Time Password (OTP) Email from a user
   * Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveOTPEmailResponse userServiceRemoveOTPEmail(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveOTPEmail");
    }
    
    String localVarPath = "/v2/users/{userId}/otp_email"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceRemoveOTPEmailResponse> localVarReturnType = new TypeReference<UserServiceRemoveOTPEmailResponse>() {};
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
   * Remove One-Time Password (OTP) Email from a user
   * Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemoveOTPEmailResponse userServiceRemoveOTPEmail_0(String userId) throws ApiException {
    return this.userServiceRemoveOTPEmail_0(userId, Collections.emptyMap());
  }


  /**
   * Remove One-Time Password (OTP) Email from a user
   * Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemoveOTPEmailResponse userServiceRemoveOTPEmail_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveOTPEmail_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/otp_email"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaRemoveOTPEmailResponse> localVarReturnType = new TypeReference<UserServiceBetaRemoveOTPEmailResponse>() {};
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
   * Remove One-Time Password (OTP) SMS from a user
   * Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.
   * @param userId  (required)
   * @return UserServiceRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveOTPSMSResponse userServiceRemoveOTPSMS(String userId) throws ApiException {
    return this.userServiceRemoveOTPSMS(userId, Collections.emptyMap());
  }


  /**
   * Remove One-Time Password (OTP) SMS from a user
   * Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveOTPSMSResponse userServiceRemoveOTPSMS(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveOTPSMS");
    }
    
    String localVarPath = "/v2/users/{userId}/otp_sms"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceRemoveOTPSMSResponse> localVarReturnType = new TypeReference<UserServiceRemoveOTPSMSResponse>() {};
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
   * Remove One-Time Password (OTP) SMS from a user
   * Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemoveOTPSMSResponse userServiceRemoveOTPSMS_0(String userId) throws ApiException {
    return this.userServiceRemoveOTPSMS_0(userId, Collections.emptyMap());
  }


  /**
   * Remove One-Time Password (OTP) SMS from a user
   * Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemoveOTPSMSResponse userServiceRemoveOTPSMS_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveOTPSMS_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/otp_sms"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaRemoveOTPSMSResponse> localVarReturnType = new TypeReference<UserServiceBetaRemoveOTPSMSResponse>() {};
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
   * Remove passkey from a user
   * Remove passkey from a user.
   * @param userId  (required)
   * @param passkeyId  (required)
   * @return UserServiceRemovePasskeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemovePasskeyResponse userServiceRemovePasskey(String userId, String passkeyId) throws ApiException {
    return this.userServiceRemovePasskey(userId, passkeyId, Collections.emptyMap());
  }


  /**
   * Remove passkey from a user
   * Remove passkey from a user.
   * @param userId  (required)
   * @param passkeyId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemovePasskeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemovePasskeyResponse userServiceRemovePasskey(String userId, String passkeyId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemovePasskey");
    }
    
    if (passkeyId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'passkeyId' when calling userServiceRemovePasskey");
    }
    
    String localVarPath = "/v2/users/{userId}/passkeys/{passkeyId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "passkeyId" + "\\}", apiClient.escapeString(apiClient.parameterToString(passkeyId)));

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

    TypeReference<UserServiceRemovePasskeyResponse> localVarReturnType = new TypeReference<UserServiceRemovePasskeyResponse>() {};
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
   * Delete the user phone
   * Delete the phone number of a user.
   * @param userId  (required)
   * @return UserServiceRemovePhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemovePhoneResponse userServiceRemovePhone(String userId) throws ApiException {
    return this.userServiceRemovePhone(userId, Collections.emptyMap());
  }


  /**
   * Delete the user phone
   * Delete the phone number of a user.
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemovePhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemovePhoneResponse userServiceRemovePhone(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemovePhone");
    }
    
    String localVarPath = "/v2/users/{userId}/phone"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceRemovePhoneResponse> localVarReturnType = new TypeReference<UserServiceRemovePhoneResponse>() {};
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
   * Delete the user phone
   * Delete the phone number of a user.
   * @param userId  (required)
   * @return UserServiceBetaRemovePhoneResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemovePhoneResponse userServiceRemovePhone_0(String userId) throws ApiException {
    return this.userServiceRemovePhone_0(userId, Collections.emptyMap());
  }


  /**
   * Delete the user phone
   * Delete the phone number of a user.
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRemovePhoneResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemovePhoneResponse userServiceRemovePhone_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemovePhone_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/phone"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaRemovePhoneResponse> localVarReturnType = new TypeReference<UserServiceBetaRemovePhoneResponse>() {};
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
   * Remove TOTP generator from a user
   * Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.
   * @param userId  (required)
   * @return UserServiceRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveTOTPResponse userServiceRemoveTOTP(String userId) throws ApiException {
    return this.userServiceRemoveTOTP(userId, Collections.emptyMap());
  }


  /**
   * Remove TOTP generator from a user
   * Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveTOTPResponse userServiceRemoveTOTP(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveTOTP");
    }
    
    String localVarPath = "/v2/users/{userId}/totp"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceRemoveTOTPResponse> localVarReturnType = new TypeReference<UserServiceRemoveTOTPResponse>() {};
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
   * Remove TOTP generator from a user
   * Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemoveTOTPResponse userServiceRemoveTOTP_0(String userId) throws ApiException {
    return this.userServiceRemoveTOTP_0(userId, Collections.emptyMap());
  }


  /**
   * Remove TOTP generator from a user
   * Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRemoveTOTPResponse userServiceRemoveTOTP_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveTOTP_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/totp"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaRemoveTOTPResponse> localVarReturnType = new TypeReference<UserServiceBetaRemoveTOTPResponse>() {};
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
   * Remove u2f token from a user
   * Remove u2f token from a user
   * @param userId  (required)
   * @param u2fId  (required)
   * @return UserServiceRemoveU2FResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveU2FResponse userServiceRemoveU2F(String userId, String u2fId) throws ApiException {
    return this.userServiceRemoveU2F(userId, u2fId, Collections.emptyMap());
  }


  /**
   * Remove u2f token from a user
   * Remove u2f token from a user
   * @param userId  (required)
   * @param u2fId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveU2FResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveU2FResponse userServiceRemoveU2F(String userId, String u2fId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceRemoveU2F");
    }
    
    if (u2fId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'u2fId' when calling userServiceRemoveU2F");
    }
    
    String localVarPath = "/v2/users/{userId}/u2f/{u2fId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "u2fId" + "\\}", apiClient.escapeString(apiClient.parameterToString(u2fId)));

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

    TypeReference<UserServiceRemoveU2FResponse> localVarReturnType = new TypeReference<UserServiceRemoveU2FResponse>() {};
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
   * Resend code to verify user email
   * Resend code to verify user email.
   * @param userId  (required)
   * @param userServiceResendEmailCodeRequest  (required)
   * @return UserServiceResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendEmailCodeResponse userServiceResendEmailCode(String userId, UserServiceResendEmailCodeRequest userServiceResendEmailCodeRequest) throws ApiException {
    return this.userServiceResendEmailCode(userId, userServiceResendEmailCodeRequest, Collections.emptyMap());
  }


  /**
   * Resend code to verify user email
   * Resend code to verify user email.
   * @param userId  (required)
   * @param userServiceResendEmailCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendEmailCodeResponse userServiceResendEmailCode(String userId, UserServiceResendEmailCodeRequest userServiceResendEmailCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceResendEmailCodeRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceResendEmailCode");
    }
    
    if (userServiceResendEmailCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceResendEmailCodeRequest' when calling userServiceResendEmailCode");
    }
    
    String localVarPath = "/v2/users/{userId}/email/resend"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceResendEmailCodeResponse> localVarReturnType = new TypeReference<UserServiceResendEmailCodeResponse>() {};
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
   * Resend code to verify user email
   * Resend code to verify user email  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceResendEmailCodeRequest  (required)
   * @return UserServiceBetaResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaResendEmailCodeResponse userServiceResendEmailCode_0(String userId, UserServiceResendEmailCodeRequest userServiceResendEmailCodeRequest) throws ApiException {
    return this.userServiceResendEmailCode_0(userId, userServiceResendEmailCodeRequest, Collections.emptyMap());
  }


  /**
   * Resend code to verify user email
   * Resend code to verify user email  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceResendEmailCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaResendEmailCodeResponse userServiceResendEmailCode_0(String userId, UserServiceResendEmailCodeRequest userServiceResendEmailCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceResendEmailCodeRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceResendEmailCode_0");
    }
    
    if (userServiceResendEmailCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceResendEmailCodeRequest' when calling userServiceResendEmailCode_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/email/resend"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaResendEmailCodeResponse> localVarReturnType = new TypeReference<UserServiceBetaResendEmailCodeResponse>() {};
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
   * Resend an invite code for a user
   * Resend an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods. A resend is only possible if a code has been created previously and sent to the user. If there is no code or it was directly returned, an error will be returned.
   * @param userId  (required)
   * @return UserServiceResendInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendInviteCodeResponse userServiceResendInviteCode(String userId) throws ApiException {
    return this.userServiceResendInviteCode(userId, Collections.emptyMap());
  }


  /**
   * Resend an invite code for a user
   * Resend an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods. A resend is only possible if a code has been created previously and sent to the user. If there is no code or it was directly returned, an error will be returned.
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceResendInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendInviteCodeResponse userServiceResendInviteCode(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceResendInviteCode");
    }
    
    String localVarPath = "/v2/users/{userId}/invite_code/resend"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceResendInviteCodeResponse> localVarReturnType = new TypeReference<UserServiceResendInviteCodeResponse>() {};
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
   * Resend code to verify user phone
   * Resend code to verify user phone.
   * @param userId  (required)
   * @param userServiceResendPhoneCodeRequest  (required)
   * @return UserServiceResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendPhoneCodeResponse userServiceResendPhoneCode(String userId, UserServiceResendPhoneCodeRequest userServiceResendPhoneCodeRequest) throws ApiException {
    return this.userServiceResendPhoneCode(userId, userServiceResendPhoneCodeRequest, Collections.emptyMap());
  }


  /**
   * Resend code to verify user phone
   * Resend code to verify user phone.
   * @param userId  (required)
   * @param userServiceResendPhoneCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendPhoneCodeResponse userServiceResendPhoneCode(String userId, UserServiceResendPhoneCodeRequest userServiceResendPhoneCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceResendPhoneCodeRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceResendPhoneCode");
    }
    
    if (userServiceResendPhoneCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceResendPhoneCodeRequest' when calling userServiceResendPhoneCode");
    }
    
    String localVarPath = "/v2/users/{userId}/phone/resend"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceResendPhoneCodeResponse> localVarReturnType = new TypeReference<UserServiceResendPhoneCodeResponse>() {};
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
   * Resend code to verify user phone
   * Resend code to verify user phone  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceResendPhoneCodeRequest  (required)
   * @return UserServiceBetaResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaResendPhoneCodeResponse userServiceResendPhoneCode_0(String userId, UserServiceResendPhoneCodeRequest userServiceResendPhoneCodeRequest) throws ApiException {
    return this.userServiceResendPhoneCode_0(userId, userServiceResendPhoneCodeRequest, Collections.emptyMap());
  }


  /**
   * Resend code to verify user phone
   * Resend code to verify user phone  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceResendPhoneCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaResendPhoneCodeResponse userServiceResendPhoneCode_0(String userId, UserServiceResendPhoneCodeRequest userServiceResendPhoneCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceResendPhoneCodeRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceResendPhoneCode_0");
    }
    
    if (userServiceResendPhoneCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceResendPhoneCodeRequest' when calling userServiceResendPhoneCode_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/phone/resend"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaResendPhoneCodeResponse> localVarReturnType = new TypeReference<UserServiceBetaResendPhoneCodeResponse>() {};
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
   * Retrieve the information returned by the identity provider
   * Retrieve the information returned by the identity provider for registration or updating an existing user with new information..
   * @param idpIntentId ID of the idp intent, previously returned on the success response of the IDP callback (required)
   * @param userServiceRetrieveIdentityProviderIntentRequest  (required)
   * @return UserServiceRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRetrieveIdentityProviderIntentResponse userServiceRetrieveIdentityProviderIntent(String idpIntentId, UserServiceRetrieveIdentityProviderIntentRequest userServiceRetrieveIdentityProviderIntentRequest) throws ApiException {
    return this.userServiceRetrieveIdentityProviderIntent(idpIntentId, userServiceRetrieveIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * Retrieve the information returned by the identity provider
   * Retrieve the information returned by the identity provider for registration or updating an existing user with new information..
   * @param idpIntentId ID of the idp intent, previously returned on the success response of the IDP callback (required)
   * @param userServiceRetrieveIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRetrieveIdentityProviderIntentResponse userServiceRetrieveIdentityProviderIntent(String idpIntentId, UserServiceRetrieveIdentityProviderIntentRequest userServiceRetrieveIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRetrieveIdentityProviderIntentRequest;
    
    if (idpIntentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'idpIntentId' when calling userServiceRetrieveIdentityProviderIntent");
    }
    
    if (userServiceRetrieveIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRetrieveIdentityProviderIntentRequest' when calling userServiceRetrieveIdentityProviderIntent");
    }
    
    String localVarPath = "/v2/idp_intents/{idpIntentId}"
      .replaceAll("\\{" + "idpIntentId" + "\\}", apiClient.escapeString(apiClient.parameterToString(idpIntentId)));

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

    TypeReference<UserServiceRetrieveIdentityProviderIntentResponse> localVarReturnType = new TypeReference<UserServiceRetrieveIdentityProviderIntentResponse>() {};
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
   * Retrieve the information returned by the identity provider
   * Retrieve the information returned by the identity provider for registration or updating an existing user with new information.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param idpIntentId ID of the idp intent, previously returned on the success response of the IDP callback (required)
   * @param userServiceRetrieveIdentityProviderIntentRequest  (required)
   * @return UserServiceBetaRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRetrieveIdentityProviderIntentResponse userServiceRetrieveIdentityProviderIntent_0(String idpIntentId, UserServiceRetrieveIdentityProviderIntentRequest userServiceRetrieveIdentityProviderIntentRequest) throws ApiException {
    return this.userServiceRetrieveIdentityProviderIntent_0(idpIntentId, userServiceRetrieveIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * Retrieve the information returned by the identity provider
   * Retrieve the information returned by the identity provider for registration or updating an existing user with new information.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param idpIntentId ID of the idp intent, previously returned on the success response of the IDP callback (required)
   * @param userServiceRetrieveIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaRetrieveIdentityProviderIntentResponse userServiceRetrieveIdentityProviderIntent_0(String idpIntentId, UserServiceRetrieveIdentityProviderIntentRequest userServiceRetrieveIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRetrieveIdentityProviderIntentRequest;
    
    if (idpIntentId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'idpIntentId' when calling userServiceRetrieveIdentityProviderIntent_0");
    }
    
    if (userServiceRetrieveIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRetrieveIdentityProviderIntentRequest' when calling userServiceRetrieveIdentityProviderIntent_0");
    }
    
    String localVarPath = "/v2beta/idp_intents/{idpIntentId}"
      .replaceAll("\\{" + "idpIntentId" + "\\}", apiClient.escapeString(apiClient.parameterToString(idpIntentId)));

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

    TypeReference<UserServiceBetaRetrieveIdentityProviderIntentResponse> localVarReturnType = new TypeReference<UserServiceBetaRetrieveIdentityProviderIntentResponse>() {};
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
   * Send code to verify user email
   * Send code to verify user email.
   * @param userId  (required)
   * @param userServiceSendEmailCodeRequest  (required)
   * @return UserServiceSendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSendEmailCodeResponse userServiceSendEmailCode(String userId, UserServiceSendEmailCodeRequest userServiceSendEmailCodeRequest) throws ApiException {
    return this.userServiceSendEmailCode(userId, userServiceSendEmailCodeRequest, Collections.emptyMap());
  }


  /**
   * Send code to verify user email
   * Send code to verify user email.
   * @param userId  (required)
   * @param userServiceSendEmailCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSendEmailCodeResponse userServiceSendEmailCode(String userId, UserServiceSendEmailCodeRequest userServiceSendEmailCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSendEmailCodeRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceSendEmailCode");
    }
    
    if (userServiceSendEmailCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSendEmailCodeRequest' when calling userServiceSendEmailCode");
    }
    
    String localVarPath = "/v2/users/{userId}/email/send"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceSendEmailCodeResponse> localVarReturnType = new TypeReference<UserServiceSendEmailCodeResponse>() {};
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
   * Change the user email
   * Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email..
   * @param userId  (required)
   * @param userServiceSetEmailRequest  (required)
   * @return UserServiceSetEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetEmailResponse userServiceSetEmail(String userId, UserServiceSetEmailRequest userServiceSetEmailRequest) throws ApiException {
    return this.userServiceSetEmail(userId, userServiceSetEmailRequest, Collections.emptyMap());
  }


  /**
   * Change the user email
   * Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email..
   * @param userId  (required)
   * @param userServiceSetEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSetEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetEmailResponse userServiceSetEmail(String userId, UserServiceSetEmailRequest userServiceSetEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetEmailRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceSetEmail");
    }
    
    if (userServiceSetEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetEmailRequest' when calling userServiceSetEmail");
    }
    
    String localVarPath = "/v2/users/{userId}/email"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceSetEmailResponse> localVarReturnType = new TypeReference<UserServiceSetEmailResponse>() {};
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
   * Change the user email
   * Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceSetEmailRequest  (required)
   * @return UserServiceBetaSetEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaSetEmailResponse userServiceSetEmail_0(String userId, UserServiceSetEmailRequest userServiceSetEmailRequest) throws ApiException {
    return this.userServiceSetEmail_0(userId, userServiceSetEmailRequest, Collections.emptyMap());
  }


  /**
   * Change the user email
   * Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceSetEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaSetEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaSetEmailResponse userServiceSetEmail_0(String userId, UserServiceSetEmailRequest userServiceSetEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetEmailRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceSetEmail_0");
    }
    
    if (userServiceSetEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetEmailRequest' when calling userServiceSetEmail_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/email"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaSetEmailResponse> localVarReturnType = new TypeReference<UserServiceBetaSetEmailResponse>() {};
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
   * Change password
   * Change the password of a user with either a verification code or the current password..
   * @param userId  (required)
   * @param userServiceSetPasswordRequest  (required)
   * @return UserServiceSetPasswordResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetPasswordResponse userServiceSetPassword(String userId, UserServiceSetPasswordRequest userServiceSetPasswordRequest) throws ApiException {
    return this.userServiceSetPassword(userId, userServiceSetPasswordRequest, Collections.emptyMap());
  }


  /**
   * Change password
   * Change the password of a user with either a verification code or the current password..
   * @param userId  (required)
   * @param userServiceSetPasswordRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSetPasswordResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetPasswordResponse userServiceSetPassword(String userId, UserServiceSetPasswordRequest userServiceSetPasswordRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetPasswordRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceSetPassword");
    }
    
    if (userServiceSetPasswordRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetPasswordRequest' when calling userServiceSetPassword");
    }
    
    String localVarPath = "/v2/users/{userId}/password"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceSetPasswordResponse> localVarReturnType = new TypeReference<UserServiceSetPasswordResponse>() {};
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
   * Change password
   * Change the password of a user with either a verification code or the current password.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceBetaUserServiceSetPasswordRequest  (required)
   * @return UserServiceBetaSetPasswordResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaSetPasswordResponse userServiceSetPassword_0(String userId, UserServiceBetaUserServiceSetPasswordRequest userServiceBetaUserServiceSetPasswordRequest) throws ApiException {
    return this.userServiceSetPassword_0(userId, userServiceBetaUserServiceSetPasswordRequest, Collections.emptyMap());
  }


  /**
   * Change password
   * Change the password of a user with either a verification code or the current password.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceBetaUserServiceSetPasswordRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaSetPasswordResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaSetPasswordResponse userServiceSetPassword_0(String userId, UserServiceBetaUserServiceSetPasswordRequest userServiceBetaUserServiceSetPasswordRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceBetaUserServiceSetPasswordRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceSetPassword_0");
    }
    
    if (userServiceBetaUserServiceSetPasswordRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceBetaUserServiceSetPasswordRequest' when calling userServiceSetPassword_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/password"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaSetPasswordResponse> localVarReturnType = new TypeReference<UserServiceBetaSetPasswordResponse>() {};
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
   * Set the user phone
   * Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms..
   * @param userId  (required)
   * @param userServiceSetPhoneRequest  (required)
   * @return UserServiceSetPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetPhoneResponse userServiceSetPhone(String userId, UserServiceSetPhoneRequest userServiceSetPhoneRequest) throws ApiException {
    return this.userServiceSetPhone(userId, userServiceSetPhoneRequest, Collections.emptyMap());
  }


  /**
   * Set the user phone
   * Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms..
   * @param userId  (required)
   * @param userServiceSetPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSetPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetPhoneResponse userServiceSetPhone(String userId, UserServiceSetPhoneRequest userServiceSetPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetPhoneRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceSetPhone");
    }
    
    if (userServiceSetPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetPhoneRequest' when calling userServiceSetPhone");
    }
    
    String localVarPath = "/v2/users/{userId}/phone"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceSetPhoneResponse> localVarReturnType = new TypeReference<UserServiceSetPhoneResponse>() {};
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
   * Set the user phone
   * Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceSetPhoneRequest  (required)
   * @return UserServiceBetaSetPhoneResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaSetPhoneResponse userServiceSetPhone_0(String userId, UserServiceSetPhoneRequest userServiceSetPhoneRequest) throws ApiException {
    return this.userServiceSetPhone_0(userId, userServiceSetPhoneRequest, Collections.emptyMap());
  }


  /**
   * Set the user phone
   * Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceSetPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaSetPhoneResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaSetPhoneResponse userServiceSetPhone_0(String userId, UserServiceSetPhoneRequest userServiceSetPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetPhoneRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceSetPhone_0");
    }
    
    if (userServiceSetPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetPhoneRequest' when calling userServiceSetPhone_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/phone"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaSetPhoneResponse> localVarReturnType = new TypeReference<UserServiceBetaSetPhoneResponse>() {};
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
   * Start flow with an identity provider
   * Start a flow with an identity provider, for external login, registration or linking..
   * @param userServiceStartIdentityProviderIntentRequest  (required)
   * @return UserServiceStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceStartIdentityProviderIntentResponse userServiceStartIdentityProviderIntent(UserServiceStartIdentityProviderIntentRequest userServiceStartIdentityProviderIntentRequest) throws ApiException {
    return this.userServiceStartIdentityProviderIntent(userServiceStartIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * Start flow with an identity provider
   * Start a flow with an identity provider, for external login, registration or linking..
   * @param userServiceStartIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceStartIdentityProviderIntentResponse userServiceStartIdentityProviderIntent(UserServiceStartIdentityProviderIntentRequest userServiceStartIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceStartIdentityProviderIntentRequest;
    
    if (userServiceStartIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceStartIdentityProviderIntentRequest' when calling userServiceStartIdentityProviderIntent");
    }
    
    String localVarPath = "/v2/idp_intents";

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

    TypeReference<UserServiceStartIdentityProviderIntentResponse> localVarReturnType = new TypeReference<UserServiceStartIdentityProviderIntentResponse>() {};
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
   * Start flow with an identity provider
   * Start a flow with an identity provider, for external login, registration or linking.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userServiceStartIdentityProviderIntentRequest  (required)
   * @return UserServiceBetaStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaStartIdentityProviderIntentResponse userServiceStartIdentityProviderIntent_0(UserServiceStartIdentityProviderIntentRequest userServiceStartIdentityProviderIntentRequest) throws ApiException {
    return this.userServiceStartIdentityProviderIntent_0(userServiceStartIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * Start flow with an identity provider
   * Start a flow with an identity provider, for external login, registration or linking.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userServiceStartIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaStartIdentityProviderIntentResponse userServiceStartIdentityProviderIntent_0(UserServiceStartIdentityProviderIntentRequest userServiceStartIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceStartIdentityProviderIntentRequest;
    
    if (userServiceStartIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceStartIdentityProviderIntentRequest' when calling userServiceStartIdentityProviderIntent_0");
    }
    
    String localVarPath = "/v2beta/idp_intents";

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

    TypeReference<UserServiceBetaStartIdentityProviderIntentResponse> localVarReturnType = new TypeReference<UserServiceBetaStartIdentityProviderIntentResponse>() {};
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
   * Unlock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.)..
   * @param userId  (required)
   * @return UserServiceUnlockUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceUnlockUserResponse userServiceUnlockUser(String userId) throws ApiException {
    return this.userServiceUnlockUser(userId, Collections.emptyMap());
  }


  /**
   * Unlock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.)..
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceUnlockUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceUnlockUserResponse userServiceUnlockUser(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceUnlockUser");
    }
    
    String localVarPath = "/v2/users/{userId}/unlock"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceUnlockUserResponse> localVarReturnType = new TypeReference<UserServiceUnlockUserResponse>() {};
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
   * Unlock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @return UserServiceBetaUnlockUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaUnlockUserResponse userServiceUnlockUser_0(String userId) throws ApiException {
    return this.userServiceUnlockUser_0(userId, Collections.emptyMap());
  }


  /**
   * Unlock user
   * The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaUnlockUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaUnlockUserResponse userServiceUnlockUser_0(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceUnlockUser_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/unlock"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaUnlockUserResponse> localVarReturnType = new TypeReference<UserServiceBetaUnlockUserResponse>() {};
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
   * Update User
   * Update all information from a user..
   * @param userId  (required)
   * @param userServiceUpdateHumanUserRequest  (required)
   * @return UserServiceUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceUpdateHumanUserResponse userServiceUpdateHumanUser(String userId, UserServiceUpdateHumanUserRequest userServiceUpdateHumanUserRequest) throws ApiException {
    return this.userServiceUpdateHumanUser(userId, userServiceUpdateHumanUserRequest, Collections.emptyMap());
  }


  /**
   * Update User
   * Update all information from a user..
   * @param userId  (required)
   * @param userServiceUpdateHumanUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceUpdateHumanUserResponse userServiceUpdateHumanUser(String userId, UserServiceUpdateHumanUserRequest userServiceUpdateHumanUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceUpdateHumanUserRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceUpdateHumanUser");
    }
    
    if (userServiceUpdateHumanUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceUpdateHumanUserRequest' when calling userServiceUpdateHumanUser");
    }
    
    String localVarPath = "/v2/users/human/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceUpdateHumanUserResponse> localVarReturnType = new TypeReference<UserServiceUpdateHumanUserResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
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
   * Update User
   * Update all information from a user.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param profileGivenName  (required)
   * @param profileFamilyName  (required)
   * @param emailEmail  (required)
   * @param passwordPasswordPassword  (required)
   * @param passwordHashedPasswordHash \&quot;Encoded hash of a password in Modular Crypt Format: https://zitadel.com/docs/concepts/architecture/secrets#hashed-secrets\&quot; (required)
   * @param passwordCurrentPassword  (required)
   * @param passwordVerificationCode \&quot;the verification code generated during password reset request\&quot; (required)
   * @param username  (optional)
   * @param profileNickName  (optional)
   * @param profileDisplayName  (optional)
   * @param profilePreferredLanguage  (optional)
   * @param profileGender  (optional, default to GENDER_UNSPECIFIED)
   * @param emailSendCodeUrlTemplate \&quot;Optionally set a url_template, which will be used in the verification mail sent by ZITADEL to guide the user to your verification page. If no template is set, the default ZITADEL url will be used.\&quot; (optional)
   * @param emailIsVerified  (optional)
   * @param phonePhone  (optional)
   * @param phoneIsVerified  (optional)
   * @param passwordPasswordChangeRequired  (optional)
   * @param passwordHashedPasswordChangeRequired  (optional)
   * @return UserServiceBetaUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaUpdateHumanUserResponse userServiceUpdateHumanUser_0(String userId, String profileGivenName, String profileFamilyName, String emailEmail, String passwordPasswordPassword, String passwordHashedPasswordHash, String passwordCurrentPassword, String passwordVerificationCode, String username, String profileNickName, String profileDisplayName, String profilePreferredLanguage, String profileGender, String emailSendCodeUrlTemplate, Boolean emailIsVerified, String phonePhone, Boolean phoneIsVerified, Boolean passwordPasswordChangeRequired, Boolean passwordHashedPasswordChangeRequired) throws ApiException {
    return this.userServiceUpdateHumanUser_0(userId, profileGivenName, profileFamilyName, emailEmail, passwordPasswordPassword, passwordHashedPasswordHash, passwordCurrentPassword, passwordVerificationCode, username, profileNickName, profileDisplayName, profilePreferredLanguage, profileGender, emailSendCodeUrlTemplate, emailIsVerified, phonePhone, phoneIsVerified, passwordPasswordChangeRequired, passwordHashedPasswordChangeRequired, Collections.emptyMap());
  }


  /**
   * Update User
   * Update all information from a user.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param profileGivenName  (required)
   * @param profileFamilyName  (required)
   * @param emailEmail  (required)
   * @param passwordPasswordPassword  (required)
   * @param passwordHashedPasswordHash \&quot;Encoded hash of a password in Modular Crypt Format: https://zitadel.com/docs/concepts/architecture/secrets#hashed-secrets\&quot; (required)
   * @param passwordCurrentPassword  (required)
   * @param passwordVerificationCode \&quot;the verification code generated during password reset request\&quot; (required)
   * @param username  (optional)
   * @param profileNickName  (optional)
   * @param profileDisplayName  (optional)
   * @param profilePreferredLanguage  (optional)
   * @param profileGender  (optional, default to GENDER_UNSPECIFIED)
   * @param emailSendCodeUrlTemplate \&quot;Optionally set a url_template, which will be used in the verification mail sent by ZITADEL to guide the user to your verification page. If no template is set, the default ZITADEL url will be used.\&quot; (optional)
   * @param emailIsVerified  (optional)
   * @param phonePhone  (optional)
   * @param phoneIsVerified  (optional)
   * @param passwordPasswordChangeRequired  (optional)
   * @param passwordHashedPasswordChangeRequired  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaUpdateHumanUserResponse userServiceUpdateHumanUser_0(String userId, String profileGivenName, String profileFamilyName, String emailEmail, String passwordPasswordPassword, String passwordHashedPasswordHash, String passwordCurrentPassword, String passwordVerificationCode, String username, String profileNickName, String profileDisplayName, String profilePreferredLanguage, String profileGender, String emailSendCodeUrlTemplate, Boolean emailIsVerified, String phonePhone, Boolean phoneIsVerified, Boolean passwordPasswordChangeRequired, Boolean passwordHashedPasswordChangeRequired, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceUpdateHumanUser_0");
    }
    
    if (profileGivenName == null) {
      throw new IllegalArgumentException("Missing the required parameter 'profileGivenName' when calling userServiceUpdateHumanUser_0");
    }
    
    if (profileFamilyName == null) {
      throw new IllegalArgumentException("Missing the required parameter 'profileFamilyName' when calling userServiceUpdateHumanUser_0");
    }
    
    if (emailEmail == null) {
      throw new IllegalArgumentException("Missing the required parameter 'emailEmail' when calling userServiceUpdateHumanUser_0");
    }
    
    if (passwordPasswordPassword == null) {
      throw new IllegalArgumentException("Missing the required parameter 'passwordPasswordPassword' when calling userServiceUpdateHumanUser_0");
    }
    
    if (passwordHashedPasswordHash == null) {
      throw new IllegalArgumentException("Missing the required parameter 'passwordHashedPasswordHash' when calling userServiceUpdateHumanUser_0");
    }
    
    if (passwordCurrentPassword == null) {
      throw new IllegalArgumentException("Missing the required parameter 'passwordCurrentPassword' when calling userServiceUpdateHumanUser_0");
    }
    
    if (passwordVerificationCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'passwordVerificationCode' when calling userServiceUpdateHumanUser_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("username", username));
    localVarQueryParams.addAll(apiClient.parameterToPair("profile.givenName", profileGivenName));
    localVarQueryParams.addAll(apiClient.parameterToPair("profile.familyName", profileFamilyName));
    localVarQueryParams.addAll(apiClient.parameterToPair("profile.nickName", profileNickName));
    localVarQueryParams.addAll(apiClient.parameterToPair("profile.displayName", profileDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPair("profile.preferredLanguage", profilePreferredLanguage));
    localVarQueryParams.addAll(apiClient.parameterToPair("profile.gender", profileGender));
    localVarQueryParams.addAll(apiClient.parameterToPair("email.email", emailEmail));
    localVarQueryParams.addAll(apiClient.parameterToPair("email.sendCode.urlTemplate", emailSendCodeUrlTemplate));
    localVarQueryParams.addAll(apiClient.parameterToPair("email.isVerified", emailIsVerified));
    localVarQueryParams.addAll(apiClient.parameterToPair("phone.phone", phonePhone));
    localVarQueryParams.addAll(apiClient.parameterToPair("phone.isVerified", phoneIsVerified));
    localVarQueryParams.addAll(apiClient.parameterToPair("password.password.password", passwordPasswordPassword));
    localVarQueryParams.addAll(apiClient.parameterToPair("password.password.changeRequired", passwordPasswordChangeRequired));
    localVarQueryParams.addAll(apiClient.parameterToPair("password.hashedPassword.hash", passwordHashedPasswordHash));
    localVarQueryParams.addAll(apiClient.parameterToPair("password.hashedPassword.changeRequired", passwordHashedPasswordChangeRequired));
    localVarQueryParams.addAll(apiClient.parameterToPair("password.currentPassword", passwordCurrentPassword));
    localVarQueryParams.addAll(apiClient.parameterToPair("password.verificationCode", passwordVerificationCode));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<UserServiceBetaUpdateHumanUserResponse> localVarReturnType = new TypeReference<UserServiceBetaUpdateHumanUserResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
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
   * Verify the email
   * Verify the email with the generated code.
   * @param userId  (required)
   * @param userServiceVerifyEmailRequest  (required)
   * @return UserServiceVerifyEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyEmailResponse userServiceVerifyEmail(String userId, UserServiceVerifyEmailRequest userServiceVerifyEmailRequest) throws ApiException {
    return this.userServiceVerifyEmail(userId, userServiceVerifyEmailRequest, Collections.emptyMap());
  }


  /**
   * Verify the email
   * Verify the email with the generated code.
   * @param userId  (required)
   * @param userServiceVerifyEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyEmailResponse userServiceVerifyEmail(String userId, UserServiceVerifyEmailRequest userServiceVerifyEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyEmailRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyEmail");
    }
    
    if (userServiceVerifyEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyEmailRequest' when calling userServiceVerifyEmail");
    }
    
    String localVarPath = "/v2/users/{userId}/email/verify"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceVerifyEmailResponse> localVarReturnType = new TypeReference<UserServiceVerifyEmailResponse>() {};
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
   * Verify the email
   * Verify the email with the generated code.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceVerifyEmailRequest  (required)
   * @return UserServiceBetaVerifyEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyEmailResponse userServiceVerifyEmail_0(String userId, UserServiceVerifyEmailRequest userServiceVerifyEmailRequest) throws ApiException {
    return this.userServiceVerifyEmail_0(userId, userServiceVerifyEmailRequest, Collections.emptyMap());
  }


  /**
   * Verify the email
   * Verify the email with the generated code.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceVerifyEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaVerifyEmailResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyEmailResponse userServiceVerifyEmail_0(String userId, UserServiceVerifyEmailRequest userServiceVerifyEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyEmailRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyEmail_0");
    }
    
    if (userServiceVerifyEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyEmailRequest' when calling userServiceVerifyEmail_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/email/verify"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaVerifyEmailResponse> localVarReturnType = new TypeReference<UserServiceBetaVerifyEmailResponse>() {};
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
   * Verify an invite code for a user
   * Verify the invite code of a user previously issued. This will set their email to a verified state and allow the user to set up their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.
   * @param userId  (required)
   * @param userServiceVerifyInviteCodeRequest  (required)
   * @return UserServiceVerifyInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyInviteCodeResponse userServiceVerifyInviteCode(String userId, UserServiceVerifyInviteCodeRequest userServiceVerifyInviteCodeRequest) throws ApiException {
    return this.userServiceVerifyInviteCode(userId, userServiceVerifyInviteCodeRequest, Collections.emptyMap());
  }


  /**
   * Verify an invite code for a user
   * Verify the invite code of a user previously issued. This will set their email to a verified state and allow the user to set up their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.
   * @param userId  (required)
   * @param userServiceVerifyInviteCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyInviteCodeResponse userServiceVerifyInviteCode(String userId, UserServiceVerifyInviteCodeRequest userServiceVerifyInviteCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyInviteCodeRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyInviteCode");
    }
    
    if (userServiceVerifyInviteCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyInviteCodeRequest' when calling userServiceVerifyInviteCode");
    }
    
    String localVarPath = "/v2/users/{userId}/invite_code/verify"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceVerifyInviteCodeResponse> localVarReturnType = new TypeReference<UserServiceVerifyInviteCodeResponse>() {};
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
   * Verify a passkey for a user
   * Verify the passkey registration with the public key credential..
   * @param userId  (required)
   * @param passkeyId  (required)
   * @param userServiceVerifyPasskeyRegistrationRequest  (required)
   * @return UserServiceVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyPasskeyRegistrationResponse userServiceVerifyPasskeyRegistration(String userId, String passkeyId, UserServiceVerifyPasskeyRegistrationRequest userServiceVerifyPasskeyRegistrationRequest) throws ApiException {
    return this.userServiceVerifyPasskeyRegistration(userId, passkeyId, userServiceVerifyPasskeyRegistrationRequest, Collections.emptyMap());
  }


  /**
   * Verify a passkey for a user
   * Verify the passkey registration with the public key credential..
   * @param userId  (required)
   * @param passkeyId  (required)
   * @param userServiceVerifyPasskeyRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyPasskeyRegistrationResponse userServiceVerifyPasskeyRegistration(String userId, String passkeyId, UserServiceVerifyPasskeyRegistrationRequest userServiceVerifyPasskeyRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyPasskeyRegistrationRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyPasskeyRegistration");
    }
    
    if (passkeyId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'passkeyId' when calling userServiceVerifyPasskeyRegistration");
    }
    
    if (userServiceVerifyPasskeyRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyPasskeyRegistrationRequest' when calling userServiceVerifyPasskeyRegistration");
    }
    
    String localVarPath = "/v2/users/{userId}/passkeys/{passkeyId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "passkeyId" + "\\}", apiClient.escapeString(apiClient.parameterToString(passkeyId)));

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

    TypeReference<UserServiceVerifyPasskeyRegistrationResponse> localVarReturnType = new TypeReference<UserServiceVerifyPasskeyRegistrationResponse>() {};
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
   * Verify a passkey for a user
   * Verify the passkey registration with the public key credential.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param passkeyId  (required)
   * @param userServiceVerifyPasskeyRegistrationRequest  (required)
   * @return UserServiceBetaVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyPasskeyRegistrationResponse userServiceVerifyPasskeyRegistration_0(String userId, String passkeyId, UserServiceVerifyPasskeyRegistrationRequest userServiceVerifyPasskeyRegistrationRequest) throws ApiException {
    return this.userServiceVerifyPasskeyRegistration_0(userId, passkeyId, userServiceVerifyPasskeyRegistrationRequest, Collections.emptyMap());
  }


  /**
   * Verify a passkey for a user
   * Verify the passkey registration with the public key credential.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param passkeyId  (required)
   * @param userServiceVerifyPasskeyRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyPasskeyRegistrationResponse userServiceVerifyPasskeyRegistration_0(String userId, String passkeyId, UserServiceVerifyPasskeyRegistrationRequest userServiceVerifyPasskeyRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyPasskeyRegistrationRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyPasskeyRegistration_0");
    }
    
    if (passkeyId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'passkeyId' when calling userServiceVerifyPasskeyRegistration_0");
    }
    
    if (userServiceVerifyPasskeyRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyPasskeyRegistrationRequest' when calling userServiceVerifyPasskeyRegistration_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/passkeys/{passkeyId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "passkeyId" + "\\}", apiClient.escapeString(apiClient.parameterToString(passkeyId)));

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

    TypeReference<UserServiceBetaVerifyPasskeyRegistrationResponse> localVarReturnType = new TypeReference<UserServiceBetaVerifyPasskeyRegistrationResponse>() {};
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
   * Verify the phone
   * Verify the phone with the generated code..
   * @param userId  (required)
   * @param userServiceVerifyPhoneRequest  (required)
   * @return UserServiceVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyPhoneResponse userServiceVerifyPhone(String userId, UserServiceVerifyPhoneRequest userServiceVerifyPhoneRequest) throws ApiException {
    return this.userServiceVerifyPhone(userId, userServiceVerifyPhoneRequest, Collections.emptyMap());
  }


  /**
   * Verify the phone
   * Verify the phone with the generated code..
   * @param userId  (required)
   * @param userServiceVerifyPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyPhoneResponse userServiceVerifyPhone(String userId, UserServiceVerifyPhoneRequest userServiceVerifyPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyPhoneRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyPhone");
    }
    
    if (userServiceVerifyPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyPhoneRequest' when calling userServiceVerifyPhone");
    }
    
    String localVarPath = "/v2/users/{userId}/phone/verify"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceVerifyPhoneResponse> localVarReturnType = new TypeReference<UserServiceVerifyPhoneResponse>() {};
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
   * Verify the phone
   * Verify the phone with the generated code.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceVerifyPhoneRequest  (required)
   * @return UserServiceBetaVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyPhoneResponse userServiceVerifyPhone_0(String userId, UserServiceVerifyPhoneRequest userServiceVerifyPhoneRequest) throws ApiException {
    return this.userServiceVerifyPhone_0(userId, userServiceVerifyPhoneRequest, Collections.emptyMap());
  }


  /**
   * Verify the phone
   * Verify the phone with the generated code.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceVerifyPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyPhoneResponse userServiceVerifyPhone_0(String userId, UserServiceVerifyPhoneRequest userServiceVerifyPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyPhoneRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyPhone_0");
    }
    
    if (userServiceVerifyPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyPhoneRequest' when calling userServiceVerifyPhone_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/phone/verify"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaVerifyPhoneResponse> localVarReturnType = new TypeReference<UserServiceBetaVerifyPhoneResponse>() {};
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
   * Verify a TOTP generator for a user
   * Verify the TOTP registration with a generated code..
   * @param userId  (required)
   * @param userServiceVerifyTOTPRegistrationRequest  (required)
   * @return UserServiceVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyTOTPRegistrationResponse userServiceVerifyTOTPRegistration(String userId, UserServiceVerifyTOTPRegistrationRequest userServiceVerifyTOTPRegistrationRequest) throws ApiException {
    return this.userServiceVerifyTOTPRegistration(userId, userServiceVerifyTOTPRegistrationRequest, Collections.emptyMap());
  }


  /**
   * Verify a TOTP generator for a user
   * Verify the TOTP registration with a generated code..
   * @param userId  (required)
   * @param userServiceVerifyTOTPRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyTOTPRegistrationResponse userServiceVerifyTOTPRegistration(String userId, UserServiceVerifyTOTPRegistrationRequest userServiceVerifyTOTPRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyTOTPRegistrationRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyTOTPRegistration");
    }
    
    if (userServiceVerifyTOTPRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyTOTPRegistrationRequest' when calling userServiceVerifyTOTPRegistration");
    }
    
    String localVarPath = "/v2/users/{userId}/totp/verify"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceVerifyTOTPRegistrationResponse> localVarReturnType = new TypeReference<UserServiceVerifyTOTPRegistrationResponse>() {};
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
   * Verify a TOTP generator for a user
   * Verify the TOTP registration with a generated code.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceVerifyTOTPRegistrationRequest  (required)
   * @return UserServiceBetaVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyTOTPRegistrationResponse userServiceVerifyTOTPRegistration_0(String userId, UserServiceVerifyTOTPRegistrationRequest userServiceVerifyTOTPRegistrationRequest) throws ApiException {
    return this.userServiceVerifyTOTPRegistration_0(userId, userServiceVerifyTOTPRegistrationRequest, Collections.emptyMap());
  }


  /**
   * Verify a TOTP generator for a user
   * Verify the TOTP registration with a generated code.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param userServiceVerifyTOTPRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyTOTPRegistrationResponse userServiceVerifyTOTPRegistration_0(String userId, UserServiceVerifyTOTPRegistrationRequest userServiceVerifyTOTPRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyTOTPRegistrationRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyTOTPRegistration_0");
    }
    
    if (userServiceVerifyTOTPRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyTOTPRegistrationRequest' when calling userServiceVerifyTOTPRegistration_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/totp/verify"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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

    TypeReference<UserServiceBetaVerifyTOTPRegistrationResponse> localVarReturnType = new TypeReference<UserServiceBetaVerifyTOTPRegistrationResponse>() {};
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
   * Verify a u2f token for a user
   * Verify the u2f token registration with the public key credential..
   * @param userId  (required)
   * @param u2fId  (required)
   * @param userServiceVerifyU2FRegistrationRequest  (required)
   * @return UserServiceVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyU2FRegistrationResponse userServiceVerifyU2FRegistration(String userId, String u2fId, UserServiceVerifyU2FRegistrationRequest userServiceVerifyU2FRegistrationRequest) throws ApiException {
    return this.userServiceVerifyU2FRegistration(userId, u2fId, userServiceVerifyU2FRegistrationRequest, Collections.emptyMap());
  }


  /**
   * Verify a u2f token for a user
   * Verify the u2f token registration with the public key credential..
   * @param userId  (required)
   * @param u2fId  (required)
   * @param userServiceVerifyU2FRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyU2FRegistrationResponse userServiceVerifyU2FRegistration(String userId, String u2fId, UserServiceVerifyU2FRegistrationRequest userServiceVerifyU2FRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyU2FRegistrationRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyU2FRegistration");
    }
    
    if (u2fId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'u2fId' when calling userServiceVerifyU2FRegistration");
    }
    
    if (userServiceVerifyU2FRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyU2FRegistrationRequest' when calling userServiceVerifyU2FRegistration");
    }
    
    String localVarPath = "/v2/users/{userId}/u2f/{u2fId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "u2fId" + "\\}", apiClient.escapeString(apiClient.parameterToString(u2fId)));

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

    TypeReference<UserServiceVerifyU2FRegistrationResponse> localVarReturnType = new TypeReference<UserServiceVerifyU2FRegistrationResponse>() {};
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
   * Verify a u2f token for a user
   * Verify the u2f token registration with the public key credential.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param u2fId  (required)
   * @param userServiceVerifyU2FRegistrationRequest  (required)
   * @return UserServiceBetaVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyU2FRegistrationResponse userServiceVerifyU2FRegistration_0(String userId, String u2fId, UserServiceVerifyU2FRegistrationRequest userServiceVerifyU2FRegistrationRequest) throws ApiException {
    return this.userServiceVerifyU2FRegistration_0(userId, u2fId, userServiceVerifyU2FRegistrationRequest, Collections.emptyMap());
  }


  /**
   * Verify a u2f token for a user
   * Verify the u2f token registration with the public key credential.  Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param userId  (required)
   * @param u2fId  (required)
   * @param userServiceVerifyU2FRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceBetaVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public UserServiceBetaVerifyU2FRegistrationResponse userServiceVerifyU2FRegistration_0(String userId, String u2fId, UserServiceVerifyU2FRegistrationRequest userServiceVerifyU2FRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyU2FRegistrationRequest;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling userServiceVerifyU2FRegistration_0");
    }
    
    if (u2fId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'u2fId' when calling userServiceVerifyU2FRegistration_0");
    }
    
    if (userServiceVerifyU2FRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyU2FRegistrationRequest' when calling userServiceVerifyU2FRegistration_0");
    }
    
    String localVarPath = "/v2beta/users/{userId}/u2f/{u2fId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "u2fId" + "\\}", apiClient.escapeString(apiClient.parameterToString(u2fId)));

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

    TypeReference<UserServiceBetaVerifyU2FRegistrationResponse> localVarReturnType = new TypeReference<UserServiceBetaVerifyU2FRegistrationResponse>() {};
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
