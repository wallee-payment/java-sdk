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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@ApiModel(description = "")

public class PaymentTerminalAddress extends Indentable {

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


    @JsonProperty("salutation")
    protected String salutation;


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
     * @return country
     **/
    @ApiModelProperty(value = "")
    public String getCountry() {
        return country;
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
     * @return givenName
     **/
    @ApiModelProperty(value = "")
    public String getGivenName() {
        return givenName;
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
     * @return salutation
     **/
    @ApiModelProperty(value = "")
    public String getSalutation() {
        return salutation;
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

        return "class PaymentTerminalAddress {\n" +
            "    city: " + toIndentedString(city) + "\n" +
            "    country: " + toIndentedString(country) + "\n" +
            "    dependentLocality: " + toIndentedString(dependentLocality) +  "\n" +
            "    emailAddress: " + toIndentedString(emailAddress) + "\n" +
            "    familyName: " +  toIndentedString(familyName) + "\n" +
            "    givenName: " + toIndentedString(givenName) + "\n" +
            "    mobilePhoneNumber: " + toIndentedString(mobilePhoneNumber) + "\n" +
            "    organizationName: " + toIndentedString(organizationName) + "\n" +
            "    phoneNumber: " + toIndentedString(phoneNumber) + "\n" +
            "    postalState: " +  toIndentedString(postalState) + "\n" +
            "    postcode: " + toIndentedString(postcode) + "\n" +
            "    salutation: " + toIndentedString(salutation) + "\n" +
            "    sortingCode: " + toIndentedString(sortingCode) +  "\n" +
            "    street: " + toIndentedString(street) + "\n" +
            "}";
        }


}

