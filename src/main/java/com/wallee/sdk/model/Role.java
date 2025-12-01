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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.Permission;
import com.wallee.sdk.model.RoleState;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Role
 */
@JsonPropertyOrder({
  Role.JSON_PROPERTY_PERMISSIONS,
  Role.JSON_PROPERTY_NAME,
  Role.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Role.JSON_PROPERTY_ID,
  Role.JSON_PROPERTY_STATE,
  Role.JSON_PROPERTY_VERSION,
  Role.JSON_PROPERTY_ACCOUNT,
  Role.JSON_PROPERTY_TWO_FACTOR_REQUIRED
})

public class Role {
  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  @javax.annotation.Nullable
  private Set<Permission> permissions = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private RoleState state;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  @javax.annotation.Nullable
  private Account account;

  public static final String JSON_PROPERTY_TWO_FACTOR_REQUIRED = "twoFactorRequired";
  @javax.annotation.Nullable
  private Boolean twoFactorRequired;

  public Role() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Role(
    @JsonProperty(JSON_PROPERTY_PERMISSIONS) Set<Permission> permissions, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_TWO_FACTOR_REQUIRED) Boolean twoFactorRequired
  ) {
    this();
    this.permissions = permissions;
    this.name = name;
    this.plannedPurgeDate = plannedPurgeDate;
    this.id = id;
    this.version = version;
    this.twoFactorRequired = twoFactorRequired;
  }

  /**
   * The permissions granted to users with this role.
   * @return permissions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Permission> getPermissions() {
    return permissions;
  }



  /**
   * The name used to identify the role.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
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



  public Role state(@javax.annotation.Nullable RoleState state) {
    
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

  public RoleState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable RoleState state) {
    this.state = state;
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



  public Role account(@javax.annotation.Nullable Account account) {
    
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Account getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(@javax.annotation.Nullable Account account) {
    this.account = account;
  }

  /**
   * Whether users with this role are required to use two-factor authentication.
   * @return twoFactorRequired
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTwoFactorRequired() {
    return twoFactorRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.permissions, role.permissions) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.plannedPurgeDate, role.plannedPurgeDate) &&
        Objects.equals(this.id, role.id) &&
        Objects.equals(this.state, role.state) &&
        Objects.equals(this.version, role.version) &&
        Objects.equals(this.account, role.account) &&
        Objects.equals(this.twoFactorRequired, role.twoFactorRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, name, plannedPurgeDate, id, state, version, account, twoFactorRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    twoFactorRequired: ").append(toIndentedString(twoFactorRequired)).append("\n");
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

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      int i = 0;
      for (Permission _item : getPermissions()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%spermissions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `name` to the URL query string
    if (getName() != null) {
      for (String _key : getName().keySet()) {
        try {
          joiner.add(String.format("%sname%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getName().get(_key), URLEncoder.encode(String.valueOf(getName().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `account` to the URL query string
    if (getAccount() != null) {
      joiner.add(getAccount().toUrlQueryString(prefix + "account" + suffix));
    }

    // add `twoFactorRequired` to the URL query string
    if (getTwoFactorRequired() != null) {
      try {
        joiner.add(String.format("%stwoFactorRequired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTwoFactorRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

