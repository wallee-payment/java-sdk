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
import com.wallee.sdk.model.LegalOrganizationForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class Address {
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
	private LegalOrganizationForm legalOrganizationForm = null;

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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getCity() {
		return city;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getCountry() {
		return country;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getDependentLocality() {
		return dependentLocality;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getFamilyName() {
		return familyName;
	}

	public Address gender(Gender gender) {
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getGivenName() {
		return givenName;
	}

	public Address legalOrganizationForm(LegalOrganizationForm legalOrganizationForm) {
		this.legalOrganizationForm = legalOrganizationForm;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public LegalOrganizationForm getLegalOrganizationForm() {
		return legalOrganizationForm;
	}

	public void setLegalOrganizationForm(LegalOrganizationForm legalOrganizationForm) {
		this.legalOrganizationForm = legalOrganizationForm;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getOrganizationName() {
		return organizationName;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getPostCode() {
		return postCode;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getSalesTaxNumber() {
		return salesTaxNumber;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
		Address address = (Address) o;
		return Objects.equals(this.city, address.city) &&
				Objects.equals(this.commercialRegisterNumber, address.commercialRegisterNumber) &&
				Objects.equals(this.country, address.country) &&
				Objects.equals(this.dateOfBirth, address.dateOfBirth) &&
				Objects.equals(this.dependentLocality, address.dependentLocality) &&
				Objects.equals(this.emailAddress, address.emailAddress) &&
				Objects.equals(this.familyName, address.familyName) &&
				Objects.equals(this.gender, address.gender) &&
				Objects.equals(this.givenName, address.givenName) &&
				Objects.equals(this.legalOrganizationForm, address.legalOrganizationForm) &&
				Objects.equals(this.mobilePhoneNumber, address.mobilePhoneNumber) &&
				Objects.equals(this.organizationName, address.organizationName) &&
				Objects.equals(this.phoneNumber, address.phoneNumber) &&
				Objects.equals(this.postCode, address.postCode) &&
				Objects.equals(this.postalState, address.postalState) &&
				Objects.equals(this.salesTaxNumber, address.salesTaxNumber) &&
				Objects.equals(this.salutation, address.salutation) &&
				Objects.equals(this.socialSecurityNumber, address.socialSecurityNumber) &&
				Objects.equals(this.sortingCode, address.sortingCode) &&
				Objects.equals(this.street, address.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postCode, postalState, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Address {\n");
		
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

