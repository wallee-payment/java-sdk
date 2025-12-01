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

import com.wallee.sdk.model.RestApiBulkOperationResult;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;
import com.wallee.sdk.model.WebhookURLListResponse;
import com.wallee.sdk.model.WebhookURLSearchResponse;
import com.wallee.sdk.model.WebhookUrl;
import com.wallee.sdk.model.WebhookUrlCreate;
import com.wallee.sdk.model.WebhookUrlUpdate;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class WebhookUrlsService extends BaseApi {

  public WebhookUrlsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete multiple webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param requestBody  (required)
   * @return List&lt;RestApiBulkOperationResult&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteWebhooksUrlsBulk">Delete multiple webhook URLs Documentation</a>
   */
  public List<RestApiBulkOperationResult> deleteWebhooksUrlsBulk(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull List<Long> requestBody) throws ApiException {
    return this.deleteWebhooksUrlsBulk(space, requestBody, Collections.emptyMap());
  }


  /**
   * Delete multiple webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param requestBody  (required)
   * @param additionalHeaders The additional headers for this call
   * @return List&lt;RestApiBulkOperationResult&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteWebhooksUrlsBulk">Delete multiple webhook URLs Documentation</a>
   */
  public List<RestApiBulkOperationResult> deleteWebhooksUrlsBulk(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull List<Long> requestBody, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deleteWebhooksUrlsBulk");
    }
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling deleteWebhooksUrlsBulk");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls/bulk";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<List<RestApiBulkOperationResult>> localVarReturnType = new TypeReference<List<RestApiBulkOperationResult>>() {};
    return apiClient.invokeAPI(
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
        localVarReturnType
    );
  }

  /**
   * Delete a webhook URL
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteWebhooksUrlsId">Delete a webhook URL Documentation</a>
   */
  public void deleteWebhooksUrlsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.deleteWebhooksUrlsId(id, space, Collections.emptyMap());
  }


  /**
   * Delete a webhook URL
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteWebhooksUrlsId">Delete a webhook URL Documentation</a>
   */
  public void deleteWebhooksUrlsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWebhooksUrlsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deleteWebhooksUrlsId");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls/{id}"
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
   * List all webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return WebhookURLListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksUrls">List all webhook URLs Documentation</a>
   */
  public WebhookURLListResponse getWebhooksUrls(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getWebhooksUrls(space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WebhookURLListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksUrls">List all webhook URLs Documentation</a>
   */
  public WebhookURLListResponse getWebhooksUrls(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getWebhooksUrls");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls";

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

    TypeReference<WebhookURLListResponse> localVarReturnType = new TypeReference<WebhookURLListResponse>() {};
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
   * Retrieve a webhook URL
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return WebhookUrl
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksUrlsId">Retrieve a webhook URL Documentation</a>
   */
  public WebhookUrl getWebhooksUrlsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getWebhooksUrlsId(id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a webhook URL
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WebhookUrl
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksUrlsId">Retrieve a webhook URL Documentation</a>
   */
  public WebhookUrl getWebhooksUrlsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWebhooksUrlsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getWebhooksUrlsId");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls/{id}"
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

    TypeReference<WebhookUrl> localVarReturnType = new TypeReference<WebhookUrl>() {};
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
   * Search webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return WebhookURLSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksUrlsSearch">Search webhook URLs Documentation</a>
   */
  public WebhookURLSearchResponse getWebhooksUrlsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getWebhooksUrlsSearch(space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WebhookURLSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getWebhooksUrlsSearch">Search webhook URLs Documentation</a>
   */
  public WebhookURLSearchResponse getWebhooksUrlsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getWebhooksUrlsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls/search";

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

    TypeReference<WebhookURLSearchResponse> localVarReturnType = new TypeReference<WebhookURLSearchResponse>() {};
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
   * Update multiple webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlUpdate  (required)
   * @return List&lt;RestApiBulkOperationResult&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchWebhooksUrlsBulk">Update multiple webhook URLs Documentation</a>
   */
  public List<RestApiBulkOperationResult> patchWebhooksUrlsBulk(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull List<WebhookUrlUpdate> webhookUrlUpdate) throws ApiException {
    return this.patchWebhooksUrlsBulk(space, webhookUrlUpdate, Collections.emptyMap());
  }


  /**
   * Update multiple webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlUpdate  (required)
   * @param additionalHeaders The additional headers for this call
   * @return List&lt;RestApiBulkOperationResult&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchWebhooksUrlsBulk">Update multiple webhook URLs Documentation</a>
   */
  public List<RestApiBulkOperationResult> patchWebhooksUrlsBulk(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull List<WebhookUrlUpdate> webhookUrlUpdate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webhookUrlUpdate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchWebhooksUrlsBulk");
    }
    
    // verify the required parameter 'webhookUrlUpdate' is set
    if (webhookUrlUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookUrlUpdate' when calling patchWebhooksUrlsBulk");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls/bulk";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<List<RestApiBulkOperationResult>> localVarReturnType = new TypeReference<List<RestApiBulkOperationResult>>() {};
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
   * Update a webhook URL
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlUpdate  (required)
   * @param expand  (optional)
   * @return WebhookUrl
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchWebhooksUrlsId">Update a webhook URL Documentation</a>
   */
  public WebhookUrl patchWebhooksUrlsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull WebhookUrlUpdate webhookUrlUpdate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchWebhooksUrlsId(id, space, webhookUrlUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a webhook URL
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WebhookUrl
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchWebhooksUrlsId">Update a webhook URL Documentation</a>
   */
  public WebhookUrl patchWebhooksUrlsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull WebhookUrlUpdate webhookUrlUpdate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webhookUrlUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchWebhooksUrlsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchWebhooksUrlsId");
    }
    
    // verify the required parameter 'webhookUrlUpdate' is set
    if (webhookUrlUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookUrlUpdate' when calling patchWebhooksUrlsId");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls/{id}"
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

    TypeReference<WebhookUrl> localVarReturnType = new TypeReference<WebhookUrl>() {};
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
   * Create a webhook URL
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlCreate  (required)
   * @param expand  (optional)
   * @return WebhookUrl
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postWebhooksUrls">Create a webhook URL Documentation</a>
   */
  public WebhookUrl postWebhooksUrls(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull WebhookUrlCreate webhookUrlCreate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postWebhooksUrls(space, webhookUrlCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a webhook URL
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WebhookUrl
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postWebhooksUrls">Create a webhook URL Documentation</a>
   */
  public WebhookUrl postWebhooksUrls(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull WebhookUrlCreate webhookUrlCreate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webhookUrlCreate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postWebhooksUrls");
    }
    
    // verify the required parameter 'webhookUrlCreate' is set
    if (webhookUrlCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookUrlCreate' when calling postWebhooksUrls");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls";

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

    TypeReference<WebhookUrl> localVarReturnType = new TypeReference<WebhookUrl>() {};
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
   * Create multiple webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlCreate  (required)
   * @return List&lt;RestApiBulkOperationResult&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postWebhooksUrlsBulk">Create multiple webhook URLs Documentation</a>
   */
  public List<RestApiBulkOperationResult> postWebhooksUrlsBulk(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull List<WebhookUrlCreate> webhookUrlCreate) throws ApiException {
    return this.postWebhooksUrlsBulk(space, webhookUrlCreate, Collections.emptyMap());
  }


  /**
   * Create multiple webhook URLs
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param webhookUrlCreate  (required)
   * @param additionalHeaders The additional headers for this call
   * @return List&lt;RestApiBulkOperationResult&gt;
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postWebhooksUrlsBulk">Create multiple webhook URLs Documentation</a>
   */
  public List<RestApiBulkOperationResult> postWebhooksUrlsBulk(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull List<WebhookUrlCreate> webhookUrlCreate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = webhookUrlCreate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postWebhooksUrlsBulk");
    }
    
    // verify the required parameter 'webhookUrlCreate' is set
    if (webhookUrlCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookUrlCreate' when calling postWebhooksUrlsBulk");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/urls/bulk";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<List<RestApiBulkOperationResult>> localVarReturnType = new TypeReference<List<RestApiBulkOperationResult>>() {};
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
