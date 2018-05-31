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
import com.wallee.sdk.model.DataCollectionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentMethod
 */
public class PaymentMethod {

	@SerializedName("dataCollectionTypes")
	private List<DataCollectionType> dataCollectionTypes = new ArrayList<DataCollectionType>();

	@SerializedName("description")
	private Map<String, String> description = new HashMap<String, String>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("imagePath")
	private String imagePath = null;

	@SerializedName("merchantDescription")
	private Map<String, String> merchantDescription = new HashMap<String, String>();

	@SerializedName("name")
	private Map<String, String> name = new HashMap<String, String>();

	@SerializedName("supportedCurrencies")
	private List<String> supportedCurrencies = new ArrayList<String>();

	/**
	 * dataCollectionTypes
	 *
	 * @return dataCollectionTypes
	 */
	public List<DataCollectionType> getDataCollectionTypes() {
		return dataCollectionTypes;
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
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * imagePath
	 *
	 * @return imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * merchantDescription
	 *
	 * @return merchantDescription
	 */
	public Map<String, String> getMerchantDescription() {
		return merchantDescription;
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
	 * supportedCurrencies
	 *
	 * @return supportedCurrencies
	 */
	public List<String> getSupportedCurrencies() {
		return supportedCurrencies;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentMethod paymentMethod = (PaymentMethod) o;
		return Objects.equals(this.dataCollectionTypes, paymentMethod.dataCollectionTypes) &&
				Objects.equals(this.description, paymentMethod.description) &&
				Objects.equals(this.id, paymentMethod.id) &&
				Objects.equals(this.imagePath, paymentMethod.imagePath) &&
				Objects.equals(this.merchantDescription, paymentMethod.merchantDescription) &&
				Objects.equals(this.name, paymentMethod.name) &&
				Objects.equals(this.supportedCurrencies, paymentMethod.supportedCurrencies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCollectionTypes, description, id, imagePath, merchantDescription, name, supportedCurrencies);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentMethod {\n");
		
		sb.append("		dataCollectionTypes: ").append(toIndentedString(dataCollectionTypes)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		imagePath: ").append(toIndentedString(imagePath)).append("\n");
		sb.append("		merchantDescription: ").append(toIndentedString(merchantDescription)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
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

