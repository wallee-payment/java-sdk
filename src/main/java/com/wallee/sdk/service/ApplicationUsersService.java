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

import com.wallee.sdk.model.ApplicationUser;
import com.wallee.sdk.model.ApplicationUserCreate;
import com.wallee.sdk.model.ApplicationUserCreateWithMacKey;
import com.wallee.sdk.model.ApplicationUserListResponse;
import com.wallee.sdk.model.ApplicationUserSearchResponse;
import com.wallee.sdk.model.ApplicationUserUpdate;
import com.wallee.sdk.model.RestApiErrorResponse;
import com.wallee.sdk.model.RestApplicationUserMacKey;
import com.wallee.sdk.model.RestApplicationUserMacKeyCreated;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class ApplicationUsersService extends BaseApi {

  public ApplicationUsersService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete an application user
   * Permanently deletes a application user. It cannot be undone.
   
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteApplicationUsersId">Delete an application user Documentation</a>
   */
  public void deleteApplicationUsersId(@javax.annotation.Nonnull Long id) throws ApiException {
    this.deleteApplicationUsersId(id, Collections.emptyMap());
  }


  /**
   * Delete an application user
   * Permanently deletes a application user. It cannot be undone.
   
   * @param id  (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteApplicationUsersId">Delete an application user Documentation</a>
   */
  public void deleteApplicationUsersId(@javax.annotation.Nonnull Long id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteApplicationUsersId");
    }
    
    // create path and map variables
    String localVarPath = "/application-users/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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
   * Deactivate an authentication key
   * 
   
   * @param userId  (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteApplicationUsersUserIdKeysId">Deactivate an authentication key Documentation</a>
   */
  public void deleteApplicationUsersUserIdKeysId(@javax.annotation.Nonnull Long userId, @javax.annotation.Nonnull Long id) throws ApiException {
    this.deleteApplicationUsersUserIdKeysId(userId, id, Collections.emptyMap());
  }


  /**
   * Deactivate an authentication key
   * 
   
   * @param userId  (required)
   * @param id  (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteApplicationUsersUserIdKeysId">Deactivate an authentication key Documentation</a>
   */
  public void deleteApplicationUsersUserIdKeysId(@javax.annotation.Nonnull Long userId, @javax.annotation.Nonnull Long id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteApplicationUsersUserIdKeysId");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteApplicationUsersUserIdKeysId");
    }
    
    // create path and map variables
    String localVarPath = "/application-users/{userId}/keys/{id}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

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
   * List all application users
   * 
   
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return ApplicationUserListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsers">List all application users Documentation</a>
   */
  public ApplicationUserListResponse getApplicationUsers(@javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getApplicationUsers(after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all application users
   * 
   
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ApplicationUserListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsers">List all application users Documentation</a>
   */
  public ApplicationUserListResponse getApplicationUsers(@javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/application-users";

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
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<ApplicationUserListResponse> localVarReturnType = new TypeReference<ApplicationUserListResponse>() {};
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
   * Retrieve an application user
   * 
   
   * @param id  (required)
   * @param expand  (optional)
   * @return ApplicationUser
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsersId">Retrieve an application user Documentation</a>
   */
  public ApplicationUser getApplicationUsersId(@javax.annotation.Nonnull Long id, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getApplicationUsersId(id, expand, Collections.emptyMap());
  }


  /**
   * Retrieve an application user
   * 
   
   * @param id  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ApplicationUser
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsersId">Retrieve an application user Documentation</a>
   */
  public ApplicationUser getApplicationUsersId(@javax.annotation.Nonnull Long id, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getApplicationUsersId");
    }
    
    // create path and map variables
    String localVarPath = "/application-users/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<ApplicationUser> localVarReturnType = new TypeReference<ApplicationUser>() {};
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
   * Search application users
   * 
   
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return ApplicationUserSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsersSearch">Search application users Documentation</a>
   */
  public ApplicationUserSearchResponse getApplicationUsersSearch(@javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getApplicationUsersSearch(expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search application users
   * 
   
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ApplicationUserSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsersSearch">Search application users Documentation</a>
   */
  public ApplicationUserSearchResponse getApplicationUsersSearch(@javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/application-users/search";

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
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<ApplicationUserSearchResponse> localVarReturnType = new TypeReference<ApplicationUserSearchResponse>() {};
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
   * List a user&#39;s authentication keys
   * 
   
   * @param userId  (required)
   * @return List&lt;RestApplicationUserMacKey&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsersUserIdKeys">List a user&#39;s authentication keys Documentation</a>
   */
  public List<RestApplicationUserMacKey> getApplicationUsersUserIdKeys(@javax.annotation.Nonnull Long userId) throws ApiException {
    return this.getApplicationUsersUserIdKeys(userId, Collections.emptyMap());
  }


  /**
   * List a user&#39;s authentication keys
   * 
   
   * @param userId  (required)
   * @param additionalHeaders The additional headers for this call
   * @return List&lt;RestApplicationUserMacKey&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getApplicationUsersUserIdKeys">List a user&#39;s authentication keys Documentation</a>
   */
  public List<RestApplicationUserMacKey> getApplicationUsersUserIdKeys(@javax.annotation.Nonnull Long userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getApplicationUsersUserIdKeys");
    }
    
    // create path and map variables
    String localVarPath = "/application-users/{userId}/keys"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<List<RestApplicationUserMacKey>> localVarReturnType = new TypeReference<List<RestApplicationUserMacKey>>() {};
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
   * Update an application user
   * 
   
   * @param id  (required)
   * @param applicationUserUpdate  (required)
   * @param expand  (optional)
   * @return ApplicationUser
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchApplicationUsersId">Update an application user Documentation</a>
   */
  public ApplicationUser patchApplicationUsersId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull ApplicationUserUpdate applicationUserUpdate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchApplicationUsersId(id, applicationUserUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update an application user
   * 
   
   * @param id  (required)
   * @param applicationUserUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ApplicationUser
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchApplicationUsersId">Update an application user Documentation</a>
   */
  public ApplicationUser patchApplicationUsersId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull ApplicationUserUpdate applicationUserUpdate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationUserUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchApplicationUsersId");
    }
    
    // verify the required parameter 'applicationUserUpdate' is set
    if (applicationUserUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationUserUpdate' when calling patchApplicationUsersId");
    }
    
    // create path and map variables
    String localVarPath = "/application-users/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(apiClient.parameterToString(id)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    
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

    TypeReference<ApplicationUser> localVarReturnType = new TypeReference<ApplicationUser>() {};
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
   * Create an application user
   * 
   
   * @param applicationUserCreate  (required)
   * @param expand  (optional)
   * @return ApplicationUserCreateWithMacKey
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postApplicationUsers">Create an application user Documentation</a>
   */
  public ApplicationUserCreateWithMacKey postApplicationUsers(@javax.annotation.Nonnull ApplicationUserCreate applicationUserCreate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postApplicationUsers(applicationUserCreate, expand, Collections.emptyMap());
  }


  /**
   * Create an application user
   * 
   
   * @param applicationUserCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return ApplicationUserCreateWithMacKey
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postApplicationUsers">Create an application user Documentation</a>
   */
  public ApplicationUserCreateWithMacKey postApplicationUsers(@javax.annotation.Nonnull ApplicationUserCreate applicationUserCreate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = applicationUserCreate;
    
    // verify the required parameter 'applicationUserCreate' is set
    if (applicationUserCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationUserCreate' when calling postApplicationUsers");
    }
    
    // create path and map variables
    String localVarPath = "/application-users";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "expand", expand));
    
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

    TypeReference<ApplicationUserCreateWithMacKey> localVarReturnType = new TypeReference<ApplicationUserCreateWithMacKey>() {};
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
   * Generate a new authentication key
   * 
   
   * @param userId  (required)
   * @return RestApplicationUserMacKeyCreated
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postApplicationUsersUserIdKeys">Generate a new authentication key Documentation</a>
   */
  public RestApplicationUserMacKeyCreated postApplicationUsersUserIdKeys(@javax.annotation.Nonnull Long userId) throws ApiException {
    return this.postApplicationUsersUserIdKeys(userId, Collections.emptyMap());
  }


  /**
   * Generate a new authentication key
   * 
   
   * @param userId  (required)
   * @param additionalHeaders The additional headers for this call
   * @return RestApplicationUserMacKeyCreated
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postApplicationUsersUserIdKeys">Generate a new authentication key Documentation</a>
   */
  public RestApplicationUserMacKeyCreated postApplicationUsersUserIdKeys(@javax.annotation.Nonnull Long userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling postApplicationUsersUserIdKeys");
    }
    
    // create path and map variables
    String localVarPath = "/application-users/{userId}/keys"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(apiClient.parameterToString(userId)));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<RestApplicationUserMacKeyCreated> localVarReturnType = new TypeReference<RestApplicationUserMacKeyCreated>() {};
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
