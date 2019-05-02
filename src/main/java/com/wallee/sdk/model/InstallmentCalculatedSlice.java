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
import com.wallee.sdk.model.LineItem;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * InstallmentCalculatedSlice
 */
public class InstallmentCalculatedSlice {

	@SerializedName("amountIncludingTax")
	private BigDecimal amountIncludingTax = null;

	@SerializedName("dueOn")
	private OffsetDateTime dueOn = null;

	@SerializedName("lineItems")
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	/**
	 * amountIncludingTax
	 *
	 * @return amountIncludingTax
	 */
	public BigDecimal getAmountIncludingTax() {
		return amountIncludingTax;
	}

	/**
	 * dueOn
	 *
	 * @return dueOn
	 */
	public OffsetDateTime getDueOn() {
		return dueOn;
	}

	/**
	 * lineItems
	 *
	 * @return lineItems
	 */
	public List<LineItem> getLineItems() {
		return lineItems;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InstallmentCalculatedSlice installmentCalculatedSlice = (InstallmentCalculatedSlice) o;
		return Objects.equals(this.amountIncludingTax, installmentCalculatedSlice.amountIncludingTax) &&
				Objects.equals(this.dueOn, installmentCalculatedSlice.dueOn) &&
				Objects.equals(this.lineItems, installmentCalculatedSlice.lineItems);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountIncludingTax, dueOn, lineItems);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InstallmentCalculatedSlice {\n");
		
		sb.append("		amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
		sb.append("		dueOn: ").append(toIndentedString(dueOn)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

