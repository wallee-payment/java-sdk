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
public class SpaceAddress {
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
	public String getCountry() {
		return country;
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
	 * The email address is used within emails and as reply to address.
	 *
	 * @return The email address is used within emails and as reply to address.
	 */
	@ApiModelProperty(example = "null", value = "The email address is used within emails and as reply to address.")
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getGivenName() {
		return givenName;
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
		SpaceAddress spaceAddress = (SpaceAddress) o;
		return Objects.equals(this.city, spaceAddress.city) &&
				Objects.equals(this.country, spaceAddress.country) &&
				Objects.equals(this.dependentLocality, spaceAddress.dependentLocality) &&
				Objects.equals(this.emailAddress, spaceAddress.emailAddress) &&
				Objects.equals(this.familyName, spaceAddress.familyName) &&
				Objects.equals(this.givenName, spaceAddress.givenName) &&
				Objects.equals(this.organizationName, spaceAddress.organizationName) &&
				Objects.equals(this.postCode, spaceAddress.postCode) &&
				Objects.equals(this.postalState, spaceAddress.postalState) &&
				Objects.equals(this.salesTaxNumber, spaceAddress.salesTaxNumber) &&
				Objects.equals(this.salutation, spaceAddress.salutation) &&
				Objects.equals(this.sortingCode, spaceAddress.sortingCode) &&
				Objects.equals(this.street, spaceAddress.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, dependentLocality, emailAddress, familyName, givenName, organizationName, postCode, postalState, salesTaxNumber, salutation, sortingCode, street);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SpaceAddress {\n");
		
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

