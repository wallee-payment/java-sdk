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

import com.wallee.sdk.model.ProductVersionListResponse;
import com.wallee.sdk.model.ProductVersionSearchResponse;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;
import com.wallee.sdk.model.SubscriptionProductVersion;
import com.wallee.sdk.model.SubscriptionProductVersionPending;
import com.wallee.sdk.model.SubscriptionProductVersionRetirement;
import com.wallee.sdk.model.SubscriptionProductVersionRetirementRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class SubscriptionProductVersionsService extends BaseApi {

  public SubscriptionProductVersionsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * List all product versions
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return ProductVersionListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsVersions">List all product versions Documentation</a>
   */
  public ProductVersionListResponse getSubscriptionsProductsVersions(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getSubscriptionsProductsVersions(space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all product versions
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ProductVersionListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsVersions">List all product versions Documentation</a>
   */
  public ProductVersionListResponse getSubscriptionsProductsVersions(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getSubscriptionsProductsVersions");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/versions";

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

    TypeReference<ProductVersionListResponse> localVarReturnType = new TypeReference<ProductVersionListResponse>() {};
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
   * Retrieve a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsVersionsId">Retrieve a product version Documentation</a>
   */
  public SubscriptionProductVersion getSubscriptionsProductsVersionsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getSubscriptionsProductsVersionsId(id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsVersionsId">Retrieve a product version Documentation</a>
   */
  public SubscriptionProductVersion getSubscriptionsProductsVersionsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSubscriptionsProductsVersionsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getSubscriptionsProductsVersionsId");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/versions/{id}"
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

    TypeReference<SubscriptionProductVersion> localVarReturnType = new TypeReference<SubscriptionProductVersion>() {};
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
   * Search product versions
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return ProductVersionSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsVersionsSearch">Search product versions Documentation</a>
   */
  public ProductVersionSearchResponse getSubscriptionsProductsVersionsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getSubscriptionsProductsVersionsSearch(space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search product versions
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ProductVersionSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSubscriptionsProductsVersionsSearch">Search product versions Documentation</a>
   */
  public ProductVersionSearchResponse getSubscriptionsProductsVersionsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getSubscriptionsProductsVersionsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/versions/search";

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

    TypeReference<ProductVersionSearchResponse> localVarReturnType = new TypeReference<ProductVersionSearchResponse>() {};
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
   * Update a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param subscriptionProductVersionPending  (required)
   * @param expand  (optional)
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchSubscriptionsProductsVersionsId">Update a product version Documentation</a>
   */
  public SubscriptionProductVersion patchSubscriptionsProductsVersionsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull SubscriptionProductVersionPending subscriptionProductVersionPending, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchSubscriptionsProductsVersionsId(id, space, subscriptionProductVersionPending, expand, Collections.emptyMap());
  }


  /**
   * Update a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param subscriptionProductVersionPending  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchSubscriptionsProductsVersionsId">Update a product version Documentation</a>
   */
  public SubscriptionProductVersion patchSubscriptionsProductsVersionsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull SubscriptionProductVersionPending subscriptionProductVersionPending, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionProductVersionPending;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchSubscriptionsProductsVersionsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchSubscriptionsProductsVersionsId");
    }
    
    // verify the required parameter 'subscriptionProductVersionPending' is set
    if (subscriptionProductVersionPending == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionProductVersionPending' when calling patchSubscriptionsProductsVersionsId");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/versions/{id}"
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

    TypeReference<SubscriptionProductVersion> localVarReturnType = new TypeReference<SubscriptionProductVersion>() {};
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
   * Create a product version
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param subscriptionProductVersionPending  (required)
   * @param expand  (optional)
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsVersions">Create a product version Documentation</a>
   */
  public SubscriptionProductVersion postSubscriptionsProductsVersions(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull SubscriptionProductVersionPending subscriptionProductVersionPending, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postSubscriptionsProductsVersions(space, subscriptionProductVersionPending, expand, Collections.emptyMap());
  }


  /**
   * Create a product version
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param subscriptionProductVersionPending  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsVersions">Create a product version Documentation</a>
   */
  public SubscriptionProductVersion postSubscriptionsProductsVersions(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull SubscriptionProductVersionPending subscriptionProductVersionPending, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionProductVersionPending;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postSubscriptionsProductsVersions");
    }
    
    // verify the required parameter 'subscriptionProductVersionPending' is set
    if (subscriptionProductVersionPending == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionProductVersionPending' when calling postSubscriptionsProductsVersions");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/versions";

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

    TypeReference<SubscriptionProductVersion> localVarReturnType = new TypeReference<SubscriptionProductVersion>() {};
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
   * Activate a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsVersionsIdActivate">Activate a product version Documentation</a>
   */
  public SubscriptionProductVersion postSubscriptionsProductsVersionsIdActivate(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postSubscriptionsProductsVersionsIdActivate(id, space, expand, Collections.emptyMap());
  }


  /**
   * Activate a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return SubscriptionProductVersion
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsVersionsIdActivate">Activate a product version Documentation</a>
   */
  public SubscriptionProductVersion postSubscriptionsProductsVersionsIdActivate(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postSubscriptionsProductsVersionsIdActivate");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postSubscriptionsProductsVersionsIdActivate");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/versions/{id}/activate"
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

    TypeReference<SubscriptionProductVersion> localVarReturnType = new TypeReference<SubscriptionProductVersion>() {};
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
   * Retire a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param subscriptionProductVersionRetirementRequest  (required)
   * @param expand  (optional)
   * @return SubscriptionProductVersionRetirement
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsVersionsIdRetire">Retire a product version Documentation</a>
   */
  public SubscriptionProductVersionRetirement postSubscriptionsProductsVersionsIdRetire(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull SubscriptionProductVersionRetirementRequest subscriptionProductVersionRetirementRequest, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postSubscriptionsProductsVersionsIdRetire(id, space, subscriptionProductVersionRetirementRequest, expand, Collections.emptyMap());
  }


  /**
   * Retire a product version
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param subscriptionProductVersionRetirementRequest  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return SubscriptionProductVersionRetirement
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSubscriptionsProductsVersionsIdRetire">Retire a product version Documentation</a>
   */
  public SubscriptionProductVersionRetirement postSubscriptionsProductsVersionsIdRetire(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull SubscriptionProductVersionRetirementRequest subscriptionProductVersionRetirementRequest, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = subscriptionProductVersionRetirementRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postSubscriptionsProductsVersionsIdRetire");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postSubscriptionsProductsVersionsIdRetire");
    }
    
    // verify the required parameter 'subscriptionProductVersionRetirementRequest' is set
    if (subscriptionProductVersionRetirementRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionProductVersionRetirementRequest' when calling postSubscriptionsProductsVersionsIdRetire");
    }
    
    // create path and map variables
    String localVarPath = "/subscriptions/products/versions/{id}/retire"
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

    TypeReference<SubscriptionProductVersionRetirement> localVarReturnType = new TypeReference<SubscriptionProductVersionRetirement>() {};
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
