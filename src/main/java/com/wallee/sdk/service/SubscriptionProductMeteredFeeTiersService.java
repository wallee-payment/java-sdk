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

import com.wallee.sdk.model.ProductMeteredFeeTierListResponse;
import com.wallee.sdk.model.ProductMeteredFeeTierSearchResponse;
import com.wallee.sdk.model.ProductMeteredTierFee;
import com.wallee.sdk.model.ProductMeteredTierFeeUpdate;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class SubscriptionProductMeteredFeeTiersService extends BaseApi {

  public SubscriptionProductMeteredFeeTiersService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteSubscriptionsProductsMeteredFeesFeeIdTiersId">Delete a metered fee tier Documentation</a>
   */
  public void deleteSubscriptionsProductsMeteredFeesFeeIdTiersId(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.deleteSubscriptionsProductsMeteredFeesFeeIdTiersId(feeId, id, space, Collections.emptyMap());
  }


  /**
   * Delete a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteSubscriptionsProductsMeteredFeesFeeIdTiersId">Delete a metered fee tier Documentation</a>
   */
  public void deleteSubscriptionsProductsMeteredFeesFeeIdTiersId(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'feeId' is set
    if (feeId == null) {
      throw new ApiException(400, "Missing the required parameter 'feeId' when calling deleteSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deleteSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/metered-fees/{feeId}/tiers/{id}"
      .replaceAll("\\{" + "feeId" + "\\}", apiClient.escapeString(apiClient.parameterToString(feeId)))
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
   * List all metered fee tiers
   * 
   
   * @param feeId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return ProductMeteredFeeTierListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsMeteredFeesFeeIdTiers">List all metered fee tiers Documentation</a>
   */
  public ProductMeteredFeeTierListResponse getSubscriptionsProductsMeteredFeesFeeIdTiers(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getSubscriptionsProductsMeteredFeesFeeIdTiers(feeId, space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all metered fee tiers
   * 
   
   * @param feeId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ProductMeteredFeeTierListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsMeteredFeesFeeIdTiers">List all metered fee tiers Documentation</a>
   */
  public ProductMeteredFeeTierListResponse getSubscriptionsProductsMeteredFeesFeeIdTiers(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'feeId' is set
    if (feeId == null) {
      throw new ApiException(400, "Missing the required parameter 'feeId' when calling getSubscriptionsProductsMeteredFeesFeeIdTiers");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getSubscriptionsProductsMeteredFeesFeeIdTiers");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/metered-fees/{feeId}/tiers"
      .replaceAll("\\{" + "feeId" + "\\}", apiClient.escapeString(apiClient.parameterToString(feeId)));

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

    TypeReference<ProductMeteredFeeTierListResponse> localVarReturnType = new TypeReference<ProductMeteredFeeTierListResponse>() {};
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
   * Retrieve a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return ProductMeteredTierFee
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsMeteredFeesFeeIdTiersId">Retrieve a metered fee tier Documentation</a>
   */
  public ProductMeteredTierFee getSubscriptionsProductsMeteredFeesFeeIdTiersId(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getSubscriptionsProductsMeteredFeesFeeIdTiersId(feeId, id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ProductMeteredTierFee
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsMeteredFeesFeeIdTiersId">Retrieve a metered fee tier Documentation</a>
   */
  public ProductMeteredTierFee getSubscriptionsProductsMeteredFeesFeeIdTiersId(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'feeId' is set
    if (feeId == null) {
      throw new ApiException(400, "Missing the required parameter 'feeId' when calling getSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/metered-fees/{feeId}/tiers/{id}"
      .replaceAll("\\{" + "feeId" + "\\}", apiClient.escapeString(apiClient.parameterToString(feeId)))
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

    TypeReference<ProductMeteredTierFee> localVarReturnType = new TypeReference<ProductMeteredTierFee>() {};
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
   * Search metered fee tiers
   * 
   
   * @param feeId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return ProductMeteredFeeTierSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsMeteredFeesFeeIdTiersSearch">Search metered fee tiers Documentation</a>
   */
  public ProductMeteredFeeTierSearchResponse getSubscriptionsProductsMeteredFeesFeeIdTiersSearch(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getSubscriptionsProductsMeteredFeesFeeIdTiersSearch(feeId, space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search metered fee tiers
   * 
   
   * @param feeId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ProductMeteredFeeTierSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsMeteredFeesFeeIdTiersSearch">Search metered fee tiers Documentation</a>
   */
  public ProductMeteredFeeTierSearchResponse getSubscriptionsProductsMeteredFeesFeeIdTiersSearch(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'feeId' is set
    if (feeId == null) {
      throw new ApiException(400, "Missing the required parameter 'feeId' when calling getSubscriptionsProductsMeteredFeesFeeIdTiersSearch");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getSubscriptionsProductsMeteredFeesFeeIdTiersSearch");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/metered-fees/{feeId}/tiers/search"
      .replaceAll("\\{" + "feeId" + "\\}", apiClient.escapeString(apiClient.parameterToString(feeId)));

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

    TypeReference<ProductMeteredFeeTierSearchResponse> localVarReturnType = new TypeReference<ProductMeteredFeeTierSearchResponse>() {};
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
   * Update a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param productMeteredTierFeeUpdate  (required)
   * @param expand  (optional)
   * @return ProductMeteredTierFee
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchSubscriptionsProductsMeteredFeesFeeIdTiersId">Update a metered fee tier Documentation</a>
   */
  public ProductMeteredTierFee patchSubscriptionsProductsMeteredFeesFeeIdTiersId(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ProductMeteredTierFeeUpdate productMeteredTierFeeUpdate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchSubscriptionsProductsMeteredFeesFeeIdTiersId(feeId, id, space, productMeteredTierFeeUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param productMeteredTierFeeUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ProductMeteredTierFee
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchSubscriptionsProductsMeteredFeesFeeIdTiersId">Update a metered fee tier Documentation</a>
   */
  public ProductMeteredTierFee patchSubscriptionsProductsMeteredFeesFeeIdTiersId(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ProductMeteredTierFeeUpdate productMeteredTierFeeUpdate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = productMeteredTierFeeUpdate;
    
    // verify the required parameter 'feeId' is set
    if (feeId == null) {
      throw new ApiException(400, "Missing the required parameter 'feeId' when calling patchSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // verify the required parameter 'productMeteredTierFeeUpdate' is set
    if (productMeteredTierFeeUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'productMeteredTierFeeUpdate' when calling patchSubscriptionsProductsMeteredFeesFeeIdTiersId");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/metered-fees/{feeId}/tiers/{id}"
      .replaceAll("\\{" + "feeId" + "\\}", apiClient.escapeString(apiClient.parameterToString(feeId)))
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

    TypeReference<ProductMeteredTierFee> localVarReturnType = new TypeReference<ProductMeteredTierFee>() {};
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
   * Create a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param productMeteredTierFeeUpdate  (required)
   * @param expand  (optional)
   * @return ProductMeteredTierFee
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsMeteredFeesFeeIdTiers">Create a metered fee tier Documentation</a>
   */
  public ProductMeteredTierFee postSubscriptionsProductsMeteredFeesFeeIdTiers(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ProductMeteredTierFeeUpdate productMeteredTierFeeUpdate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postSubscriptionsProductsMeteredFeesFeeIdTiers(feeId, space, productMeteredTierFeeUpdate, expand, Collections.emptyMap());
  }


  /**
   * Create a metered fee tier
   * 
   
   * @param feeId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param productMeteredTierFeeUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ProductMeteredTierFee
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsMeteredFeesFeeIdTiers">Create a metered fee tier Documentation</a>
   */
  public ProductMeteredTierFee postSubscriptionsProductsMeteredFeesFeeIdTiers(@javax.annotation.Nonnull Long feeId, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ProductMeteredTierFeeUpdate productMeteredTierFeeUpdate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = productMeteredTierFeeUpdate;
    
    // verify the required parameter 'feeId' is set
    if (feeId == null) {
      throw new ApiException(400, "Missing the required parameter 'feeId' when calling postSubscriptionsProductsMeteredFeesFeeIdTiers");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postSubscriptionsProductsMeteredFeesFeeIdTiers");
    }
    
    // verify the required parameter 'productMeteredTierFeeUpdate' is set
    if (productMeteredTierFeeUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'productMeteredTierFeeUpdate' when calling postSubscriptionsProductsMeteredFeesFeeIdTiers");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/metered-fees/{feeId}/tiers"
      .replaceAll("\\{" + "feeId" + "\\}", apiClient.escapeString(apiClient.parameterToString(feeId)));

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

    TypeReference<ProductMeteredTierFee> localVarReturnType = new TypeReference<ProductMeteredTierFee>() {};
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
        requestTimeout,
        returnType
    );
  }

}
