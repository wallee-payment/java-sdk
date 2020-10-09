package com.wallee.sdk.service;

import java.io.IOException;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;


public class TransactionLightboxService {
    private ApiClient apiClient;

    public TransactionLightboxService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build JavaScript URL
     * This operation creates the URL which can be used to embed the JavaScript for handling the Lightbox checkout flow.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction which should be returned.
     * @return String
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-lightbox-service--javascript-url">Build JavaScript URL Documentation</a>
     **/
    public String javascriptUrl(Long spaceId, Long id) throws IOException {
        HttpResponse response = javascriptUrlForHttpResponse(spaceId, id);
        return response.parseAsString();
    }

    /**
     * Build JavaScript URL
     * This operation creates the URL which can be used to embed the JavaScript for handling the Lightbox checkout flow.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the transaction which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return String
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#transaction-lightbox-service--javascript-url">Build JavaScript URL Documentation</a>
     **/
    public String javascriptUrl(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = javascriptUrlForHttpResponse(spaceId, id, params);
        return response.parseAsString();
    }

    public HttpResponse javascriptUrlForHttpResponse(Long spaceId, Long id) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "javascriptUrl");
        ServiceUtils.checkParam(id == null, "id", "javascriptUrl");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-lightbox/javascript-url")
                .queryParam("spaceId", spaceId)
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse javascriptUrlForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "javascriptUrl");
        ServiceUtils.checkParam(id == null, "id", "javascriptUrl");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/transaction-lightbox/javascript-url");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = ServiceUtils.getMapCopy(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


}
