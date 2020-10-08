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

public class ShopifySubscriptionAddress extends Address {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShopifySubscriptionAddress shopifySubscriptionAddress = (ShopifySubscriptionAddress) o;
        return Objects.equals(this.city, shopifySubscriptionAddress.city) &&
                Objects.equals(this.commercialRegisterNumber, shopifySubscriptionAddress.commercialRegisterNumber) &&
                Objects.equals(this.country, shopifySubscriptionAddress.country) &&
                Objects.equals(this.dateOfBirth, shopifySubscriptionAddress.dateOfBirth) &&
                Objects.equals(this.dependentLocality, shopifySubscriptionAddress.dependentLocality) &&
                Objects.equals(this.emailAddress, shopifySubscriptionAddress.emailAddress) &&
                Objects.equals(this.familyName, shopifySubscriptionAddress.familyName) && this.gender
                == shopifySubscriptionAddress.gender &&
                Objects.equals(this.givenName, shopifySubscriptionAddress.givenName) &&
                Objects.equals(this.legalOrganizationForm, shopifySubscriptionAddress.legalOrganizationForm) &&
                Objects.equals(this.mobilePhoneNumber, shopifySubscriptionAddress.mobilePhoneNumber) &&
                Objects.equals(this.organizationName, shopifySubscriptionAddress.organizationName) &&
                Objects.equals(this.phoneNumber, shopifySubscriptionAddress.phoneNumber) &&
                Objects.equals(this.postalState, shopifySubscriptionAddress.postalState) &&
                Objects.equals(this.postcode, shopifySubscriptionAddress.postcode) &&
                Objects.equals(this.salesTaxNumber, shopifySubscriptionAddress.salesTaxNumber) &&
                Objects.equals(this.salutation, shopifySubscriptionAddress.salutation) &&
                Objects.equals(this.socialSecurityNumber, shopifySubscriptionAddress.socialSecurityNumber) &&
                Objects.equals(this.sortingCode, shopifySubscriptionAddress.sortingCode) &&
                Objects.equals(this.street, shopifySubscriptionAddress.street) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postalState, postcode, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street, super.hashCode());
    }


    @Override
    public String toString() {
        return "class ShopifySubscriptionAddress { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    city: " + toIndentedString(city) + " \n" +
            "    commercialRegisterNumber: " +  toIndentedString(commercialRegisterNumber) + " \n" +
            "    country: " + toIndentedString(country) + " \n" +
            "    dateOfBirth: " + toIndentedString(dateOfBirth) + " \n" +
            "    dependentLocality: " + toIndentedString(dependentLocality) + "\n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    familyName: " + toIndentedString(familyName) + " \n" +
            "    gender: " + toIndentedString(gender) + " \n" +
            "    givenName: " + toIndentedString(givenName) + " \n" +
            "    legalOrganizationForm: " +  toIndentedString(legalOrganizationForm) + " \n" +
            "    mobilePhoneNumber: " + toIndentedString(mobilePhoneNumber) +  "\n" +
            "    organizationName: " + toIndentedString(organizationName) + " \n" +
            "    phoneNumber: " + toIndentedString(phoneNumber) + " \n" +
            "    postalState: " + toIndentedString(postalState) +  "\n" +
            "    postcode: " + toIndentedString(postcode) + " \n" +
            "    salesTaxNumber: " +  toIndentedString(salesTaxNumber) + " \n" +
            "    salutation: " + toIndentedString(salutation) +  "\n" +
            "    socialSecurityNumber: " + toIndentedString(socialSecurityNumber) + " \n" +
            "    sortingCode: " + toIndentedString(sortingCode) + " \n" +
            "    street: " + toIndentedString(street) + " \n" +
            "}";
        }


}

