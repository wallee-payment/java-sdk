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
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AbstractOAuthClientUpdate
 */
@JsonPropertyOrder({
  AbstractOAuthClientUpdate.JSON_PROPERTY_LAST_UPDATED_BY,
  AbstractOAuthClientUpdate.JSON_PROPERTY_NAME,
  AbstractOAuthClientUpdate.JSON_PROPERTY_DESCRIPTION,
  AbstractOAuthClientUpdate.JSON_PROPERTY_OAUTH_SCOPES,
  AbstractOAuthClientUpdate.JSON_PROPERTY_STATE,
  AbstractOAuthClientUpdate.JSON_PROPERTY_CONFIRMATION_REQUIRED,
  AbstractOAuthClientUpdate.JSON_PROPERTY_REDIRECT_URLS
})
@JsonTypeName("Abstract.OAuthClient.Update")

public class AbstractOAuthClientUpdate {
  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  @javax.annotation.Nullable
  private Long lastUpdatedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_OAUTH_SCOPES = "oauthScopes";
  @javax.annotation.Nullable
  private Set<Permission> oauthScopes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_CONFIRMATION_REQUIRED = "confirmationRequired";
  @javax.annotation.Nullable
  private Boolean confirmationRequired;

  public static final String JSON_PROPERTY_REDIRECT_URLS = "redirectUrls";
  @javax.annotation.Nullable
  private Set<String> redirectUrls = new LinkedHashSet<>();

  public AbstractOAuthClientUpdate() {
  }

  public AbstractOAuthClientUpdate lastUpdatedBy(@javax.annotation.Nullable Long lastUpdatedBy) {
    
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
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


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedBy(@javax.annotation.Nullable Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public AbstractOAuthClientUpdate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
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


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public AbstractOAuthClientUpdate description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
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


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public AbstractOAuthClientUpdate oauthScopes(@javax.annotation.Nullable Set<Permission> oauthScopes) {
    
    this.oauthScopes = oauthScopes;
    return this;
  }

  public AbstractOAuthClientUpdate addOauthScopesItem(Permission oauthScopesItem) {
    if (this.oauthScopes == null) {
      this.oauthScopes = new LinkedHashSet<>();
    }
    this.oauthScopes.add(oauthScopesItem);
    return this;
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


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_OAUTH_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthScopes(@javax.annotation.Nullable Set<Permission> oauthScopes) {
    this.oauthScopes = oauthScopes;
  }

  public AbstractOAuthClientUpdate state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public AbstractOAuthClientUpdate confirmationRequired(@javax.annotation.Nullable Boolean confirmationRequired) {
    
    this.confirmationRequired = confirmationRequired;
    return this;
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


  @JsonProperty(JSON_PROPERTY_CONFIRMATION_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmationRequired(@javax.annotation.Nullable Boolean confirmationRequired) {
    this.confirmationRequired = confirmationRequired;
  }

  public AbstractOAuthClientUpdate redirectUrls(@javax.annotation.Nullable Set<String> redirectUrls) {
    
    this.redirectUrls = redirectUrls;
    return this;
  }

  public AbstractOAuthClientUpdate addRedirectUrlsItem(String redirectUrlsItem) {
    if (this.redirectUrls == null) {
      this.redirectUrls = new LinkedHashSet<>();
    }
    this.redirectUrls.add(redirectUrlsItem);
    return this;
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


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_REDIRECT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectUrls(@javax.annotation.Nullable Set<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractOAuthClientUpdate abstractOAuthClientUpdate = (AbstractOAuthClientUpdate) o;
    return Objects.equals(this.lastUpdatedBy, abstractOAuthClientUpdate.lastUpdatedBy) &&
        Objects.equals(this.name, abstractOAuthClientUpdate.name) &&
        Objects.equals(this.description, abstractOAuthClientUpdate.description) &&
        Objects.equals(this.oauthScopes, abstractOAuthClientUpdate.oauthScopes) &&
        Objects.equals(this.state, abstractOAuthClientUpdate.state) &&
        Objects.equals(this.confirmationRequired, abstractOAuthClientUpdate.confirmationRequired) &&
        Objects.equals(this.redirectUrls, abstractOAuthClientUpdate.redirectUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdatedBy, name, description, oauthScopes, state, confirmationRequired, redirectUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractOAuthClientUpdate {\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    oauthScopes: ").append(toIndentedString(oauthScopes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    confirmationRequired: ").append(toIndentedString(confirmationRequired)).append("\n");
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

