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

/**
 * 
 */
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
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalContactAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalState: ").append(toIndentedString(postalState)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
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

