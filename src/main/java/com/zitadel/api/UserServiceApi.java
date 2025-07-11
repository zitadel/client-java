package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Pair;

import com.zitadel.model.UserServiceAddHumanUserRequest;
import com.zitadel.model.UserServiceAddHumanUserResponse;
import com.zitadel.model.UserServiceAddIDPLinkRequest;
import com.zitadel.model.UserServiceAddIDPLinkResponse;
import com.zitadel.model.UserServiceAddKeyRequest;
import com.zitadel.model.UserServiceAddKeyResponse;
import com.zitadel.model.UserServiceAddOTPEmailRequest;
import com.zitadel.model.UserServiceAddOTPEmailResponse;
import com.zitadel.model.UserServiceAddOTPSMSRequest;
import com.zitadel.model.UserServiceAddOTPSMSResponse;
import com.zitadel.model.UserServiceAddPersonalAccessTokenRequest;
import com.zitadel.model.UserServiceAddPersonalAccessTokenResponse;
import com.zitadel.model.UserServiceAddSecretRequest;
import com.zitadel.model.UserServiceAddSecretResponse;
import com.zitadel.model.UserServiceCreateInviteCodeRequest;
import com.zitadel.model.UserServiceCreateInviteCodeResponse;
import com.zitadel.model.UserServiceCreatePasskeyRegistrationLinkRequest;
import com.zitadel.model.UserServiceCreatePasskeyRegistrationLinkResponse;
import com.zitadel.model.UserServiceCreateUserRequest;
import com.zitadel.model.UserServiceCreateUserResponse;
import com.zitadel.model.UserServiceDeactivateUserRequest;
import com.zitadel.model.UserServiceDeactivateUserResponse;
import com.zitadel.model.UserServiceDeleteUserMetadataRequest;
import com.zitadel.model.UserServiceDeleteUserMetadataResponse;
import com.zitadel.model.UserServiceDeleteUserRequest;
import com.zitadel.model.UserServiceDeleteUserResponse;
import com.zitadel.model.UserServiceGetUserByIDRequest;
import com.zitadel.model.UserServiceGetUserByIDResponse;
import com.zitadel.model.UserServiceHumanMFAInitSkippedRequest;
import com.zitadel.model.UserServiceHumanMFAInitSkippedResponse;
import com.zitadel.model.UserServiceListAuthenticationFactorsRequest;
import com.zitadel.model.UserServiceListAuthenticationFactorsResponse;
import com.zitadel.model.UserServiceListAuthenticationMethodTypesRequest;
import com.zitadel.model.UserServiceListAuthenticationMethodTypesResponse;
import com.zitadel.model.UserServiceListIDPLinksRequest;
import com.zitadel.model.UserServiceListIDPLinksResponse;
import com.zitadel.model.UserServiceListKeysRequest;
import com.zitadel.model.UserServiceListKeysResponse;
import com.zitadel.model.UserServiceListPasskeysRequest;
import com.zitadel.model.UserServiceListPasskeysResponse;
import com.zitadel.model.UserServiceListPersonalAccessTokensRequest;
import com.zitadel.model.UserServiceListPersonalAccessTokensResponse;
import com.zitadel.model.UserServiceListUserMetadataRequest;
import com.zitadel.model.UserServiceListUserMetadataResponse;
import com.zitadel.model.UserServiceListUsersRequest;
import com.zitadel.model.UserServiceListUsersResponse;
import com.zitadel.model.UserServiceLockUserRequest;
import com.zitadel.model.UserServiceLockUserResponse;
import com.zitadel.model.UserServicePasswordResetRequest;
import com.zitadel.model.UserServicePasswordResetResponse;
import com.zitadel.model.UserServiceReactivateUserRequest;
import com.zitadel.model.UserServiceReactivateUserResponse;
import com.zitadel.model.UserServiceRegisterPasskeyRequest;
import com.zitadel.model.UserServiceRegisterPasskeyResponse;
import com.zitadel.model.UserServiceRegisterTOTPRequest;
import com.zitadel.model.UserServiceRegisterTOTPResponse;
import com.zitadel.model.UserServiceRegisterU2FRequest;
import com.zitadel.model.UserServiceRegisterU2FResponse;
import com.zitadel.model.UserServiceRemoveIDPLinkRequest;
import com.zitadel.model.UserServiceRemoveIDPLinkResponse;
import com.zitadel.model.UserServiceRemoveKeyRequest;
import com.zitadel.model.UserServiceRemoveKeyResponse;
import com.zitadel.model.UserServiceRemoveOTPEmailRequest;
import com.zitadel.model.UserServiceRemoveOTPEmailResponse;
import com.zitadel.model.UserServiceRemoveOTPSMSRequest;
import com.zitadel.model.UserServiceRemoveOTPSMSResponse;
import com.zitadel.model.UserServiceRemovePasskeyRequest;
import com.zitadel.model.UserServiceRemovePasskeyResponse;
import com.zitadel.model.UserServiceRemovePersonalAccessTokenRequest;
import com.zitadel.model.UserServiceRemovePersonalAccessTokenResponse;
import com.zitadel.model.UserServiceRemovePhoneRequest;
import com.zitadel.model.UserServiceRemovePhoneResponse;
import com.zitadel.model.UserServiceRemoveSecretRequest;
import com.zitadel.model.UserServiceRemoveSecretResponse;
import com.zitadel.model.UserServiceRemoveTOTPRequest;
import com.zitadel.model.UserServiceRemoveTOTPResponse;
import com.zitadel.model.UserServiceRemoveU2FRequest;
import com.zitadel.model.UserServiceRemoveU2FResponse;
import com.zitadel.model.UserServiceResendEmailCodeRequest;
import com.zitadel.model.UserServiceResendEmailCodeResponse;
import com.zitadel.model.UserServiceResendInviteCodeRequest;
import com.zitadel.model.UserServiceResendInviteCodeResponse;
import com.zitadel.model.UserServiceResendPhoneCodeRequest;
import com.zitadel.model.UserServiceResendPhoneCodeResponse;
import com.zitadel.model.UserServiceRetrieveIdentityProviderIntentRequest;
import com.zitadel.model.UserServiceRetrieveIdentityProviderIntentResponse;
import com.zitadel.model.UserServiceSendEmailCodeRequest;
import com.zitadel.model.UserServiceSendEmailCodeResponse;
import com.zitadel.model.UserServiceSetEmailRequest;
import com.zitadel.model.UserServiceSetEmailResponse;
import com.zitadel.model.UserServiceSetPasswordRequest;
import com.zitadel.model.UserServiceSetPasswordResponse;
import com.zitadel.model.UserServiceSetPhoneRequest;
import com.zitadel.model.UserServiceSetPhoneResponse;
import com.zitadel.model.UserServiceSetUserMetadataRequest;
import com.zitadel.model.UserServiceSetUserMetadataResponse;
import com.zitadel.model.UserServiceStartIdentityProviderIntentRequest;
import com.zitadel.model.UserServiceStartIdentityProviderIntentResponse;
import com.zitadel.model.UserServiceUnlockUserRequest;
import com.zitadel.model.UserServiceUnlockUserResponse;
import com.zitadel.model.UserServiceUpdateHumanUserRequest;
import com.zitadel.model.UserServiceUpdateHumanUserResponse;
import com.zitadel.model.UserServiceUpdateUserRequest;
import com.zitadel.model.UserServiceUpdateUserResponse;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class UserServiceApi extends BaseApi {

  public UserServiceApi() {
      super(ApiClient.defaultApiClient);
  }

  public UserServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * AddHumanUser
   * Create a new human user   Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.
   * @param userServiceAddHumanUserRequest  (required)
   * @return UserServiceAddHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddHumanUserResponse addHumanUser(UserServiceAddHumanUserRequest userServiceAddHumanUserRequest) throws ApiException {
    return this.addHumanUser(userServiceAddHumanUserRequest, Collections.emptyMap());
  }


  /**
   * AddHumanUser
   * Create a new human user   Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.
   * @param userServiceAddHumanUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceAddHumanUserResponse addHumanUser(UserServiceAddHumanUserRequest userServiceAddHumanUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddHumanUserRequest;

    if (userServiceAddHumanUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddHumanUserRequest' when calling addHumanUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/AddHumanUser";

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
   * AddIDPLink
   * Add link to an identity provider to an user   Add link to an identity provider to an user..
   * @param userServiceAddIDPLinkRequest  (required)
   * @return UserServiceAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddIDPLinkResponse addIDPLink(UserServiceAddIDPLinkRequest userServiceAddIDPLinkRequest) throws ApiException {
    return this.addIDPLink(userServiceAddIDPLinkRequest, Collections.emptyMap());
  }


  /**
   * AddIDPLink
   * Add link to an identity provider to an user   Add link to an identity provider to an user..
   * @param userServiceAddIDPLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceAddIDPLinkResponse addIDPLink(UserServiceAddIDPLinkRequest userServiceAddIDPLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddIDPLinkRequest;

    if (userServiceAddIDPLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddIDPLinkRequest' when calling addIDPLink");
    }

    String localVarPath = "/zitadel.user.v2.UserService/AddIDPLink";

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
   * AddKey
   * Add a Key   Add a keys that can be used to securely authenticate at the Zitadel APIs using JWT profile authentication using short-lived tokens.  Make sure you store the returned key safely, as you won&#39;t be able to read it from the Zitadel API anymore.  Only users of type machine can have keys.   Required permission:    - user.write
   * @param userServiceAddKeyRequest  (required)
   * @return UserServiceAddKeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddKeyResponse addKey(UserServiceAddKeyRequest userServiceAddKeyRequest) throws ApiException {
    return this.addKey(userServiceAddKeyRequest, Collections.emptyMap());
  }


  /**
   * AddKey
   * Add a Key   Add a keys that can be used to securely authenticate at the Zitadel APIs using JWT profile authentication using short-lived tokens.  Make sure you store the returned key safely, as you won&#39;t be able to read it from the Zitadel API anymore.  Only users of type machine can have keys.   Required permission:    - user.write
   * @param userServiceAddKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddKeyResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceAddKeyResponse addKey(UserServiceAddKeyRequest userServiceAddKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddKeyRequest;

    if (userServiceAddKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddKeyRequest' when calling addKey");
    }

    String localVarPath = "/zitadel.user.v2.UserService/AddKey";

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

    TypeReference<UserServiceAddKeyResponse> localVarReturnType = new TypeReference<UserServiceAddKeyResponse>() {};
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
   * AddOTPEmail
   * Add OTP Email for a user   Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor..
   * @param userServiceAddOTPEmailRequest  (required)
   * @return UserServiceAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddOTPEmailResponse addOTPEmail(UserServiceAddOTPEmailRequest userServiceAddOTPEmailRequest) throws ApiException {
    return this.addOTPEmail(userServiceAddOTPEmailRequest, Collections.emptyMap());
  }


  /**
   * AddOTPEmail
   * Add OTP Email for a user   Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor..
   * @param userServiceAddOTPEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceAddOTPEmailResponse addOTPEmail(UserServiceAddOTPEmailRequest userServiceAddOTPEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddOTPEmailRequest;

    if (userServiceAddOTPEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddOTPEmailRequest' when calling addOTPEmail");
    }

    String localVarPath = "/zitadel.user.v2.UserService/AddOTPEmail";

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
   * AddOTPSMS
   * Add OTP SMS for a user   Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor..
   * @param userServiceAddOTPSMSRequest  (required)
   * @return UserServiceAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddOTPSMSResponse addOTPSMS(UserServiceAddOTPSMSRequest userServiceAddOTPSMSRequest) throws ApiException {
    return this.addOTPSMS(userServiceAddOTPSMSRequest, Collections.emptyMap());
  }


  /**
   * AddOTPSMS
   * Add OTP SMS for a user   Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor..
   * @param userServiceAddOTPSMSRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceAddOTPSMSResponse addOTPSMS(UserServiceAddOTPSMSRequest userServiceAddOTPSMSRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddOTPSMSRequest;

    if (userServiceAddOTPSMSRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddOTPSMSRequest' when calling addOTPSMS");
    }

    String localVarPath = "/zitadel.user.v2.UserService/AddOTPSMS";

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
   * AddPersonalAccessToken
   * Add a Personal Access Token   Personal access tokens (PAT) are the easiest way to authenticate to the Zitadel APIs.  Make sure you store the returned PAT safely, as you won&#39;t be able to read it from the Zitadel API anymore.  Only users of type machine can have personal access tokens.   Required permission:    - user.write
   * @param userServiceAddPersonalAccessTokenRequest  (required)
   * @return UserServiceAddPersonalAccessTokenResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddPersonalAccessTokenResponse addPersonalAccessToken(UserServiceAddPersonalAccessTokenRequest userServiceAddPersonalAccessTokenRequest) throws ApiException {
    return this.addPersonalAccessToken(userServiceAddPersonalAccessTokenRequest, Collections.emptyMap());
  }


  /**
   * AddPersonalAccessToken
   * Add a Personal Access Token   Personal access tokens (PAT) are the easiest way to authenticate to the Zitadel APIs.  Make sure you store the returned PAT safely, as you won&#39;t be able to read it from the Zitadel API anymore.  Only users of type machine can have personal access tokens.   Required permission:    - user.write
   * @param userServiceAddPersonalAccessTokenRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddPersonalAccessTokenResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceAddPersonalAccessTokenResponse addPersonalAccessToken(UserServiceAddPersonalAccessTokenRequest userServiceAddPersonalAccessTokenRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddPersonalAccessTokenRequest;

    if (userServiceAddPersonalAccessTokenRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddPersonalAccessTokenRequest' when calling addPersonalAccessToken");
    }

    String localVarPath = "/zitadel.user.v2.UserService/AddPersonalAccessToken";

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

    TypeReference<UserServiceAddPersonalAccessTokenResponse> localVarReturnType = new TypeReference<UserServiceAddPersonalAccessTokenResponse>() {};
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
   * AddSecret
   * Add a Users Secret   Generates a client secret for the user.  The client id is the users username.  If the user already has a secret, it is overwritten.  Only users of type machine can have a secret.   Required permission:    - user.write
   * @param userServiceAddSecretRequest  (required)
   * @return UserServiceAddSecretResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceAddSecretResponse addSecret(UserServiceAddSecretRequest userServiceAddSecretRequest) throws ApiException {
    return this.addSecret(userServiceAddSecretRequest, Collections.emptyMap());
  }


  /**
   * AddSecret
   * Add a Users Secret   Generates a client secret for the user.  The client id is the users username.  If the user already has a secret, it is overwritten.  Only users of type machine can have a secret.   Required permission:    - user.write
   * @param userServiceAddSecretRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceAddSecretResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceAddSecretResponse addSecret(UserServiceAddSecretRequest userServiceAddSecretRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceAddSecretRequest;

    if (userServiceAddSecretRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceAddSecretRequest' when calling addSecret");
    }

    String localVarPath = "/zitadel.user.v2.UserService/AddSecret";

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

    TypeReference<UserServiceAddSecretResponse> localVarReturnType = new TypeReference<UserServiceAddSecretResponse>() {};
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
   * CreateInviteCode
   * Create an invite code for a user   Create an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.  If an invite code has been created previously, it&#39;s url template and application name will be used as defaults for the new code.  The new code will overwrite the previous one and make it invalid.
   * @param userServiceCreateInviteCodeRequest  (required)
   * @return UserServiceCreateInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceCreateInviteCodeResponse createInviteCode(UserServiceCreateInviteCodeRequest userServiceCreateInviteCodeRequest) throws ApiException {
    return this.createInviteCode(userServiceCreateInviteCodeRequest, Collections.emptyMap());
  }


  /**
   * CreateInviteCode
   * Create an invite code for a user   Create an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.  If an invite code has been created previously, it&#39;s url template and application name will be used as defaults for the new code.  The new code will overwrite the previous one and make it invalid.
   * @param userServiceCreateInviteCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceCreateInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceCreateInviteCodeResponse createInviteCode(UserServiceCreateInviteCodeRequest userServiceCreateInviteCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceCreateInviteCodeRequest;

    if (userServiceCreateInviteCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceCreateInviteCodeRequest' when calling createInviteCode");
    }

    String localVarPath = "/zitadel.user.v2.UserService/CreateInviteCode";

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
   * CreatePasskeyRegistrationLink
   * Create a passkey registration link for a user   Create a passkey registration link which includes a code and either return it or send it to the user..
   * @param userServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @return UserServiceCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceCreatePasskeyRegistrationLinkResponse createPasskeyRegistrationLink(UserServiceCreatePasskeyRegistrationLinkRequest userServiceCreatePasskeyRegistrationLinkRequest) throws ApiException {
    return this.createPasskeyRegistrationLink(userServiceCreatePasskeyRegistrationLinkRequest, Collections.emptyMap());
  }


  /**
   * CreatePasskeyRegistrationLink
   * Create a passkey registration link for a user   Create a passkey registration link which includes a code and either return it or send it to the user..
   * @param userServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceCreatePasskeyRegistrationLinkResponse createPasskeyRegistrationLink(UserServiceCreatePasskeyRegistrationLinkRequest userServiceCreatePasskeyRegistrationLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceCreatePasskeyRegistrationLinkRequest;

    if (userServiceCreatePasskeyRegistrationLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceCreatePasskeyRegistrationLinkRequest' when calling createPasskeyRegistrationLink");
    }

    String localVarPath = "/zitadel.user.v2.UserService/CreatePasskeyRegistrationLink";

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
   * CreateUser
   * Create a User   Create a new human or machine user in the specified organization.   Required permission:    - user.write
   * @param userServiceCreateUserRequest  (required)
   * @return UserServiceCreateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceCreateUserResponse createUser(UserServiceCreateUserRequest userServiceCreateUserRequest) throws ApiException {
    return this.createUser(userServiceCreateUserRequest, Collections.emptyMap());
  }


  /**
   * CreateUser
   * Create a User   Create a new human or machine user in the specified organization.   Required permission:    - user.write
   * @param userServiceCreateUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceCreateUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceCreateUserResponse createUser(UserServiceCreateUserRequest userServiceCreateUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceCreateUserRequest;

    if (userServiceCreateUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceCreateUserRequest' when calling createUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/CreateUser";

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

    TypeReference<UserServiceCreateUserResponse> localVarReturnType = new TypeReference<UserServiceCreateUserResponse>() {};
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
   * DeactivateUser
   * Deactivate user   The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data..
   * @param userServiceDeactivateUserRequest  (required)
   * @return UserServiceDeactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceDeactivateUserResponse deactivateUser(UserServiceDeactivateUserRequest userServiceDeactivateUserRequest) throws ApiException {
    return this.deactivateUser(userServiceDeactivateUserRequest, Collections.emptyMap());
  }


  /**
   * DeactivateUser
   * Deactivate user   The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data..
   * @param userServiceDeactivateUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceDeactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceDeactivateUserResponse deactivateUser(UserServiceDeactivateUserRequest userServiceDeactivateUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceDeactivateUserRequest;

    if (userServiceDeactivateUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceDeactivateUserRequest' when calling deactivateUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/DeactivateUser";

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
   * DeleteUser
   * Delete user   The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found..
   * @param userServiceDeleteUserRequest  (required)
   * @return UserServiceDeleteUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceDeleteUserResponse deleteUser(UserServiceDeleteUserRequest userServiceDeleteUserRequest) throws ApiException {
    return this.deleteUser(userServiceDeleteUserRequest, Collections.emptyMap());
  }


  /**
   * DeleteUser
   * Delete user   The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found..
   * @param userServiceDeleteUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceDeleteUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceDeleteUserResponse deleteUser(UserServiceDeleteUserRequest userServiceDeleteUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceDeleteUserRequest;

    if (userServiceDeleteUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceDeleteUserRequest' when calling deleteUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/DeleteUser";

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

    TypeReference<UserServiceDeleteUserResponse> localVarReturnType = new TypeReference<UserServiceDeleteUserResponse>() {};
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
   * DeleteUserMetadata
   * Delete User Metadata   Delete metadata objects from an user with a specific key.   Required permission:   - &#x60;user.write&#x60;
   * @param userServiceDeleteUserMetadataRequest  (required)
   * @return UserServiceDeleteUserMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceDeleteUserMetadataResponse deleteUserMetadata(UserServiceDeleteUserMetadataRequest userServiceDeleteUserMetadataRequest) throws ApiException {
    return this.deleteUserMetadata(userServiceDeleteUserMetadataRequest, Collections.emptyMap());
  }


  /**
   * DeleteUserMetadata
   * Delete User Metadata   Delete metadata objects from an user with a specific key.   Required permission:   - &#x60;user.write&#x60;
   * @param userServiceDeleteUserMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceDeleteUserMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceDeleteUserMetadataResponse deleteUserMetadata(UserServiceDeleteUserMetadataRequest userServiceDeleteUserMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceDeleteUserMetadataRequest;

    if (userServiceDeleteUserMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceDeleteUserMetadataRequest' when calling deleteUserMetadata");
    }

    String localVarPath = "/zitadel.user.v2.UserService/DeleteUserMetadata";

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

    TypeReference<UserServiceDeleteUserMetadataResponse> localVarReturnType = new TypeReference<UserServiceDeleteUserMetadataResponse>() {};
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
   * GetUserByID
   * User by ID   Returns the full user object (human or machine) including the profile, email, etc..
   * @param userServiceGetUserByIDRequest  (required)
   * @return UserServiceGetUserByIDResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceGetUserByIDResponse getUserByID(UserServiceGetUserByIDRequest userServiceGetUserByIDRequest) throws ApiException {
    return this.getUserByID(userServiceGetUserByIDRequest, Collections.emptyMap());
  }


  /**
   * GetUserByID
   * User by ID   Returns the full user object (human or machine) including the profile, email, etc..
   * @param userServiceGetUserByIDRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceGetUserByIDResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceGetUserByIDResponse getUserByID(UserServiceGetUserByIDRequest userServiceGetUserByIDRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceGetUserByIDRequest;

    if (userServiceGetUserByIDRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceGetUserByIDRequest' when calling getUserByID");
    }

    String localVarPath = "/zitadel.user.v2.UserService/GetUserByID";

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

    TypeReference<UserServiceGetUserByIDResponse> localVarReturnType = new TypeReference<UserServiceGetUserByIDResponse>() {};
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
   * HumanMFAInitSkipped
   * MFA Init Skipped   Update the last time the user has skipped MFA initialization. The server timestamp is used.
   * @param userServiceHumanMFAInitSkippedRequest  (required)
   * @return UserServiceHumanMFAInitSkippedResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceHumanMFAInitSkippedResponse humanMFAInitSkipped(UserServiceHumanMFAInitSkippedRequest userServiceHumanMFAInitSkippedRequest) throws ApiException {
    return this.humanMFAInitSkipped(userServiceHumanMFAInitSkippedRequest, Collections.emptyMap());
  }


  /**
   * HumanMFAInitSkipped
   * MFA Init Skipped   Update the last time the user has skipped MFA initialization. The server timestamp is used.
   * @param userServiceHumanMFAInitSkippedRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceHumanMFAInitSkippedResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceHumanMFAInitSkippedResponse humanMFAInitSkipped(UserServiceHumanMFAInitSkippedRequest userServiceHumanMFAInitSkippedRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceHumanMFAInitSkippedRequest;

    if (userServiceHumanMFAInitSkippedRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceHumanMFAInitSkippedRequest' when calling humanMFAInitSkipped");
    }

    String localVarPath = "/zitadel.user.v2.UserService/HumanMFAInitSkipped";

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
   * ListAuthenticationFactors
   *
   * @param userServiceListAuthenticationFactorsRequest  (required)
   * @return UserServiceListAuthenticationFactorsResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListAuthenticationFactorsResponse listAuthenticationFactors(UserServiceListAuthenticationFactorsRequest userServiceListAuthenticationFactorsRequest) throws ApiException {
    return this.listAuthenticationFactors(userServiceListAuthenticationFactorsRequest, Collections.emptyMap());
  }


  /**
   * ListAuthenticationFactors
   *
   * @param userServiceListAuthenticationFactorsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListAuthenticationFactorsResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListAuthenticationFactorsResponse listAuthenticationFactors(UserServiceListAuthenticationFactorsRequest userServiceListAuthenticationFactorsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListAuthenticationFactorsRequest;

    if (userServiceListAuthenticationFactorsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListAuthenticationFactorsRequest' when calling listAuthenticationFactors");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListAuthenticationFactors";

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
   * ListAuthenticationMethodTypes
   * List all possible authentication methods of a user   List all possible authentication methods of a user like password, passwordless, (T)OTP and more..
   * @param userServiceListAuthenticationMethodTypesRequest  (required)
   * @return UserServiceListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListAuthenticationMethodTypesResponse listAuthenticationMethodTypes(UserServiceListAuthenticationMethodTypesRequest userServiceListAuthenticationMethodTypesRequest) throws ApiException {
    return this.listAuthenticationMethodTypes(userServiceListAuthenticationMethodTypesRequest, Collections.emptyMap());
  }


  /**
   * ListAuthenticationMethodTypes
   * List all possible authentication methods of a user   List all possible authentication methods of a user like password, passwordless, (T)OTP and more..
   * @param userServiceListAuthenticationMethodTypesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListAuthenticationMethodTypesResponse listAuthenticationMethodTypes(UserServiceListAuthenticationMethodTypesRequest userServiceListAuthenticationMethodTypesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListAuthenticationMethodTypesRequest;

    if (userServiceListAuthenticationMethodTypesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListAuthenticationMethodTypesRequest' when calling listAuthenticationMethodTypes");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListAuthenticationMethodTypes";

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

    TypeReference<UserServiceListAuthenticationMethodTypesResponse> localVarReturnType = new TypeReference<UserServiceListAuthenticationMethodTypesResponse>() {};
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
   * ListIDPLinks
   * List links to an identity provider of an user   List links to an identity provider of an user.
   * @param userServiceListIDPLinksRequest  (required)
   * @return UserServiceListIDPLinksResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListIDPLinksResponse listIDPLinks(UserServiceListIDPLinksRequest userServiceListIDPLinksRequest) throws ApiException {
    return this.listIDPLinks(userServiceListIDPLinksRequest, Collections.emptyMap());
  }


  /**
   * ListIDPLinks
   * List links to an identity provider of an user   List links to an identity provider of an user.
   * @param userServiceListIDPLinksRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListIDPLinksResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListIDPLinksResponse listIDPLinks(UserServiceListIDPLinksRequest userServiceListIDPLinksRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListIDPLinksRequest;

    if (userServiceListIDPLinksRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListIDPLinksRequest' when calling listIDPLinks");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListIDPLinks";

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
   * ListKeys
   * Search Keys   List all matching keys. By default all keys of the instance on which the caller has permission to read the owning users are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - user.read
   * @param userServiceListKeysRequest  (required)
   * @return UserServiceListKeysResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListKeysResponse listKeys(UserServiceListKeysRequest userServiceListKeysRequest) throws ApiException {
    return this.listKeys(userServiceListKeysRequest, Collections.emptyMap());
  }


  /**
   * ListKeys
   * Search Keys   List all matching keys. By default all keys of the instance on which the caller has permission to read the owning users are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - user.read
   * @param userServiceListKeysRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListKeysResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListKeysResponse listKeys(UserServiceListKeysRequest userServiceListKeysRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListKeysRequest;

    if (userServiceListKeysRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListKeysRequest' when calling listKeys");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListKeys";

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

    TypeReference<UserServiceListKeysResponse> localVarReturnType = new TypeReference<UserServiceListKeysResponse>() {};
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
   * ListPasskeys
   * List passkeys of an user   List passkeys of an user
   * @param userServiceListPasskeysRequest  (required)
   * @return UserServiceListPasskeysResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListPasskeysResponse listPasskeys(UserServiceListPasskeysRequest userServiceListPasskeysRequest) throws ApiException {
    return this.listPasskeys(userServiceListPasskeysRequest, Collections.emptyMap());
  }


  /**
   * ListPasskeys
   * List passkeys of an user   List passkeys of an user
   * @param userServiceListPasskeysRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListPasskeysResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListPasskeysResponse listPasskeys(UserServiceListPasskeysRequest userServiceListPasskeysRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListPasskeysRequest;

    if (userServiceListPasskeysRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListPasskeysRequest' when calling listPasskeys");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListPasskeys";

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
   * ListPersonalAccessTokens
   * Search Personal Access Tokens   List all personal access tokens. By default all personal access tokens of the instance on which the caller has permission to read the owning users are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - user.read
   * @param userServiceListPersonalAccessTokensRequest  (required)
   * @return UserServiceListPersonalAccessTokensResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListPersonalAccessTokensResponse listPersonalAccessTokens(UserServiceListPersonalAccessTokensRequest userServiceListPersonalAccessTokensRequest) throws ApiException {
    return this.listPersonalAccessTokens(userServiceListPersonalAccessTokensRequest, Collections.emptyMap());
  }


  /**
   * ListPersonalAccessTokens
   * Search Personal Access Tokens   List all personal access tokens. By default all personal access tokens of the instance on which the caller has permission to read the owning users are returned.  Make sure to include a limit and sorting for pagination.   Required permission:    - user.read
   * @param userServiceListPersonalAccessTokensRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListPersonalAccessTokensResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListPersonalAccessTokensResponse listPersonalAccessTokens(UserServiceListPersonalAccessTokensRequest userServiceListPersonalAccessTokensRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListPersonalAccessTokensRequest;

    if (userServiceListPersonalAccessTokensRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListPersonalAccessTokensRequest' when calling listPersonalAccessTokens");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListPersonalAccessTokens";

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

    TypeReference<UserServiceListPersonalAccessTokensResponse> localVarReturnType = new TypeReference<UserServiceListPersonalAccessTokensResponse>() {};
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
   * ListUserMetadata
   * List User Metadata   List metadata of an user filtered by query.   Required permission:   - &#x60;user.read&#x60;
   * @param userServiceListUserMetadataRequest  (required)
   * @return UserServiceListUserMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListUserMetadataResponse listUserMetadata(UserServiceListUserMetadataRequest userServiceListUserMetadataRequest) throws ApiException {
    return this.listUserMetadata(userServiceListUserMetadataRequest, Collections.emptyMap());
  }


  /**
   * ListUserMetadata
   * List User Metadata   List metadata of an user filtered by query.   Required permission:   - &#x60;user.read&#x60;
   * @param userServiceListUserMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListUserMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListUserMetadataResponse listUserMetadata(UserServiceListUserMetadataRequest userServiceListUserMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListUserMetadataRequest;

    if (userServiceListUserMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListUserMetadataRequest' when calling listUserMetadata");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListUserMetadata";

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

    TypeReference<UserServiceListUserMetadataResponse> localVarReturnType = new TypeReference<UserServiceListUserMetadataResponse>() {};
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
   * ListUsers
   * Search Users   Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.
   * @param userServiceListUsersRequest  (required)
   * @return UserServiceListUsersResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceListUsersResponse listUsers(UserServiceListUsersRequest userServiceListUsersRequest) throws ApiException {
    return this.listUsers(userServiceListUsersRequest, Collections.emptyMap());
  }


  /**
   * ListUsers
   * Search Users   Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.
   * @param userServiceListUsersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceListUsersResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceListUsersResponse listUsers(UserServiceListUsersRequest userServiceListUsersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceListUsersRequest;

    if (userServiceListUsersRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceListUsersRequest' when calling listUsers");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ListUsers";

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
   * LockUser
   * Lock user   The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.)..
   * @param userServiceLockUserRequest  (required)
   * @return UserServiceLockUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceLockUserResponse lockUser(UserServiceLockUserRequest userServiceLockUserRequest) throws ApiException {
    return this.lockUser(userServiceLockUserRequest, Collections.emptyMap());
  }


  /**
   * LockUser
   * Lock user   The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.)..
   * @param userServiceLockUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceLockUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceLockUserResponse lockUser(UserServiceLockUserRequest userServiceLockUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceLockUserRequest;

    if (userServiceLockUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceLockUserRequest' when calling lockUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/LockUser";

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
   * PasswordReset
   * Request a code to reset a password   Request a code to reset a password..
   * @param userServicePasswordResetRequest  (required)
   * @return UserServicePasswordResetResponse
   * @throws ApiException if fails to make API call
   */
  public UserServicePasswordResetResponse passwordReset(UserServicePasswordResetRequest userServicePasswordResetRequest) throws ApiException {
    return this.passwordReset(userServicePasswordResetRequest, Collections.emptyMap());
  }


  /**
   * PasswordReset
   * Request a code to reset a password   Request a code to reset a password..
   * @param userServicePasswordResetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServicePasswordResetResponse
   * @throws ApiException if fails to make API call
   */
  private UserServicePasswordResetResponse passwordReset(UserServicePasswordResetRequest userServicePasswordResetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServicePasswordResetRequest;

    if (userServicePasswordResetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServicePasswordResetRequest' when calling passwordReset");
    }

    String localVarPath = "/zitadel.user.v2.UserService/PasswordReset";

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
   * ReactivateUser
   * Reactivate user   Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;..
   * @param userServiceReactivateUserRequest  (required)
   * @return UserServiceReactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceReactivateUserResponse reactivateUser(UserServiceReactivateUserRequest userServiceReactivateUserRequest) throws ApiException {
    return this.reactivateUser(userServiceReactivateUserRequest, Collections.emptyMap());
  }


  /**
   * ReactivateUser
   * Reactivate user   Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;..
   * @param userServiceReactivateUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceReactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceReactivateUserResponse reactivateUser(UserServiceReactivateUserRequest userServiceReactivateUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceReactivateUserRequest;

    if (userServiceReactivateUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceReactivateUserRequest' when calling reactivateUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ReactivateUser";

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
   * RegisterPasskey
   * Start the registration of passkey for a user   Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey..
   * @param userServiceRegisterPasskeyRequest  (required)
   * @return UserServiceRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterPasskeyResponse registerPasskey(UserServiceRegisterPasskeyRequest userServiceRegisterPasskeyRequest) throws ApiException {
    return this.registerPasskey(userServiceRegisterPasskeyRequest, Collections.emptyMap());
  }


  /**
   * RegisterPasskey
   * Start the registration of passkey for a user   Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey..
   * @param userServiceRegisterPasskeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRegisterPasskeyResponse registerPasskey(UserServiceRegisterPasskeyRequest userServiceRegisterPasskeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRegisterPasskeyRequest;

    if (userServiceRegisterPasskeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRegisterPasskeyRequest' when calling registerPasskey");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RegisterPasskey";

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
   * RegisterTOTP
   * Start the registration of a TOTP generator for a user   Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device..
   * @param userServiceRegisterTOTPRequest  (required)
   * @return UserServiceRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterTOTPResponse registerTOTP(UserServiceRegisterTOTPRequest userServiceRegisterTOTPRequest) throws ApiException {
    return this.registerTOTP(userServiceRegisterTOTPRequest, Collections.emptyMap());
  }


  /**
   * RegisterTOTP
   * Start the registration of a TOTP generator for a user   Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device..
   * @param userServiceRegisterTOTPRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRegisterTOTPResponse registerTOTP(UserServiceRegisterTOTPRequest userServiceRegisterTOTPRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRegisterTOTPRequest;

    if (userServiceRegisterTOTPRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRegisterTOTPRequest' when calling registerTOTP");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RegisterTOTP";

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
   * RegisterU2F
   * Start the registration of a u2f token for a user   Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token..
   * @param userServiceRegisterU2FRequest  (required)
   * @return UserServiceRegisterU2FResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRegisterU2FResponse registerU2F(UserServiceRegisterU2FRequest userServiceRegisterU2FRequest) throws ApiException {
    return this.registerU2F(userServiceRegisterU2FRequest, Collections.emptyMap());
  }


  /**
   * RegisterU2F
   * Start the registration of a u2f token for a user   Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token..
   * @param userServiceRegisterU2FRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRegisterU2FResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRegisterU2FResponse registerU2F(UserServiceRegisterU2FRequest userServiceRegisterU2FRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRegisterU2FRequest;

    if (userServiceRegisterU2FRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRegisterU2FRequest' when calling registerU2F");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RegisterU2F";

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
   * RemoveIDPLink
   * Remove link of an identity provider to an user   Remove link of an identity provider to an user.
   * @param userServiceRemoveIDPLinkRequest  (required)
   * @return UserServiceRemoveIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveIDPLinkResponse removeIDPLink(UserServiceRemoveIDPLinkRequest userServiceRemoveIDPLinkRequest) throws ApiException {
    return this.removeIDPLink(userServiceRemoveIDPLinkRequest, Collections.emptyMap());
  }


  /**
   * RemoveIDPLink
   * Remove link of an identity provider to an user   Remove link of an identity provider to an user.
   * @param userServiceRemoveIDPLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemoveIDPLinkResponse removeIDPLink(UserServiceRemoveIDPLinkRequest userServiceRemoveIDPLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemoveIDPLinkRequest;

    if (userServiceRemoveIDPLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemoveIDPLinkRequest' when calling removeIDPLink");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemoveIDPLink";

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
   * RemoveKey
   * Remove a Key   Remove a machine users key by the given key ID and an optionally given user ID.   Required permission:    - user.write
   * @param userServiceRemoveKeyRequest  (required)
   * @return UserServiceRemoveKeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveKeyResponse removeKey(UserServiceRemoveKeyRequest userServiceRemoveKeyRequest) throws ApiException {
    return this.removeKey(userServiceRemoveKeyRequest, Collections.emptyMap());
  }


  /**
   * RemoveKey
   * Remove a Key   Remove a machine users key by the given key ID and an optionally given user ID.   Required permission:    - user.write
   * @param userServiceRemoveKeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveKeyResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemoveKeyResponse removeKey(UserServiceRemoveKeyRequest userServiceRemoveKeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemoveKeyRequest;

    if (userServiceRemoveKeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemoveKeyRequest' when calling removeKey");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemoveKey";

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

    TypeReference<UserServiceRemoveKeyResponse> localVarReturnType = new TypeReference<UserServiceRemoveKeyResponse>() {};
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
   * RemoveOTPEmail
   * Remove One-Time Password (OTP) Email from a user   Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.
   * @param userServiceRemoveOTPEmailRequest  (required)
   * @return UserServiceRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveOTPEmailResponse removeOTPEmail(UserServiceRemoveOTPEmailRequest userServiceRemoveOTPEmailRequest) throws ApiException {
    return this.removeOTPEmail(userServiceRemoveOTPEmailRequest, Collections.emptyMap());
  }


  /**
   * RemoveOTPEmail
   * Remove One-Time Password (OTP) Email from a user   Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.
   * @param userServiceRemoveOTPEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemoveOTPEmailResponse removeOTPEmail(UserServiceRemoveOTPEmailRequest userServiceRemoveOTPEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemoveOTPEmailRequest;

    if (userServiceRemoveOTPEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemoveOTPEmailRequest' when calling removeOTPEmail");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemoveOTPEmail";

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

    TypeReference<UserServiceRemoveOTPEmailResponse> localVarReturnType = new TypeReference<UserServiceRemoveOTPEmailResponse>() {};
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
   * RemoveOTPSMS
   * Remove One-Time Password (OTP) SMS from a user   Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.
   * @param userServiceRemoveOTPSMSRequest  (required)
   * @return UserServiceRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveOTPSMSResponse removeOTPSMS(UserServiceRemoveOTPSMSRequest userServiceRemoveOTPSMSRequest) throws ApiException {
    return this.removeOTPSMS(userServiceRemoveOTPSMSRequest, Collections.emptyMap());
  }


  /**
   * RemoveOTPSMS
   * Remove One-Time Password (OTP) SMS from a user   Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.
   * @param userServiceRemoveOTPSMSRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemoveOTPSMSResponse removeOTPSMS(UserServiceRemoveOTPSMSRequest userServiceRemoveOTPSMSRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemoveOTPSMSRequest;

    if (userServiceRemoveOTPSMSRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemoveOTPSMSRequest' when calling removeOTPSMS");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemoveOTPSMS";

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

    TypeReference<UserServiceRemoveOTPSMSResponse> localVarReturnType = new TypeReference<UserServiceRemoveOTPSMSResponse>() {};
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
   * RemovePasskey
   * Remove passkey from a user   Remove passkey from a user.
   * @param userServiceRemovePasskeyRequest  (required)
   * @return UserServiceRemovePasskeyResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemovePasskeyResponse removePasskey(UserServiceRemovePasskeyRequest userServiceRemovePasskeyRequest) throws ApiException {
    return this.removePasskey(userServiceRemovePasskeyRequest, Collections.emptyMap());
  }


  /**
   * RemovePasskey
   * Remove passkey from a user   Remove passkey from a user.
   * @param userServiceRemovePasskeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemovePasskeyResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemovePasskeyResponse removePasskey(UserServiceRemovePasskeyRequest userServiceRemovePasskeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemovePasskeyRequest;

    if (userServiceRemovePasskeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemovePasskeyRequest' when calling removePasskey");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemovePasskey";

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

    TypeReference<UserServiceRemovePasskeyResponse> localVarReturnType = new TypeReference<UserServiceRemovePasskeyResponse>() {};
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
   * RemovePersonalAccessToken
   * Remove a Personal Access Token   Removes a machine users personal access token by the given token ID and an optionally given user ID.   Required permission:    - user.write
   * @param userServiceRemovePersonalAccessTokenRequest  (required)
   * @return UserServiceRemovePersonalAccessTokenResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemovePersonalAccessTokenResponse removePersonalAccessToken(UserServiceRemovePersonalAccessTokenRequest userServiceRemovePersonalAccessTokenRequest) throws ApiException {
    return this.removePersonalAccessToken(userServiceRemovePersonalAccessTokenRequest, Collections.emptyMap());
  }


  /**
   * RemovePersonalAccessToken
   * Remove a Personal Access Token   Removes a machine users personal access token by the given token ID and an optionally given user ID.   Required permission:    - user.write
   * @param userServiceRemovePersonalAccessTokenRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemovePersonalAccessTokenResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemovePersonalAccessTokenResponse removePersonalAccessToken(UserServiceRemovePersonalAccessTokenRequest userServiceRemovePersonalAccessTokenRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemovePersonalAccessTokenRequest;

    if (userServiceRemovePersonalAccessTokenRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemovePersonalAccessTokenRequest' when calling removePersonalAccessToken");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemovePersonalAccessToken";

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

    TypeReference<UserServiceRemovePersonalAccessTokenResponse> localVarReturnType = new TypeReference<UserServiceRemovePersonalAccessTokenResponse>() {};
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
   * RemovePhone
   * Delete the user phone   Delete the phone number of a user.
   * @param userServiceRemovePhoneRequest  (required)
   * @return UserServiceRemovePhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemovePhoneResponse removePhone(UserServiceRemovePhoneRequest userServiceRemovePhoneRequest) throws ApiException {
    return this.removePhone(userServiceRemovePhoneRequest, Collections.emptyMap());
  }


  /**
   * RemovePhone
   * Delete the user phone   Delete the phone number of a user.
   * @param userServiceRemovePhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemovePhoneResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemovePhoneResponse removePhone(UserServiceRemovePhoneRequest userServiceRemovePhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemovePhoneRequest;

    if (userServiceRemovePhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemovePhoneRequest' when calling removePhone");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemovePhone";

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
   * RemoveSecret
   * Remove a Users Secret   Remove the current client ID and client secret from a machine user.   Required permission:    - user.write
   * @param userServiceRemoveSecretRequest  (required)
   * @return UserServiceRemoveSecretResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveSecretResponse removeSecret(UserServiceRemoveSecretRequest userServiceRemoveSecretRequest) throws ApiException {
    return this.removeSecret(userServiceRemoveSecretRequest, Collections.emptyMap());
  }


  /**
   * RemoveSecret
   * Remove a Users Secret   Remove the current client ID and client secret from a machine user.   Required permission:    - user.write
   * @param userServiceRemoveSecretRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveSecretResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemoveSecretResponse removeSecret(UserServiceRemoveSecretRequest userServiceRemoveSecretRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemoveSecretRequest;

    if (userServiceRemoveSecretRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemoveSecretRequest' when calling removeSecret");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemoveSecret";

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

    TypeReference<UserServiceRemoveSecretResponse> localVarReturnType = new TypeReference<UserServiceRemoveSecretResponse>() {};
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
   * RemoveTOTP
   * Remove TOTP generator from a user   Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.
   * @param userServiceRemoveTOTPRequest  (required)
   * @return UserServiceRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveTOTPResponse removeTOTP(UserServiceRemoveTOTPRequest userServiceRemoveTOTPRequest) throws ApiException {
    return this.removeTOTP(userServiceRemoveTOTPRequest, Collections.emptyMap());
  }


  /**
   * RemoveTOTP
   * Remove TOTP generator from a user   Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.
   * @param userServiceRemoveTOTPRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemoveTOTPResponse removeTOTP(UserServiceRemoveTOTPRequest userServiceRemoveTOTPRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemoveTOTPRequest;

    if (userServiceRemoveTOTPRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemoveTOTPRequest' when calling removeTOTP");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemoveTOTP";

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

    TypeReference<UserServiceRemoveTOTPResponse> localVarReturnType = new TypeReference<UserServiceRemoveTOTPResponse>() {};
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
   * RemoveU2F
   * Remove u2f token from a user   Remove u2f token from a user.
   * @param userServiceRemoveU2FRequest  (required)
   * @return UserServiceRemoveU2FResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRemoveU2FResponse removeU2F(UserServiceRemoveU2FRequest userServiceRemoveU2FRequest) throws ApiException {
    return this.removeU2F(userServiceRemoveU2FRequest, Collections.emptyMap());
  }


  /**
   * RemoveU2F
   * Remove u2f token from a user   Remove u2f token from a user.
   * @param userServiceRemoveU2FRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRemoveU2FResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRemoveU2FResponse removeU2F(UserServiceRemoveU2FRequest userServiceRemoveU2FRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRemoveU2FRequest;

    if (userServiceRemoveU2FRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRemoveU2FRequest' when calling removeU2F");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RemoveU2F";

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

    TypeReference<UserServiceRemoveU2FResponse> localVarReturnType = new TypeReference<UserServiceRemoveU2FResponse>() {};
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
   * ResendEmailCode
   * Resend code to verify user email
   * @param userServiceResendEmailCodeRequest  (required)
   * @return UserServiceResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendEmailCodeResponse resendEmailCode(UserServiceResendEmailCodeRequest userServiceResendEmailCodeRequest) throws ApiException {
    return this.resendEmailCode(userServiceResendEmailCodeRequest, Collections.emptyMap());
  }


  /**
   * ResendEmailCode
   * Resend code to verify user email
   * @param userServiceResendEmailCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceResendEmailCodeResponse resendEmailCode(UserServiceResendEmailCodeRequest userServiceResendEmailCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceResendEmailCodeRequest;

    if (userServiceResendEmailCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceResendEmailCodeRequest' when calling resendEmailCode");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ResendEmailCode";

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
   * ResendInviteCode
   * Resend an invite code for a user   Deprecated: Use [CreateInviteCode](apis/resources/user_service_v2/user-service-create-invite-code.api.mdx) instead.   Resend an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.  A resend is only possible if a code has been created previously and sent to the user. If there is no code or it was directly returned, an error will be returned.
   * @param userServiceResendInviteCodeRequest  (required)
   * @return UserServiceResendInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendInviteCodeResponse resendInviteCode(UserServiceResendInviteCodeRequest userServiceResendInviteCodeRequest) throws ApiException {
    return this.resendInviteCode(userServiceResendInviteCodeRequest, Collections.emptyMap());
  }


  /**
   * ResendInviteCode
   * Resend an invite code for a user   Deprecated: Use [CreateInviteCode](apis/resources/user_service_v2/user-service-create-invite-code.api.mdx) instead.   Resend an invite code for a user to initialize their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.  A resend is only possible if a code has been created previously and sent to the user. If there is no code or it was directly returned, an error will be returned.
   * @param userServiceResendInviteCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceResendInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceResendInviteCodeResponse resendInviteCode(UserServiceResendInviteCodeRequest userServiceResendInviteCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceResendInviteCodeRequest;

    if (userServiceResendInviteCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceResendInviteCodeRequest' when calling resendInviteCode");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ResendInviteCode";

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
   * ResendPhoneCode
   * Resend code to verify user phone
   * @param userServiceResendPhoneCodeRequest  (required)
   * @return UserServiceResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceResendPhoneCodeResponse resendPhoneCode(UserServiceResendPhoneCodeRequest userServiceResendPhoneCodeRequest) throws ApiException {
    return this.resendPhoneCode(userServiceResendPhoneCodeRequest, Collections.emptyMap());
  }


  /**
   * ResendPhoneCode
   * Resend code to verify user phone
   * @param userServiceResendPhoneCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceResendPhoneCodeResponse resendPhoneCode(UserServiceResendPhoneCodeRequest userServiceResendPhoneCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceResendPhoneCodeRequest;

    if (userServiceResendPhoneCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceResendPhoneCodeRequest' when calling resendPhoneCode");
    }

    String localVarPath = "/zitadel.user.v2.UserService/ResendPhoneCode";

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
   * RetrieveIdentityProviderIntent
   * Retrieve the information returned by the identity provider   Retrieve the information returned by the identity provider for registration or updating an existing user with new information..
   * @param userServiceRetrieveIdentityProviderIntentRequest  (required)
   * @return UserServiceRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceRetrieveIdentityProviderIntentResponse retrieveIdentityProviderIntent(UserServiceRetrieveIdentityProviderIntentRequest userServiceRetrieveIdentityProviderIntentRequest) throws ApiException {
    return this.retrieveIdentityProviderIntent(userServiceRetrieveIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * RetrieveIdentityProviderIntent
   * Retrieve the information returned by the identity provider   Retrieve the information returned by the identity provider for registration or updating an existing user with new information..
   * @param userServiceRetrieveIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceRetrieveIdentityProviderIntentResponse retrieveIdentityProviderIntent(UserServiceRetrieveIdentityProviderIntentRequest userServiceRetrieveIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceRetrieveIdentityProviderIntentRequest;

    if (userServiceRetrieveIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceRetrieveIdentityProviderIntentRequest' when calling retrieveIdentityProviderIntent");
    }

    String localVarPath = "/zitadel.user.v2.UserService/RetrieveIdentityProviderIntent";

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
   * SendEmailCode
   * Send code to verify user email
   * @param userServiceSendEmailCodeRequest  (required)
   * @return UserServiceSendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSendEmailCodeResponse sendEmailCode(UserServiceSendEmailCodeRequest userServiceSendEmailCodeRequest) throws ApiException {
    return this.sendEmailCode(userServiceSendEmailCodeRequest, Collections.emptyMap());
  }


  /**
   * SendEmailCode
   * Send code to verify user email
   * @param userServiceSendEmailCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceSendEmailCodeResponse sendEmailCode(UserServiceSendEmailCodeRequest userServiceSendEmailCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSendEmailCodeRequest;

    if (userServiceSendEmailCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSendEmailCodeRequest' when calling sendEmailCode");
    }

    String localVarPath = "/zitadel.user.v2.UserService/SendEmailCode";

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
   * SetEmail
   * Change the user email   Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email..
   * @param userServiceSetEmailRequest  (required)
   * @return UserServiceSetEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetEmailResponse setEmail(UserServiceSetEmailRequest userServiceSetEmailRequest) throws ApiException {
    return this.setEmail(userServiceSetEmailRequest, Collections.emptyMap());
  }


  /**
   * SetEmail
   * Change the user email   Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email..
   * @param userServiceSetEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSetEmailResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceSetEmailResponse setEmail(UserServiceSetEmailRequest userServiceSetEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetEmailRequest;

    if (userServiceSetEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetEmailRequest' when calling setEmail");
    }

    String localVarPath = "/zitadel.user.v2.UserService/SetEmail";

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
   * SetPassword
   * Change password   Change the password of a user with either a verification code or the current password..
   * @param userServiceSetPasswordRequest  (required)
   * @return UserServiceSetPasswordResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetPasswordResponse setPassword(UserServiceSetPasswordRequest userServiceSetPasswordRequest) throws ApiException {
    return this.setPassword(userServiceSetPasswordRequest, Collections.emptyMap());
  }


  /**
   * SetPassword
   * Change password   Change the password of a user with either a verification code or the current password..
   * @param userServiceSetPasswordRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSetPasswordResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceSetPasswordResponse setPassword(UserServiceSetPasswordRequest userServiceSetPasswordRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetPasswordRequest;

    if (userServiceSetPasswordRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetPasswordRequest' when calling setPassword");
    }

    String localVarPath = "/zitadel.user.v2.UserService/SetPassword";

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
   * SetPhone
   * Set the user phone   Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms..
   * @param userServiceSetPhoneRequest  (required)
   * @return UserServiceSetPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetPhoneResponse setPhone(UserServiceSetPhoneRequest userServiceSetPhoneRequest) throws ApiException {
    return this.setPhone(userServiceSetPhoneRequest, Collections.emptyMap());
  }


  /**
   * SetPhone
   * Set the user phone   Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms..
   * @param userServiceSetPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSetPhoneResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceSetPhoneResponse setPhone(UserServiceSetPhoneRequest userServiceSetPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetPhoneRequest;

    if (userServiceSetPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetPhoneRequest' when calling setPhone");
    }

    String localVarPath = "/zitadel.user.v2.UserService/SetPhone";

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
   * SetUserMetadata
   * Set User Metadata   Sets a list of key value pairs. Existing metadata entries with matching keys are overwritten. Existing metadata entries without matching keys are untouched. To remove metadata entries, use [DeleteUserMetadata](apis/resources/user_service_v2/user-service-delete-user-metadata.api.mdx). For HTTP requests, make sure the bytes array value is base64 encoded.   Required permission:   - &#x60;user.write&#x60;
   * @param userServiceSetUserMetadataRequest  (required)
   * @return UserServiceSetUserMetadataResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceSetUserMetadataResponse setUserMetadata(UserServiceSetUserMetadataRequest userServiceSetUserMetadataRequest) throws ApiException {
    return this.setUserMetadata(userServiceSetUserMetadataRequest, Collections.emptyMap());
  }


  /**
   * SetUserMetadata
   * Set User Metadata   Sets a list of key value pairs. Existing metadata entries with matching keys are overwritten. Existing metadata entries without matching keys are untouched. To remove metadata entries, use [DeleteUserMetadata](apis/resources/user_service_v2/user-service-delete-user-metadata.api.mdx). For HTTP requests, make sure the bytes array value is base64 encoded.   Required permission:   - &#x60;user.write&#x60;
   * @param userServiceSetUserMetadataRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceSetUserMetadataResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceSetUserMetadataResponse setUserMetadata(UserServiceSetUserMetadataRequest userServiceSetUserMetadataRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceSetUserMetadataRequest;

    if (userServiceSetUserMetadataRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceSetUserMetadataRequest' when calling setUserMetadata");
    }

    String localVarPath = "/zitadel.user.v2.UserService/SetUserMetadata";

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

    TypeReference<UserServiceSetUserMetadataResponse> localVarReturnType = new TypeReference<UserServiceSetUserMetadataResponse>() {};
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
   * StartIdentityProviderIntent
   * Start flow with an identity provider   Start a flow with an identity provider, for external login, registration or linking..
   * @param userServiceStartIdentityProviderIntentRequest  (required)
   * @return UserServiceStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceStartIdentityProviderIntentResponse startIdentityProviderIntent(UserServiceStartIdentityProviderIntentRequest userServiceStartIdentityProviderIntentRequest) throws ApiException {
    return this.startIdentityProviderIntent(userServiceStartIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * StartIdentityProviderIntent
   * Start flow with an identity provider   Start a flow with an identity provider, for external login, registration or linking..
   * @param userServiceStartIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceStartIdentityProviderIntentResponse startIdentityProviderIntent(UserServiceStartIdentityProviderIntentRequest userServiceStartIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceStartIdentityProviderIntentRequest;

    if (userServiceStartIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceStartIdentityProviderIntentRequest' when calling startIdentityProviderIntent");
    }

    String localVarPath = "/zitadel.user.v2.UserService/StartIdentityProviderIntent";

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
   * UnlockUser
   * Unlock user   The state of the user will be changed to &#39;active&#39;. The user will be able to log in again. The endpoint returns an error if the user is not in the state &#39;locked&#39;.
   * @param userServiceUnlockUserRequest  (required)
   * @return UserServiceUnlockUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceUnlockUserResponse unlockUser(UserServiceUnlockUserRequest userServiceUnlockUserRequest) throws ApiException {
    return this.unlockUser(userServiceUnlockUserRequest, Collections.emptyMap());
  }


  /**
   * UnlockUser
   * Unlock user   The state of the user will be changed to &#39;active&#39;. The user will be able to log in again. The endpoint returns an error if the user is not in the state &#39;locked&#39;.
   * @param userServiceUnlockUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceUnlockUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceUnlockUserResponse unlockUser(UserServiceUnlockUserRequest userServiceUnlockUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceUnlockUserRequest;

    if (userServiceUnlockUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceUnlockUserRequest' when calling unlockUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/UnlockUser";

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
   * UpdateHumanUser
   * Update Human User   Update all information from a user..
   * @param userServiceUpdateHumanUserRequest  (required)
   * @return UserServiceUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceUpdateHumanUserResponse updateHumanUser(UserServiceUpdateHumanUserRequest userServiceUpdateHumanUserRequest) throws ApiException {
    return this.updateHumanUser(userServiceUpdateHumanUserRequest, Collections.emptyMap());
  }


  /**
   * UpdateHumanUser
   * Update Human User   Update all information from a user..
   * @param userServiceUpdateHumanUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceUpdateHumanUserResponse updateHumanUser(UserServiceUpdateHumanUserRequest userServiceUpdateHumanUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceUpdateHumanUserRequest;

    if (userServiceUpdateHumanUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceUpdateHumanUserRequest' when calling updateHumanUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/UpdateHumanUser";

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
   * UpdateUser
   * Update a User   Partially update an existing user.  If you change the users email or phone, you can specify how the ownership should be verified.  If you change the users password, you can specify if the password should be changed again on the users next login.   Required permission:    - user.write
   * @param userServiceUpdateUserRequest  (required)
   * @return UserServiceUpdateUserResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceUpdateUserResponse updateUser(UserServiceUpdateUserRequest userServiceUpdateUserRequest) throws ApiException {
    return this.updateUser(userServiceUpdateUserRequest, Collections.emptyMap());
  }


  /**
   * UpdateUser
   * Update a User   Partially update an existing user.  If you change the users email or phone, you can specify how the ownership should be verified.  If you change the users password, you can specify if the password should be changed again on the users next login.   Required permission:    - user.write
   * @param userServiceUpdateUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceUpdateUserResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceUpdateUserResponse updateUser(UserServiceUpdateUserRequest userServiceUpdateUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceUpdateUserRequest;

    if (userServiceUpdateUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceUpdateUserRequest' when calling updateUser");
    }

    String localVarPath = "/zitadel.user.v2.UserService/UpdateUser";

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

    TypeReference<UserServiceUpdateUserResponse> localVarReturnType = new TypeReference<UserServiceUpdateUserResponse>() {};
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
   * VerifyEmail
   * Verify the email   Verify the email with the generated code.
   * @param userServiceVerifyEmailRequest  (required)
   * @return UserServiceVerifyEmailResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyEmailResponse verifyEmail(UserServiceVerifyEmailRequest userServiceVerifyEmailRequest) throws ApiException {
    return this.verifyEmail(userServiceVerifyEmailRequest, Collections.emptyMap());
  }


  /**
   * VerifyEmail
   * Verify the email   Verify the email with the generated code.
   * @param userServiceVerifyEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyEmailResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceVerifyEmailResponse verifyEmail(UserServiceVerifyEmailRequest userServiceVerifyEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyEmailRequest;

    if (userServiceVerifyEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyEmailRequest' when calling verifyEmail");
    }

    String localVarPath = "/zitadel.user.v2.UserService/VerifyEmail";

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
   * VerifyInviteCode
   * Verify an invite code for a user   Verify the invite code of a user previously issued. This will set their email to a verified state and  allow the user to set up their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.
   * @param userServiceVerifyInviteCodeRequest  (required)
   * @return UserServiceVerifyInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyInviteCodeResponse verifyInviteCode(UserServiceVerifyInviteCodeRequest userServiceVerifyInviteCodeRequest) throws ApiException {
    return this.verifyInviteCode(userServiceVerifyInviteCodeRequest, Collections.emptyMap());
  }


  /**
   * VerifyInviteCode
   * Verify an invite code for a user   Verify the invite code of a user previously issued. This will set their email to a verified state and  allow the user to set up their first authentication method (password, passkeys, IdP) depending on the organization&#39;s available methods.
   * @param userServiceVerifyInviteCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyInviteCodeResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceVerifyInviteCodeResponse verifyInviteCode(UserServiceVerifyInviteCodeRequest userServiceVerifyInviteCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyInviteCodeRequest;

    if (userServiceVerifyInviteCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyInviteCodeRequest' when calling verifyInviteCode");
    }

    String localVarPath = "/zitadel.user.v2.UserService/VerifyInviteCode";

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
   * VerifyPasskeyRegistration
   * Verify a passkey for a user   Verify the passkey registration with the public key credential..
   * @param userServiceVerifyPasskeyRegistrationRequest  (required)
   * @return UserServiceVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyPasskeyRegistrationResponse verifyPasskeyRegistration(UserServiceVerifyPasskeyRegistrationRequest userServiceVerifyPasskeyRegistrationRequest) throws ApiException {
    return this.verifyPasskeyRegistration(userServiceVerifyPasskeyRegistrationRequest, Collections.emptyMap());
  }


  /**
   * VerifyPasskeyRegistration
   * Verify a passkey for a user   Verify the passkey registration with the public key credential..
   * @param userServiceVerifyPasskeyRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceVerifyPasskeyRegistrationResponse verifyPasskeyRegistration(UserServiceVerifyPasskeyRegistrationRequest userServiceVerifyPasskeyRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyPasskeyRegistrationRequest;

    if (userServiceVerifyPasskeyRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyPasskeyRegistrationRequest' when calling verifyPasskeyRegistration");
    }

    String localVarPath = "/zitadel.user.v2.UserService/VerifyPasskeyRegistration";

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
   * VerifyPhone
   * Verify the phone   Verify the phone with the generated code..
   * @param userServiceVerifyPhoneRequest  (required)
   * @return UserServiceVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyPhoneResponse verifyPhone(UserServiceVerifyPhoneRequest userServiceVerifyPhoneRequest) throws ApiException {
    return this.verifyPhone(userServiceVerifyPhoneRequest, Collections.emptyMap());
  }


  /**
   * VerifyPhone
   * Verify the phone   Verify the phone with the generated code..
   * @param userServiceVerifyPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceVerifyPhoneResponse verifyPhone(UserServiceVerifyPhoneRequest userServiceVerifyPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyPhoneRequest;

    if (userServiceVerifyPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyPhoneRequest' when calling verifyPhone");
    }

    String localVarPath = "/zitadel.user.v2.UserService/VerifyPhone";

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
   * VerifyTOTPRegistration
   * Verify a TOTP generator for a user   Verify the TOTP registration with a generated code..
   * @param userServiceVerifyTOTPRegistrationRequest  (required)
   * @return UserServiceVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyTOTPRegistrationResponse verifyTOTPRegistration(UserServiceVerifyTOTPRegistrationRequest userServiceVerifyTOTPRegistrationRequest) throws ApiException {
    return this.verifyTOTPRegistration(userServiceVerifyTOTPRegistrationRequest, Collections.emptyMap());
  }


  /**
   * VerifyTOTPRegistration
   * Verify a TOTP generator for a user   Verify the TOTP registration with a generated code..
   * @param userServiceVerifyTOTPRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceVerifyTOTPRegistrationResponse verifyTOTPRegistration(UserServiceVerifyTOTPRegistrationRequest userServiceVerifyTOTPRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyTOTPRegistrationRequest;

    if (userServiceVerifyTOTPRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyTOTPRegistrationRequest' when calling verifyTOTPRegistration");
    }

    String localVarPath = "/zitadel.user.v2.UserService/VerifyTOTPRegistration";

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
   * VerifyU2FRegistration
   * Verify a u2f token for a user   Verify the u2f token registration with the public key credential..
   * @param userServiceVerifyU2FRegistrationRequest  (required)
   * @return UserServiceVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public UserServiceVerifyU2FRegistrationResponse verifyU2FRegistration(UserServiceVerifyU2FRegistrationRequest userServiceVerifyU2FRegistrationRequest) throws ApiException {
    return this.verifyU2FRegistration(userServiceVerifyU2FRegistrationRequest, Collections.emptyMap());
  }


  /**
   * VerifyU2FRegistration
   * Verify a u2f token for a user   Verify the u2f token registration with the public key credential..
   * @param userServiceVerifyU2FRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return UserServiceVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  private UserServiceVerifyU2FRegistrationResponse verifyU2FRegistration(UserServiceVerifyU2FRegistrationRequest userServiceVerifyU2FRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userServiceVerifyU2FRegistrationRequest;

    if (userServiceVerifyU2FRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userServiceVerifyU2FRegistrationRequest' when calling verifyU2FRegistration");
    }

    String localVarPath = "/zitadel.user.v2.UserService/VerifyU2FRegistration";

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
