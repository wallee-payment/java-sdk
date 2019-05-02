/**
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
 *
 * @author   customweb GmbH (www.customweb.com)
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

import java.math.BigDecimal;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.DebtCollectionCase;
import com.wallee.sdk.model.DebtCollectionCaseCreate;
import com.wallee.sdk.model.DebtCollectionCaseDocument;
import com.wallee.sdk.model.DebtCollectionCaseUpdate;
import com.wallee.sdk.model.DebtCollectionReceipt;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DebtCollectionCaseService {

	private ApiClient apiClient;

	public DebtCollectionCaseService(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for addCollectedAmount */
	private com.squareup.okhttp.Call addCollectedAmountCall(Long spaceId, Long id, BigDecimal collectedAmount, String externalId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling addCollectedAmount(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling addCollectedAmount(Async)");
		}
		
		// verify the required parameter 'collectedAmount' is set
		if (collectedAmount == null) {
			throw new ApiException("Missing the required parameter 'collectedAmount' when calling addCollectedAmount(Async)");
		}
		
		// verify the required parameter 'externalId' is set
		if (externalId == null) {
			throw new ApiException("Missing the required parameter 'externalId' when calling addCollectedAmount(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/addCollectedAmount".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "collectedAmount", collectedAmount));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalId", externalId));

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
	 * Add Collected Amount
	 *
	 * Adds a new collected amount to the case, creating a new payment receipt.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case for which the amount should be added. (required)
	 *
	 * @param collectedAmount The amount that has been collected. (required)
	 *
	 * @param externalId The unique external id of this payment receipt. (required)
	 * @return DebtCollectionReceipt
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionReceipt addCollectedAmount(Long spaceId, Long id, BigDecimal collectedAmount, String externalId) throws ApiException {
		ApiResponse<DebtCollectionReceipt> resp = addCollectedAmountWithHttpInfo(spaceId, id, collectedAmount, externalId);
		return resp.getData();
	}

	/**
	 * Add Collected Amount
	 *
	 * Adds a new collected amount to the case, creating a new payment receipt.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case for which the amount should be added. (required)
	 *
	 * @param collectedAmount The amount that has been collected. (required)
	 *
	 * @param externalId The unique external id of this payment receipt. (required)
	 * @return ApiResponse&lt;DebtCollectionReceipt&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionReceipt> addCollectedAmountWithHttpInfo(Long spaceId, Long id, BigDecimal collectedAmount, String externalId) throws ApiException {
		com.squareup.okhttp.Call call = addCollectedAmountCall(spaceId, id, collectedAmount, externalId, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionReceipt>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Add Collected Amount (asynchronously)
	 *
	 * Adds a new collected amount to the case, creating a new payment receipt.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case for which the amount should be added. (required)
	 *
	 * @param collectedAmount The amount that has been collected. (required)
	 *
	 * @param externalId The unique external id of this payment receipt. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call addCollectedAmountAsync(Long spaceId, Long id, BigDecimal collectedAmount, String externalId, final ApiCallback<DebtCollectionReceipt> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = addCollectedAmountCall(spaceId, id, collectedAmount, externalId, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<DebtCollectionReceipt>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for attachDocument */
	private com.squareup.okhttp.Call attachDocumentCall(Long spaceId, Long id, String fileName, String contentBase64, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling attachDocument(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling attachDocument(Async)");
		}
		
		// verify the required parameter 'fileName' is set
		if (fileName == null) {
			throw new ApiException("Missing the required parameter 'fileName' when calling attachDocument(Async)");
		}
		
		// verify the required parameter 'contentBase64' is set
		if (contentBase64 == null) {
			throw new ApiException("Missing the required parameter 'contentBase64' when calling attachDocument(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/attachDocument".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentBase64", contentBase64));

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
	 * Attach Document
	 *
	 * Attach an additional supporting document to the case.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case. (required)
	 *
	 * @param fileName The file name of the document that is uploaded. (required)
	 *
	 * @param contentBase64 The BASE64 encoded contents of the document. (required)
	 * @return DebtCollectionCaseDocument
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionCaseDocument attachDocument(Long spaceId, Long id, String fileName, String contentBase64) throws ApiException {
		ApiResponse<DebtCollectionCaseDocument> resp = attachDocumentWithHttpInfo(spaceId, id, fileName, contentBase64);
		return resp.getData();
	}

	/**
	 * Attach Document
	 *
	 * Attach an additional supporting document to the case.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case. (required)
	 *
	 * @param fileName The file name of the document that is uploaded. (required)
	 *
	 * @param contentBase64 The BASE64 encoded contents of the document. (required)
	 * @return ApiResponse&lt;DebtCollectionCaseDocument&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionCaseDocument> attachDocumentWithHttpInfo(Long spaceId, Long id, String fileName, String contentBase64) throws ApiException {
		com.squareup.okhttp.Call call = attachDocumentCall(spaceId, id, fileName, contentBase64, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionCaseDocument>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Attach Document (asynchronously)
	 *
	 * Attach an additional supporting document to the case.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case. (required)
	 *
	 * @param fileName The file name of the document that is uploaded. (required)
	 *
	 * @param contentBase64 The BASE64 encoded contents of the document. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call attachDocumentAsync(Long spaceId, Long id, String fileName, String contentBase64, final ApiCallback<DebtCollectionCaseDocument> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = attachDocumentCall(spaceId, id, fileName, contentBase64, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<DebtCollectionCaseDocument>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for close */
	private com.squareup.okhttp.Call closeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling close(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling close(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/close".replaceAll("\\{format\\}","json");

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
	 * Close
	 *
	 * Closes the debt collection case, meaning no further money can be collected.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be closed. (required)
	 * @return DebtCollectionCase
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionCase close(Long spaceId, Long id) throws ApiException {
		ApiResponse<DebtCollectionCase> resp = closeWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Close
	 *
	 * Closes the debt collection case, meaning no further money can be collected.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be closed. (required)
	 * @return ApiResponse&lt;DebtCollectionCase&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionCase> closeWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = closeCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Close (asynchronously)
	 *
	 * Closes the debt collection case, meaning no further money can be collected.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be closed. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call closeAsync(Long spaceId, Long id, final ApiCallback<DebtCollectionCase> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = closeCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
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
		String localVarPath = "/debt-collection-case/count".replaceAll("\\{format\\}","json");

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
	private com.squareup.okhttp.Call createCall(Long spaceId, DebtCollectionCaseCreate entity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = entity;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling create(Async)");
		}
		
		// verify the required parameter 'entity' is set
		if (entity == null) {
			throw new ApiException("Missing the required parameter 'entity' when calling create(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/create".replaceAll("\\{format\\}","json");

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
	 * @param entity The debt collection case object with the properties which should be created. (required)
	 * @return DebtCollectionCase
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionCase create(Long spaceId, DebtCollectionCaseCreate entity) throws ApiException {
		ApiResponse<DebtCollectionCase> resp = createWithHttpInfo(spaceId, entity);
		return resp.getData();
	}

	/**
	 * Create
	 *
	 * Creates the entity with the given properties.
	 *
	 * @param spaceId  (required)
	 *
	 * @param entity The debt collection case object with the properties which should be created. (required)
	 * @return ApiResponse&lt;DebtCollectionCase&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionCase> createWithHttpInfo(Long spaceId, DebtCollectionCaseCreate entity) throws ApiException {
		com.squareup.okhttp.Call call = createCall(spaceId, entity, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create (asynchronously)
	 *
	 * Creates the entity with the given properties.
	 *
	 * @param spaceId  (required)
	 *
	 * @param entity The debt collection case object with the properties which should be created. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createAsync(Long spaceId, DebtCollectionCaseCreate entity, final ApiCallback<DebtCollectionCase> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createCall(spaceId, entity, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for delete */
	private com.squareup.okhttp.Call deleteCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = id;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling delete(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling delete(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/delete".replaceAll("\\{format\\}","json");

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
	 * Delete
	 *
	 * Deletes the entity with the given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id  (required)
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public void delete(Long spaceId, Long id) throws ApiException {
		deleteWithHttpInfo(spaceId, id);
	}

	/**
	 * Delete
	 *
	 * Deletes the entity with the given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id  (required)
	 * @return ApiResponse&lt;Void&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Void> deleteWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = deleteCall(spaceId, id, null, null);
		return apiClient.execute(call);
	}

	/**
	 * Delete (asynchronously)
	 *
	 * Deletes the entity with the given id.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id  (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call deleteAsync(Long spaceId, Long id, final ApiCallback<Void> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = deleteCall(spaceId, id, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	/* Build call for documents */
	private com.squareup.okhttp.Call documentsCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling documents(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling documents(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/documents".replaceAll("\\{format\\}","json");

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
	 * Documents
	 *
	 * Returns all documents that are attached to a debt collection case.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case for which the attached documents are returned. (required)
	 * @return List&lt;DebtCollectionCaseDocument&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<DebtCollectionCaseDocument> documents(Long spaceId, Long id) throws ApiException {
		ApiResponse<List<DebtCollectionCaseDocument>> resp = documentsWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Documents
	 *
	 * Returns all documents that are attached to a debt collection case.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case for which the attached documents are returned. (required)
	 * @return ApiResponse&lt;List&lt;DebtCollectionCaseDocument&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<DebtCollectionCaseDocument>> documentsWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = documentsCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<List<DebtCollectionCaseDocument>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Documents (asynchronously)
	 *
	 * Returns all documents that are attached to a debt collection case.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case for which the attached documents are returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call documentsAsync(Long spaceId, Long id, final ApiCallback<List<DebtCollectionCaseDocument>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = documentsCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<DebtCollectionCaseDocument>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for markAsPrepared */
	private com.squareup.okhttp.Call markAsPreparedCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling markAsPrepared(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling markAsPrepared(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/markAsPrepared".replaceAll("\\{format\\}","json");

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
	 * Mark Case As Prepared
	 *
	 * This operation will mark a debt collection case as prepared and allow the collection process to proceed.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be marked as prepared. (required)
	 * @return DebtCollectionCase
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionCase markAsPrepared(Long spaceId, Long id) throws ApiException {
		ApiResponse<DebtCollectionCase> resp = markAsPreparedWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Mark Case As Prepared
	 *
	 * This operation will mark a debt collection case as prepared and allow the collection process to proceed.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be marked as prepared. (required)
	 * @return ApiResponse&lt;DebtCollectionCase&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionCase> markAsPreparedWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = markAsPreparedCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Mark Case As Prepared (asynchronously)
	 *
	 * This operation will mark a debt collection case as prepared and allow the collection process to proceed.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be marked as prepared. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call markAsPreparedAsync(Long spaceId, Long id, final ApiCallback<DebtCollectionCase> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = markAsPreparedCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for markAsReviewed */
	private com.squareup.okhttp.Call markAsReviewedCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling markAsReviewed(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling markAsReviewed(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/debt-collection-case/markAsReviewed".replaceAll("\\{format\\}","json");

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
	 * Mark Case As Reviewed
	 *
	 * This operation will mark a debt collection case as reviewed and allow the collection process to proceed.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be reviewed. (required)
	 * @return DebtCollectionCase
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionCase markAsReviewed(Long spaceId, Long id) throws ApiException {
		ApiResponse<DebtCollectionCase> resp = markAsReviewedWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Mark Case As Reviewed
	 *
	 * This operation will mark a debt collection case as reviewed and allow the collection process to proceed.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be reviewed. (required)
	 * @return ApiResponse&lt;DebtCollectionCase&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionCase> markAsReviewedWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = markAsReviewedCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Mark Case As Reviewed (asynchronously)
	 *
	 * This operation will mark a debt collection case as reviewed and allow the collection process to proceed.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be reviewed. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call markAsReviewedAsync(Long spaceId, Long id, final ApiCallback<DebtCollectionCase> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = markAsReviewedCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
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
		String localVarPath = "/debt-collection-case/read".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"*/*"
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
	 * @param id The id of the debt collection case which should be returned. (required)
	 * @return DebtCollectionCase
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionCase read(Long spaceId, Long id) throws ApiException {
		ApiResponse<DebtCollectionCase> resp = readWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Read
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be returned. (required)
	 * @return ApiResponse&lt;DebtCollectionCase&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionCase> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = readCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Read (asynchronously)
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the debt collection case which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<DebtCollectionCase> callback) throws ApiException {

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
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
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
		String localVarPath = "/debt-collection-case/search".replaceAll("\\{format\\}","json");

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
	 * @param query The query restricts the cases which are returned by the search. (required)
	 * @return List&lt;DebtCollectionCase&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<DebtCollectionCase> search(Long spaceId, EntityQuery query) throws ApiException {
		ApiResponse<List<DebtCollectionCase>> resp = searchWithHttpInfo(spaceId, query);
		return resp.getData();
	}

	/**
	 * Search
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the cases which are returned by the search. (required)
	 * @return ApiResponse&lt;List&lt;DebtCollectionCase&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<DebtCollectionCase>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
		com.squareup.okhttp.Call call = searchCall(spaceId, query, null, null);
		Type localVarReturnType = new TypeToken<List<DebtCollectionCase>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Search (asynchronously)
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the cases which are returned by the search. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<DebtCollectionCase>> callback) throws ApiException {

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
		Type localVarReturnType = new TypeToken<List<DebtCollectionCase>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for update */
	private com.squareup.okhttp.Call updateCall(Long spaceId, DebtCollectionCaseUpdate entity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
		String localVarPath = "/debt-collection-case/update".replaceAll("\\{format\\}","json");

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
	 * @param entity The object with all the properties which should be updated. The id and the version are required properties. (required)
	 * @return DebtCollectionCase
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public DebtCollectionCase update(Long spaceId, DebtCollectionCaseUpdate entity) throws ApiException {
		ApiResponse<DebtCollectionCase> resp = updateWithHttpInfo(spaceId, entity);
		return resp.getData();
	}

	/**
	 * Update
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param spaceId  (required)
	 *
	 * @param entity The object with all the properties which should be updated. The id and the version are required properties. (required)
	 * @return ApiResponse&lt;DebtCollectionCase&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<DebtCollectionCase> updateWithHttpInfo(Long spaceId, DebtCollectionCaseUpdate entity) throws ApiException {
		com.squareup.okhttp.Call call = updateCall(spaceId, entity, null, null);
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Update (asynchronously)
	 *
	 * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
	 *
	 * @param spaceId  (required)
	 *
	 * @param entity The object with all the properties which should be updated. The id and the version are required properties. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call updateAsync(Long spaceId, DebtCollectionCaseUpdate entity, final ApiCallback<DebtCollectionCase> callback) throws ApiException {

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
		Type localVarReturnType = new TypeToken<DebtCollectionCase>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}
