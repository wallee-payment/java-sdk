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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentProcessor
 */
public class PaymentProcessor {

	@SerializedName("companyName")
	private Map<String, String> companyName = new HashMap<String, String>();

	@SerializedName("description")
	private Map<String, String> description = new HashMap<String, String>();

	@SerializedName("feature")
	private Long feature = null;

	@SerializedName("headquartersLocation")
	private Map<String, String> headquartersLocation = new HashMap<String, String>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("logoPath")
	private String logoPath = null;

	@SerializedName("name")
	private Map<String, String> name = new HashMap<String, String>();

	@SerializedName("productName")
	private Map<String, String> productName = new HashMap<String, String>();

	/**
	 * companyName
	 *
	 * @return companyName
	 */
	public Map<String, String> getCompanyName() {
		return companyName;
	}

	/**
	 * description
	 *
	 * @return description
	 */
	public Map<String, String> getDescription() {
		return description;
	}

	/**
	 * feature
	 *
	 * @return feature
	 */
	public Long getFeature() {
		return feature;
	}

	/**
	 * headquartersLocation
	 *
	 * @return headquartersLocation
	 */
	public Map<String, String> getHeadquartersLocation() {
		return headquartersLocation;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * logoPath
	 *
	 * @return logoPath
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * name
	 *
	 * @return name
	 */
	public Map<String, String> getName() {
		return name;
	}

	/**
	 * productName
	 *
	 * @return productName
	 */
	public Map<String, String> getProductName() {
		return productName;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentProcessor paymentProcessor = (PaymentProcessor) o;
		return Objects.equals(this.companyName, paymentProcessor.companyName) &&
				Objects.equals(this.description, paymentProcessor.description) &&
				Objects.equals(this.feature, paymentProcessor.feature) &&
				Objects.equals(this.headquartersLocation, paymentProcessor.headquartersLocation) &&
				Objects.equals(this.id, paymentProcessor.id) &&
				Objects.equals(this.logoPath, paymentProcessor.logoPath) &&
				Objects.equals(this.name, paymentProcessor.name) &&
				Objects.equals(this.productName, paymentProcessor.productName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyName, description, feature, headquartersLocation, id, logoPath, name, productName);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentProcessor {\n");
		
		sb.append("		companyName: ").append(toIndentedString(companyName)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		feature: ").append(toIndentedString(feature)).append("\n");
		sb.append("		headquartersLocation: ").append(toIndentedString(headquartersLocation)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		logoPath: ").append(toIndentedString(logoPath)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		productName: ").append(toIndentedString(productName)).append("\n");
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

