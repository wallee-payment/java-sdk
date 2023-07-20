/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.Customer;
import com.wallee.sdk.model.CustomerAddressType;
import com.wallee.sdk.model.CustomerPostalAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CustomerAddress {
  
  @JsonProperty("address")
  protected CustomerPostalAddress address = null;

  
  @JsonProperty("addressType")
  protected CustomerAddressType addressType = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("customer")
  protected Customer customer = null;

  
  @JsonProperty("defaultAddress")
  protected Boolean defaultAddress = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The actual postal address.
   * @return address
  **/
  @ApiModelProperty(value = "The actual postal address.")
  public CustomerPostalAddress getAddress() {
    return address;
  }

  
   /**
   * Whether the address is for billing or shipping or both.
   * @return addressType
  **/
  @ApiModelProperty(value = "Whether the address is for billing or shipping or both.")
  public CustomerAddressType getAddressType() {
    return addressType;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The customer that the object belongs to.
   * @return customer
  **/
  @ApiModelProperty(value = "The customer that the object belongs to.")
  public Customer getCustomer() {
    return customer;
  }

  
   /**
   * Whether this is the customer&#39;s default address.
   * @return defaultAddress
  **/
  @ApiModelProperty(value = "Whether this is the customer's default address.")
  public Boolean isDefaultAddress() {
    return defaultAddress;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAddress customerAddress = (CustomerAddress) o;
    return Objects.equals(this.address, customerAddress.address) &&
        Objects.equals(this.addressType, customerAddress.addressType) &&
        Objects.equals(this.createdOn, customerAddress.createdOn) &&
        Objects.equals(this.customer, customerAddress.customer) &&
        Objects.equals(this.defaultAddress, customerAddress.defaultAddress) &&
        Objects.equals(this.id, customerAddress.id) &&
        Objects.equals(this.linkedSpaceId, customerAddress.linkedSpaceId) &&
        Objects.equals(this.version, customerAddress.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressType, createdOn, customer, defaultAddress, id, linkedSpaceId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    defaultAddress: ").append(toIndentedString(defaultAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

