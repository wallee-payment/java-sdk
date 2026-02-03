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

import com.wallee.sdk.model.ExpressCheckoutCreateResponse;
import com.wallee.sdk.model.ExpressCheckoutSessionCreate;
import com.wallee.sdk.model.ExpressCheckoutShippingAddressChangeRequest;
import com.wallee.sdk.model.ExpressCheckoutShippingAddressChangeResponse;
import com.wallee.sdk.model.ExpressCheckoutShippingMethodChangeRequest;
import com.wallee.sdk.model.ExpressCheckoutShippingMethodChangeResponse;
import com.wallee.sdk.model.RestApiErrorResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class ExpressCheckoutService extends BaseApi {

  public ExpressCheckoutService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Change shipping address
   * 
   
   * @param sessionToken  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutShippingAddressChangeRequest  (required)
   * @return ExpressCheckoutShippingAddressChangeResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchExpressCheckoutShippingAddressChange">Change shipping address Documentation</a>
   */
  public ExpressCheckoutShippingAddressChangeResponse patchExpressCheckoutShippingAddressChange(@javax.annotation.Nonnull String sessionToken, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutShippingAddressChangeRequest expressCheckoutShippingAddressChangeRequest) throws ApiException {
    return this.patchExpressCheckoutShippingAddressChange(sessionToken, space, expressCheckoutShippingAddressChangeRequest, Collections.emptyMap());
  }


  /**
   * Change shipping address
   * 
   
   * @param sessionToken  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutShippingAddressChangeRequest  (required)
   * @param additionalHeaders The additional headers for this call
   * @return ExpressCheckoutShippingAddressChangeResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchExpressCheckoutShippingAddressChange">Change shipping address Documentation</a>
   */
  public ExpressCheckoutShippingAddressChangeResponse patchExpressCheckoutShippingAddressChange(@javax.annotation.Nonnull String sessionToken, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutShippingAddressChangeRequest expressCheckoutShippingAddressChangeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = expressCheckoutShippingAddressChangeRequest;
    
    // verify the required parameter 'sessionToken' is set
    if (sessionToken == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionToken' when calling patchExpressCheckoutShippingAddressChange");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchExpressCheckoutShippingAddressChange");
    }
    
    // verify the required parameter 'expressCheckoutShippingAddressChangeRequest' is set
    if (expressCheckoutShippingAddressChangeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'expressCheckoutShippingAddressChangeRequest' when calling patchExpressCheckoutShippingAddressChange");
    }
    
    // create path and map variables
    String localVarPath = "/express-checkout/shipping/address-change";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("sessionToken", sessionToken));
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

    TypeReference<ExpressCheckoutShippingAddressChangeResponse> localVarReturnType = new TypeReference<ExpressCheckoutShippingAddressChangeResponse>() {};
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
   * Change shipping method
   * 
   
   * @param sessionToken  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutShippingMethodChangeRequest  (required)
   * @return ExpressCheckoutShippingMethodChangeResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchExpressCheckoutShippingMethodChange">Change shipping method Documentation</a>
   */
  public ExpressCheckoutShippingMethodChangeResponse patchExpressCheckoutShippingMethodChange(@javax.annotation.Nonnull String sessionToken, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutShippingMethodChangeRequest expressCheckoutShippingMethodChangeRequest) throws ApiException {
    return this.patchExpressCheckoutShippingMethodChange(sessionToken, space, expressCheckoutShippingMethodChangeRequest, Collections.emptyMap());
  }


  /**
   * Change shipping method
   * 
   
   * @param sessionToken  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutShippingMethodChangeRequest  (required)
   * @param additionalHeaders The additional headers for this call
   * @return ExpressCheckoutShippingMethodChangeResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchExpressCheckoutShippingMethodChange">Change shipping method Documentation</a>
   */
  public ExpressCheckoutShippingMethodChangeResponse patchExpressCheckoutShippingMethodChange(@javax.annotation.Nonnull String sessionToken, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutShippingMethodChangeRequest expressCheckoutShippingMethodChangeRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = expressCheckoutShippingMethodChangeRequest;
    
    // verify the required parameter 'sessionToken' is set
    if (sessionToken == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionToken' when calling patchExpressCheckoutShippingMethodChange");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling patchExpressCheckoutShippingMethodChange");
    }
    
    // verify the required parameter 'expressCheckoutShippingMethodChangeRequest' is set
    if (expressCheckoutShippingMethodChangeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'expressCheckoutShippingMethodChangeRequest' when calling patchExpressCheckoutShippingMethodChange");
    }
    
    // create path and map variables
    String localVarPath = "/express-checkout/shipping/method-change";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("sessionToken", sessionToken));
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

    TypeReference<ExpressCheckoutShippingMethodChangeResponse> localVarReturnType = new TypeReference<ExpressCheckoutShippingMethodChangeResponse>() {};
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
   * Create a new Express Checkout Session
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutSessionCreate  (required)
   * @return ExpressCheckoutCreateResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postExpressCheckoutCreateSession">Create a new Express Checkout Session Documentation</a>
   */
  public ExpressCheckoutCreateResponse postExpressCheckoutCreateSession(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutSessionCreate expressCheckoutSessionCreate) throws ApiException {
    return this.postExpressCheckoutCreateSession(space, expressCheckoutSessionCreate, Collections.emptyMap());
  }


  /**
   * Create a new Express Checkout Session
   * 
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutSessionCreate  (required)
   * @param additionalHeaders The additional headers for this call
   * @return ExpressCheckoutCreateResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postExpressCheckoutCreateSession">Create a new Express Checkout Session Documentation</a>
   */
  public ExpressCheckoutCreateResponse postExpressCheckoutCreateSession(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutSessionCreate expressCheckoutSessionCreate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = expressCheckoutSessionCreate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postExpressCheckoutCreateSession");
    }
    
    // verify the required parameter 'expressCheckoutSessionCreate' is set
    if (expressCheckoutSessionCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'expressCheckoutSessionCreate' when calling postExpressCheckoutCreateSession");
    }
    
    // create path and map variables
    String localVarPath = "/express-checkout/create-session";

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

    TypeReference<ExpressCheckoutCreateResponse> localVarReturnType = new TypeReference<ExpressCheckoutCreateResponse>() {};
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
