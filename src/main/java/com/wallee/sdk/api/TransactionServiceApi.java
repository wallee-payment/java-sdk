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
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionPending;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.TransactionCreate;
import com.wallee.sdk.model.TokenVersion;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.RenderedDocument;
import com.wallee.sdk.model.TransactionLineItemVersion;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.TransactionLineItemUpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionServiceApi {
	private ApiClient apiClient;

	public TransactionServiceApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for buildJavaScriptUrl */
	private com.squareup.okhttp.Call buildJavaScriptUrlCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling buildJavaScriptUrl(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling buildJavaScriptUrl(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/buildJavaScriptUrl".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Build JavaScript URL
	 *
	 * This operation creates the URL which can be used to embed the JavaScript for handling the iFrame checkout flow.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return String
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public String buildJavaScriptUrl(Long spaceId, Long id) throws ApiException {
		ApiResponse<String> resp = buildJavaScriptUrlWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Build JavaScript URL
	 *
	 * This operation creates the URL which can be used to embed the JavaScript for handling the iFrame checkout flow.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<String> buildJavaScriptUrlWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = buildJavaScriptUrlCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Build JavaScript URL (asynchronously)
	 *
	 * This operation creates the URL which can be used to embed the JavaScript for handling the iFrame checkout flow.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call buildJavaScriptUrlAsync(Long spaceId, Long id, final ApiCallback<String> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = buildJavaScriptUrlCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for buildMobileSdkUrlWithCredentials */
	private com.squareup.okhttp.Call buildMobileSdkUrlWithCredentialsCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'credentials' is set
		if (credentials == null) {
			throw new ApiException("Missing the required parameter 'credentials' when calling buildMobileSdkUrlWithCredentials(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/buildMobileSdkUrlWithCredentials".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "credentials", credentials));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Build Mobile SDK URL with Credentials
	 *
	 * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return String
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public String buildMobileSdkUrlWithCredentials(String credentials) throws ApiException {
		ApiResponse<String> resp = buildMobileSdkUrlWithCredentialsWithHttpInfo(credentials);
		return resp.getData();
	}

	/**
	 * Build Mobile SDK URL with Credentials
	 *
	 * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<String> buildMobileSdkUrlWithCredentialsWithHttpInfo(String credentials) throws ApiException {
		com.squareup.okhttp.Call call = buildMobileSdkUrlWithCredentialsCall(credentials, null, null);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Build Mobile SDK URL with Credentials (asynchronously)
	 *
	 * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call buildMobileSdkUrlWithCredentialsAsync(String credentials, final ApiCallback<String> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = buildMobileSdkUrlWithCredentialsCall(credentials, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for buildPaymentPageUrl */
	private com.squareup.okhttp.Call buildPaymentPageUrlCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling buildPaymentPageUrl(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling buildPaymentPageUrl(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/buildPaymentPageUrl".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Build Payment Page URL
	 *
	 * This operation creates the URL to which the user should be redirected to when the payment page should be used.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return String
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public String buildPaymentPageUrl(Long spaceId, Long id) throws ApiException {
		ApiResponse<String> resp = buildPaymentPageUrlWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Build Payment Page URL
	 *
	 * This operation creates the URL to which the user should be redirected to when the payment page should be used.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<String> buildPaymentPageUrlWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = buildPaymentPageUrlCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Build Payment Page URL (asynchronously)
	 *
	 * This operation creates the URL to which the user should be redirected to when the payment page should be used.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call buildPaymentPageUrlAsync(Long spaceId, Long id, final ApiCallback<String> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = buildPaymentPageUrlCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for confirm */
	private com.squareup.okhttp.Call confirmCall(Long spaceId, TransactionPending transactionModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = transactionModel;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling confirm(Async)");
		}
		
		// verify the required parameter 'transactionModel' is set
		if (transactionModel == null) {
			throw new ApiException("Missing the required parameter 'transactionModel' when calling confirm(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/confirm".replaceAll("\\{format\\}","json");

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
	 * Confirm
	 *
	 * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionModel The transaction JSON object to update and confirm. (required)
	 * @return Transaction
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Transaction confirm(Long spaceId, TransactionPending transactionModel) throws ApiException {
		ApiResponse<Transaction> resp = confirmWithHttpInfo(spaceId, transactionModel);
		return resp.getData();
	}

	/**
	 * Confirm
	 *
	 * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionModel The transaction JSON object to update and confirm. (required)
	 * @return ApiResponse&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Transaction> confirmWithHttpInfo(Long spaceId, TransactionPending transactionModel) throws ApiException {
		com.squareup.okhttp.Call call = confirmCall(spaceId, transactionModel, null, null);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Confirm (asynchronously)
	 *
	 * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionModel The transaction JSON object to update and confirm. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call confirmAsync(Long spaceId, TransactionPending transactionModel, final ApiCallback<Transaction> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = confirmCall(spaceId, transactionModel, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
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
		String localVarPath = "/transaction/count".replaceAll("\\{format\\}","json");

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
	private com.squareup.okhttp.Call createCall(Long spaceId, TransactionCreate transaction, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = transaction;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling create(Async)");
		}
		
		// verify the required parameter 'transaction' is set
		if (transaction == null) {
			throw new ApiException("Missing the required parameter 'transaction' when calling create(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/create".replaceAll("\\{format\\}","json");

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
	 * Creates the entity with the given properties.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transaction The transaction object which should be created. (required)
	 * @return Transaction
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Transaction create(Long spaceId, TransactionCreate transaction) throws ApiException {
		ApiResponse<Transaction> resp = createWithHttpInfo(spaceId, transaction);
		return resp.getData();
	}

	/**
	 * Create
	 *
	 * Creates the entity with the given properties.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transaction The transaction object which should be created. (required)
	 * @return ApiResponse&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Transaction> createWithHttpInfo(Long spaceId, TransactionCreate transaction) throws ApiException {
		com.squareup.okhttp.Call call = createCall(spaceId, transaction, null, null);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create (asynchronously)
	 *
	 * Creates the entity with the given properties.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transaction The transaction object which should be created. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createAsync(Long spaceId, TransactionCreate transaction, final ApiCallback<Transaction> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createCall(spaceId, transaction, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for createTransactionCredentials */
	private com.squareup.okhttp.Call createTransactionCredentialsCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling createTransactionCredentials(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling createTransactionCredentials(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/createTransactionCredentials".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Create Transaction Credentials
	 *
	 * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return String
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public String createTransactionCredentials(Long spaceId, Long id) throws ApiException {
		ApiResponse<String> resp = createTransactionCredentialsWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Create Transaction Credentials
	 *
	 * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<String> createTransactionCredentialsWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = createTransactionCredentialsCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create Transaction Credentials (asynchronously)
	 *
	 * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createTransactionCredentialsAsync(Long spaceId, Long id, final ApiCallback<String> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createTransactionCredentialsCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<String>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for deleteOneClickTokenWithCredentials */
	private com.squareup.okhttp.Call deleteOneClickTokenWithCredentialsCall(String credentials, Long tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'credentials' is set
		if (credentials == null) {
			throw new ApiException("Missing the required parameter 'credentials' when calling deleteOneClickTokenWithCredentials(Async)");
		}
		
		// verify the required parameter 'tokenId' is set
		if (tokenId == null) {
			throw new ApiException("Missing the required parameter 'tokenId' when calling deleteOneClickTokenWithCredentials(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/deleteOneClickTokenWithCredentials".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "credentials", credentials));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenId", tokenId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Delete One-Click Token with Credentials
	 *
	 * This operation removes the given token.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 *
	 * @param tokenId The token ID will be used to find the token which should be removed. (required)
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public void deleteOneClickTokenWithCredentials(String credentials, Long tokenId) throws ApiException {
		deleteOneClickTokenWithCredentialsWithHttpInfo(credentials, tokenId);
	}

	/**
	 * Delete One-Click Token with Credentials
	 *
	 * This operation removes the given token.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 *
	 * @param tokenId The token ID will be used to find the token which should be removed. (required)
	 * @return ApiResponse&lt;Void&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Void> deleteOneClickTokenWithCredentialsWithHttpInfo(String credentials, Long tokenId) throws ApiException {
		com.squareup.okhttp.Call call = deleteOneClickTokenWithCredentialsCall(credentials, tokenId, null, null);
		return apiClient.execute(call);
	}

	/**
	 * Delete One-Click Token with Credentials (asynchronously)
	 *
	 * This operation removes the given token.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 *
	 * @param tokenId The token ID will be used to find the token which should be removed. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call deleteOneClickTokenWithCredentialsAsync(String credentials, Long tokenId, final ApiCallback<Void> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = deleteOneClickTokenWithCredentialsCall(credentials, tokenId, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	/* Build call for fetchOneClickTokensWithCredentials */
	private com.squareup.okhttp.Call fetchOneClickTokensWithCredentialsCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'credentials' is set
		if (credentials == null) {
			throw new ApiException("Missing the required parameter 'credentials' when calling fetchOneClickTokensWithCredentials(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/fetchOneClickTokensWithCredentials".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "credentials", credentials));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Fetch One Click Tokens with Credentials
	 *
	 * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return List&lt;TokenVersion&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<TokenVersion> fetchOneClickTokensWithCredentials(String credentials) throws ApiException {
		ApiResponse<List<TokenVersion>> resp = fetchOneClickTokensWithCredentialsWithHttpInfo(credentials);
		return resp.getData();
	}

	/**
	 * Fetch One Click Tokens with Credentials
	 *
	 * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return ApiResponse&lt;List&lt;TokenVersion&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<TokenVersion>> fetchOneClickTokensWithCredentialsWithHttpInfo(String credentials) throws ApiException {
		com.squareup.okhttp.Call call = fetchOneClickTokensWithCredentialsCall(credentials, null, null);
		Type localVarReturnType = new TypeToken<List<TokenVersion>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Fetch One Click Tokens with Credentials (asynchronously)
	 *
	 * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call fetchOneClickTokensWithCredentialsAsync(String credentials, final ApiCallback<List<TokenVersion>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = fetchOneClickTokensWithCredentialsCall(credentials, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<TokenVersion>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for fetchPossiblePaymentMethods */
	private com.squareup.okhttp.Call fetchPossiblePaymentMethodsCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling fetchPossiblePaymentMethods(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling fetchPossiblePaymentMethods(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/fetchPossiblePaymentMethods".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Fetch Possible Payment Methods
	 *
	 * This operation allows to get the payment method configurations which can be used with the provided transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return List&lt;PaymentMethodConfiguration&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<PaymentMethodConfiguration> fetchPossiblePaymentMethods(Long spaceId, Long id) throws ApiException {
		ApiResponse<List<PaymentMethodConfiguration>> resp = fetchPossiblePaymentMethodsWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Fetch Possible Payment Methods
	 *
	 * This operation allows to get the payment method configurations which can be used with the provided transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return ApiResponse&lt;List&lt;PaymentMethodConfiguration&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<PaymentMethodConfiguration>> fetchPossiblePaymentMethodsWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Fetch Possible Payment Methods (asynchronously)
	 *
	 * This operation allows to get the payment method configurations which can be used with the provided transaction.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call fetchPossiblePaymentMethodsAsync(Long spaceId, Long id, final ApiCallback<List<PaymentMethodConfiguration>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for fetchPossiblePaymentMethodsWithCredentials */
	private com.squareup.okhttp.Call fetchPossiblePaymentMethodsWithCredentialsCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'credentials' is set
		if (credentials == null) {
			throw new ApiException("Missing the required parameter 'credentials' when calling fetchPossiblePaymentMethodsWithCredentials(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/fetchPossiblePaymentMethodsWithCredentials".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "credentials", credentials));

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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Fetch Possible Payment Methods with Credentials
	 *
	 * This operation allows to get the payment method configurations which can be used with the provided transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return List&lt;PaymentMethodConfiguration&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<PaymentMethodConfiguration> fetchPossiblePaymentMethodsWithCredentials(String credentials) throws ApiException {
		ApiResponse<List<PaymentMethodConfiguration>> resp = fetchPossiblePaymentMethodsWithCredentialsWithHttpInfo(credentials);
		return resp.getData();
	}

	/**
	 * Fetch Possible Payment Methods with Credentials
	 *
	 * This operation allows to get the payment method configurations which can be used with the provided transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return ApiResponse&lt;List&lt;PaymentMethodConfiguration&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<PaymentMethodConfiguration>> fetchPossiblePaymentMethodsWithCredentialsWithHttpInfo(String credentials) throws ApiException {
		com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsWithCredentialsCall(credentials, null, null);
		Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Fetch Possible Payment Methods with Credentials (asynchronously)
	 *
	 * This operation allows to get the payment method configurations which can be used with the provided transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call fetchPossiblePaymentMethodsWithCredentialsAsync(String credentials, final ApiCallback<List<PaymentMethodConfiguration>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = fetchPossiblePaymentMethodsWithCredentialsCall(credentials, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<PaymentMethodConfiguration>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for getInvoiceDocument */
	private com.squareup.okhttp.Call getInvoiceDocumentCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling getInvoiceDocument(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling getInvoiceDocument(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/getInvoiceDocument".replaceAll("\\{format\\}","json");

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
	 * getInvoiceDocument
	 *
	 * Returns the PDF document for the transaction invoice with given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the invoice document for. (required)
	 * @return RenderedDocument
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public RenderedDocument getInvoiceDocument(Long spaceId, Long id) throws ApiException {
		ApiResponse<RenderedDocument> resp = getInvoiceDocumentWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * getInvoiceDocument
	 *
	 * Returns the PDF document for the transaction invoice with given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the invoice document for. (required)
	 * @return ApiResponse&lt;RenderedDocument&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<RenderedDocument> getInvoiceDocumentWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = getInvoiceDocumentCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * getInvoiceDocument (asynchronously)
	 *
	 * Returns the PDF document for the transaction invoice with given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the invoice document for. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getInvoiceDocumentAsync(Long spaceId, Long id, final ApiCallback<RenderedDocument> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = getInvoiceDocumentCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for getLatestTransactionLineItemVersion */
	private com.squareup.okhttp.Call getLatestTransactionLineItemVersionCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling getLatestTransactionLineItemVersion(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling getLatestTransactionLineItemVersion(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/getLatestTransactionLineItemVersion".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * getLatestTransactionLineItemVersion
	 *
	 * 
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the latest line item version for. (required)
	 * @return TransactionLineItemVersion
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public TransactionLineItemVersion getLatestTransactionLineItemVersion(Long spaceId, Long id) throws ApiException {
		ApiResponse<TransactionLineItemVersion> resp = getLatestTransactionLineItemVersionWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * getLatestTransactionLineItemVersion
	 *
	 * 
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the latest line item version for. (required)
	 * @return ApiResponse&lt;TransactionLineItemVersion&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<TransactionLineItemVersion> getLatestTransactionLineItemVersionWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = getLatestTransactionLineItemVersionCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * getLatestTransactionLineItemVersion (asynchronously)
	 *
	 * 
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the latest line item version for. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getLatestTransactionLineItemVersionAsync(Long spaceId, Long id, final ApiCallback<TransactionLineItemVersion> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = getLatestTransactionLineItemVersionCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for getPackingSlip */
	private com.squareup.okhttp.Call getPackingSlipCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling getPackingSlip(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling getPackingSlip(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/getPackingSlip".replaceAll("\\{format\\}","json");

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
	 * getPackingSlip
	 *
	 * Returns the packing slip for the transaction with given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the packing slip for. (required)
	 * @return RenderedDocument
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public RenderedDocument getPackingSlip(Long spaceId, Long id) throws ApiException {
		ApiResponse<RenderedDocument> resp = getPackingSlipWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * getPackingSlip
	 *
	 * Returns the packing slip for the transaction with given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the packing slip for. (required)
	 * @return ApiResponse&lt;RenderedDocument&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<RenderedDocument> getPackingSlipWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = getPackingSlipCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * getPackingSlip (asynchronously)
	 *
	 * Returns the packing slip for the transaction with given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction to get the packing slip for. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getPackingSlipAsync(Long spaceId, Long id, final ApiCallback<RenderedDocument> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = getPackingSlipCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<RenderedDocument>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for processOneClickTokenWithCredentials */
	private com.squareup.okhttp.Call processOneClickTokenWithCredentialsCall(String credentials, Long tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'credentials' is set
		if (credentials == null) {
			throw new ApiException("Missing the required parameter 'credentials' when calling processOneClickTokenWithCredentials(Async)");
		}
		
		// verify the required parameter 'tokenId' is set
		if (tokenId == null) {
			throw new ApiException("Missing the required parameter 'tokenId' when calling processOneClickTokenWithCredentials(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/processOneClickTokenWithCredentials".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "credentials", credentials));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenId", tokenId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Process One-Click Token with Credentials
	 *
	 * This operation assigns the given token to the transaction and process it.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 *
	 * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it. (required)
	 * @return Transaction
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Transaction processOneClickTokenWithCredentials(String credentials, Long tokenId) throws ApiException {
		ApiResponse<Transaction> resp = processOneClickTokenWithCredentialsWithHttpInfo(credentials, tokenId);
		return resp.getData();
	}

	/**
	 * Process One-Click Token with Credentials
	 *
	 * This operation assigns the given token to the transaction and process it.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 *
	 * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it. (required)
	 * @return ApiResponse&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Transaction> processOneClickTokenWithCredentialsWithHttpInfo(String credentials, Long tokenId) throws ApiException {
		com.squareup.okhttp.Call call = processOneClickTokenWithCredentialsCall(credentials, tokenId, null, null);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Process One-Click Token with Credentials (asynchronously)
	 *
	 * This operation assigns the given token to the transaction and process it.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 *
	 * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call processOneClickTokenWithCredentialsAsync(String credentials, Long tokenId, final ApiCallback<Transaction> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = processOneClickTokenWithCredentialsCall(credentials, tokenId, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
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
		String localVarPath = "/transaction/read".replaceAll("\\{format\\}","json");

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
	 * @param id The id of the transaction which should be returned. (required)
	 * @return Transaction
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Transaction read(Long spaceId, Long id) throws ApiException {
		ApiResponse<Transaction> resp = readWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Read
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @return ApiResponse&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Transaction> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = readCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Read (asynchronously)
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<Transaction> callback) throws ApiException {

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
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for readWithCredentials */
	private com.squareup.okhttp.Call readWithCredentialsCall(String credentials, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'credentials' is set
		if (credentials == null) {
			throw new ApiException("Missing the required parameter 'credentials' when calling readWithCredentials(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/readWithCredentials".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "credentials", credentials));

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
	 * Read With Credentials
	 *
	 * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return Transaction
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Transaction readWithCredentials(String credentials) throws ApiException {
		ApiResponse<Transaction> resp = readWithCredentialsWithHttpInfo(credentials);
		return resp.getData();
	}

	/**
	 * Read With Credentials
	 *
	 * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @return ApiResponse&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Transaction> readWithCredentialsWithHttpInfo(String credentials) throws ApiException {
		com.squareup.okhttp.Call call = readWithCredentialsCall(credentials, null, null);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Read With Credentials (asynchronously)
	 *
	 * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
	 *
	 * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call readWithCredentialsAsync(String credentials, final ApiCallback<Transaction> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = readWithCredentialsCall(credentials, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
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
		String localVarPath = "/transaction/search".replaceAll("\\{format\\}","json");

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
	 * @param query The query restricts the transactions which are returned by the search. (required)
	 * @return List&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<Transaction> search(Long spaceId, EntityQuery query) throws ApiException {
		ApiResponse<List<Transaction>> resp = searchWithHttpInfo(spaceId, query);
		return resp.getData();
	}

	/**
	 * Search
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the transactions which are returned by the search. (required)
	 * @return ApiResponse&lt;List&lt;Transaction&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<Transaction>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
		com.squareup.okhttp.Call call = searchCall(spaceId, query, null, null);
		Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Search (asynchronously)
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the transactions which are returned by the search. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<Transaction>> callback) throws ApiException {

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
		Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for update */
	private com.squareup.okhttp.Call updateCall(Long spaceId, TransactionPending entity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = entity;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling update(Async)");
		}
		
		// verify the required parameter 'entity' is set
		if (entity == null) {
			throw new ApiException("Missing the required parameter 'entity' when calling update(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/update".replaceAll("\\{format\\}","json");

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
	 * Update
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param spaceId  (required)
	 *
	 * @param entity The transaction object with the properties which should be updated. (required)
	 * @return Transaction
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Transaction update(Long spaceId, TransactionPending entity) throws ApiException {
		ApiResponse<Transaction> resp = updateWithHttpInfo(spaceId, entity);
		return resp.getData();
	}

	/**
	 * Update
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param spaceId  (required)
	 *
	 * @param entity The transaction object with the properties which should be updated. (required)
	 * @return ApiResponse&lt;Transaction&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Transaction> updateWithHttpInfo(Long spaceId, TransactionPending entity) throws ApiException {
		com.squareup.okhttp.Call call = updateCall(spaceId, entity, null, null);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Update (asynchronously)
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param spaceId  (required)
	 *
	 * @param entity The transaction object with the properties which should be updated. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call updateAsync(Long spaceId, TransactionPending entity, final ApiCallback<Transaction> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = updateCall(spaceId, entity, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for updateTransactionLineItems */
	private com.squareup.okhttp.Call updateTransactionLineItemsCall(Long spaceId, TransactionLineItemUpdateRequest updateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = updateRequest;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling updateTransactionLineItems(Async)");
		}
		
		// verify the required parameter 'updateRequest' is set
		if (updateRequest == null) {
			throw new ApiException("Missing the required parameter 'updateRequest' when calling updateTransactionLineItems(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction/updateTransactionLineItems".replaceAll("\\{format\\}","json");

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
	 * updateTransactionLineItems
	 *
	 * 
	 *
	 * @param spaceId  (required)
	 *
	 * @param updateRequest  (required)
	 * @return TransactionLineItemVersion
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public TransactionLineItemVersion updateTransactionLineItems(Long spaceId, TransactionLineItemUpdateRequest updateRequest) throws ApiException {
		ApiResponse<TransactionLineItemVersion> resp = updateTransactionLineItemsWithHttpInfo(spaceId, updateRequest);
		return resp.getData();
	}

	/**
	 * updateTransactionLineItems
	 *
	 * 
	 *
	 * @param spaceId  (required)
	 *
	 * @param updateRequest  (required)
	 * @return ApiResponse&lt;TransactionLineItemVersion&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<TransactionLineItemVersion> updateTransactionLineItemsWithHttpInfo(Long spaceId, TransactionLineItemUpdateRequest updateRequest) throws ApiException {
		com.squareup.okhttp.Call call = updateTransactionLineItemsCall(spaceId, updateRequest, null, null);
		Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * updateTransactionLineItems (asynchronously)
	 *
	 * 
	 *
	 * @param spaceId  (required)
	 *
	 * @param updateRequest  (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call updateTransactionLineItemsAsync(Long spaceId, TransactionLineItemUpdateRequest updateRequest, final ApiCallback<TransactionLineItemVersion> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = updateTransactionLineItemsCall(spaceId, updateRequest, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<TransactionLineItemVersion>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}
