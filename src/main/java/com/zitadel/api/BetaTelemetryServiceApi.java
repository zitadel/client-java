package com.zitadel.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.zitadel.ApiException;
import com.zitadel.ApiClient;
import com.zitadel.BaseApi;
import com.zitadel.Configuration;
import com.zitadel.Pair;

import com.zitadel.model.BetaTelemetryServiceConnectError;
import com.zitadel.model.BetaTelemetryServiceReportBaseInformationRequest;
import com.zitadel.model.BetaTelemetryServiceReportBaseInformationResponse;
import com.zitadel.model.BetaTelemetryServiceReportResourceCountsRequest;
import com.zitadel.model.BetaTelemetryServiceReportResourceCountsResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.github.mridang.codegen.generators.java.BetterJavaCodegen", comments = "Generator version: 7.14.0")
public class BetaTelemetryServiceApi extends BaseApi {

  public BetaTelemetryServiceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public BetaTelemetryServiceApi(ApiClient apiClient) {
    super(apiClient);
  }




  /**
   * ReportBaseInformation is used to report the base information of the ZITADEL system,  including the version, instances, their creation date and domains.  The response contains a report ID to link it to the resource counts or other reports.  The report ID is only valid for the same system ID.
   * ReportBaseInformation is used to report the base information of the ZITADEL system,  including the version, instances, their creation date and domains.  The response contains a report ID to link it to the resource counts or other reports.  The report ID is only valid for the same system ID.
   * @param betaTelemetryServiceReportBaseInformationRequest  (required)
   * @return BetaTelemetryServiceReportBaseInformationResponse
   * @throws ApiException if fails to make API call
   */
  public BetaTelemetryServiceReportBaseInformationResponse reportBaseInformation(BetaTelemetryServiceReportBaseInformationRequest betaTelemetryServiceReportBaseInformationRequest) throws ApiException {
    return this.reportBaseInformation(betaTelemetryServiceReportBaseInformationRequest, Collections.emptyMap());
  }


  /**
   * ReportBaseInformation is used to report the base information of the ZITADEL system,  including the version, instances, their creation date and domains.  The response contains a report ID to link it to the resource counts or other reports.  The report ID is only valid for the same system ID.
   * ReportBaseInformation is used to report the base information of the ZITADEL system,  including the version, instances, their creation date and domains.  The response contains a report ID to link it to the resource counts or other reports.  The report ID is only valid for the same system ID.
   * @param betaTelemetryServiceReportBaseInformationRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaTelemetryServiceReportBaseInformationResponse
   * @throws ApiException if fails to make API call
   */
  private BetaTelemetryServiceReportBaseInformationResponse reportBaseInformation(BetaTelemetryServiceReportBaseInformationRequest betaTelemetryServiceReportBaseInformationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaTelemetryServiceReportBaseInformationRequest;
    
    if (betaTelemetryServiceReportBaseInformationRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaTelemetryServiceReportBaseInformationRequest' when calling reportBaseInformation");
    }
    
    String localVarPath = "/zitadel.analytics.v2beta.TelemetryService/ReportBaseInformation";

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

    TypeReference<BetaTelemetryServiceReportBaseInformationResponse> localVarReturnType = new TypeReference<BetaTelemetryServiceReportBaseInformationResponse>() {};
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
   * ReportResourceCounts is used to report the resource counts such as amount of organizations  or users per organization and much more.  Since the resource counts can be reported in multiple batches,  the response contains a report ID to continue reporting.  The report ID is only valid for the same system ID.
   * ReportResourceCounts is used to report the resource counts such as amount of organizations  or users per organization and much more.  Since the resource counts can be reported in multiple batches,  the response contains a report ID to continue reporting.  The report ID is only valid for the same system ID.
   * @param betaTelemetryServiceReportResourceCountsRequest  (required)
   * @return BetaTelemetryServiceReportResourceCountsResponse
   * @throws ApiException if fails to make API call
   */
  public BetaTelemetryServiceReportResourceCountsResponse reportResourceCounts(BetaTelemetryServiceReportResourceCountsRequest betaTelemetryServiceReportResourceCountsRequest) throws ApiException {
    return this.reportResourceCounts(betaTelemetryServiceReportResourceCountsRequest, Collections.emptyMap());
  }


  /**
   * ReportResourceCounts is used to report the resource counts such as amount of organizations  or users per organization and much more.  Since the resource counts can be reported in multiple batches,  the response contains a report ID to continue reporting.  The report ID is only valid for the same system ID.
   * ReportResourceCounts is used to report the resource counts such as amount of organizations  or users per organization and much more.  Since the resource counts can be reported in multiple batches,  the response contains a report ID to continue reporting.  The report ID is only valid for the same system ID.
   * @param betaTelemetryServiceReportResourceCountsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return BetaTelemetryServiceReportResourceCountsResponse
   * @throws ApiException if fails to make API call
   */
  private BetaTelemetryServiceReportResourceCountsResponse reportResourceCounts(BetaTelemetryServiceReportResourceCountsRequest betaTelemetryServiceReportResourceCountsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = betaTelemetryServiceReportResourceCountsRequest;
    
    if (betaTelemetryServiceReportResourceCountsRequest == null) {
      throw new IllegalArgumentException("Missing the required parameter 'betaTelemetryServiceReportResourceCountsRequest' when calling reportResourceCounts");
    }
    
    String localVarPath = "/zitadel.analytics.v2beta.TelemetryService/ReportResourceCounts";

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

    TypeReference<BetaTelemetryServiceReportResourceCountsResponse> localVarReturnType = new TypeReference<BetaTelemetryServiceReportResourceCountsResponse>() {};
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
