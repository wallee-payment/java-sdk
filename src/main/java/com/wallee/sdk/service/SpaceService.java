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
import com.wallee.sdk.model.Space;
import com.wallee.sdk.model.SpaceCreate;
import com.wallee.sdk.model.SpaceUpdate;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SpaceService {
    private ApiClient apiClient;

    public SpaceService(ApiClient apiClient) {
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
     * @param filter The filter which restricts the entities which are used to calculate the count.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(filter);
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
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>() {
        });
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter) throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/count");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse countForHttpResponse(InputStream filter, String mediaType) throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/count");

        String url = uriBuilder.build().toString();
        return ServiceUtils.getHttpResponse(filter, mediaType, url, apiClient);
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Map<String, Object> params) throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/count");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);

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
     * Create
     * Creates the entity with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param entity The space object with the properties which should be created.
     * @return Space
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--create">Create Documentation</a>
     **/
    public Space create(SpaceCreate entity) throws IOException {
        HttpResponse response = createForHttpResponse(entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Space>() {
        });
    }

    /**
     * Create
     * Creates the entity with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param entity The space object with the properties which should be created.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Space
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--create">Create Documentation</a>
     **/
    public Space create(SpaceCreate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Space>() {
        });
    }

    public HttpResponse createForHttpResponse(SpaceCreate entity) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "entity", "create"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/create");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse createForHttpResponse(InputStream entity, String mediaType) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "entity", "create"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/create");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse createForHttpResponse(SpaceCreate entity, Map<String, Object> params) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "entity", "create"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/create");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Delete
     * Deletes the entity with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--delete">Delete Documentation</a>
     **/
    public void delete(Long id) throws IOException {
        deleteForHttpResponse(id);
    }

    /**
     * Delete
     * Deletes the entity with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--delete">Delete Documentation</a>
     **/
    public void delete(Long id, Map<String, Object> params) throws IOException {
        deleteForHttpResponse(id, params);
    }

    public HttpResponse deleteForHttpResponse(Long id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "delete"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/delete");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(id);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse deleteForHttpResponse(InputStream id, String mediaType) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "delete"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/delete");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, id);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse deleteForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "delete"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/delete");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(id);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id The id of the space which should be returned.
     * @return Space
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--read">Read Documentation</a>
     **/
    public Space read(Long id) throws IOException {
        HttpResponse response = readForHttpResponse(id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Space>() {
        });
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id     The id of the space which should be returned.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Space
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--read">Read Documentation</a>
     **/
    public Space read(Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Space>() {
        });
    }

    public HttpResponse readForHttpResponse(Long id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "read"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/read");
        String key = "id";
        uriBuilder = uriBuilder.queryParam(key, id);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse readForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "read"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/read");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
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
     * @param query The query restricts the spaces which are returned by the search.
     * @return List&lt;Space&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--search">Search Documentation</a>
     **/
    public List<Space> search(EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<Space>>() {
        });
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param query  The query restricts the spaces which are returned by the search.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;Space&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--search">Search Documentation</a>
     **/
    public List<Space> search(EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<Space>>() {
        });
    }

    public HttpResponse searchForHttpResponse(EntityQuery query) throws IOException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/search");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse searchForHttpResponse(InputStream query, String mediaType) throws IOException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/search");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse searchForHttpResponse(EntityQuery query, Map<String, Object> params) throws IOException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);

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


    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param entity The space object with all the properties which should be updated. The id and the version are required properties.
     * @return Space
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--update">Update Documentation</a>
     **/
    public Space update(SpaceUpdate entity) throws IOException {
        HttpResponse response = updateForHttpResponse(entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Space>() {
        });
    }

    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param entity The space object with all the properties which should be updated. The id and the version are required properties.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Space
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#space-service--update">Update Documentation</a>
     **/
    public Space update(SpaceUpdate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Space>() {
        });
    }

    public HttpResponse updateForHttpResponse(SpaceUpdate entity) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "entity", "update"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/update");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateForHttpResponse(InputStream entity, String mediaType) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "entity", "update"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/update");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateForHttpResponse(SpaceUpdate entity, Map<String, Object> params) throws IOException {
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "entity", "update"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/space/update");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
