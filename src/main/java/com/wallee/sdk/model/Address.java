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

import java.time.LocalDate;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class Address {
  
  @JsonProperty("city")
  protected String city;

  
  @JsonProperty("commercialRegisterNumber")
  protected String commercialRegisterNumber;

  
  @JsonProperty("country")
  protected String country;

  
  @JsonProperty("dateOfBirth")
  protected LocalDate dateOfBirth;

  
  @JsonProperty("dependentLocality")
  protected String dependentLocality;

  
  @JsonProperty("emailAddress")
  protected String emailAddress;

  
  @JsonProperty("familyName")
  protected String familyName;

  
  @JsonProperty("gender")
  protected Gender gender;

  
  @JsonProperty("givenName")
  protected String givenName;

  
  @JsonProperty("legalOrganizationForm")
  protected LegalOrganizationForm legalOrganizationForm;

  
  @JsonProperty("mobilePhoneNumber")
  protected String mobilePhoneNumber;

  
  @JsonProperty("organizationName")
  protected String organizationName;

  
  @JsonProperty("phoneNumber")
  protected String phoneNumber;

  
  @JsonProperty("postalState")
  protected String postalState;

  
  @JsonProperty("postcode")
  protected String postcode;

  
  @JsonProperty("salesTaxNumber")
  protected String salesTaxNumber;

  
  @JsonProperty("salutation")
  protected String salutation;

  
  @JsonProperty("socialSecurityNumber")
  protected String socialSecurityNumber;

  
  @JsonProperty("sortingCode")
  protected String sortingCode;

  
  @JsonProperty("street")
  protected String street;

  
  
   /**
   * 
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  
   /**
   * 
   * @return commercialRegisterNumber
  **/
  @ApiModelProperty(value = "")
  public String getCommercialRegisterNumber() {
    return commercialRegisterNumber;
  }

  
   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  
   /**
   * 
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  
   /**
   * 
   * @return dependentLocality
  **/
  @ApiModelProperty(value = "")
  public String getDependentLocality() {
    return dependentLocality;
  }

  
   /**
   * 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  
   /**
   * 
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  
   /**
   * 
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public Gender getGender() {
    return gender;
  }

  
   /**
   * 
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  
   /**
   * 
   * @return legalOrganizationForm
  **/
  @ApiModelProperty(value = "")
  public LegalOrganizationForm getLegalOrganizationForm() {
    return legalOrganizationForm;
  }

  
   /**
   * 
   * @return mobilePhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  
   /**
   * 
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  
   /**
   * 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  
   /**
   * 
   * @return postalState
  **/
  @ApiModelProperty(value = "")
  public String getPostalState() {
    return postalState;
  }

  
   /**
   * 
   * @return postcode
  **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }

  
   /**
   * 
   * @return salesTaxNumber
  **/
  @ApiModelProperty(value = "")
  public String getSalesTaxNumber() {
    return salesTaxNumber;
  }

  
   /**
   * 
   * @return salutation
  **/
  @ApiModelProperty(value = "")
  public String getSalutation() {
    return salutation;
  }

  
   /**
   * 
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  
   /**
   * The sorting code identifies the post office at which the post box is located in.
   * @return sortingCode
  **/
  @ApiModelProperty(value = "The sorting code identifies the post office at which the post box is located in.")
  public String getSortingCode() {
    return sortingCode;
  }

  
   /**
   * 
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.city, address.city) &&
        Objects.equals(this.commercialRegisterNumber, address.commercialRegisterNumber) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.dateOfBirth, address.dateOfBirth) &&
        Objects.equals(this.dependentLocality, address.dependentLocality) &&
        Objects.equals(this.emailAddress, address.emailAddress) &&
        Objects.equals(this.familyName, address.familyName) && this.gender == address.gender &&
        Objects.equals(this.givenName, address.givenName) &&
        Objects.equals(this.legalOrganizationForm, address.legalOrganizationForm) &&
        Objects.equals(this.mobilePhoneNumber, address.mobilePhoneNumber) &&
        Objects.equals(this.organizationName, address.organizationName) &&
        Objects.equals(this.phoneNumber, address.phoneNumber) &&
        Objects.equals(this.postalState, address.postalState) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.salesTaxNumber, address.salesTaxNumber) &&
        Objects.equals(this.salutation, address.salutation) &&
        Objects.equals(this.socialSecurityNumber, address.socialSecurityNumber) &&
        Objects.equals(this.sortingCode, address.sortingCode) &&
        Objects.equals(this.street, address.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postalState, postcode, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
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

