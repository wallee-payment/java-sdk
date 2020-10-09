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
import com.wallee.sdk.model.UpsertableEntity;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;

public class ServiceUtils {

  public static final String MISSING_PARAM_1_WHEN_CALLING_2 = "Missing the required parameter '%s' when calling %s";

  private ServiceUtils() {}

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
    checkParam(id == null, "id", "read");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    // Copy the params argument if present, to allow passing in immutable maps
    Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
    // Add the required query param 'id' to the map of query params
    allParams.put("id", id);

    uriBuilder = addParamToUriBuilder(allParams, uriBuilder);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

  public static HttpResponse readForHttpResponse(Long id, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'id' is set
    checkParam(id == null, "id", "read");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url)
                                      .queryParam("id", id);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

  public static HttpResponse allForHttpResponse(Map<String, Object> params, ApiClient apiClient, String url) throws IOException {

    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    // Copy the params argument if present, to allow passing in immutable maps
    Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);

    uriBuilder = addParamToUriBuilder(allParams, uriBuilder);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

  public static HttpResponse deleteForHttpResponse(Long id, Map<String, Object> params, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'id' is set
    checkParam(id == null, "id", "delete");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    // Copy the params argument if present, to allow passing in immutable maps
    Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);

    uriBuilder = addParamToUriBuilder(allParams, uriBuilder);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    HttpContent content = apiClient.new JacksonJsonHttpContent(id);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }

  public static HttpResponse deleteForHttpResponse(Long spaceId, Long id, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "delete");
    checkParam(id == null, "id", "delete");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url)
                                      .queryParam("spaceId", spaceId)
                                      .queryParam("id", id);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    HttpContent content = apiClient.new JacksonJsonHttpContent(id);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }

  public static HttpResponse deleteForHttpResponse(Long id, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'id' is set
    checkParam(id == null, "id", "delete");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    HttpContent content = apiClient.new JacksonJsonHttpContent(id);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }

  public static HttpResponse deleteForHttpResponse(InputStream id, String mediaType, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'id' is set
    checkParam(id == null, "id", "delete");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    return ServiceUtils.getHttpResponse(id, mediaType, uriBuilder, apiClient);
  }

  public static HttpResponse deleteForHttpResponse(Long spaceId, InputStream id, String mediaType, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "delete");
    checkParam(id == null, "id", "delete");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url)
                                      .queryParam("spaceId", spaceId);

    return ServiceUtils.getHttpResponse(id, mediaType, uriBuilder, apiClient);
  }

  public static void checkParam(boolean test, String id2, String delete) {
    if (test) {
      throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, id2, delete));
    }
  }

  public static HttpResponse deleteForHttpResponse(Long spaceId, Long id, Map<String, Object> params, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "delete");
    checkParam(id == null, "id", "delete");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    // Copy the params argument if present, to allow passing in immutable maps
    Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
    // Add the required query param 'spaceId' to the map of query params
    allParams.put("spaceId", spaceId);

    uriBuilder = addParamToUriBuilder(allParams, uriBuilder);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    HttpContent content = apiClient.new JacksonJsonHttpContent(id);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }

  public static HttpResponse createForHttpResponse(Long spaceId, InputStream entity, String mediaType, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "create");
    checkParam(entity == null, "entity", "create");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url)
                                      .queryParam("spaceId", spaceId);

    return ServiceUtils.getHttpResponse(entity, mediaType, uriBuilder, apiClient);
  }

  public static HttpResponse createForHttpResponse(Long spaceId, UpsertableEntity entity, Map<String, Object> params, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "create");
    checkParam(entity == null, "entity", "create");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    // Copy the params argument if present, to allow passing in immutable maps
    Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
    // Add the required query param 'spaceId' to the map of query params
    allParams.put("spaceId", spaceId);

    uriBuilder = addParamToUriBuilder(allParams, uriBuilder);

    return ServiceUtils.getHttpResponse(entity, uriBuilder, apiClient);
  }

  public static HttpResponse createForHttpResponse(Long spaceId, UpsertableEntity entity, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "create");
    checkParam(entity == null, "entity", "create");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url)
                                      .queryParam("spaceId", spaceId);

    return ServiceUtils.getHttpResponse(entity, uriBuilder, apiClient);
  }

  public static HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter, boolean isFilterMandatory, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "count");
    checkParam(isFilterMandatory && filter == null, "filter", "count");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url)
                                      .queryParam("spaceId", spaceId);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }

  public static HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType, boolean isFilterMandatory, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "count");
    checkParam(isFilterMandatory && filter == null, "filter", "count");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/charge-attempt/count")
                                      .queryParam("spaceId", spaceId);

    return ServiceUtils.getHttpResponse(filter, mediaType, uriBuilder.build().toString(), apiClient);
  }

  public static HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "count");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    // Copy the params argument if present, to allow passing in immutable maps
    Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
    // Add the required query param 'spaceId' to the map of query params
    allParams.put("spaceId", spaceId);

    uriBuilder = addParamToUriBuilder(allParams, uriBuilder);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }

  public static HttpResponse readForHttpResponse(Long spaceId, Long id, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "read");
    checkParam(id == null, "id", "read");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url)
                                      .queryParam("spaceId", spaceId)
                                      .queryParam("id", id);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

  public static HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params, ApiClient apiClient, String url) throws IOException {
    // verify the required parameter 'spaceId' is set
    checkParam(spaceId == null, "spaceId", "read");
    checkParam(id == null, "id", "read");
    UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + url);

    // Copy the params argument if present, to allow passing in immutable maps
    Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
    // Add the required query param 'spaceId' to the map of query params
    allParams.put("spaceId", spaceId);
    // Add the required query param 'id' to the map of query params
    allParams.put("id", id);

    uriBuilder = addParamToUriBuilder(allParams, uriBuilder);

    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
  }

  static UriBuilder addParamToUriBuilder(Map<String, Object> allParams, UriBuilder uriBuilder) {
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
      return uriBuilder;
  }

  static HttpResponse getHttpResponse(InputStream entity, String mediaType, UriBuilder uriBuilder, ApiClient apiClient) throws IOException {
    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());
    HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, entity);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }

  static HttpResponse getHttpResponse(UpsertableEntity entity, UriBuilder uriBuilder, ApiClient apiClient) throws IOException {
    GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());
    HttpContent content = apiClient.new JacksonJsonHttpContent(entity);
    return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
  }
}
