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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentTerminalAddress {
  
  @JsonProperty("city")
  protected String city = null;

  
  @JsonProperty("country")
  protected String country = null;

  
  @JsonProperty("dependentLocality")
  protected String dependentLocality = null;

  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("familyName")
  protected String familyName = null;

  
  @JsonProperty("givenName")
  protected String givenName = null;

  
  @JsonProperty("mobilePhoneNumber")
  protected String mobilePhoneNumber = null;

  
  @JsonProperty("organizationName")
  protected String organizationName = null;

  
  @JsonProperty("phoneNumber")
  protected String phoneNumber = null;

  
  @JsonProperty("postalState")
  protected String postalState = null;

  
  @JsonProperty("postcode")
  protected String postcode = null;

  
  @JsonProperty("salutation")
  protected String salutation = null;

  
  @JsonProperty("sortingCode")
  protected String sortingCode = null;

  
  @JsonProperty("street")
  protected String street = null;

  
  
   /**
   * The city, town or village.
   * @return city
  **/
  @ApiModelProperty(value = "The city, town or village.")
  public String getCity() {
    return city;
  }

  
   /**
   * The two-letter country code (ISO 3166 format).
   * @return country
  **/
  @ApiModelProperty(value = "The two-letter country code (ISO 3166 format).")
  public String getCountry() {
    return country;
  }

  
   /**
   * The dependent locality which is a sub-division of the state.
   * @return dependentLocality
  **/
  @ApiModelProperty(value = "The dependent locality which is a sub-division of the state.")
  public String getDependentLocality() {
    return dependentLocality;
  }

  
   /**
   * The email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  
   /**
   * The family or last name.
   * @return familyName
  **/
  @ApiModelProperty(value = "The family or last name.")
  public String getFamilyName() {
    return familyName;
  }

  
   /**
   * The given or first name.
   * @return givenName
  **/
  @ApiModelProperty(value = "The given or first name.")
  public String getGivenName() {
    return givenName;
  }

  
   /**
   * The phone number of a mobile phone.
   * @return mobilePhoneNumber
  **/
  @ApiModelProperty(value = "The phone number of a mobile phone.")
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  
   /**
   * The organization&#39;s name.
   * @return organizationName
  **/
  @ApiModelProperty(value = "The organization's name.")
  public String getOrganizationName() {
    return organizationName;
  }

  
   /**
   * The phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  
   /**
   * The name of the region, typically a state, county, province or prefecture.
   * @return postalState
  **/
  @ApiModelProperty(value = "The name of the region, typically a state, county, province or prefecture.")
  public String getPostalState() {
    return postalState;
  }

  
   /**
   * The postal code, also known as ZIP, postcode, etc.
   * @return postcode
  **/
  @ApiModelProperty(value = "The postal code, also known as ZIP, postcode, etc.")
  public String getPostcode() {
    return postcode;
  }

  
   /**
   * The salutation e.g. Mrs, Mr, Dr.
   * @return salutation
  **/
  @ApiModelProperty(value = "The salutation e.g. Mrs, Mr, Dr.")
  public String getSalutation() {
    return salutation;
  }

  
   /**
   * The sorting code identifying the post office where the PO Box is located.
   * @return sortingCode
  **/
  @ApiModelProperty(value = "The sorting code identifying the post office where the PO Box is located.")
  public String getSortingCode() {
    return sortingCode;
  }

  
   /**
   * The street or PO Box.
   * @return street
  **/
  @ApiModelProperty(value = "The street or PO Box.")
  public String getStreet() {
    return street;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalAddress paymentTerminalAddress = (PaymentTerminalAddress) o;
    return Objects.equals(this.city, paymentTerminalAddress.city) &&
        Objects.equals(this.country, paymentTerminalAddress.country) &&
        Objects.equals(this.dependentLocality, paymentTerminalAddress.dependentLocality) &&
        Objects.equals(this.emailAddress, paymentTerminalAddress.emailAddress) &&
        Objects.equals(this.familyName, paymentTerminalAddress.familyName) &&
        Objects.equals(this.givenName, paymentTerminalAddress.givenName) &&
        Objects.equals(this.mobilePhoneNumber, paymentTerminalAddress.mobilePhoneNumber) &&
        Objects.equals(this.organizationName, paymentTerminalAddress.organizationName) &&
        Objects.equals(this.phoneNumber, paymentTerminalAddress.phoneNumber) &&
        Objects.equals(this.postalState, paymentTerminalAddress.postalState) &&
        Objects.equals(this.postcode, paymentTerminalAddress.postcode) &&
        Objects.equals(this.salutation, paymentTerminalAddress.salutation) &&
        Objects.equals(this.sortingCode, paymentTerminalAddress.sortingCode) &&
        Objects.equals(this.street, paymentTerminalAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, dependentLocality, emailAddress, familyName, givenName, mobilePhoneNumber, organizationName, phoneNumber, postalState, postcode, salutation, sortingCode, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalAddress {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

