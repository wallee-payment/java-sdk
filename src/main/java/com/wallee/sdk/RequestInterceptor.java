package com.wallee.sdk;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;

import java.io.IOException;
import java.util.Map;

/**
* Common http request interceptor
*/
public class RequestInterceptor implements HttpExecuteInterceptor {
    private final DefaultHeaders headerModifier;
    private final Auth signer;

    /**
    *
    * @param userId user id
    * @param applicationKey application key
    * @param defaultHeaders default headers
    */
    public RequestInterceptor(long userId, String applicationKey, Map<String, String> defaultHeaders) {
        this.signer = new Auth(userId, applicationKey);
        this.headerModifier = new DefaultHeaders(defaultHeaders);
    }

    /**
    * Intercept given http request
    * @param request request
    * @throws IOException IOException
    */
    @Override
    public void intercept(HttpRequest request) throws IOException {
        headerModifier.intercept(request);
        signer.intercept(request);
    }
}
