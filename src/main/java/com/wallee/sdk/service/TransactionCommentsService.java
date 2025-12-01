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

import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;
import com.wallee.sdk.model.TransactionComment;
import com.wallee.sdk.model.TransactionCommentActive;
import com.wallee.sdk.model.TransactionCommentCreate;
import com.wallee.sdk.model.TransactionCommentListResponse;
import com.wallee.sdk.model.TransactionCommentSearchResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class TransactionCommentsService extends BaseApi {

  public TransactionCommentsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentTransactionsTransactionIdCommentsId">Delete a transaction comment Documentation</a>
   */
  public void deletePaymentTransactionsTransactionIdCommentsId(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.deletePaymentTransactionsTransactionIdCommentsId(transactionId, id, space, Collections.emptyMap());
  }


  /**
   * Delete a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentTransactionsTransactionIdCommentsId">Delete a transaction comment Documentation</a>
   */
  public void deletePaymentTransactionsTransactionIdCommentsId(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling deletePaymentTransactionsTransactionIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePaymentTransactionsTransactionIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deletePaymentTransactionsTransactionIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments/{id}"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)))
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
   * List all transaction comments
   * 
   
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return TransactionCommentListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsTransactionIdComments">List all transaction comments Documentation</a>
   */
  public TransactionCommentListResponse getPaymentTransactionsTransactionIdComments(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getPaymentTransactionsTransactionIdComments(transactionId, space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all transaction comments
   * 
   
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionCommentListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsTransactionIdComments">List all transaction comments Documentation</a>
   */
  public TransactionCommentListResponse getPaymentTransactionsTransactionIdComments(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling getPaymentTransactionsTransactionIdComments");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTransactionsTransactionIdComments");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)));

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

    TypeReference<TransactionCommentListResponse> localVarReturnType = new TypeReference<TransactionCommentListResponse>() {};
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
   * Retrieve a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return TransactionComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsTransactionIdCommentsId">Retrieve a transaction comment Documentation</a>
   */
  public TransactionComment getPaymentTransactionsTransactionIdCommentsId(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getPaymentTransactionsTransactionIdCommentsId(transactionId, id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsTransactionIdCommentsId">Retrieve a transaction comment Documentation</a>
   */
  public TransactionComment getPaymentTransactionsTransactionIdCommentsId(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling getPaymentTransactionsTransactionIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentTransactionsTransactionIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTransactionsTransactionIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments/{id}"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)))
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

    TypeReference<TransactionComment> localVarReturnType = new TypeReference<TransactionComment>() {};
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
   * Search transaction comments
   * 
   
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return TransactionCommentSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsTransactionIdCommentsSearch">Search transaction comments Documentation</a>
   */
  public TransactionCommentSearchResponse getPaymentTransactionsTransactionIdCommentsSearch(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getPaymentTransactionsTransactionIdCommentsSearch(transactionId, space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search transaction comments
   * 
   
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionCommentSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsTransactionIdCommentsSearch">Search transaction comments Documentation</a>
   */
  public TransactionCommentSearchResponse getPaymentTransactionsTransactionIdCommentsSearch(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling getPaymentTransactionsTransactionIdCommentsSearch");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTransactionsTransactionIdCommentsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments/search"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)));

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

    TypeReference<TransactionCommentSearchResponse> localVarReturnType = new TypeReference<TransactionCommentSearchResponse>() {};
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
   * Update a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionCommentActive  (required)
   * @param expand  (optional)
   * @return TransactionComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentTransactionsTransactionIdCommentsId">Update a transaction comment Documentation</a>
   */
  public TransactionComment patchPaymentTransactionsTransactionIdCommentsId(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull TransactionCommentActive transactionCommentActive, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchPaymentTransactionsTransactionIdCommentsId(transactionId, id, space, transactionCommentActive, expand, Collections.emptyMap());
  }


  /**
   * Update a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionCommentActive  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentTransactionsTransactionIdCommentsId">Update a transaction comment Documentation</a>
   */
  public TransactionComment patchPaymentTransactionsTransactionIdCommentsId(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull TransactionCommentActive transactionCommentActive, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionCommentActive;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling patchPaymentTransactionsTransactionIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentTransactionsTransactionIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentTransactionsTransactionIdCommentsId");
    }
    
    // verify the required parameter 'transactionCommentActive' is set
    if (transactionCommentActive == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionCommentActive' when calling patchPaymentTransactionsTransactionIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments/{id}"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)))
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

    TypeReference<TransactionComment> localVarReturnType = new TypeReference<TransactionComment>() {};
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
   * Create a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionCommentCreate  (required)
   * @param expand  (optional)
   * @return TransactionComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsTransactionIdComments">Create a transaction comment Documentation</a>
   */
  public TransactionComment postPaymentTransactionsTransactionIdComments(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull TransactionCommentCreate transactionCommentCreate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postPaymentTransactionsTransactionIdComments(transactionId, space, transactionCommentCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a transaction comment
   * 
   
   * @param transactionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionCommentCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsTransactionIdComments">Create a transaction comment Documentation</a>
   */
  public TransactionComment postPaymentTransactionsTransactionIdComments(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull TransactionCommentCreate transactionCommentCreate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionCommentCreate;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling postPaymentTransactionsTransactionIdComments");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTransactionsTransactionIdComments");
    }
    
    // verify the required parameter 'transactionCommentCreate' is set
    if (transactionCommentCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionCommentCreate' when calling postPaymentTransactionsTransactionIdComments");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)));

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

    TypeReference<TransactionComment> localVarReturnType = new TypeReference<TransactionComment>() {};
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
   * Pin a comment to the top
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsTransactionIdCommentsIdPin">Pin a comment to the top Documentation</a>
   */
  public void postPaymentTransactionsTransactionIdCommentsIdPin(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.postPaymentTransactionsTransactionIdCommentsIdPin(transactionId, id, space, Collections.emptyMap());
  }


  /**
   * Pin a comment to the top
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsTransactionIdCommentsIdPin">Pin a comment to the top Documentation</a>
   */
  public void postPaymentTransactionsTransactionIdCommentsIdPin(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling postPaymentTransactionsTransactionIdCommentsIdPin");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTransactionsTransactionIdCommentsIdPin");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTransactionsTransactionIdCommentsIdPin");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments/{id}/pin"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)))
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

  /**
   * Remove the pinned comment from the top
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsTransactionIdCommentsIdUnpin">Remove the pinned comment from the top Documentation</a>
   */
  public void postPaymentTransactionsTransactionIdCommentsIdUnpin(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.postPaymentTransactionsTransactionIdCommentsIdUnpin(transactionId, id, space, Collections.emptyMap());
  }


  /**
   * Remove the pinned comment from the top
   * 
   
   * @param transactionId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsTransactionIdCommentsIdUnpin">Remove the pinned comment from the top Documentation</a>
   */
  public void postPaymentTransactionsTransactionIdCommentsIdUnpin(@javax.annotation.Nonnull Long transactionId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling postPaymentTransactionsTransactionIdCommentsIdUnpin");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTransactionsTransactionIdCommentsIdUnpin");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTransactionsTransactionIdCommentsIdUnpin");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/{transactionId}/comments/{id}/unpin"
      .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(apiClient.parameterToString(transactionId)))
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
