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

import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.PaymentMethodConfigurationCreate;
import com.wallee.sdk.model.PaymentMethodConfigurationListResponse;
import com.wallee.sdk.model.PaymentMethodConfigurationSearchResponse;
import com.wallee.sdk.model.PaymentMethodConfigurationUpdate;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;
import com.wallee.sdk.model.SortingOrder;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class PaymentMethodConfigurationsService extends BaseApi {

  public PaymentMethodConfigurationsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a payment method configuration
   * Permanently deletes a payment method configuration.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentMethodConfigurationsId">Delete a payment method configuration Documentation</a>
   */
  public void deletePaymentMethodConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space) throws ApiException {
    this.deletePaymentMethodConfigurationsId(id, space, Collections.emptyMap());
  }


  /**
   * Delete a payment method configuration
   * Permanently deletes a payment method configuration.
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deletePaymentMethodConfigurationsId">Delete a payment method configuration Documentation</a>
   */
  public void deletePaymentMethodConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePaymentMethodConfigurationsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deletePaymentMethodConfigurationsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/method-configurations/{id}"
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
   * List all payment method configurations
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @return PaymentMethodConfigurationListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentMethodConfigurations">List all payment method configurations Documentation</a>
   */
  public PaymentMethodConfigurationListResponse getPaymentMethodConfigurations(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order) throws ApiException {
    return this.getPaymentMethodConfigurations(space, after, before, expand, limit, order, Collections.emptyMap());
  }


  /**
   * List all payment method configurations
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param after Set to an object&#39;s ID to retrieve the page of objects coming immediately after the named object. (optional)
   * @param before Set to an object&#39;s ID to retrieve the page of objects coming immediately before the named object. (optional)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param order Specify to retrieve objects in chronological (ASC) or reverse chronological (DESC) order. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentMethodConfigurationListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentMethodConfigurations">List all payment method configurations Documentation</a>
   */
  public PaymentMethodConfigurationListResponse getPaymentMethodConfigurations(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Long after, @javax.annotation.Nullable Long before, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable SortingOrder order, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentMethodConfigurations");
    }
    
    // create path and map variables
    String localVarPath = "/payment/method-configurations";

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

    TypeReference<PaymentMethodConfigurationListResponse> localVarReturnType = new TypeReference<PaymentMethodConfigurationListResponse>() {};
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
   * Retrieve a payment method configuration
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @return PaymentMethodConfiguration
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentMethodConfigurationsId">Retrieve a payment method configuration Documentation</a>
   */
  public PaymentMethodConfiguration getPaymentMethodConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getPaymentMethodConfigurationsId(id, space, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a payment method configuration
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentMethodConfiguration
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentMethodConfigurationsId">Retrieve a payment method configuration Documentation</a>
   */
  public PaymentMethodConfiguration getPaymentMethodConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPaymentMethodConfigurationsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentMethodConfigurationsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/method-configurations/{id}"
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

    TypeReference<PaymentMethodConfiguration> localVarReturnType = new TypeReference<PaymentMethodConfiguration>() {};
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
   * Search payment method configurations
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @return PaymentMethodConfigurationSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentMethodConfigurationsSearch">Search payment method configurations Documentation</a>
   */
  public PaymentMethodConfigurationSearchResponse getPaymentMethodConfigurationsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query) throws ApiException {
    return this.getPaymentMethodConfigurationsSearch(space, expand, limit, offset, order, query, Collections.emptyMap());
  }


  /**
   * Search payment method configurations
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expand  (optional)
   * @param limit A limit on the number of objects to be returned, between 1 and 100. Default is 10. (optional)
   * @param offset A cursor for pagination, specifies the number of objects to skip. (optional)
   * @param order The fields and order to sort the objects by. (optional)
   * @param query The search query to filter the objects by. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentMethodConfigurationSearchResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getPaymentMethodConfigurationsSearch">Search payment method configurations Documentation</a>
   */
  public PaymentMethodConfigurationSearchResponse getPaymentMethodConfigurationsSearch(@javax.annotation.Nonnull Long space, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable String order, @javax.annotation.Nullable String query, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getPaymentMethodConfigurationsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/payment/method-configurations/search";

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

    TypeReference<PaymentMethodConfigurationSearchResponse> localVarReturnType = new TypeReference<PaymentMethodConfigurationSearchResponse>() {};
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
   * Update a payment method configuration
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentMethodConfigurationUpdate  (required)
   * @param expand  (optional)
   * @return PaymentMethodConfiguration
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentMethodConfigurationsId">Update a payment method configuration Documentation</a>
   */
  public PaymentMethodConfiguration patchPaymentMethodConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentMethodConfigurationUpdate paymentMethodConfigurationUpdate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchPaymentMethodConfigurationsId(id, space, paymentMethodConfigurationUpdate, expand, Collections.emptyMap());
  }


  /**
   * Update a payment method configuration
   * 
   
   * @param id  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentMethodConfigurationUpdate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentMethodConfiguration
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchPaymentMethodConfigurationsId">Update a payment method configuration Documentation</a>
   */
  public PaymentMethodConfiguration patchPaymentMethodConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentMethodConfigurationUpdate paymentMethodConfigurationUpdate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentMethodConfigurationUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchPaymentMethodConfigurationsId");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchPaymentMethodConfigurationsId");
    }
    
    // verify the required parameter 'paymentMethodConfigurationUpdate' is set
    if (paymentMethodConfigurationUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentMethodConfigurationUpdate' when calling patchPaymentMethodConfigurationsId");
    }
    
    // create path and map variables
    String localVarPath = "/payment/method-configurations/{id}"
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

    TypeReference<PaymentMethodConfiguration> localVarReturnType = new TypeReference<PaymentMethodConfiguration>() {};
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
   * Create a payment method configuration
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentMethodConfigurationCreate  (required)
   * @param expand  (optional)
   * @return PaymentMethodConfiguration
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentMethodConfigurations">Create a payment method configuration Documentation</a>
   */
  public PaymentMethodConfiguration postPaymentMethodConfigurations(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentMethodConfigurationCreate paymentMethodConfigurationCreate, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postPaymentMethodConfigurations(space, paymentMethodConfigurationCreate, expand, Collections.emptyMap());
  }


  /**
   * Create a payment method configuration
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param paymentMethodConfigurationCreate  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return PaymentMethodConfiguration
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postPaymentMethodConfigurations">Create a payment method configuration Documentation</a>
   */
  public PaymentMethodConfiguration postPaymentMethodConfigurations(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull PaymentMethodConfigurationCreate paymentMethodConfigurationCreate, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = paymentMethodConfigurationCreate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postPaymentMethodConfigurations");
    }
    
    // verify the required parameter 'paymentMethodConfigurationCreate' is set
    if (paymentMethodConfigurationCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentMethodConfigurationCreate' when calling postPaymentMethodConfigurations");
    }
    
    // create path and map variables
    String localVarPath = "/payment/method-configurations";

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

    TypeReference<PaymentMethodConfiguration> localVarReturnType = new TypeReference<PaymentMethodConfiguration>() {};
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
