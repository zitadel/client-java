package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.FeatureServiceGetInstanceFeaturesResponse;
import com.zitadel.model.FeatureServiceGetOrganizationFeaturesResponse;
import com.zitadel.model.FeatureServiceGetSystemFeaturesResponse;
import com.zitadel.model.FeatureServiceGetUserFeaturesResponse;
import com.zitadel.model.FeatureServiceResetInstanceFeaturesResponse;
import com.zitadel.model.FeatureServiceResetOrganizationFeaturesResponse;
import com.zitadel.model.FeatureServiceResetSystemFeaturesResponse;
import com.zitadel.model.FeatureServiceResetUserFeaturesResponse;
import com.zitadel.model.FeatureServiceRpcStatus;
import com.zitadel.model.FeatureServiceSetInstanceFeaturesRequest;
import com.zitadel.model.FeatureServiceSetInstanceFeaturesResponse;
import com.zitadel.model.FeatureServiceSetOrganizationFeaturesResponse;
import com.zitadel.model.FeatureServiceSetSystemFeaturesRequest;
import com.zitadel.model.FeatureServiceSetSystemFeaturesResponse;
import com.zitadel.model.FeatureServiceSetUserFeaturesResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class FeatureServiceApi extends BaseApi {

  public FeatureServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public FeatureServiceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Get Instance Features
   * Returns all configured features for an instance. Unset fields mean the feature is the current system default.  Required permissions:  - none
   * @param inheritance Inherit unset features from the resource owners. This option is recursive: if the flag is set, the resource&#39;s ancestors are consulted up to system defaults. If this option is disabled and the feature is not set on the instance, it will be omitted from the response or Not Found is returned when the instance has no features flags at all. (optional)
   * @return FeatureServiceGetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetInstanceFeaturesResponse featureServiceGetInstanceFeatures(Boolean inheritance) throws ApiException {
    return this.featureServiceGetInstanceFeatures(inheritance, Collections.emptyMap());
  }


  /**
   * Get Instance Features
   * Returns all configured features for an instance. Unset fields mean the feature is the current system default.  Required permissions:  - none
   * @param inheritance Inherit unset features from the resource owners. This option is recursive: if the flag is set, the resource&#39;s ancestors are consulted up to system defaults. If this option is disabled and the feature is not set on the instance, it will be omitted from the response or Not Found is returned when the instance has no features flags at all. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetInstanceFeaturesResponse featureServiceGetInstanceFeatures(Boolean inheritance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/features/instance";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("inheritance", inheritance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<FeatureServiceGetInstanceFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetInstanceFeaturesResponse>() {};
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
   * Get Organization Features
   * Returns all configured features for an organization. Unset fields mean the feature is the current instance default.  Required permissions:  - org.feature.read  - no permission required for the organization the user belongs to
   * @param organizationId  (required)
   * @param inheritance Inherit unset features from the resource owners. This option is recursive: if the flag is set, the resource&#39;s ancestors are consulted up to system defaults. If this option is disabled and the feature is not set on the organization, it will be omitted from the response or Not Found is returned when the organization has no features flags at all. (optional)
   * @return FeatureServiceGetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetOrganizationFeaturesResponse featureServiceGetOrganizationFeatures(String organizationId, Boolean inheritance) throws ApiException {
    return this.featureServiceGetOrganizationFeatures(organizationId, inheritance, Collections.emptyMap());
  }


  /**
   * Get Organization Features
   * Returns all configured features for an organization. Unset fields mean the feature is the current instance default.  Required permissions:  - org.feature.read  - no permission required for the organization the user belongs to
   * @param organizationId  (required)
   * @param inheritance Inherit unset features from the resource owners. This option is recursive: if the flag is set, the resource&#39;s ancestors are consulted up to system defaults. If this option is disabled and the feature is not set on the organization, it will be omitted from the response or Not Found is returned when the organization has no features flags at all. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetOrganizationFeaturesResponse featureServiceGetOrganizationFeatures(String organizationId, Boolean inheritance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (organizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationId' when calling featureServiceGetOrganizationFeatures");
    }
    
    String localVarPath = "/v2/features/organization/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(organizationId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("inheritance", inheritance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<FeatureServiceGetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetOrganizationFeaturesResponse>() {};
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
   * Get System Features
   * Returns all configured features for the system. Unset fields mean the feature is the current system default.  Required permissions:  - none
   * @return FeatureServiceGetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetSystemFeaturesResponse featureServiceGetSystemFeatures() throws ApiException {
    return this.featureServiceGetSystemFeatures(Collections.emptyMap());
  }


  /**
   * Get System Features
   * Returns all configured features for the system. Unset fields mean the feature is the current system default.  Required permissions:  - none
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetSystemFeaturesResponse featureServiceGetSystemFeatures(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/features/system";

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

    TypeReference<FeatureServiceGetSystemFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetSystemFeaturesResponse>() {};
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
   * Get User Features
   * Returns all configured features for a user. Unset fields mean the feature is the current organization default.  Required permissions:  - user.feature.read  - no permission required for the own user
   * @param userId  (required)
   * @param inheritance Inherit unset features from the resource owners. This option is recursive: if the flag is set, the resource&#39;s ancestors are consulted up to system defaults. If this option is disabled and the feature is not set on the user, it will be ommitted from the response or Not Found is returned when the user has no features flags at all. (optional)
   * @return FeatureServiceGetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetUserFeaturesResponse featureServiceGetUserFeatures(String userId, Boolean inheritance) throws ApiException {
    return this.featureServiceGetUserFeatures(userId, inheritance, Collections.emptyMap());
  }


  /**
   * Get User Features
   * Returns all configured features for a user. Unset fields mean the feature is the current organization default.  Required permissions:  - user.feature.read  - no permission required for the own user
   * @param userId  (required)
   * @param inheritance Inherit unset features from the resource owners. This option is recursive: if the flag is set, the resource&#39;s ancestors are consulted up to system defaults. If this option is disabled and the feature is not set on the user, it will be ommitted from the response or Not Found is returned when the user has no features flags at all. (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceGetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceGetUserFeaturesResponse featureServiceGetUserFeatures(String userId, Boolean inheritance, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling featureServiceGetUserFeatures");
    }
    
    String localVarPath = "/v2/features/user/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("inheritance", inheritance));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "zitadelAccessToken" };

    TypeReference<FeatureServiceGetUserFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceGetUserFeaturesResponse>() {};
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
   * Reset Instance Features
   * Deletes ALL configured features for an instance, reverting the behaviors to system defaults.  Required permissions:  - iam.feature.delete
   * @return FeatureServiceResetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetInstanceFeaturesResponse featureServiceResetInstanceFeatures() throws ApiException {
    return this.featureServiceResetInstanceFeatures(Collections.emptyMap());
  }


  /**
   * Reset Instance Features
   * Deletes ALL configured features for an instance, reverting the behaviors to system defaults.  Required permissions:  - iam.feature.delete
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetInstanceFeaturesResponse featureServiceResetInstanceFeatures(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/features/instance";

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

    TypeReference<FeatureServiceResetInstanceFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetInstanceFeaturesResponse>() {};
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
   * Reset Organization Features
   * Deletes ALL configured features for an organization, reverting the behaviors to instance defaults.  Required permissions:  - org.feature.delete
   * @param organizationId  (required)
   * @return FeatureServiceResetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetOrganizationFeaturesResponse featureServiceResetOrganizationFeatures(String organizationId) throws ApiException {
    return this.featureServiceResetOrganizationFeatures(organizationId, Collections.emptyMap());
  }


  /**
   * Reset Organization Features
   * Deletes ALL configured features for an organization, reverting the behaviors to instance defaults.  Required permissions:  - org.feature.delete
   * @param organizationId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetOrganizationFeaturesResponse featureServiceResetOrganizationFeatures(String organizationId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (organizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationId' when calling featureServiceResetOrganizationFeatures");
    }
    
    String localVarPath = "/v2/features/organization/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(organizationId)));

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

    TypeReference<FeatureServiceResetOrganizationFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetOrganizationFeaturesResponse>() {};
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
   * Reset System Features
   * Deletes ALL configured features for the system, reverting the behaviors to system defaults.  Required permissions:  - system.feature.delete
   * @return FeatureServiceResetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetSystemFeaturesResponse featureServiceResetSystemFeatures() throws ApiException {
    return this.featureServiceResetSystemFeatures(Collections.emptyMap());
  }


  /**
   * Reset System Features
   * Deletes ALL configured features for the system, reverting the behaviors to system defaults.  Required permissions:  - system.feature.delete
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetSystemFeaturesResponse featureServiceResetSystemFeatures(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    String localVarPath = "/v2/features/system";

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

    TypeReference<FeatureServiceResetSystemFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetSystemFeaturesResponse>() {};
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
   * Reset User Features
   * Deletes ALL configured features for a user, reverting the behaviors to organization defaults.  Required permissions:  - user.feature.delete
   * @param userId  (required)
   * @return FeatureServiceResetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetUserFeaturesResponse featureServiceResetUserFeatures(String userId) throws ApiException {
    return this.featureServiceResetUserFeatures(userId, Collections.emptyMap());
  }


  /**
   * Reset User Features
   * Deletes ALL configured features for a user, reverting the behaviors to organization defaults.  Required permissions:  - user.feature.delete
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceResetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceResetUserFeaturesResponse featureServiceResetUserFeatures(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling featureServiceResetUserFeatures");
    }
    
    String localVarPath = "/v2/features/user/{userId}"
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

    TypeReference<FeatureServiceResetUserFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceResetUserFeaturesResponse>() {};
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
   * Set Instance Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.  Required permissions:  - iam.feature.write
   * @param featureServiceSetInstanceFeaturesRequest  (required)
   * @return FeatureServiceSetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetInstanceFeaturesResponse featureServiceSetInstanceFeatures(FeatureServiceSetInstanceFeaturesRequest featureServiceSetInstanceFeaturesRequest) throws ApiException {
    return this.featureServiceSetInstanceFeatures(featureServiceSetInstanceFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Set Instance Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.  Required permissions:  - iam.feature.write
   * @param featureServiceSetInstanceFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetInstanceFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetInstanceFeaturesResponse featureServiceSetInstanceFeatures(FeatureServiceSetInstanceFeaturesRequest featureServiceSetInstanceFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceSetInstanceFeaturesRequest;
    
    if (featureServiceSetInstanceFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceSetInstanceFeaturesRequest' when calling featureServiceSetInstanceFeatures");
    }
    
    String localVarPath = "/v2/features/instance";

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
   * Set Organization Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.  Required permissions:  - org.feature.write
   * @param organizationId  (required)
   * @return FeatureServiceSetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetOrganizationFeaturesResponse featureServiceSetOrganizationFeatures(String organizationId) throws ApiException {
    return this.featureServiceSetOrganizationFeatures(organizationId, Collections.emptyMap());
  }


  /**
   * Set Organization Features
   * Configure and set features that apply to a complete instance. Only fields present in the request are set or unset.  Required permissions:  - org.feature.write
   * @param organizationId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetOrganizationFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetOrganizationFeaturesResponse featureServiceSetOrganizationFeatures(String organizationId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (organizationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'organizationId' when calling featureServiceSetOrganizationFeatures");
    }
    
    String localVarPath = "/v2/features/organization/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(organizationId)));

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
   * Set System Features
   * Configure and set features that apply to the complete system. Only fields present in the request are set or unset.  Required permissions:  - system.feature.write
   * @param featureServiceSetSystemFeaturesRequest  (required)
   * @return FeatureServiceSetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetSystemFeaturesResponse featureServiceSetSystemFeatures(FeatureServiceSetSystemFeaturesRequest featureServiceSetSystemFeaturesRequest) throws ApiException {
    return this.featureServiceSetSystemFeatures(featureServiceSetSystemFeaturesRequest, Collections.emptyMap());
  }


  /**
   * Set System Features
   * Configure and set features that apply to the complete system. Only fields present in the request are set or unset.  Required permissions:  - system.feature.write
   * @param featureServiceSetSystemFeaturesRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetSystemFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetSystemFeaturesResponse featureServiceSetSystemFeatures(FeatureServiceSetSystemFeaturesRequest featureServiceSetSystemFeaturesRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = featureServiceSetSystemFeaturesRequest;
    
    if (featureServiceSetSystemFeaturesRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'featureServiceSetSystemFeaturesRequest' when calling featureServiceSetSystemFeatures");
    }
    
    String localVarPath = "/v2/features/system";

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
   * Set User Features
   * Configure and set features that apply to an user. Only fields present in the request are set or unset.  Required permissions:  - user.feature.write
   * @param userId  (required)
   * @return FeatureServiceSetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetUserFeaturesResponse featureServiceSetUserFeatures(String userId) throws ApiException {
    return this.featureServiceSetUserFeatures(userId, Collections.emptyMap());
  }


  /**
   * Set User Features
   * Configure and set features that apply to an user. Only fields present in the request are set or unset.  Required permissions:  - user.feature.write
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FeatureServiceSetUserFeaturesResponse
   * @throws ApiException if fails to make API call
   */
  public FeatureServiceSetUserFeaturesResponse featureServiceSetUserFeatures(String userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling featureServiceSetUserFeatures");
    }
    
    String localVarPath = "/v2/features/user/{userId}"
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

    TypeReference<FeatureServiceSetUserFeaturesResponse> localVarReturnType = new TypeReference<FeatureServiceSetUserFeaturesResponse>() {};
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
