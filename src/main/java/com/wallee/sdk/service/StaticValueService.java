package com.wallee.sdk.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.StaticValue;


public class StaticValueService {
    private ApiClient apiClient;

    public StaticValueService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * All
     * This operation returns all entities which are available.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @return List&lt;StaticValue&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#static-value-service--all">All Documentation</a>
     **/
    public List<StaticValue> all() throws IOException {
        HttpResponse response = allForHttpResponse();
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<StaticValue>>(){});
    }

    /**
     * All
     * This operation returns all entities which are available.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;StaticValue&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#static-value-service--all">All Documentation</a>
     **/
    public List<StaticValue> all(Map<String, Object> params) throws IOException {
        HttpResponse response = allForHttpResponse(params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<StaticValue>>(){});
    }

    public HttpResponse allForHttpResponse() throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/static-value-service/all");

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse allForHttpResponse(Map<String, Object> params) throws IOException {
        return ServiceUtils.allForHttpResponse(params, apiClient, "/static-value-service/all");
    }


    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id The id of the static value which should be returned.
     * @return StaticValue
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#static-value-service--read">Read Documentation</a>
     **/
    public StaticValue read(Long id) throws IOException {
        HttpResponse response = readForHttpResponse(id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<StaticValue>(){});
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id     The id of the static value which should be returned.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return StaticValue
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#static-value-service--read">Read Documentation</a>
     **/
    public StaticValue read(Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<StaticValue>(){});
    }

    public HttpResponse readForHttpResponse(Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(id, apiClient, "/static-value-service/read");
    }

    public HttpResponse readForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(id,  params, apiClient, "/static-value-service/read");
    }


}
