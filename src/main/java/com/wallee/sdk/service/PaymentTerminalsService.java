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

import com.wallee.sdk.model.PaymentTerminal;
import com.wallee.sdk.model.PaymentTerminalCreate;
import com.wallee.sdk.model.PaymentTerminalTransactionSummaryReference;
import com.wallee.sdk.model.PaymentTerminalUpdate;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;
import com.wallee.sdk.model.TerminalListResponse;
import com.wallee.sdk.model.TerminalSearchResponse;
import com.wallee.sdk.model.Transaction;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class PaymentTerminalsService extends BaseApi {

  public PaymentTerminalsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a payment terminal
   * Permanently deletes a payment terminal. It cannot be undone.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentTerminalsId">Delete a payment terminal Documentation</a>
   */
  public void deletePaymentTerminalsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.deletePaymentTerminalsId(id, space, Collections.emptyMap());
  }


  /**
   * Delete a payment terminal
   * Permanently deletes a payment terminal. It cannot be undone.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentTerminalsId">Delete a payment terminal Documentation</a>
   */
  public void deletePaymentTerminalsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePaymentTerminalsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deletePaymentTerminalsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        requestTimeout,
        null
    );
  }

  /**
   * List all payment terminals
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return TerminalListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminals">List all payment terminals Documentation</a>
   */
  public TerminalListResponse getPaymentTerminals(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getPaymentTerminals(space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all payment terminals
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TerminalListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminals">List all payment terminals Documentation</a>
   */
  public TerminalListResponse getPaymentTerminals(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminals");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals";

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

    TypeReference<TerminalListResponse> localVarReturnType = new TypeReference<TerminalListResponse>() {};
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
   * Retrieve a payment terminal
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return PaymentTerminal
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsId">Retrieve a payment terminal Documentation</a>
   */
  public PaymentTerminal getPaymentTerminalsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getPaymentTerminalsId(id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a payment terminal
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentTerminal
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsId">Retrieve a payment terminal Documentation</a>
   */
  public PaymentTerminal getPaymentTerminalsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentTerminalsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminalsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}"
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

    TypeReference<PaymentTerminal> localVarReturnType = new TypeReference<PaymentTerminal>() {};
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
   * Retrieve till connection credentials
   * 
   
   * @param id  (required)
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param language  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsIdTillConnectionCredentials">Retrieve till connection credentials Documentation</a>
   */
  public String getPaymentTerminalsIdTillConnectionCredentials(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable String language) throws ApiException {
    return this.getPaymentTerminalsIdTillConnectionCredentials(id, transactionId, space, language, Collections.emptyMap());
  }


  /**
   * Retrieve till connection credentials
   * 
   
   * @param id  (required)
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param language  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsIdTillConnectionCredentials">Retrieve till connection credentials Documentation</a>
   */
  public String getPaymentTerminalsIdTillConnectionCredentials(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable String language, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentTerminalsIdTillConnectionCredentials");
    }
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling getPaymentTerminalsIdTillConnectionCredentials");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminalsIdTillConnectionCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}/till-connection-credentials"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("transactionId", transactionId));
    localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
    if (space != null)
      localVarHeaderParams.put("Space", apiClient.parameterToString(space));

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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Search payment terminals
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return TerminalSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsSearch">Search payment terminals Documentation</a>
   */
  public TerminalSearchResponse getPaymentTerminalsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getPaymentTerminalsSearch(space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search payment terminals
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TerminalSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTerminalsSearch">Search payment terminals Documentation</a>
   */
  public TerminalSearchResponse getPaymentTerminalsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTerminalsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/search";

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

    TypeReference<TerminalSearchResponse> localVarReturnType = new TypeReference<TerminalSearchResponse>() {};
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
   * Update a payment terminal
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentTerminalUpdate  (required)
   * @param expand  (optional)
   * @return PaymentTerminal
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentTerminalsId">Update a payment terminal Documentation</a>
   */
  public PaymentTerminal patchPaymentTerminalsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentTerminalUpdate paymentTerminalUpdate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchPaymentTerminalsId(id, space, paymentTerminalUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a payment terminal
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentTerminalUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentTerminal
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentTerminalsId">Update a payment terminal Documentation</a>
   */
  public PaymentTerminal patchPaymentTerminalsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentTerminalUpdate paymentTerminalUpdate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentTerminalUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentTerminalsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentTerminalsId");
    }
    
    // verify the required parameter 'paymentTerminalUpdate' is set
    if (paymentTerminalUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentTerminalUpdate' when calling patchPaymentTerminalsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentTerminal> localVarReturnType = new TypeReference<PaymentTerminal>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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
   * Create a payment terminal
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentTerminalCreate  (required)
   * @param expand  (optional)
   * @return PaymentTerminal
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminals">Create a payment terminal Documentation</a>
   */
  public PaymentTerminal postPaymentTerminals(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentTerminalCreate paymentTerminalCreate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postPaymentTerminals(space, paymentTerminalCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a payment terminal
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentTerminalCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentTerminal
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminals">Create a payment terminal Documentation</a>
   */
  public PaymentTerminal postPaymentTerminals(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentTerminalCreate paymentTerminalCreate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentTerminalCreate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTerminals");
    }
    
    // verify the required parameter 'paymentTerminalCreate' is set
    if (paymentTerminalCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentTerminalCreate' when calling postPaymentTerminals");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<PaymentTerminal> localVarReturnType = new TypeReference<PaymentTerminal>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Perform a payment terminal transaction by identifier
   * Initiates a payment terminal transaction and waits for its completion. If a timeout occurs, retrying will resume the transaction from where it left off.
   * (The read time out for this request is 90 seconds)
   * @param transactionId  (required)
   * @param identifier The unique identifier of the terminal. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param language  (optional)
   * @param expand  (optional)
   * @return Transaction
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsByIdentifierIdentifierPerformTransaction">Perform a payment terminal transaction by identifier Documentation</a>
   */
  public Transaction postPaymentTerminalsByIdentifierIdentifierPerformTransaction(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull String identifier, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable String language, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postPaymentTerminalsByIdentifierIdentifierPerformTransaction(transactionId, identifier, space, language, expand, Collections.emptyMap());
  }


  /**
   * Perform a payment terminal transaction by identifier
   * Initiates a payment terminal transaction and waits for its completion. If a timeout occurs, retrying will resume the transaction from where it left off.
   * (The read time out for this request is 90 seconds)
   * @param transactionId  (required)
   * @param identifier The unique identifier of the terminal. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param language  (optional)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return Transaction
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsByIdentifierIdentifierPerformTransaction">Perform a payment terminal transaction by identifier Documentation</a>
   */
  public Transaction postPaymentTerminalsByIdentifierIdentifierPerformTransaction(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull String identifier, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable String language, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling postPaymentTerminalsByIdentifierIdentifierPerformTransaction");
    }
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling postPaymentTerminalsByIdentifierIdentifierPerformTransaction");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTerminalsByIdentifierIdentifierPerformTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/by-identifier/{identifier}/perform-transaction"
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(apiClient.parameterToString(identifier)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("transactionId", transactionId));
    localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
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

    // The read (connection) time out for this request is 90 seconds.
    int requestTimeout = 90;

    TypeReference<Transaction> localVarReturnType = new TypeReference<Transaction>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Remotely trigger the final balance by identifier
   * 
   
   * @param identifier The unique identifier of the terminal. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @return PaymentTerminalTransactionSummaryReference
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsByIdentifierIdentifierTriggerFinalBalance">Remotely trigger the final balance by identifier Documentation</a>
   */
  public PaymentTerminalTransactionSummaryReference postPaymentTerminalsByIdentifierIdentifierTriggerFinalBalance(@javax.annotation.Nonnull String identifier, @javax.annotation.Nonnull Long space) throws ApiException {
    return this.postPaymentTerminalsByIdentifierIdentifierTriggerFinalBalance(identifier, space, Collections.emptyMap());
  }


  /**
   * Remotely trigger the final balance by identifier
   * 
   
   * @param identifier The unique identifier of the terminal. (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentTerminalTransactionSummaryReference
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsByIdentifierIdentifierTriggerFinalBalance">Remotely trigger the final balance by identifier Documentation</a>
   */
  public PaymentTerminalTransactionSummaryReference postPaymentTerminalsByIdentifierIdentifierTriggerFinalBalance(@javax.annotation.Nonnull String identifier, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling postPaymentTerminalsByIdentifierIdentifierTriggerFinalBalance");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTerminalsByIdentifierIdentifierTriggerFinalBalance");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/by-identifier/{identifier}/trigger-final-balance"
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(apiClient.parameterToString(identifier)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    TypeReference<PaymentTerminalTransactionSummaryReference> localVarReturnType = new TypeReference<PaymentTerminalTransactionSummaryReference>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Link a device with a payment terminal
   * 
   
   * @param id  (required)
   * @param serialNumber  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdLink">Link a device with a payment terminal Documentation</a>
   */
  public void postPaymentTerminalsIdLink(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull String serialNumber, @javax.annotation.Nonnull Long space) throws ApiException {
    this.postPaymentTerminalsIdLink(id, serialNumber, space, Collections.emptyMap());
  }


  /**
   * Link a device with a payment terminal
   * 
   
   * @param id  (required)
   * @param serialNumber  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdLink">Link a device with a payment terminal Documentation</a>
   */
  public void postPaymentTerminalsIdLink(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull String serialNumber, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTerminalsIdLink");
    }
    
    // verify the required parameter 'serialNumber' is set
    if (serialNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'serialNumber' when calling postPaymentTerminalsIdLink");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTerminalsIdLink");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}/link"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("serialNumber", serialNumber));
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

    apiClient.invokeAPI(
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
        requestTimeout,
        null
    );
  }

  /**
   * Perform a payment terminal transaction
   * Initiates a payment terminal transaction and waits for its completion. If a timeout occurs, retrying will resume the transaction from where it left off.
   * (The read time out for this request is 90 seconds)
   * @param id  (required)
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param language  (optional)
   * @param expand  (optional)
   * @return Transaction
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdPerformTransaction">Perform a payment terminal transaction Documentation</a>
   */
  public Transaction postPaymentTerminalsIdPerformTransaction(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable String language, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postPaymentTerminalsIdPerformTransaction(id, transactionId, space, language, expand, Collections.emptyMap());
  }


  /**
   * Perform a payment terminal transaction
   * Initiates a payment terminal transaction and waits for its completion. If a timeout occurs, retrying will resume the transaction from where it left off.
   * (The read time out for this request is 90 seconds)
   * @param id  (required)
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param language  (optional)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return Transaction
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdPerformTransaction">Perform a payment terminal transaction Documentation</a>
   */
  public Transaction postPaymentTerminalsIdPerformTransaction(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable String language, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTerminalsIdPerformTransaction");
    }
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling postPaymentTerminalsIdPerformTransaction");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTerminalsIdPerformTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}/perform-transaction"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("transactionId", transactionId));
    localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
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

    // The read (connection) time out for this request is 90 seconds.
    int requestTimeout = 90;

    TypeReference<Transaction> localVarReturnType = new TypeReference<Transaction>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Remotely trigger the final balance
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @return PaymentTerminalTransactionSummaryReference
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdTriggerFinalBalance">Remotely trigger the final balance Documentation</a>
   */
  public PaymentTerminalTransactionSummaryReference postPaymentTerminalsIdTriggerFinalBalance(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    return this.postPaymentTerminalsIdTriggerFinalBalance(id, space, Collections.emptyMap());
  }


  /**
   * Remotely trigger the final balance
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentTerminalTransactionSummaryReference
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdTriggerFinalBalance">Remotely trigger the final balance Documentation</a>
   */
  public PaymentTerminalTransactionSummaryReference postPaymentTerminalsIdTriggerFinalBalance(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTerminalsIdTriggerFinalBalance");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTerminalsIdTriggerFinalBalance");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}/trigger-final-balance"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    TypeReference<PaymentTerminalTransactionSummaryReference> localVarReturnType = new TypeReference<PaymentTerminalTransactionSummaryReference>() {};
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
        requestTimeout,
        localVarReturnType
    );
  }

  /**
   * Unlink any device from a payment terminal
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdUnlink">Unlink any device from a payment terminal Documentation</a>
   */
  public void postPaymentTerminalsIdUnlink(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.postPaymentTerminalsIdUnlink(id, space, Collections.emptyMap());
  }


  /**
   * Unlink any device from a payment terminal
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTerminalsIdUnlink">Unlink any device from a payment terminal Documentation</a>
   */
  public void postPaymentTerminalsIdUnlink(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTerminalsIdUnlink");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTerminalsIdUnlink");
    }
    
    // create path and map variables
    String localVarPath = "/payment/terminals/{id}/unlink"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    apiClient.invokeAPI(
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
        requestTimeout,
        null
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
