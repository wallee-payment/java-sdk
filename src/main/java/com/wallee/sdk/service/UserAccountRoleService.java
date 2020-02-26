/**
*  SDK
*
* This library allows to interact with the  payment service.
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

import com.wallee.sdk.ApiCallback;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.Pair;
import com.wallee.sdk.ProgressRequestBody;
import com.wallee.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.UserAccountRole;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccountRoleService {
    private ApiClient apiClient;

    public UserAccountRoleService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addRole
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and account. (required)
     * @param appliesOnSubaccount Whether the role applies only on subaccount. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>
     */
    public com.squareup.okhttp.Call addRoleCall(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user-account-role/addRole";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
        if (accountId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountId", accountId));
        if (roleId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("roleId", roleId));
        if (appliesOnSubaccount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("appliesOnSubaccount", appliesOnSubaccount));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addRoleValidateBeforeCall(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling addRole(Async)");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling addRole(Async)");
        }
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling addRole(Async)");
        }
        

        com.squareup.okhttp.Call call = addRoleCall(userId, accountId, roleId, appliesOnSubaccount, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add Role
     * This operation grants the role to the given user with in the given account.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and account. (required)
     * @param appliesOnSubaccount Whether the role applies only on subaccount. (optional)
     * @return UserAccountRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>
     */
    public UserAccountRole addRole(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount) throws ApiException {
        ApiResponse<UserAccountRole> resp = addRoleWithHttpInfo(userId, accountId, roleId, appliesOnSubaccount);
        return resp.getData();
    }

    /**
     * Add Role
     * This operation grants the role to the given user with in the given account.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and account. (required)
     * @param appliesOnSubaccount Whether the role applies only on subaccount. (optional)
     * @return ApiResponse&lt;UserAccountRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>
     */
    public ApiResponse<UserAccountRole> addRoleWithHttpInfo(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount) throws ApiException {
        com.squareup.okhttp.Call call = addRoleValidateBeforeCall(userId, accountId, roleId, appliesOnSubaccount, null, null);
        Type localVarReturnType = new TypeToken<UserAccountRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add Role (asynchronously)
     * This operation grants the role to the given user with in the given account.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @param roleId The role which is mapped to the user and account. (required)
     * @param appliesOnSubaccount Whether the role applies only on subaccount. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>
     */
    public com.squareup.okhttp.Call addRoleAsync(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount, final ApiCallback<UserAccountRole> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addRoleValidateBeforeCall(userId, accountId, roleId, appliesOnSubaccount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserAccountRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>
     */
    public com.squareup.okhttp.Call listCall(Long userId, Long accountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user-account-role/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userId", userId));
        if (accountId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountId", accountId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listValidateBeforeCall(Long userId, Long accountId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling list(Async)");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling list(Async)");
        }
        

        com.squareup.okhttp.Call call = listCall(userId, accountId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Roles
     * List all the roles that are assigned to the given user in the given account.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @return List&lt;UserAccountRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>
     */
    public List<UserAccountRole> list(Long userId, Long accountId) throws ApiException {
        ApiResponse<List<UserAccountRole>> resp = listWithHttpInfo(userId, accountId);
        return resp.getData();
    }

    /**
     * List Roles
     * List all the roles that are assigned to the given user in the given account.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @return ApiResponse&lt;List&lt;UserAccountRole&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>
     */
    public ApiResponse<List<UserAccountRole>> listWithHttpInfo(Long userId, Long accountId) throws ApiException {
        com.squareup.okhttp.Call call = listValidateBeforeCall(userId, accountId, null, null);
        Type localVarReturnType = new TypeToken<List<UserAccountRole>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Roles (asynchronously)
     * List all the roles that are assigned to the given user in the given account.
     * @param userId The id of the user to whom the role is assigned. (required)
     * @param accountId The account to which the role is mapped. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>
     */
    public com.squareup.okhttp.Call listAsync(Long userId, Long accountId, final ApiCallback<List<UserAccountRole>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listValidateBeforeCall(userId, accountId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UserAccountRole>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeRole
     * @param id The id of user account role which should be removed (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>
     */
    public com.squareup.okhttp.Call removeRoleCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user-account-role/removeRole";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeRoleValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeRole(Async)");
        }
        

        com.squareup.okhttp.Call call = removeRoleCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Role
     * This operation removes the specified user account role.
     * @param id The id of user account role which should be removed (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>
     */
    public void removeRole(Long id) throws ApiException {
        removeRoleWithHttpInfo(id);
    }

    /**
     * Remove Role
     * This operation removes the specified user account role.
     * @param id The id of user account role which should be removed (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>
     */
    public ApiResponse<Void> removeRoleWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = removeRoleValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove Role (asynchronously)
     * This operation removes the specified user account role.
     * @param id The id of user account role which should be removed (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>
     */
    public com.squareup.okhttp.Call removeRoleAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = removeRoleValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
