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
import com.wallee.sdk.model.UserAccountRole;
import com.wallee.sdk.model.UserAccountRoleListResponse;
import com.wallee.sdk.model.UserSpaceRole;
import com.wallee.sdk.model.UserSpaceRoleListResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;



public class SingleSignOnUsersRolesService extends BaseApi {

  public SingleSignOnUsersRolesService(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Unassign a role from a single sign-on user for an account
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteSingleSignOnUsersUserIdAccountRoles">Unassign a role from a single sign-on user for an account Documentation</a>
   */
  public void deleteSingleSignOnUsersUserIdAccountRoles(Long userId, Long roleId, Long account) throws ApiException {
    this.deleteSingleSignOnUsersUserIdAccountRoles(userId, roleId, account, Collections.emptyMap());
  }


  /**
   * Unassign a role from a single sign-on user for an account
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteSingleSignOnUsersUserIdAccountRoles">Unassign a role from a single sign-on user for an account Documentation</a>
   */
  public void deleteSingleSignOnUsersUserIdAccountRoles(Long userId, Long roleId, Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteSingleSignOnUsersUserIdAccountRoles");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling deleteSingleSignOnUsersUserIdAccountRoles");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling deleteSingleSignOnUsersUserIdAccountRoles");
    }
    
    // create path and map variables
    String localVarPath = "/single-sign-on-users/{userId}/account-roles"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("roleId", roleId));
    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

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
        null,
        requestTimeout
    );
  }

  /**
   * Unassign a role from a single sign-on user for a space
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteSingleSignOnUsersUserIdSpaceRoles">Unassign a role from a single sign-on user for a space Documentation</a>
   */
  public void deleteSingleSignOnUsersUserIdSpaceRoles(Long userId, Long roleId, Long space) throws ApiException {
    this.deleteSingleSignOnUsersUserIdSpaceRoles(userId, roleId, space, Collections.emptyMap());
  }


  /**
   * Unassign a role from a single sign-on user for a space
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#deleteSingleSignOnUsersUserIdSpaceRoles">Unassign a role from a single sign-on user for a space Documentation</a>
   */
  public void deleteSingleSignOnUsersUserIdSpaceRoles(Long userId, Long roleId, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling deleteSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling deleteSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // create path and map variables
    String localVarPath = "/single-sign-on-users/{userId}/space-roles"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("roleId", roleId));
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
        null,
        requestTimeout
    );
  }

  /**
   * List all roles of a single sign-on user for an account
   * 
   
   * @param userId  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @return UserAccountRoleListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSingleSignOnUsersUserIdAccountRoles">List all roles of a single sign-on user for an account Documentation</a>
   */
  public UserAccountRoleListResponse getSingleSignOnUsersUserIdAccountRoles(Long userId, Long account) throws ApiException {
    return this.getSingleSignOnUsersUserIdAccountRoles(userId, account, Collections.emptyMap());
  }


  /**
   * List all roles of a single sign-on user for an account
   * 
   
   * @param userId  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return UserAccountRoleListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSingleSignOnUsersUserIdAccountRoles">List all roles of a single sign-on user for an account Documentation</a>
   */
  public UserAccountRoleListResponse getSingleSignOnUsersUserIdAccountRoles(Long userId, Long account, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSingleSignOnUsersUserIdAccountRoles");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling getSingleSignOnUsersUserIdAccountRoles");
    }
    
    // create path and map variables
    String localVarPath = "/single-sign-on-users/{userId}/account-roles"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<UserAccountRoleListResponse> localVarReturnType = new TypeReference<UserAccountRoleListResponse>() {};
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
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * List all roles of a single sign-on user for a space
   * 
   
   * @param userId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @return UserSpaceRoleListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSingleSignOnUsersUserIdSpaceRoles">List all roles of a single sign-on user for a space Documentation</a>
   */
  public UserSpaceRoleListResponse getSingleSignOnUsersUserIdSpaceRoles(Long userId, Long space) throws ApiException {
    return this.getSingleSignOnUsersUserIdSpaceRoles(userId, space, Collections.emptyMap());
  }


  /**
   * List all roles of a single sign-on user for a space
   * 
   
   * @param userId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return UserSpaceRoleListResponse
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#getSingleSignOnUsersUserIdSpaceRoles">List all roles of a single sign-on user for a space Documentation</a>
   */
  public UserSpaceRoleListResponse getSingleSignOnUsersUserIdSpaceRoles(Long userId, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling getSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // create path and map variables
    String localVarPath = "/single-sign-on-users/{userId}/space-roles"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    TypeReference<UserSpaceRoleListResponse> localVarReturnType = new TypeReference<UserSpaceRoleListResponse>() {};
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
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Assign a role to a single sign-on user for an account
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param appliesOnSubAccount Whether the role should be assigned to the user in subaccounts only. (optional)
   * @return UserAccountRole
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSingleSignOnUsersUserIdAccountRoles">Assign a role to a single sign-on user for an account Documentation</a>
   */
  public UserAccountRole postSingleSignOnUsersUserIdAccountRoles(Long userId, Long roleId, Long account, Boolean appliesOnSubAccount) throws ApiException {
    return this.postSingleSignOnUsersUserIdAccountRoles(userId, roleId, account, appliesOnSubAccount, Collections.emptyMap());
  }


  /**
   * Assign a role to a single sign-on user for an account
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param account Specifies the ID of the account the operation should be executed in. (required)
   * @param appliesOnSubAccount Whether the role should be assigned to the user in subaccounts only. (optional)
   * @param additionalHeaders The additional headers for this call
   * @return UserAccountRole
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSingleSignOnUsersUserIdAccountRoles">Assign a role to a single sign-on user for an account Documentation</a>
   */
  public UserAccountRole postSingleSignOnUsersUserIdAccountRoles(Long userId, Long roleId, Long account, Boolean appliesOnSubAccount, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling postSingleSignOnUsersUserIdAccountRoles");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling postSingleSignOnUsersUserIdAccountRoles");
    }
    
    // verify the required parameter 'account' is set
    if (account == null) {
      throw new ApiException(400, "Missing the required parameter 'account' when calling postSingleSignOnUsersUserIdAccountRoles");
    }
    
    // create path and map variables
    String localVarPath = "/single-sign-on-users/{userId}/account-roles"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("roleId", roleId));
    localVarQueryParams.addAll(apiClient.parameterToPair("appliesOnSubAccount", appliesOnSubAccount));
    if (account != null)
      localVarHeaderParams.put("Account", apiClient.parameterToString(account));

    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    int requestTimeout = apiClient.getRequestTimeout();

    TypeReference<UserAccountRole> localVarReturnType = new TypeReference<UserAccountRole>() {};
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
        localVarReturnType,
        requestTimeout
    );
  }

  /**
   * Assign a role to a single sign-on user for a space
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @return UserSpaceRole
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSingleSignOnUsersUserIdSpaceRoles">Assign a role to a single sign-on user for a space Documentation</a>
   */
  public UserSpaceRole postSingleSignOnUsersUserIdSpaceRoles(Long userId, Long roleId, Long space) throws ApiException {
    return this.postSingleSignOnUsersUserIdSpaceRoles(userId, roleId, space, Collections.emptyMap());
  }


  /**
   * Assign a role to a single sign-on user for a space
   * 
   
   * @param userId  (required)
   * @param roleId  (required)
   * @param space Specifies the ID of the space the operation should be executed in. (required)
   * @param additionalHeaders The additional headers for this call
   * @return UserSpaceRole
   * @throws ApiException if fails to make API call
   * 
   * @see <a href="https://app-wallee.com/doc/api/web-service#postSingleSignOnUsersUserIdSpaceRoles">Assign a role to a single sign-on user for a space Documentation</a>
   */
  public UserSpaceRole postSingleSignOnUsersUserIdSpaceRoles(Long userId, Long roleId, Long space, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling postSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling postSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // verify the required parameter 'space' is set
    if (space == null) {
      throw new ApiException(400, "Missing the required parameter 'space' when calling postSingleSignOnUsersUserIdSpaceRoles");
    }
    
    // create path and map variables
    String localVarPath = "/single-sign-on-users/{userId}/space-roles"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("roleId", roleId));
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

    TypeReference<UserSpaceRole> localVarReturnType = new TypeReference<UserSpaceRole>() {};
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
        localVarReturnType,
        requestTimeout
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
        returnType,
        requestTimeout
    );
  }

}
