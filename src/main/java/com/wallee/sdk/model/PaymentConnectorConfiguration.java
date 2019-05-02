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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.PaymentProcessorConfiguration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentConnectorConfiguration
 */
public class PaymentConnectorConfiguration {

	@SerializedName("applicableForTransactionProcessing")
	private Boolean applicableForTransactionProcessing = null;

	@SerializedName("conditions")
	private List<Long> conditions = new ArrayList<Long>();

	@SerializedName("connector")
	private Long connector = null;

	@SerializedName("enabledSpaceViews")
	private List<Long> enabledSpaceViews = new ArrayList<Long>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("paymentMethodConfiguration")
	private PaymentMethodConfiguration paymentMethodConfiguration = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("priority")
	private Integer priority = null;

	@SerializedName("processorConfiguration")
	private PaymentProcessorConfiguration processorConfiguration = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * This property indicates if the connector is currently used for processing transactions. In case either the payment method configuration or the processor configuration is not active the connector will not be used even though the connector state is active.
	 *
	 * @return This property indicates if the connector is currently used for processing transactions. In case either the payment method configuration or the processor configuration is not active the connector will not be used even though the connector state is active.
	 */
	public Boolean getApplicableForTransactionProcessing() {
		return applicableForTransactionProcessing;
	}

	/**
	 * If a transaction meet all selected conditions the connector configuration will be used to process the transaction otherwise the next connector configuration in line will be chosen according to the priorities.
	 *
	 * @return If a transaction meet all selected conditions the connector configuration will be used to process the transaction otherwise the next connector configuration in line will be chosen according to the priorities.
	 */
	public List<Long> getConditions() {
		return conditions;
	}

	/**
	 * connector
	 *
	 * @return connector
	 */
	public Long getConnector() {
		return connector;
	}

	/**
	 * The connector configuration is only enabled for the selected space views. In case the set is empty the connector configuration is enabled for all space views.
	 *
	 * @return The connector configuration is only enabled for the selected space views. In case the set is empty the connector configuration is enabled for all space views.
	 */
	public List<Long> getEnabledSpaceViews() {
		return enabledSpaceViews;
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
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The connector configuration name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The connector configuration name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 */
	public String getName() {
		return name;
	}

	/**
	 * paymentMethodConfiguration
	 *
	 * @return paymentMethodConfiguration
	 */
	public PaymentMethodConfiguration getPaymentMethodConfiguration() {
		return paymentMethodConfiguration;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The priority will define the order of choice of the connector configurations. The lower the value, the higher the priority is going to be. This value can also be a negative number in case you are adding a new configuration that you want to have a high priority and you dont want to change the priority of all the other configurations.
	 *
	 * @return The priority will define the order of choice of the connector configurations. The lower the value, the higher the priority is going to be. This value can also be a negative number in case you are adding a new configuration that you want to have a high priority and you dont want to change the priority of all the other configurations.
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * processorConfiguration
	 *
	 * @return processorConfiguration
	 */
	public PaymentProcessorConfiguration getProcessorConfiguration() {
		return processorConfiguration;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Integer getVersion() {
		return version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentConnectorConfiguration paymentConnectorConfiguration = (PaymentConnectorConfiguration) o;
		return Objects.equals(this.applicableForTransactionProcessing, paymentConnectorConfiguration.applicableForTransactionProcessing) &&
				Objects.equals(this.conditions, paymentConnectorConfiguration.conditions) &&
				Objects.equals(this.connector, paymentConnectorConfiguration.connector) &&
				Objects.equals(this.enabledSpaceViews, paymentConnectorConfiguration.enabledSpaceViews) &&
				Objects.equals(this.id, paymentConnectorConfiguration.id) &&
				Objects.equals(this.linkedSpaceId, paymentConnectorConfiguration.linkedSpaceId) &&
				Objects.equals(this.name, paymentConnectorConfiguration.name) &&
				Objects.equals(this.paymentMethodConfiguration, paymentConnectorConfiguration.paymentMethodConfiguration) &&
				Objects.equals(this.plannedPurgeDate, paymentConnectorConfiguration.plannedPurgeDate) &&
				Objects.equals(this.priority, paymentConnectorConfiguration.priority) &&
				Objects.equals(this.processorConfiguration, paymentConnectorConfiguration.processorConfiguration) &&
				Objects.equals(this.state, paymentConnectorConfiguration.state) &&
				Objects.equals(this.version, paymentConnectorConfiguration.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicableForTransactionProcessing, conditions, connector, enabledSpaceViews, id, linkedSpaceId, name, paymentMethodConfiguration, plannedPurgeDate, priority, processorConfiguration, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentConnectorConfiguration {\n");
		
		sb.append("		applicableForTransactionProcessing: ").append(toIndentedString(applicableForTransactionProcessing)).append("\n");
		sb.append("		conditions: ").append(toIndentedString(conditions)).append("\n");
		sb.append("		connector: ").append(toIndentedString(connector)).append("\n");
		sb.append("		enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		paymentMethodConfiguration: ").append(toIndentedString(paymentMethodConfiguration)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("		processorConfiguration: ").append(toIndentedString(processorConfiguration)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
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

