package com.wallee.sdk;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;

import java.io.IOException;
import java.util.Map;

/**
* Default headers interceptor
*/
public class DefaultHeaders {

    private final Map<String, String> defaultHeaders;

    /**
    *
    * @param defaultHeaders default headers
    */
    public DefaultHeaders(Map<String, String> defaultHeaders) {
        this.defaultHeaders = defaultHeaders;
    }

    /**
    * Intercept given http request
    * @param request
    * @throws IOException
    */
    public void intercept(HttpRequest request) throws IOException {
        request.getHeaders().putAll(getDefaultHeaders());
        defaultHeaders.forEach((key, value) -> request.getHeaders().putIfAbsent(key, value));
    }

    private HttpHeaders getDefaultHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.put("x-meta-sdk-version", "6.0.0");
        headers.put("x-meta-sdk-language", "java");
        headers.put("x-meta-sdk-provider", "wallee");
        headers.put("x-meta-sdk-language-version", System.getProperty("java.version"));
        return headers;
    }
}