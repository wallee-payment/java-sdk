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
import com.wallee.sdk.model.AbstractSubscriptionProductActive;
import com.wallee.sdk.model.SubscriptionProductState;
import java.util.List;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
public class SubscriptionProductActive extends AbstractSubscriptionProductActive {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	public SubscriptionProductActive id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SubscriptionProductActive version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public SubscriptionProductActive allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		super.allowedPaymentMethodConfigurations(allowedPaymentMethodConfigurations);
		return this;
	}

	@Override
	public SubscriptionProductActive addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
		super.addAllowedPaymentMethodConfigurationsItem(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	@Override
	public SubscriptionProductActive failedPaymentSuspensionPeriod(String failedPaymentSuspensionPeriod) {
		super.failedPaymentSuspensionPeriod(failedPaymentSuspensionPeriod);
		return this;
	}

	@Override
	public SubscriptionProductActive name(String name) {
		super.name(name);
		return this;
	}

	@Override
	public SubscriptionProductActive sortOrder(Integer sortOrder) {
		super.sortOrder(sortOrder);
		return this;
	}

	@Override
	public SubscriptionProductActive state(SubscriptionProductState state) {
		super.state(state);
		return this;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionProductActive subscriptionProductActive = (SubscriptionProductActive) o;
		return Objects.equals(this.id, subscriptionProductActive.id) &&
				Objects.equals(this.version, subscriptionProductActive.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductActive {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
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

