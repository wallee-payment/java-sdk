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
import com.wallee.sdk.model.CreationEntityState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ApplicationUserCreate
 */
@JsonPropertyOrder({
  ApplicationUserCreate.JSON_PROPERTY_REQUEST_LIMIT,
  ApplicationUserCreate.JSON_PROPERTY_NAME,
  ApplicationUserCreate.JSON_PROPERTY_STATE,
  ApplicationUserCreate.JSON_PROPERTY_PRIMARY_ACCOUNT
})
@JsonTypeName("ApplicationUser.Create")

public class ApplicationUserCreate {
  public static final String JSON_PROPERTY_REQUEST_LIMIT = "requestLimit";
  @javax.annotation.Nullable
  private Long requestLimit;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_PRIMARY_ACCOUNT = "primaryAccount";
  @javax.annotation.Nonnull
  private Long primaryAccount;

  public ApplicationUserCreate() {
  }

  public ApplicationUserCreate requestLimit(@javax.annotation.Nullable Long requestLimit) {
    
    this.requestLimit = requestLimit;
    return this;
  }

  /**
   * The maximum number of API requests that are accepted every 2 minutes.
   * @return requestLimit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRequestLimit() {
    return requestLimit;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestLimit(@javax.annotation.Nullable Long requestLimit) {
    this.requestLimit = requestLimit;
  }

  public ApplicationUserCreate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the application user.
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

  public ApplicationUserCreate state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public ApplicationUserCreate primaryAccount(@javax.annotation.Nonnull Long primaryAccount) {
    
    this.primaryAccount = primaryAccount;
    return this;
  }

  /**
   * The primary account that the user belongs to.
   * @return primaryAccount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPrimaryAccount() {
    return primaryAccount;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrimaryAccount(@javax.annotation.Nonnull Long primaryAccount) {
    this.primaryAccount = primaryAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUserCreate applicationUserCreate = (ApplicationUserCreate) o;
    return Objects.equals(this.requestLimit, applicationUserCreate.requestLimit) &&
        Objects.equals(this.name, applicationUserCreate.name) &&
        Objects.equals(this.state, applicationUserCreate.state) &&
        Objects.equals(this.primaryAccount, applicationUserCreate.primaryAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestLimit, name, state, primaryAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUserCreate {\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
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

    // add `requestLimit` to the URL query string
    if (getRequestLimit() != null) {
      try {
        joiner.add(String.format("%srequestLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestLimit()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primaryAccount` to the URL query string
    if (getPrimaryAccount() != null) {
      try {
        joiner.add(String.format("%sprimaryAccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

