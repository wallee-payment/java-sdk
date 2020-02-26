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
import com.wallee.sdk.model.RenderedTerminalReceipt;
import com.wallee.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionTerminalService {
    private ApiClient apiClient;

    public TransactionTerminalService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for receipt
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction to get the receipt for. (required)
     * @param typeId  (required)
     * @param width  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>
     */
    public com.squareup.okhttp.Call receiptCall(Long spaceId, Long transactionId, Long typeId, Integer width, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-terminal/receipt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (transactionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("transactionId", transactionId));
        if (typeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("typeId", typeId));
        if (width != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("width", width));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call receiptValidateBeforeCall(Long spaceId, Long transactionId, Long typeId, Integer width, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling receipt(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling receipt(Async)");
        }
        
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException("Missing the required parameter 'typeId' when calling receipt(Async)");
        }
        
        // verify the required parameter 'width' is set
        if (width == null) {
            throw new ApiException("Missing the required parameter 'width' when calling receipt(Async)");
        }
        

        com.squareup.okhttp.Call call = receiptCall(spaceId, transactionId, typeId, width, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getTerminalReceipt
     * Returns the PDF document for the requested terminal receipt with the given page width.
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction to get the receipt for. (required)
     * @param typeId  (required)
     * @param width  (required)
     * @return RenderedTerminalReceipt
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>
     */
    public RenderedTerminalReceipt receipt(Long spaceId, Long transactionId, Long typeId, Integer width) throws ApiException {
        ApiResponse<RenderedTerminalReceipt> resp = receiptWithHttpInfo(spaceId, transactionId, typeId, width);
        return resp.getData();
    }

    /**
     * getTerminalReceipt
     * Returns the PDF document for the requested terminal receipt with the given page width.
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction to get the receipt for. (required)
     * @param typeId  (required)
     * @param width  (required)
     * @return ApiResponse&lt;RenderedTerminalReceipt&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>
     */
    public ApiResponse<RenderedTerminalReceipt> receiptWithHttpInfo(Long spaceId, Long transactionId, Long typeId, Integer width) throws ApiException {
        com.squareup.okhttp.Call call = receiptValidateBeforeCall(spaceId, transactionId, typeId, width, null, null);
        Type localVarReturnType = new TypeToken<RenderedTerminalReceipt>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getTerminalReceipt (asynchronously)
     * Returns the PDF document for the requested terminal receipt with the given page width.
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction to get the receipt for. (required)
     * @param typeId  (required)
     * @param width  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>
     */
    public com.squareup.okhttp.Call receiptAsync(Long spaceId, Long transactionId, Long typeId, Integer width, final ApiCallback<RenderedTerminalReceipt> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = receiptValidateBeforeCall(spaceId, transactionId, typeId, width, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RenderedTerminalReceipt>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tillConnectionCredentials
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction which is used to process with the terminal. (required)
     * @param terminalId The ID of the terminal which should be used to process the transaction. (required)
     * @param language The language in which the messages should be rendered in. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call tillConnectionCredentialsCall(Long spaceId, Long transactionId, Long terminalId, String language, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction-terminal/till-connection-credentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (transactionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("transactionId", transactionId));
        if (terminalId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("terminalId", terminalId));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("language", language));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tillConnectionCredentialsValidateBeforeCall(Long spaceId, Long transactionId, Long terminalId, String language, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling tillConnectionCredentials(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling tillConnectionCredentials(Async)");
        }
        
        // verify the required parameter 'terminalId' is set
        if (terminalId == null) {
            throw new ApiException("Missing the required parameter 'terminalId' when calling tillConnectionCredentials(Async)");
        }
        

        com.squareup.okhttp.Call call = tillConnectionCredentialsCall(spaceId, transactionId, terminalId, language, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Till Connection Credentials
     * This operation creates a set of credentials to use within the WebSocket.
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction which is used to process with the terminal. (required)
     * @param terminalId The ID of the terminal which should be used to process the transaction. (required)
     * @param language The language in which the messages should be rendered in. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>
     */
    public String tillConnectionCredentials(Long spaceId, Long transactionId, Long terminalId, String language) throws ApiException {
        ApiResponse<String> resp = tillConnectionCredentialsWithHttpInfo(spaceId, transactionId, terminalId, language);
        return resp.getData();
    }

    /**
     * Create Till Connection Credentials
     * This operation creates a set of credentials to use within the WebSocket.
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction which is used to process with the terminal. (required)
     * @param terminalId The ID of the terminal which should be used to process the transaction. (required)
     * @param language The language in which the messages should be rendered in. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>
     */
    public ApiResponse<String> tillConnectionCredentialsWithHttpInfo(Long spaceId, Long transactionId, Long terminalId, String language) throws ApiException {
        com.squareup.okhttp.Call call = tillConnectionCredentialsValidateBeforeCall(spaceId, transactionId, terminalId, language, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Till Connection Credentials (asynchronously)
     * This operation creates a set of credentials to use within the WebSocket.
     * @param spaceId  (required)
     * @param transactionId The ID of the transaction which is used to process with the terminal. (required)
     * @param terminalId The ID of the terminal which should be used to process the transaction. (required)
     * @param language The language in which the messages should be rendered in. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>
     */
    public com.squareup.okhttp.Call tillConnectionCredentialsAsync(Long spaceId, Long transactionId, Long terminalId, String language, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tillConnectionCredentialsValidateBeforeCall(spaceId, transactionId, terminalId, language, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
