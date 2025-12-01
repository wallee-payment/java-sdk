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
import com.wallee.sdk.model.Customer;
import com.wallee.sdk.model.CustomerAddressType;
import com.wallee.sdk.model.CustomerPostalAddress;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CustomerAddress
 */
@JsonPropertyOrder({
  CustomerAddress.JSON_PROPERTY_LINKED_SPACE_ID,
  CustomerAddress.JSON_PROPERTY_ADDRESS,
  CustomerAddress.JSON_PROPERTY_ADDRESS_TYPE,
  CustomerAddress.JSON_PROPERTY_ID,
  CustomerAddress.JSON_PROPERTY_CREATED_ON,
  CustomerAddress.JSON_PROPERTY_VERSION,
  CustomerAddress.JSON_PROPERTY_CUSTOMER,
  CustomerAddress.JSON_PROPERTY_DEFAULT_ADDRESS
})

public class CustomerAddress {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private CustomerPostalAddress address;

  public static final String JSON_PROPERTY_ADDRESS_TYPE = "addressType";
  @javax.annotation.Nullable
  private CustomerAddressType addressType;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  @javax.annotation.Nullable
  private Customer customer;

  public static final String JSON_PROPERTY_DEFAULT_ADDRESS = "defaultAddress";
  @javax.annotation.Nullable
  private Boolean defaultAddress;

  public CustomerAddress() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public CustomerAddress(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_ADDRESS) Boolean defaultAddress
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.id = id;
    this.createdOn = createdOn;
    this.version = version;
    this.defaultAddress = defaultAddress;
  }

  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public CustomerAddress address(@javax.annotation.Nullable CustomerPostalAddress address) {
    
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerPostalAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(@javax.annotation.Nullable CustomerPostalAddress address) {
    this.address = address;
  }

  public CustomerAddress addressType(@javax.annotation.Nullable CustomerAddressType addressType) {
    
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerAddressType getAddressType() {
    return addressType;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressType(@javax.annotation.Nullable CustomerAddressType addressType) {
    this.addressType = addressType;
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



  /**
   * The date and time when the object was created.
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



  public CustomerAddress customer(@javax.annotation.Nullable Customer customer) {
    
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Customer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(@javax.annotation.Nullable Customer customer) {
    this.customer = customer;
  }

  /**
   * Whether this is the customer&#39;s default address.
   * @return defaultAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultAddress() {
    return defaultAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAddress customerAddress = (CustomerAddress) o;
    return Objects.equals(this.linkedSpaceId, customerAddress.linkedSpaceId) &&
        Objects.equals(this.address, customerAddress.address) &&
        Objects.equals(this.addressType, customerAddress.addressType) &&
        Objects.equals(this.id, customerAddress.id) &&
        Objects.equals(this.createdOn, customerAddress.createdOn) &&
        Objects.equals(this.version, customerAddress.version) &&
        Objects.equals(this.customer, customerAddress.customer) &&
        Objects.equals(this.defaultAddress, customerAddress.defaultAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, address, addressType, id, createdOn, version, customer, defaultAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddress {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    defaultAddress: ").append(toIndentedString(defaultAddress)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `addressType` to the URL query string
    if (getAddressType() != null) {
      try {
        joiner.add(String.format("%saddressType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `defaultAddress` to the URL query string
    if (getDefaultAddress() != null) {
      try {
        joiner.add(String.format("%sdefaultAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

