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
import com.wallee.sdk.model.WalleejoinAdminPartnerConfigurationRequestDto;
import com.wallee.sdk.model.WalleejoinAdminPartnerConfigurationResponseDto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class JoinAdminPartnerConfigurationService extends BaseApi {

  public JoinAdminPartnerConfigurationService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Delete a join admin partner configuration
   * 
   
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteScopeJoinProgramPartnersConfigurationsId">Delete a join admin partner configuration Documentation</a>
   */
  public void deleteScopeJoinProgramPartnersConfigurationsId(@javax.annotation.Nonnull Long id) throws ApiException {
    this.deleteScopeJoinProgramPartnersConfigurationsId(id, Collections.emptyMap());
  }


  /**
   * Delete a join admin partner configuration
   * 
   
   * @param id  (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteScopeJoinProgramPartnersConfigurationsId">Delete a join admin partner configuration Documentation</a>
   */
  public void deleteScopeJoinProgramPartnersConfigurationsId(@javax.annotation.Nonnull Long id, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteScopeJoinProgramPartnersConfigurationsId");
    }
    
    // create path and map variables
    String localVarPath = "/scope/join-program/partners/configurations/{id}"
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
   * Retrieve a join admin partner configuration
   * 
   
   * @param id  (required)
   * @param expand  (optional)
   * @return WalleejoinAdminPartnerConfigurationResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getScopeJoinProgramPartnersConfigurationsId">Retrieve a join admin partner configuration Documentation</a>
   */
  public WalleejoinAdminPartnerConfigurationResponseDto getScopeJoinProgramPartnersConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.getScopeJoinProgramPartnersConfigurationsId(id, expand, Collections.emptyMap());
  }


  /**
   * Retrieve a join admin partner configuration
   * 
   
   * @param id  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinAdminPartnerConfigurationResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getScopeJoinProgramPartnersConfigurationsId">Retrieve a join admin partner configuration Documentation</a>
   */
  public WalleejoinAdminPartnerConfigurationResponseDto getScopeJoinProgramPartnersConfigurationsId(@javax.annotation.Nonnull Long id, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getScopeJoinProgramPartnersConfigurationsId");
    }
    
    // create path and map variables
    String localVarPath = "/scope/join-program/partners/configurations/{id}"
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

    TypeReference<WalleejoinAdminPartnerConfigurationResponseDto> localVarReturnType = new TypeReference<WalleejoinAdminPartnerConfigurationResponseDto>() {};
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
   * Update a join admin partner configuration
   * 
   
   * @param partnerAccountId  (required)
   * @param walleejoinAdminPartnerConfigurationRequestDto  (required)
   * @param expand  (optional)
   * @return WalleejoinAdminPartnerConfigurationResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchScopeJoinProgramPartnersConfigurationsPartnerAccountId">Update a join admin partner configuration Documentation</a>
   */
  public WalleejoinAdminPartnerConfigurationResponseDto patchScopeJoinProgramPartnersConfigurationsPartnerAccountId(@javax.annotation.Nonnull Long partnerAccountId, @javax.annotation.Nonnull WalleejoinAdminPartnerConfigurationRequestDto walleejoinAdminPartnerConfigurationRequestDto, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.patchScopeJoinProgramPartnersConfigurationsPartnerAccountId(partnerAccountId, walleejoinAdminPartnerConfigurationRequestDto, expand, Collections.emptyMap());
  }


  /**
   * Update a join admin partner configuration
   * 
   
   * @param partnerAccountId  (required)
   * @param walleejoinAdminPartnerConfigurationRequestDto  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinAdminPartnerConfigurationResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#patchScopeJoinProgramPartnersConfigurationsPartnerAccountId">Update a join admin partner configuration Documentation</a>
   */
  public WalleejoinAdminPartnerConfigurationResponseDto patchScopeJoinProgramPartnersConfigurationsPartnerAccountId(@javax.annotation.Nonnull Long partnerAccountId, @javax.annotation.Nonnull WalleejoinAdminPartnerConfigurationRequestDto walleejoinAdminPartnerConfigurationRequestDto, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = walleejoinAdminPartnerConfigurationRequestDto;
    
    // verify the required parameter 'partnerAccountId' is set
    if (partnerAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'partnerAccountId' when calling patchScopeJoinProgramPartnersConfigurationsPartnerAccountId");
    }
    
    // verify the required parameter 'walleejoinAdminPartnerConfigurationRequestDto' is set
    if (walleejoinAdminPartnerConfigurationRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'walleejoinAdminPartnerConfigurationRequestDto' when calling patchScopeJoinProgramPartnersConfigurationsPartnerAccountId");
    }
    
    // create path and map variables
    String localVarPath = "/scope/join-program/partners/configurations/{partnerAccountId}"
      .replaceAll("\\{" + "partnerAccountId" + "\\}", apiClient.escapeString(apiClient.parameterToString(partnerAccountId)));

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

    TypeReference<WalleejoinAdminPartnerConfigurationResponseDto> localVarReturnType = new TypeReference<WalleejoinAdminPartnerConfigurationResponseDto>() {};
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
   * Create a join admin partner configuration
   * 
   
   * @param walleejoinAdminPartnerConfigurationRequestDto  (required)
   * @param expand  (optional)
   * @return WalleejoinAdminPartnerConfigurationResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postScopeJoinProgramPartnersConfigurations">Create a join admin partner configuration Documentation</a>
   */
  public WalleejoinAdminPartnerConfigurationResponseDto postScopeJoinProgramPartnersConfigurations(@javax.annotation.Nonnull WalleejoinAdminPartnerConfigurationRequestDto walleejoinAdminPartnerConfigurationRequestDto, @javax.annotation.Nullable Set<String> expand) throws ApiException {
    return this.postScopeJoinProgramPartnersConfigurations(walleejoinAdminPartnerConfigurationRequestDto, expand, Collections.emptyMap());
  }


  /**
   * Create a join admin partner configuration
   * 
   
   * @param walleejoinAdminPartnerConfigurationRequestDto  (required)
   * @param expand  (optional)
   * @param additionalHeaders The additional headers for this call
   * @return WalleejoinAdminPartnerConfigurationResponseDto
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postScopeJoinProgramPartnersConfigurations">Create a join admin partner configuration Documentation</a>
   */
  public WalleejoinAdminPartnerConfigurationResponseDto postScopeJoinProgramPartnersConfigurations(@javax.annotation.Nonnull WalleejoinAdminPartnerConfigurationRequestDto walleejoinAdminPartnerConfigurationRequestDto, @javax.annotation.Nullable Set<String> expand, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = walleejoinAdminPartnerConfigurationRequestDto;
    
    // verify the required parameter 'walleejoinAdminPartnerConfigurationRequestDto' is set
    if (walleejoinAdminPartnerConfigurationRequestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'walleejoinAdminPartnerConfigurationRequestDto' when calling postScopeJoinProgramPartnersConfigurations");
    }
    
    // create path and map variables
    String localVarPath = "/scope/join-program/partners/configurations";

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

    TypeReference<WalleejoinAdminPartnerConfigurationResponseDto> localVarReturnType = new TypeReference<WalleejoinAdminPartnerConfigurationResponseDto>() {};
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
