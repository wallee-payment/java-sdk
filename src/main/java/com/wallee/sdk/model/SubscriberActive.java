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
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SubscriberUpdate;
import java.util.List;
import java.util.Map;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
public class SubscriberActive extends SubscriberUpdate {

	@SerializedName("state")
	private CreationEntityState state = null;

	public SubscriberActive state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	@Override
	public SubscriberActive id(Long id) {
		super.id(id);
		return this;
	}

	@Override
	public SubscriberActive version(Long version) {
		super.version(version);
		return this;
	}

	@Override
	public SubscriberActive additionalAllowedPaymentMethodConfigurations(List<Long> additionalAllowedPaymentMethodConfigurations) {
		super.additionalAllowedPaymentMethodConfigurations(additionalAllowedPaymentMethodConfigurations);
		return this;
	}

	@Override
	public SubscriberActive addAdditionalAllowedPaymentMethodConfigurationsItem(Long additionalAllowedPaymentMethodConfigurationsItem) {
		super.addAdditionalAllowedPaymentMethodConfigurationsItem(additionalAllowedPaymentMethodConfigurationsItem);
		return this;
	}

	@Override
	public SubscriberActive billingAddress(AddressCreate billingAddress) {
		super.billingAddress(billingAddress);
		return this;
	}

	@Override
	public SubscriberActive description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public SubscriberActive disallowedPaymentMethodConfigurations(List<Long> disallowedPaymentMethodConfigurations) {
		super.disallowedPaymentMethodConfigurations(disallowedPaymentMethodConfigurations);
		return this;
	}

	@Override
	public SubscriberActive addDisallowedPaymentMethodConfigurationsItem(Long disallowedPaymentMethodConfigurationsItem) {
		super.addDisallowedPaymentMethodConfigurationsItem(disallowedPaymentMethodConfigurationsItem);
		return this;
	}

	@Override
	public SubscriberActive emailAddress(String emailAddress) {
		super.emailAddress(emailAddress);
		return this;
	}

	@Override
	public SubscriberActive language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public SubscriberActive metaData(Map<String, String> metaData) {
		super.metaData(metaData);
		return this;
	}

	@Override
	public SubscriberActive putMetaDataItem(String key, String metaDataItem) {
		super.putMetaDataItem(key, metaDataItem);
		return this;
	}

	@Override
	public SubscriberActive reference(String reference) {
		super.reference(reference);
		return this;
	}

	@Override
	public SubscriberActive shippingAddress(AddressCreate shippingAddress) {
		super.shippingAddress(shippingAddress);
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
		SubscriberActive subscriberActive = (SubscriberActive) o;
		return Objects.equals(this.state, subscriberActive.state) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(state, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriberActive {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
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

