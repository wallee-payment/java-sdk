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

import com.wallee.sdk.model.BoardingStrategyInformationRequest;
import com.wallee.sdk.model.RestApiErrorResponse;
import com.wallee.sdk.model.StoreTrialSubscriptionRequestSetter;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class BoardingSubscriptionStrategyService extends BaseApi {

  public BoardingSubscriptionStrategyService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Create a boarding subscription information for an account
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param boardingStrategyInformationRequest  (required)
   * @return BoardingStrategyInformationRequest
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postBoardingSubscriptionStrategyInformation">Create a boarding subscription information for an account Documentation</a>
   */
  public BoardingStrategyInformationRequest postBoardingSubscriptionStrategyInformation(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull BoardingStrategyInformationRequest boardingStrategyInformationRequest) throws ApiException {
    return this.postBoardingSubscriptionStrategyInformation(account, boardingStrategyInformationRequest, Collections.emptyMap());
  }


  /**
   * Create a boarding subscription information for an account
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param boardingStrategyInformationRequest  (required)
   * @param additionalHeaders The additional headers for this call
   * @return BoardingStrategyInformationRequest
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postBoardingSubscriptionStrategyInformation">Create a boarding subscription information for an account Documentation</a>
   */
  public BoardingStrategyInformationRequest postBoardingSubscriptionStrategyInformation(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull BoardingStrategyInformationRequest boardingStrategyInformationRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = boardingStrategyInformationRequest;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postBoardingSubscriptionStrategyInformation");
    }
    
    // verify the required parameter 'boardingStrategyInformationRequest' is set
    if (boardingStrategyInformationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'boardingStrategyInformationRequest' when calling postBoardingSubscriptionStrategyInformation");
    }
    
    // create path and map variables
    String localVarPath = "/boarding/subscription-strategy/information";

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

    TypeReference<BoardingStrategyInformationRequest> localVarReturnType = new TypeReference<BoardingStrategyInformationRequest>() {};
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
   * Create new Boarding Trial Subscription to Account
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param storeTrialSubscriptionRequestSetter  (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postBoardingSubscriptionStrategyPlans">Create new Boarding Trial Subscription to Account Documentation</a>
   */
  public void postBoardingSubscriptionStrategyPlans(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull StoreTrialSubscriptionRequestSetter storeTrialSubscriptionRequestSetter) throws ApiException {
    this.postBoardingSubscriptionStrategyPlans(account, storeTrialSubscriptionRequestSetter, Collections.emptyMap());
  }


  /**
   * Create new Boarding Trial Subscription to Account
   * 
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param storeTrialSubscriptionRequestSetter  (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postBoardingSubscriptionStrategyPlans">Create new Boarding Trial Subscription to Account Documentation</a>
   */
  public void postBoardingSubscriptionStrategyPlans(@javax.annotation.Nonnull Long account, @javax.annotation.Nonnull StoreTrialSubscriptionRequestSetter storeTrialSubscriptionRequestSetter, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = storeTrialSubscriptionRequestSetter;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postBoardingSubscriptionStrategyPlans");
    }
    
    // verify the required parameter 'storeTrialSubscriptionRequestSetter' is set
    if (storeTrialSubscriptionRequestSetter == null) {
      throw new ApiException(400, "Missing the required parameter 'storeTrialSubscriptionRequestSetter' when calling postBoardingSubscriptionStrategyPlans");
    }
    
    // create path and map variables
    String localVarPath = "/boarding/subscription-strategy/plans";

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
