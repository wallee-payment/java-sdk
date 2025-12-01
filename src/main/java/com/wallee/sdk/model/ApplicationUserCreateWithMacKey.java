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
import com.wallee.sdk.model.UserType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ApplicationUserCreateWithMacKey
 */
@JsonPropertyOrder({
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_SCOPE,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_PLANNED_PURGE_DATE,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_ID,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_STATE,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_USER_TYPE,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_VERSION,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_REQUEST_LIMIT,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_NAME,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_PRIMARY_ACCOUNT,
  ApplicationUserCreateWithMacKey.JSON_PROPERTY_MAC_KEY
})
@JsonTypeName("ApplicationUser.CreateWithMacKey")

public class ApplicationUserCreateWithMacKey {
  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nullable
  private Long scope;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_USER_TYPE = "userType";
  @javax.annotation.Nullable
  private UserType userType;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_REQUEST_LIMIT = "requestLimit";
  @javax.annotation.Nullable
  private Long requestLimit;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PRIMARY_ACCOUNT = "primaryAccount";
  @javax.annotation.Nullable
  private Long primaryAccount;

  public static final String JSON_PROPERTY_MAC_KEY = "macKey";
  @javax.annotation.Nullable
  private String macKey;

  public ApplicationUserCreateWithMacKey() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ApplicationUserCreateWithMacKey(
    @JsonProperty(JSON_PROPERTY_SCOPE) Long scope, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_REQUEST_LIMIT) Long requestLimit, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT) Long primaryAccount, 
    @JsonProperty(JSON_PROPERTY_MAC_KEY) String macKey
  ) {
    this();
    this.scope = scope;
    this.plannedPurgeDate = plannedPurgeDate;
    this.id = id;
    this.version = version;
    this.requestLimit = requestLimit;
    this.name = name;
    this.primaryAccount = primaryAccount;
    this.macKey = macKey;
  }

  /**
   * The scope that the user belongs to.
   * @return scope
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getScope() {
    return scope;
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
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public ApplicationUserCreateWithMacKey state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public ApplicationUserCreateWithMacKey userType(@javax.annotation.Nullable UserType userType) {
    
    this.userType = userType;
    return this;
  }

  /**
   * Get userType
   * @return userType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserType getUserType() {
    return userType;
  }


  @JsonProperty(JSON_PROPERTY_USER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserType(@javax.annotation.Nullable UserType userType) {
    this.userType = userType;
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
   * The maximum number of API requests that are accepted every 2 minutes.
   * @return requestLimit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRequestLimit() {
    return requestLimit;
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



  /**
   * The primary account that the user belongs to.
   * @return primaryAccount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPrimaryAccount() {
    return primaryAccount;
  }



  /**
   * The user&#39;s authentication key securing requests. Only displayed a single time after the user has been created.
   * @return macKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMacKey() {
    return macKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUserCreateWithMacKey applicationUserCreateWithMacKey = (ApplicationUserCreateWithMacKey) o;
    return Objects.equals(this.scope, applicationUserCreateWithMacKey.scope) &&
        Objects.equals(this.plannedPurgeDate, applicationUserCreateWithMacKey.plannedPurgeDate) &&
        Objects.equals(this.id, applicationUserCreateWithMacKey.id) &&
        Objects.equals(this.state, applicationUserCreateWithMacKey.state) &&
        Objects.equals(this.userType, applicationUserCreateWithMacKey.userType) &&
        Objects.equals(this.version, applicationUserCreateWithMacKey.version) &&
        Objects.equals(this.requestLimit, applicationUserCreateWithMacKey.requestLimit) &&
        Objects.equals(this.name, applicationUserCreateWithMacKey.name) &&
        Objects.equals(this.primaryAccount, applicationUserCreateWithMacKey.primaryAccount) &&
        Objects.equals(this.macKey, applicationUserCreateWithMacKey.macKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, plannedPurgeDate, id, state, userType, version, requestLimit, name, primaryAccount, macKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUserCreateWithMacKey {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
    sb.append("    macKey: ").append(toIndentedString(macKey)).append("\n");
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

    // add `scope` to the URL query string
    if (getScope() != null) {
      try {
        joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScope()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `userType` to the URL query string
    if (getUserType() != null) {
      try {
        joiner.add(String.format("%suserType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `primaryAccount` to the URL query string
    if (getPrimaryAccount() != null) {
      try {
        joiner.add(String.format("%sprimaryAccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `macKey` to the URL query string
    if (getMacKey() != null) {
      try {
        joiner.add(String.format("%smacKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMacKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

