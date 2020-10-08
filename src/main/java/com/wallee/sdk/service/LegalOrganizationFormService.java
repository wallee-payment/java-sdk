package com.wallee.sdk.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.LegalOrganizationForm;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LegalOrganizationFormService {
    private ApiClient apiClient;

    public LegalOrganizationFormService(ApiClient apiClient) {
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
     * @return List&lt;LegalOrganizationForm&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--all">All Documentation</a>
     **/
    public List<LegalOrganizationForm> all() throws IOException {
        HttpResponse response = allForHttpResponse();
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<LegalOrganizationForm>>() {
        });
    }

    /**
     * All
     * This operation returns all entities which are available.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;LegalOrganizationForm&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--all">All Documentation</a>
     **/
    public List<LegalOrganizationForm> all(Map<String, Object> params) throws IOException {
        HttpResponse response = allForHttpResponse(params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<LegalOrganizationForm>>() {
        });
    }

    public HttpResponse allForHttpResponse() throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/legal-organization-form/all");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse allForHttpResponse(Map<String, Object> params) throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/legal-organization-form/all");

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

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }


    /**
     * Find by Country
     * This operation returns all legal organization forms for a given country.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param code The country in ISO 3166-1 alpha-2 format, for which all legal organization forms should be returned.
     * @return List&lt;LegalOrganizationForm&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--country">Find by Country Documentation</a>
     **/
    public List<LegalOrganizationForm> country(String code) throws IOException {
        HttpResponse response = countryForHttpResponse(code);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<LegalOrganizationForm>>() {
        });
    }

    /**
     * Find by Country
     * This operation returns all legal organization forms for a given country.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param code   The country in ISO 3166-1 alpha-2 format, for which all legal organization forms should be returned.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;LegalOrganizationForm&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--country">Find by Country Documentation</a>
     **/
    public List<LegalOrganizationForm> country(String code, Map<String, Object> params) throws IOException {
        HttpResponse response = countryForHttpResponse(code, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<LegalOrganizationForm>>() {
        });
    }

    public HttpResponse countryForHttpResponse(String code) throws IOException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "code", "country"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/legal-organization-form/country");
        String key = "code";
        uriBuilder = uriBuilder.queryParam(key, code);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse countryForHttpResponse(String code, Map<String, Object> params) throws IOException {
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "code", "country"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/legal-organization-form/country");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'code' to the map of query params
        allParams.put("code", code);

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
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id The id of the legal organization form which should be returned.
     * @return LegalOrganizationForm
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--read">Read Documentation</a>
     **/
    public LegalOrganizationForm read(Long id) throws IOException {
        HttpResponse response = readForHttpResponse(id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<LegalOrganizationForm>() {
        });
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id     The id of the legal organization form which should be returned.
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return LegalOrganizationForm
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--read">Read Documentation</a>
     **/
    public LegalOrganizationForm read(Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<LegalOrganizationForm>() {
        });
    }

    public HttpResponse readForHttpResponse(Long id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "read"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/legal-organization-form/read");
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
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/legal-organization-form/read");

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


}
