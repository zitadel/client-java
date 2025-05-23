package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.SettingsServiceGetActiveIdentityProvidersResponse;
import com.zitadel.model.SettingsServiceGetBrandingSettingsResponse;
import com.zitadel.model.SettingsServiceGetDomainSettingsResponse;
import com.zitadel.model.SettingsServiceGetGeneralSettingsResponse;
import com.zitadel.model.SettingsServiceGetLegalAndSupportSettingsResponse;
import com.zitadel.model.SettingsServiceGetLockoutSettingsResponse;
import com.zitadel.model.SettingsServiceGetLoginSettingsResponse;
import com.zitadel.model.SettingsServiceGetPasswordComplexitySettingsResponse;
import com.zitadel.model.SettingsServiceGetPasswordExpirySettingsResponse;
import com.zitadel.model.SettingsServiceRpcStatus;


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
   * Get the current active identity providers
   * Return the current active identity providers for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param creationAllowed  (optional)
   * @param linkingAllowed  (optional)
   * @param autoCreation  (optional)
   * @param autoLinking  (optional)
   * @return SettingsServiceGetActiveIdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetActiveIdentityProvidersResponse settingsServiceGetActiveIdentityProviders(String ctxOrgId, Boolean ctxInstance, Boolean creationAllowed, Boolean linkingAllowed, Boolean autoCreation, Boolean autoLinking) throws ApiException {
    return this.settingsServiceGetActiveIdentityProviders(ctxOrgId, ctxInstance, creationAllowed, linkingAllowed, autoCreation, autoLinking, Collections.emptyMap());
  }


  /**
   * Get the current active identity providers
   * Return the current active identity providers for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param creationAllowed  (optional)
   * @param linkingAllowed  (optional)
   * @param autoCreation  (optional)
   * @param autoLinking  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetActiveIdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetActiveIdentityProvidersResponse settingsServiceGetActiveIdentityProviders(String ctxOrgId, Boolean ctxInstance, Boolean creationAllowed, Boolean linkingAllowed, Boolean autoCreation, Boolean autoLinking, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/login/idps";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    localVarQueryParams.addAll(apiClient.parameterToPair("creationAllowed", creationAllowed));
    localVarQueryParams.addAll(apiClient.parameterToPair("linkingAllowed", linkingAllowed));
    localVarQueryParams.addAll(apiClient.parameterToPair("autoCreation", autoCreation));
    localVarQueryParams.addAll(apiClient.parameterToPair("autoLinking", autoLinking));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetActiveIdentityProvidersResponse> localVarReturnType = new TypeReference<SettingsServiceGetActiveIdentityProvidersResponse>() {};
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
   * Get the current active branding settings
   * Return the current active branding settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @return SettingsServiceGetBrandingSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetBrandingSettingsResponse settingsServiceGetBrandingSettings(String ctxOrgId, Boolean ctxInstance) throws ApiException {
    return this.settingsServiceGetBrandingSettings(ctxOrgId, ctxInstance, Collections.emptyMap());
  }


  /**
   * Get the current active branding settings
   * Return the current active branding settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetBrandingSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetBrandingSettingsResponse settingsServiceGetBrandingSettings(String ctxOrgId, Boolean ctxInstance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/branding";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetBrandingSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetBrandingSettingsResponse>() {};
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
   * Get the domain settings
   * Return the domain settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @return SettingsServiceGetDomainSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetDomainSettingsResponse settingsServiceGetDomainSettings(String ctxOrgId, Boolean ctxInstance) throws ApiException {
    return this.settingsServiceGetDomainSettings(ctxOrgId, ctxInstance, Collections.emptyMap());
  }


  /**
   * Get the domain settings
   * Return the domain settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetDomainSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetDomainSettingsResponse settingsServiceGetDomainSettings(String ctxOrgId, Boolean ctxInstance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/domain";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetDomainSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetDomainSettingsResponse>() {};
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
   * Get basic information over the instance
   * Return the basic information of the instance for the requested context
   * @return SettingsServiceGetGeneralSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetGeneralSettingsResponse settingsServiceGetGeneralSettings() throws ApiException {
    return this.settingsServiceGetGeneralSettings(Collections.emptyMap());
  }


  /**
   * Get basic information over the instance
   * Return the basic information of the instance for the requested context
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetGeneralSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetGeneralSettingsResponse settingsServiceGetGeneralSettings(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings";

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

    TypeReference<SettingsServiceGetGeneralSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetGeneralSettingsResponse>() {};
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
   * Get the legal and support settings
   * Return the legal settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @return SettingsServiceGetLegalAndSupportSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLegalAndSupportSettingsResponse settingsServiceGetLegalAndSupportSettings(String ctxOrgId, Boolean ctxInstance) throws ApiException {
    return this.settingsServiceGetLegalAndSupportSettings(ctxOrgId, ctxInstance, Collections.emptyMap());
  }


  /**
   * Get the legal and support settings
   * Return the legal settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetLegalAndSupportSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLegalAndSupportSettingsResponse settingsServiceGetLegalAndSupportSettings(String ctxOrgId, Boolean ctxInstance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/legal_support";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetLegalAndSupportSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetLegalAndSupportSettingsResponse>() {};
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
   * Get the lockout settings
   * Return the lockout settings for the requested context, which define when a user will be locked
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @return SettingsServiceGetLockoutSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLockoutSettingsResponse settingsServiceGetLockoutSettings(String ctxOrgId, Boolean ctxInstance) throws ApiException {
    return this.settingsServiceGetLockoutSettings(ctxOrgId, ctxInstance, Collections.emptyMap());
  }


  /**
   * Get the lockout settings
   * Return the lockout settings for the requested context, which define when a user will be locked
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetLockoutSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLockoutSettingsResponse settingsServiceGetLockoutSettings(String ctxOrgId, Boolean ctxInstance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/lockout";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetLockoutSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetLockoutSettingsResponse>() {};
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
   * Get the login settings
   * Return the settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @return SettingsServiceGetLoginSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLoginSettingsResponse settingsServiceGetLoginSettings(String ctxOrgId, Boolean ctxInstance) throws ApiException {
    return this.settingsServiceGetLoginSettings(ctxOrgId, ctxInstance, Collections.emptyMap());
  }


  /**
   * Get the login settings
   * Return the settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetLoginSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetLoginSettingsResponse settingsServiceGetLoginSettings(String ctxOrgId, Boolean ctxInstance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/login";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetLoginSettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetLoginSettingsResponse>() {};
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
   * Get the password complexity settings
   * Return the password complexity settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @return SettingsServiceGetPasswordComplexitySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordComplexitySettingsResponse settingsServiceGetPasswordComplexitySettings(String ctxOrgId, Boolean ctxInstance) throws ApiException {
    return this.settingsServiceGetPasswordComplexitySettings(ctxOrgId, ctxInstance, Collections.emptyMap());
  }


  /**
   * Get the password complexity settings
   * Return the password complexity settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetPasswordComplexitySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordComplexitySettingsResponse settingsServiceGetPasswordComplexitySettings(String ctxOrgId, Boolean ctxInstance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/password/complexity";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetPasswordComplexitySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetPasswordComplexitySettingsResponse>() {};
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
   * Get the password expiry settings
   * Return the password expiry settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @return SettingsServiceGetPasswordExpirySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordExpirySettingsResponse settingsServiceGetPasswordExpirySettings(String ctxOrgId, Boolean ctxInstance) throws ApiException {
    return this.settingsServiceGetPasswordExpirySettings(ctxOrgId, ctxInstance, Collections.emptyMap());
  }


  /**
   * Get the password expiry settings
   * Return the password expiry settings for the requested context
   * @param ctxOrgId  (optional)
   * @param ctxInstance  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return SettingsServiceGetPasswordExpirySettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsServiceGetPasswordExpirySettingsResponse settingsServiceGetPasswordExpirySettings(String ctxOrgId, Boolean ctxInstance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/settings/password/expiry";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.orgId", ctxOrgId));
    localVarQueryParams.addAll(apiClient.parameterToPair("ctx.instance", ctxInstance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<SettingsServiceGetPasswordExpirySettingsResponse> localVarReturnType = new TypeReference<SettingsServiceGetPasswordExpirySettingsResponse>() {};
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
