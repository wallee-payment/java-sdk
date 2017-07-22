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
import java.math.BigDecimal;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class LineItemReduction {
	@SerializedName("lineItemUniqueId")
	private String lineItemUniqueId = null;

	@SerializedName("quantityReduction")
	private BigDecimal quantityReduction = null;

	@SerializedName("unitPriceReduction")
	private BigDecimal unitPriceReduction = null;

	/**
	 * The unique id identifies the line item on which the reduction is applied on.
	 *
	 * @return The unique id identifies the line item on which the reduction is applied on.
	 */
	@ApiModelProperty(example = "null", value = "The unique id identifies the line item on which the reduction is applied on.")
	public String getLineItemUniqueId() {
		return lineItemUniqueId;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getQuantityReduction() {
		return quantityReduction;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getUnitPriceReduction() {
		return unitPriceReduction;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineItemReduction lineItemReduction = (LineItemReduction) o;
		return Objects.equals(this.lineItemUniqueId, lineItemReduction.lineItemUniqueId) &&
				Objects.equals(this.quantityReduction, lineItemReduction.quantityReduction) &&
				Objects.equals(this.unitPriceReduction, lineItemReduction.unitPriceReduction);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lineItemUniqueId, quantityReduction, unitPriceReduction);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineItemReduction {\n");
		
		sb.append("		lineItemUniqueId: ").append(toIndentedString(lineItemUniqueId)).append("\n");
		sb.append("		quantityReduction: ").append(toIndentedString(quantityReduction)).append("\n");
		sb.append("		unitPriceReduction: ").append(toIndentedString(unitPriceReduction)).append("\n");
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

