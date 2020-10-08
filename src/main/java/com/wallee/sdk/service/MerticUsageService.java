package com.wallee.sdk.service;

import java.io.IOException;
import java.time.OffsetDateTime;
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
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.MetricUsage;


public class MerticUsageService {
    private ApiClient apiClient;

    public MerticUsageService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Calculate
     * Calculates the consumed resources for the given space and time range.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param start   The start date from which on the consumed units should be returned from.
     * @param end     The end date to which the consumed units should be returned to. The end date is not included in the result.
     * @return List&lt;MetricUsage&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#mertic-usage-service--calculate">Calculate Documentation</a>
     **/
    public List<MetricUsage> calculate(Long spaceId, OffsetDateTime start, OffsetDateTime end) throws IOException {
        HttpResponse response = calculateForHttpResponse(spaceId, start, end);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<MetricUsage>>() {
        });
    }

    /**
     * Calculate
     * Calculates the consumed resources for the given space and time range.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param start   The start date from which on the consumed units should be returned from.
     * @param end     The end date to which the consumed units should be returned to. The end date is not included in the result.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;MetricUsage&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#mertic-usage-service--calculate">Calculate Documentation</a>
     **/
    public List<MetricUsage> calculate(Long spaceId, OffsetDateTime start, OffsetDateTime end, Map<String, Object> params) throws IOException {
        HttpResponse response = calculateForHttpResponse(spaceId, start, end, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<MetricUsage>>() {
        });
    }

    public HttpResponse calculateForHttpResponse(Long spaceId, OffsetDateTime start, OffsetDateTime end) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "calculate"));
        }// verify the required parameter 'start' is set
        if (start == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "start", "calculate"));
        }// verify the required parameter 'end' is set
        if (end == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "end", "calculate"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/mertic-usage/calculate");
        {
            String key = "spaceId";
            uriBuilder = uriBuilder.queryParam(key, spaceId);
        }
        {
            String key = "start";
            uriBuilder = uriBuilder.queryParam(key, start);
        }
        String key = "end";
        uriBuilder = uriBuilder.queryParam(key, end);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse calculateForHttpResponse(Long spaceId, OffsetDateTime start, OffsetDateTime end, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "calculate"));
        }// verify the required parameter 'start' is set
        if (start == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "start", "calculate"));
        }// verify the required parameter 'end' is set
        if (end == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "end", "calculate"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/mertic-usage/calculate");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'start' to the map of query params
        allParams.put("start", start);
        // Add the required query param 'end' to the map of query params
        allParams.put("end", end);

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
