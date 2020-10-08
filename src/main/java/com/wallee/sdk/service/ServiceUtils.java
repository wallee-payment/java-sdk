package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.json.Json;
import com.wallee.sdk.ApiClient;

public class ServiceUtils {

  public static final String MISSING_PARAM_1_WHEN_CALLING_2 = "Missing the required parameter '%s' when calling %s";

  static HttpResponse getHttpResponse(InputStream filter, String mediaType, String url, ApiClient apiClient)
    throws IOException {
    GenericUrl genericUrl = new GenericUrl(url);

    HttpContent content;
    if (filter == null) {
      content = apiClient.new JacksonJsonHttpContent(null);
    } else {
      String type = mediaType == null ? Json.MEDIA_TYPE : mediaType;
      content = new InputStreamContent(type, filter);
    }
    return apiClient
      .getHttpRequestFactory()
      .buildRequest(HttpMethods.POST, genericUrl, content)
      .execute();
  }

  public static HttpResponse readForHttpResponse(Long id, Map<String, Object> params, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "read"));
    }
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

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

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

  public static HttpResponse readForHttpResponse(Long id, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "id", "read"));
    }
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);
    String key = "id";
    uriBuilder = uriBuilder.queryParam(key, id);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

  public static HttpResponse allForHttpResponse(Map<String, Object> params, ApiClient apiClient, String url) throws IOException {

    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

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

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

}
