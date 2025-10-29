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
import com.wallee.sdk.model.AccountState;
import com.wallee.sdk.model.AccountType;
import com.wallee.sdk.model.Scope;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Account
 */
@JsonPropertyOrder({
  Account.JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE,
  Account.JSON_PROPERTY_DELETED_ON,
  Account.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Account.JSON_PROPERTY_ACTIVE,
  Account.JSON_PROPERTY_PARENT_ACCOUNT,
  Account.JSON_PROPERTY_TYPE,
  Account.JSON_PROPERTY_CREATED_ON,
  Account.JSON_PROPERTY_VERSION,
  Account.JSON_PROPERTY_DELETED_BY,
  Account.JSON_PROPERTY_RESTRICTED_ACTIVE,
  Account.JSON_PROPERTY_CREATED_BY,
  Account.JSON_PROPERTY_SCOPE,
  Account.JSON_PROPERTY_NAME,
  Account.JSON_PROPERTY_ID,
  Account.JSON_PROPERTY_STATE,
  Account.JSON_PROPERTY_SUBACCOUNT_LIMIT
})

public class Account {
  public static final String JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE = "activeOrRestrictedActive";
  private Boolean activeOrRestrictedActive;

  public static final String JSON_PROPERTY_DELETED_ON = "deletedOn";
  private OffsetDateTime deletedOn;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_PARENT_ACCOUNT = "parentAccount";
  private Account parentAccount;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AccountType type;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_DELETED_BY = "deletedBy";
  private Long deletedBy;

  public static final String JSON_PROPERTY_RESTRICTED_ACTIVE = "restrictedActive";
  private Boolean restrictedActive;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private Scope scope;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private AccountState state;

  public static final String JSON_PROPERTY_SUBACCOUNT_LIMIT = "subaccountLimit";
  private Long subaccountLimit;

  public Account() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public Account(
    @JsonProperty(JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE) Boolean activeOrRestrictedActive, 
    @JsonProperty(JSON_PROPERTY_DELETED_ON) OffsetDateTime deletedOn, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_ACTIVE) Boolean active, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_DELETED_BY) Long deletedBy, 
    @JsonProperty(JSON_PROPERTY_RESTRICTED_ACTIVE) Boolean restrictedActive, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_SUBACCOUNT_LIMIT) Long subaccountLimit
  ) {
    this();
    this.activeOrRestrictedActive = activeOrRestrictedActive;
    this.deletedOn = deletedOn;
    this.plannedPurgeDate = plannedPurgeDate;
    this.active = active;
    this.createdOn = createdOn;
    this.version = version;
    this.deletedBy = deletedBy;
    this.restrictedActive = restrictedActive;
    this.createdBy = createdBy;
    this.name = name;
    this.id = id;
    this.subaccountLimit = subaccountLimit;
  }

   /**
   * Whether this account and all its parent accounts are active or restricted active.
   * @return activeOrRestrictedActive
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveOrRestrictedActive() {
    return activeOrRestrictedActive;
  }



   /**
   * The date and time when the account was deleted.
   * @return deletedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeletedOn() {
    return deletedOn;
  }



   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * Whether this account and all its parent accounts are active.
   * @return active
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }



  public Account parentAccount(Account parentAccount) {
    
    this.parentAccount = parentAccount;
    return this;
  }

   /**
   * Get parentAccount
   * @return parentAccount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Account getParentAccount() {
    return parentAccount;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentAccount(Account parentAccount) {
    this.parentAccount = parentAccount;
  }

  public Account type(AccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(AccountType type) {
    this.type = type;
  }

   /**
   * The date and time when the account was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * The ID of a user the account was deleted by.
   * @return deletedBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeletedBy() {
    return deletedBy;
  }



   /**
   * Whether this account and all its parent accounts are active or restricted active. There is at least one account that is restricted active.
   * @return restrictedActive
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRestrictedActive() {
    return restrictedActive;
  }



   /**
   * The ID of the user the account was created by.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  public Account scope(Scope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Scope getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(Scope scope) {
    this.scope = scope;
  }

   /**
   * The name used to identify the account.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public Account state(AccountState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(AccountState state) {
    this.state = state;
  }

   /**
   * The number of sub-accounts that can be created within this account.
   * @return subaccountLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBACCOUNT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubaccountLimit() {
    return subaccountLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.activeOrRestrictedActive, account.activeOrRestrictedActive) &&
        Objects.equals(this.deletedOn, account.deletedOn) &&
        Objects.equals(this.plannedPurgeDate, account.plannedPurgeDate) &&
        Objects.equals(this.active, account.active) &&
        Objects.equals(this.parentAccount, account.parentAccount) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.createdOn, account.createdOn) &&
        Objects.equals(this.version, account.version) &&
        Objects.equals(this.deletedBy, account.deletedBy) &&
        Objects.equals(this.restrictedActive, account.restrictedActive) &&
        Objects.equals(this.createdBy, account.createdBy) &&
        Objects.equals(this.scope, account.scope) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.state, account.state) &&
        Objects.equals(this.subaccountLimit, account.subaccountLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeOrRestrictedActive, deletedOn, plannedPurgeDate, active, parentAccount, type, createdOn, version, deletedBy, restrictedActive, createdBy, scope, name, id, state, subaccountLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
    sb.append("    deletedOn: ").append(toIndentedString(deletedOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    restrictedActive: ").append(toIndentedString(restrictedActive)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subaccountLimit: ").append(toIndentedString(subaccountLimit)).append("\n");
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

    // add `activeOrRestrictedActive` to the URL query string
    if (getActiveOrRestrictedActive() != null) {
      try {
        joiner.add(String.format("%sactiveOrRestrictedActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActiveOrRestrictedActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deletedOn` to the URL query string
    if (getDeletedOn() != null) {
      try {
        joiner.add(String.format("%sdeletedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeletedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `active` to the URL query string
    if (getActive() != null) {
      try {
        joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parentAccount` to the URL query string
    if (getParentAccount() != null) {
      joiner.add(getParentAccount().toUrlQueryString(prefix + "parentAccount" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `deletedBy` to the URL query string
    if (getDeletedBy() != null) {
      try {
        joiner.add(String.format("%sdeletedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeletedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `restrictedActive` to the URL query string
    if (getRestrictedActive() != null) {
      try {
        joiner.add(String.format("%srestrictedActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRestrictedActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `scope` to the URL query string
    if (getScope() != null) {
      joiner.add(getScope().toUrlQueryString(prefix + "scope" + suffix));
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

    // add `subaccountLimit` to the URL query string
    if (getSubaccountLimit() != null) {
      try {
        joiner.add(String.format("%ssubaccountLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubaccountLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

