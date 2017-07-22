/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.api;

import com.wallee.sdk.ApiCallback;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.Pair;
import com.wallee.sdk.ProgressRequestBody;
import com.wallee.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.HumanUser;
import com.wallee.sdk.model.HumanUserCreate;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.HumanUserUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanUserServiceApi {
	private ApiClient apiClient;

	public HumanUserServiceApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for count */
	private com.squareup.okhttp.Call countCall(EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = filter;
		

		// create path and map variables
		String localVarPath = "/human-user/count".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Count
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @return Long
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Long count(EntityQueryFilter filter) throws ApiException {
		ApiResponse<Long> resp = countWithHttpInfo(filter);
		return resp.getData();
	}

	/**
	 * Count
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @return ApiResponse&lt;Long&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Long> countWithHttpInfo(EntityQueryFilter filter) throws ApiException {
		com.squareup.okhttp.Call call = countCall(filter, null, null);
		Type localVarReturnType = new TypeToken<Long>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Count (asynchronously)
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call countAsync(EntityQueryFilter filter, final ApiCallback<Long> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = countCall(filter, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Long>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for create */
	private com.squareup.okhttp.Call createCall(HumanUserCreate entity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = entity;
		
		// verify the required parameter 'entity' is set
		if (entity == null) {
			throw new ApiException("Missing the required parameter 'entity' when calling create(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/human-user/create".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Create
	 *
	 * Creates the entity with the given properties.
	 *
	 * @param entity The human user object with the properties which should be created. (required)
	 * @return HumanUser
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public HumanUser create(HumanUserCreate entity) throws ApiException {
		ApiResponse<HumanUser> resp = createWithHttpInfo(entity);
		return resp.getData();
	}

	/**
	 * Create
	 *
	 * Creates the entity with the given properties.
	 *
	 * @param entity The human user object with the properties which should be created. (required)
	 * @return ApiResponse&lt;HumanUser&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<HumanUser> createWithHttpInfo(HumanUserCreate entity) throws ApiException {
		com.squareup.okhttp.Call call = createCall(entity, null, null);
		Type localVarReturnType = new TypeToken<HumanUser>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create (asynchronously)
	 *
	 * Creates the entity with the given properties.
	 *
	 * @param entity The human user object with the properties which should be created. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createAsync(HumanUserCreate entity, final ApiCallback<HumanUser> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createCall(entity, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<HumanUser>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for delete */
	private com.squareup.okhttp.Call deleteCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = id;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling delete(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/human-user/delete".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Delete
	 *
	 * Deletes the entity with the given id.
	 *
	 * @param id  (required)
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public void delete(Long id) throws ApiException {
		deleteWithHttpInfo(id);
	}

	/**
	 * Delete
	 *
	 * Deletes the entity with the given id.
	 *
	 * @param id  (required)
	 * @return ApiResponse&lt;Void&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Void> deleteWithHttpInfo(Long id) throws ApiException {
		com.squareup.okhttp.Call call = deleteCall(id, null, null);
		return apiClient.execute(call);
	}

	/**
	 * Delete (asynchronously)
	 *
	 * Deletes the entity with the given id.
	 *
	 * @param id  (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call deleteAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = deleteCall(id, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	/* Build call for read */
	private com.squareup.okhttp.Call readCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/human-user/read".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"*_/_*"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Read
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param id The id of the human user which should be returned. (required)
	 * @return HumanUser
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public HumanUser read(Long id) throws ApiException {
		ApiResponse<HumanUser> resp = readWithHttpInfo(id);
		return resp.getData();
	}

	/**
	 * Read
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param id The id of the human user which should be returned. (required)
	 * @return ApiResponse&lt;HumanUser&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<HumanUser> readWithHttpInfo(Long id) throws ApiException {
		com.squareup.okhttp.Call call = readCall(id, null, null);
		Type localVarReturnType = new TypeToken<HumanUser>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Read (asynchronously)
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param id The id of the human user which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call readAsync(Long id, final ApiCallback<HumanUser> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = readCall(id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<HumanUser>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for search */
	private com.squareup.okhttp.Call searchCall(EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = query;
		
		// verify the required parameter 'query' is set
		if (query == null) {
			throw new ApiException("Missing the required parameter 'query' when calling search(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/human-user/search".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Search
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param query The query restricts the human users which are returned by the search. (required)
	 * @return List&lt;HumanUser&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<HumanUser> search(EntityQuery query) throws ApiException {
		ApiResponse<List<HumanUser>> resp = searchWithHttpInfo(query);
		return resp.getData();
	}

	/**
	 * Search
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param query The query restricts the human users which are returned by the search. (required)
	 * @return ApiResponse&lt;List&lt;HumanUser&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<HumanUser>> searchWithHttpInfo(EntityQuery query) throws ApiException {
		com.squareup.okhttp.Call call = searchCall(query, null, null);
		Type localVarReturnType = new TypeToken<List<HumanUser>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Search (asynchronously)
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param query The query restricts the human users which are returned by the search. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call searchAsync(EntityQuery query, final ApiCallback<List<HumanUser>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = searchCall(query, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<HumanUser>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for update */
	private com.squareup.okhttp.Call updateCall(HumanUserUpdate entity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = entity;
		
		// verify the required parameter 'entity' is set
		if (entity == null) {
			throw new ApiException("Missing the required parameter 'entity' when calling update(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/human-user/update".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Update
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param entity The object with all the properties which should be updated. The id and the version are required properties. (required)
	 * @return HumanUser
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public HumanUser update(HumanUserUpdate entity) throws ApiException {
		ApiResponse<HumanUser> resp = updateWithHttpInfo(entity);
		return resp.getData();
	}

	/**
	 * Update
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param entity The object with all the properties which should be updated. The id and the version are required properties. (required)
	 * @return ApiResponse&lt;HumanUser&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<HumanUser> updateWithHttpInfo(HumanUserUpdate entity) throws ApiException {
		com.squareup.okhttp.Call call = updateCall(entity, null, null);
		Type localVarReturnType = new TypeToken<HumanUser>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Update (asynchronously)
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param entity The object with all the properties which should be updated. The id and the version are required properties. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call updateAsync(HumanUserUpdate entity, final ApiCallback<HumanUser> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = updateCall(entity, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<HumanUser>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}
