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
import com.wallee.sdk.model.WalleejoinCreatePartnershipRequestDto;
import com.wallee.sdk.model.WalleejoinPartnershipCreate;
import com.wallee.sdk.model.WalleejoinPartnershipResponseDto;
import com.wallee.sdk.model.WalleejoinPartnershipResponseDtoListResponse;
import com.wallee.sdk.model.WalleejoinPartnershipResponseDtoSearchResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class JoinPartnershipService extends BaseApi {

  public JoinPartnershipService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a join partnership
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteJoinProgramPartnershipsId">Delete a join partnership Documentation</a>
   */
  public void deleteJoinProgramPartnershipsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account) throws ApiException {
    this.deleteJoinProgramPartnershipsId(id, account, Collections.emptyMap());
  }


  /**
   * Delete a join partnership
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteJoinProgramPartnershipsId">Delete a join partnership Documentation</a>
   */
  public void deleteJoinProgramPartnershipsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteJoinProgramPartnershipsId");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling deleteJoinProgramPartnershipsId");
    }
    
    // create path and map variables
    String localVarPath = "/join-program/partnerships/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (account != null)
      localVarHeaderParams.put("account", apiClient.parameterToString(account));

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
   * List all join partnerships
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return WalleejoinPartnershipResponseDtoListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getJoinProgramPartnerships">List all join partnerships Documentation</a>
   */
  public WalleejoinPartnershipResponseDtoListResponse getJoinProgramPartnerships(@javax.annotation.Nonnull Long account, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getJoinProgramPartnerships(account, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all join partnerships
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinPartnershipResponseDtoListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getJoinProgramPartnerships">List all join partnerships Documentation</a>
   */
  public WalleejoinPartnershipResponseDtoListResponse getJoinProgramPartnerships(@javax.annotation.Nonnull Long account, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getJoinProgramPartnerships");
    }
    
    // create path and map variables
    String localVarPath = "/join-program/partnerships";

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
    if (account != null)
      localVarHeaderParams.put("account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<WalleejoinPartnershipResponseDtoListResponse> localVarReturnType = new TypeReference<WalleejoinPartnershipResponseDtoListResponse>() {};
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
   * Retrieve a join partnership
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @return WalleejoinPartnershipResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getJoinProgramPartnershipsId">Retrieve a join partnership Documentation</a>
   */
  public WalleejoinPartnershipResponseDto getJoinProgramPartnershipsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getJoinProgramPartnershipsId(id, account, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a join partnership
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinPartnershipResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getJoinProgramPartnershipsId">Retrieve a join partnership Documentation</a>
   */
  public WalleejoinPartnershipResponseDto getJoinProgramPartnershipsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getJoinProgramPartnershipsId");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getJoinProgramPartnershipsId");
    }
    
    // create path and map variables
    String localVarPath = "/join-program/partnerships/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (account != null)
      localVarHeaderParams.put("account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<WalleejoinPartnershipResponseDto> localVarReturnType = new TypeReference<WalleejoinPartnershipResponseDto>() {};
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
   * Search join partnerships
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return WalleejoinPartnershipResponseDtoSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getJoinProgramPartnershipsSearch">Search join partnerships Documentation</a>
   */
  public WalleejoinPartnershipResponseDtoSearchResponse getJoinProgramPartnershipsSearch(@javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getJoinProgramPartnershipsSearch(account, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search join partnerships
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinPartnershipResponseDtoSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getJoinProgramPartnershipsSearch">Search join partnerships Documentation</a>
   */
  public WalleejoinPartnershipResponseDtoSearchResponse getJoinProgramPartnershipsSearch(@javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getJoinProgramPartnershipsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/join-program/partnerships/search";

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
    if (account != null)
      localVarHeaderParams.put("account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<WalleejoinPartnershipResponseDtoSearchResponse> localVarReturnType = new TypeReference<WalleejoinPartnershipResponseDtoSearchResponse>() {};
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
   * Create a join account partnership
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param walleejoinCreatePartnershipRequestDto  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postJoinProgramPartnershipsCreateAffiliate">Create a join account partnership Documentation</a>
   */
  public Object postJoinProgramPartnershipsCreateAffiliate(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull WalleejoinCreatePartnershipRequestDto walleejoinCreatePartnershipRequestDto) throws ApiException {
    return this.postJoinProgramPartnershipsCreateAffiliate(account, walleejoinCreatePartnershipRequestDto, Collections.emptyMap());
  }


  /**
   * Create a join account partnership
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param walleejoinCreatePartnershipRequestDto  (required)
   * @param additionalHeaders The additional headers for this call
   * @return Object
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postJoinProgramPartnershipsCreateAffiliate">Create a join account partnership Documentation</a>
   */
  public Object postJoinProgramPartnershipsCreateAffiliate(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull WalleejoinCreatePartnershipRequestDto walleejoinCreatePartnershipRequestDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = walleejoinCreatePartnershipRequestDto;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postJoinProgramPartnershipsCreateAffiliate");
    }
    
    // verify the required parameter 'walleejoinCreatePartnershipRequestDto' is set
    if (walleejoinCreatePartnershipRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'walleejoinCreatePartnershipRequestDto' when calling postJoinProgramPartnershipsCreateAffiliate");
    }
    
    // create path and map variables
    String localVarPath = "/join-program/partnerships/create-affiliate";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (account != null)
      localVarHeaderParams.put("account", apiClient.parameterToString(account));

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

    TypeReference<Object> localVarReturnType = new TypeReference<Object>() {};
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
   * Create a join platform partnership
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param walleejoinCreatePartnershipRequestDto  (required)
   * @param expand  (optional)
   * @return WalleejoinPartnershipResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postJoinProgramPartnershipsCreateIsv">Create a join platform partnership Documentation</a>
   */
  public WalleejoinPartnershipResponseDto postJoinProgramPartnershipsCreateIsv(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull WalleejoinCreatePartnershipRequestDto walleejoinCreatePartnershipRequestDto, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postJoinProgramPartnershipsCreateIsv(account, walleejoinCreatePartnershipRequestDto, expand, Collections.emptyMap());
  }


  /**
   * Create a join platform partnership
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param walleejoinCreatePartnershipRequestDto  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinPartnershipResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postJoinProgramPartnershipsCreateIsv">Create a join platform partnership Documentation</a>
   */
  public WalleejoinPartnershipResponseDto postJoinProgramPartnershipsCreateIsv(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull WalleejoinCreatePartnershipRequestDto walleejoinCreatePartnershipRequestDto, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = walleejoinCreatePartnershipRequestDto;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postJoinProgramPartnershipsCreateIsv");
    }
    
    // verify the required parameter 'walleejoinCreatePartnershipRequestDto' is set
    if (walleejoinCreatePartnershipRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'walleejoinCreatePartnershipRequestDto' when calling postJoinProgramPartnershipsCreateIsv");
    }
    
    // create path and map variables
    String localVarPath = "/join-program/partnerships/create-isv";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (account != null)
      localVarHeaderParams.put("account", apiClient.parameterToString(account));

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

    TypeReference<WalleejoinPartnershipResponseDto> localVarReturnType = new TypeReference<WalleejoinPartnershipResponseDto>() {};
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
   * Create a join partnership for an existing merchant
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param walleejoinPartnershipCreate  (required)
   * @param expand  (optional)
   * @return WalleejoinPartnershipResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postJoinProgramPartnershipsCreateSimple">Create a join partnership for an existing merchant Documentation</a>
   */
  public WalleejoinPartnershipResponseDto postJoinProgramPartnershipsCreateSimple(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull WalleejoinPartnershipCreate walleejoinPartnershipCreate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postJoinProgramPartnershipsCreateSimple(account, walleejoinPartnershipCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a join partnership for an existing merchant
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param walleejoinPartnershipCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinPartnershipResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postJoinProgramPartnershipsCreateSimple">Create a join partnership for an existing merchant Documentation</a>
   */
  public WalleejoinPartnershipResponseDto postJoinProgramPartnershipsCreateSimple(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull WalleejoinPartnershipCreate walleejoinPartnershipCreate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = walleejoinPartnershipCreate;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postJoinProgramPartnershipsCreateSimple");
    }
    
    // verify the required parameter 'walleejoinPartnershipCreate' is set
    if (walleejoinPartnershipCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'walleejoinPartnershipCreate' when calling postJoinProgramPartnershipsCreateSimple");
    }
    
    // create path and map variables
    String localVarPath = "/join-program/partnerships/create-simple";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    if (account != null)
      localVarHeaderParams.put("account", apiClient.parameterToString(account));

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

    TypeReference<WalleejoinPartnershipResponseDto> localVarReturnType = new TypeReference<WalleejoinPartnershipResponseDto>() {};
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
