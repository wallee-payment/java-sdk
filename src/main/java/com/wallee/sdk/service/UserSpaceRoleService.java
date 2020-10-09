package com.wallee.sdk.service;

import java.io.IOException;
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
import com.wallee.sdk.model.UserSpaceRole;


public class UserSpaceRoleService {
    private ApiClient apiClient;

    public UserSpaceRoleService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add Role
     * This operation grants the given role to the user in the given space.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param userId  The id of the user to whom the role is assigned.
     * @param spaceId The space to which the role is mapped.
     * @param roleId  The role which is mapped to the user and space.
     * @return UserSpaceRole
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-space-role-service--add-role">Add Role Documentation</a>
     **/
    public UserSpaceRole addRole(Long userId, Long spaceId, Long roleId) throws IOException {
        HttpResponse response = addRoleForHttpResponse(userId, spaceId, roleId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<UserSpaceRole>(){});
    }

    /**
     * Add Role
     * This operation grants the given role to the user in the given space.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param userId  The id of the user to whom the role is assigned.
     * @param spaceId The space to which the role is mapped.
     * @param roleId  The role which is mapped to the user and space.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return UserSpaceRole
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-space-role-service--add-role">Add Role Documentation</a>
     **/
    public UserSpaceRole addRole(Long userId, Long spaceId, Long roleId, Map<String, Object> params) throws IOException {
        HttpResponse response = addRoleForHttpResponse(userId, spaceId, roleId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<UserSpaceRole>(){});
    }

    public HttpResponse addRoleForHttpResponse(Long userId, Long spaceId, Long roleId) throws IOException {
        ServiceUtils.checkParam(userId == null, "userId", "addRole");
        ServiceUtils.checkParam(spaceId == null, "spaceId", "addRole");
        ServiceUtils.checkParam(roleId == null, "roleId", "addRole");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-space-role/addRole")
                .queryParam("userId", userId)
                .queryParam("spaceId", spaceId)
                .queryParam("roleId", roleId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse addRoleForHttpResponse(Long userId, Long spaceId, Long roleId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(userId == null, "userId", "addRole");
        ServiceUtils.checkParam(spaceId == null, "spaceId", "addRole");
        ServiceUtils.checkParam(roleId == null, "roleId", "addRole");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-space-role/addRole");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'userId' to the map of query params
        allParams.put("userId", userId);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'roleId' to the map of query params
        allParams.put("roleId", roleId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * List Roles
     * List all the roles that are assigned to the given user in the given space.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param userId  The id of the user to whom the role is assigned.
     * @param spaceId The space to which the role is mapped.
     * @return List&lt;UserSpaceRole&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-space-role-service--list">List Roles Documentation</a>
     **/
    public List<UserSpaceRole> list(Long userId, Long spaceId) throws IOException {
        HttpResponse response = listForHttpResponse(userId, spaceId);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<UserSpaceRole>>(){});
    }

    /**
     * List Roles
     * List all the roles that are assigned to the given user in the given space.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>409</b> - This status code indicates that there was a conflict with the current version of the data in the database and the provided data in the request.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param userId  The id of the user to whom the role is assigned.
     * @param spaceId The space to which the role is mapped.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;UserSpaceRole&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-space-role-service--list">List Roles Documentation</a>
     **/
    public List<UserSpaceRole> list(Long userId, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = listForHttpResponse(userId, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<UserSpaceRole>>(){});
    }

    public HttpResponse listForHttpResponse(Long userId, Long spaceId) throws IOException {
        ServiceUtils.checkParam(userId == null, "userId", "list");
        ServiceUtils.checkParam(spaceId == null, "spaceId", "list");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-space-role/list")
                .queryParam("userId", userId)
                .queryParam("spaceId", spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse listForHttpResponse(Long userId, Long spaceId, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(userId == null, "userId", "list");
        ServiceUtils.checkParam(spaceId == null, "spaceId", "list");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-space-role/list");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'userId' to the map of query params
        allParams.put("userId", userId);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Remove Role
     * This operation removes the specified user space role.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id The id of user space role which should be removed
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-space-role-service--remove-role">Remove Role Documentation</a>
     **/
    public void removeRole(Long id) throws IOException {
        removeRoleForHttpResponse(id);
    }

    /**
     * Remove Role
     * This operation removes the specified user space role.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param id     The id of user space role which should be removed
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#user-space-role-service--remove-role">Remove Role Documentation</a>
     **/
    public void removeRole(Long id, Map<String, Object> params) throws IOException {
        removeRoleForHttpResponse(id, params);
    }

    public HttpResponse removeRoleForHttpResponse(Long id) throws IOException {
        ServiceUtils.checkParam(id == null, "id", "removeRole");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-space-role/removeRole")
                .queryParam("id", id);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse removeRoleForHttpResponse(Long id, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(id == null, "id", "removeRole");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/user-space-role/removeRole");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'id' to the map of query params
        allParams.put("id", id);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
