package com.wallee.sdk.service;

import static com.wallee.sdk.ErrorCode.*;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ErrorCode;
import com.wallee.sdk.exception.WalleeSdkException;
import com.wallee.sdk.util.URIBuilderUtil;
import com.wallee.sdk.StringUtil;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.WebhookEncryptionPublicKey;


import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.*;
import com.google.api.client.json.Json;

import org.apache.http.client.utils.URIBuilder;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import java.util.concurrent.ConcurrentHashMap;
import com.wallee.sdk.util.EncryptionUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;


public class WebhookEncryptionService {
    private final static Map<String, WebhookEncryptionPublicKey> cache = new ConcurrentHashMap<>();

    private ApiClient apiClient;

    public WebhookEncryptionService(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

  /**
    * Read
    
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The ID of the key version.
    * @return WebhookEncryptionPublicKey
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#webhook-encryption-service--read">Read Documentation</a>

    **/
    public WebhookEncryptionPublicKey read(String id) throws IOException {
        HttpResponse response = readForHttpResponse(id);
        String returnType = "WebhookEncryptionPublicKey";
        if(returnType.equals("String")){
          return (WebhookEncryptionPublicKey) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<WebhookEncryptionPublicKey>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (WebhookEncryptionPublicKey)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Read
    
    * Reads the entity with the given &#39;id&#39; and returns it.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The ID of the key version.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return WebhookEncryptionPublicKey
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service/v1#webhook-encryption-service--read">Read Documentation</a>

    **/
    public WebhookEncryptionPublicKey read(String id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(id, params);
        String returnType = "WebhookEncryptionPublicKey";
        if(returnType.equals("String")){
            return (WebhookEncryptionPublicKey) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<WebhookEncryptionPublicKey>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (WebhookEncryptionPublicKey)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse readForHttpResponse(String id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/webhook-encryption/read");
        if (id != null) {
            String key = "id";
            Object value = id;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse readForHttpResponse(String id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling read");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/webhook-encryption/read");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = null;
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content);
        httpRequest.getHeaders().setContentType("*/*");
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }


    /**
     * Verify webhook content
     *
     * @param signatureHeader Signature header 'X-Signature' value from the Http request
     * @param contentToVerify Raw webhook content in String format
     * @param encryptionProviderName Encryption provider name
     * @return true if webhook content body conforms with signature header
     */
    public boolean isContentValid(String signatureHeader, String contentToVerify, String encryptionProviderName) {
        String regex = "^algorithm=([a-zA-Z0-9]+),\\skeyId=([a-z0-9\\-]+),\\s{1}signature=([a-zA-Z0-9+\\/=]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(signatureHeader);
        if (matcher.matches()) {
            String signatureAlgorithm = matcher.group(1);
            String publicKeyId = matcher.group(2);
            String contentSignature = matcher.group(3);

            WebhookEncryptionPublicKey publicKey;
            if (cache.containsKey(publicKeyId)) {
                publicKey = cache.get(publicKeyId);
            } else {
                try {
                    publicKey = this.read(publicKeyId);
                } catch (IOException e) {
                    throw new WalleeSdkException(ErrorCode.WEBHOOK_ENCRYPTION_GENERAL_ERROR,
                        "Could not retrieve public key with ID: " + publicKeyId);
                } catch (WalleeSdkException e) {
                    if (e.getCode() == ENTITY_NOT_FOUND) {
                        throw new WalleeSdkException(
                            ErrorCode.WEBHOOK_ENCRYPTION_PUBLIC_KEY_UNKNOWN,
                            "Unknown public key with ID: " + publicKeyId);
                    }
                    throw e;
                }
                cache.put(publicKey.getId(), publicKey);
            }
            return EncryptionUtil.isContentValid(contentToVerify, contentSignature, publicKey, encryptionProviderName, signatureAlgorithm);
        } else {
            throw new WalleeSdkException(WEBHOOK_ENCRYPTION_SIGNATURE_HEADER_INVALID, "Invalid webhook signature header. Expected format: 'algorithm=<algorithm>, keyId=<keyId>, signature=<signature>'");
        }
    }

    /**
     * Verify webhook content
     * <p>
     * Uses BouncyCastle as encryption provider.
     * <p>
     * Important: this method updates list of Security providers:
     * <p>
     *   <code>Security.addProvider(new BouncyCastleProvider())</code>
     *
     * @param signatureHeader Signature header 'X-Signature' value from the Http request
     * @param contentToVerify Raw webhook content in String format
     * @return true if webhook content body conforms with signature header
     */
    public boolean isContentValid(String signatureHeader, String contentToVerify) {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
        return isContentValid(signatureHeader, contentToVerify, BouncyCastleProvider.PROVIDER_NAME);
    }

    private boolean isNoBodyResponse(HttpResponse response) throws IOException {
        java.io.InputStream content = response.getContent();
        return content.available() == 0;
    }
}
