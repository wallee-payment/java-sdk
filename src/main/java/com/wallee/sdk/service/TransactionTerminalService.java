package com.wallee.sdk.service;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.RenderedTerminalReceipt;


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
     * getTerminalReceipt
     * Returns the PDF document for the requested terminal receipt with the given page width.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param transactionId The ID of the transaction to get the receipt for.
     * @param typeId
     * @param width
     * @return RenderedTerminalReceipt
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>
     **/
    public RenderedTerminalReceipt receipt(Long spaceId, Long transactionId, Long typeId, Integer width) throws IOException {
        HttpResponse response = receiptForHttpResponse(spaceId, transactionId, typeId, width);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<RenderedTerminalReceipt>() {
        });
    }

    /**
     * getTerminalReceipt
     * Returns the PDF document for the requested terminal receipt with the given page width.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param transactionId The ID of the transaction to get the receipt for.
     * @param typeId
     * @param width
     * @param params        Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return RenderedTerminalReceipt
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>
     **/
    public RenderedTerminalReceipt receipt(Long spaceId, Long transactionId, Long typeId, Integer width, Map<String, Object> params) throws IOException {
        HttpResponse response = receiptForHttpResponse(spaceId, transactionId, typeId, width, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<RenderedTerminalReceipt>() {
        });
    }

    public HttpResponse receiptForHttpResponse(Long spaceId, Long transactionId, Long typeId, Integer width) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "receipt"));
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "transactionId", "receipt"));
        }// verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "typeId", "receipt"));
        }// verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "width", "receipt"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/receipt");
        {
            String key = "spaceId";
            uriBuilder = uriBuilder.queryParam(key, spaceId);
        }
        {
            String key = "transactionId";
            uriBuilder = uriBuilder.queryParam(key, transactionId);
        }
        {
            String key = "typeId";
            uriBuilder = uriBuilder.queryParam(key, typeId);
        }
        String key = "width";
        uriBuilder = uriBuilder.queryParam(key, width);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse receiptForHttpResponse(Long spaceId, Long transactionId, Long typeId, Integer width, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "receipt"));
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "transactionId", "receipt"));
        }// verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "typeId", "receipt"));
        }// verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "width", "receipt"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/receipt");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'typeId' to the map of query params
        allParams.put("typeId", typeId);
        // Add the required query param 'width' to the map of query params
        allParams.put("width", width);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


    /**
     * Create Till Connection Credentials
     * This operation creates a set of credentials to use within the WebSocket.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param transactionId The ID of the transaction which is used to process with the terminal.
     * @param terminalId    The ID of the terminal which should be used to process the transaction.
     * @param language      The language in which the messages should be rendered in.
     * @return String
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>
     **/
    public String tillConnectionCredentials(Long spaceId, Long transactionId, Long terminalId, String language) throws IOException {
        HttpResponse response = tillConnectionCredentialsForHttpResponse(spaceId, transactionId, terminalId, language);
        return response.parseAsString();
    }

    /**
     * Create Till Connection Credentials
     * This operation creates a set of credentials to use within the WebSocket.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param transactionId The ID of the transaction which is used to process with the terminal.
     * @param terminalId    The ID of the terminal which should be used to process the transaction.
     * @param params        Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return String
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>
     **/
    public String tillConnectionCredentials(Long spaceId, Long transactionId, Long terminalId, Map<String, Object> params) throws IOException {
        HttpResponse response = tillConnectionCredentialsForHttpResponse(spaceId, transactionId, terminalId, params);
        return response.parseAsString();
    }

    public HttpResponse tillConnectionCredentialsForHttpResponse(Long spaceId, Long transactionId, Long terminalId, String language) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "tillConnectionCredentials"));
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "transactionId", "tillConnectionCredentials"));
        }// verify the required parameter 'terminalId' is set
        if (terminalId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "terminalId", "tillConnectionCredentials"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/till-connection-credentials");
        {
            String key = "spaceId";
            uriBuilder = uriBuilder.queryParam(key, spaceId);
        }
        {
            String key = "transactionId";
            uriBuilder = uriBuilder.queryParam(key, transactionId);
        }
        {
            String key = "terminalId";
            uriBuilder = uriBuilder.queryParam(key, terminalId);
        }
        if (language != null) {
            String key = "language";
            uriBuilder = uriBuilder.queryParam(key, language);
        }

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse tillConnectionCredentialsForHttpResponse(Long spaceId, Long transactionId, Long terminalId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "tillConnectionCredentials"));
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "transactionId", "tillConnectionCredentials"));
        }// verify the required parameter 'terminalId' is set
        if (terminalId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "terminalId", "tillConnectionCredentials"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/till-connection-credentials");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'terminalId' to the map of query params
        allParams.put("terminalId", terminalId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
