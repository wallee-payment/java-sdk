package com.wallee.sdk.service;

import com.wallee.sdk.ApiClient;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.RenderedTerminalReceipt;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.TerminalReceiptFetchRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


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
    * Fetch Receipts
    * Returns all receipts for the requested terminal transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param request 
    * @return List&lt;RenderedTerminalReceipt&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--fetch-receipts">Fetch Receipts Documentation</a>

    **/
    public List<RenderedTerminalReceipt> fetchReceipts(Long spaceId, TerminalReceiptFetchRequest request) throws IOException {
        HttpResponse response = fetchReceiptsForHttpResponse(spaceId, request);
        String returnType = "List&lt;RenderedTerminalReceipt&gt;";
        if(returnType.equals("String")){
          return (List<RenderedTerminalReceipt>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RenderedTerminalReceipt>>() {};
        return (List<RenderedTerminalReceipt>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fetch Receipts
    * Returns all receipts for the requested terminal transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param request 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;RenderedTerminalReceipt&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-terminal-service--fetch-receipts">Fetch Receipts Documentation</a>

    **/
    public List<RenderedTerminalReceipt> fetchReceipts(Long spaceId, TerminalReceiptFetchRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = fetchReceiptsForHttpResponse(spaceId, request, params);
        String returnType = "List&lt;RenderedTerminalReceipt&gt;";
        if(returnType.equals("String")){
            return (List<RenderedTerminalReceipt>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<RenderedTerminalReceipt>>() {};
        return (List<RenderedTerminalReceipt>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fetchReceiptsForHttpResponse(Long spaceId, TerminalReceiptFetchRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling fetchReceipts");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling fetchReceipts");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/fetch-receipts");
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
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

      public HttpResponse fetchReceiptsForHttpResponse(Long spaceId, java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling fetchReceipts");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling fetchReceipts");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/fetch-receipts");
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
              }

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
              
              httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
              return httpRequest.execute();
      }

    public HttpResponse fetchReceiptsForHttpResponse(Long spaceId, TerminalReceiptFetchRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling fetchReceipts");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling fetchReceipts");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-terminal/fetch-receipts");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
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
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
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
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

}
