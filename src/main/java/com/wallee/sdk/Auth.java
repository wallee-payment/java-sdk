package com.wallee.sdk;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * Auth
 */
public class Auth {

    private long userId;
    private String applicationKey;

    /**
     * Auth
     * @param userId
     * @param applicationKey
     */
    public Auth(long userId, String applicationKey) {

        if (applicationKey == null || applicationKey.trim().isEmpty()) {
            throw new IllegalArgumentException("The application key cannot be empty or null.");
        }
        if (userId < 1) {
            throw new IllegalArgumentException("The user id is invalid.");
        }

        this.userId = userId;
        this.applicationKey = applicationKey;
    }

    /**
     * intercept request
     *
     * @param request
     * @throws IOException
     */
    public void intercept(HttpRequest request) throws IOException {
        Map<String, String> headers = this.getAuthHeaders(request.getRequestMethod(), request.getUrl().toString());
        HttpHeaders requestHeaders = new HttpHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            requestHeaders.set(entry.getKey(), entry.getValue());
        }
        request.getHeaders().putAll(requestHeaders);
    }

    /**
     * Get auth headers
     *
     * @param method
     * @param url
     * @return
     */
    private Map<String, String> getAuthHeaders(String method, String url) {
        Map<String, String> headers = new HashMap<>();
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);
        final String version = "1";
        String resourcePath = this.getPath(url);

        headers.put("x-mac-version", version);
        headers.put("x-mac-userid", Long.toString(this.userId));
        headers.put("x-mac-timestamp", timestamp);
        headers.put("x-mac-value", this.getSignature(version, method, resourcePath, timestamp));
        return headers;
    }

    /**
     * Get url path
     *
     * @param url full request URL
     * @return get url path
     */
    private String getPath(String url) {
        try {
            final URL urlObject = new URL(url);
            StringBuilder path = new StringBuilder(urlObject.getPath());
            String query = urlObject.getQuery();
            if (!(query == null || query.isEmpty())) {
                path.append("?").append(query);
            }
            return path.toString();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get signature
     *
     * @param version
     * @param method
     * @param resourcePath
     * @param timestamp
     * @return
     */
    private String getSignature(String version, String method, String resourcePath, String timestamp) {
        final String securedData = version + "|" + this.userId + "|" + timestamp + "|" + method.toUpperCase() + "|" + resourcePath;
        byte[] decodedSecret = Base64.getDecoder().decode(this.applicationKey);
        Mac mac = null;
        try {
            mac = Mac.getInstance("HmacSHA512");
            mac.init(new SecretKeySpec(decodedSecret, "HmacSHA512"));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException("The required HMAC algorithm (HmacSHA512) is not supported.", (Throwable) e);
        }
        byte[] bytes = mac.doFinal(securedData.getBytes(StandardCharsets.UTF_8));
        return new String(Base64.getEncoder().encode(bytes), StandardCharsets.UTF_8);
    }
}
