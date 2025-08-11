package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaUserServiceAddHumanUserRequest;
import com.zitadel.model.BetaUserServiceAddHumanUserResponse;
import com.zitadel.model.BetaUserServiceAddIDPLinkRequest;
import com.zitadel.model.BetaUserServiceAddIDPLinkResponse;
import com.zitadel.model.BetaUserServiceAddOTPEmailRequest;
import com.zitadel.model.BetaUserServiceAddOTPEmailResponse;
import com.zitadel.model.BetaUserServiceAddOTPSMSRequest;
import com.zitadel.model.BetaUserServiceAddOTPSMSResponse;
import com.zitadel.model.BetaUserServiceConnectError;
import com.zitadel.model.BetaUserServiceCreatePasskeyRegistrationLinkRequest;
import com.zitadel.model.BetaUserServiceCreatePasskeyRegistrationLinkResponse;
import com.zitadel.model.BetaUserServiceDeactivateUserRequest;
import com.zitadel.model.BetaUserServiceDeactivateUserResponse;
import com.zitadel.model.BetaUserServiceDeleteUserRequest;
import com.zitadel.model.BetaUserServiceDeleteUserResponse;
import com.zitadel.model.BetaUserServiceGetUserByIDRequest;
import com.zitadel.model.BetaUserServiceGetUserByIDResponse;
import com.zitadel.model.BetaUserServiceListAuthenticationMethodTypesRequest;
import com.zitadel.model.BetaUserServiceListAuthenticationMethodTypesResponse;
import com.zitadel.model.BetaUserServiceListUsersRequest;
import com.zitadel.model.BetaUserServiceListUsersResponse;
import com.zitadel.model.BetaUserServiceLockUserRequest;
import com.zitadel.model.BetaUserServiceLockUserResponse;
import com.zitadel.model.BetaUserServicePasswordResetRequest;
import com.zitadel.model.BetaUserServicePasswordResetResponse;
import com.zitadel.model.BetaUserServiceReactivateUserRequest;
import com.zitadel.model.BetaUserServiceReactivateUserResponse;
import com.zitadel.model.BetaUserServiceRegisterPasskeyRequest;
import com.zitadel.model.BetaUserServiceRegisterPasskeyResponse;
import com.zitadel.model.BetaUserServiceRegisterTOTPRequest;
import com.zitadel.model.BetaUserServiceRegisterTOTPResponse;
import com.zitadel.model.BetaUserServiceRegisterU2FRequest;
import com.zitadel.model.BetaUserServiceRegisterU2FResponse;
import com.zitadel.model.BetaUserServiceRemoveOTPEmailRequest;
import com.zitadel.model.BetaUserServiceRemoveOTPEmailResponse;
import com.zitadel.model.BetaUserServiceRemoveOTPSMSRequest;
import com.zitadel.model.BetaUserServiceRemoveOTPSMSResponse;
import com.zitadel.model.BetaUserServiceRemovePhoneRequest;
import com.zitadel.model.BetaUserServiceRemovePhoneResponse;
import com.zitadel.model.BetaUserServiceRemoveTOTPRequest;
import com.zitadel.model.BetaUserServiceRemoveTOTPResponse;
import com.zitadel.model.BetaUserServiceResendEmailCodeRequest;
import com.zitadel.model.BetaUserServiceResendEmailCodeResponse;
import com.zitadel.model.BetaUserServiceResendPhoneCodeRequest;
import com.zitadel.model.BetaUserServiceResendPhoneCodeResponse;
import com.zitadel.model.BetaUserServiceRetrieveIdentityProviderIntentRequest;
import com.zitadel.model.BetaUserServiceRetrieveIdentityProviderIntentResponse;
import com.zitadel.model.BetaUserServiceSetEmailRequest;
import com.zitadel.model.BetaUserServiceSetEmailResponse;
import com.zitadel.model.BetaUserServiceSetPasswordRequest;
import com.zitadel.model.BetaUserServiceSetPasswordResponse;
import com.zitadel.model.BetaUserServiceSetPhoneRequest;
import com.zitadel.model.BetaUserServiceSetPhoneResponse;
import com.zitadel.model.BetaUserServiceStartIdentityProviderIntentRequest;
import com.zitadel.model.BetaUserServiceStartIdentityProviderIntentResponse;
import com.zitadel.model.BetaUserServiceUnlockUserRequest;
import com.zitadel.model.BetaUserServiceUnlockUserResponse;
import com.zitadel.model.BetaUserServiceUpdateHumanUserRequest;
import com.zitadel.model.BetaUserServiceUpdateHumanUserResponse;
import com.zitadel.model.BetaUserServiceVerifyEmailRequest;
import com.zitadel.model.BetaUserServiceVerifyEmailResponse;
import com.zitadel.model.BetaUserServiceVerifyPasskeyRegistrationRequest;
import com.zitadel.model.BetaUserServiceVerifyPasskeyRegistrationResponse;
import com.zitadel.model.BetaUserServiceVerifyPhoneRequest;
import com.zitadel.model.BetaUserServiceVerifyPhoneResponse;
import com.zitadel.model.BetaUserServiceVerifyTOTPRegistrationRequest;
import com.zitadel.model.BetaUserServiceVerifyTOTPRegistrationResponse;
import com.zitadel.model.BetaUserServiceVerifyU2FRegistrationRequest;
import com.zitadel.model.BetaUserServiceVerifyU2FRegistrationResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class BetaUserServiceApi extends BaseApi {

  public BetaUserServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaUserServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * AddHumanUser
   * Create a new human user   Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.   Deprecated: please move to the corresponding endpoint under user service v2 (GA)
   * @param betaUserServiceAddHumanUserRequest  (required)
   * @return BetaUserServiceAddHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceAddHumanUserResponse addHumanUser(BetaUserServiceAddHumanUserRequest betaUserServiceAddHumanUserRequest) throws ApiException {
    return this.addHumanUser(betaUserServiceAddHumanUserRequest, Collections.emptyMap());
  }


  /**
   * AddHumanUser
   * Create a new human user   Create/import a new user with the type human. The newly created user will get a verification email if either the email address is not marked as verified and you did not request the verification to be returned.   Deprecated: please move to the corresponding endpoint under user service v2 (GA)
   * @param betaUserServiceAddHumanUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceAddHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceAddHumanUserResponse addHumanUser(BetaUserServiceAddHumanUserRequest betaUserServiceAddHumanUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceAddHumanUserRequest;
    
    if (betaUserServiceAddHumanUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceAddHumanUserRequest' when calling addHumanUser");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/AddHumanUser";

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

    TypeReference<BetaUserServiceAddHumanUserResponse> localVarReturnType = new TypeReference<BetaUserServiceAddHumanUserResponse>() {};
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
   * Add link to an identity provider to an user   Add link to an identity provider to an user.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceAddIDPLinkRequest  (required)
   * @return BetaUserServiceAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceAddIDPLinkResponse addIDPLink(BetaUserServiceAddIDPLinkRequest betaUserServiceAddIDPLinkRequest) throws ApiException {
    return this.addIDPLink(betaUserServiceAddIDPLinkRequest, Collections.emptyMap());
  }


  /**
   * AddIDPLink
   * Add link to an identity provider to an user   Add link to an identity provider to an user.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceAddIDPLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceAddIDPLinkResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceAddIDPLinkResponse addIDPLink(BetaUserServiceAddIDPLinkRequest betaUserServiceAddIDPLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceAddIDPLinkRequest;
    
    if (betaUserServiceAddIDPLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceAddIDPLinkRequest' when calling addIDPLink");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/AddIDPLink";

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

    TypeReference<BetaUserServiceAddIDPLinkResponse> localVarReturnType = new TypeReference<BetaUserServiceAddIDPLinkResponse>() {};
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
   * Add OTP Email for a user   Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceAddOTPEmailRequest  (required)
   * @return BetaUserServiceAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceAddOTPEmailResponse addOTPEmail(BetaUserServiceAddOTPEmailRequest betaUserServiceAddOTPEmailRequest) throws ApiException {
    return this.addOTPEmail(betaUserServiceAddOTPEmailRequest, Collections.emptyMap());
  }


  /**
   * AddOTPEmail
   * Add OTP Email for a user   Add a new One-Time Password (OTP) Email factor to the authenticated user. OTP Email will enable the user to verify a OTP with the latest verified email. The email has to be verified to add the second factor.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceAddOTPEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceAddOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceAddOTPEmailResponse addOTPEmail(BetaUserServiceAddOTPEmailRequest betaUserServiceAddOTPEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceAddOTPEmailRequest;
    
    if (betaUserServiceAddOTPEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceAddOTPEmailRequest' when calling addOTPEmail");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/AddOTPEmail";

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

    TypeReference<BetaUserServiceAddOTPEmailResponse> localVarReturnType = new TypeReference<BetaUserServiceAddOTPEmailResponse>() {};
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
   * Add OTP SMS for a user   Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceAddOTPSMSRequest  (required)
   * @return BetaUserServiceAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceAddOTPSMSResponse addOTPSMS(BetaUserServiceAddOTPSMSRequest betaUserServiceAddOTPSMSRequest) throws ApiException {
    return this.addOTPSMS(betaUserServiceAddOTPSMSRequest, Collections.emptyMap());
  }


  /**
   * AddOTPSMS
   * Add OTP SMS for a user   Add a new One-Time Password (OTP) SMS factor to the authenticated user. OTP SMS will enable the user to verify a OTP with the latest verified phone number. The phone number has to be verified to add the second factor.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceAddOTPSMSRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceAddOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceAddOTPSMSResponse addOTPSMS(BetaUserServiceAddOTPSMSRequest betaUserServiceAddOTPSMSRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceAddOTPSMSRequest;
    
    if (betaUserServiceAddOTPSMSRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceAddOTPSMSRequest' when calling addOTPSMS");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/AddOTPSMS";

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

    TypeReference<BetaUserServiceAddOTPSMSResponse> localVarReturnType = new TypeReference<BetaUserServiceAddOTPSMSResponse>() {};
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
   * Create a passkey registration link for a user   Create a passkey registration link which includes a code and either return it or send it to the user.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @return BetaUserServiceCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceCreatePasskeyRegistrationLinkResponse createPasskeyRegistrationLink(BetaUserServiceCreatePasskeyRegistrationLinkRequest betaUserServiceCreatePasskeyRegistrationLinkRequest) throws ApiException {
    return this.createPasskeyRegistrationLink(betaUserServiceCreatePasskeyRegistrationLinkRequest, Collections.emptyMap());
  }


  /**
   * CreatePasskeyRegistrationLink
   * Create a passkey registration link for a user   Create a passkey registration link which includes a code and either return it or send it to the user.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceCreatePasskeyRegistrationLinkRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceCreatePasskeyRegistrationLinkResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceCreatePasskeyRegistrationLinkResponse createPasskeyRegistrationLink(BetaUserServiceCreatePasskeyRegistrationLinkRequest betaUserServiceCreatePasskeyRegistrationLinkRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceCreatePasskeyRegistrationLinkRequest;
    
    if (betaUserServiceCreatePasskeyRegistrationLinkRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceCreatePasskeyRegistrationLinkRequest' when calling createPasskeyRegistrationLink");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/CreatePasskeyRegistrationLink";

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

    TypeReference<BetaUserServiceCreatePasskeyRegistrationLinkResponse> localVarReturnType = new TypeReference<BetaUserServiceCreatePasskeyRegistrationLinkResponse>() {};
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
   * Deactivate user   The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceDeactivateUserRequest  (required)
   * @return BetaUserServiceDeactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceDeactivateUserResponse deactivateUser(BetaUserServiceDeactivateUserRequest betaUserServiceDeactivateUserRequest) throws ApiException {
    return this.deactivateUser(betaUserServiceDeactivateUserRequest, Collections.emptyMap());
  }


  /**
   * DeactivateUser
   * Deactivate user   The state of the user will be changed to &#39;deactivated&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;deactivated&#39;. Use deactivate user when the user should not be able to use the account anymore, but you still need access to the user data.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceDeactivateUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceDeactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceDeactivateUserResponse deactivateUser(BetaUserServiceDeactivateUserRequest betaUserServiceDeactivateUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceDeactivateUserRequest;
    
    if (betaUserServiceDeactivateUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceDeactivateUserRequest' when calling deactivateUser");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/DeactivateUser";

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

    TypeReference<BetaUserServiceDeactivateUserResponse> localVarReturnType = new TypeReference<BetaUserServiceDeactivateUserResponse>() {};
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
   * Delete user   The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceDeleteUserRequest  (required)
   * @return BetaUserServiceDeleteUserResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceDeleteUserResponse deleteUser(BetaUserServiceDeleteUserRequest betaUserServiceDeleteUserRequest) throws ApiException {
    return this.deleteUser(betaUserServiceDeleteUserRequest, Collections.emptyMap());
  }


  /**
   * DeleteUser
   * Delete user   The state of the user will be changed to &#39;deleted&#39;. The user will not be able to log in anymore. Endpoints requesting this user will return an error &#39;User not found.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceDeleteUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceDeleteUserResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceDeleteUserResponse deleteUser(BetaUserServiceDeleteUserRequest betaUserServiceDeleteUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceDeleteUserRequest;
    
    if (betaUserServiceDeleteUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceDeleteUserRequest' when calling deleteUser");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/DeleteUser";

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

    TypeReference<BetaUserServiceDeleteUserResponse> localVarReturnType = new TypeReference<BetaUserServiceDeleteUserResponse>() {};
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
   * User by ID   Returns the full user object (human or machine) including the profile, email, etc.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceGetUserByIDRequest  (required)
   * @return BetaUserServiceGetUserByIDResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceGetUserByIDResponse getUserByID(BetaUserServiceGetUserByIDRequest betaUserServiceGetUserByIDRequest) throws ApiException {
    return this.getUserByID(betaUserServiceGetUserByIDRequest, Collections.emptyMap());
  }


  /**
   * GetUserByID
   * User by ID   Returns the full user object (human or machine) including the profile, email, etc.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceGetUserByIDRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceGetUserByIDResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceGetUserByIDResponse getUserByID(BetaUserServiceGetUserByIDRequest betaUserServiceGetUserByIDRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceGetUserByIDRequest;
    
    if (betaUserServiceGetUserByIDRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceGetUserByIDRequest' when calling getUserByID");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/GetUserByID";

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

    TypeReference<BetaUserServiceGetUserByIDResponse> localVarReturnType = new TypeReference<BetaUserServiceGetUserByIDResponse>() {};
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
   * List all possible authentication methods of a user   List all possible authentication methods of a user like password, passwordless, (T)OTP and more.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceListAuthenticationMethodTypesRequest  (required)
   * @return BetaUserServiceListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceListAuthenticationMethodTypesResponse listAuthenticationMethodTypes(BetaUserServiceListAuthenticationMethodTypesRequest betaUserServiceListAuthenticationMethodTypesRequest) throws ApiException {
    return this.listAuthenticationMethodTypes(betaUserServiceListAuthenticationMethodTypesRequest, Collections.emptyMap());
  }


  /**
   * ListAuthenticationMethodTypes
   * List all possible authentication methods of a user   List all possible authentication methods of a user like password, passwordless, (T)OTP and more.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceListAuthenticationMethodTypesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceListAuthenticationMethodTypesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceListAuthenticationMethodTypesResponse listAuthenticationMethodTypes(BetaUserServiceListAuthenticationMethodTypesRequest betaUserServiceListAuthenticationMethodTypesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceListAuthenticationMethodTypesRequest;
    
    if (betaUserServiceListAuthenticationMethodTypesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceListAuthenticationMethodTypesRequest' when calling listAuthenticationMethodTypes");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/ListAuthenticationMethodTypes";

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

    TypeReference<BetaUserServiceListAuthenticationMethodTypesResponse> localVarReturnType = new TypeReference<BetaUserServiceListAuthenticationMethodTypesResponse>() {};
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
   * Search Users   Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceListUsersRequest  (required)
   * @return BetaUserServiceListUsersResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceListUsersResponse listUsers(BetaUserServiceListUsersRequest betaUserServiceListUsersRequest) throws ApiException {
    return this.listUsers(betaUserServiceListUsersRequest, Collections.emptyMap());
  }


  /**
   * ListUsers
   * Search Users   Search for users. By default, we will return all users of your instance that you have permission to read. Make sure to include a limit and sorting for pagination.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceListUsersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceListUsersResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceListUsersResponse listUsers(BetaUserServiceListUsersRequest betaUserServiceListUsersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceListUsersRequest;
    
    if (betaUserServiceListUsersRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceListUsersRequest' when calling listUsers");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/ListUsers";

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

    TypeReference<BetaUserServiceListUsersResponse> localVarReturnType = new TypeReference<BetaUserServiceListUsersResponse>() {};
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
   * Lock user   The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceLockUserRequest  (required)
   * @return BetaUserServiceLockUserResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceLockUserResponse lockUser(BetaUserServiceLockUserRequest betaUserServiceLockUserRequest) throws ApiException {
    return this.lockUser(betaUserServiceLockUserRequest, Collections.emptyMap());
  }


  /**
   * LockUser
   * Lock user   The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceLockUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceLockUserResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceLockUserResponse lockUser(BetaUserServiceLockUserRequest betaUserServiceLockUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceLockUserRequest;
    
    if (betaUserServiceLockUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceLockUserRequest' when calling lockUser");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/LockUser";

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

    TypeReference<BetaUserServiceLockUserResponse> localVarReturnType = new TypeReference<BetaUserServiceLockUserResponse>() {};
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
   * Request a code to reset a password   Request a code to reset a password.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServicePasswordResetRequest  (required)
   * @return BetaUserServicePasswordResetResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServicePasswordResetResponse passwordReset(BetaUserServicePasswordResetRequest betaUserServicePasswordResetRequest) throws ApiException {
    return this.passwordReset(betaUserServicePasswordResetRequest, Collections.emptyMap());
  }


  /**
   * PasswordReset
   * Request a code to reset a password   Request a code to reset a password.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServicePasswordResetRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServicePasswordResetResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServicePasswordResetResponse passwordReset(BetaUserServicePasswordResetRequest betaUserServicePasswordResetRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServicePasswordResetRequest;
    
    if (betaUserServicePasswordResetRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServicePasswordResetRequest' when calling passwordReset");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/PasswordReset";

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

    TypeReference<BetaUserServicePasswordResetResponse> localVarReturnType = new TypeReference<BetaUserServicePasswordResetResponse>() {};
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
   * Reactivate user   Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceReactivateUserRequest  (required)
   * @return BetaUserServiceReactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceReactivateUserResponse reactivateUser(BetaUserServiceReactivateUserRequest betaUserServiceReactivateUserRequest) throws ApiException {
    return this.reactivateUser(betaUserServiceReactivateUserRequest, Collections.emptyMap());
  }


  /**
   * ReactivateUser
   * Reactivate user   Reactivate a user with the state &#39;deactivated&#39;. The user will be able to log in again afterward. The endpoint returns an error if the user is not in the state &#39;deactivated&#39;.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceReactivateUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceReactivateUserResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceReactivateUserResponse reactivateUser(BetaUserServiceReactivateUserRequest betaUserServiceReactivateUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceReactivateUserRequest;
    
    if (betaUserServiceReactivateUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceReactivateUserRequest' when calling reactivateUser");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/ReactivateUser";

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

    TypeReference<BetaUserServiceReactivateUserResponse> localVarReturnType = new TypeReference<BetaUserServiceReactivateUserResponse>() {};
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
   * Start the registration of passkey for a user   Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRegisterPasskeyRequest  (required)
   * @return BetaUserServiceRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRegisterPasskeyResponse registerPasskey(BetaUserServiceRegisterPasskeyRequest betaUserServiceRegisterPasskeyRequest) throws ApiException {
    return this.registerPasskey(betaUserServiceRegisterPasskeyRequest, Collections.emptyMap());
  }


  /**
   * RegisterPasskey
   * Start the registration of passkey for a user   Start the registration of a passkey for a user, as a response the public key credential creation options are returned, which are used to verify the passkey.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRegisterPasskeyRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRegisterPasskeyResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRegisterPasskeyResponse registerPasskey(BetaUserServiceRegisterPasskeyRequest betaUserServiceRegisterPasskeyRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRegisterPasskeyRequest;
    
    if (betaUserServiceRegisterPasskeyRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRegisterPasskeyRequest' when calling registerPasskey");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RegisterPasskey";

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

    TypeReference<BetaUserServiceRegisterPasskeyResponse> localVarReturnType = new TypeReference<BetaUserServiceRegisterPasskeyResponse>() {};
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
   * Start the registration of a TOTP generator for a user   Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRegisterTOTPRequest  (required)
   * @return BetaUserServiceRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRegisterTOTPResponse registerTOTP(BetaUserServiceRegisterTOTPRequest betaUserServiceRegisterTOTPRequest) throws ApiException {
    return this.registerTOTP(betaUserServiceRegisterTOTPRequest, Collections.emptyMap());
  }


  /**
   * RegisterTOTP
   * Start the registration of a TOTP generator for a user   Start the registration of a TOTP generator for a user, as a response a secret returned, which is used to initialize a TOTP app or device.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRegisterTOTPRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRegisterTOTPResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRegisterTOTPResponse registerTOTP(BetaUserServiceRegisterTOTPRequest betaUserServiceRegisterTOTPRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRegisterTOTPRequest;
    
    if (betaUserServiceRegisterTOTPRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRegisterTOTPRequest' when calling registerTOTP");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RegisterTOTP";

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

    TypeReference<BetaUserServiceRegisterTOTPResponse> localVarReturnType = new TypeReference<BetaUserServiceRegisterTOTPResponse>() {};
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
   * Start the registration of a u2f token for a user   Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRegisterU2FRequest  (required)
   * @return BetaUserServiceRegisterU2FResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRegisterU2FResponse registerU2F(BetaUserServiceRegisterU2FRequest betaUserServiceRegisterU2FRequest) throws ApiException {
    return this.registerU2F(betaUserServiceRegisterU2FRequest, Collections.emptyMap());
  }


  /**
   * RegisterU2F
   * Start the registration of a u2f token for a user   Start the registration of a u2f token for a user, as a response the public key credential creation options are returned, which are used to verify the u2f token.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRegisterU2FRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRegisterU2FResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRegisterU2FResponse registerU2F(BetaUserServiceRegisterU2FRequest betaUserServiceRegisterU2FRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRegisterU2FRequest;
    
    if (betaUserServiceRegisterU2FRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRegisterU2FRequest' when calling registerU2F");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RegisterU2F";

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

    TypeReference<BetaUserServiceRegisterU2FResponse> localVarReturnType = new TypeReference<BetaUserServiceRegisterU2FResponse>() {};
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
   * Remove One-Time Password (OTP) Email from a user   Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemoveOTPEmailRequest  (required)
   * @return BetaUserServiceRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRemoveOTPEmailResponse removeOTPEmail(BetaUserServiceRemoveOTPEmailRequest betaUserServiceRemoveOTPEmailRequest) throws ApiException {
    return this.removeOTPEmail(betaUserServiceRemoveOTPEmailRequest, Collections.emptyMap());
  }


  /**
   * RemoveOTPEmail
   * Remove One-Time Password (OTP) Email from a user   Remove the configured One-Time Password (OTP) Email factor of a user. As only one OTP Email per user is allowed, the user will not have OTP Email as a second factor afterward.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemoveOTPEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRemoveOTPEmailResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRemoveOTPEmailResponse removeOTPEmail(BetaUserServiceRemoveOTPEmailRequest betaUserServiceRemoveOTPEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRemoveOTPEmailRequest;
    
    if (betaUserServiceRemoveOTPEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRemoveOTPEmailRequest' when calling removeOTPEmail");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RemoveOTPEmail";

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

    TypeReference<BetaUserServiceRemoveOTPEmailResponse> localVarReturnType = new TypeReference<BetaUserServiceRemoveOTPEmailResponse>() {};
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
   * Remove One-Time Password (OTP) SMS from a user   Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemoveOTPSMSRequest  (required)
   * @return BetaUserServiceRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRemoveOTPSMSResponse removeOTPSMS(BetaUserServiceRemoveOTPSMSRequest betaUserServiceRemoveOTPSMSRequest) throws ApiException {
    return this.removeOTPSMS(betaUserServiceRemoveOTPSMSRequest, Collections.emptyMap());
  }


  /**
   * RemoveOTPSMS
   * Remove One-Time Password (OTP) SMS from a user   Remove the configured One-Time Password (OTP) SMS factor of a user. As only one OTP SMS per user is allowed, the user will not have OTP SMS as a second factor afterward.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemoveOTPSMSRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRemoveOTPSMSResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRemoveOTPSMSResponse removeOTPSMS(BetaUserServiceRemoveOTPSMSRequest betaUserServiceRemoveOTPSMSRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRemoveOTPSMSRequest;
    
    if (betaUserServiceRemoveOTPSMSRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRemoveOTPSMSRequest' when calling removeOTPSMS");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RemoveOTPSMS";

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

    TypeReference<BetaUserServiceRemoveOTPSMSResponse> localVarReturnType = new TypeReference<BetaUserServiceRemoveOTPSMSResponse>() {};
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
   * Remove the user phone   Remove the user phone   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemovePhoneRequest  (required)
   * @return BetaUserServiceRemovePhoneResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRemovePhoneResponse removePhone(BetaUserServiceRemovePhoneRequest betaUserServiceRemovePhoneRequest) throws ApiException {
    return this.removePhone(betaUserServiceRemovePhoneRequest, Collections.emptyMap());
  }


  /**
   * RemovePhone
   * Remove the user phone   Remove the user phone   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemovePhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRemovePhoneResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRemovePhoneResponse removePhone(BetaUserServiceRemovePhoneRequest betaUserServiceRemovePhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRemovePhoneRequest;
    
    if (betaUserServiceRemovePhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRemovePhoneRequest' when calling removePhone");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RemovePhone";

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

    TypeReference<BetaUserServiceRemovePhoneResponse> localVarReturnType = new TypeReference<BetaUserServiceRemovePhoneResponse>() {};
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
   * Remove TOTP generator from a user   Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemoveTOTPRequest  (required)
   * @return BetaUserServiceRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRemoveTOTPResponse removeTOTP(BetaUserServiceRemoveTOTPRequest betaUserServiceRemoveTOTPRequest) throws ApiException {
    return this.removeTOTP(betaUserServiceRemoveTOTPRequest, Collections.emptyMap());
  }


  /**
   * RemoveTOTP
   * Remove TOTP generator from a user   Remove the configured TOTP generator of a user. As only one TOTP generator per user is allowed, the user will not have TOTP as a second factor afterward.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRemoveTOTPRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRemoveTOTPResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRemoveTOTPResponse removeTOTP(BetaUserServiceRemoveTOTPRequest betaUserServiceRemoveTOTPRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRemoveTOTPRequest;
    
    if (betaUserServiceRemoveTOTPRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRemoveTOTPRequest' when calling removeTOTP");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RemoveTOTP";

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

    TypeReference<BetaUserServiceRemoveTOTPResponse> localVarReturnType = new TypeReference<BetaUserServiceRemoveTOTPResponse>() {};
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
   * Resend code to verify user email   Resend code to verify user email   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceResendEmailCodeRequest  (required)
   * @return BetaUserServiceResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceResendEmailCodeResponse resendEmailCode(BetaUserServiceResendEmailCodeRequest betaUserServiceResendEmailCodeRequest) throws ApiException {
    return this.resendEmailCode(betaUserServiceResendEmailCodeRequest, Collections.emptyMap());
  }


  /**
   * ResendEmailCode
   * Resend code to verify user email   Resend code to verify user email   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceResendEmailCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceResendEmailCodeResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceResendEmailCodeResponse resendEmailCode(BetaUserServiceResendEmailCodeRequest betaUserServiceResendEmailCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceResendEmailCodeRequest;
    
    if (betaUserServiceResendEmailCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceResendEmailCodeRequest' when calling resendEmailCode");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/ResendEmailCode";

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

    TypeReference<BetaUserServiceResendEmailCodeResponse> localVarReturnType = new TypeReference<BetaUserServiceResendEmailCodeResponse>() {};
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
   * Resend code to verify user phone   Resend code to verify user phone   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceResendPhoneCodeRequest  (required)
   * @return BetaUserServiceResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceResendPhoneCodeResponse resendPhoneCode(BetaUserServiceResendPhoneCodeRequest betaUserServiceResendPhoneCodeRequest) throws ApiException {
    return this.resendPhoneCode(betaUserServiceResendPhoneCodeRequest, Collections.emptyMap());
  }


  /**
   * ResendPhoneCode
   * Resend code to verify user phone   Resend code to verify user phone   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceResendPhoneCodeRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceResendPhoneCodeResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceResendPhoneCodeResponse resendPhoneCode(BetaUserServiceResendPhoneCodeRequest betaUserServiceResendPhoneCodeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceResendPhoneCodeRequest;
    
    if (betaUserServiceResendPhoneCodeRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceResendPhoneCodeRequest' when calling resendPhoneCode");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/ResendPhoneCode";

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

    TypeReference<BetaUserServiceResendPhoneCodeResponse> localVarReturnType = new TypeReference<BetaUserServiceResendPhoneCodeResponse>() {};
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
   * Retrieve the information returned by the identity provider   Retrieve the information returned by the identity provider for registration or updating an existing user with new information.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRetrieveIdentityProviderIntentRequest  (required)
   * @return BetaUserServiceRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceRetrieveIdentityProviderIntentResponse retrieveIdentityProviderIntent(BetaUserServiceRetrieveIdentityProviderIntentRequest betaUserServiceRetrieveIdentityProviderIntentRequest) throws ApiException {
    return this.retrieveIdentityProviderIntent(betaUserServiceRetrieveIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * RetrieveIdentityProviderIntent
   * Retrieve the information returned by the identity provider   Retrieve the information returned by the identity provider for registration or updating an existing user with new information.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceRetrieveIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceRetrieveIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceRetrieveIdentityProviderIntentResponse retrieveIdentityProviderIntent(BetaUserServiceRetrieveIdentityProviderIntentRequest betaUserServiceRetrieveIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceRetrieveIdentityProviderIntentRequest;
    
    if (betaUserServiceRetrieveIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceRetrieveIdentityProviderIntentRequest' when calling retrieveIdentityProviderIntent");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/RetrieveIdentityProviderIntent";

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

    TypeReference<BetaUserServiceRetrieveIdentityProviderIntentResponse> localVarReturnType = new TypeReference<BetaUserServiceRetrieveIdentityProviderIntentResponse>() {};
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
   * Change the user email   Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceSetEmailRequest  (required)
   * @return BetaUserServiceSetEmailResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceSetEmailResponse setEmail(BetaUserServiceSetEmailRequest betaUserServiceSetEmailRequest) throws ApiException {
    return this.setEmail(betaUserServiceSetEmailRequest, Collections.emptyMap());
  }


  /**
   * SetEmail
   * Change the user email   Change the email address of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by email.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceSetEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceSetEmailResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceSetEmailResponse setEmail(BetaUserServiceSetEmailRequest betaUserServiceSetEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceSetEmailRequest;
    
    if (betaUserServiceSetEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceSetEmailRequest' when calling setEmail");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/SetEmail";

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

    TypeReference<BetaUserServiceSetEmailResponse> localVarReturnType = new TypeReference<BetaUserServiceSetEmailResponse>() {};
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
   * Change password   Change the password of a user with either a verification code or the current password.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceSetPasswordRequest  (required)
   * @return BetaUserServiceSetPasswordResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceSetPasswordResponse setPassword(BetaUserServiceSetPasswordRequest betaUserServiceSetPasswordRequest) throws ApiException {
    return this.setPassword(betaUserServiceSetPasswordRequest, Collections.emptyMap());
  }


  /**
   * SetPassword
   * Change password   Change the password of a user with either a verification code or the current password.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceSetPasswordRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceSetPasswordResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceSetPasswordResponse setPassword(BetaUserServiceSetPasswordRequest betaUserServiceSetPasswordRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceSetPasswordRequest;
    
    if (betaUserServiceSetPasswordRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceSetPasswordRequest' when calling setPassword");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/SetPassword";

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

    TypeReference<BetaUserServiceSetPasswordResponse> localVarReturnType = new TypeReference<BetaUserServiceSetPasswordResponse>() {};
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
   * Set the user phone   Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceSetPhoneRequest  (required)
   * @return BetaUserServiceSetPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceSetPhoneResponse setPhone(BetaUserServiceSetPhoneRequest betaUserServiceSetPhoneRequest) throws ApiException {
    return this.setPhone(betaUserServiceSetPhoneRequest, Collections.emptyMap());
  }


  /**
   * SetPhone
   * Set the user phone   Set the phone number of a user. If the state is set to not verified, a verification code will be generated, which can be either returned or sent to the user by sms.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceSetPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceSetPhoneResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceSetPhoneResponse setPhone(BetaUserServiceSetPhoneRequest betaUserServiceSetPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceSetPhoneRequest;
    
    if (betaUserServiceSetPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceSetPhoneRequest' when calling setPhone");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/SetPhone";

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

    TypeReference<BetaUserServiceSetPhoneResponse> localVarReturnType = new TypeReference<BetaUserServiceSetPhoneResponse>() {};
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
   * Start flow with an identity provider   Start a flow with an identity provider, for external login, registration or linking.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceStartIdentityProviderIntentRequest  (required)
   * @return BetaUserServiceStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceStartIdentityProviderIntentResponse startIdentityProviderIntent(BetaUserServiceStartIdentityProviderIntentRequest betaUserServiceStartIdentityProviderIntentRequest) throws ApiException {
    return this.startIdentityProviderIntent(betaUserServiceStartIdentityProviderIntentRequest, Collections.emptyMap());
  }


  /**
   * StartIdentityProviderIntent
   * Start flow with an identity provider   Start a flow with an identity provider, for external login, registration or linking.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceStartIdentityProviderIntentRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceStartIdentityProviderIntentResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceStartIdentityProviderIntentResponse startIdentityProviderIntent(BetaUserServiceStartIdentityProviderIntentRequest betaUserServiceStartIdentityProviderIntentRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceStartIdentityProviderIntentRequest;
    
    if (betaUserServiceStartIdentityProviderIntentRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceStartIdentityProviderIntentRequest' when calling startIdentityProviderIntent");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/StartIdentityProviderIntent";

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

    TypeReference<BetaUserServiceStartIdentityProviderIntentResponse> localVarReturnType = new TypeReference<BetaUserServiceStartIdentityProviderIntentResponse>() {};
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
   * Unlock user   The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceUnlockUserRequest  (required)
   * @return BetaUserServiceUnlockUserResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceUnlockUserResponse unlockUser(BetaUserServiceUnlockUserRequest betaUserServiceUnlockUserRequest) throws ApiException {
    return this.unlockUser(betaUserServiceUnlockUserRequest, Collections.emptyMap());
  }


  /**
   * UnlockUser
   * Unlock user   The state of the user will be changed to &#39;locked&#39;. The user will not be able to log in anymore. The endpoint returns an error if the user is already in the state &#39;locked&#39;. Use this endpoint if the user should not be able to log in temporarily because of an event that happened (wrong password, etc.).   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceUnlockUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceUnlockUserResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceUnlockUserResponse unlockUser(BetaUserServiceUnlockUserRequest betaUserServiceUnlockUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceUnlockUserRequest;
    
    if (betaUserServiceUnlockUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceUnlockUserRequest' when calling unlockUser");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/UnlockUser";

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

    TypeReference<BetaUserServiceUnlockUserResponse> localVarReturnType = new TypeReference<BetaUserServiceUnlockUserResponse>() {};
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
   * Update User   Update all information from a user.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceUpdateHumanUserRequest  (required)
   * @return BetaUserServiceUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceUpdateHumanUserResponse updateHumanUser(BetaUserServiceUpdateHumanUserRequest betaUserServiceUpdateHumanUserRequest) throws ApiException {
    return this.updateHumanUser(betaUserServiceUpdateHumanUserRequest, Collections.emptyMap());
  }


  /**
   * UpdateHumanUser
   * Update User   Update all information from a user.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceUpdateHumanUserRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceUpdateHumanUserResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceUpdateHumanUserResponse updateHumanUser(BetaUserServiceUpdateHumanUserRequest betaUserServiceUpdateHumanUserRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceUpdateHumanUserRequest;
    
    if (betaUserServiceUpdateHumanUserRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceUpdateHumanUserRequest' when calling updateHumanUser");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/UpdateHumanUser";

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

    TypeReference<BetaUserServiceUpdateHumanUserResponse> localVarReturnType = new TypeReference<BetaUserServiceUpdateHumanUserResponse>() {};
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
   * Verify the email   Verify the email with the generated code.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyEmailRequest  (required)
   * @return BetaUserServiceVerifyEmailResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceVerifyEmailResponse verifyEmail(BetaUserServiceVerifyEmailRequest betaUserServiceVerifyEmailRequest) throws ApiException {
    return this.verifyEmail(betaUserServiceVerifyEmailRequest, Collections.emptyMap());
  }


  /**
   * VerifyEmail
   * Verify the email   Verify the email with the generated code.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyEmailRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceVerifyEmailResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceVerifyEmailResponse verifyEmail(BetaUserServiceVerifyEmailRequest betaUserServiceVerifyEmailRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceVerifyEmailRequest;
    
    if (betaUserServiceVerifyEmailRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceVerifyEmailRequest' when calling verifyEmail");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/VerifyEmail";

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

    TypeReference<BetaUserServiceVerifyEmailResponse> localVarReturnType = new TypeReference<BetaUserServiceVerifyEmailResponse>() {};
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
   * Verify a passkey for a user   Verify the passkey registration with the public key credential.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyPasskeyRegistrationRequest  (required)
   * @return BetaUserServiceVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceVerifyPasskeyRegistrationResponse verifyPasskeyRegistration(BetaUserServiceVerifyPasskeyRegistrationRequest betaUserServiceVerifyPasskeyRegistrationRequest) throws ApiException {
    return this.verifyPasskeyRegistration(betaUserServiceVerifyPasskeyRegistrationRequest, Collections.emptyMap());
  }


  /**
   * VerifyPasskeyRegistration
   * Verify a passkey for a user   Verify the passkey registration with the public key credential.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyPasskeyRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceVerifyPasskeyRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceVerifyPasskeyRegistrationResponse verifyPasskeyRegistration(BetaUserServiceVerifyPasskeyRegistrationRequest betaUserServiceVerifyPasskeyRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceVerifyPasskeyRegistrationRequest;
    
    if (betaUserServiceVerifyPasskeyRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceVerifyPasskeyRegistrationRequest' when calling verifyPasskeyRegistration");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/VerifyPasskeyRegistration";

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

    TypeReference<BetaUserServiceVerifyPasskeyRegistrationResponse> localVarReturnType = new TypeReference<BetaUserServiceVerifyPasskeyRegistrationResponse>() {};
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
   * Verify the phone   Verify the phone with the generated code.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyPhoneRequest  (required)
   * @return BetaUserServiceVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceVerifyPhoneResponse verifyPhone(BetaUserServiceVerifyPhoneRequest betaUserServiceVerifyPhoneRequest) throws ApiException {
    return this.verifyPhone(betaUserServiceVerifyPhoneRequest, Collections.emptyMap());
  }


  /**
   * VerifyPhone
   * Verify the phone   Verify the phone with the generated code.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyPhoneRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceVerifyPhoneResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceVerifyPhoneResponse verifyPhone(BetaUserServiceVerifyPhoneRequest betaUserServiceVerifyPhoneRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceVerifyPhoneRequest;
    
    if (betaUserServiceVerifyPhoneRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceVerifyPhoneRequest' when calling verifyPhone");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/VerifyPhone";

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

    TypeReference<BetaUserServiceVerifyPhoneResponse> localVarReturnType = new TypeReference<BetaUserServiceVerifyPhoneResponse>() {};
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
   * Verify a TOTP generator for a user   Verify the TOTP registration with a generated code.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyTOTPRegistrationRequest  (required)
   * @return BetaUserServiceVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceVerifyTOTPRegistrationResponse verifyTOTPRegistration(BetaUserServiceVerifyTOTPRegistrationRequest betaUserServiceVerifyTOTPRegistrationRequest) throws ApiException {
    return this.verifyTOTPRegistration(betaUserServiceVerifyTOTPRegistrationRequest, Collections.emptyMap());
  }


  /**
   * VerifyTOTPRegistration
   * Verify a TOTP generator for a user   Verify the TOTP registration with a generated code.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyTOTPRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceVerifyTOTPRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceVerifyTOTPRegistrationResponse verifyTOTPRegistration(BetaUserServiceVerifyTOTPRegistrationRequest betaUserServiceVerifyTOTPRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceVerifyTOTPRegistrationRequest;
    
    if (betaUserServiceVerifyTOTPRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceVerifyTOTPRegistrationRequest' when calling verifyTOTPRegistration");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/VerifyTOTPRegistration";

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

    TypeReference<BetaUserServiceVerifyTOTPRegistrationResponse> localVarReturnType = new TypeReference<BetaUserServiceVerifyTOTPRegistrationResponse>() {};
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
   * Verify a u2f token for a user   Verify the u2f token registration with the public key credential.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyU2FRegistrationRequest  (required)
   * @return BetaUserServiceVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaUserServiceVerifyU2FRegistrationResponse verifyU2FRegistration(BetaUserServiceVerifyU2FRegistrationRequest betaUserServiceVerifyU2FRegistrationRequest) throws ApiException {
    return this.verifyU2FRegistration(betaUserServiceVerifyU2FRegistrationRequest, Collections.emptyMap());
  }


  /**
   * VerifyU2FRegistration
   * Verify a u2f token for a user   Verify the u2f token registration with the public key credential.   Deprecated: please move to the corresponding endpoint under user service v2 (GA).
   * @param betaUserServiceVerifyU2FRegistrationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaUserServiceVerifyU2FRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaUserServiceVerifyU2FRegistrationResponse verifyU2FRegistration(BetaUserServiceVerifyU2FRegistrationRequest betaUserServiceVerifyU2FRegistrationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaUserServiceVerifyU2FRegistrationRequest;
    
    if (betaUserServiceVerifyU2FRegistrationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaUserServiceVerifyU2FRegistrationRequest' when calling verifyU2FRegistration");
    }
    
    String localVarPath = "/zitadel.user.v2beta.UserService/VerifyU2FRegistration";

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

    TypeReference<BetaUserServiceVerifyU2FRegistrationResponse> localVarReturnType = new TypeReference<BetaUserServiceVerifyU2FRegistrationResponse>() {};
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
