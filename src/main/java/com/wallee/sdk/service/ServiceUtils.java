package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;

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
}
