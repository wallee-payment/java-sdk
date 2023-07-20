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
import com.wallee.sdk.model.Gender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class AddressCreate {
  
  @JsonProperty("city")
  protected String city = null;

  
  @JsonProperty("commercialRegisterNumber")
  protected String commercialRegisterNumber = null;

  
  @JsonProperty("country")
  protected String country = null;

  
  @JsonProperty("dateOfBirth")
  protected LocalDate dateOfBirth = null;

  
  @JsonProperty("dependentLocality")
  protected String dependentLocality = null;

  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("familyName")
  protected String familyName = null;

  
  @JsonProperty("gender")
  protected Gender gender = null;

  
  @JsonProperty("givenName")
  protected String givenName = null;

  
  @JsonProperty("legalOrganizationForm")
  protected Long legalOrganizationForm = null;

  
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

  
  @JsonProperty("salesTaxNumber")
  protected String salesTaxNumber = null;

  
  @JsonProperty("salutation")
  protected String salutation = null;

  
  @JsonProperty("socialSecurityNumber")
  protected String socialSecurityNumber = null;

  
  @JsonProperty("sortingCode")
  protected String sortingCode = null;

  
  @JsonProperty("street")
  protected String street = null;

  
  
  public AddressCreate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city, town or village.
   * @return city
  **/
  @ApiModelProperty(value = "The city, town or village.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  
  public AddressCreate commercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
    return this;
  }

   /**
   * The commercial registration number of the organization.
   * @return commercialRegisterNumber
  **/
  @ApiModelProperty(value = "The commercial registration number of the organization.")
  public String getCommercialRegisterNumber() {
    return commercialRegisterNumber;
  }

  public void setCommercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
  }

  
  public AddressCreate country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country is represented with a two-letter code (ISO 3166-1 alpha-2 standard) - for example, CH for Switzerland.
   * @return country
  **/
  @ApiModelProperty(value = "The country is represented with a two-letter code (ISO 3166-1 alpha-2 standard) - for example, CH for Switzerland.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public AddressCreate dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "The date of birth.")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  public AddressCreate dependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
    return this;
  }

   /**
   * The dependent locality which is a sub-division of the state.
   * @return dependentLocality
  **/
  @ApiModelProperty(value = "The dependent locality which is a sub-division of the state.")
  public String getDependentLocality() {
    return dependentLocality;
  }

  public void setDependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
  }

  
  public AddressCreate emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public AddressCreate familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * The family or last name.
   * @return familyName
  **/
  @ApiModelProperty(value = "The family or last name.")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  public AddressCreate gender(Gender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender.
   * @return gender
  **/
  @ApiModelProperty(value = "The gender.")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  
  public AddressCreate givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * The given or first name.
   * @return givenName
  **/
  @ApiModelProperty(value = "The given or first name.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  public AddressCreate legalOrganizationForm(Long legalOrganizationForm) {
    this.legalOrganizationForm = legalOrganizationForm;
    return this;
  }

   /**
   * The legal form of the organization.
   * @return legalOrganizationForm
  **/
  @ApiModelProperty(value = "The legal form of the organization.")
  public Long getLegalOrganizationForm() {
    return legalOrganizationForm;
  }

  public void setLegalOrganizationForm(Long legalOrganizationForm) {
    this.legalOrganizationForm = legalOrganizationForm;
  }

  
  public AddressCreate mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

   /**
   * The phone number of a mobile phone.
   * @return mobilePhoneNumber
  **/
  @ApiModelProperty(value = "The phone number of a mobile phone.")
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  
  public AddressCreate organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * The organization&#39;s name.
   * @return organizationName
  **/
  @ApiModelProperty(value = "The organization's name.")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  
  public AddressCreate phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  public AddressCreate postalState(String postalState) {
    this.postalState = postalState;
    return this;
  }

   /**
   * The name of the region, typically a state, county, province or prefecture.
   * @return postalState
  **/
  @ApiModelProperty(value = "The name of the region, typically a state, county, province or prefecture.")
  public String getPostalState() {
    return postalState;
  }

  public void setPostalState(String postalState) {
    this.postalState = postalState;
  }

  
  public AddressCreate postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postal code, also known as ZIP, postcode, etc.
   * @return postcode
  **/
  @ApiModelProperty(value = "The postal code, also known as ZIP, postcode, etc.")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  
  public AddressCreate salesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
    return this;
  }

   /**
   * The sales tax number of the organization.
   * @return salesTaxNumber
  **/
  @ApiModelProperty(value = "The sales tax number of the organization.")
  public String getSalesTaxNumber() {
    return salesTaxNumber;
  }

  public void setSalesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
  }

  
  public AddressCreate salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * The salutation e.g. Mrs, Mr, Dr.
   * @return salutation
  **/
  @ApiModelProperty(value = "The salutation e.g. Mrs, Mr, Dr.")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  
  public AddressCreate socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * The social security number.
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "The social security number.")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  
  public AddressCreate sortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
    return this;
  }

   /**
   * The sorting code identifying the post office where the PO Box is located.
   * @return sortingCode
  **/
  @ApiModelProperty(value = "The sorting code identifying the post office where the PO Box is located.")
  public String getSortingCode() {
    return sortingCode;
  }

  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }

  
  public AddressCreate street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The street or PO Box.
   * @return street
  **/
  @ApiModelProperty(value = "The street or PO Box.")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCreate addressCreate = (AddressCreate) o;
    return Objects.equals(this.city, addressCreate.city) &&
        Objects.equals(this.commercialRegisterNumber, addressCreate.commercialRegisterNumber) &&
        Objects.equals(this.country, addressCreate.country) &&
        Objects.equals(this.dateOfBirth, addressCreate.dateOfBirth) &&
        Objects.equals(this.dependentLocality, addressCreate.dependentLocality) &&
        Objects.equals(this.emailAddress, addressCreate.emailAddress) &&
        Objects.equals(this.familyName, addressCreate.familyName) &&
        Objects.equals(this.gender, addressCreate.gender) &&
        Objects.equals(this.givenName, addressCreate.givenName) &&
        Objects.equals(this.legalOrganizationForm, addressCreate.legalOrganizationForm) &&
        Objects.equals(this.mobilePhoneNumber, addressCreate.mobilePhoneNumber) &&
        Objects.equals(this.organizationName, addressCreate.organizationName) &&
        Objects.equals(this.phoneNumber, addressCreate.phoneNumber) &&
        Objects.equals(this.postalState, addressCreate.postalState) &&
        Objects.equals(this.postcode, addressCreate.postcode) &&
        Objects.equals(this.salesTaxNumber, addressCreate.salesTaxNumber) &&
        Objects.equals(this.salutation, addressCreate.salutation) &&
        Objects.equals(this.socialSecurityNumber, addressCreate.socialSecurityNumber) &&
        Objects.equals(this.sortingCode, addressCreate.sortingCode) &&
        Objects.equals(this.street, addressCreate.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postalState, postcode, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCreate {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

