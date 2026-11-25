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

import com.wallee.sdk.model.ExpressCheckoutSession;
import com.wallee.sdk.model.ExpressCheckoutSessionCreate;
import com.wallee.sdk.model.ExpressCheckoutSessionCreateResponse;
import com.wallee.sdk.model.ExpressCheckoutSessionProcessRequest;
import com.wallee.sdk.model.ExpressCheckoutSessionProcessResponse;
import com.wallee.sdk.model.RestApiErrorResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class ExpressCheckoutSessionService extends BaseApi {

  public ExpressCheckoutSessionService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Get Express Checkout Session details
   * 
   
   * @param sessionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @return ExpressCheckoutSession
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getExpressCheckoutSession">Get Express Checkout Session details Documentation</a>
   */
  public ExpressCheckoutSession getExpressCheckoutSession(@javax.annotation.Nonnull Long sessionId, @javax.annotation.Nonnull Long space) throws ApiException {
    return this.getExpressCheckoutSession(sessionId, space, Collections.emptyMap());
  }


  /**
   * Get Express Checkout Session details
   * 
   
   * @param sessionId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return ExpressCheckoutSession
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getExpressCheckoutSession">Get Express Checkout Session details Documentation</a>
   */
  public ExpressCheckoutSession getExpressCheckoutSession(@javax.annotation.Nonnull Long sessionId, @javax.annotation.Nonnull Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling getExpressCheckoutSession");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getExpressCheckoutSession");
    }
    
    // create path and map variables
    String localVarPath = "/express-checkout/session";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("sessionId", sessionId));
    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<ExpressCheckoutSession> localVarReturnType = new TypeReference<ExpressCheckoutSession>() {};
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
   * Create a new Express Checkout Session
   * Creates a new Express Checkout session and returns both sessionId and sessionToken. Use the sessionToken to render the wallet widget, and persist the sessionId for the later process call.
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutSessionCreate  (required)
   * @return ExpressCheckoutSessionCreateResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postExpressCheckoutSessionCreate">Create a new Express Checkout Session Documentation</a>
   */
  public ExpressCheckoutSessionCreateResponse postExpressCheckoutSessionCreate(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutSessionCreate expressCheckoutSessionCreate) throws ApiException {
    return this.postExpressCheckoutSessionCreate(space, expressCheckoutSessionCreate, Collections.emptyMap());
  }


  /**
   * Create a new Express Checkout Session
   * Creates a new Express Checkout session and returns both sessionId and sessionToken. Use the sessionToken to render the wallet widget, and persist the sessionId for the later process call.
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutSessionCreate  (required)
   * @param additionalHeaders The additional headers for this call
   * @return ExpressCheckoutSessionCreateResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postExpressCheckoutSessionCreate">Create a new Express Checkout Session Documentation</a>
   */
  public ExpressCheckoutSessionCreateResponse postExpressCheckoutSessionCreate(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutSessionCreate expressCheckoutSessionCreate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = expressCheckoutSessionCreate;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postExpressCheckoutSessionCreate");
    }
    
    // verify the required parameter 'expressCheckoutSessionCreate' is set
    if (expressCheckoutSessionCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'expressCheckoutSessionCreate' when calling postExpressCheckoutSessionCreate");
    }
    
    // create path and map variables
    String localVarPath = "/express-checkout/session/create";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

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

    TypeReference<ExpressCheckoutSessionCreateResponse> localVarReturnType = new TypeReference<ExpressCheckoutSessionCreateResponse>() {};
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
   * Process Express Checkout Session
   * Processes the approved session and returns the redirect URL to continue checkout. Customer language and time zone are automatically derived from the HTTP request when available.
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutSessionProcessRequest  (required)
   * @return ExpressCheckoutSessionProcessResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postExpressCheckoutSessionProcess">Process Express Checkout Session Documentation</a>
   */
  public ExpressCheckoutSessionProcessResponse postExpressCheckoutSessionProcess(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutSessionProcessRequest expressCheckoutSessionProcessRequest) throws ApiException {
    return this.postExpressCheckoutSessionProcess(space, expressCheckoutSessionProcessRequest, Collections.emptyMap());
  }


  /**
   * Process Express Checkout Session
   * Processes the approved session and returns the redirect URL to continue checkout. Customer language and time zone are automatically derived from the HTTP request when available.
   
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param expressCheckoutSessionProcessRequest  (required)
   * @param additionalHeaders The additional headers for this call
   * @return ExpressCheckoutSessionProcessResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postExpressCheckoutSessionProcess">Process Express Checkout Session Documentation</a>
   */
  public ExpressCheckoutSessionProcessResponse postExpressCheckoutSessionProcess(@javax.annotation.Nonnull Long space, @javax.annotation.Nonnull ExpressCheckoutSessionProcessRequest expressCheckoutSessionProcessRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = expressCheckoutSessionProcessRequest;
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postExpressCheckoutSessionProcess");
    }
    
    // verify the required parameter 'expressCheckoutSessionProcessRequest' is set
    if (expressCheckoutSessionProcessRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'expressCheckoutSessionProcessRequest' when calling postExpressCheckoutSessionProcess");
    }
    
    // create path and map variables
    String localVarPath = "/express-checkout/session/process";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (space != null)
      localVarHeaderParams.put("space", apiClient.parameterToString(space));

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

    TypeReference<ExpressCheckoutSessionProcessResponse> localVarReturnType = new TypeReference<ExpressCheckoutSessionProcessResponse>() {};
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
