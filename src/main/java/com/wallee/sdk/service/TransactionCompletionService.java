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
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionCompletionRequest;


public class TransactionCompletionService {
    private ApiClient apiClient;

    public TransactionCompletionService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * completeOffline
    * This operation completes the transaction offline. The completion is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be completed.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-offline">completeOffline Documentation</a>

    **/
    public TransactionCompletion completeOffline(Long spaceId, Long id) throws IOException {
        HttpResponse response = completeOfflineForHttpResponse(spaceId, id);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * completeOffline
    * This operation completes the transaction offline. The completion is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be completed.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-offline">completeOffline Documentation</a>

    **/
    public TransactionCompletion completeOffline(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = completeOfflineForHttpResponse(spaceId, id, params);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse completeOfflineForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completeOffline");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling completeOffline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completeOffline");
      {
          String key = "spaceId";
          Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);
      }
      String key = "id";
      Object value = id;
      uriBuilder = uriBuilder.queryParam(key, value);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse completeOfflineForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completeOffline");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling completeOffline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completeOffline");

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
    * completeOnline
    * This operation completes the transaction online. The completion is forwarded to the processor. This implies that the processor may take some actions based on the completion.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be completed.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-online">completeOnline Documentation</a>

    **/
    public TransactionCompletion completeOnline(Long spaceId, Long id) throws IOException {
        HttpResponse response = completeOnlineForHttpResponse(spaceId, id);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * completeOnline
    * This operation completes the transaction online. The completion is forwarded to the processor. This implies that the processor may take some actions based on the completion.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction which should be completed.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-online">completeOnline Documentation</a>

    **/
    public TransactionCompletion completeOnline(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = completeOnlineForHttpResponse(spaceId, id, params);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse completeOnlineForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completeOnline");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling completeOnline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completeOnline");
      {
          String key = "spaceId";
          Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);
      }
      String key = "id";
      Object value = id;
      uriBuilder = uriBuilder.queryParam(key, value);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse completeOnlineForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completeOnline");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling completeOnline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completeOnline");

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
    * completePartiallyOffline
    * This operation can be used to partially complete the transaction offline. The completion is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param completion 
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-partially-offline">completePartiallyOffline Documentation</a>

    **/
    public TransactionCompletion completePartiallyOffline(Long spaceId, TransactionCompletionRequest completion) throws IOException {
        HttpResponse response = completePartiallyOfflineForHttpResponse(spaceId, completion);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * completePartiallyOffline
    * This operation can be used to partially complete the transaction offline. The completion is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param completion 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-partially-offline">completePartiallyOffline Documentation</a>

    **/
    public TransactionCompletion completePartiallyOffline(Long spaceId, TransactionCompletionRequest completion, Map<String, Object> params) throws IOException {
        HttpResponse response = completePartiallyOfflineForHttpResponse(spaceId, completion, params);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse completePartiallyOfflineForHttpResponse(Long spaceId, TransactionCompletionRequest completion) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completePartiallyOffline");
        }// verify the required parameter 'completion' is set
        if (completion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'completion' when calling completePartiallyOffline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completePartiallyOffline");
      String key = "spaceId";
      Object value = spaceId;
      uriBuilder = uriBuilder.queryParam(key, value);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(completion);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse completePartiallyOfflineForHttpResponse(Long spaceId, InputStream completion, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completePartiallyOffline");
              }// verify the required parameter 'completion' is set
              if (completion == null) {
              throw new IllegalArgumentException("Missing the required parameter 'completion' when calling completePartiallyOffline");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completePartiallyOffline");
        String key = "spaceId";
        Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, completion);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse completePartiallyOfflineForHttpResponse(Long spaceId, TransactionCompletionRequest completion, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completePartiallyOffline");
        }// verify the required parameter 'completion' is set
        if (completion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'completion' when calling completePartiallyOffline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completePartiallyOffline");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(completion);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * completePartiallyOnline
    * This operation can be used to partially complete the transaction online. The completion is forwarded to the processor. This implies that the processor may take some actions based on the completion.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param completion 
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-partially-online">completePartiallyOnline Documentation</a>

    **/
    public TransactionCompletion completePartiallyOnline(Long spaceId, TransactionCompletionRequest completion) throws IOException {
        HttpResponse response = completePartiallyOnlineForHttpResponse(spaceId, completion);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * completePartiallyOnline
    * This operation can be used to partially complete the transaction online. The completion is forwarded to the processor. This implies that the processor may take some actions based on the completion.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param completion 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--complete-partially-online">completePartiallyOnline Documentation</a>

    **/
    public TransactionCompletion completePartiallyOnline(Long spaceId, TransactionCompletionRequest completion, Map<String, Object> params) throws IOException {
        HttpResponse response = completePartiallyOnlineForHttpResponse(spaceId, completion, params);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse completePartiallyOnlineForHttpResponse(Long spaceId, TransactionCompletionRequest completion) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completePartiallyOnline");
        }// verify the required parameter 'completion' is set
        if (completion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'completion' when calling completePartiallyOnline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completePartiallyOnline");
      String key = "spaceId";
      Object value = spaceId;
      uriBuilder = uriBuilder.queryParam(key, value);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(completion);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse completePartiallyOnlineForHttpResponse(Long spaceId, InputStream completion, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completePartiallyOnline");
              }// verify the required parameter 'completion' is set
              if (completion == null) {
              throw new IllegalArgumentException("Missing the required parameter 'completion' when calling completePartiallyOnline");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completePartiallyOnline");
        String key = "spaceId";
        Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);

        String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, completion);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse completePartiallyOnlineForHttpResponse(Long spaceId, TransactionCompletionRequest completion, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling completePartiallyOnline");
        }// verify the required parameter 'completion' is set
        if (completion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'completion' when calling completePartiallyOnline");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/completePartiallyOnline");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(completion);
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
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--count">Count Documentation</a>

    **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        String returnType = "Long";
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
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--count">Count Documentation</a>

    **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        String returnType = "Long";
      TypeReference typeRef = new TypeReference<Long>() {};
        return (Long)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/count");
      String key = "spaceId";
      Object value = spaceId;
      uriBuilder = uriBuilder.queryParam(key, value);

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
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/count");
        String key = "spaceId";
        Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);

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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/count");

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
    * Read
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction completions which should be returned.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--read">Read Documentation</a>

    **/
    public TransactionCompletion read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction completions which should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionCompletion
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--read">Read Documentation</a>

    **/
    public TransactionCompletion read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        String returnType = "TransactionCompletion";
      TypeReference typeRef = new TypeReference<TransactionCompletion>() {};
        return (TransactionCompletion)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/read");
      {
          String key = "spaceId";
          Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);
      }
      String key = "id";
      Object value = id;
      uriBuilder = uriBuilder.queryParam(key, value);

      String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/read");

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

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the transaction completions which are returned by the search.
    * @return List&lt;TransactionCompletion&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--search">Search Documentation</a>

    **/
    public List<TransactionCompletion> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        String returnType = "List&lt;TransactionCompletion&gt;";
      TypeReference typeRef = new TypeReference<List<TransactionCompletion>>() {};
        return (List<TransactionCompletion>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the transaction completions which are returned by the search.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;TransactionCompletion&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-completion-service--search">Search Documentation</a>

    **/
    public List<TransactionCompletion> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        String returnType = "List&lt;TransactionCompletion&gt;";
      TypeReference typeRef = new TypeReference<List<TransactionCompletion>>() {};
        return (List<TransactionCompletion>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/search");
      String key = "spaceId";
      Object value = spaceId;
      uriBuilder = uriBuilder.queryParam(key, value);

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
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/search");
        String key = "spaceId";
        Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);

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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-completion/search");

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


}
