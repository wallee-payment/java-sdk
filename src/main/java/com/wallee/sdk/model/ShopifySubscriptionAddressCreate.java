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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.Gender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Objects;

@ApiModel(description = "")

public class ShopifySubscriptionAddressCreate extends Indentable {

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
    protected Long legalOrganizationForm;


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


    public ShopifySubscriptionAddressCreate city(String city) {
        this.city = city;
        return this;
    }

    /**
     * @return city
     **/
    @ApiModelProperty(value = "")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public ShopifySubscriptionAddressCreate commercialRegisterNumber(String commercialRegisterNumber) {
        this.commercialRegisterNumber = commercialRegisterNumber;
        return this;
    }

    /**
     * @return commercialRegisterNumber
     **/
    @ApiModelProperty(value = "")
    public String getCommercialRegisterNumber() {
        return commercialRegisterNumber;
    }

    public void setCommercialRegisterNumber(String commercialRegisterNumber) {
        this.commercialRegisterNumber = commercialRegisterNumber;
    }


    public ShopifySubscriptionAddressCreate country(String country) {
        this.country = country;
        return this;
    }

    /**
     * @return country
     **/
    @ApiModelProperty(value = "")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public ShopifySubscriptionAddressCreate dateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * @return dateOfBirth
     **/
    @ApiModelProperty(value = "")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public ShopifySubscriptionAddressCreate dependentLocality(String dependentLocality) {
        this.dependentLocality = dependentLocality;
        return this;
    }

    /**
     * @return dependentLocality
     **/
    @ApiModelProperty(value = "")
    public String getDependentLocality() {
        return dependentLocality;
    }

    public void setDependentLocality(String dependentLocality) {
        this.dependentLocality = dependentLocality;
    }


    public ShopifySubscriptionAddressCreate emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * @return emailAddress
     **/
    @ApiModelProperty(value = "")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public ShopifySubscriptionAddressCreate familyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    /**
     * @return familyName
     **/
    @ApiModelProperty(value = "")
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


    public ShopifySubscriptionAddressCreate gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * @return gender
     **/
    @ApiModelProperty(value = "")
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public ShopifySubscriptionAddressCreate givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * @return givenName
     **/
    @ApiModelProperty(value = "")
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }


    public ShopifySubscriptionAddressCreate legalOrganizationForm(Long legalOrganizationForm) {
        this.legalOrganizationForm = legalOrganizationForm;
        return this;
    }

    /**
     * @return legalOrganizationForm
     **/
    @ApiModelProperty(value = "")
    public Long getLegalOrganizationForm() {
        return legalOrganizationForm;
    }

    public void setLegalOrganizationForm(Long legalOrganizationForm) {
        this.legalOrganizationForm = legalOrganizationForm;
    }


    public ShopifySubscriptionAddressCreate mobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
        return this;
    }

    /**
     * @return mobilePhoneNumber
     **/
    @ApiModelProperty(value = "")
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }


    public ShopifySubscriptionAddressCreate organizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * @return organizationName
     **/
    @ApiModelProperty(value = "")
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }


    public ShopifySubscriptionAddressCreate phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * @return phoneNumber
     **/
    @ApiModelProperty(value = "")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public ShopifySubscriptionAddressCreate postalState(String postalState) {
        this.postalState = postalState;
        return this;
    }

    /**
     * @return postalState
     **/
    @ApiModelProperty(value = "")
    public String getPostalState() {
        return postalState;
    }

    public void setPostalState(String postalState) {
        this.postalState = postalState;
    }


    public ShopifySubscriptionAddressCreate postcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    /**
     * @return postcode
     **/
    @ApiModelProperty(value = "")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public ShopifySubscriptionAddressCreate salesTaxNumber(String salesTaxNumber) {
        this.salesTaxNumber = salesTaxNumber;
        return this;
    }

    /**
     * @return salesTaxNumber
     **/
    @ApiModelProperty(value = "")
    public String getSalesTaxNumber() {
        return salesTaxNumber;
    }

    public void setSalesTaxNumber(String salesTaxNumber) {
        this.salesTaxNumber = salesTaxNumber;
    }


    public ShopifySubscriptionAddressCreate salutation(String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     * @return salutation
     **/
    @ApiModelProperty(value = "")
    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }


    public ShopifySubscriptionAddressCreate socialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    /**
     * @return socialSecurityNumber
     **/
    @ApiModelProperty(value = "")
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public ShopifySubscriptionAddressCreate sortingCode(String sortingCode) {
        this.sortingCode = sortingCode;
        return this;
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

    public void setSortingCode(String sortingCode) {
        this.sortingCode = sortingCode;
    }


    public ShopifySubscriptionAddressCreate street(String street) {
        this.street = street;
        return this;
    }

    /**
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShopifySubscriptionAddressCreate shopifySubscriptionAddressCreate = (ShopifySubscriptionAddressCreate) o;
        return Objects.equals(this.city, shopifySubscriptionAddressCreate.city) &&
                Objects.equals(this.commercialRegisterNumber, shopifySubscriptionAddressCreate.commercialRegisterNumber) &&
                Objects.equals(this.country, shopifySubscriptionAddressCreate.country) &&
                Objects.equals(this.dateOfBirth, shopifySubscriptionAddressCreate.dateOfBirth) &&
                Objects.equals(this.dependentLocality, shopifySubscriptionAddressCreate.dependentLocality) &&
                Objects.equals(this.emailAddress, shopifySubscriptionAddressCreate.emailAddress) &&
                Objects.equals(this.familyName, shopifySubscriptionAddressCreate.familyName) && this.gender
                == shopifySubscriptionAddressCreate.gender &&
                Objects.equals(this.givenName, shopifySubscriptionAddressCreate.givenName) &&
                Objects.equals(this.legalOrganizationForm, shopifySubscriptionAddressCreate.legalOrganizationForm) &&
                Objects.equals(this.mobilePhoneNumber, shopifySubscriptionAddressCreate.mobilePhoneNumber) &&
                Objects.equals(this.organizationName, shopifySubscriptionAddressCreate.organizationName) &&
                Objects.equals(this.phoneNumber, shopifySubscriptionAddressCreate.phoneNumber) &&
                Objects.equals(this.postalState, shopifySubscriptionAddressCreate.postalState) &&
                Objects.equals(this.postcode, shopifySubscriptionAddressCreate.postcode) &&
                Objects.equals(this.salesTaxNumber, shopifySubscriptionAddressCreate.salesTaxNumber) &&
                Objects.equals(this.salutation, shopifySubscriptionAddressCreate.salutation) &&
                Objects.equals(this.socialSecurityNumber, shopifySubscriptionAddressCreate.socialSecurityNumber) &&
                Objects.equals(this.sortingCode, shopifySubscriptionAddressCreate.sortingCode) &&
                Objects.equals(this.street, shopifySubscriptionAddressCreate.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postalState, postcode, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street);
    }


    @Override
    public String toString() {

        return "class ShopifySubscriptionAddressCreate { \n" +
            "    city: " + toIndentedString(city) +  "\n" +
            "    commercialRegisterNumber: " + toIndentedString(commercialRegisterNumber) + " \n" +
            "    country: " + toIndentedString(country) + " \n" +
            "    dateOfBirth: " + toIndentedString(dateOfBirth) +  "\n" +
            "    dependentLocality: " + toIndentedString(dependentLocality) + " \n" +
            "    emailAddress: " + toIndentedString(emailAddress) + " \n" +
            "    familyName: " + toIndentedString(familyName) +  "\n" +
            "    gender: " + toIndentedString(gender) + " \n" +
            "    givenName: " + toIndentedString(givenName) +  "\n" +
            "    legalOrganizationForm: " + toIndentedString(legalOrganizationForm) + " \n" +
            "    mobilePhoneNumber: " + toIndentedString(mobilePhoneNumber) + " \n" +
            "    organizationName: " + toIndentedString(organizationName) + " \n" +
            "    phoneNumber: " + toIndentedString(phoneNumber) + " \n" +
            "    postalState: " +  toIndentedString(postalState) + " \n" +
            "    postcode: " + toIndentedString(postcode) + " \n" +
            "    salesTaxNumber: " + toIndentedString(salesTaxNumber) + " \n" +
            "    salutation: " + toIndentedString(salutation) +  "\n" +
            "    socialSecurityNumber: " + toIndentedString(socialSecurityNumber) + " \n" +
            "    sortingCode: " + toIndentedString(sortingCode) + " \n" +
            "    street: " + toIndentedString(street) + " \n" +
            "}";
        }


}

