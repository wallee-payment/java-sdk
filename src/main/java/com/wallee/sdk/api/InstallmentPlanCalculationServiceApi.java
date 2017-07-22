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

import com.wallee.sdk.model.InstallmentCalculatedPlan;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstallmentPlanCalculationServiceApi {
	private ApiClient apiClient;

	public InstallmentPlanCalculationServiceApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for calculatePlans */
	private com.squareup.okhttp.Call calculatePlansCall(Long spaceId, Long transactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling calculatePlans(Async)");
		}
		
		// verify the required parameter 'transactionId' is set
		if (transactionId == null) {
			throw new ApiException("Missing the required parameter 'transactionId' when calling calculatePlans(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/installment-plan-calculation/calculatePlans".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionId", transactionId));

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
	 * Calculate Plans
	 *
	 * This operation allows to calculate all plans for the given transaction. The transaction will not be changed in any way.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The transaction for which the plans should be calculated for. (required)
	 * @return List&lt;InstallmentCalculatedPlan&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<InstallmentCalculatedPlan> calculatePlans(Long spaceId, Long transactionId) throws ApiException {
		ApiResponse<List<InstallmentCalculatedPlan>> resp = calculatePlansWithHttpInfo(spaceId, transactionId);
		return resp.getData();
	}

	/**
	 * Calculate Plans
	 *
	 * This operation allows to calculate all plans for the given transaction. The transaction will not be changed in any way.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The transaction for which the plans should be calculated for. (required)
	 * @return ApiResponse&lt;List&lt;InstallmentCalculatedPlan&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<InstallmentCalculatedPlan>> calculatePlansWithHttpInfo(Long spaceId, Long transactionId) throws ApiException {
		com.squareup.okhttp.Call call = calculatePlansCall(spaceId, transactionId, null, null);
		Type localVarReturnType = new TypeToken<List<InstallmentCalculatedPlan>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Calculate Plans (asynchronously)
	 *
	 * This operation allows to calculate all plans for the given transaction. The transaction will not be changed in any way.
	 *
	 * @param spaceId  (required)
	 *
	 * @param transactionId The transaction for which the plans should be calculated for. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call calculatePlansAsync(Long spaceId, Long transactionId, final ApiCallback<List<InstallmentCalculatedPlan>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = calculatePlansCall(spaceId, transactionId, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<InstallmentCalculatedPlan>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}
