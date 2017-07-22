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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionProductRetirementCreate {
	@SerializedName("product")
	private Long product = null;

	@SerializedName("respectTerminiationPeriodsEnabled")
	private Boolean respectTerminiationPeriodsEnabled = null;

	@SerializedName("targetProduct")
	private Long targetProduct = null;

	public SubscriptionProductRetirementCreate product(Long product) {
		this.product = product;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public Long getProduct() {
		return product;
	}

	public void setProduct(Long product) {
		this.product = product;
	}

	public SubscriptionProductRetirementCreate respectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
		this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Boolean getRespectTerminiationPeriodsEnabled() {
		return respectTerminiationPeriodsEnabled;
	}

	public void setRespectTerminiationPeriodsEnabled(Boolean respectTerminiationPeriodsEnabled) {
		this.respectTerminiationPeriodsEnabled = respectTerminiationPeriodsEnabled;
	}

	public SubscriptionProductRetirementCreate targetProduct(Long targetProduct) {
		this.targetProduct = targetProduct;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getTargetProduct() {
		return targetProduct;
	}

	public void setTargetProduct(Long targetProduct) {
		this.targetProduct = targetProduct;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionProductRetirementCreate subscriptionProductRetirementCreate = (SubscriptionProductRetirementCreate) o;
		return Objects.equals(this.product, subscriptionProductRetirementCreate.product) &&
				Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductRetirementCreate.respectTerminiationPeriodsEnabled) &&
				Objects.equals(this.targetProduct, subscriptionProductRetirementCreate.targetProduct);
	}

	@Override
	public int hashCode() {
		return Objects.hash(product, respectTerminiationPeriodsEnabled, targetProduct);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductRetirementCreate {\n");
		
		sb.append("		product: ").append(toIndentedString(product)).append("\n");
		sb.append("		respectTerminiationPeriodsEnabled: ").append(toIndentedString(respectTerminiationPeriodsEnabled)).append("\n");
		sb.append("		targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

