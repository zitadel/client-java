package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.SettingsServiceConnectError;
import com.zitadel.model.SettingsServiceGetActiveIdentityProvidersRequest;
import com.zitadel.model.SettingsServiceGetActiveIdentityProvidersResponse;
import com.zitadel.model.SettingsServiceGetBrandingSettingsRequest;
import com.zitadel.model.SettingsServiceGetBrandingSettingsResponse;
import com.zitadel.model.SettingsServiceGetDomainSettingsRequest;
import com.zitadel.model.SettingsServiceGetDomainSettingsResponse;
import com.zitadel.model.SettingsServiceGetGeneralSettingsResponse;
import com.zitadel.model.SettingsServiceGetLegalAndSupportSettingsRequest;
import com.zitadel.model.SettingsServiceGetLegalAndSupportSettingsResponse;
import com.zitadel.model.SettingsServiceGetLockoutSettingsRequest;
import com.zitadel.model.SettingsServiceGetLockoutSettingsResponse;
import com.zitadel.model.SettingsServiceGetLoginSettingsRequest;
import com.zitadel.model.SettingsServiceGetLoginSettingsResponse;
import com.zitadel.model.SettingsServiceGetPasswordComplexitySettingsRequest;
import com.zitadel.model.SettingsServiceGetPasswordComplexitySettingsResponse;
import com.zitadel.model.SettingsServiceGetPasswordExpirySettingsRequest;
import com.zitadel.model.SettingsServiceGetPasswordExpirySettingsResponse;
import com.zitadel.model.SettingsServiceGetSecuritySettingsResponse;
import com.zitadel.model.SettingsServiceSetSecuritySettingsRequest;
import com.zitadel.model.SettingsServiceSetSecuritySettingsResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class SettingsServiceApi extends BaseApi {

  public SettingsServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public SettingsServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * GetActiveIdentityProviders
   * Get the current active identity providers
   * @param settingsServiceGetActiveIdentityProvidersRequest  (required)
   * @return SettingsServiceGetActiveIdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetActiveIdentityProvidersResponse getActiveIdentityProviders(SettingsServiceGetActiveIdentityProvidersRequest settingsServiceGetActiveIdentityProvidersRequest) throws ApiException {
    return this.getActiveIdentityProviders(settingsServiceGetActiveIdentityProvidersRequest, Collections.emptyMap());
  }


  /**
   * GetActiveIdentityProviders
   * Get the current active identity providers
   * @param settingsServiceGetActiveIdentityProvidersRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetActiveIdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetActiveIdentityProvidersResponse getActiveIdentityProviders(SettingsServiceGetActiveIdentityProvidersRequest settingsServiceGetActiveIdentityProvidersRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetActiveIdentityProvidersRequest;
    
    if (settingsServiceGetActiveIdentityProvidersRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetActiveIdentityProvidersRequest' when calling getActiveIdentityProviders");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetActiveIdentityProviders";

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

    TypeReference<SettingsServiceGetActiveIdentityProvidersResponse> localVarReturnType = new TypeReference<SettingsServiceGetActiveIdentityProvidersResponse>() {};
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
   * @param settingsServiceGetBrandingSettingsRequest  (required)
   * @return SettingsServiceGetBrandingSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetBrandingSettingsResponse getBrandingSettings(SettingsServiceGetBrandingSettingsRequest settingsServiceGetBrandingSettingsRequest) throws ApiException {
    return this.getBrandingSettings(settingsServiceGetBrandingSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetBrandingSettings
   * Get the current active branding settings
   * @param settingsServiceGetBrandingSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetBrandingSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetBrandingSettingsResponse getBrandingSettings(SettingsServiceGetBrandingSettingsRequest settingsServiceGetBrandingSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetBrandingSettingsRequest;
    
    if (settingsServiceGetBrandingSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetBrandingSettingsRequest' when calling getBrandingSettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetBrandingSettings";

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

    TypeReference<SettingsServiceGetBrandingSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetBrandingSettingsResponse>() {};
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
   * @param settingsServiceGetDomainSettingsRequest  (required)
   * @return SettingsServiceGetDomainSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetDomainSettingsResponse getDomainSettings(SettingsServiceGetDomainSettingsRequest settingsServiceGetDomainSettingsRequest) throws ApiException {
    return this.getDomainSettings(settingsServiceGetDomainSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetDomainSettings
   * Get the domain settings
   * @param settingsServiceGetDomainSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetDomainSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetDomainSettingsResponse getDomainSettings(SettingsServiceGetDomainSettingsRequest settingsServiceGetDomainSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetDomainSettingsRequest;
    
    if (settingsServiceGetDomainSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetDomainSettingsRequest' when calling getDomainSettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetDomainSettings";

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

    TypeReference<SettingsServiceGetDomainSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetDomainSettingsResponse>() {};
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
   * GetGeneralSettings
   * Get basic information over the instance
   * @param body  (required)
   * @return SettingsServiceGetGeneralSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetGeneralSettingsResponse getGeneralSettings(Object body) throws ApiException {
    return this.getGeneralSettings(body, Collections.emptyMap());
  }


  /**
   * GetGeneralSettings
   * Get basic information over the instance
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetGeneralSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetGeneralSettingsResponse getGeneralSettings(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling getGeneralSettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetGeneralSettings";

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

    TypeReference<SettingsServiceGetGeneralSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetGeneralSettingsResponse>() {};
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
   * @param settingsServiceGetLegalAndSupportSettingsRequest  (required)
   * @return SettingsServiceGetLegalAndSupportSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLegalAndSupportSettingsResponse getLegalAndSupportSettings(SettingsServiceGetLegalAndSupportSettingsRequest settingsServiceGetLegalAndSupportSettingsRequest) throws ApiException {
    return this.getLegalAndSupportSettings(settingsServiceGetLegalAndSupportSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetLegalAndSupportSettings
   * Get the legal and support settings
   * @param settingsServiceGetLegalAndSupportSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetLegalAndSupportSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLegalAndSupportSettingsResponse getLegalAndSupportSettings(SettingsServiceGetLegalAndSupportSettingsRequest settingsServiceGetLegalAndSupportSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetLegalAndSupportSettingsRequest;
    
    if (settingsServiceGetLegalAndSupportSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetLegalAndSupportSettingsRequest' when calling getLegalAndSupportSettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetLegalAndSupportSettings";

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

    TypeReference<SettingsServiceGetLegalAndSupportSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetLegalAndSupportSettingsResponse>() {};
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
   * @param settingsServiceGetLockoutSettingsRequest  (required)
   * @return SettingsServiceGetLockoutSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLockoutSettingsResponse getLockoutSettings(SettingsServiceGetLockoutSettingsRequest settingsServiceGetLockoutSettingsRequest) throws ApiException {
    return this.getLockoutSettings(settingsServiceGetLockoutSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetLockoutSettings
   * Get the lockout settings
   * @param settingsServiceGetLockoutSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetLockoutSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLockoutSettingsResponse getLockoutSettings(SettingsServiceGetLockoutSettingsRequest settingsServiceGetLockoutSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetLockoutSettingsRequest;
    
    if (settingsServiceGetLockoutSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetLockoutSettingsRequest' when calling getLockoutSettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetLockoutSettings";

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

    TypeReference<SettingsServiceGetLockoutSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetLockoutSettingsResponse>() {};
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
   * @param settingsServiceGetLoginSettingsRequest  (required)
   * @return SettingsServiceGetLoginSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLoginSettingsResponse getLoginSettings(SettingsServiceGetLoginSettingsRequest settingsServiceGetLoginSettingsRequest) throws ApiException {
    return this.getLoginSettings(settingsServiceGetLoginSettingsRequest, Collections.emptyMap());
  }


  /**
   * GetLoginSettings
   * Get the login settings
   * @param settingsServiceGetLoginSettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetLoginSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLoginSettingsResponse getLoginSettings(SettingsServiceGetLoginSettingsRequest settingsServiceGetLoginSettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetLoginSettingsRequest;
    
    if (settingsServiceGetLoginSettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetLoginSettingsRequest' when calling getLoginSettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetLoginSettings";

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

    TypeReference<SettingsServiceGetLoginSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetLoginSettingsResponse>() {};
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
   * @param settingsServiceGetPasswordComplexitySettingsRequest  (required)
   * @return SettingsServiceGetPasswordComplexitySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordComplexitySettingsResponse getPasswordComplexitySettings(SettingsServiceGetPasswordComplexitySettingsRequest settingsServiceGetPasswordComplexitySettingsRequest) throws ApiException {
    return this.getPasswordComplexitySettings(settingsServiceGetPasswordComplexitySettingsRequest, Collections.emptyMap());
  }


  /**
   * GetPasswordComplexitySettings
   * Get the password complexity settings
   * @param settingsServiceGetPasswordComplexitySettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetPasswordComplexitySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordComplexitySettingsResponse getPasswordComplexitySettings(SettingsServiceGetPasswordComplexitySettingsRequest settingsServiceGetPasswordComplexitySettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetPasswordComplexitySettingsRequest;
    
    if (settingsServiceGetPasswordComplexitySettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetPasswordComplexitySettingsRequest' when calling getPasswordComplexitySettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetPasswordComplexitySettings";

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

    TypeReference<SettingsServiceGetPasswordComplexitySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetPasswordComplexitySettingsResponse>() {};
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
   * @param settingsServiceGetPasswordExpirySettingsRequest  (required)
   * @return SettingsServiceGetPasswordExpirySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordExpirySettingsResponse getPasswordExpirySettings(SettingsServiceGetPasswordExpirySettingsRequest settingsServiceGetPasswordExpirySettingsRequest) throws ApiException {
    return this.getPasswordExpirySettings(settingsServiceGetPasswordExpirySettingsRequest, Collections.emptyMap());
  }


  /**
   * GetPasswordExpirySettings
   * Get the password expiry settings
   * @param settingsServiceGetPasswordExpirySettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetPasswordExpirySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordExpirySettingsResponse getPasswordExpirySettings(SettingsServiceGetPasswordExpirySettingsRequest settingsServiceGetPasswordExpirySettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceGetPasswordExpirySettingsRequest;
    
    if (settingsServiceGetPasswordExpirySettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceGetPasswordExpirySettingsRequest' when calling getPasswordExpirySettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetPasswordExpirySettings";

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

    TypeReference<SettingsServiceGetPasswordExpirySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetPasswordExpirySettingsResponse>() {};
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
   * GetSecuritySettings
   * Get the security settings
   * @param body  (required)
   * @return SettingsServiceGetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetSecuritySettingsResponse getSecuritySettings(Object body) throws ApiException {
    return this.getSecuritySettings(body, Collections.emptyMap());
  }


  /**
   * GetSecuritySettings
   * Get the security settings
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetSecuritySettingsResponse getSecuritySettings(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling getSecuritySettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/GetSecuritySettings";

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

    TypeReference<SettingsServiceGetSecuritySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetSecuritySettingsResponse>() {};
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
   * @param settingsServiceSetSecuritySettingsRequest  (required)
   * @return SettingsServiceSetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceSetSecuritySettingsResponse setSecuritySettings(SettingsServiceSetSecuritySettingsRequest settingsServiceSetSecuritySettingsRequest) throws ApiException {
    return this.setSecuritySettings(settingsServiceSetSecuritySettingsRequest, Collections.emptyMap());
  }


  /**
   * SetSecuritySettings
   * Set the security settings
   * @param settingsServiceSetSecuritySettingsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceSetSecuritySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceSetSecuritySettingsResponse setSecuritySettings(SettingsServiceSetSecuritySettingsRequest settingsServiceSetSecuritySettingsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = settingsServiceSetSecuritySettingsRequest;
    
    if (settingsServiceSetSecuritySettingsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'settingsServiceSetSecuritySettingsRequest' when calling setSecuritySettings");
    }
    
    String localVarPath = "/zitadel.settings.v2.SettingsService/SetSecuritySettings";

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

    TypeReference<SettingsServiceSetSecuritySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceSetSecuritySettingsResponse>() {};
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
