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


@ApiModel(description = "")

public class SpaceAddress {
  
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
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
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
   * The email address is used within emails and as reply to address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address is used within emails and as reply to address.")
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
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
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
    SpaceAddress spaceAddress = (SpaceAddress) o;
    return Objects.equals(this.city, spaceAddress.city) &&
        Objects.equals(this.country, spaceAddress.country) &&
        Objects.equals(this.dependentLocality, spaceAddress.dependentLocality) &&
        Objects.equals(this.emailAddress, spaceAddress.emailAddress) &&
        Objects.equals(this.familyName, spaceAddress.familyName) &&
        Objects.equals(this.givenName, spaceAddress.givenName) &&
        Objects.equals(this.organizationName, spaceAddress.organizationName) &&
        Objects.equals(this.postalState, spaceAddress.postalState) &&
        Objects.equals(this.postcode, spaceAddress.postcode) &&
        Objects.equals(this.salesTaxNumber, spaceAddress.salesTaxNumber) &&
        Objects.equals(this.salutation, spaceAddress.salutation) &&
        Objects.equals(this.sortingCode, spaceAddress.sortingCode) &&
        Objects.equals(this.street, spaceAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, dependentLocality, emailAddress, familyName, givenName, organizationName, postalState, postcode, salesTaxNumber, salutation, sortingCode, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceAddress {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

