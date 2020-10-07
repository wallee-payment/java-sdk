package com.wallee.sdk.service;

import java.io.IOException;
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
import com.wallee.sdk.model.RenderedDocument;
import com.wallee.sdk.model.TransactionInvoice;
import com.wallee.sdk.model.TransactionInvoiceReplacement;


public class TransactionInvoiceService {
    private ApiClient apiClient;

    public TransactionInvoiceService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>

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
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--count">Count Documentation</a>

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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/count");
        String key = "spaceId";
        Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse countForHttpResponse(Long spaceId, java.io.InputStream filter, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling count");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/count");
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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/count");

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
    * getInvoiceDocument
    * Returns the PDF document for the transaction invoice with given id.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoice to get the document for.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>

    **/
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id) throws IOException {
        HttpResponse response = getInvoiceDocumentForHttpResponse(spaceId, id);
        String returnType = "RenderedDocument";
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
    * @param id The id of the transaction invoice to get the document for.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document">getInvoiceDocument Documentation</a>

    **/
    public RenderedDocument getInvoiceDocument(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = getInvoiceDocumentForHttpResponse(spaceId, id, params);
        String returnType = "RenderedDocument";
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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocument");
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

    public HttpResponse getInvoiceDocumentForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getInvoiceDocument");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getInvoiceDocument");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocument");

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
    * getInvoiceDocumentWithTargetMediaType
    * Returns the PDF document for the transaction invoice with given id and target media type id.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoice to get the document for.
    * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>

    **/
    public RenderedDocument getInvoiceDocumentWithTargetMediaType(Long spaceId, Long id, Long targetMediaTypeId) throws IOException {
        HttpResponse response = getInvoiceDocumentWithTargetMediaTypeForHttpResponse(spaceId, id, targetMediaTypeId);
        String returnType = "RenderedDocument";
        TypeReference typeRef = new TypeReference<RenderedDocument>() {};
        return (RenderedDocument)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * getInvoiceDocumentWithTargetMediaType
    * Returns the PDF document for the transaction invoice with given id and target media type id.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoice to get the document for.
    * @param targetMediaTypeId The id of the target media type for which the invoice should be generated for.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RenderedDocument
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--get-invoice-document-with-target-media-type">getInvoiceDocumentWithTargetMediaType Documentation</a>

    **/
    public RenderedDocument getInvoiceDocumentWithTargetMediaType(Long spaceId, Long id, Long targetMediaTypeId, Map<String, Object> params) throws IOException {
        HttpResponse response = getInvoiceDocumentWithTargetMediaTypeForHttpResponse(spaceId, id, targetMediaTypeId, params);
        String returnType = "RenderedDocument";
        TypeReference typeRef = new TypeReference<RenderedDocument>() {};
        return (RenderedDocument)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getInvoiceDocumentWithTargetMediaTypeForHttpResponse(Long spaceId, Long id, Long targetMediaTypeId) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getInvoiceDocumentWithTargetMediaType");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getInvoiceDocumentWithTargetMediaType");
        }// verify the required parameter 'targetMediaTypeId' is set
        if (targetMediaTypeId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'targetMediaTypeId' when calling getInvoiceDocumentWithTargetMediaType");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocumentWithTargetMediaType");
        {
            String key = "spaceId";
            Object value = spaceId;
            uriBuilder = uriBuilder.queryParam(key, value);
        }
        {
            String key = "id";
            Object value = id;
            uriBuilder = uriBuilder.queryParam(key, value);
        }
        String key = "targetMediaTypeId";
        Object value = targetMediaTypeId;
        uriBuilder = uriBuilder.queryParam(key, value);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse getInvoiceDocumentWithTargetMediaTypeForHttpResponse(Long spaceId, Long id, Long targetMediaTypeId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling getInvoiceDocumentWithTargetMediaType");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling getInvoiceDocumentWithTargetMediaType");
        }// verify the required parameter 'targetMediaTypeId' is set
        if (targetMediaTypeId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'targetMediaTypeId' when calling getInvoiceDocumentWithTargetMediaType");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/getInvoiceDocumentWithTargetMediaType");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);
        // Add the required query param 'targetMediaTypeId' to the map of query params
        allParams.put("targetMediaTypeId", targetMediaTypeId);

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
    * isReplacementPossible
    * Returns whether the transaction invoice with the given id can be replaced.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The invoice which should be checked if a replacement is possible.
    * @return Boolean
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>

    **/
    public Boolean isReplacementPossible(Long spaceId, Long id) throws IOException {
        HttpResponse response = isReplacementPossibleForHttpResponse(spaceId, id);
        String returnType = "Boolean";
        TypeReference typeRef = new TypeReference<Boolean>() {};
        return (Boolean)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * isReplacementPossible
    * Returns whether the transaction invoice with the given id can be replaced.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The invoice which should be checked if a replacement is possible.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Boolean
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--is-replacement-possible">isReplacementPossible Documentation</a>

    **/
    public Boolean isReplacementPossible(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = isReplacementPossibleForHttpResponse(spaceId, id, params);
        String returnType = "Boolean";
        TypeReference typeRef = new TypeReference<Boolean>() {};
        return (Boolean)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse isReplacementPossibleForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling isReplacementPossible");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling isReplacementPossible");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/isReplacementPossible");
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

    public HttpResponse isReplacementPossibleForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling isReplacementPossible");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling isReplacementPossible");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/isReplacementPossible");

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
    * Mark as Derecognized
    * Marks the transaction invoice with the given id as derecognized.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoice which should be marked as derecognized.
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>

    **/
    public TransactionInvoice markAsDerecognized(Long spaceId, Long id) throws IOException {
        HttpResponse response = markAsDerecognizedForHttpResponse(spaceId, id);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Mark as Derecognized
    * Marks the transaction invoice with the given id as derecognized.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoice which should be marked as derecognized.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-derecognized">Mark as Derecognized Documentation</a>

    **/
    public TransactionInvoice markAsDerecognized(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsDerecognizedForHttpResponse(spaceId, id, params);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse markAsDerecognizedForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling markAsDerecognized");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling markAsDerecognized");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsDerecognized");
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

    public HttpResponse markAsDerecognizedForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling markAsDerecognized");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling markAsDerecognized");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsDerecognized");

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
    * Mark as Paid
    * Marks the transaction invoice with the given id as paid.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoice which should be marked as paid.
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>

    **/
    public TransactionInvoice markAsPaid(Long spaceId, Long id) throws IOException {
        HttpResponse response = markAsPaidForHttpResponse(spaceId, id);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Mark as Paid
    * Marks the transaction invoice with the given id as paid.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoice which should be marked as paid.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--mark-as-paid">Mark as Paid Documentation</a>

    **/
    public TransactionInvoice markAsPaid(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = markAsPaidForHttpResponse(spaceId, id, params);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse markAsPaidForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling markAsPaid");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling markAsPaid");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsPaid");
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

    public HttpResponse markAsPaidForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling markAsPaid");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling markAsPaid");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/markAsPaid");

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
    * @param id The id of the transaction invoices which should be returned.
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>

    **/
    public TransactionInvoice read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoices which should be returned.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--read">Read Documentation</a>

    **/
    public TransactionInvoice read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling read");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/read");
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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/read");

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
    * replace
    * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoices which should be replaced.
    * @param replacement 
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>

    **/
    public TransactionInvoice replace(Long spaceId, Long id, TransactionInvoiceReplacement replacement) throws IOException {
        HttpResponse response = replaceForHttpResponse(spaceId, id, replacement);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * replace
    * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param id The id of the transaction invoices which should be replaced.
    * @param replacement 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TransactionInvoice
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--replace">replace Documentation</a>

    **/
    public TransactionInvoice replace(Long spaceId, Long id, TransactionInvoiceReplacement replacement, Map<String, Object> params) throws IOException {
        HttpResponse response = replaceForHttpResponse(spaceId, id, replacement, params);
        String returnType = "TransactionInvoice";
        TypeReference typeRef = new TypeReference<TransactionInvoice>() {};
        return (TransactionInvoice)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse replaceForHttpResponse(Long spaceId, Long id, TransactionInvoiceReplacement replacement) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling replace");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling replace");
        }// verify the required parameter 'replacement' is set
        if (replacement == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replacement' when calling replace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/replace");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(replacement);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse replaceForHttpResponse(Long spaceId, Long id, java.io.InputStream replacement, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling replace");
              }// verify the required parameter 'id' is set
              if (id == null) {
              throw new IllegalArgumentException("Missing the required parameter 'id' when calling replace");
              }// verify the required parameter 'replacement' is set
              if (replacement == null) {
              throw new IllegalArgumentException("Missing the required parameter 'replacement' when calling replace");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/replace");
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

              HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, replacement);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse replaceForHttpResponse(Long spaceId, Long id, TransactionInvoiceReplacement replacement, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling replace");
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling replace");
        }// verify the required parameter 'replacement' is set
        if (replacement == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replacement' when calling replace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/replace");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(replacement);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the transaction invoices which are returned by the search.
    * @return List&lt;TransactionInvoice&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>

    **/
    public List<TransactionInvoice> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        String returnType = "List&lt;TransactionInvoice&gt;";
        TypeReference typeRef = new TypeReference<List<TransactionInvoice>>() {};
        return (List<TransactionInvoice>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Search
    * Searches for the entities as specified by the given query.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param query The query restricts the transaction invoices which are returned by the search.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;TransactionInvoice&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-invoice-service--search">Search Documentation</a>

    **/
    public List<TransactionInvoice> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        String returnType = "List&lt;TransactionInvoice&gt;";
        TypeReference typeRef = new TypeReference<List<TransactionInvoice>>() {};
        return (List<TransactionInvoice>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/search");
        String key = "spaceId";
        Object value = spaceId;
        uriBuilder = uriBuilder.queryParam(key, value);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse searchForHttpResponse(Long spaceId, java.io.InputStream query, String mediaType) throws IOException {
          // verify the required parameter 'spaceId' is set
              if (spaceId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling search");
              }// verify the required parameter 'query' is set
              if (query == null) {
              throw new IllegalArgumentException("Missing the required parameter 'query' when calling search");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/search");
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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-invoice/search");

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
