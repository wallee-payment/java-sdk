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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AbstractCustomerAddressActive
 */

public class AbstractCustomerAddressActive extends Indentable {

    @JsonProperty("address")
    protected CustomerPostalAddressCreate address;


    @JsonProperty("addressType")
    protected CustomerAddressType addressType;


    public AbstractCustomerAddressActive address(CustomerPostalAddressCreate address) {
        this.address = address;
        return this;
    }

    /**
     * @return address
     **/
    @ApiModelProperty(value = "")
    public CustomerPostalAddressCreate getAddress() {
        return address;
    }

    public void setAddress(CustomerPostalAddressCreate address) {
        this.address = address;
    }


    public AbstractCustomerAddressActive addressType(CustomerAddressType addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * @return addressType
     **/
    @ApiModelProperty(value = "")
    public CustomerAddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(CustomerAddressType addressType) {
        this.addressType = addressType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractCustomerAddressActive abstractCustomerAddressActive = (AbstractCustomerAddressActive) o;
        return Objects.equals(this.address, abstractCustomerAddressActive.address) && this.addressType
                == abstractCustomerAddressActive.addressType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, addressType);
    }


    @Override
    public String toString() {

        return "class AbstractCustomerAddressActive { \n" +
            "    address: " + toIndentedString(address) + " \n" +
            "    addressType: " + toIndentedString(addressType) + " \n" +
            "}";
    }

}

