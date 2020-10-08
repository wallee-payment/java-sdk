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

import java.util.Objects;

import io.swagger.annotations.ApiModel;


@ApiModel(description = "")

public class PaymentTerminalContactAddress extends PaymentTerminalAddress {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentTerminalContactAddress paymentTerminalContactAddress = (PaymentTerminalContactAddress) o;
        return Objects.equals(this.city, paymentTerminalContactAddress.city) &&
                Objects.equals(this.country, paymentTerminalContactAddress.country) &&
                Objects.equals(this.dependentLocality, paymentTerminalContactAddress.dependentLocality) &&
                Objects.equals(this.emailAddress, paymentTerminalContactAddress.emailAddress) &&
                Objects.equals(this.familyName, paymentTerminalContactAddress.familyName) &&
                Objects.equals(this.givenName, paymentTerminalContactAddress.givenName) &&
                Objects.equals(this.mobilePhoneNumber, paymentTerminalContactAddress.mobilePhoneNumber) &&
                Objects.equals(this.organizationName, paymentTerminalContactAddress.organizationName) &&
                Objects.equals(this.phoneNumber, paymentTerminalContactAddress.phoneNumber) &&
                Objects.equals(this.postalState, paymentTerminalContactAddress.postalState) &&
                Objects.equals(this.postcode, paymentTerminalContactAddress.postcode) &&
                Objects.equals(this.salutation, paymentTerminalContactAddress.salutation) &&
                Objects.equals(this.sortingCode, paymentTerminalContactAddress.sortingCode) &&
                Objects.equals(this.street, paymentTerminalContactAddress.street) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, dependentLocality, emailAddress, familyName, givenName, mobilePhoneNumber, organizationName, phoneNumber, postalState, postcode, salutation, sortingCode, street, super.hashCode());
    }


    @Override
    public String toString() {
        return "class PaymentTerminalContactAddress { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    city: " + toIndentedString(city) + " \n" +
            "    country: " + toIndentedString(country) +  "\n" +
            "    dependentLocality: " + toIndentedString(dependentLocality) + " \n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    familyName: " + toIndentedString(familyName) +  "\n" +
            "    givenName: " + toIndentedString(givenName) + " \n" +
            "    mobilePhoneNumber: " +  toIndentedString(mobilePhoneNumber) + " \n" +
            "    organizationName: " + toIndentedString(organizationName) +  "\n" +
            "    phoneNumber: " + toIndentedString(phoneNumber) + " \n" +
            "    postalState: " +  toIndentedString(postalState) + " \n" +
            "    postcode: " + toIndentedString(postcode) + " \n" +
            "    salutation: " + toIndentedString(salutation) + " \n" +
            "    sortingCode: " + toIndentedString(sortingCode) +  "\n" +
            "    street: " + toIndentedString(street) + " \n" +
            "}";
        }


}

