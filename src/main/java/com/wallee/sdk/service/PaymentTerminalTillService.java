package com.wallee.sdk.service;

import static com.wallee.sdk.ErrorCode.*;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ErrorCode;
import com.wallee.sdk.exception.WalleeSdkException;
import com.wallee.sdk.util.URIBuilderUtil;
import com.wallee.sdk.StringUtil;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.Transaction;


import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import org.apache.http.client.utils.URIBuilder;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;



public class PaymentTerminalTillService {
    private ApiClient apiClient;

    public PaymentTerminalTillService(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

  /**
    * Perform Payment Terminal Transaction
    * (The read time out for this request is 90 seconds)
    * Starts a payment terminal transaction and waits for its completion. If the call returns with a long polling timeout status, you may try again. The processing of the transaction will be picked up where it was left off.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * <p><b>543</b> - This status code indicates that the long polling request timed out.
    * @param spaceId 
    * @param transactionId The ID of the transaction which is used to process with the terminal.
    * @param terminalId The ID of the terminal which should be used to process the transaction.
    * @param language The language in which the messages should be rendered in.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-terminal-till-service--perform-transaction">Perform Payment Terminal Transaction Documentation</a>

    **/
    public Transaction performTransaction(Long spaceId, Long transactionId, Long terminalId, String language) throws IOException {
        HttpResponse response = performTransactionForHttpResponse(spaceId, transactionId, terminalId, language);
        String returnType = "Transaction";
        if(returnType.equals("String")){
          return (Transaction) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Transaction>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform Payment Terminal Transaction
    * (The read time out for this request is 90 seconds)
    * Starts a payment terminal transaction and waits for its completion. If the call returns with a long polling timeout status, you may try again. The processing of the transaction will be picked up where it was left off.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * <p><b>543</b> - This status code indicates that the long polling request timed out.
    * @param spaceId 
    * @param transactionId The ID of the transaction which is used to process with the terminal.
    * @param terminalId The ID of the terminal which should be used to process the transaction.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-terminal-till-service--perform-transaction">Perform Payment Terminal Transaction Documentation</a>

    **/
    public Transaction performTransaction(Long spaceId, Long transactionId, Long terminalId, Map<String, Object> params) throws IOException {
        HttpResponse response = performTransactionForHttpResponse(spaceId, transactionId, terminalId, params);
        String returnType = "Transaction";
        if(returnType.equals("String")){
            return (Transaction) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Transaction>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse performTransactionForHttpResponse(Long spaceId, Long transactionId, Long terminalId, String language) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling performTransaction");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling performTransaction");
        }
        // verify the required parameter 'terminalId' is set
        if (terminalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'terminalId' when calling performTransaction");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/payment-terminal-till/perform-transaction");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (terminalId != null) {
            String key = "terminalId";
            Object value = terminalId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (language != null) {
            String key = "language";
            Object value = language;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        int readTimeOut = 90 * 1000;
        
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse performTransactionForHttpResponse(Long spaceId, Long transactionId, Long terminalId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling performTransaction");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling performTransaction");
        }
        // verify the required parameter 'terminalId' is set
        if (terminalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'terminalId' when calling performTransaction");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/payment-terminal-till/perform-transaction");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'terminalId' to the map of query params
        allParams.put("terminalId", terminalId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        int readTimeOut = 90 * 1000;
        
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Perform Payment Terminal Transaction (using TID)
    * (The read time out for this request is 90 seconds)
    * Starts a payment terminal transaction and waits for its completion. If the call returns with a long polling timeout status, you may try again. The processing of the transaction will be picked up where it was left off.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * <p><b>543</b> - This status code indicates that the long polling request timed out.
    * @param spaceId 
    * @param transactionId The ID of the transaction which is used to process with the terminal.
    * @param terminalIdentifier The identifier (aka TID) of the terminal which should be used to process the transaction.
    * @param language The language in which the messages should be rendered in.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-terminal-till-service--perform-transaction-by-identifier">Perform Payment Terminal Transaction (using TID) Documentation</a>

    **/
    public Transaction performTransactionByIdentifier(Long spaceId, Long transactionId, String terminalIdentifier, String language) throws IOException {
        HttpResponse response = performTransactionByIdentifierForHttpResponse(spaceId, transactionId, terminalIdentifier, language);
        String returnType = "Transaction";
        if(returnType.equals("String")){
          return (Transaction) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Transaction>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform Payment Terminal Transaction (using TID)
    * (The read time out for this request is 90 seconds)
    * Starts a payment terminal transaction and waits for its completion. If the call returns with a long polling timeout status, you may try again. The processing of the transaction will be picked up where it was left off.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * <p><b>543</b> - This status code indicates that the long polling request timed out.
    * @param spaceId 
    * @param transactionId The ID of the transaction which is used to process with the terminal.
    * @param terminalIdentifier The identifier (aka TID) of the terminal which should be used to process the transaction.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#payment-terminal-till-service--perform-transaction-by-identifier">Perform Payment Terminal Transaction (using TID) Documentation</a>

    **/
    public Transaction performTransactionByIdentifier(Long spaceId, Long transactionId, String terminalIdentifier, Map<String, Object> params) throws IOException {
        HttpResponse response = performTransactionByIdentifierForHttpResponse(spaceId, transactionId, terminalIdentifier, params);
        String returnType = "Transaction";
        if(returnType.equals("String")){
            return (Transaction) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<Transaction>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse performTransactionByIdentifierForHttpResponse(Long spaceId, Long transactionId, String terminalIdentifier, String language) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling performTransactionByIdentifier");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling performTransactionByIdentifier");
        }
        // verify the required parameter 'terminalIdentifier' is set
        if (terminalIdentifier == null) {
            throw new IllegalArgumentException("Missing the required parameter 'terminalIdentifier' when calling performTransactionByIdentifier");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/payment-terminal-till/perform-transaction-by-identifier");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (terminalIdentifier != null) {
            String key = "terminalIdentifier";
            Object value = terminalIdentifier;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (language != null) {
            String key = "language";
            Object value = language;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        int readTimeOut = 90 * 1000;
        
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse performTransactionByIdentifierForHttpResponse(Long spaceId, Long transactionId, String terminalIdentifier, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling performTransactionByIdentifier");
        }
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling performTransactionByIdentifier");
        }
        // verify the required parameter 'terminalIdentifier' is set
        if (terminalIdentifier == null) {
            throw new IllegalArgumentException("Missing the required parameter 'terminalIdentifier' when calling performTransactionByIdentifier");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/payment-terminal-till/perform-transaction-by-identifier");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'terminalIdentifier' to the map of query params
        allParams.put("terminalIdentifier", terminalIdentifier);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        int readTimeOut = 90 * 1000;
        
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }



    private boolean isNoBodyResponse(HttpResponse response) throws IOException {
        java.io.InputStream content = response.getContent();
        return content.available() == 0;
    }
}
