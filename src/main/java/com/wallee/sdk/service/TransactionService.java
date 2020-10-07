package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.json.Json;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.EntityExportRequest;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.RenderedDocument;
import com.wallee.sdk.model.TokenVersion;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCreate;
import com.wallee.sdk.model.TransactionLineItemUpdateRequest;
import com.wallee.sdk.model.TransactionLineItemVersion;
import com.wallee.sdk.model.TransactionPending;


public class TransactionService {
    private ApiClient apiClient;

    public TransactionService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Confirm
    * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionModel The transaction JSON object to update and confirm.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--confirm">Confirm Documentation</a>

    **/
    public Transaction confirm(Long spaceId, TransactionPending transactionModel) throws IOException {
        HttpResponse response = confirmForHttpResponse(spaceId, transactionModel);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Confirm
    * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transactionModel The transaction JSON object to update and confirm.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--confirm">Confirm Documentation</a>

    **/
    public Transaction confirm(Long spaceId, TransactionPending transactionModel, Map<String, Object> params) throws IOException {
        HttpResponse response = confirmForHttpResponse(spaceId, transactionModel, params);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse confirmForHttpResponse(Long spaceId, TransactionPending transactionModel) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling confirm");
        }// verify the required parameter 'transactionModel' is set
        if (transactionModel == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionModel' when calling confirm");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/confirm");
      String key = "spaceId";
      uriBuilder = uriBuilder.queryParam(key, spaceId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(transactionModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse confirmForHttpResponse(Long spaceId, InputStream transactionModel, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling confirm");
              }// verify the required parameter 'transactionModel' is set
              if (transactionModel == null) {
              throw new IllegalArgumentException("Missing the required parameter 'transactionModel' when calling confirm");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/confirm");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, transactionModel);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse confirmForHttpResponse(Long spaceId, TransactionPending transactionModel, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling confirm");
        }// verify the required parameter 'transactionModel' is set
        if (transactionModel == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transactionModel' when calling confirm");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/confirm");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(transactionModel);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Count
    * Counts the number of items in the database as restricted by the given filter.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param filter The filter which restricts the entities which are used to calculate the count.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--count">Count Documentation</a>

    **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        TypeReference typeRef = new TypeReference<Long>() {};
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Count
    * Counts the number of items in the database as restricted by the given filter.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Long
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--count">Count Documentation</a>

    **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        TypeReference typeRef = new TypeReference<Long>() {};
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/count");
      String key = "spaceId";
      uriBuilder = uriBuilder.queryParam(key, spaceId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/count");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = filter == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, filter);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/count");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Create
    * Creates the entity with the given properties.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transaction The transaction object which should be created.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--create">Create Documentation</a>

    **/
    public Transaction create(Long spaceId, TransactionCreate transaction) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, transaction);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create
    * Creates the entity with the given properties.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param transaction The transaction object which should be created.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--create">Create Documentation</a>

    **/
    public Transaction create(Long spaceId, TransactionCreate transaction, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, transaction, params);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createForHttpResponse(Long spaceId, TransactionCreate transaction) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }// verify the required parameter 'transaction' is set
        if (transaction == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transaction' when calling create");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/create");
      String key = "spaceId";
      uriBuilder = uriBuilder.queryParam(key, spaceId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(transaction);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse createForHttpResponse(Long spaceId, InputStream transaction, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
              }// verify the required parameter 'transaction' is set
              if (transaction == null) {
              throw new IllegalArgumentException("Missing the required parameter 'transaction' when calling create");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/create");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, transaction);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse createForHttpResponse(Long spaceId, TransactionCreate transaction, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling create");
        }// verify the required parameter 'transaction' is set
        if (transaction == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transaction' when calling create");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/create");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(transaction);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Create Transaction Credentials
    * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be returned.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--create-transaction-credentials">Create Transaction Credentials Documentation</a>

    **/
    public String createTransactionCredentials(Long spaceId, Long id) throws IOException {
        HttpResponse response = createTransactionCredentialsForHttpResponse(spaceId, id);
        return response.parseAsString();
    }

  /**
    * Create Transaction Credentials
    * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--create-transaction-credentials">Create Transaction Credentials Documentation</a>

    **/
    public String createTransactionCredentials(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = createTransactionCredentialsForHttpResponse(spaceId, id, params);
        return response.parseAsString();
    }

    public HttpResponse createTransactionCredentialsForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling createTransactionCredentials");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling createTransactionCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/createTransactionCredentials");
      {
          String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);
      }
      String key = "id";
      uriBuilder = uriBuilder.queryParam(key, id);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse createTransactionCredentialsForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling createTransactionCredentials");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling createTransactionCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/createTransactionCredentials");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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


  /**
    * Delete One-Click Token with Credentials
    * This operation removes the given token.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param tokenId The token ID will be used to find the token which should be removed.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--delete-one-click-token-with-credentials">Delete One-Click Token with Credentials Documentation</a>

    **/
    public void deleteOneClickTokenWithCredentials(String credentials, Long tokenId) throws IOException {
        deleteOneClickTokenWithCredentialsForHttpResponse(credentials, tokenId);
    }

  /**
    * Delete One-Click Token with Credentials
    * This operation removes the given token.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param tokenId The token ID will be used to find the token which should be removed.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--delete-one-click-token-with-credentials">Delete One-Click Token with Credentials Documentation</a>

    **/
    public void deleteOneClickTokenWithCredentials(String credentials, Long tokenId, Map<String, Object> params) throws IOException {
        deleteOneClickTokenWithCredentialsForHttpResponse(credentials, tokenId, params);
    }

    public HttpResponse deleteOneClickTokenWithCredentialsForHttpResponse(String credentials, Long tokenId) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling deleteOneClickTokenWithCredentials");
        }// verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'tokenId' when calling deleteOneClickTokenWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/deleteOneClickTokenWithCredentials");
      {
          String key = "credentials";
        uriBuilder = uriBuilder.queryParam(key, credentials);
      }
      String key = "tokenId";
      uriBuilder = uriBuilder.queryParam(key, tokenId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse deleteOneClickTokenWithCredentialsForHttpResponse(String credentials, Long tokenId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling deleteOneClickTokenWithCredentials");
        }// verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'tokenId' when calling deleteOneClickTokenWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/deleteOneClickTokenWithCredentials");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'credentials' to the map of query params
        allParams.put("credentials", credentials);
        // Add the required query param 'tokenId' to the map of query params
        allParams.put("tokenId", tokenId);

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


  /**
    * Export
    * Exports the transactions into a CSV file. The file will contain the properties defined in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param request The request controls the entries which are exported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--export">Export Documentation</a>

    **/
    public byte[] export(Long spaceId, EntityExportRequest request) throws IOException {
        HttpResponse response = exportForHttpResponse(spaceId, request);
        String returnType = "byte[]";
      TypeReference typeRef = new TypeReference<byte[]>() {};
        return (byte[])apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Export
    * Exports the transactions into a CSV file. The file will contain the properties defined in the request.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param request The request controls the entries which are exported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--export">Export Documentation</a>

    **/
    public byte[] export(Long spaceId, EntityExportRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = exportForHttpResponse(spaceId, request, params);
        String returnType = "byte[]";
      TypeReference typeRef = new TypeReference<byte[]>() {};
        return (byte[])apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse exportForHttpResponse(Long spaceId, EntityExportRequest request) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling export");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling export");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/export");
      String key = "spaceId";
      uriBuilder = uriBuilder.queryParam(key, spaceId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse exportForHttpResponse(Long spaceId, InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling export");
              }// verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling export");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/export");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse exportForHttpResponse(Long spaceId, EntityExportRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling export");
        }// verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling export");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/export");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Fetch One Click Tokens with Credentials
    * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @return List&lt;TokenVersion&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--fetch-one-click-tokens-with-credentials">Fetch One Click Tokens with Credentials Documentation</a>

    **/
    public List<TokenVersion> fetchOneClickTokensWithCredentials(String credentials) throws IOException {
        HttpResponse response = fetchOneClickTokensWithCredentialsForHttpResponse(credentials);
        TypeReference typeRef = new TypeReference<List<TokenVersion>>() {};
        return (List<TokenVersion>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fetch One Click Tokens with Credentials
    * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;TokenVersion&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--fetch-one-click-tokens-with-credentials">Fetch One Click Tokens with Credentials Documentation</a>

    **/
    public List<TokenVersion> fetchOneClickTokensWithCredentials(String credentials, Map<String, Object> params) throws IOException {
        HttpResponse response = fetchOneClickTokensWithCredentialsForHttpResponse(credentials, params);
        TypeReference typeRef = new TypeReference<List<TokenVersion>>() {};
        return (List<TokenVersion>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fetchOneClickTokensWithCredentialsForHttpResponse(String credentials) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling fetchOneClickTokensWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/fetchOneClickTokensWithCredentials");
      String key = "credentials";
      uriBuilder = uriBuilder.queryParam(key, credentials);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse fetchOneClickTokensWithCredentialsForHttpResponse(String credentials, Map<String, Object> params) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling fetchOneClickTokensWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/fetchOneClickTokensWithCredentials");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'credentials' to the map of query params
        allParams.put("credentials", credentials);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * Fetch Possible Payment Methods
    * This operation allows to get the payment method configurations which can be used with the provided transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be returned.
    * @param integrationMode The integration mode defines the type of integration that is applied on the transaction.
    * @return List&lt;PaymentMethodConfiguration&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--fetch-payment-methods">Fetch Possible Payment Methods Documentation</a>

    **/
    public List<PaymentMethodConfiguration> fetchPaymentMethods(Long spaceId, Long id, String integrationMode) throws IOException {
        HttpResponse response = fetchPaymentMethodsForHttpResponse(spaceId, id, integrationMode);
        TypeReference typeRef = new TypeReference<List<PaymentMethodConfiguration>>() {};
        return (List<PaymentMethodConfiguration>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fetch Possible Payment Methods
    * This operation allows to get the payment method configurations which can be used with the provided transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be returned.
    * @param integrationMode The integration mode defines the type of integration that is applied on the transaction.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;PaymentMethodConfiguration&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--fetch-payment-methods">Fetch Possible Payment Methods Documentation</a>

    **/
    public List<PaymentMethodConfiguration> fetchPaymentMethods(Long spaceId, Long id, String integrationMode, Map<String, Object> params) throws IOException {
        HttpResponse response = fetchPaymentMethodsForHttpResponse(spaceId, id, integrationMode, params);
        TypeReference typeRef = new TypeReference<List<PaymentMethodConfiguration>>() {};
        return (List<PaymentMethodConfiguration>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fetchPaymentMethodsForHttpResponse(Long spaceId, Long id, String integrationMode) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling fetchPaymentMethods");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling fetchPaymentMethods");
        }// verify the required parameter 'integrationMode' is set
        if (integrationMode == null) {
            throw new IllegalArgumentException("Missing the required parameter 'integrationMode' when calling fetchPaymentMethods");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/fetch-payment-methods");
      {
          String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);
      }
      {
          String key = "id";
        uriBuilder = uriBuilder.queryParam(key, id);
      }
      String key = "integrationMode";
      uriBuilder = uriBuilder.queryParam(key, integrationMode);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse fetchPaymentMethodsForHttpResponse(Long spaceId, Long id, String integrationMode, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling fetchPaymentMethods");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling fetchPaymentMethods");
        }// verify the required parameter 'integrationMode' is set
        if (integrationMode == null) {
            throw new IllegalArgumentException("Missing the required parameter 'integrationMode' when calling fetchPaymentMethods");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/fetch-payment-methods");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);
        // Add the required query param 'integrationMode' to the map of query params
        allParams.put("integrationMode", integrationMode);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * Fetch Possible Payment Methods with Credentials
    * This operation allows to get the payment method configurations which can be used with the provided transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param integrationMode The integration mode defines the type of integration that is applied on the transaction.
    * @return List&lt;PaymentMethodConfiguration&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--fetch-payment-methods-with-credentials">Fetch Possible Payment Methods with Credentials Documentation</a>

    **/
    public List<PaymentMethodConfiguration> fetchPaymentMethodsWithCredentials(String credentials, String integrationMode) throws IOException {
        HttpResponse response = fetchPaymentMethodsWithCredentialsForHttpResponse(credentials, integrationMode);
        TypeReference typeRef = new TypeReference<List<PaymentMethodConfiguration>>() {};
        return (List<PaymentMethodConfiguration>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fetch Possible Payment Methods with Credentials
    * This operation allows to get the payment method configurations which can be used with the provided transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param integrationMode The integration mode defines the type of integration that is applied on the transaction.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;PaymentMethodConfiguration&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--fetch-payment-methods-with-credentials">Fetch Possible Payment Methods with Credentials Documentation</a>

    **/
    public List<PaymentMethodConfiguration> fetchPaymentMethodsWithCredentials(String credentials, String integrationMode, Map<String, Object> params) throws IOException {
        HttpResponse response = fetchPaymentMethodsWithCredentialsForHttpResponse(credentials, integrationMode, params);
        TypeReference typeRef = new TypeReference<List<PaymentMethodConfiguration>>() {};
        return (List<PaymentMethodConfiguration>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fetchPaymentMethodsWithCredentialsForHttpResponse(String credentials, String integrationMode) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling fetchPaymentMethodsWithCredentials");
        }// verify the required parameter 'integrationMode' is set
        if (integrationMode == null) {
            throw new IllegalArgumentException("Missing the required parameter 'integrationMode' when calling fetchPaymentMethodsWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/fetch-payment-methods-with-credentials");
      {
          String key = "credentials";
        uriBuilder = uriBuilder.queryParam(key, credentials);
      }
      String key = "integrationMode";
      uriBuilder = uriBuilder.queryParam(key, integrationMode);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse fetchPaymentMethodsWithCredentialsForHttpResponse(String credentials, String integrationMode, Map<String, Object> params) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling fetchPaymentMethodsWithCredentials");
        }// verify the required parameter 'integrationMode' is set
        if (integrationMode == null) {
            throw new IllegalArgumentException("Missing the required parameter 'integrationMode' when calling fetchPaymentMethodsWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/fetch-payment-methods-with-credentials");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'credentials' to the map of query params
        allParams.put("credentials", credentials);
        // Add the required query param 'integrationMode' to the map of query params
        allParams.put("integrationMode", integrationMode);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * getInvoiceDocument
    * Returns the PDF document for the transaction invoice with given id.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction to get the invoice document for.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--get-invoice-document">getInvoiceDocument Documentation</a>

    **/
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id) throws IOException {
        HttpResponse response = getInvoiceDocumentForHttpResponse(spaceId, id);
        TypeReference typeRef = new TypeReference<RenderedDocument>() {};
        return (RenderedDocument)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * getInvoiceDocument
    * Returns the PDF document for the transaction invoice with given id.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction to get the invoice document for.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--get-invoice-document">getInvoiceDocument Documentation</a>

    **/
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = getInvoiceDocumentForHttpResponse(spaceId, id, params);
        TypeReference typeRef = new TypeReference<RenderedDocument>() {};
        return (RenderedDocument)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getInvoiceDocumentForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getInvoiceDocument");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getInvoiceDocument");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/getInvoiceDocument");
      {
          String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);
      }
      String key = "id";
      uriBuilder = uriBuilder.queryParam(key, id);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse getInvoiceDocumentForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getInvoiceDocument");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getInvoiceDocument");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/getInvoiceDocument");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * getLatestTransactionLineItemVersion
    * 
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction to get the latest line item version for.
    * @return TransactionLineItemVersion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--get-latest-transaction-line-item-version">getLatestTransactionLineItemVersion Documentation</a>

    **/
    public TransactionLineItemVersion getLatestTransactionLineItemVersion(Long spaceId, Long id) throws IOException {
        HttpResponse response = getLatestTransactionLineItemVersionForHttpResponse(spaceId, id);
        TypeReference typeRef = new TypeReference<TransactionLineItemVersion>() {};
        return (TransactionLineItemVersion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * getLatestTransactionLineItemVersion
    * 
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction to get the latest line item version for.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionLineItemVersion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--get-latest-transaction-line-item-version">getLatestTransactionLineItemVersion Documentation</a>

    **/
    public TransactionLineItemVersion getLatestTransactionLineItemVersion(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = getLatestTransactionLineItemVersionForHttpResponse(spaceId, id, params);
        TypeReference typeRef = new TypeReference<TransactionLineItemVersion>() {};
        return (TransactionLineItemVersion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getLatestTransactionLineItemVersionForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getLatestTransactionLineItemVersion");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getLatestTransactionLineItemVersion");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/getLatestTransactionLineItemVersion");
      {
          String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);
      }
      String key = "id";
      uriBuilder = uriBuilder.queryParam(key, id);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse getLatestTransactionLineItemVersionForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getLatestTransactionLineItemVersion");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getLatestTransactionLineItemVersion");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/getLatestTransactionLineItemVersion");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * getPackingSlip
    * Returns the packing slip for the transaction with given id.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction to get the packing slip for.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--get-packing-slip">getPackingSlip Documentation</a>

    **/
    public RenderedDocument getPackingSlip(Long spaceId, Long id) throws IOException {
        HttpResponse response = getPackingSlipForHttpResponse(spaceId, id);
        TypeReference typeRef = new TypeReference<RenderedDocument>() {};
        return (RenderedDocument)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * getPackingSlip
    * Returns the packing slip for the transaction with given id.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction to get the packing slip for.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--get-packing-slip">getPackingSlip Documentation</a>

    **/
    public RenderedDocument getPackingSlip(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = getPackingSlipForHttpResponse(spaceId, id, params);
        TypeReference typeRef = new TypeReference<RenderedDocument>() {};
        return (RenderedDocument)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getPackingSlipForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getPackingSlip");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getPackingSlip");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/getPackingSlip");
      {
          String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);
      }
      String key = "id";
      uriBuilder = uriBuilder.queryParam(key, id);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse getPackingSlipForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getPackingSlip");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getPackingSlip");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/getPackingSlip");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * Process One-Click Token with Credentials
    * This operation assigns the given token to the transaction and process it. This method will return an URL where the customer has to be redirect to complete the transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--process-one-click-token-and-redirect-with-credentials">Process One-Click Token with Credentials Documentation</a>

    **/
    public String processOneClickTokenAndRedirectWithCredentials(String credentials, Long tokenId) throws IOException {
        HttpResponse response = processOneClickTokenAndRedirectWithCredentialsForHttpResponse(credentials, tokenId);
        return response.parseAsString();
    }

  /**
    * Process One-Click Token with Credentials
    * This operation assigns the given token to the transaction and process it. This method will return an URL where the customer has to be redirect to complete the transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param tokenId The token ID is used to load the corresponding token and to process the transaction with it.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--process-one-click-token-and-redirect-with-credentials">Process One-Click Token with Credentials Documentation</a>

    **/
    public String processOneClickTokenAndRedirectWithCredentials(String credentials, Long tokenId, Map<String, Object> params) throws IOException {
        HttpResponse response = processOneClickTokenAndRedirectWithCredentialsForHttpResponse(credentials, tokenId, params);
        return response.parseAsString();
    }

    public HttpResponse processOneClickTokenAndRedirectWithCredentialsForHttpResponse(String credentials, Long tokenId) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling processOneClickTokenAndRedirectWithCredentials");
        }// verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'tokenId' when calling processOneClickTokenAndRedirectWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/processOneClickTokenAndRedirectWithCredentials");
      {
          String key = "credentials";
        uriBuilder = uriBuilder.queryParam(key, credentials);
      }
      String key = "tokenId";
      uriBuilder = uriBuilder.queryParam(key, tokenId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse processOneClickTokenAndRedirectWithCredentialsForHttpResponse(String credentials, Long tokenId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling processOneClickTokenAndRedirectWithCredentials");
        }// verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'tokenId' when calling processOneClickTokenAndRedirectWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/processOneClickTokenAndRedirectWithCredentials");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'credentials' to the map of query params
        allParams.put("credentials", credentials);
        // Add the required query param 'tokenId' to the map of query params
        allParams.put("tokenId", tokenId);

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


  /**
    * Process Without User Interaction
    * This operation processes the transaction without requiring that the customer is present. Means this operation applies strategies to process the transaction without a direct interaction with the buyer. This operation is suitable for recurring transactions.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be processed.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--process-without-user-interaction">Process Without User Interaction Documentation</a>

    **/
    public Transaction processWithoutUserInteraction(Long spaceId, Long id) throws IOException {
        HttpResponse response = processWithoutUserInteractionForHttpResponse(spaceId, id);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Process Without User Interaction
    * This operation processes the transaction without requiring that the customer is present. Means this operation applies strategies to process the transaction without a direct interaction with the buyer. This operation is suitable for recurring transactions.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be processed.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--process-without-user-interaction">Process Without User Interaction Documentation</a>

    **/
    public Transaction processWithoutUserInteraction(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = processWithoutUserInteractionForHttpResponse(spaceId, id, params);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse processWithoutUserInteractionForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWithoutUserInteraction");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling processWithoutUserInteraction");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/processWithoutUserInteraction");
      {
          String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);
      }
      String key = "id";
      uriBuilder = uriBuilder.queryParam(key, id);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse processWithoutUserInteractionForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling processWithoutUserInteraction");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling processWithoutUserInteraction");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/processWithoutUserInteraction");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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


  /**
    * Read
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be returned.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--read">Read Documentation</a>

    **/
    public Transaction read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--read">Read Documentation</a>

    **/
    public Transaction read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/read");
      {
          String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);
      }
      String key = "id";
      uriBuilder = uriBuilder.queryParam(key, id);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/read");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * Read With Credentials
    * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--read-with-credentials">Read With Credentials Documentation</a>

    **/
    public Transaction readWithCredentials(String credentials) throws IOException {
        HttpResponse response = readWithCredentialsForHttpResponse(credentials);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read With Credentials
    * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param credentials The credentials identifies the transaction and contains the security details which grants the access this operation.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--read-with-credentials">Read With Credentials Documentation</a>

    **/
    public Transaction readWithCredentials(String credentials, Map<String, Object> params) throws IOException {
        HttpResponse response = readWithCredentialsForHttpResponse(credentials, params);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readWithCredentialsForHttpResponse(String credentials) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling readWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/readWithCredentials");
      String key = "credentials";
      uriBuilder = uriBuilder.queryParam(key, credentials);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse readWithCredentialsForHttpResponse(String credentials, Map<String, Object> params) throws IOException {
        // verify the required parameter 'credentials' is set
        if (credentials == null) {
            throw new IllegalArgumentException("Missing the required parameter 'credentials' when calling readWithCredentials");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/readWithCredentials");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'credentials' to the map of query params
        allParams.put("credentials", credentials);

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the transactions which are returned by the search.
    * @return List&lt;Transaction&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--search">Search Documentation</a>

    **/
    public List<Transaction> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        TypeReference typeRef = new TypeReference<List<Transaction>>() {};
        return (List<Transaction>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the transactions which are returned by the search.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;Transaction&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--search">Search Documentation</a>

    **/
    public List<Transaction> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        TypeReference typeRef = new TypeReference<List<Transaction>>() {};
        return (List<Transaction>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/search");
      String key = "spaceId";
      uriBuilder = uriBuilder.queryParam(key, spaceId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
              }// verify the required parameter 'query' is set
              if (query == null) {
              throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/search");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, query);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update
    * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entity The transaction object with the properties which should be updated.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--update">Update Documentation</a>

    **/
    public Transaction update(Long spaceId, TransactionPending entity) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update
    * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param entity The transaction object with the properties which should be updated.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Transaction
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--update">Update Documentation</a>

    **/
    public Transaction update(Long spaceId, TransactionPending entity, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity, params);
        TypeReference typeRef = new TypeReference<Transaction>() {};
        return (Transaction)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateForHttpResponse(Long spaceId, TransactionPending entity) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling update");
        }// verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/update");
      String key = "spaceId";
      uriBuilder = uriBuilder.queryParam(key, spaceId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse updateForHttpResponse(Long spaceId, InputStream entity, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling update");
              }// verify the required parameter 'entity' is set
              if (entity == null) {
              throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/update");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse updateForHttpResponse(Long spaceId, TransactionPending entity, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling update");
        }// verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'entity' when calling update");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/update");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * updateTransactionLineItems
    * 
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param updateRequest 
    * @return TransactionLineItemVersion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--update-transaction-line-items">updateTransactionLineItems Documentation</a>

    **/
    public TransactionLineItemVersion updateTransactionLineItems(Long spaceId, TransactionLineItemUpdateRequest updateRequest) throws IOException {
        HttpResponse response = updateTransactionLineItemsForHttpResponse(spaceId, updateRequest);
        TypeReference typeRef = new TypeReference<TransactionLineItemVersion>() {};
        return (TransactionLineItemVersion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * updateTransactionLineItems
    * 
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param updateRequest 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionLineItemVersion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-service--update-transaction-line-items">updateTransactionLineItems Documentation</a>

    **/
    public TransactionLineItemVersion updateTransactionLineItems(Long spaceId, TransactionLineItemUpdateRequest updateRequest, Map<String, Object> params) throws IOException {
        HttpResponse response = updateTransactionLineItemsForHttpResponse(spaceId, updateRequest, params);
        TypeReference typeRef = new TypeReference<TransactionLineItemVersion>() {};
        return (TransactionLineItemVersion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateTransactionLineItemsForHttpResponse(Long spaceId, TransactionLineItemUpdateRequest updateRequest) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateTransactionLineItems");
        }// verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'updateRequest' when calling updateTransactionLineItems");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/updateTransactionLineItems");
      String key = "spaceId";
      uriBuilder = uriBuilder.queryParam(key, spaceId);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse updateTransactionLineItemsForHttpResponse(Long spaceId, InputStream updateRequest, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateTransactionLineItems");
              }// verify the required parameter 'updateRequest' is set
              if (updateRequest == null) {
              throw new IllegalArgumentException("Missing the required parameter 'updateRequest' when calling updateTransactionLineItems");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/updateTransactionLineItems");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateRequest);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse updateTransactionLineItemsForHttpResponse(Long spaceId, TransactionLineItemUpdateRequest updateRequest, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling updateTransactionLineItems");
        }// verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'updateRequest' when calling updateTransactionLineItems");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction/updateTransactionLineItems");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
