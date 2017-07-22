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
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.DataCollectionType;
import com.wallee.sdk.model.Feature;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.PaymentPrimaryRiskTaker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class PaymentConnector {
	@SerializedName("dataCollectionType")
	private DataCollectionType dataCollectionType = null;

	@SerializedName("description")
	private Map<String, String> description = new HashMap<String, String>();

	@SerializedName("feature")
	private Feature feature = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private Map<String, String> name = new HashMap<String, String>();

	@SerializedName("paymentMethod")
	private Long paymentMethod = null;

	@SerializedName("paymentMethodBrand")
	private PaymentMethodBrand paymentMethodBrand = null;

	@SerializedName("primaryRiskTaker")
	private PaymentPrimaryRiskTaker primaryRiskTaker = null;

	@SerializedName("processor")
	private Long processor = null;

	@SerializedName("supportedCustomersPresences")
	private List<CustomersPresence> supportedCustomersPresences = new ArrayList<CustomersPresence>();

	@SerializedName("supportedFeatures")
	private List<Long> supportedFeatures = new ArrayList<Long>();

	public PaymentConnector dataCollectionType(DataCollectionType dataCollectionType) {
		this.dataCollectionType = dataCollectionType;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DataCollectionType getDataCollectionType() {
		return dataCollectionType;
	}

	public void setDataCollectionType(DataCollectionType dataCollectionType) {
		this.dataCollectionType = dataCollectionType;
	}

	public PaymentConnector description(Map<String, String> description) {
		this.description = description;
		return this;
	}

	public PaymentConnector putDescriptionItem(String key, String descriptionItem) {
		this.description.put(key, descriptionItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, String> getDescription() {
		return description;
	}

	public void setDescription(Map<String, String> description) {
		this.description = description;
	}

	public PaymentConnector feature(Feature feature) {
		this.feature = feature;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public PaymentConnector name(Map<String, String> name) {
		this.name = name;
		return this;
	}

	public PaymentConnector putNameItem(String key, String nameItem) {
		this.name.put(key, nameItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getPaymentMethod() {
		return paymentMethod;
	}

	public PaymentConnector paymentMethodBrand(PaymentMethodBrand paymentMethodBrand) {
		this.paymentMethodBrand = paymentMethodBrand;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public PaymentMethodBrand getPaymentMethodBrand() {
		return paymentMethodBrand;
	}

	public void setPaymentMethodBrand(PaymentMethodBrand paymentMethodBrand) {
		this.paymentMethodBrand = paymentMethodBrand;
	}

	public PaymentConnector primaryRiskTaker(PaymentPrimaryRiskTaker primaryRiskTaker) {
		this.primaryRiskTaker = primaryRiskTaker;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public PaymentPrimaryRiskTaker getPrimaryRiskTaker() {
		return primaryRiskTaker;
	}

	public void setPrimaryRiskTaker(PaymentPrimaryRiskTaker primaryRiskTaker) {
		this.primaryRiskTaker = primaryRiskTaker;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getProcessor() {
		return processor;
	}

	public PaymentConnector supportedCustomersPresences(List<CustomersPresence> supportedCustomersPresences) {
		this.supportedCustomersPresences = supportedCustomersPresences;
		return this;
	}

	public PaymentConnector addSupportedCustomersPresencesItem(CustomersPresence supportedCustomersPresencesItem) {
		this.supportedCustomersPresences.add(supportedCustomersPresencesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<CustomersPresence> getSupportedCustomersPresences() {
		return supportedCustomersPresences;
	}

	public void setSupportedCustomersPresences(List<CustomersPresence> supportedCustomersPresences) {
		this.supportedCustomersPresences = supportedCustomersPresences;
	}

	public PaymentConnector supportedFeatures(List<Long> supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
		return this;
	}

	public PaymentConnector addSupportedFeaturesItem(Long supportedFeaturesItem) {
		this.supportedFeatures.add(supportedFeaturesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Long> getSupportedFeatures() {
		return supportedFeatures;
	}

	public void setSupportedFeatures(List<Long> supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentConnector paymentConnector = (PaymentConnector) o;
		return Objects.equals(this.dataCollectionType, paymentConnector.dataCollectionType) &&
				Objects.equals(this.description, paymentConnector.description) &&
				Objects.equals(this.feature, paymentConnector.feature) &&
				Objects.equals(this.id, paymentConnector.id) &&
				Objects.equals(this.name, paymentConnector.name) &&
				Objects.equals(this.paymentMethod, paymentConnector.paymentMethod) &&
				Objects.equals(this.paymentMethodBrand, paymentConnector.paymentMethodBrand) &&
				Objects.equals(this.primaryRiskTaker, paymentConnector.primaryRiskTaker) &&
				Objects.equals(this.processor, paymentConnector.processor) &&
				Objects.equals(this.supportedCustomersPresences, paymentConnector.supportedCustomersPresences) &&
				Objects.equals(this.supportedFeatures, paymentConnector.supportedFeatures);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCollectionType, description, feature, id, name, paymentMethod, paymentMethodBrand, primaryRiskTaker, processor, supportedCustomersPresences, supportedFeatures);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentConnector {\n");
		
		sb.append("		dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		feature: ").append(toIndentedString(feature)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
		sb.append("		paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
		sb.append("		primaryRiskTaker: ").append(toIndentedString(primaryRiskTaker)).append("\n");
		sb.append("		processor: ").append(toIndentedString(processor)).append("\n");
		sb.append("		supportedCustomersPresences: ").append(toIndentedString(supportedCustomersPresences)).append("\n");
		sb.append("		supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
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

