/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.Permission;
import com.wallee.sdk.model.RestOAuthClientSecretCreated;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExtendedRestOAuthClient
 */
@JsonPropertyOrder({
  ExtendedRestOAuthClient.JSON_PROPERTY_LAST_UPDATED_BY,
  ExtendedRestOAuthClient.JSON_PROPERTY_CLIENT_ID,
  ExtendedRestOAuthClient.JSON_PROPERTY_PLANNED_PURGE_DATE,
  ExtendedRestOAuthClient.JSON_PROPERTY_DESCRIPTION,
  ExtendedRestOAuthClient.JSON_PROPERTY_OAUTH_SCOPES,
  ExtendedRestOAuthClient.JSON_PROPERTY_CREATED_ON,
  ExtendedRestOAuthClient.JSON_PROPERTY_VERSION,
  ExtendedRestOAuthClient.JSON_PROPERTY_REDIRECT_URLS,
  ExtendedRestOAuthClient.JSON_PROPERTY_CREATED_BY,
  ExtendedRestOAuthClient.JSON_PROPERTY_NAME,
  ExtendedRestOAuthClient.JSON_PROPERTY_ID,
  ExtendedRestOAuthClient.JSON_PROPERTY_STATE,
  ExtendedRestOAuthClient.JSON_PROPERTY_CONFIRMATION_REQUIRED,
  ExtendedRestOAuthClient.JSON_PROPERTY_SECRETS
})

public class ExtendedRestOAuthClient {
  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  @javax.annotation.Nullable
  private Long lastUpdatedBy;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  @javax.annotation.Nullable
  private String clientId;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_OAUTH_SCOPES = "oauthScopes";
  @javax.annotation.Nullable
  private Set<Permission> oauthScopes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_REDIRECT_URLS = "redirectUrls";
  @javax.annotation.Nullable
  private Set<String> redirectUrls = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_CONFIRMATION_REQUIRED = "confirmationRequired";
  @javax.annotation.Nullable
  private Boolean confirmationRequired;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  @javax.annotation.Nullable
  private Set<RestOAuthClientSecretCreated> secrets = new LinkedHashSet<>();

  public ExtendedRestOAuthClient() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ExtendedRestOAuthClient(
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY) Long lastUpdatedBy, 
    @JsonProperty(JSON_PROPERTY_CLIENT_ID) String clientId, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_OAUTH_SCOPES) Set<Permission> oauthScopes, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_REDIRECT_URLS) Set<String> redirectUrls, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CONFIRMATION_REQUIRED) Boolean confirmationRequired, 
    @JsonProperty(JSON_PROPERTY_SECRETS) Set<RestOAuthClientSecretCreated> secrets
  ) {
    this();
    this.lastUpdatedBy = lastUpdatedBy;
    this.clientId = clientId;
    this.plannedPurgeDate = plannedPurgeDate;
    this.description = description;
    this.oauthScopes = oauthScopes;
    this.createdOn = createdOn;
    this.version = version;
    this.redirectUrls = redirectUrls;
    this.createdBy = createdBy;
    this.name = name;
    this.id = id;
    this.confirmationRequired = confirmationRequired;
    this.secrets = secrets;
  }

  /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastUpdatedBy() {
    return lastUpdatedBy;
  }



  /**
   * Get clientId
   * @return clientId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }



  /**
   * Get oauthScopes
   * @return oauthScopes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Permission> getOauthScopes() {
    return oauthScopes;
  }



  /**
   * Get createdOn
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * Get redirectUrls
   * @return redirectUrls
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getRedirectUrls() {
    return redirectUrls;
  }



  /**
   * Get createdBy
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public ExtendedRestOAuthClient state(@javax.annotation.Nullable CreationEntityState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable CreationEntityState state) {
    this.state = state;
  }

  /**
   * Whether write requests sent through this client have to be confirmed by the user before they are executed.
   * @return confirmationRequired
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConfirmationRequired() {
    return confirmationRequired;
  }



  /**
   * Get secrets
   * @return secrets
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<RestOAuthClientSecretCreated> getSecrets() {
    return secrets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedRestOAuthClient extendedRestOAuthClient = (ExtendedRestOAuthClient) o;
    return Objects.equals(this.lastUpdatedBy, extendedRestOAuthClient.lastUpdatedBy) &&
        Objects.equals(this.clientId, extendedRestOAuthClient.clientId) &&
        Objects.equals(this.plannedPurgeDate, extendedRestOAuthClient.plannedPurgeDate) &&
        Objects.equals(this.description, extendedRestOAuthClient.description) &&
        Objects.equals(this.oauthScopes, extendedRestOAuthClient.oauthScopes) &&
        Objects.equals(this.createdOn, extendedRestOAuthClient.createdOn) &&
        Objects.equals(this.version, extendedRestOAuthClient.version) &&
        Objects.equals(this.redirectUrls, extendedRestOAuthClient.redirectUrls) &&
        Objects.equals(this.createdBy, extendedRestOAuthClient.createdBy) &&
        Objects.equals(this.name, extendedRestOAuthClient.name) &&
        Objects.equals(this.id, extendedRestOAuthClient.id) &&
        Objects.equals(this.state, extendedRestOAuthClient.state) &&
        Objects.equals(this.confirmationRequired, extendedRestOAuthClient.confirmationRequired) &&
        Objects.equals(this.secrets, extendedRestOAuthClient.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdatedBy, clientId, plannedPurgeDate, description, oauthScopes, createdOn, version, redirectUrls, createdBy, name, id, state, confirmationRequired, secrets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedRestOAuthClient {\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    oauthScopes: ").append(toIndentedString(oauthScopes)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    confirmationRequired: ").append(toIndentedString(confirmationRequired)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `lastUpdatedBy` to the URL query string
    if (getLastUpdatedBy() != null) {
      try {
        joiner.add(String.format("%slastUpdatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastUpdatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `clientId` to the URL query string
    if (getClientId() != null) {
      try {
        joiner.add(String.format("%sclientId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `oauthScopes` to the URL query string
    if (getOauthScopes() != null) {
      int i = 0;
      for (Permission _item : getOauthScopes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%soauthScopes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectUrls` to the URL query string
    if (getRedirectUrls() != null) {
      int i = 0;
      for (String _item : getRedirectUrls()) {
        try {
          joiner.add(String.format("%sredirectUrls%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `confirmationRequired` to the URL query string
    if (getConfirmationRequired() != null) {
      try {
        joiner.add(String.format("%sconfirmationRequired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfirmationRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `secrets` to the URL query string
    if (getSecrets() != null) {
      int i = 0;
      for (RestOAuthClientSecretCreated _item : getSecrets()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%ssecrets%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

