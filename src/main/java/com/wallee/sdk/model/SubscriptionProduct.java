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
import com.wallee.sdk.model.SubscriptionProductState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@io.swagger.annotations.ApiModel(description = "A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.")
public class SubscriptionProduct {
	@SerializedName("allowedPaymentMethodConfigurations")
	private List<Long> allowedPaymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("failedPaymentSuspensionPeriod")
	private String failedPaymentSuspensionPeriod = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("spaceId")
	private Long spaceId = null;

	@SerializedName("state")
	private SubscriptionProductState state = null;

	@SerializedName("version")
	private Integer version = null;

	public SubscriptionProduct allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
		return this;
	}

	public SubscriptionProduct addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
		this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed.
	 *
	 * @return The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed.
	 */
	@ApiModelProperty(example = "null", value = "The allowed payment method configurations control which payment methods can be used with this product. When none is selected all methods will be allowed.")
	public List<Long> getAllowedPaymentMethodConfigurations() {
		return allowedPaymentMethodConfigurations;
	}

	public void setAllowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
	}

	/**
	 * When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails.
	 *
	 * @return When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails.
	 */
	@ApiModelProperty(example = "null", value = "When a payment fails, the subscription to which the payment belongs to will be suspended. When the suspension is not removed within the specified period the subscription will be terminated. A payment is considered as failed when the subscriber issues a refund or when a subscription charge fails.")
	public String getFailedPaymentSuspensionPeriod() {
		return failedPaymentSuspensionPeriod;
	}

	public SubscriptionProduct id(Long id) {
		this.id = id;
		return this;
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

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The linked space id holds the ID of the space to which the entity belongs to.")
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 */
	@ApiModelProperty(example = "null", value = "The product name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
	public String getName() {
		return name;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The product reference identifies the product for external systems. This field may contain the product's SKU.
	 *
	 * @return The product reference identifies the product for external systems. This field may contain the product's SKU.
	 */
	@ApiModelProperty(example = "null", value = "The product reference identifies the product for external systems. This field may contain the product's SKU.")
	public String getReference() {
		return reference;
	}

	/**
	 * The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order.
	 *
	 * @return The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order.
	 */
	@ApiModelProperty(example = "null", value = "The sort order controls in which order the product is listed. The sort order is used to order the products in ascending order.")
	public Integer getSortOrder() {
		return sortOrder;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getSpaceId() {
		return spaceId;
	}

	public SubscriptionProduct state(SubscriptionProductState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProductState getState() {
		return state;
	}

	public void setState(SubscriptionProductState state) {
		this.state = state;
	}

	public SubscriptionProduct version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionProduct subscriptionProduct = (SubscriptionProduct) o;
		return Objects.equals(this.allowedPaymentMethodConfigurations, subscriptionProduct.allowedPaymentMethodConfigurations) &&
				Objects.equals(this.failedPaymentSuspensionPeriod, subscriptionProduct.failedPaymentSuspensionPeriod) &&
				Objects.equals(this.id, subscriptionProduct.id) &&
				Objects.equals(this.linkedSpaceId, subscriptionProduct.linkedSpaceId) &&
				Objects.equals(this.name, subscriptionProduct.name) &&
				Objects.equals(this.plannedPurgeDate, subscriptionProduct.plannedPurgeDate) &&
				Objects.equals(this.reference, subscriptionProduct.reference) &&
				Objects.equals(this.sortOrder, subscriptionProduct.sortOrder) &&
				Objects.equals(this.spaceId, subscriptionProduct.spaceId) &&
				Objects.equals(this.state, subscriptionProduct.state) &&
				Objects.equals(this.version, subscriptionProduct.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, id, linkedSpaceId, name, plannedPurgeDate, reference, sortOrder, spaceId, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProduct {\n");
		
		sb.append("		allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
		sb.append("		failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
		sb.append("		spaceId: ").append(toIndentedString(spaceId)).append("\n");
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

