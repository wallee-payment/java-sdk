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

import com.wallee.sdk.model.BogusExpressCheckoutApprovalRequest;
import com.wallee.sdk.model.ExpressCheckoutApprovalResponse;
import com.wallee.sdk.model.RestApiErrorResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class BogusExpressCheckoutService extends BaseApi {

  public BogusExpressCheckoutService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Approve express checkout wallet payment
   * 
   
   * @param sessionToken  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param bogusExpressCheckoutApprovalRequest  (required)
   * @return ExpressCheckoutApprovalResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postBogusExpressCheckoutOnApprove">Approve express checkout wallet payment Documentation</a>
   */
  public ExpressCheckoutApprovalResponse postBogusExpressCheckoutOnApprove(@javax.annotation.Nonnull String sessionToken, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull BogusExpressCheckoutApprovalRequest bogusExpressCheckoutApprovalRequest) throws ApiException {
    return this.postBogusExpressCheckoutOnApprove(sessionToken, space, bogusExpressCheckoutApprovalRequest, Collections.emptyMap());
  }


  /**
   * Approve express checkout wallet payment
   * 
   
   * @param sessionToken  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param bogusExpressCheckoutApprovalRequest  (required)
   * @param additionalHeaders The additional headers for this call
   * @return ExpressCheckoutApprovalResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postBogusExpressCheckoutOnApprove">Approve express checkout wallet payment Documentation</a>
   */
  public ExpressCheckoutApprovalResponse postBogusExpressCheckoutOnApprove(@javax.annotation.Nonnull String sessionToken, @javax.annotation.Nonnull Long space, @javax.annotation.Nonnull BogusExpressCheckoutApprovalRequest bogusExpressCheckoutApprovalRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = bogusExpressCheckoutApprovalRequest;
    
    // verify the required parameter 'sessionToken' is set
    if (sessionToken == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionToken' when calling postBogusExpressCheckoutOnApprove");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postBogusExpressCheckoutOnApprove");
    }
    
    // verify the required parameter 'bogusExpressCheckoutApprovalRequest' is set
    if (bogusExpressCheckoutApprovalRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bogusExpressCheckoutApprovalRequest' when calling postBogusExpressCheckoutOnApprove");
    }
    
    // create path and map variables
    String localVarPath = "/bogus-express-checkout/on-approve";

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

    TypeReference<ExpressCheckoutApprovalResponse> localVarReturnType = new TypeReference<ExpressCheckoutApprovalResponse>() {};
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
