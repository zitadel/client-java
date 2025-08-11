package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaFeatureServiceConnectError;
import com.zitadel.model.BetaFeatureServiceGetInstanceFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceGetInstanceFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceGetOrganizationFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceGetOrganizationFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceGetSystemFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceGetUserFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceGetUserFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceResetInstanceFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceResetOrganizationFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceResetOrganizationFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceResetSystemFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceResetUserFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceResetUserFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceSetInstanceFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceSetInstanceFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceSetOrganizationFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceSetOrganizationFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceSetSystemFeaturesRequest;
import com.zitadel.model.BetaFeatureServiceSetSystemFeaturesResponse;
import com.zitadel.model.BetaFeatureServiceSetUserFeatureRequest;
import com.zitadel.model.BetaFeatureServiceSetUserFeaturesResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class BetaFeatureServiceApi extends BaseApi {

  public BetaFeatureServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaFeatureServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * GetInstanceFeatures
   * 
   * @param betaFeatureServiceGetInstanceFeaturesRequest  (required)
   * @return BetaFeatureServiceGetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceGetInstanceFeaturesResponse getInstanceFeatures(BetaFeatureServiceGetInstanceFeaturesRequest betaFeatureServiceGetInstanceFeaturesRequest) throws ApiException {
    return this.getInstanceFeatures(betaFeatureServiceGetInstanceFeaturesRequest, Collections.emptyMap());
  }


  /**
   * GetInstanceFeatures
   * 
   * @param betaFeatureServiceGetInstanceFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceGetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceGetInstanceFeaturesResponse getInstanceFeatures(BetaFeatureServiceGetInstanceFeaturesRequest betaFeatureServiceGetInstanceFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceGetInstanceFeaturesRequest;
    
    if (betaFeatureServiceGetInstanceFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceGetInstanceFeaturesRequest' when calling getInstanceFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/GetInstanceFeatures";

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

    TypeReference<BetaFeatureServiceGetInstanceFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceGetInstanceFeaturesResponse>() {};
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
   * GetOrganizationFeatures
   * 
   * @param betaFeatureServiceGetOrganizationFeaturesRequest  (required)
   * @return BetaFeatureServiceGetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceGetOrganizationFeaturesResponse getOrganizationFeatures(BetaFeatureServiceGetOrganizationFeaturesRequest betaFeatureServiceGetOrganizationFeaturesRequest) throws ApiException {
    return this.getOrganizationFeatures(betaFeatureServiceGetOrganizationFeaturesRequest, Collections.emptyMap());
  }


  /**
   * GetOrganizationFeatures
   * 
   * @param betaFeatureServiceGetOrganizationFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceGetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceGetOrganizationFeaturesResponse getOrganizationFeatures(BetaFeatureServiceGetOrganizationFeaturesRequest betaFeatureServiceGetOrganizationFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceGetOrganizationFeaturesRequest;
    
    if (betaFeatureServiceGetOrganizationFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceGetOrganizationFeaturesRequest' when calling getOrganizationFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/GetOrganizationFeatures";

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

    TypeReference<BetaFeatureServiceGetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceGetOrganizationFeaturesResponse>() {};
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
              * GetSystemFeatures (Convenience Method)
              * 
                * @return BetaFeatureServiceGetSystemFeaturesResponse
              * @throws ApiException if fails to make API call
              */
              public BetaFeatureServiceGetSystemFeaturesResponse getSystemFeatures() throws ApiException {
              return this.getSystemFeatures(new Object());
              }


  /**
   * GetSystemFeatures
   * 
   * @param body  (required)
   * @return BetaFeatureServiceGetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceGetSystemFeaturesResponse getSystemFeatures(Object body) throws ApiException {
    return this.getSystemFeatures(body, Collections.emptyMap());
  }


  /**
   * GetSystemFeatures
   * 
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceGetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceGetSystemFeaturesResponse getSystemFeatures(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling getSystemFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/GetSystemFeatures";

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

    TypeReference<BetaFeatureServiceGetSystemFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceGetSystemFeaturesResponse>() {};
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
   * GetUserFeatures
   * 
   * @param betaFeatureServiceGetUserFeaturesRequest  (required)
   * @return BetaFeatureServiceGetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceGetUserFeaturesResponse getUserFeatures(BetaFeatureServiceGetUserFeaturesRequest betaFeatureServiceGetUserFeaturesRequest) throws ApiException {
    return this.getUserFeatures(betaFeatureServiceGetUserFeaturesRequest, Collections.emptyMap());
  }


  /**
   * GetUserFeatures
   * 
   * @param betaFeatureServiceGetUserFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceGetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceGetUserFeaturesResponse getUserFeatures(BetaFeatureServiceGetUserFeaturesRequest betaFeatureServiceGetUserFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceGetUserFeaturesRequest;
    
    if (betaFeatureServiceGetUserFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceGetUserFeaturesRequest' when calling getUserFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/GetUserFeatures";

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

    TypeReference<BetaFeatureServiceGetUserFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceGetUserFeaturesResponse>() {};
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
              * ResetInstanceFeatures (Convenience Method)
              * 
                * @return BetaFeatureServiceResetInstanceFeaturesResponse
              * @throws ApiException if fails to make API call
              */
              public BetaFeatureServiceResetInstanceFeaturesResponse resetInstanceFeatures() throws ApiException {
              return this.resetInstanceFeatures(new Object());
              }


  /**
   * ResetInstanceFeatures
   * 
   * @param body  (required)
   * @return BetaFeatureServiceResetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceResetInstanceFeaturesResponse resetInstanceFeatures(Object body) throws ApiException {
    return this.resetInstanceFeatures(body, Collections.emptyMap());
  }


  /**
   * ResetInstanceFeatures
   * 
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceResetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceResetInstanceFeaturesResponse resetInstanceFeatures(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling resetInstanceFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/ResetInstanceFeatures";

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

    TypeReference<BetaFeatureServiceResetInstanceFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceResetInstanceFeaturesResponse>() {};
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
   * ResetOrganizationFeatures
   * 
   * @param betaFeatureServiceResetOrganizationFeaturesRequest  (required)
   * @return BetaFeatureServiceResetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceResetOrganizationFeaturesResponse resetOrganizationFeatures(BetaFeatureServiceResetOrganizationFeaturesRequest betaFeatureServiceResetOrganizationFeaturesRequest) throws ApiException {
    return this.resetOrganizationFeatures(betaFeatureServiceResetOrganizationFeaturesRequest, Collections.emptyMap());
  }


  /**
   * ResetOrganizationFeatures
   * 
   * @param betaFeatureServiceResetOrganizationFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceResetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceResetOrganizationFeaturesResponse resetOrganizationFeatures(BetaFeatureServiceResetOrganizationFeaturesRequest betaFeatureServiceResetOrganizationFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceResetOrganizationFeaturesRequest;
    
    if (betaFeatureServiceResetOrganizationFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceResetOrganizationFeaturesRequest' when calling resetOrganizationFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/ResetOrganizationFeatures";

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

    TypeReference<BetaFeatureServiceResetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceResetOrganizationFeaturesResponse>() {};
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
              * ResetSystemFeatures (Convenience Method)
              * 
                * @return BetaFeatureServiceResetSystemFeaturesResponse
              * @throws ApiException if fails to make API call
              */
              public BetaFeatureServiceResetSystemFeaturesResponse resetSystemFeatures() throws ApiException {
              return this.resetSystemFeatures(new Object());
              }


  /**
   * ResetSystemFeatures
   * 
   * @param body  (required)
   * @return BetaFeatureServiceResetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceResetSystemFeaturesResponse resetSystemFeatures(Object body) throws ApiException {
    return this.resetSystemFeatures(body, Collections.emptyMap());
  }


  /**
   * ResetSystemFeatures
   * 
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceResetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceResetSystemFeaturesResponse resetSystemFeatures(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling resetSystemFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/ResetSystemFeatures";

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

    TypeReference<BetaFeatureServiceResetSystemFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceResetSystemFeaturesResponse>() {};
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
   * ResetUserFeatures
   * 
   * @param betaFeatureServiceResetUserFeaturesRequest  (required)
   * @return BetaFeatureServiceResetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceResetUserFeaturesResponse resetUserFeatures(BetaFeatureServiceResetUserFeaturesRequest betaFeatureServiceResetUserFeaturesRequest) throws ApiException {
    return this.resetUserFeatures(betaFeatureServiceResetUserFeaturesRequest, Collections.emptyMap());
  }


  /**
   * ResetUserFeatures
   * 
   * @param betaFeatureServiceResetUserFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceResetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceResetUserFeaturesResponse resetUserFeatures(BetaFeatureServiceResetUserFeaturesRequest betaFeatureServiceResetUserFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceResetUserFeaturesRequest;
    
    if (betaFeatureServiceResetUserFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceResetUserFeaturesRequest' when calling resetUserFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/ResetUserFeatures";

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

    TypeReference<BetaFeatureServiceResetUserFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceResetUserFeaturesResponse>() {};
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
   * SetInstanceFeatures
   * 
   * @param betaFeatureServiceSetInstanceFeaturesRequest  (required)
   * @return BetaFeatureServiceSetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceSetInstanceFeaturesResponse setInstanceFeatures(BetaFeatureServiceSetInstanceFeaturesRequest betaFeatureServiceSetInstanceFeaturesRequest) throws ApiException {
    return this.setInstanceFeatures(betaFeatureServiceSetInstanceFeaturesRequest, Collections.emptyMap());
  }


  /**
   * SetInstanceFeatures
   * 
   * @param betaFeatureServiceSetInstanceFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceSetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceSetInstanceFeaturesResponse setInstanceFeatures(BetaFeatureServiceSetInstanceFeaturesRequest betaFeatureServiceSetInstanceFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceSetInstanceFeaturesRequest;
    
    if (betaFeatureServiceSetInstanceFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceSetInstanceFeaturesRequest' when calling setInstanceFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/SetInstanceFeatures";

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

    TypeReference<BetaFeatureServiceSetInstanceFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceSetInstanceFeaturesResponse>() {};
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
   * SetOrganizationFeatures
   * 
   * @param betaFeatureServiceSetOrganizationFeaturesRequest  (required)
   * @return BetaFeatureServiceSetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceSetOrganizationFeaturesResponse setOrganizationFeatures(BetaFeatureServiceSetOrganizationFeaturesRequest betaFeatureServiceSetOrganizationFeaturesRequest) throws ApiException {
    return this.setOrganizationFeatures(betaFeatureServiceSetOrganizationFeaturesRequest, Collections.emptyMap());
  }


  /**
   * SetOrganizationFeatures
   * 
   * @param betaFeatureServiceSetOrganizationFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceSetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceSetOrganizationFeaturesResponse setOrganizationFeatures(BetaFeatureServiceSetOrganizationFeaturesRequest betaFeatureServiceSetOrganizationFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceSetOrganizationFeaturesRequest;
    
    if (betaFeatureServiceSetOrganizationFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceSetOrganizationFeaturesRequest' when calling setOrganizationFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/SetOrganizationFeatures";

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

    TypeReference<BetaFeatureServiceSetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceSetOrganizationFeaturesResponse>() {};
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
   * SetSystemFeatures
   * 
   * @param betaFeatureServiceSetSystemFeaturesRequest  (required)
   * @return BetaFeatureServiceSetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceSetSystemFeaturesResponse setSystemFeatures(BetaFeatureServiceSetSystemFeaturesRequest betaFeatureServiceSetSystemFeaturesRequest) throws ApiException {
    return this.setSystemFeatures(betaFeatureServiceSetSystemFeaturesRequest, Collections.emptyMap());
  }


  /**
   * SetSystemFeatures
   * 
   * @param betaFeatureServiceSetSystemFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceSetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceSetSystemFeaturesResponse setSystemFeatures(BetaFeatureServiceSetSystemFeaturesRequest betaFeatureServiceSetSystemFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceSetSystemFeaturesRequest;
    
    if (betaFeatureServiceSetSystemFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceSetSystemFeaturesRequest' when calling setSystemFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/SetSystemFeatures";

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

    TypeReference<BetaFeatureServiceSetSystemFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceSetSystemFeaturesResponse>() {};
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
   * SetUserFeatures
   * 
   * @param betaFeatureServiceSetUserFeatureRequest  (required)
   * @return BetaFeatureServiceSetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public BetaFeatureServiceSetUserFeaturesResponse setUserFeatures(BetaFeatureServiceSetUserFeatureRequest betaFeatureServiceSetUserFeatureRequest) throws ApiException {
    return this.setUserFeatures(betaFeatureServiceSetUserFeatureRequest, Collections.emptyMap());
  }


  /**
   * SetUserFeatures
   * 
   * @param betaFeatureServiceSetUserFeatureRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaFeatureServiceSetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private BetaFeatureServiceSetUserFeaturesResponse setUserFeatures(BetaFeatureServiceSetUserFeatureRequest betaFeatureServiceSetUserFeatureRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaFeatureServiceSetUserFeatureRequest;
    
    if (betaFeatureServiceSetUserFeatureRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaFeatureServiceSetUserFeatureRequest' when calling setUserFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2beta.FeatureService/SetUserFeatures";

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

    TypeReference<BetaFeatureServiceSetUserFeaturesResponse> localVarReturnType = new TypeReference<BetaFeatureServiceSetUserFeaturesResponse>() {};
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
