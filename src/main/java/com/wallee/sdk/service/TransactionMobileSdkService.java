package com.wallee.sdk.service;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;


public class TransactionMobileSdkService {
    private ApiClient apiClient;

    public TransactionMobileSdkService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build Mobile SDK URL
     * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
     * @return String
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-mobile-sdk-service--payment-form-url">Build Mobile SDK URL Documentation</a>
     **/
    public String paymentFormUrl(String credentials) throws IOException {
        HttpResponse response = paymentFormUrlForHttpResponse(credentials);
        return response.parseAsString();
    }

    /**
     * Build Mobile SDK URL
     * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
     * @param params      Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return String
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-mobile-sdk-service--payment-form-url">Build Mobile SDK URL Documentation</a>
     **/
    public String paymentFormUrl(String credentials, Map<String, Object> params) throws IOException {
        HttpResponse response = paymentFormUrlForHttpResponse(credentials, params);
        return response.parseAsString();
    }

    public HttpResponse paymentFormUrlForHttpResponse(String credentials) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "credentials", "paymentFormUrl"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-mobile-sdk/payment-form-url");
        String key = "credentials";
        uriBuilder = uriBuilder.queryParam(key, credentials);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse paymentFormUrlForHttpResponse(String credentials, Map<String, Object> params) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "credentials", "paymentFormUrl"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-mobile-sdk/payment-form-url");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'credentials' to the map of query params
        allParams.put("credentials", credentials);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


}
