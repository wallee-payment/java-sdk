/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.CustomerAddressType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class CustomerAddress extends Indentable {

    @JsonProperty("address")
    protected CustomerPostalAddress address;


    @JsonProperty("addressType")
    protected CustomerAddressType addressType;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("customer")
    protected Customer customer;


    @JsonProperty("defaultAddress")
    protected Boolean defaultAddress;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return address
     **/
    @ApiModelProperty(value = "")
    public CustomerPostalAddress getAddress() {
        return address;
    }


    /**
     * @return addressType
     **/
    @ApiModelProperty(value = "")
    public CustomerAddressType getAddressType() {
        return addressType;
    }


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return customer
     **/
    @ApiModelProperty(value = "")
    public Customer getCustomer() {
        return customer;
    }


    /**
     * @return defaultAddress
     **/
    @ApiModelProperty(value = "")
    public Boolean isDefaultAddress() {
        return defaultAddress;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
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
        return Objects.equals(this.address, customerAddress.address) && this.addressType == customerAddress.addressType &&
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

        return "class CustomerAddress { \n" +
            "    address: " + toIndentedString(address) +  " \n" +
            "    addressType: " + toIndentedString(addressType) + " \n" +
            "    createdOn: " +  toIndentedString(createdOn) + "\n" +
            "    customer: " + toIndentedString(customer) + "\n" +
            "    defaultAddress: " + toIndentedString(defaultAddress) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

