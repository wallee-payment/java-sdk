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

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.MetricUsage;
import java.time.OffsetDateTime;
import com.wallee.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MerticUsageService {

	private ApiClient apiClient;

	public MerticUsageService(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for calculate */
	private com.squareup.okhttp.Call calculateCall(Long spaceId, OffsetDateTime start, OffsetDateTime end, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling calculate(Async)");
		}
		
		// verify the required parameter 'start' is set
		if (start == null) {
			throw new ApiException("Missing the required parameter 'start' when calling calculate(Async)");
		}
		
		// verify the required parameter 'end' is set
		if (end == null) {
			throw new ApiException("Missing the required parameter 'end' when calling calculate(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/mertic-usage/calculate".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

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
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Calculate
	 *
	 * Calculates the consumed resources for the given space and time range.
	 *
	 * @param spaceId  (required)
	 *
	 * @param start The start date from which on the consumed units should be returned from. (required)
	 *
	 * @param end The end date to which the consumed units should be returned to. The end date is not included in the result. (required)
	 * @return List&lt;MetricUsage&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<MetricUsage> calculate(Long spaceId, OffsetDateTime start, OffsetDateTime end) throws ApiException {
		ApiResponse<List<MetricUsage>> resp = calculateWithHttpInfo(spaceId, start, end);
		return resp.getData();
	}

	/**
	 * Calculate
	 *
	 * Calculates the consumed resources for the given space and time range.
	 *
	 * @param spaceId  (required)
	 *
	 * @param start The start date from which on the consumed units should be returned from. (required)
	 *
	 * @param end The end date to which the consumed units should be returned to. The end date is not included in the result. (required)
	 * @return ApiResponse&lt;List&lt;MetricUsage&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<MetricUsage>> calculateWithHttpInfo(Long spaceId, OffsetDateTime start, OffsetDateTime end) throws ApiException {
		com.squareup.okhttp.Call call = calculateCall(spaceId, start, end, null, null);
		Type localVarReturnType = new TypeToken<List<MetricUsage>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Calculate (asynchronously)
	 *
	 * Calculates the consumed resources for the given space and time range.
	 *
	 * @param spaceId  (required)
	 *
	 * @param start The start date from which on the consumed units should be returned from. (required)
	 *
	 * @param end The end date to which the consumed units should be returned to. The end date is not included in the result. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call calculateAsync(Long spaceId, OffsetDateTime start, OffsetDateTime end, final ApiCallback<List<MetricUsage>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = calculateCall(spaceId, start, end, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<MetricUsage>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}
