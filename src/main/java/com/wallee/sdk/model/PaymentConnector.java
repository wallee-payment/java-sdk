/**
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
 *
 * @author   customweb GmbH (www.customweb.com)
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.DataCollectionType;
import com.wallee.sdk.model.Feature;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.PaymentPrimaryRiskTaker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentConnector
 */
public class PaymentConnector {

	@SerializedName("dataCollectionType")
	private DataCollectionType dataCollectionType = null;

	@SerializedName("deprecated")
	private Boolean deprecated = null;

	@SerializedName("deprecationReason")
	private Map<String, String> deprecationReason = new HashMap<String, String>();

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

	/**
	 * dataCollectionType
	 *
	 * @return dataCollectionType
	 */
	public DataCollectionType getDataCollectionType() {
		return dataCollectionType;
	}

	/**
	 * deprecated
	 *
	 * @return deprecated
	 */
	public Boolean getDeprecated() {
		return deprecated;
	}

	/**
	 * deprecationReason
	 *
	 * @return deprecationReason
	 */
	public Map<String, String> getDeprecationReason() {
		return deprecationReason;
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
	public Feature getFeature() {
		return feature;
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
	 * name
	 *
	 * @return name
	 */
	public Map<String, String> getName() {
		return name;
	}

	/**
	 * paymentMethod
	 *
	 * @return paymentMethod
	 */
	public Long getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * paymentMethodBrand
	 *
	 * @return paymentMethodBrand
	 */
	public PaymentMethodBrand getPaymentMethodBrand() {
		return paymentMethodBrand;
	}

	/**
	 * primaryRiskTaker
	 *
	 * @return primaryRiskTaker
	 */
	public PaymentPrimaryRiskTaker getPrimaryRiskTaker() {
		return primaryRiskTaker;
	}

	/**
	 * processor
	 *
	 * @return processor
	 */
	public Long getProcessor() {
		return processor;
	}

	/**
	 * supportedCustomersPresences
	 *
	 * @return supportedCustomersPresences
	 */
	public List<CustomersPresence> getSupportedCustomersPresences() {
		return supportedCustomersPresences;
	}

	/**
	 * supportedFeatures
	 *
	 * @return supportedFeatures
	 */
	public List<Long> getSupportedFeatures() {
		return supportedFeatures;
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
				Objects.equals(this.deprecated, paymentConnector.deprecated) &&
				Objects.equals(this.deprecationReason, paymentConnector.deprecationReason) &&
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
		return Objects.hash(dataCollectionType, deprecated, deprecationReason, description, feature, id, name, paymentMethod, paymentMethodBrand, primaryRiskTaker, processor, supportedCustomersPresences, supportedFeatures);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentConnector {\n");
		
		sb.append("		dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
		sb.append("		deprecated: ").append(toIndentedString(deprecated)).append("\n");
		sb.append("		deprecationReason: ").append(toIndentedString(deprecationReason)).append("\n");
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

