package com.wallee.sdk.service;

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
import com.wallee.sdk.model.ShopifyTransaction;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ShopifyTransactionService {
    private ApiClient apiClient;

    public ShopifyTransactionService(ApiClient apiClient) {
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
     *
     * @param spaceId
     * @param filter  The filter which restricts the entities which are used to calculate the count.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-transaction-service--count">Count Documentation</a>
     **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>() {
        });
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-transaction-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>() {
        });
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "count"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/count");
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
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "count"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/count");
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
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "count"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/count");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
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
     *
     * @param spaceId
     * @param id      The id of the Shopify transaction which should be returned.
     * @return ShopifyTransaction
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-transaction-service--read">Read Documentation</a>
     **/
    public ShopifyTransaction read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifyTransaction>() {
        });
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the Shopify transaction which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return ShopifyTransaction
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-transaction-service--read">Read Documentation</a>
     **/
    public ShopifyTransaction read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifyTransaction>() {
        });
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "read"));
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "read"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/read");
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
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "read"));
        }// verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "read"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/read");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
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
     *
     * @param spaceId
     * @param query   The query restricts the Shopify transactions which are returned by the search.
     * @return List&lt;ShopifyTransaction&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-transaction-service--search">Search Documentation</a>
     **/
    public List<ShopifyTransaction> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<ShopifyTransaction>>() {
        });
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the Shopify transactions which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;ShopifyTransaction&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-transaction-service--search">Search Documentation</a>
     **/
    public List<ShopifyTransaction> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<ShopifyTransaction>>() {
        });
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "search"));
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/search");
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
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "search"));
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/search");
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
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "search"));
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-transaction/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
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
