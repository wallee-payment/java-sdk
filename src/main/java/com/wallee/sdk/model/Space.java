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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SpaceAddress;
import com.wallee.sdk.model.TenantDatabase;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Space
 */
@JsonPropertyOrder({
  Space.JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE,
  Space.JSON_PROPERTY_DELETED_ON,
  Space.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Space.JSON_PROPERTY_ACTIVE,
  Space.JSON_PROPERTY_TIME_ZONE,
  Space.JSON_PROPERTY_CREATED_ON,
  Space.JSON_PROPERTY_PRIMARY_CURRENCY,
  Space.JSON_PROPERTY_VERSION,
  Space.JSON_PROPERTY_DELETED_BY,
  Space.JSON_PROPERTY_REQUEST_LIMIT,
  Space.JSON_PROPERTY_DATABASE,
  Space.JSON_PROPERTY_POSTAL_ADDRESS,
  Space.JSON_PROPERTY_RESTRICTED_ACTIVE,
  Space.JSON_PROPERTY_CREATED_BY,
  Space.JSON_PROPERTY_NAME,
  Space.JSON_PROPERTY_TECHNICAL_CONTACT_ADDRESSES,
  Space.JSON_PROPERTY_ID,
  Space.JSON_PROPERTY_STATE,
  Space.JSON_PROPERTY_ACCOUNT
})

public class Space {
  public static final String JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE = "activeOrRestrictedActive";
  @javax.annotation.Nullable
  private Boolean activeOrRestrictedActive;

  public static final String JSON_PROPERTY_DELETED_ON = "deletedOn";
  @javax.annotation.Nullable
  private OffsetDateTime deletedOn;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  @javax.annotation.Nullable
  private Boolean active;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_PRIMARY_CURRENCY = "primaryCurrency";
  @javax.annotation.Nullable
  private String primaryCurrency;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_DELETED_BY = "deletedBy";
  @javax.annotation.Nullable
  private Long deletedBy;

  public static final String JSON_PROPERTY_REQUEST_LIMIT = "requestLimit";
  @javax.annotation.Nullable
  private Long requestLimit;

  public static final String JSON_PROPERTY_DATABASE = "database";
  @javax.annotation.Nullable
  private TenantDatabase database;

  public static final String JSON_PROPERTY_POSTAL_ADDRESS = "postalAddress";
  @javax.annotation.Nullable
  private SpaceAddress postalAddress;

  public static final String JSON_PROPERTY_RESTRICTED_ACTIVE = "restrictedActive";
  @javax.annotation.Nullable
  private Boolean restrictedActive;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TECHNICAL_CONTACT_ADDRESSES = "technicalContactAddresses";
  @javax.annotation.Nullable
  private Set<String> technicalContactAddresses = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  @javax.annotation.Nullable
  private Account account;

  public Space() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Space(
    @JsonProperty(JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE) Boolean activeOrRestrictedActive, 
    @JsonProperty(JSON_PROPERTY_DELETED_ON) OffsetDateTime deletedOn, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_ACTIVE) Boolean active, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_PRIMARY_CURRENCY) String primaryCurrency, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_DELETED_BY) Long deletedBy, 
    @JsonProperty(JSON_PROPERTY_REQUEST_LIMIT) Long requestLimit, 
    @JsonProperty(JSON_PROPERTY_RESTRICTED_ACTIVE) Boolean restrictedActive, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_TECHNICAL_CONTACT_ADDRESSES) Set<String> technicalContactAddresses, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.activeOrRestrictedActive = activeOrRestrictedActive;
    this.deletedOn = deletedOn;
    this.plannedPurgeDate = plannedPurgeDate;
    this.active = active;
    this.timeZone = timeZone;
    this.createdOn = createdOn;
    this.primaryCurrency = primaryCurrency;
    this.version = version;
    this.deletedBy = deletedBy;
    this.requestLimit = requestLimit;
    this.restrictedActive = restrictedActive;
    this.createdBy = createdBy;
    this.name = name;
    this.technicalContactAddresses = technicalContactAddresses;
    this.id = id;
  }

  /**
   * Whether this space and all its parent accounts are active or restricted active.
   * @return activeOrRestrictedActive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_OR_RESTRICTED_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveOrRestrictedActive() {
    return activeOrRestrictedActive;
  }



  /**
   * The date and time when the space was deleted.
   * @return deletedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeletedOn() {
    return deletedOn;
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
   * Whether this space and all its parent accounts are active.
   * @return active
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }



  /**
   * The time zone that is used to schedule and run background processes. This does not affect the formatting of dates in the user interface.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



  /**
   * The date and time when the space was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * The currency that is used to display aggregated amounts in the space.
   * @return primaryCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryCurrency() {
    return primaryCurrency;
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
   * The ID of the user the space was deleted by.
   * @return deletedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeletedBy() {
    return deletedBy;
  }



  /**
   * The maximum number of API requests that are accepted within two minutes. This limit can only be changed with special privileges.
   * @return requestLimit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRequestLimit() {
    return requestLimit;
  }



  public Space database(@javax.annotation.Nullable TenantDatabase database) {
    
    this.database = database;
    return this;
  }

  /**
   * Get database
   * @return database
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantDatabase getDatabase() {
    return database;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabase(@javax.annotation.Nullable TenantDatabase database) {
    this.database = database;
  }

  public Space postalAddress(@javax.annotation.Nullable SpaceAddress postalAddress) {
    
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SpaceAddress getPostalAddress() {
    return postalAddress;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalAddress(@javax.annotation.Nullable SpaceAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  /**
   * Whether this space and all its parent accounts are active or restricted active. There is least one parent account that is restricted active.
   * @return restrictedActive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRestrictedActive() {
    return restrictedActive;
  }



  /**
   * The ID of the user the space was created by.
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  /**
   * The name used to identify the space.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  /**
   * The email address that will receive messages about technical issues and errors that occur in the space.
   * @return technicalContactAddresses
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TECHNICAL_CONTACT_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getTechnicalContactAddresses() {
    return technicalContactAddresses;
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



  public Space state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public Space account(@javax.annotation.Nullable Account account) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Space space = (Space) o;
    return Objects.equals(this.activeOrRestrictedActive, space.activeOrRestrictedActive) &&
        Objects.equals(this.deletedOn, space.deletedOn) &&
        Objects.equals(this.plannedPurgeDate, space.plannedPurgeDate) &&
        Objects.equals(this.active, space.active) &&
        Objects.equals(this.timeZone, space.timeZone) &&
        Objects.equals(this.createdOn, space.createdOn) &&
        Objects.equals(this.primaryCurrency, space.primaryCurrency) &&
        Objects.equals(this.version, space.version) &&
        Objects.equals(this.deletedBy, space.deletedBy) &&
        Objects.equals(this.requestLimit, space.requestLimit) &&
        Objects.equals(this.database, space.database) &&
        Objects.equals(this.postalAddress, space.postalAddress) &&
        Objects.equals(this.restrictedActive, space.restrictedActive) &&
        Objects.equals(this.createdBy, space.createdBy) &&
        Objects.equals(this.name, space.name) &&
        Objects.equals(this.technicalContactAddresses, space.technicalContactAddresses) &&
        Objects.equals(this.id, space.id) &&
        Objects.equals(this.state, space.state) &&
        Objects.equals(this.account, space.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeOrRestrictedActive, deletedOn, plannedPurgeDate, active, timeZone, createdOn, primaryCurrency, version, deletedBy, requestLimit, database, postalAddress, restrictedActive, createdBy, name, technicalContactAddresses, id, state, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Space {\n");
    sb.append("    activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
    sb.append("    deletedOn: ").append(toIndentedString(deletedOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    restrictedActive: ").append(toIndentedString(restrictedActive)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `primaryCurrency` to the URL query string
    if (getPrimaryCurrency() != null) {
      try {
        joiner.add(String.format("%sprimaryCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `requestLimit` to the URL query string
    if (getRequestLimit() != null) {
      try {
        joiner.add(String.format("%srequestLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `database` to the URL query string
    if (getDatabase() != null) {
      joiner.add(getDatabase().toUrlQueryString(prefix + "database" + suffix));
    }

    // add `postalAddress` to the URL query string
    if (getPostalAddress() != null) {
      joiner.add(getPostalAddress().toUrlQueryString(prefix + "postalAddress" + suffix));
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `technicalContactAddresses` to the URL query string
    if (getTechnicalContactAddresses() != null) {
      int i = 0;
      for (String _item : getTechnicalContactAddresses()) {
        try {
          joiner.add(String.format("%stechnicalContactAddresses%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
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

    // add `account` to the URL query string
    if (getAccount() != null) {
      joiner.add(getAccount().toUrlQueryString(prefix + "account" + suffix));
    }

    return joiner.toString();
  }

}

