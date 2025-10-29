/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wallee.sdk.service;

import com.fasterxml.jackson.core.type.TypeReference;

import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.BaseApi;
import com.wallee.sdk.Pair;

import com.wallee.sdk.model.AnalyticsQueryExecutionRequest;
import com.wallee.sdk.model.AnalyticsQueryExecutionResponse;
import com.wallee.sdk.model.RestApiErrorResponse;
import com.wallee.sdk.model.ResultPortionModel;
import com.wallee.sdk.model.SubmittedAnalyticsQueryExecution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class AnalyticsQueriesService extends BaseApi {

  public AnalyticsQueriesService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Cancel a query execution
   * 
   
   * @param queryToken Identifies the query execution. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteAnalyticsQueriesQueryToken">Cancel a query execution Documentation</a>
   */
  public void deleteAnalyticsQueriesQueryToken(String queryToken, Long account) throws ApiException {
    this.deleteAnalyticsQueriesQueryToken(queryToken, account, Collections.emptyMap());
  }


  /**
   * Cancel a query execution
   * 
   
   * @param queryToken Identifies the query execution. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteAnalyticsQueriesQueryToken">Cancel a query execution Documentation</a>
   */
  public void deleteAnalyticsQueriesQueryToken(String queryToken, Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'queryToken' is set
    if (queryToken == null) {
      throw new ApiException(400, "Missing the required parameter 'queryToken' when calling deleteAnalyticsQueriesQueryToken");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling deleteAnalyticsQueriesQueryToken");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/queries/{queryToken}"
      .replaceAll("\\{" + "queryToken" + "\\}", apiClient.escapeString(queryToken.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    apiClient.invokeAPI(
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
        null,
        requestTimeout
    );
  }

  /**
   * Get portion of query executions for account
   * 
   
   * @param offset A cursor for pagination, specifies the number of query executions to skip. (required)
   * @param limit A limit on the number of query executions to be returned, between 1 and 100. Default is 100. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @return ResultPortionModel
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getAnalyticsQueries">Get portion of query executions for account Documentation</a>
   */
  public ResultPortionModel getAnalyticsQueries(Integer offset, Integer limit, Long account) throws ApiException {
    return this.getAnalyticsQueries(offset, limit, account, Collections.emptyMap());
  }


  /**
   * Get portion of query executions for account
   * 
   
   * @param offset A cursor for pagination, specifies the number of query executions to skip. (required)
   * @param limit A limit on the number of query executions to be returned, between 1 and 100. Default is 100. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return ResultPortionModel
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getAnalyticsQueries">Get portion of query executions for account Documentation</a>
   */
  public ResultPortionModel getAnalyticsQueries(Integer offset, Integer limit, Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling getAnalyticsQueries");
    }
    
    // verify the required parameter 'limit' is set
    if (limit == null) {
      throw new ApiException(400, "Missing the required parameter 'limit' when calling getAnalyticsQueries");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getAnalyticsQueries");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/queries";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<ResultPortionModel> localVarReturnType = new TypeReference<ResultPortionModel>() {};
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
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Retrieve a query execution information
   * Queries are processed asynchronously and may take several minutes to complete. Avoid frequent requests, as they will not speed up processing.
   * (The read time out for this request is 97 seconds)
   * @param queryToken Identifies the query execution. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @return SubmittedAnalyticsQueryExecution
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getAnalyticsQueriesQueryToken">Retrieve a query execution information Documentation</a>
   */
  public SubmittedAnalyticsQueryExecution getAnalyticsQueriesQueryToken(String queryToken, Long account) throws ApiException {
    return this.getAnalyticsQueriesQueryToken(queryToken, account, Collections.emptyMap());
  }


  /**
   * Retrieve a query execution information
   * Queries are processed asynchronously and may take several minutes to complete. Avoid frequent requests, as they will not speed up processing.
   * (The read time out for this request is 97 seconds)
   * @param queryToken Identifies the query execution. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return SubmittedAnalyticsQueryExecution
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getAnalyticsQueriesQueryToken">Retrieve a query execution information Documentation</a>
   */
  public SubmittedAnalyticsQueryExecution getAnalyticsQueriesQueryToken(String queryToken, Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'queryToken' is set
    if (queryToken == null) {
      throw new ApiException(400, "Missing the required parameter 'queryToken' when calling getAnalyticsQueriesQueryToken");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getAnalyticsQueriesQueryToken");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/queries/{queryToken}"
      .replaceAll("\\{" + "queryToken" + "\\}", apiClient.escapeString(queryToken.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    // The read (connection) time out for this request is 97 seconds.
    int requestTimeout = 97;

    TypeReference<SubmittedAnalyticsQueryExecution> localVarReturnType = new TypeReference<SubmittedAnalyticsQueryExecution>() {};
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
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Generate a temporary URL to download the query result
   * Generate a short-lived (5-minute) URL for downloading the Analytics query result file. Note that each URL generation is counted as a potential download and will be billed accordingly. Do not use this endpoint for periodic checks of file availability. Instead, use the &#39;Retrieve a query execution&#39; endpoint for status checks.
   
   * @param queryToken Identifies the query execution. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getAnalyticsQueriesQueryTokenResult">Generate a temporary URL to download the query result Documentation</a>
   */
  public String getAnalyticsQueriesQueryTokenResult(String queryToken, Long account) throws ApiException {
    return this.getAnalyticsQueriesQueryTokenResult(queryToken, account, Collections.emptyMap());
  }


  /**
   * Generate a temporary URL to download the query result
   * Generate a short-lived (5-minute) URL for downloading the Analytics query result file. Note that each URL generation is counted as a potential download and will be billed accordingly. Do not use this endpoint for periodic checks of file availability. Instead, use the &#39;Retrieve a query execution&#39; endpoint for status checks.
   
   * @param queryToken Identifies the query execution. (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getAnalyticsQueriesQueryTokenResult">Generate a temporary URL to download the query result Documentation</a>
   */
  public String getAnalyticsQueriesQueryTokenResult(String queryToken, Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'queryToken' is set
    if (queryToken == null) {
      throw new ApiException(400, "Missing the required parameter 'queryToken' when calling getAnalyticsQueriesQueryTokenResult");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getAnalyticsQueriesQueryTokenResult");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/queries/{queryToken}/result"
      .replaceAll("\\{" + "queryToken" + "\\}", apiClient.escapeString(queryToken.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
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
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Submit a query execution
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param analyticsQueryExecutionRequest  (required)
   * @return AnalyticsQueryExecutionResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postAnalyticsQueriesSubmit">Submit a query execution Documentation</a>
   */
  public AnalyticsQueryExecutionResponse postAnalyticsQueriesSubmit(Long account, AnalyticsQueryExecutionRequest analyticsQueryExecutionRequest) throws ApiException {
    return this.postAnalyticsQueriesSubmit(account, analyticsQueryExecutionRequest, Collections.emptyMap());
  }


  /**
   * Submit a query execution
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param analyticsQueryExecutionRequest  (required)
   * @param additionalHeaders The additional headers for this call
   * @return AnalyticsQueryExecutionResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postAnalyticsQueriesSubmit">Submit a query execution Documentation</a>
   */
  public AnalyticsQueryExecutionResponse postAnalyticsQueriesSubmit(Long account, AnalyticsQueryExecutionRequest analyticsQueryExecutionRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = analyticsQueryExecutionRequest;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postAnalyticsQueriesSubmit");
    }
    
    // verify the required parameter 'analyticsQueryExecutionRequest' is set
    if (analyticsQueryExecutionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'analyticsQueryExecutionRequest' when calling postAnalyticsQueriesSubmit");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/queries/submit";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<AnalyticsQueryExecutionResponse> localVarReturnType = new TypeReference<AnalyticsQueryExecutionResponse>() {};
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
        localVarReturnType,
        requestTimeout
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

    int requestTimeout = apiClient.getRequestTimeout();

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
        returnType,
        requestTimeout
    );
  }

}
