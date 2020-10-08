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

import java.time.LocalDate;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.Gender;

@ApiModel(description = "")

public class Address extends Indentable {

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
     * @return city
     **/
    @ApiModelProperty(value = "")
    public String getCity() {
        return city;
    }


    /**
     * @return commercialRegisterNumber
     **/
    @ApiModelProperty(value = "")
    public String getCommercialRegisterNumber() {
        return commercialRegisterNumber;
    }


    /**
     * @return country
     **/
    @ApiModelProperty(value = "")
    public String getCountry() {
        return country;
    }


    /**
     * @return dateOfBirth
     **/
    @ApiModelProperty(value = "")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * @return dependentLocality
     **/
    @ApiModelProperty(value = "")
    public String getDependentLocality() {
        return dependentLocality;
    }


    /**
     * @return emailAddress
     **/
    @ApiModelProperty(value = "")
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * @return familyName
     **/
    @ApiModelProperty(value = "")
    public String getFamilyName() {
        return familyName;
    }


    /**
     * @return gender
     **/
    @ApiModelProperty(value = "")
    public Gender getGender() {
        return gender;
    }


    /**
     * @return givenName
     **/
    @ApiModelProperty(value = "")
    public String getGivenName() {
        return givenName;
    }


    /**
     * @return legalOrganizationForm
     **/
    @ApiModelProperty(value = "")
    public LegalOrganizationForm getLegalOrganizationForm() {
        return legalOrganizationForm;
    }


    /**
     * @return mobilePhoneNumber
     **/
    @ApiModelProperty(value = "")
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }


    /**
     * @return organizationName
     **/
    @ApiModelProperty(value = "")
    public String getOrganizationName() {
        return organizationName;
    }


    /**
     * @return phoneNumber
     **/
    @ApiModelProperty(value = "")
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * @return postalState
     **/
    @ApiModelProperty(value = "")
    public String getPostalState() {
        return postalState;
    }


    /**
     * @return postcode
     **/
    @ApiModelProperty(value = "")
    public String getPostcode() {
        return postcode;
    }


    /**
     * @return salesTaxNumber
     **/
    @ApiModelProperty(value = "")
    public String getSalesTaxNumber() {
        return salesTaxNumber;
    }


    /**
     * @return salutation
     **/
    @ApiModelProperty(value = "")
    public String getSalutation() {
        return salutation;
    }


    /**
     * @return socialSecurityNumber
     **/
    @ApiModelProperty(value = "")
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * The sorting code identifies the post office at which the post box is located in.
     *
     * @return sortingCode
     **/
    @ApiModelProperty(value = "The sorting code identifies the post office at which the post box is located in.")
    public String getSortingCode() {
        return sortingCode;
    }


    /**
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

        return "class Address { \n" +
            "    city: " + toIndentedString(city) +  " \n" +
            "    commercialRegisterNumber: " + toIndentedString(commercialRegisterNumber) + " \n" +
            "    country: " + toIndentedString(country) + " \n" +
            "    dateOfBirth: " + toIndentedString(dateOfBirth) +  " \n" +
            "    dependentLocality: " + toIndentedString(dependentLocality) + " \n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    familyName: " + toIndentedString(familyName) +  " \n" +
            "    gender: " + toIndentedString(gender) + " \n" +
            "    givenName: " + toIndentedString(givenName) +  " \n" +
            "    legalOrganizationForm: " + toIndentedString(legalOrganizationForm) + " \n" +
            "    mobilePhoneNumber: " + toIndentedString(mobilePhoneNumber) + " \n" +
            "    organizationName: " + toIndentedString(organizationName) + " \n" +
            "    phoneNumber: " + toIndentedString(phoneNumber) + " \n" +
            "    postalState: " +  toIndentedString(postalState) + " \n" +
            "    postcode: " + toIndentedString(postcode) + " \n" +
            "    salesTaxNumber: " + toIndentedString(salesTaxNumber) + " \n" +
            "    salutation: " + toIndentedString(salutation) +  " \n" +
            "    socialSecurityNumber: " + toIndentedString(socialSecurityNumber) + " \n" +
            "    sortingCode: " + toIndentedString(sortingCode) + " \n" +
            "    street: " + toIndentedString(street) + " \n" +
            "}";
        }

}

