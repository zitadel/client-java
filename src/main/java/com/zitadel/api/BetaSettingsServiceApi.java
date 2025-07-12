package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zitadel.ApiException;
import com.zitadel.model.*;

import java.util.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class BetaSettingsServiceApi extends BaseApi {

  public BetaSettingsServiceApi() {
      super(ApiClient.defaultApiClient);
  }

  public BetaSettingsServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * GetActiveIdentityProviders
   * Get the current active identity providers
   * @param betaSettingsServiceGetActiveIdentityProvidersRequest  (required)
   * @return BetaSettingsServiceGetActiveIdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetActiveIdentityProvidersResponse getActiveIdentityProviders(BetaSettingsServiceGetActiveIdentityProvidersRequest betaSettingsServiceGetActiveIdentityProvidersRequest) throws ApiException {
    return this.getActiveIdentityProviders(betaSettingsServiceGetActiveIdentityProvidersRequest, Collections.emptyMap());
  }


  /**
   * GetActiveIdentityProviders
   * Get the current active identity providers
   * @param betaSettingsServiceGetActiveIdentityProvidersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetActiveIdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetActiveIdentityProvidersResponse getActiveIdentityProviders(BetaSettingsServiceGetActiveIdentityProvidersRequest betaSettingsServiceGetActiveIdentityProvidersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetActiveIdentityProvidersRequest;

    if (betaSettingsServiceGetActiveIdentityProvidersRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetActiveIdentityProvidersRequest' when calling getActiveIdentityProviders");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetActiveIdentityProviders";

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

    TypeReference<BetaSettingsServiceGetActiveIdentityProvidersResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetActiveIdentityProvidersResponse>() {};
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
   * GetBrandingSettings
   * Get the current active branding settings
   * @param betaSettingsServiceGetBrandingSettingsRequest  (required)
   * @return BetaSettingsServiceGetBrandingSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetBrandingSettingsResponse getBrandingSettings(BetaSettingsServiceGetBrandingSettingsRequest betaSettingsServiceGetBrandingSettingsRequest) throws ApiException {
    return this.getBrandingSettings(betaSettingsServiceGetBrandingSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetBrandingSettings
   * Get the current active branding settings
   * @param betaSettingsServiceGetBrandingSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetBrandingSettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetBrandingSettingsResponse getBrandingSettings(BetaSettingsServiceGetBrandingSettingsRequest betaSettingsServiceGetBrandingSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetBrandingSettingsRequest;

    if (betaSettingsServiceGetBrandingSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetBrandingSettingsRequest' when calling getBrandingSettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetBrandingSettings";

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

    TypeReference<BetaSettingsServiceGetBrandingSettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetBrandingSettingsResponse>() {};
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
   * GetDomainSettings
   * Get the domain settings
   * @param betaSettingsServiceGetDomainSettingsRequest  (required)
   * @return BetaSettingsServiceGetDomainSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetDomainSettingsResponse getDomainSettings(BetaSettingsServiceGetDomainSettingsRequest betaSettingsServiceGetDomainSettingsRequest) throws ApiException {
    return this.getDomainSettings(betaSettingsServiceGetDomainSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetDomainSettings
   * Get the domain settings
   * @param betaSettingsServiceGetDomainSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetDomainSettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetDomainSettingsResponse getDomainSettings(BetaSettingsServiceGetDomainSettingsRequest betaSettingsServiceGetDomainSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetDomainSettingsRequest;

    if (betaSettingsServiceGetDomainSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetDomainSettingsRequest' when calling getDomainSettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetDomainSettings";

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

    TypeReference<BetaSettingsServiceGetDomainSettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetDomainSettingsResponse>() {};
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
              * GetGeneralSettings (Convenience Method)
              * Get basic information over the instance
                * @return BetaSettingsServiceGetGeneralSettingsResponse
              * @throws ApiException if fails to make API call
              */
              public BetaSettingsServiceGetGeneralSettingsResponse getGeneralSettings() throws ApiException {
              return this.getGeneralSettings(new Object());
              }


  /**
   * GetGeneralSettings
   * Get basic information over the instance
   * @param body  (required)
   * @return BetaSettingsServiceGetGeneralSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetGeneralSettingsResponse getGeneralSettings(Object body) throws ApiException {
    return this.getGeneralSettings(body, Collections.emptyMap());
  }


  /**
   * GetGeneralSettings
   * Get basic information over the instance
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetGeneralSettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetGeneralSettingsResponse getGeneralSettings(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;

    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling getGeneralSettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetGeneralSettings";

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

    TypeReference<BetaSettingsServiceGetGeneralSettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetGeneralSettingsResponse>() {};
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
   * GetLegalAndSupportSettings
   * Get the legal and support settings
   * @param betaSettingsServiceGetLegalAndSupportSettingsRequest  (required)
   * @return BetaSettingsServiceGetLegalAndSupportSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetLegalAndSupportSettingsResponse getLegalAndSupportSettings(BetaSettingsServiceGetLegalAndSupportSettingsRequest betaSettingsServiceGetLegalAndSupportSettingsRequest) throws ApiException {
    return this.getLegalAndSupportSettings(betaSettingsServiceGetLegalAndSupportSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetLegalAndSupportSettings
   * Get the legal and support settings
   * @param betaSettingsServiceGetLegalAndSupportSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetLegalAndSupportSettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetLegalAndSupportSettingsResponse getLegalAndSupportSettings(BetaSettingsServiceGetLegalAndSupportSettingsRequest betaSettingsServiceGetLegalAndSupportSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetLegalAndSupportSettingsRequest;

    if (betaSettingsServiceGetLegalAndSupportSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetLegalAndSupportSettingsRequest' when calling getLegalAndSupportSettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetLegalAndSupportSettings";

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

    TypeReference<BetaSettingsServiceGetLegalAndSupportSettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetLegalAndSupportSettingsResponse>() {};
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
   * GetLockoutSettings
   * Get the lockout settings
   * @param betaSettingsServiceGetLockoutSettingsRequest  (required)
   * @return BetaSettingsServiceGetLockoutSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetLockoutSettingsResponse getLockoutSettings(BetaSettingsServiceGetLockoutSettingsRequest betaSettingsServiceGetLockoutSettingsRequest) throws ApiException {
    return this.getLockoutSettings(betaSettingsServiceGetLockoutSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetLockoutSettings
   * Get the lockout settings
   * @param betaSettingsServiceGetLockoutSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetLockoutSettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetLockoutSettingsResponse getLockoutSettings(BetaSettingsServiceGetLockoutSettingsRequest betaSettingsServiceGetLockoutSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetLockoutSettingsRequest;

    if (betaSettingsServiceGetLockoutSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetLockoutSettingsRequest' when calling getLockoutSettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetLockoutSettings";

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

    TypeReference<BetaSettingsServiceGetLockoutSettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetLockoutSettingsResponse>() {};
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
   * GetLoginSettings
   * Get the login settings
   * @param betaSettingsServiceGetLoginSettingsRequest  (required)
   * @return BetaSettingsServiceGetLoginSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetLoginSettingsResponse getLoginSettings(BetaSettingsServiceGetLoginSettingsRequest betaSettingsServiceGetLoginSettingsRequest) throws ApiException {
    return this.getLoginSettings(betaSettingsServiceGetLoginSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetLoginSettings
   * Get the login settings
   * @param betaSettingsServiceGetLoginSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetLoginSettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetLoginSettingsResponse getLoginSettings(BetaSettingsServiceGetLoginSettingsRequest betaSettingsServiceGetLoginSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetLoginSettingsRequest;

    if (betaSettingsServiceGetLoginSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetLoginSettingsRequest' when calling getLoginSettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetLoginSettings";

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

    TypeReference<BetaSettingsServiceGetLoginSettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetLoginSettingsResponse>() {};
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
   * GetPasswordComplexitySettings
   * Get the password complexity settings
   * @param betaSettingsServiceGetPasswordComplexitySettingsRequest  (required)
   * @return BetaSettingsServiceGetPasswordComplexitySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetPasswordComplexitySettingsResponse getPasswordComplexitySettings(BetaSettingsServiceGetPasswordComplexitySettingsRequest betaSettingsServiceGetPasswordComplexitySettingsRequest) throws ApiException {
    return this.getPasswordComplexitySettings(betaSettingsServiceGetPasswordComplexitySettingsRequest, Collections.emptyMap());
  }


  /**
   * GetPasswordComplexitySettings
   * Get the password complexity settings
   * @param betaSettingsServiceGetPasswordComplexitySettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetPasswordComplexitySettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetPasswordComplexitySettingsResponse getPasswordComplexitySettings(BetaSettingsServiceGetPasswordComplexitySettingsRequest betaSettingsServiceGetPasswordComplexitySettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetPasswordComplexitySettingsRequest;

    if (betaSettingsServiceGetPasswordComplexitySettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetPasswordComplexitySettingsRequest' when calling getPasswordComplexitySettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetPasswordComplexitySettings";

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

    TypeReference<BetaSettingsServiceGetPasswordComplexitySettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetPasswordComplexitySettingsResponse>() {};
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
   * GetPasswordExpirySettings
   * Get the password expiry settings
   * @param betaSettingsServiceGetPasswordExpirySettingsRequest  (required)
   * @return BetaSettingsServiceGetPasswordExpirySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetPasswordExpirySettingsResponse getPasswordExpirySettings(BetaSettingsServiceGetPasswordExpirySettingsRequest betaSettingsServiceGetPasswordExpirySettingsRequest) throws ApiException {
    return this.getPasswordExpirySettings(betaSettingsServiceGetPasswordExpirySettingsRequest, Collections.emptyMap());
  }


  /**
   * GetPasswordExpirySettings
   * Get the password expiry settings
   * @param betaSettingsServiceGetPasswordExpirySettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetPasswordExpirySettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetPasswordExpirySettingsResponse getPasswordExpirySettings(BetaSettingsServiceGetPasswordExpirySettingsRequest betaSettingsServiceGetPasswordExpirySettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceGetPasswordExpirySettingsRequest;

    if (betaSettingsServiceGetPasswordExpirySettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceGetPasswordExpirySettingsRequest' when calling getPasswordExpirySettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetPasswordExpirySettings";

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

    TypeReference<BetaSettingsServiceGetPasswordExpirySettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetPasswordExpirySettingsResponse>() {};
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
              * GetSecuritySettings (Convenience Method)
              * Get the security settings
                * @return BetaSettingsServiceGetSecuritySettingsResponse
              * @throws ApiException if fails to make API call
              */
              public BetaSettingsServiceGetSecuritySettingsResponse getSecuritySettings() throws ApiException {
              return this.getSecuritySettings(new Object());
              }


  /**
   * GetSecuritySettings
   * Get the security settings
   * @param body  (required)
   * @return BetaSettingsServiceGetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceGetSecuritySettingsResponse getSecuritySettings(Object body) throws ApiException {
    return this.getSecuritySettings(body, Collections.emptyMap());
  }


  /**
   * GetSecuritySettings
   * Get the security settings
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceGetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceGetSecuritySettingsResponse getSecuritySettings(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;

    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling getSecuritySettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/GetSecuritySettings";

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

    TypeReference<BetaSettingsServiceGetSecuritySettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceGetSecuritySettingsResponse>() {};
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
   * SetSecuritySettings
   * Set the security settings
   * @param betaSettingsServiceSetSecuritySettingsRequest  (required)
   * @return BetaSettingsServiceSetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaSettingsServiceSetSecuritySettingsResponse setSecuritySettings(BetaSettingsServiceSetSecuritySettingsRequest betaSettingsServiceSetSecuritySettingsRequest) throws ApiException {
    return this.setSecuritySettings(betaSettingsServiceSetSecuritySettingsRequest, Collections.emptyMap());
  }


  /**
   * SetSecuritySettings
   * Set the security settings
   * @param betaSettingsServiceSetSecuritySettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaSettingsServiceSetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaSettingsServiceSetSecuritySettingsResponse setSecuritySettings(BetaSettingsServiceSetSecuritySettingsRequest betaSettingsServiceSetSecuritySettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaSettingsServiceSetSecuritySettingsRequest;

    if (betaSettingsServiceSetSecuritySettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaSettingsServiceSetSecuritySettingsRequest' when calling setSecuritySettings");
    }

    String localVarPath = "/zitadel.settings.v2beta.SettingsService/SetSecuritySettings";

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

    TypeReference<BetaSettingsServiceSetSecuritySettingsResponse> localVarReturnType = new TypeReference<BetaSettingsServiceSetSecuritySettingsResponse>() {};
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
