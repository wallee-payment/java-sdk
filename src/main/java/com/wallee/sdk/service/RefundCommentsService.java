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

import com.wallee.sdk.model.RefundComment;
import com.wallee.sdk.model.RefundCommentActive;
import com.wallee.sdk.model.RefundCommentCreate;
import com.wallee.sdk.model.RefundCommentListResponse;
import com.wallee.sdk.model.RefundCommentSearchResponse;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class RefundCommentsService extends BaseApi {

  public RefundCommentsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a refund comment
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentRefundsRefundIdCommentsId">Delete a refund comment Documentation</a>
   */
  public void deletePaymentRefundsRefundIdCommentsId(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.deletePaymentRefundsRefundIdCommentsId(refundId, id, space, Collections.emptyMap());
  }


  /**
   * Delete a refund comment
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentRefundsRefundIdCommentsId">Delete a refund comment Documentation</a>
   */
  public void deletePaymentRefundsRefundIdCommentsId(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling deletePaymentRefundsRefundIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePaymentRefundsRefundIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deletePaymentRefundsRefundIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments/{id}"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)))
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
   * List all refund comments
   * 
   
   * @param refundId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return RefundCommentListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentRefundsRefundIdComments">List all refund comments Documentation</a>
   */
  public RefundCommentListResponse getPaymentRefundsRefundIdComments(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getPaymentRefundsRefundIdComments(refundId, space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all refund comments
   * 
   
   * @param refundId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return RefundCommentListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentRefundsRefundIdComments">List all refund comments Documentation</a>
   */
  public RefundCommentListResponse getPaymentRefundsRefundIdComments(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling getPaymentRefundsRefundIdComments");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentRefundsRefundIdComments");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)));

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

    TypeReference<RefundCommentListResponse> localVarReturnType = new TypeReference<RefundCommentListResponse>() {};
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
   * Retrieve a refund comment
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return RefundComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentRefundsRefundIdCommentsId">Retrieve a refund comment Documentation</a>
   */
  public RefundComment getPaymentRefundsRefundIdCommentsId(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getPaymentRefundsRefundIdCommentsId(refundId, id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a refund comment
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return RefundComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentRefundsRefundIdCommentsId">Retrieve a refund comment Documentation</a>
   */
  public RefundComment getPaymentRefundsRefundIdCommentsId(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling getPaymentRefundsRefundIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentRefundsRefundIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentRefundsRefundIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments/{id}"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)))
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

    TypeReference<RefundComment> localVarReturnType = new TypeReference<RefundComment>() {};
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
   * Search refund comments
   * 
   
   * @param refundId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return RefundCommentSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentRefundsRefundIdCommentsSearch">Search refund comments Documentation</a>
   */
  public RefundCommentSearchResponse getPaymentRefundsRefundIdCommentsSearch(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getPaymentRefundsRefundIdCommentsSearch(refundId, space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search refund comments
   * 
   
   * @param refundId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return RefundCommentSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentRefundsRefundIdCommentsSearch">Search refund comments Documentation</a>
   */
  public RefundCommentSearchResponse getPaymentRefundsRefundIdCommentsSearch(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling getPaymentRefundsRefundIdCommentsSearch");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentRefundsRefundIdCommentsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments/search"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)));

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

    TypeReference<RefundCommentSearchResponse> localVarReturnType = new TypeReference<RefundCommentSearchResponse>() {};
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
   * Update a refund comment
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param refundCommentActive  (required)
   * @param expand  (optional)
   * @return RefundComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentRefundsRefundIdCommentsId">Update a refund comment Documentation</a>
   */
  public RefundComment patchPaymentRefundsRefundIdCommentsId(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull RefundCommentActive refundCommentActive, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchPaymentRefundsRefundIdCommentsId(refundId, id, space, refundCommentActive, expand, Collections.emptyMap());
  }


  /**
   * Update a refund comment
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param refundCommentActive  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return RefundComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentRefundsRefundIdCommentsId">Update a refund comment Documentation</a>
   */
  public RefundComment patchPaymentRefundsRefundIdCommentsId(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull RefundCommentActive refundCommentActive, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = refundCommentActive;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling patchPaymentRefundsRefundIdCommentsId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentRefundsRefundIdCommentsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentRefundsRefundIdCommentsId");
    }
    
    // verify the required parameter 'refundCommentActive' is set
    if (refundCommentActive == null) {
      throw new ApiException(400, "Missing the required parameter 'refundCommentActive' when calling patchPaymentRefundsRefundIdCommentsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments/{id}"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)))
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

    TypeReference<RefundComment> localVarReturnType = new TypeReference<RefundComment>() {};
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
   * Create a refund comment
   * 
   
   * @param refundId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param refundCommentCreate  (required)
   * @param expand  (optional)
   * @return RefundComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentRefundsRefundIdComments">Create a refund comment Documentation</a>
   */
  public RefundComment postPaymentRefundsRefundIdComments(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull RefundCommentCreate refundCommentCreate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postPaymentRefundsRefundIdComments(refundId, space, refundCommentCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a refund comment
   * 
   
   * @param refundId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param refundCommentCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return RefundComment
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentRefundsRefundIdComments">Create a refund comment Documentation</a>
   */
  public RefundComment postPaymentRefundsRefundIdComments(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull RefundCommentCreate refundCommentCreate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = refundCommentCreate;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling postPaymentRefundsRefundIdComments");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentRefundsRefundIdComments");
    }
    
    // verify the required parameter 'refundCommentCreate' is set
    if (refundCommentCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'refundCommentCreate' when calling postPaymentRefundsRefundIdComments");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)));

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

    TypeReference<RefundComment> localVarReturnType = new TypeReference<RefundComment>() {};
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
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentRefundsRefundIdCommentsIdPin">Pin a comment to the top Documentation</a>
   */
  public void postPaymentRefundsRefundIdCommentsIdPin(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.postPaymentRefundsRefundIdCommentsIdPin(refundId, id, space, Collections.emptyMap());
  }


  /**
   * Pin a comment to the top
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentRefundsRefundIdCommentsIdPin">Pin a comment to the top Documentation</a>
   */
  public void postPaymentRefundsRefundIdCommentsIdPin(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling postPaymentRefundsRefundIdCommentsIdPin");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentRefundsRefundIdCommentsIdPin");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentRefundsRefundIdCommentsIdPin");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments/{id}/pin"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)))
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
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentRefundsRefundIdCommentsIdUnpin">Remove the pinned comment from the top Documentation</a>
   */
  public void postPaymentRefundsRefundIdCommentsIdUnpin(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.postPaymentRefundsRefundIdCommentsIdUnpin(refundId, id, space, Collections.emptyMap());
  }


  /**
   * Remove the pinned comment from the top
   * 
   
   * @param refundId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentRefundsRefundIdCommentsIdUnpin">Remove the pinned comment from the top Documentation</a>
   */
  public void postPaymentRefundsRefundIdCommentsIdUnpin(@javax.annotation.Nonnull Long refundId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'refundId' is set
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling postPaymentRefundsRefundIdCommentsIdUnpin");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPaymentRefundsRefundIdCommentsIdUnpin");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentRefundsRefundIdCommentsIdUnpin");
    }
    
    // create path and map variables
    String localVarPath = "/payment/refunds/{refundId}/comments/{id}/unpin"
      .replaceAll("\\{" + "refundId" + "\\}", apiClient.escapeString(apiClient.parameterToString(refundId)))
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
