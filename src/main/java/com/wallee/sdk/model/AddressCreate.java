/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.Gender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class AddressCreate {
	@SerializedName("city")
	private String city = null;

	@SerializedName("commercialRegisterNumber")
	private String commercialRegisterNumber = null;

	@SerializedName("country")
	private String country = null;

	@SerializedName("dateOfBirth")
	private DateTime dateOfBirth = null;

	@SerializedName("dependentLocality")
	private String dependentLocality = null;

	@SerializedName("emailAddress")
	private String emailAddress = null;

	@SerializedName("familyName")
	private String familyName = null;

	@SerializedName("gender")
	private Gender gender = null;

	@SerializedName("givenName")
	private String givenName = null;

	@SerializedName("legalOrganizationForm")
	private Long legalOrganizationForm = null;

	@SerializedName("mobilePhoneNumber")
	private String mobilePhoneNumber = null;

	@SerializedName("organizationName")
	private String organizationName = null;

	@SerializedName("phoneNumber")
	private String phoneNumber = null;

	@SerializedName("postCode")
	private String postCode = null;

	@SerializedName("postalState")
	private String postalState = null;

	@SerializedName("salesTaxNumber")
	private String salesTaxNumber = null;

	@SerializedName("salutation")
	private String salutation = null;

	@SerializedName("socialSecurityNumber")
	private String socialSecurityNumber = null;

	@SerializedName("sortingCode")
	private String sortingCode = null;

	@SerializedName("street")
	private String street = null;

	public AddressCreate city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public AddressCreate dateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public AddressCreate dependentLocality(String dependentLocality) {
		this.dependentLocality = dependentLocality;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public AddressCreate postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public AddressCreate postalState(String postalState) {
		this.postalState = postalState;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getPostalState() {
		return postalState;
	}

	public void setPostalState(String postalState) {
		this.postalState = postalState;
	}

	public AddressCreate salesTaxNumber(String salesTaxNumber) {
		this.salesTaxNumber = salesTaxNumber;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * The sorting code identifies the post office at which the post box is located in.
	 *
	 * @return The sorting code identifies the post office at which the post box is located in.
	 */
	@ApiModelProperty(example = "null", value = "The sorting code identifies the post office at which the post box is located in.")
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
				Objects.equals(this.postCode, addressCreate.postCode) &&
				Objects.equals(this.postalState, addressCreate.postalState) &&
				Objects.equals(this.salesTaxNumber, addressCreate.salesTaxNumber) &&
				Objects.equals(this.salutation, addressCreate.salutation) &&
				Objects.equals(this.socialSecurityNumber, addressCreate.socialSecurityNumber) &&
				Objects.equals(this.sortingCode, addressCreate.sortingCode) &&
				Objects.equals(this.street, addressCreate.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postCode, postalState, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddressCreate {\n");
		
		sb.append("		city: ").append(toIndentedString(city)).append("\n");
		sb.append("		commercialRegisterNumber: ").append(toIndentedString(commercialRegisterNumber)).append("\n");
		sb.append("		country: ").append(toIndentedString(country)).append("\n");
		sb.append("		dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("		dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
		sb.append("		emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("		familyName: ").append(toIndentedString(familyName)).append("\n");
		sb.append("		gender: ").append(toIndentedString(gender)).append("\n");
		sb.append("		givenName: ").append(toIndentedString(givenName)).append("\n");
		sb.append("		legalOrganizationForm: ").append(toIndentedString(legalOrganizationForm)).append("\n");
		sb.append("		mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
		sb.append("		organizationName: ").append(toIndentedString(organizationName)).append("\n");
		sb.append("		phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
		sb.append("		postCode: ").append(toIndentedString(postCode)).append("\n");
		sb.append("		postalState: ").append(toIndentedString(postalState)).append("\n");
		sb.append("		salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
		sb.append("		salutation: ").append(toIndentedString(salutation)).append("\n");
		sb.append("		socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
		sb.append("		sortingCode: ").append(toIndentedString(sortingCode)).append("\n");
		sb.append("		street: ").append(toIndentedString(street)).append("\n");
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
		return o.toString().replace("\n", "\n		");
	}

}

