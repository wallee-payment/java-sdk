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
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class SpaceAddressCreate {
  
  @JsonProperty("city")
  protected String city;

  
  @JsonProperty("country")
  protected String country;

  
  @JsonProperty("dependentLocality")
  protected String dependentLocality;

  
  @JsonProperty("emailAddress")
  protected String emailAddress;

  
  @JsonProperty("familyName")
  protected String familyName;

  
  @JsonProperty("givenName")
  protected String givenName;

  
  @JsonProperty("organizationName")
  protected String organizationName;

  
  @JsonProperty("postalState")
  protected String postalState;

  
  @JsonProperty("postcode")
  protected String postcode;

  
  @JsonProperty("salesTaxNumber")
  protected String salesTaxNumber;

  
  @JsonProperty("salutation")
  protected String salutation;

  
  @JsonProperty("sortingCode")
  protected String sortingCode;

  
  @JsonProperty("street")
  protected String street;

  
  
  public SpaceAddressCreate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  
  public SpaceAddressCreate country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public SpaceAddressCreate dependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
    return this;
  }

   /**
   * 
   * @return dependentLocality
  **/
  @ApiModelProperty(value = "")
  public String getDependentLocality() {
    return dependentLocality;
  }

  public void setDependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
  }

  
  public SpaceAddressCreate emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address is used within emails and as reply to address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address is used within emails and as reply to address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public SpaceAddressCreate familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * 
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  public SpaceAddressCreate givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * 
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  public SpaceAddressCreate organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * 
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  
  public SpaceAddressCreate postalState(String postalState) {
    this.postalState = postalState;
    return this;
  }

   /**
   * 
   * @return postalState
  **/
  @ApiModelProperty(value = "")
  public String getPostalState() {
    return postalState;
  }

  public void setPostalState(String postalState) {
    this.postalState = postalState;
  }

  
  public SpaceAddressCreate postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * 
   * @return postcode
  **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  
  public SpaceAddressCreate salesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
    return this;
  }

   /**
   * 
   * @return salesTaxNumber
  **/
  @ApiModelProperty(value = "")
  public String getSalesTaxNumber() {
    return salesTaxNumber;
  }

  public void setSalesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
  }

  
  public SpaceAddressCreate salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * 
   * @return salutation
  **/
  @ApiModelProperty(value = "")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  
  public SpaceAddressCreate sortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
    return this;
  }

   /**
   * The sorting code identifies the post office at which the post box is located in.
   * @return sortingCode
  **/
  @ApiModelProperty(value = "The sorting code identifies the post office at which the post box is located in.")
  public String getSortingCode() {
    return sortingCode;
  }

  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }

  
  public SpaceAddressCreate street(String street) {
    this.street = street;
    return this;
  }

   /**
   * 
   * @return street
  **/
  @ApiModelProperty(value = "")
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
    SpaceAddressCreate spaceAddressCreate = (SpaceAddressCreate) o;
    return Objects.equals(this.city, spaceAddressCreate.city) &&
        Objects.equals(this.country, spaceAddressCreate.country) &&
        Objects.equals(this.dependentLocality, spaceAddressCreate.dependentLocality) &&
        Objects.equals(this.emailAddress, spaceAddressCreate.emailAddress) &&
        Objects.equals(this.familyName, spaceAddressCreate.familyName) &&
        Objects.equals(this.givenName, spaceAddressCreate.givenName) &&
        Objects.equals(this.organizationName, spaceAddressCreate.organizationName) &&
        Objects.equals(this.postalState, spaceAddressCreate.postalState) &&
        Objects.equals(this.postcode, spaceAddressCreate.postcode) &&
        Objects.equals(this.salesTaxNumber, spaceAddressCreate.salesTaxNumber) &&
        Objects.equals(this.salutation, spaceAddressCreate.salutation) &&
        Objects.equals(this.sortingCode, spaceAddressCreate.sortingCode) &&
        Objects.equals(this.street, spaceAddressCreate.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, dependentLocality, emailAddress, familyName, givenName, organizationName, postalState, postcode, salesTaxNumber, salutation, sortingCode, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceAddressCreate {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    postalState: ").append(toIndentedString(postalState)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
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

