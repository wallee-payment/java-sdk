/**
*  SDK
*
* This library allows to interact with the  payment service.
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
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    commercialRegisterNumber: ").append(toIndentedString(commercialRegisterNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    legalOrganizationForm: ").append(toIndentedString(legalOrganizationForm)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalState: ").append(toIndentedString(postalState)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    sortingCode: ").append(toIndentedString(sortingCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

}

