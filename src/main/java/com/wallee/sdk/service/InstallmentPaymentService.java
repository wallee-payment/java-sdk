/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.InstallmentPayment;
import com.wallee.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstallmentPaymentService {
    private ApiClient apiClient;

    public InstallmentPaymentService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for count
     * @param spaceId  (required)
     * @param filter The filter which restricts the installment payment which are used to calculate the count. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--count">Count Documentation</a>
     */
    public com.squareup.okhttp.Call countCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = filter;

        // create path and map variables
        String localVarPath = "/installment-payment/count";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call countValidateBeforeCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling count(Async)");
        }
        
        // verify the required parameter 'filter' is set
        if (filter == null) {
            throw new ApiException("Missing the required parameter 'filter' when calling count(Async)");
        }
        

        com.squareup.okhttp.Call call = countCall(spaceId, filter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the installment payment which are used to calculate the count. (required)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--count">Count Documentation</a>
     */
    public Long count(Long spaceId, EntityQueryFilter filter) throws ApiException {
        ApiResponse<Long> resp = countWithHttpInfo(spaceId, filter);
        return resp.getData();
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the installment payment which are used to calculate the count. (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--count">Count Documentation</a>
     */
    public ApiResponse<Long> countWithHttpInfo(Long spaceId, EntityQueryFilter filter) throws ApiException {
        com.squareup.okhttp.Call call = countValidateBeforeCall(spaceId, filter, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Count (asynchronously)
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the installment payment which are used to calculate the count. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--count">Count Documentation</a>
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

        com.squareup.okhttp.Call call = countValidateBeforeCall(spaceId, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createInstallmentPayment
     * @param spaceId  (required)
     * @param transactionId The transaction which should be converted into an installment payment. (required)
     * @param installmentPlanConfiguration The installment plan configuration ID which should be applied on the transaction. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--create-installment-payment">Create Installment Payment Documentation</a>
     */
    public com.squareup.okhttp.Call createInstallmentPaymentCall(Long spaceId, Long transactionId, Long installmentPlanConfiguration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/installment-payment/createInstallmentPayment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (transactionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("transactionId", transactionId));
        if (installmentPlanConfiguration != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("installmentPlanConfiguration", installmentPlanConfiguration));

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
    private com.squareup.okhttp.Call createInstallmentPaymentValidateBeforeCall(Long spaceId, Long transactionId, Long installmentPlanConfiguration, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling createInstallmentPayment(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling createInstallmentPayment(Async)");
        }
        
        // verify the required parameter 'installmentPlanConfiguration' is set
        if (installmentPlanConfiguration == null) {
            throw new ApiException("Missing the required parameter 'installmentPlanConfiguration' when calling createInstallmentPayment(Async)");
        }
        

        com.squareup.okhttp.Call call = createInstallmentPaymentCall(spaceId, transactionId, installmentPlanConfiguration, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Installment Payment
     * This operation creates based up on the given transaction an installment payment.
     * @param spaceId  (required)
     * @param transactionId The transaction which should be converted into an installment payment. (required)
     * @param installmentPlanConfiguration The installment plan configuration ID which should be applied on the transaction. (required)
     * @return InstallmentPayment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--create-installment-payment">Create Installment Payment Documentation</a>
     */
    public InstallmentPayment createInstallmentPayment(Long spaceId, Long transactionId, Long installmentPlanConfiguration) throws ApiException {
        ApiResponse<InstallmentPayment> resp = createInstallmentPaymentWithHttpInfo(spaceId, transactionId, installmentPlanConfiguration);
        return resp.getData();
    }

    /**
     * Create Installment Payment
     * This operation creates based up on the given transaction an installment payment.
     * @param spaceId  (required)
     * @param transactionId The transaction which should be converted into an installment payment. (required)
     * @param installmentPlanConfiguration The installment plan configuration ID which should be applied on the transaction. (required)
     * @return ApiResponse&lt;InstallmentPayment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--create-installment-payment">Create Installment Payment Documentation</a>
     */
    public ApiResponse<InstallmentPayment> createInstallmentPaymentWithHttpInfo(Long spaceId, Long transactionId, Long installmentPlanConfiguration) throws ApiException {
        com.squareup.okhttp.Call call = createInstallmentPaymentValidateBeforeCall(spaceId, transactionId, installmentPlanConfiguration, null, null);
        Type localVarReturnType = new TypeToken<InstallmentPayment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Installment Payment (asynchronously)
     * This operation creates based up on the given transaction an installment payment.
     * @param spaceId  (required)
     * @param transactionId The transaction which should be converted into an installment payment. (required)
     * @param installmentPlanConfiguration The installment plan configuration ID which should be applied on the transaction. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--create-installment-payment">Create Installment Payment Documentation</a>
     */
    public com.squareup.okhttp.Call createInstallmentPaymentAsync(Long spaceId, Long transactionId, Long installmentPlanConfiguration, final ApiCallback<InstallmentPayment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createInstallmentPaymentValidateBeforeCall(spaceId, transactionId, installmentPlanConfiguration, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InstallmentPayment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param spaceId  (required)
     * @param id The id of the installment payment which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/installment-payment/read";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
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
    private com.squareup.okhttp.Call readValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling read(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
        }
        

        com.squareup.okhttp.Call call = readCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the installment payment which should be returned. (required)
     * @return InstallmentPayment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--read">Read Documentation</a>
     */
    public InstallmentPayment read(Long spaceId, Long id) throws ApiException {
        ApiResponse<InstallmentPayment> resp = readWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the installment payment which should be returned. (required)
     * @return ApiResponse&lt;InstallmentPayment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--read">Read Documentation</a>
     */
    public ApiResponse<InstallmentPayment> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<InstallmentPayment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read (asynchronously)
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the installment payment which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<InstallmentPayment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InstallmentPayment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param spaceId  (required)
     * @param query The query restricts the installment payments which are returned by the search. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = query;

        // create path and map variables
        String localVarPath = "/installment-payment/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchValidateBeforeCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling search(Async)");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling search(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCall(spaceId, query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the installment payments which are returned by the search. (required)
     * @return List&lt;InstallmentPayment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--search">Search Documentation</a>
     */
    public List<InstallmentPayment> search(Long spaceId, EntityQuery query) throws ApiException {
        ApiResponse<List<InstallmentPayment>> resp = searchWithHttpInfo(spaceId, query);
        return resp.getData();
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the installment payments which are returned by the search. (required)
     * @return ApiResponse&lt;List&lt;InstallmentPayment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--search">Search Documentation</a>
     */
    public ApiResponse<List<InstallmentPayment>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, null, null);
        Type localVarReturnType = new TypeToken<List<InstallmentPayment>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search (asynchronously)
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the installment payments which are returned by the search. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-payment-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<InstallmentPayment>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InstallmentPayment>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
