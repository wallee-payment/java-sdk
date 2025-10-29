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

import com.wallee.sdk.model.InvoiceCommentListResponse;
import com.wallee.sdk.model.InvoiceCommentSearchResponse;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;
import com.wallee.sdk.model.TransactionInvoiceComment;
import com.wallee.sdk.model.TransactionInvoiceCommentActive;
import com.wallee.sdk.model.TransactionInvoiceCommentCreate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class TransactionInvoiceCommentsService extends BaseApi {

  public TransactionInvoiceCommentsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a transaction comment
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentTransactionsInvoicesInvoiceIdCommentsId">Delete a transaction comment Documentation</a>
   */
  public void deletePaymentTransactionsInvoicesInvoiceIdCommentsId(Long invoiceId, Long id, Long space) throws ApiException {
    this.deletePaymentTransactionsInvoicesInvoiceIdCommentsId(invoiceId, id, space, Collections.emptyMap());
  }


  /**
   * Delete a transaction comment
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentTransactionsInvoicesInvoiceIdCommentsId">Delete a transaction comment Documentation</a>
   */
  public void deletePaymentTransactionsInvoicesInvoiceIdCommentsId(Long invoiceId, Long id, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling deletePaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deletePaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments/{id}"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        null,
        requestTimeout
    );
  }

  /**
   * List all transaction invoice comments
   * 
   
   * @param invoiceId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return InvoiceCommentListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsInvoicesInvoiceIdComments">List all transaction invoice comments Documentation</a>
   */
  public InvoiceCommentListResponse getPaymentTransactionsInvoicesInvoiceIdComments(Long invoiceId, Long space, Long after, Long before, Set<String> expand, Integer limit, SortingOrder order) throws ApiException {
    return this.getPaymentTransactionsInvoicesInvoiceIdComments(invoiceId, space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all transaction invoice comments
   * 
   
   * @param invoiceId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return InvoiceCommentListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsInvoicesInvoiceIdComments">List all transaction invoice comments Documentation</a>
   */
  public InvoiceCommentListResponse getPaymentTransactionsInvoicesInvoiceIdComments(Long invoiceId, Long space, Long after, Long before, Set<String> expand, Integer limit, SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getPaymentTransactionsInvoicesInvoiceIdComments");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTransactionsInvoicesInvoiceIdComments");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()));

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

    TypeReference<InvoiceCommentListResponse> localVarReturnType = new TypeReference<InvoiceCommentListResponse>() {};
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
   * Retrieve a transaction invoice comment
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return TransactionInvoiceComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsInvoicesInvoiceIdCommentsId">Retrieve a transaction invoice comment Documentation</a>
   */
  public TransactionInvoiceComment getPaymentTransactionsInvoicesInvoiceIdCommentsId(Long invoiceId, Long id, Long space, Set<String> expand) throws ApiException {
    return this.getPaymentTransactionsInvoicesInvoiceIdCommentsId(invoiceId, id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a transaction invoice comment
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionInvoiceComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsInvoicesInvoiceIdCommentsId">Retrieve a transaction invoice comment Documentation</a>
   */
  public TransactionInvoiceComment getPaymentTransactionsInvoicesInvoiceIdCommentsId(Long invoiceId, Long id, Long space, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getPaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments/{id}"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    TypeReference<TransactionInvoiceComment> localVarReturnType = new TypeReference<TransactionInvoiceComment>() {};
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
   * Search transaction invoice comments
   * 
   
   * @param invoiceId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return InvoiceCommentSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsInvoicesInvoiceIdCommentsSearch">Search transaction invoice comments Documentation</a>
   */
  public InvoiceCommentSearchResponse getPaymentTransactionsInvoicesInvoiceIdCommentsSearch(Long invoiceId, Long space, Set<String> expand, Integer limit, Integer offset, String order, String query) throws ApiException {
    return this.getPaymentTransactionsInvoicesInvoiceIdCommentsSearch(invoiceId, space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search transaction invoice comments
   * 
   
   * @param invoiceId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return InvoiceCommentSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentTransactionsInvoicesInvoiceIdCommentsSearch">Search transaction invoice comments Documentation</a>
   */
  public InvoiceCommentSearchResponse getPaymentTransactionsInvoicesInvoiceIdCommentsSearch(Long invoiceId, Long space, Set<String> expand, Integer limit, Integer offset, String order, String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling getPaymentTransactionsInvoicesInvoiceIdCommentsSearch");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentTransactionsInvoicesInvoiceIdCommentsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments/search"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()));

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

    TypeReference<InvoiceCommentSearchResponse> localVarReturnType = new TypeReference<InvoiceCommentSearchResponse>() {};
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
   * Update a transaction comment
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionInvoiceCommentActive  (required)
   * @param expand  (optional)
   * @return TransactionInvoiceComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentTransactionsInvoicesInvoiceIdCommentsId">Update a transaction comment Documentation</a>
   */
  public TransactionInvoiceComment patchPaymentTransactionsInvoicesInvoiceIdCommentsId(Long invoiceId, Long id, Long space, TransactionInvoiceCommentActive transactionInvoiceCommentActive, Set<String> expand) throws ApiException {
    return this.patchPaymentTransactionsInvoicesInvoiceIdCommentsId(invoiceId, id, space, transactionInvoiceCommentActive, expand, Collections.emptyMap());
  }


  /**
   * Update a transaction comment
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionInvoiceCommentActive  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionInvoiceComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentTransactionsInvoicesInvoiceIdCommentsId">Update a transaction comment Documentation</a>
   */
  public TransactionInvoiceComment patchPaymentTransactionsInvoicesInvoiceIdCommentsId(Long invoiceId, Long id, Long space, TransactionInvoiceCommentActive transactionInvoiceCommentActive, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionInvoiceCommentActive;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling patchPaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // verify the required parameter 'transactionInvoiceCommentActive' is set
    if (transactionInvoiceCommentActive == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionInvoiceCommentActive' when calling patchPaymentTransactionsInvoicesInvoiceIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments/{id}"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    TypeReference<TransactionInvoiceComment> localVarReturnType = new TypeReference<TransactionInvoiceComment>() {};
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
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Create a transaction invoice comment
   * 
   
   * @param invoiceId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionInvoiceCommentCreate  (required)
   * @param expand  (optional)
   * @return TransactionInvoiceComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsInvoicesInvoiceIdComments">Create a transaction invoice comment Documentation</a>
   */
  public TransactionInvoiceComment postPaymentTransactionsInvoicesInvoiceIdComments(Long invoiceId, Long space, TransactionInvoiceCommentCreate transactionInvoiceCommentCreate, Set<String> expand) throws ApiException {
    return this.postPaymentTransactionsInvoicesInvoiceIdComments(invoiceId, space, transactionInvoiceCommentCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a transaction invoice comment
   * 
   
   * @param invoiceId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param transactionInvoiceCommentCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return TransactionInvoiceComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsInvoicesInvoiceIdComments">Create a transaction invoice comment Documentation</a>
   */
  public TransactionInvoiceComment postPaymentTransactionsInvoicesInvoiceIdComments(Long invoiceId, Long space, TransactionInvoiceCommentCreate transactionInvoiceCommentCreate, Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionInvoiceCommentCreate;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling postPaymentTransactionsInvoicesInvoiceIdComments");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTransactionsInvoicesInvoiceIdComments");
    }
    
    // verify the required parameter 'transactionInvoiceCommentCreate' is set
    if (transactionInvoiceCommentCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionInvoiceCommentCreate' when calling postPaymentTransactionsInvoicesInvoiceIdComments");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()));

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

    TypeReference<TransactionInvoiceComment> localVarReturnType = new TypeReference<TransactionInvoiceComment>() {};
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

  /**
   * Pin a comment to the top
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin">Pin a comment to the top Documentation</a>
   */
  public void postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin(Long invoiceId, Long id, Long space) throws ApiException {
    this.postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin(invoiceId, id, space, Collections.emptyMap());
  }


  /**
   * Pin a comment to the top
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin">Pin a comment to the top Documentation</a>
   */
  public void postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin(Long invoiceId, Long id, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTransactionsInvoicesInvoiceIdCommentsIdPin");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments/{id}/pin"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        null,
        requestTimeout
    );
  }

  /**
   * Remove the pinned comment from the top
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin">Remove the pinned comment from the top Documentation</a>
   */
  public void postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin(Long invoiceId, Long id, Long space) throws ApiException {
    this.postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin(invoiceId, id, space, Collections.emptyMap());
  }


  /**
   * Remove the pinned comment from the top
   * 
   
   * @param invoiceId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin">Remove the pinned comment from the top Documentation</a>
   */
  public void postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin(Long invoiceId, Long id, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceId' is set
    if (invoiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceId' when calling postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentTransactionsInvoicesInvoiceIdCommentsIdUnpin");
    }
    
    // create path and map variables
    String localVarPath = "/payment/transactions/invoices/{invoiceId}/comments/{id}/unpin"
      .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        null,
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
