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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SpaceAddressCreate {
	@SerializedName("city")
	private String city = null;

	@SerializedName("country")
	private String country = null;

	@SerializedName("dependentLocality")
	private String dependentLocality = null;

	@SerializedName("emailAddress")
	private String emailAddress = null;

	@SerializedName("familyName")
	private String familyName = null;

	@SerializedName("givenName")
	private String givenName = null;

	@SerializedName("organizationName")
	private String organizationName = null;

	@SerializedName("postCode")
	private String postCode = null;

	@SerializedName("postalState")
	private String postalState = null;

	@SerializedName("salesTaxNumber")
	private String salesTaxNumber = null;

	@SerializedName("salutation")
	private String salutation = null;

	@SerializedName("sortingCode")
	private String sortingCode = null;

	@SerializedName("street")
	private String street = null;

	public SpaceAddressCreate city(String city) {
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

	public SpaceAddressCreate country(String country) {
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

	public SpaceAddressCreate dependentLocality(String dependentLocality) {
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

	public SpaceAddressCreate emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	/**
	 * The email address is used within emails and as reply to address.
	 *
	 * @return The email address is used within emails and as reply to address.
	 */
	@ApiModelProperty(example = "null", value = "The email address is used within emails and as reply to address.")
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

	public SpaceAddressCreate givenName(String givenName) {
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

	public SpaceAddressCreate organizationName(String organizationName) {
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

	public SpaceAddressCreate postCode(String postCode) {
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

	public SpaceAddressCreate postalState(String postalState) {
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

	public SpaceAddressCreate salesTaxNumber(String salesTaxNumber) {
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

	public SpaceAddressCreate salutation(String salutation) {
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

	public SpaceAddressCreate sortingCode(String sortingCode) {
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

	public SpaceAddressCreate street(String street) {
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
		SpaceAddressCreate spaceAddressCreate = (SpaceAddressCreate) o;
		return Objects.equals(this.city, spaceAddressCreate.city) &&
				Objects.equals(this.country, spaceAddressCreate.country) &&
				Objects.equals(this.dependentLocality, spaceAddressCreate.dependentLocality) &&
				Objects.equals(this.emailAddress, spaceAddressCreate.emailAddress) &&
				Objects.equals(this.familyName, spaceAddressCreate.familyName) &&
				Objects.equals(this.givenName, spaceAddressCreate.givenName) &&
				Objects.equals(this.organizationName, spaceAddressCreate.organizationName) &&
				Objects.equals(this.postCode, spaceAddressCreate.postCode) &&
				Objects.equals(this.postalState, spaceAddressCreate.postalState) &&
				Objects.equals(this.salesTaxNumber, spaceAddressCreate.salesTaxNumber) &&
				Objects.equals(this.salutation, spaceAddressCreate.salutation) &&
				Objects.equals(this.sortingCode, spaceAddressCreate.sortingCode) &&
				Objects.equals(this.street, spaceAddressCreate.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, dependentLocality, emailAddress, familyName, givenName, organizationName, postCode, postalState, salesTaxNumber, salutation, sortingCode, street);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SpaceAddressCreate {\n");
		
		sb.append("		city: ").append(toIndentedString(city)).append("\n");
		sb.append("		country: ").append(toIndentedString(country)).append("\n");
		sb.append("		dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
		sb.append("		emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("		familyName: ").append(toIndentedString(familyName)).append("\n");
		sb.append("		givenName: ").append(toIndentedString(givenName)).append("\n");
		sb.append("		organizationName: ").append(toIndentedString(organizationName)).append("\n");
		sb.append("		postCode: ").append(toIndentedString(postCode)).append("\n");
		sb.append("		postalState: ").append(toIndentedString(postalState)).append("\n");
		sb.append("		salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
		sb.append("		salutation: ").append(toIndentedString(salutation)).append("\n");
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

