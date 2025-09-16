package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.FeatureServiceConnectError;
import com.zitadel.model.FeatureServiceGetInstanceFeaturesRequest;
import com.zitadel.model.FeatureServiceGetInstanceFeaturesResponse;
import com.zitadel.model.FeatureServiceGetOrganizationFeaturesRequest;
import com.zitadel.model.FeatureServiceGetOrganizationFeaturesResponse;
import com.zitadel.model.FeatureServiceGetSystemFeaturesResponse;
import com.zitadel.model.FeatureServiceGetUserFeaturesRequest;
import com.zitadel.model.FeatureServiceGetUserFeaturesResponse;
import com.zitadel.model.FeatureServiceResetInstanceFeaturesResponse;
import com.zitadel.model.FeatureServiceResetOrganizationFeaturesRequest;
import com.zitadel.model.FeatureServiceResetOrganizationFeaturesResponse;
import com.zitadel.model.FeatureServiceResetSystemFeaturesResponse;
import com.zitadel.model.FeatureServiceResetUserFeaturesRequest;
import com.zitadel.model.FeatureServiceResetUserFeaturesResponse;
import com.zitadel.model.FeatureServiceSetInstanceFeaturesRequest;
import com.zitadel.model.FeatureServiceSetInstanceFeaturesResponse;
import com.zitadel.model.FeatureServiceSetOrganizationFeaturesRequest;
import com.zitadel.model.FeatureServiceSetOrganizationFeaturesResponse;
import com.zitadel.model.FeatureServiceSetSystemFeaturesRequest;
import com.zitadel.model.FeatureServiceSetSystemFeaturesResponse;
import com.zitadel.model.FeatureServiceSetUserFeatureRequest;
import com.zitadel.model.FeatureServiceSetUserFeaturesResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class FeatureServiceApi extends BaseApi {

  public FeatureServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public FeatureServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * Get Instance Features
   * Returns all configured features for an instance. Unset fields mean the feature is the current system default.   Required permissions:   - none
   * @param featureServiceGetInstanceFeaturesRequest  (required)
   * @return FeatureServiceGetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetInstanceFeaturesResponse getInstanceFeatures(FeatureServiceGetInstanceFeaturesRequest featureServiceGetInstanceFeaturesRequest) throws ApiException {
    return this.getInstanceFeatures(featureServiceGetInstanceFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Get Instance Features
   * Returns all configured features for an instance. Unset fields mean the feature is the current system default.   Required permissions:   - none
   * @param featureServiceGetInstanceFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceGetInstanceFeaturesResponse getInstanceFeatures(FeatureServiceGetInstanceFeaturesRequest featureServiceGetInstanceFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceGetInstanceFeaturesRequest;
    
    if (featureServiceGetInstanceFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceGetInstanceFeaturesRequest' when calling getInstanceFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/GetInstanceFeatures";

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

    TypeReference<FeatureServiceGetInstanceFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetInstanceFeaturesResponse>() {};
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
   * Get Organization Features
   * Returns all configured features for an organization. Unset fields mean the feature is the current instance default.   Required permissions:   - org.feature.read   - no permission required for the organization the user belongs to
   * @param featureServiceGetOrganizationFeaturesRequest  (required)
   * @return FeatureServiceGetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetOrganizationFeaturesResponse getOrganizationFeatures(FeatureServiceGetOrganizationFeaturesRequest featureServiceGetOrganizationFeaturesRequest) throws ApiException {
    return this.getOrganizationFeatures(featureServiceGetOrganizationFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Get Organization Features
   * Returns all configured features for an organization. Unset fields mean the feature is the current instance default.   Required permissions:   - org.feature.read   - no permission required for the organization the user belongs to
   * @param featureServiceGetOrganizationFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceGetOrganizationFeaturesResponse getOrganizationFeatures(FeatureServiceGetOrganizationFeaturesRequest featureServiceGetOrganizationFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceGetOrganizationFeaturesRequest;
    
    if (featureServiceGetOrganizationFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceGetOrganizationFeaturesRequest' when calling getOrganizationFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/GetOrganizationFeatures";

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

    TypeReference<FeatureServiceGetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetOrganizationFeaturesResponse>() {};
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
              * Get System Features (Convenience Method)
              * Returns all configured features for the system. Unset fields mean the feature is the current system default.   Required permissions:   - none
                * @return FeatureServiceGetSystemFeaturesResponse
              * @throws ApiException if fails to make API call
              */
              public FeatureServiceGetSystemFeaturesResponse getSystemFeatures() throws ApiException {
              return this.getSystemFeatures(new Object());
              }


  /**
   * Get System Features
   * Returns all configured features for the system. Unset fields mean the feature is the current system default.   Required permissions:   - none
   * @param body  (required)
   * @return FeatureServiceGetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetSystemFeaturesResponse getSystemFeatures(Object body) throws ApiException {
    return this.getSystemFeatures(body, Collections.emptyMap());
  }


  /**
   * Get System Features
   * Returns all configured features for the system. Unset fields mean the feature is the current system default.   Required permissions:   - none
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceGetSystemFeaturesResponse getSystemFeatures(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling getSystemFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/GetSystemFeatures";

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

    TypeReference<FeatureServiceGetSystemFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetSystemFeaturesResponse>() {};
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
   * Get User Features
   * Returns all configured features for a user. Unset fields mean the feature is the current organization default.   Required permissions:   - user.feature.read   - no permission required for the own user
   * @param featureServiceGetUserFeaturesRequest  (required)
   * @return FeatureServiceGetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetUserFeaturesResponse getUserFeatures(FeatureServiceGetUserFeaturesRequest featureServiceGetUserFeaturesRequest) throws ApiException {
    return this.getUserFeatures(featureServiceGetUserFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Get User Features
   * Returns all configured features for a user. Unset fields mean the feature is the current organization default.   Required permissions:   - user.feature.read   - no permission required for the own user
   * @param featureServiceGetUserFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceGetUserFeaturesResponse getUserFeatures(FeatureServiceGetUserFeaturesRequest featureServiceGetUserFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceGetUserFeaturesRequest;
    
    if (featureServiceGetUserFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceGetUserFeaturesRequest' when calling getUserFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/GetUserFeatures";

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

    TypeReference<FeatureServiceGetUserFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetUserFeaturesResponse>() {};
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
              * Reset Instance Features (Convenience Method)
              * Deletes ALL configured features for an instance, reverting the behaviors to system defaults.   Required permissions:   - iam.feature.delete
                * @return FeatureServiceResetInstanceFeaturesResponse
              * @throws ApiException if fails to make API call
              */
              public FeatureServiceResetInstanceFeaturesResponse resetInstanceFeatures() throws ApiException {
              return this.resetInstanceFeatures(new Object());
              }


  /**
   * Reset Instance Features
   * Deletes ALL configured features for an instance, reverting the behaviors to system defaults.   Required permissions:   - iam.feature.delete
   * @param body  (required)
   * @return FeatureServiceResetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetInstanceFeaturesResponse resetInstanceFeatures(Object body) throws ApiException {
    return this.resetInstanceFeatures(body, Collections.emptyMap());
  }


  /**
   * Reset Instance Features
   * Deletes ALL configured features for an instance, reverting the behaviors to system defaults.   Required permissions:   - iam.feature.delete
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceResetInstanceFeaturesResponse resetInstanceFeatures(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling resetInstanceFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/ResetInstanceFeatures";

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

    TypeReference<FeatureServiceResetInstanceFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetInstanceFeaturesResponse>() {};
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
   * Reset Organization Features
   * Deletes ALL configured features for an organization, reverting the behaviors to instance defaults.   Required permissions:   - org.feature.delete
   * @param featureServiceResetOrganizationFeaturesRequest  (required)
   * @return FeatureServiceResetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetOrganizationFeaturesResponse resetOrganizationFeatures(FeatureServiceResetOrganizationFeaturesRequest featureServiceResetOrganizationFeaturesRequest) throws ApiException {
    return this.resetOrganizationFeatures(featureServiceResetOrganizationFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Reset Organization Features
   * Deletes ALL configured features for an organization, reverting the behaviors to instance defaults.   Required permissions:   - org.feature.delete
   * @param featureServiceResetOrganizationFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceResetOrganizationFeaturesResponse resetOrganizationFeatures(FeatureServiceResetOrganizationFeaturesRequest featureServiceResetOrganizationFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceResetOrganizationFeaturesRequest;
    
    if (featureServiceResetOrganizationFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceResetOrganizationFeaturesRequest' when calling resetOrganizationFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/ResetOrganizationFeatures";

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

    TypeReference<FeatureServiceResetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetOrganizationFeaturesResponse>() {};
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
              * Reset System Features (Convenience Method)
              * Deletes ALL configured features for the system, reverting the behaviors to system defaults.   Required permissions:   - system.feature.delete
                * @return FeatureServiceResetSystemFeaturesResponse
              * @throws ApiException if fails to make API call
              */
              public FeatureServiceResetSystemFeaturesResponse resetSystemFeatures() throws ApiException {
              return this.resetSystemFeatures(new Object());
              }


  /**
   * Reset System Features
   * Deletes ALL configured features for the system, reverting the behaviors to system defaults.   Required permissions:   - system.feature.delete
   * @param body  (required)
   * @return FeatureServiceResetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetSystemFeaturesResponse resetSystemFeatures(Object body) throws ApiException {
    return this.resetSystemFeatures(body, Collections.emptyMap());
  }


  /**
   * Reset System Features
   * Deletes ALL configured features for the system, reverting the behaviors to system defaults.   Required permissions:   - system.feature.delete
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceResetSystemFeaturesResponse resetSystemFeatures(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling resetSystemFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/ResetSystemFeatures";

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

    TypeReference<FeatureServiceResetSystemFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetSystemFeaturesResponse>() {};
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
   * Reset User Features
   * Deletes ALL configured features for a user, reverting the behaviors to organization defaults.   Required permissions:   - user.feature.delete
   * @param featureServiceResetUserFeaturesRequest  (required)
   * @return FeatureServiceResetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetUserFeaturesResponse resetUserFeatures(FeatureServiceResetUserFeaturesRequest featureServiceResetUserFeaturesRequest) throws ApiException {
    return this.resetUserFeatures(featureServiceResetUserFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Reset User Features
   * Deletes ALL configured features for a user, reverting the behaviors to organization defaults.   Required permissions:   - user.feature.delete
   * @param featureServiceResetUserFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceResetUserFeaturesResponse resetUserFeatures(FeatureServiceResetUserFeaturesRequest featureServiceResetUserFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceResetUserFeaturesRequest;
    
    if (featureServiceResetUserFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceResetUserFeaturesRequest' when calling resetUserFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/ResetUserFeatures";

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

    TypeReference<FeatureServiceResetUserFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetUserFeaturesResponse>() {};
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
   * Set Instance Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.   Required permissions:   - iam.feature.write
   * @param featureServiceSetInstanceFeaturesRequest  (required)
   * @return FeatureServiceSetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetInstanceFeaturesResponse setInstanceFeatures(FeatureServiceSetInstanceFeaturesRequest featureServiceSetInstanceFeaturesRequest) throws ApiException {
    return this.setInstanceFeatures(featureServiceSetInstanceFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Set Instance Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.   Required permissions:   - iam.feature.write
   * @param featureServiceSetInstanceFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceSetInstanceFeaturesResponse setInstanceFeatures(FeatureServiceSetInstanceFeaturesRequest featureServiceSetInstanceFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceSetInstanceFeaturesRequest;
    
    if (featureServiceSetInstanceFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceSetInstanceFeaturesRequest' when calling setInstanceFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/SetInstanceFeatures";

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

    TypeReference<FeatureServiceSetInstanceFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceSetInstanceFeaturesResponse>() {};
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
   * Set Organization Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.   Required permissions:   - org.feature.write
   * @param featureServiceSetOrganizationFeaturesRequest  (required)
   * @return FeatureServiceSetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetOrganizationFeaturesResponse setOrganizationFeatures(FeatureServiceSetOrganizationFeaturesRequest featureServiceSetOrganizationFeaturesRequest) throws ApiException {
    return this.setOrganizationFeatures(featureServiceSetOrganizationFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Set Organization Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.   Required permissions:   - org.feature.write
   * @param featureServiceSetOrganizationFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceSetOrganizationFeaturesResponse setOrganizationFeatures(FeatureServiceSetOrganizationFeaturesRequest featureServiceSetOrganizationFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceSetOrganizationFeaturesRequest;
    
    if (featureServiceSetOrganizationFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceSetOrganizationFeaturesRequest' when calling setOrganizationFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/SetOrganizationFeatures";

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

    TypeReference<FeatureServiceSetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceSetOrganizationFeaturesResponse>() {};
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
   * Set System Features
   * Configure and set features that apply to the complete system. Only fields present in the request are set or unset.   Required permissions:   - system.feature.write
   * @param featureServiceSetSystemFeaturesRequest  (required)
   * @return FeatureServiceSetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetSystemFeaturesResponse setSystemFeatures(FeatureServiceSetSystemFeaturesRequest featureServiceSetSystemFeaturesRequest) throws ApiException {
    return this.setSystemFeatures(featureServiceSetSystemFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Set System Features
   * Configure and set features that apply to the complete system. Only fields present in the request are set or unset.   Required permissions:   - system.feature.write
   * @param featureServiceSetSystemFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceSetSystemFeaturesResponse setSystemFeatures(FeatureServiceSetSystemFeaturesRequest featureServiceSetSystemFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceSetSystemFeaturesRequest;
    
    if (featureServiceSetSystemFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceSetSystemFeaturesRequest' when calling setSystemFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/SetSystemFeatures";

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

    TypeReference<FeatureServiceSetSystemFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceSetSystemFeaturesResponse>() {};
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
   * Set User Features
   * Configure and set features that apply to an user. Only fields present in the request are set or unset.   Required permissions:   - user.feature.write
   * @param featureServiceSetUserFeatureRequest  (required)
   * @return FeatureServiceSetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetUserFeaturesResponse setUserFeatures(FeatureServiceSetUserFeatureRequest featureServiceSetUserFeatureRequest) throws ApiException {
    return this.setUserFeatures(featureServiceSetUserFeatureRequest, Collections.emptyMap());
  }


  /**
   * Set User Features
   * Configure and set features that apply to an user. Only fields present in the request are set or unset.   Required permissions:   - user.feature.write
   * @param featureServiceSetUserFeatureRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  private FeatureServiceSetUserFeaturesResponse setUserFeatures(FeatureServiceSetUserFeatureRequest featureServiceSetUserFeatureRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceSetUserFeatureRequest;
    
    if (featureServiceSetUserFeatureRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceSetUserFeatureRequest' when calling setUserFeatures");
    }
    
    String localVarPath = "/zitadel.feature.v2.FeatureService/SetUserFeatures";

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

    TypeReference<FeatureServiceSetUserFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceSetUserFeaturesResponse>() {};
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
