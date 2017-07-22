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
import com.wallee.sdk.model.SubscriptionPending;
import com.wallee.sdk.model.SubscriptionProduct;
import com.wallee.sdk.model.SubscriptionProductComponentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The subscription create request holds all the data required to create a new subscription.
 */
@io.swagger.annotations.ApiModel(description = "The subscription create request holds all the data required to create a new subscription.")
public class SubscriptionCreateRequest {
	@SerializedName("currency")
	private String currency = null;

	@SerializedName("product")
	private SubscriptionProduct product = null;

	@SerializedName("selectedComponents")
	private List<SubscriptionProductComponentReference> selectedComponents = new ArrayList<SubscriptionProductComponentReference>();

	@SerializedName("subscription")
	private SubscriptionPending subscription = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public String getCurrency() {
		return currency;
	}

	public SubscriptionCreateRequest product(SubscriptionProduct product) {
		this.product = product;
		return this;
	}

	/**
	 * The subscription has to be linked with a product.
	 *
	 * @return The subscription has to be linked with a product.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The subscription has to be linked with a product.")
	public SubscriptionProduct getProduct() {
		return product;
	}

	public void setProduct(SubscriptionProduct product) {
		this.product = product;
	}

	public SubscriptionCreateRequest selectedComponents(List<SubscriptionProductComponentReference> selectedComponents) {
		this.selectedComponents = selectedComponents;
		return this;
	}

	public SubscriptionCreateRequest addSelectedComponentsItem(SubscriptionProductComponentReference selectedComponentsItem) {
		this.selectedComponents.add(selectedComponentsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<SubscriptionProductComponentReference> getSelectedComponents() {
		return selectedComponents;
	}

	public void setSelectedComponents(List<SubscriptionProductComponentReference> selectedComponents) {
		this.selectedComponents = selectedComponents;
	}

	public SubscriptionCreateRequest subscription(SubscriptionPending subscription) {
		this.subscription = subscription;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public SubscriptionPending getSubscription() {
		return subscription;
	}

	public void setSubscription(SubscriptionPending subscription) {
		this.subscription = subscription;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionCreateRequest subscriptionCreateRequest = (SubscriptionCreateRequest) o;
		return Objects.equals(this.currency, subscriptionCreateRequest.currency) &&
				Objects.equals(this.product, subscriptionCreateRequest.product) &&
				Objects.equals(this.selectedComponents, subscriptionCreateRequest.selectedComponents) &&
				Objects.equals(this.subscription, subscriptionCreateRequest.subscription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, product, selectedComponents, subscription);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionCreateRequest {\n");
		
		sb.append("		currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("		product: ").append(toIndentedString(product)).append("\n");
		sb.append("		selectedComponents: ").append(toIndentedString(selectedComponents)).append("\n");
		sb.append("		subscription: ").append(toIndentedString(subscription)).append("\n");
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

