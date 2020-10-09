package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
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
import com.wallee.sdk.model.SubscriptionProductComponentGroup;
import com.wallee.sdk.model.SubscriptionProductComponentGroupUpdate;


public class SubscriptionProductComponentGroupService {
    private ApiClient apiClient;

    public SubscriptionProductComponentGroupService(ApiClient apiClient) {
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
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--count">Count Documentation</a>
     **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
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
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, false, apiClient, "/subscription-product-component-group/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, mediaType, false, apiClient, "/subscription-product-component-group/count");
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        return ServiceUtils.countForHttpResponse(filter, spaceId, params, apiClient, "/subscription-product-component-group/count");
    }


    /**
     * Create
     * Creates the entity with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The product component group object with the properties which should be created.
     * @return SubscriptionProductComponentGroup
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--create">Create Documentation</a>
     **/
    public SubscriptionProductComponentGroup create(Long spaceId, SubscriptionProductComponentGroupUpdate entity) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionProductComponentGroup>(){});
    }

    /**
     * Create
     * Creates the entity with the given properties.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The product component group object with the properties which should be created.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionProductComponentGroup
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--create">Create Documentation</a>
     **/
    public SubscriptionProductComponentGroup create(Long spaceId, SubscriptionProductComponentGroupUpdate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionProductComponentGroup>(){});
    }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionProductComponentGroupUpdate entity) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, apiClient, "/subscription-product-component-group/create");
    }

    public HttpResponse createForHttpResponse(Long spaceId, InputStream entity, String mediaType) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, mediaType, apiClient, "/subscription-product-component-group/create");
    }

    public HttpResponse createForHttpResponse(Long spaceId, SubscriptionProductComponentGroupUpdate entity, Map<String, Object> params) throws IOException {
        return ServiceUtils.createForHttpResponse(spaceId, entity, params, apiClient, "/subscription-product-component-group/create");
    }


    /**
     * Delete
     * Deletes the entity with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--delete">Delete Documentation</a>
     **/
    public void delete(Long spaceId, Long id) throws IOException {
        deleteForHttpResponse(spaceId, id);
    }

    /**
     * Delete
     * Deletes the entity with the given id.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--delete">Delete Documentation</a>
     **/
    public void delete(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        deleteForHttpResponse(spaceId, id, params);
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, apiClient, "/subscription-product-component-group/delete");
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, InputStream id, String mediaType) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, mediaType, apiClient, "/subscription-product-component-group/delete");
    }

    public HttpResponse deleteForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.deleteForHttpResponse(spaceId, id, params, apiClient, "/subscription-product-component-group/delete");
    }


    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the product component group which should be returned.
     * @return SubscriptionProductComponentGroup
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--read">Read Documentation</a>
     **/
    public SubscriptionProductComponentGroup read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionProductComponentGroup>(){});
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the product component group which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionProductComponentGroup
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--read">Read Documentation</a>
     **/
    public SubscriptionProductComponentGroup read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionProductComponentGroup>(){});
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/subscription-product-component-group/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/subscription-product-component-group/read");
    }


    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the product component groups which are returned by the search.
     * @return List&lt;SubscriptionProductComponentGroup&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--search">Search Documentation</a>
     **/
    public List<SubscriptionProductComponentGroup> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<SubscriptionProductComponentGroup>>(){});
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the product component groups which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;SubscriptionProductComponentGroup&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--search">Search Documentation</a>
     **/
    public List<SubscriptionProductComponentGroup> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<SubscriptionProductComponentGroup>>(){});
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription-product-component-group/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription-product-component-group/search")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(query, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription-product-component-group/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(query, uriBuilder, apiClient);
    }


    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The product component group object with all the properties which should be updated. The id and the version are required properties.
     * @return SubscriptionProductComponentGroup
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--update">Update Documentation</a>
     **/
    public SubscriptionProductComponentGroup update(Long spaceId, SubscriptionProductComponentGroupUpdate entity) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionProductComponentGroup>(){});
    }

    /**
     * Update
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param entity  The product component group object with all the properties which should be updated. The id and the version are required properties.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return SubscriptionProductComponentGroup
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-product-component-group-service--update">Update Documentation</a>
     **/
    public SubscriptionProductComponentGroup update(Long spaceId, SubscriptionProductComponentGroupUpdate entity, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, entity, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<SubscriptionProductComponentGroup>(){});
    }

    public HttpResponse updateForHttpResponse(Long spaceId, SubscriptionProductComponentGroupUpdate entity) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription-product-component-group/update")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(entity, uriBuilder, apiClient);
    }

    public HttpResponse updateForHttpResponse(Long spaceId, InputStream entity, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription-product-component-group/update")
                .queryParam("spaceId", spaceId);

        return ServiceUtils.getHttpResponse(entity, mediaType, uriBuilder, apiClient);
    }

    public HttpResponse updateForHttpResponse(Long spaceId, SubscriptionProductComponentGroupUpdate entity, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "update");
        ServiceUtils.checkParam(entity == null, "entity", "update");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/subscription-product-component-group/update");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        return ServiceUtils.getHttpResponse(entity, uriBuilder, apiClient);
    }


}
