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

import com.wallee.sdk.model.MerchantApplicationDataDto;
import com.wallee.sdk.model.MerchantApplicationStatusDto;
import com.wallee.sdk.model.RestApiErrorResponse;
import java.util.Set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class MerchantApplicationsService extends BaseApi {

  public MerchantApplicationsService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Retrieve a merchant application status
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @return MerchantApplicationStatusDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getOnboardingMerchantApplicationsIdStatus">Retrieve a merchant application status Documentation</a>
   */
  public MerchantApplicationStatusDto getOnboardingMerchantApplicationsIdStatus(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getOnboardingMerchantApplicationsIdStatus(id, account, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a merchant application status
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return MerchantApplicationStatusDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getOnboardingMerchantApplicationsIdStatus">Retrieve a merchant application status Documentation</a>
   */
  public MerchantApplicationStatusDto getOnboardingMerchantApplicationsIdStatus(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOnboardingMerchantApplicationsIdStatus");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getOnboardingMerchantApplicationsIdStatus");
    }
    
    // create path and map variables
    String localVarPath = "/onboarding/merchant-applications/{id}/status"
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

    TypeReference<MerchantApplicationStatusDto> localVarReturnType = new TypeReference<MerchantApplicationStatusDto>() {};
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
   * Return merchant application submission URL
   * Returns the URL where the merchant can review the application and complete the submission.
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getOnboardingMerchantApplicationsIdSubmissionUrl">Return merchant application submission URL Documentation</a>
   */
  public String getOnboardingMerchantApplicationsIdSubmissionUrl(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account) throws ApiException {
    return this.getOnboardingMerchantApplicationsIdSubmissionUrl(id, account, Collections.emptyMap());
  }


  /**
   * Return merchant application submission URL
   * Returns the URL where the merchant can review the application and complete the submission.
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return String
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getOnboardingMerchantApplicationsIdSubmissionUrl">Return merchant application submission URL Documentation</a>
   */
  public String getOnboardingMerchantApplicationsIdSubmissionUrl(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOnboardingMerchantApplicationsIdSubmissionUrl");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getOnboardingMerchantApplicationsIdSubmissionUrl");
    }
    
    // create path and map variables
    String localVarPath = "/onboarding/merchant-applications/{id}/submission-url"
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
      "text/plain", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
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
   * Update a merchant application
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param merchantApplicationDataDto  (required)
   * @param expand  (optional)
   * @return MerchantApplicationDataDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchOnboardingMerchantApplicationsId">Update a merchant application Documentation</a>
   */
  public MerchantApplicationDataDto patchOnboardingMerchantApplicationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, @javax.annotation.Nonnull MerchantApplicationDataDto merchantApplicationDataDto, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchOnboardingMerchantApplicationsId(id, account, merchantApplicationDataDto, expand, Collections.emptyMap());
  }


  /**
   * Update a merchant application
   * 
   
   * @param id  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param merchantApplicationDataDto  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return MerchantApplicationDataDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchOnboardingMerchantApplicationsId">Update a merchant application Documentation</a>
   */
  public MerchantApplicationDataDto patchOnboardingMerchantApplicationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nonnull Long account, @javax.annotation.Nonnull MerchantApplicationDataDto merchantApplicationDataDto, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = merchantApplicationDataDto;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchOnboardingMerchantApplicationsId");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling patchOnboardingMerchantApplicationsId");
    }
    
    // verify the required parameter 'merchantApplicationDataDto' is set
    if (merchantApplicationDataDto == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantApplicationDataDto' when calling patchOnboardingMerchantApplicationsId");
    }
    
    // create path and map variables
    String localVarPath = "/onboarding/merchant-applications/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<MerchantApplicationDataDto> localVarReturnType = new TypeReference<MerchantApplicationDataDto>() {};
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
   * Create a merchant application
   * Creates a merchant application. The request body is optional. Send an empty body to create a draft application, or send the full application payload to create it with initial data
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @param merchantApplicationDataDto  (optional)
   * @return MerchantApplicationDataDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postOnboardingMerchantApplications">Create a merchant application Documentation</a>
   */
  public MerchantApplicationDataDto postOnboardingMerchantApplications(@javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable MerchantApplicationDataDto merchantApplicationDataDto) throws ApiException {
    return this.postOnboardingMerchantApplications(account, expand, merchantApplicationDataDto, Collections.emptyMap());
  }


  /**
   * Create a merchant application
   * Creates a merchant application. The request body is optional. Send an empty body to create a draft application, or send the full application payload to create it with initial data
   
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param expand  (optional)
   * @param merchantApplicationDataDto  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return MerchantApplicationDataDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postOnboardingMerchantApplications">Create a merchant application Documentation</a>
   */
  public MerchantApplicationDataDto postOnboardingMerchantApplications(@javax.annotation.Nonnull Long account, @javax.annotation.Nullable Set<String> expand, @javax.annotation.Nullable MerchantApplicationDataDto merchantApplicationDataDto, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = merchantApplicationDataDto;
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postOnboardingMerchantApplications");
    }
    
    // create path and map variables
    String localVarPath = "/onboarding/merchant-applications";

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

    TypeReference<MerchantApplicationDataDto> localVarReturnType = new TypeReference<MerchantApplicationDataDto>() {};
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
