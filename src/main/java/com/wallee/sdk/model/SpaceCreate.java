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
import com.wallee.sdk.model.SpaceAddressCreate;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SpaceCreate
 */
@JsonPropertyOrder({
  SpaceCreate.JSON_PROPERTY_REQUEST_LIMIT,
  SpaceCreate.JSON_PROPERTY_POSTAL_ADDRESS,
  SpaceCreate.JSON_PROPERTY_NAME,
  SpaceCreate.JSON_PROPERTY_TECHNICAL_CONTACT_ADDRESSES,
  SpaceCreate.JSON_PROPERTY_TIME_ZONE,
  SpaceCreate.JSON_PROPERTY_STATE,
  SpaceCreate.JSON_PROPERTY_PRIMARY_CURRENCY,
  SpaceCreate.JSON_PROPERTY_DATABASE,
  SpaceCreate.JSON_PROPERTY_ACCOUNT
})
@JsonTypeName("Space.Create")

public class SpaceCreate {
  public static final String JSON_PROPERTY_REQUEST_LIMIT = "requestLimit";
  @javax.annotation.Nullable
  private Long requestLimit;

  public static final String JSON_PROPERTY_POSTAL_ADDRESS = "postalAddress";
  @javax.annotation.Nullable
  private SpaceAddressCreate postalAddress;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TECHNICAL_CONTACT_ADDRESSES = "technicalContactAddresses";
  @javax.annotation.Nullable
  private Set<String> technicalContactAddresses = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_PRIMARY_CURRENCY = "primaryCurrency";
  @javax.annotation.Nullable
  private String primaryCurrency;

  public static final String JSON_PROPERTY_DATABASE = "database";
  @javax.annotation.Nullable
  private Long database;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  @javax.annotation.Nonnull
  private Long account;

  public SpaceCreate() {
  }

  public SpaceCreate requestLimit(@javax.annotation.Nullable Long requestLimit) {
    
    this.requestLimit = requestLimit;
    return this;
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


  @JsonProperty(JSON_PROPERTY_REQUEST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestLimit(@javax.annotation.Nullable Long requestLimit) {
    this.requestLimit = requestLimit;
  }

  public SpaceCreate postalAddress(@javax.annotation.Nullable SpaceAddressCreate postalAddress) {
    
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

  public SpaceAddressCreate getPostalAddress() {
    return postalAddress;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalAddress(@javax.annotation.Nullable SpaceAddressCreate postalAddress) {
    this.postalAddress = postalAddress;
  }

  public SpaceCreate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
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


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public SpaceCreate technicalContactAddresses(@javax.annotation.Nullable Set<String> technicalContactAddresses) {
    
    this.technicalContactAddresses = technicalContactAddresses;
    return this;
  }

  public SpaceCreate addTechnicalContactAddressesItem(String technicalContactAddressesItem) {
    if (this.technicalContactAddresses == null) {
      this.technicalContactAddresses = new LinkedHashSet<>();
    }
    this.technicalContactAddresses.add(technicalContactAddressesItem);
    return this;
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


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TECHNICAL_CONTACT_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTechnicalContactAddresses(@javax.annotation.Nullable Set<String> technicalContactAddresses) {
    this.technicalContactAddresses = technicalContactAddresses;
  }

  public SpaceCreate timeZone(@javax.annotation.Nullable String timeZone) {
    
    this.timeZone = timeZone;
    return this;
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


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public SpaceCreate state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public SpaceCreate primaryCurrency(@javax.annotation.Nullable String primaryCurrency) {
    
    this.primaryCurrency = primaryCurrency;
    return this;
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


  @JsonProperty(JSON_PROPERTY_PRIMARY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryCurrency(@javax.annotation.Nullable String primaryCurrency) {
    this.primaryCurrency = primaryCurrency;
  }

  public SpaceCreate database(@javax.annotation.Nullable Long database) {
    
    this.database = database;
    return this;
  }

  /**
   * The database the space is connected to and that holds the space&#39;s data.
   * @return database
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDatabase() {
    return database;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabase(@javax.annotation.Nullable Long database) {
    this.database = database;
  }

  public SpaceCreate account(@javax.annotation.Nonnull Long account) {
    
    this.account = account;
    return this;
  }

  /**
   * The account that the space belongs to.
   * @return account
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(@javax.annotation.Nonnull Long account) {
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
    SpaceCreate spaceCreate = (SpaceCreate) o;
    return Objects.equals(this.requestLimit, spaceCreate.requestLimit) &&
        Objects.equals(this.postalAddress, spaceCreate.postalAddress) &&
        Objects.equals(this.name, spaceCreate.name) &&
        Objects.equals(this.technicalContactAddresses, spaceCreate.technicalContactAddresses) &&
        Objects.equals(this.timeZone, spaceCreate.timeZone) &&
        Objects.equals(this.state, spaceCreate.state) &&
        Objects.equals(this.primaryCurrency, spaceCreate.primaryCurrency) &&
        Objects.equals(this.database, spaceCreate.database) &&
        Objects.equals(this.account, spaceCreate.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestLimit, postalAddress, name, technicalContactAddresses, timeZone, state, primaryCurrency, database, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceCreate {\n");
    sb.append("    requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    primaryCurrency: ").append(toIndentedString(primaryCurrency)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
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

    // add `requestLimit` to the URL query string
    if (getRequestLimit() != null) {
      try {
        joiner.add(String.format("%srequestLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `postalAddress` to the URL query string
    if (getPostalAddress() != null) {
      joiner.add(getPostalAddress().toUrlQueryString(prefix + "postalAddress" + suffix));
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

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `primaryCurrency` to the URL query string
    if (getPrimaryCurrency() != null) {
      try {
        joiner.add(String.format("%sprimaryCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `database` to the URL query string
    if (getDatabase() != null) {
      try {
        joiner.add(String.format("%sdatabase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatabase()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `account` to the URL query string
    if (getAccount() != null) {
      try {
        joiner.add(String.format("%saccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

