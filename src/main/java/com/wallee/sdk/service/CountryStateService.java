package com.wallee.sdk.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.RestCountryState;


public class CountryStateService {
    private ApiClient apiClient;

    public CountryStateService(ApiClient apiClient) {
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
     * This operation returns all states of all countries.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @return List&lt;RestCountryState&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#country-state-service--all">All Documentation</a>
     **/
    public List<RestCountryState> all() throws IOException {
        HttpResponse response = allForHttpResponse();
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<RestCountryState>>() {
        });
    }

    /**
     * All
     * This operation returns all states of all countries.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;RestCountryState&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#country-state-service--all">All Documentation</a>
     **/
    public List<RestCountryState> all(Map<String, Object> params) throws IOException {
        HttpResponse response = allForHttpResponse(params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<RestCountryState>>() {
        });
    }

    public HttpResponse allForHttpResponse() throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/country-state/all");

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse allForHttpResponse(Map<String, Object> params) throws IOException {
        return ServiceUtils.allForHttpResponse(params, apiClient, "/country-state/all");
    }


    /**
     * Find by Country
     * This operation returns all states for a given country.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param code The country code in ISO code two letter format for which all states should be returned.
     * @return List&lt;RestCountryState&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>
     **/
    public List<RestCountryState> country(String code) throws IOException {
        HttpResponse response = countryForHttpResponse(code);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<RestCountryState>>() {
        });
    }

    /**
     * Find by Country
     * This operation returns all states for a given country.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param code   The country code in ISO code two letter format for which all states should be returned.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;RestCountryState&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#country-state-service--country">Find by Country Documentation</a>
     **/
    public List<RestCountryState> country(String code, Map<String, Object> params) throws IOException {
        HttpResponse response = countryForHttpResponse(code, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<RestCountryState>>() {
        });
    }

    public HttpResponse countryForHttpResponse(String code) throws IOException {
        ServiceUtils.checkParam(code == null, "code", "country");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/country-state/country");
        String key = "code";
        uriBuilder = uriBuilder.queryParam(key, code);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse countryForHttpResponse(String code, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(code == null, "code", "country");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/country-state/country");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'code' to the map of query params
        allParams.put("code", code);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


}
