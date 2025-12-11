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

import com.wallee.sdk.model.PaymentTerminalTransactionSummary;
import com.wallee.sdk.model.RenderedTerminalTransactionSummary;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;
import com.wallee.sdk.model.TerminalReceiptFormat;
import com.wallee.sdk.model.TerminalTransactionSummaryListResponse;
import com.wallee.sdk.model.TerminalTransactionSummarySearchResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class PaymentTerminalTransactionSummariesService extends BaseApi {

  public PaymentTerminalTransactionSummariesService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * List all summaries
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return TerminalTransactionSummaryListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummaries">List all summaries Documentation</a>
   */
  public TerminalTransactionSummaryListResponse getPaymentTerminalsTransactionSummaries(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getPaymentTerminalsTransactionSummaries(space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all summaries
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TerminalTransactionSummaryListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummaries">List all summaries Documentation</a>
   */
  public TerminalTransactionSummaryListResponse getPaymentTerminalsTransactionSummaries(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminalsTransactionSummaries");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/transaction-summaries";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("after", after));
    localVarQueryParams.addAll(apiClient.parameterToPair("before", before));
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<TerminalTransactionSummaryListResponse> localVarReturnType = new TypeReference<TerminalTransactionSummaryListResponse>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Retrieve a summary
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return PaymentTerminalTransactionSummary
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummariesId">Retrieve a summary Documentation</a>
   */
  public PaymentTerminalTransactionSummary getPaymentTerminalsTransactionSummariesId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getPaymentTerminalsTransactionSummariesId(id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a summary
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentTerminalTransactionSummary
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummariesId">Retrieve a summary Documentation</a>
   */
  public PaymentTerminalTransactionSummary getPaymentTerminalsTransactionSummariesId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentTerminalsTransactionSummariesId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminalsTransactionSummariesId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/transaction-summaries/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentTerminalTransactionSummary> localVarReturnType = new TypeReference<PaymentTerminalTransactionSummary>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Retrieve a rendered summary receipt
   * 
   
   * @param id  (required)
   * @param format The format specifies how the receipt will be presented in the response. (required)
   * @param width The width defines the dimensions for rendering the document. For PDF format, the width is specified in millimeters, while for text format, it represents the number of characters per line. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @return RenderedTerminalTransactionSummary
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummariesIdReceipt">Retrieve a rendered summary receipt Documentation</a>
   */
  public RenderedTerminalTransactionSummary getPaymentTerminalsTransactionSummariesIdReceipt(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull TerminalReceiptFormat format, @javax.annotation.Nonnull Integer width, @javax.annotation.Nonnull Long space) throws ApiException {
    return this.getPaymentTerminalsTransactionSummariesIdReceipt(id, format, width, space, Collections.emptyMap());
  }


  /**
   * Retrieve a rendered summary receipt
   * 
   
   * @param id  (required)
   * @param format The format specifies how the receipt will be presented in the response. (required)
   * @param width The width defines the dimensions for rendering the document. For PDF format, the width is specified in millimeters, while for text format, it represents the number of characters per line. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return RenderedTerminalTransactionSummary
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummariesIdReceipt">Retrieve a rendered summary receipt Documentation</a>
   */
  public RenderedTerminalTransactionSummary getPaymentTerminalsTransactionSummariesIdReceipt(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull TerminalReceiptFormat format, @javax.annotation.Nonnull Integer width, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentTerminalsTransactionSummariesIdReceipt");
    }
    
    // verify the required parameter 'format' is set
    if (format == null) {
      throw new ApiException(400, "Missing the required parameter 'format' when calling getPaymentTerminalsTransactionSummariesIdReceipt");
    }
    
    // verify the required parameter 'width' is set
    if (width == null) {
      throw new ApiException(400, "Missing the required parameter 'width' when calling getPaymentTerminalsTransactionSummariesIdReceipt");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminalsTransactionSummariesIdReceipt");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/transaction-summaries/{id}/receipt"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
    localVarQueryParams.addAll(apiClient.parameterToPair("width", width));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<RenderedTerminalTransactionSummary> localVarReturnType = new TypeReference<RenderedTerminalTransactionSummary>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Search summaries
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return TerminalTransactionSummarySearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummariesSearch">Search summaries Documentation</a>
   */
  public TerminalTransactionSummarySearchResponse getPaymentTerminalsTransactionSummariesSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getPaymentTerminalsTransactionSummariesSearch(space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search summaries
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TerminalTransactionSummarySearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsTransactionSummariesSearch">Search summaries Documentation</a>
   */
  public TerminalTransactionSummarySearchResponse getPaymentTerminalsTransactionSummariesSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminalsTransactionSummariesSearch");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/transaction-summaries/search";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
    localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<TerminalTransactionSummarySearchResponse> localVarReturnType = new TypeReference<TerminalTransactionSummarySearchResponse>() {};
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
        requestTimeout,
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
        requestTimeout,
        returnType
    );
  }

}
