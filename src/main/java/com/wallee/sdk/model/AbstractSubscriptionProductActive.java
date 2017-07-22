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

/**
 * AbstractSubscriptionProductActive
 */
public class AbstractSubscriptionProductActive {
	@SerializedName("allowedPaymentMethodConfigurations")
	private List<Long> allowedPaymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("failedPaymentSuspensionPeriod")
	private String failedPaymentSuspensionPeriod = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("state")
	private SubscriptionProductState state = null;

	public AbstractSubscriptionProductActive allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
		return this;
	}

	public AbstractSubscriptionProductActive addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
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

	public AbstractSubscriptionProductActive failedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
		this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
		return this;
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

	public void setFailedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
		this.failedPaymentSuspensionPeriod = failedPaymentSuspensionPeriod;
	}

	public AbstractSubscriptionProductActive name(String name) {
		this.name = name;
		return this;
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

	public void setName(String name) {
		this.name = name;
	}

	public AbstractSubscriptionProductActive sortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
		return this;
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

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public AbstractSubscriptionProductActive state(SubscriptionProductState state) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbstractSubscriptionProductActive abstractSubscriptionProductActive = (AbstractSubscriptionProductActive) o;
		return Objects.equals(this.allowedPaymentMethodConfigurations, abstractSubscriptionProductActive.allowedPaymentMethodConfigurations) &&
				Objects.equals(this.failedPaymentSuspensionPeriod, abstractSubscriptionProductActive.failedPaymentSuspensionPeriod) &&
				Objects.equals(this.name, abstractSubscriptionProductActive.name) &&
				Objects.equals(this.sortOrder, abstractSubscriptionProductActive.sortOrder) &&
				Objects.equals(this.state, abstractSubscriptionProductActive.state);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allowedPaymentMethodConfigurations, failedPaymentSuspensionPeriod, name, sortOrder, state);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbstractSubscriptionProductActive {\n");
		
		sb.append("		allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
		sb.append("		failedPaymentSuspensionPeriod: ").append(toIndentedString(failedPaymentSuspensionPeriod)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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

