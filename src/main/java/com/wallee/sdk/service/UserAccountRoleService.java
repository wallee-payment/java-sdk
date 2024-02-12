package com.wallee.sdk.service;

import static com.wallee.sdk.ErrorCode.*;

import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ErrorCode;
import com.wallee.sdk.exception.WalleeSdkException;
import com.wallee.sdk.util.URIBuilderUtil;
import com.wallee.sdk.StringUtil;

import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.UserAccountRole;


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



public class UserAccountRoleService {
    private ApiClient apiClient;

    public UserAccountRoleService(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must be non null");
    }

  /**
    * Add Role
    
    * This operation grants the role to the given user with in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @param roleId The role which is mapped to the user and account.
    * @param appliesOnSubaccount Whether the role applies only on subaccount.
    * @return UserAccountRole
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>

    **/
    public UserAccountRole addRole(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount) throws IOException {
        HttpResponse response = addRoleForHttpResponse(userId, accountId, roleId, appliesOnSubaccount);
        String returnType = "UserAccountRole";
        if(returnType.equals("String")){
          return (UserAccountRole) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<UserAccountRole>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (UserAccountRole)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add Role
    
    * This operation grants the role to the given user with in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @param roleId The role which is mapped to the user and account.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UserAccountRole
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--add-role">Add Role Documentation</a>

    **/
    public UserAccountRole addRole(Long userId, Long accountId, Long roleId, Map<String, Object> params) throws IOException {
        HttpResponse response = addRoleForHttpResponse(userId, accountId, roleId, params);
        String returnType = "UserAccountRole";
        if(returnType.equals("String")){
            return (UserAccountRole) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<UserAccountRole>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (UserAccountRole)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addRoleForHttpResponse(Long userId, Long accountId, Long roleId, Boolean appliesOnSubaccount) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling addRole");
        }
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling addRole");
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'roleId' when calling addRole");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/user-account-role/addRole");
        if (userId != null) {
            String key = "userId";
            Object value = userId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (accountId != null) {
            String key = "accountId";
            Object value = accountId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (roleId != null) {
            String key = "roleId";
            Object value = roleId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (appliesOnSubaccount != null) {
            String key = "appliesOnSubaccount";
            Object value = appliesOnSubaccount;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse addRoleForHttpResponse(Long userId, Long accountId, Long roleId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling addRole");
        }
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling addRole");
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'roleId' when calling addRole");
        }
                URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/user-account-role/addRole");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'userId' to the map of query params
        allParams.put("userId", userId);
        // Add the required query param 'accountId' to the map of query params
        allParams.put("accountId", accountId);
        // Add the required query param 'roleId' to the map of query params
        allParams.put("roleId", roleId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * List Roles
    
    * List all the roles that are assigned to the given user in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @return List&lt;UserAccountRole&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>

    **/
    public List<UserAccountRole> list(Long userId, Long accountId) throws IOException {
        HttpResponse response = listForHttpResponse(userId, accountId);
        String returnType = "List&lt;UserAccountRole&gt;";
        if(returnType.equals("String")){
          return (List<UserAccountRole>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<UserAccountRole>>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<UserAccountRole>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * List Roles
    
    * List all the roles that are assigned to the given user in the given account.
    * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param userId The id of the user to whom the role is assigned.
    * @param accountId The account to which the role is mapped.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return List&lt;UserAccountRole&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--list">List Roles Documentation</a>

    **/
    public List<UserAccountRole> list(Long userId, Long accountId, Map<String, Object> params) throws IOException {
        HttpResponse response = listForHttpResponse(userId, accountId, params);
        String returnType = "List&lt;UserAccountRole&gt;";
        if(returnType.equals("String")){
            return (List<UserAccountRole>) (Object) response.parseAsString();
        }
        TypeReference typeRef = new TypeReference<List<UserAccountRole>>() {};
        if (isNoBodyResponse(response)) {
            throw new WalleeSdkException(ErrorCode.ENTITY_NOT_FOUND, "Entity was not found for: " + typeRef.getType().getTypeName());
        }
        return (List<UserAccountRole>)apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse listForHttpResponse(Long userId, Long accountId) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling list");
        }
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling list");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/user-account-role/list");
        if (userId != null) {
            String key = "userId";
            Object value = userId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }
        if (accountId != null) {
            String key = "accountId";
            Object value = accountId;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse listForHttpResponse(Long userId, Long accountId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userId' when calling list");
        }
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accountId' when calling list");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/user-account-role/list");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'userId' to the map of query params
        allParams.put("userId", userId);
        // Add the required query param 'accountId' to the map of query params
        allParams.put("accountId", accountId);

        for (Map.Entry<String, Object> entryMap: allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();
            if (key != null && value != null) {
                uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
            }
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

  /**
    * Remove Role
    
    * This operation removes the specified user account role.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The id of user account role which should be removed
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>

    **/
    public void removeRole(Long id) throws IOException {
        removeRoleForHttpResponse(id);
    }

  /**
    * Remove Role
    
    * This operation removes the specified user account role.
    * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
    * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
    * @param id The id of user account role which should be removed
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    * For more information visit this link.
    * @see <a href="https://app-wallee.com/doc/api/web-service#user-account-role-service--remove-role">Remove Role Documentation</a>

    **/
    public void removeRole(Long id, Map<String, Object> params) throws IOException {
        removeRoleForHttpResponse(id, params);
    }

    public HttpResponse removeRoleForHttpResponse(Long id) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling removeRole");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/user-account-role/removeRole");
        if (id != null) {
            String key = "id";
            Object value = id;
            uriBuilder = URIBuilderUtil.applyQueryParam(uriBuilder, key, value);
        }

        GenericUrl genericUrl = new GenericUrl(URIBuilderUtil.build(uriBuilder));

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }

    public HttpResponse removeRoleForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new IllegalArgumentException("Missing the required parameter 'id' when calling removeRole");
        }
        URIBuilder uriBuilder = URIBuilderUtil.create(apiClient.getBasePath() + "/user-account-role/removeRole");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        HttpRequest httpRequest = apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content);
        
        
        int readTimeOut = apiClient.getReadTimeOut() * 1000;
        httpRequest.setReadTimeout(readTimeOut);
        return httpRequest.execute();
    }



    private boolean isNoBodyResponse(HttpResponse response) throws IOException {
        java.io.InputStream content = response.getContent();
        return content.available() == 0;
    }
}
