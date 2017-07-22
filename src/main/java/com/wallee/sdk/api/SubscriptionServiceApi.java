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
import com.wallee.sdk.model.SubscriptionChangeRequest;
import com.wallee.sdk.model.SubscriptionVersion;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.SubscriptionCreateRequest;
import com.wallee.sdk.model.SubscriptionCharge;
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.EntityQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionServiceApi {
	private ApiClient apiClient;

	public SubscriptionServiceApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for applyChanges */
	private com.squareup.okhttp.Call applyChangesCall(Long spaceId, SubscriptionChangeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = request;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling applyChanges(Async)");
		}
		
		// verify the required parameter 'request' is set
		if (request == null) {
			throw new ApiException("Missing the required parameter 'request' when calling applyChanges(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/applyChanges".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
	 * apply changes
	 *
	 * This operation allows to apply changes on a subscription.
	 *
	 * @param spaceId  (required)
	 *
	 * @param request  (required)
	 * @return SubscriptionVersion
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public SubscriptionVersion applyChanges(Long spaceId, SubscriptionChangeRequest request) throws ApiException {
		ApiResponse<SubscriptionVersion> resp = applyChangesWithHttpInfo(spaceId, request);
		return resp.getData();
	}

	/**
	 * apply changes
	 *
	 * This operation allows to apply changes on a subscription.
	 *
	 * @param spaceId  (required)
	 *
	 * @param request  (required)
	 * @return ApiResponse&lt;SubscriptionVersion&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<SubscriptionVersion> applyChangesWithHttpInfo(Long spaceId, SubscriptionChangeRequest request) throws ApiException {
		com.squareup.okhttp.Call call = applyChangesCall(spaceId, request, null, null);
		Type localVarReturnType = new TypeToken<SubscriptionVersion>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * apply changes (asynchronously)
	 *
	 * This operation allows to apply changes on a subscription.
	 *
	 * @param spaceId  (required)
	 *
	 * @param request  (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call applyChangesAsync(Long spaceId, SubscriptionChangeRequest request, final ApiCallback<SubscriptionVersion> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = applyChangesCall(spaceId, request, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<SubscriptionVersion>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for count */
	private com.squareup.okhttp.Call countCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = filter;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling count(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/count".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

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
	 * @param spaceId  (required)
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @return Long
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Long count(Long spaceId, EntityQueryFilter filter) throws ApiException {
		ApiResponse<Long> resp = countWithHttpInfo(spaceId, filter);
		return resp.getData();
	}

	/**
	 * Count
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param spaceId  (required)
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @return ApiResponse&lt;Long&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Long> countWithHttpInfo(Long spaceId, EntityQueryFilter filter) throws ApiException {
		com.squareup.okhttp.Call call = countCall(spaceId, filter, null, null);
		Type localVarReturnType = new TypeToken<Long>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Count (asynchronously)
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param spaceId  (required)
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call countAsync(Long spaceId, EntityQueryFilter filter, final ApiCallback<Long> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = countCall(spaceId, filter, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Long>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for create */
	private com.squareup.okhttp.Call createCall(Long spaceId, SubscriptionCreateRequest createRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = createRequest;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling create(Async)");
		}
		
		// verify the required parameter 'createRequest' is set
		if (createRequest == null) {
			throw new ApiException("Missing the required parameter 'createRequest' when calling create(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/create".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

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
	 * The create operation creates a new subscription and a corresponding subscription version.
	 *
	 * @param spaceId  (required)
	 *
	 * @param createRequest  (required)
	 * @return SubscriptionVersion
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public SubscriptionVersion create(Long spaceId, SubscriptionCreateRequest createRequest) throws ApiException {
		ApiResponse<SubscriptionVersion> resp = createWithHttpInfo(spaceId, createRequest);
		return resp.getData();
	}

	/**
	 * Create
	 *
	 * The create operation creates a new subscription and a corresponding subscription version.
	 *
	 * @param spaceId  (required)
	 *
	 * @param createRequest  (required)
	 * @return ApiResponse&lt;SubscriptionVersion&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<SubscriptionVersion> createWithHttpInfo(Long spaceId, SubscriptionCreateRequest createRequest) throws ApiException {
		com.squareup.okhttp.Call call = createCall(spaceId, createRequest, null, null);
		Type localVarReturnType = new TypeToken<SubscriptionVersion>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create (asynchronously)
	 *
	 * The create operation creates a new subscription and a corresponding subscription version.
	 *
	 * @param spaceId  (required)
	 *
	 * @param createRequest  (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createAsync(Long spaceId, SubscriptionCreateRequest createRequest, final ApiCallback<SubscriptionVersion> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createCall(spaceId, createRequest, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<SubscriptionVersion>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for initialize */
	private com.squareup.okhttp.Call initializeCall(Long spaceId, Long subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling initialize(Async)");
		}
		
		// verify the required parameter 'subscriptionId' is set
		if (subscriptionId == null) {
			throw new ApiException("Missing the required parameter 'subscriptionId' when calling initialize(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/initialize".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionId", subscriptionId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
	 * initialize
	 *
	 * The initialize operation initializes a subscription. This method uses charge flows to carry out the transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The provided subscription id will be used to lookup the subscription which should be initialized. (required)
	 * @return SubscriptionCharge
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public SubscriptionCharge initialize(Long spaceId, Long subscriptionId) throws ApiException {
		ApiResponse<SubscriptionCharge> resp = initializeWithHttpInfo(spaceId, subscriptionId);
		return resp.getData();
	}

	/**
	 * initialize
	 *
	 * The initialize operation initializes a subscription. This method uses charge flows to carry out the transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The provided subscription id will be used to lookup the subscription which should be initialized. (required)
	 * @return ApiResponse&lt;SubscriptionCharge&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<SubscriptionCharge> initializeWithHttpInfo(Long spaceId, Long subscriptionId) throws ApiException {
		com.squareup.okhttp.Call call = initializeCall(spaceId, subscriptionId, null, null);
		Type localVarReturnType = new TypeToken<SubscriptionCharge>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * initialize (asynchronously)
	 *
	 * The initialize operation initializes a subscription. This method uses charge flows to carry out the transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The provided subscription id will be used to lookup the subscription which should be initialized. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call initializeAsync(Long spaceId, Long subscriptionId, final ApiCallback<SubscriptionCharge> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = initializeCall(spaceId, subscriptionId, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<SubscriptionCharge>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for initializeSubscriberPresent */
	private com.squareup.okhttp.Call initializeSubscriberPresentCall(Long spaceId, Long subscriptionId, String successUrl, String failedUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling initializeSubscriberPresent(Async)");
		}
		
		// verify the required parameter 'subscriptionId' is set
		if (subscriptionId == null) {
			throw new ApiException("Missing the required parameter 'subscriptionId' when calling initializeSubscriberPresent(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/initializeSubscriberPresent".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionId", subscriptionId));

		if (successUrl != null) {
			localVarQueryParams.addAll(apiClient.parameterToPairs("", "successUrl", successUrl));
		}

		if (failedUrl != null) {
			localVarQueryParams.addAll(apiClient.parameterToPairs("", "failedUrl", failedUrl));
		}

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
	 * initializeSubscriberPresent
	 *
	 * The initialize operation initializes a subscription when the subscriber is present. The method will initialize a transaction which has to be completed by using the transaction service.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId  (required)
	 *
	 * @param successUrl The subscriber will be redirected to the success URL when the transaction is successful. (optional)
	 *
	 * @param failedUrl The subscriber will be redirected to the fail URL when the transaction fails. (optional)
	 * @return SubscriptionCharge
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public SubscriptionCharge initializeSubscriberPresent(Long spaceId, Long subscriptionId, String successUrl, String failedUrl) throws ApiException {
		ApiResponse<SubscriptionCharge> resp = initializeSubscriberPresentWithHttpInfo(spaceId, subscriptionId, successUrl, failedUrl);
		return resp.getData();
	}

	/**
	 * initializeSubscriberPresent
	 *
	 * The initialize operation initializes a subscription when the subscriber is present. The method will initialize a transaction which has to be completed by using the transaction service.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId  (required)
	 *
	 * @param successUrl The subscriber will be redirected to the success URL when the transaction is successful. (optional)
	 *
	 * @param failedUrl The subscriber will be redirected to the fail URL when the transaction fails. (optional)
	 * @return ApiResponse&lt;SubscriptionCharge&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<SubscriptionCharge> initializeSubscriberPresentWithHttpInfo(Long spaceId, Long subscriptionId, String successUrl, String failedUrl) throws ApiException {
		com.squareup.okhttp.Call call = initializeSubscriberPresentCall(spaceId, subscriptionId, successUrl, failedUrl, null, null);
		Type localVarReturnType = new TypeToken<SubscriptionCharge>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * initializeSubscriberPresent (asynchronously)
	 *
	 * The initialize operation initializes a subscription when the subscriber is present. The method will initialize a transaction which has to be completed by using the transaction service.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId  (required)
	 *
	 * @param successUrl The subscriber will be redirected to the success URL when the transaction is successful. (optional)
	 *
	 * @param failedUrl The subscriber will be redirected to the fail URL when the transaction fails. (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call initializeSubscriberPresentAsync(Long spaceId, Long subscriptionId, String successUrl, String failedUrl, final ApiCallback<SubscriptionCharge> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = initializeSubscriberPresentCall(spaceId, subscriptionId, successUrl, failedUrl, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<SubscriptionCharge>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for read */
	private com.squareup.okhttp.Call readCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling read(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/read".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

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
	 * @param spaceId  (required)
	 *
	 * @param id The id of the subscription which should be returned. (required)
	 * @return Subscription
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Subscription read(Long spaceId, Long id) throws ApiException {
		ApiResponse<Subscription> resp = readWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Read
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the subscription which should be returned. (required)
	 * @return ApiResponse&lt;Subscription&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Subscription> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = readCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Read (asynchronously)
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the subscription which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<Subscription> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = readCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for search */
	private com.squareup.okhttp.Call searchCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = query;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling search(Async)");
		}
		
		// verify the required parameter 'query' is set
		if (query == null) {
			throw new ApiException("Missing the required parameter 'query' when calling search(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/search".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

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
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the subscriptions which are returned by the search. (required)
	 * @return List&lt;Subscription&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<Subscription> search(Long spaceId, EntityQuery query) throws ApiException {
		ApiResponse<List<Subscription>> resp = searchWithHttpInfo(spaceId, query);
		return resp.getData();
	}

	/**
	 * Search
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the subscriptions which are returned by the search. (required)
	 * @return ApiResponse&lt;List&lt;Subscription&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<Subscription>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
		com.squareup.okhttp.Call call = searchCall(spaceId, query, null, null);
		Type localVarReturnType = new TypeToken<List<Subscription>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Search (asynchronously)
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the subscriptions which are returned by the search. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<Subscription>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = searchCall(spaceId, query, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<Subscription>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for terminate */
	private com.squareup.okhttp.Call terminateCall(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling terminate(Async)");
		}
		
		// verify the required parameter 'subscriptionId' is set
		if (subscriptionId == null) {
			throw new ApiException("Missing the required parameter 'subscriptionId' when calling terminate(Async)");
		}
		
		// verify the required parameter 'respectTerminationPeriod' is set
		if (respectTerminationPeriod == null) {
			throw new ApiException("Missing the required parameter 'respectTerminationPeriod' when calling terminate(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/terminate".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionId", subscriptionId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "respectTerminationPeriod", respectTerminationPeriod));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
	 * terminate
	 *
	 * This operation allows to terminate a subscription.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The subscription id identifies the subscription which should be terminated. (required)
	 *
	 * @param respectTerminationPeriod The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. (required)
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public void terminate(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws ApiException {
		terminateWithHttpInfo(spaceId, subscriptionId, respectTerminationPeriod);
	}

	/**
	 * terminate
	 *
	 * This operation allows to terminate a subscription.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The subscription id identifies the subscription which should be terminated. (required)
	 *
	 * @param respectTerminationPeriod The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. (required)
	 * @return ApiResponse&lt;Void&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Void> terminateWithHttpInfo(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws ApiException {
		com.squareup.okhttp.Call call = terminateCall(spaceId, subscriptionId, respectTerminationPeriod, null, null);
		return apiClient.execute(call);
	}

	/**
	 * terminate (asynchronously)
	 *
	 * This operation allows to terminate a subscription.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The subscription id identifies the subscription which should be terminated. (required)
	 *
	 * @param respectTerminationPeriod The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call terminateAsync(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, final ApiCallback<Void> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = terminateCall(spaceId, subscriptionId, respectTerminationPeriod, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	/* Build call for updateProductVersion */
	private com.squareup.okhttp.Call updateProductVersionCall(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling updateProductVersion(Async)");
		}
		
		// verify the required parameter 'subscriptionId' is set
		if (subscriptionId == null) {
			throw new ApiException("Missing the required parameter 'subscriptionId' when calling updateProductVersion(Async)");
		}
		
		// verify the required parameter 'respectTerminationPeriod' is set
		if (respectTerminationPeriod == null) {
			throw new ApiException("Missing the required parameter 'respectTerminationPeriod' when calling updateProductVersion(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/subscription/updateProductVersion".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionId", subscriptionId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "respectTerminationPeriod", respectTerminationPeriod));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
	 * update product version
	 *
	 * The update product version operation updates the product version of the subscription to the latest active product version.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The subscription id identifies the subscription which should be updated to the latest version. (required)
	 *
	 * @param respectTerminationPeriod The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. (required)
	 * @return SubscriptionVersion
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public SubscriptionVersion updateProductVersion(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws ApiException {
		ApiResponse<SubscriptionVersion> resp = updateProductVersionWithHttpInfo(spaceId, subscriptionId, respectTerminationPeriod);
		return resp.getData();
	}

	/**
	 * update product version
	 *
	 * The update product version operation updates the product version of the subscription to the latest active product version.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The subscription id identifies the subscription which should be updated to the latest version. (required)
	 *
	 * @param respectTerminationPeriod The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. (required)
	 * @return ApiResponse&lt;SubscriptionVersion&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<SubscriptionVersion> updateProductVersionWithHttpInfo(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws ApiException {
		com.squareup.okhttp.Call call = updateProductVersionCall(spaceId, subscriptionId, respectTerminationPeriod, null, null);
		Type localVarReturnType = new TypeToken<SubscriptionVersion>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * update product version (asynchronously)
	 *
	 * The update product version operation updates the product version of the subscription to the latest active product version.
	 *
	 * @param spaceId  (required)
	 *
	 * @param subscriptionId The subscription id identifies the subscription which should be updated to the latest version. (required)
	 *
	 * @param respectTerminationPeriod The subscription version may be retired. The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call updateProductVersionAsync(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, final ApiCallback<SubscriptionVersion> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = updateProductVersionCall(spaceId, subscriptionId, respectTerminationPeriod, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<SubscriptionVersion>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}
