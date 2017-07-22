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
import com.wallee.sdk.model.AbstractSubscriptionProductActive;
import com.wallee.sdk.model.SubscriptionProductState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.
 */
@io.swagger.annotations.ApiModel(description = "A subscription product represents a product to which a subscriber can subscribe to. A product defines how much the subscription costs and in what cycles the subscribe is charged.")
public class SubscriptionProductCreate extends AbstractSubscriptionProductActive {
	@SerializedName("reference")
	private String reference = null;

	public SubscriptionProductCreate reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * The product reference identifies the product for external systems. This field may contain the product's SKU.
	 *
	 * @return The product reference identifies the product for external systems. This field may contain the product's SKU.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The product reference identifies the product for external systems. This field may contain the product's SKU.")
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionProductCreate subscriptionProductCreate = (SubscriptionProductCreate) o;
		return Objects.equals(this.reference, subscriptionProductCreate.reference) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
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

