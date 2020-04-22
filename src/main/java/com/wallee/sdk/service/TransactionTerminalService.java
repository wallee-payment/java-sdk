package com.wallee.sdk.service;

import com.wallee.sdk.ApiClient;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.RenderedTerminalReceipt;
import com.wallee.sdk.model.ServerError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
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
    * @param spaceId 
    * @param transactionId The ID of the transaction to get the receipt for.
    * @param typeId 
    * @param width 
    * @return RenderedTerminalReceipt
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>

    **/
    public RenderedTerminalReceipt receipt(Long spaceId, Long transactionId, Long typeId, Integer width) throws IOException {
        HttpResponse response = receiptForHttpResponse(spaceId, transactionId, typeId, width);
        String returnType = "RenderedTerminalReceipt";
        if(returnType.equals("String")){
          return (RenderedTerminalReceipt) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<RenderedTerminalReceipt>() {};
        return (RenderedTerminalReceipt)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * getTerminalReceipt
    * Returns the PDF document for the requested terminal receipt with the given page width.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction to get the receipt for.
    * @param typeId 
    * @param width 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RenderedTerminalReceipt
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--receipt">getTerminalReceipt Documentation</a>

    **/
    public RenderedTerminalReceipt receipt(Long spaceId, Long transactionId, Long typeId, Integer width, Map<String, Object> params) throws IOException {
        HttpResponse response = receiptForHttpResponse(spaceId, transactionId, typeId, width, params);
        String returnType = "RenderedTerminalReceipt";
        if(returnType.equals("String")){
            return (RenderedTerminalReceipt) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<RenderedTerminalReceipt>() {};
        return (RenderedTerminalReceipt)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse receiptForHttpResponse(Long spaceId, Long transactionId, Long typeId, Integer width) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling receipt");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling receipt");
        }// verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'typeId' when calling receipt");
        }// verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException("Missing the required parameter 'width' when calling receipt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/receipt");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (typeId != null) {
            String key = "typeId";
            Object value = typeId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (width != null) {
            String key = "width";
            Object value = width;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse receiptForHttpResponse(Long spaceId, Long transactionId, Long typeId, Integer width, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling receipt");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling receipt");
        }// verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'typeId' when calling receipt");
        }// verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException("Missing the required parameter 'width' when calling receipt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/receipt");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'transactionId' to the map of query params
        allParams.put("transactionId", transactionId);
        // Add the required query param 'typeId' to the map of query params
        allParams.put("typeId", typeId);
        // Add the required query param 'width' to the map of query params
        allParams.put("width", width);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Create Till Connection Credentials
    * This operation creates a set of credentials to use within the WebSocket.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which is used to process with the terminal.
    * @param terminalId The ID of the terminal which should be used to process the transaction.
    * @param language The language in which the messages should be rendered in.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>

    **/
    public String tillConnectionCredentials(Long spaceId, Long transactionId, Long terminalId, String language) throws IOException {
        HttpResponse response = tillConnectionCredentialsForHttpResponse(spaceId, transactionId, terminalId, language);
        String returnType = "String";
        if(returnType.equals("String")){
          return (String) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<String>() {};
        return (String)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create Till Connection Credentials
    * This operation creates a set of credentials to use within the WebSocket.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionId The ID of the transaction which is used to process with the terminal.
    * @param terminalId The ID of the terminal which should be used to process the transaction.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--till-connection-credentials">Create Till Connection Credentials Documentation</a>

    **/
    public String tillConnectionCredentials(Long spaceId, Long transactionId, Long terminalId, Map<String, Object> params) throws IOException {
        HttpResponse response = tillConnectionCredentialsForHttpResponse(spaceId, transactionId, terminalId, params);
        String returnType = "String";
        if(returnType.equals("String")){
            return (String) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<String>() {};
        return (String)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse tillConnectionCredentialsForHttpResponse(Long spaceId, Long transactionId, Long terminalId, String language) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling tillConnectionCredentials");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling tillConnectionCredentials");
        }// verify the required parameter 'terminalId' is set
        if (terminalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'terminalId' when calling tillConnectionCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/till-connection-credentials");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (transactionId != null) {
            String key = "transactionId";
            Object value = transactionId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (terminalId != null) {
            String key = "terminalId";
            Object value = terminalId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (language != null) {
            String key = "language";
            Object value = language;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse tillConnectionCredentialsForHttpResponse(Long spaceId, Long transactionId, Long terminalId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling tillConnectionCredentials");
        }// verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionId' when calling tillConnectionCredentials");
        }// verify the required parameter 'terminalId' is set
        if (terminalId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'terminalId' when calling tillConnectionCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/till-connection-credentials");

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
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
