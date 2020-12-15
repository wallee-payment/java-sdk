package com.wallee.sdk.service;

import com.wallee.sdk.ApiClient;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.MetricUsage;
import java.time.OffsetDateTime;
import com.wallee.sdk.model.ServerError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


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
    * @param spaceId 
    * @param start The start date from which on the consumed units should be returned from.
    * @param end The end date to which the consumed units should be returned to. The end date is not included in the result.
    * @return List&lt;MetricUsage&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#mertic-usage-service--calculate">Calculate Documentation</a>

    **/
    public List<MetricUsage> calculate(Long spaceId, OffsetDateTime start, OffsetDateTime end) throws IOException {
        HttpResponse response = calculateForHttpResponse(spaceId, start, end);
        String returnType = "List&lt;MetricUsage&gt;";
        if(returnType.equals("String")){
          return (List<MetricUsage>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<MetricUsage>>() {};
        return (List<MetricUsage>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Calculate
    * Calculates the consumed resources for the given space and time range.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param spaceId 
    * @param start The start date from which on the consumed units should be returned from.
    * @param end The end date to which the consumed units should be returned to. The end date is not included in the result.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;MetricUsage&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#mertic-usage-service--calculate">Calculate Documentation</a>

    **/
    public List<MetricUsage> calculate(Long spaceId, OffsetDateTime start, OffsetDateTime end, Map<String, Object> params) throws IOException {
        HttpResponse response = calculateForHttpResponse(spaceId, start, end, params);
        String returnType = "List&lt;MetricUsage&gt;";
        if(returnType.equals("String")){
            return (List<MetricUsage>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<MetricUsage>>() {};
        return (List<MetricUsage>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse calculateForHttpResponse(Long spaceId, OffsetDateTime start, OffsetDateTime end) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling calculate");
        }// verify the required parameter 'start' is set
        if (start == null) {
            throw new IllegalArgumentException("Missing the required parameter 'start' when calling calculate");
        }// verify the required parameter 'end' is set
        if (end == null) {
            throw new IllegalArgumentException("Missing the required parameter 'end' when calling calculate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/mertic-usage/calculate");
        if (spaceId != null) {
            String key = "spaceId";
            Object value = spaceId;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (start != null) {
            String key = "start";
            Object value = start;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (end != null) {
            String key = "end";
            Object value = end;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

    public HttpResponse calculateForHttpResponse(Long spaceId, OffsetDateTime start, OffsetDateTime end, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'spaceId' when calling calculate");
        }// verify the required parameter 'start' is set
        if (start == null) {
            throw new IllegalArgumentException("Missing the required parameter 'start' when calling calculate");
        }// verify the required parameter 'end' is set
        if (end == null) {
            throw new IllegalArgumentException("Missing the required parameter 'end' when calling calculate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/mertic-usage/calculate");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'start' to the map of query params
        allParams.put("start", start);
        // Add the required query param 'end' to the map of query params
        allParams.put("end", end);

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
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        httpRequest.setReadTimeout(ApiClient.READ_TIMEOUT);
        return httpRequest.execute();
    }

}
