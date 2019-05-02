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
import com.wallee.sdk.model.LineItemAttribute;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.Tax;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LineItem
 */
public class LineItem {

	@SerializedName("aggregatedTaxRate")
	private BigDecimal aggregatedTaxRate = null;

	@SerializedName("amountExcludingTax")
	private BigDecimal amountExcludingTax = null;

	@SerializedName("amountIncludingTax")
	private BigDecimal amountIncludingTax = null;

	@SerializedName("attributes")
	private Map<String, LineItemAttribute> attributes = new HashMap<String, LineItemAttribute>();

	@SerializedName("discountExcludingTax")
	private BigDecimal discountExcludingTax = null;

	@SerializedName("discountIncludingTax")
	private BigDecimal discountIncludingTax = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("quantity")
	private BigDecimal quantity = null;

	@SerializedName("shippingRequired")
	private Boolean shippingRequired = null;

	@SerializedName("sku")
	private String sku = null;

	@SerializedName("taxAmount")
	private BigDecimal taxAmount = null;

	@SerializedName("taxAmountPerUnit")
	private BigDecimal taxAmountPerUnit = null;

	@SerializedName("taxes")
	private List<Tax> taxes = new ArrayList<Tax>();

	@SerializedName("type")
	private LineItemType type = null;

	@SerializedName("undiscountedAmountExcludingTax")
	private BigDecimal undiscountedAmountExcludingTax = null;

	@SerializedName("undiscountedAmountIncludingTax")
	private BigDecimal undiscountedAmountIncludingTax = null;

	@SerializedName("uniqueId")
	private String uniqueId = null;

	@SerializedName("unitPriceExcludingTax")
	private BigDecimal unitPriceExcludingTax = null;

	@SerializedName("unitPriceIncludingTax")
	private BigDecimal unitPriceIncludingTax = null;

	/**
	 * The aggregated tax rate is the sum of all tax rates of the line item.
	 *
	 * @return The aggregated tax rate is the sum of all tax rates of the line item.
	 */
	public BigDecimal getAggregatedTaxRate() {
		return aggregatedTaxRate;
	}

	/**
	 * amountExcludingTax
	 *
	 * @return amountExcludingTax
	 */
	public BigDecimal getAmountExcludingTax() {
		return amountExcludingTax;
	}

	/**
	 * amountIncludingTax
	 *
	 * @return amountIncludingTax
	 */
	public BigDecimal getAmountIncludingTax() {
		return amountIncludingTax;
	}

	/**
	 * attributes
	 *
	 * @return attributes
	 */
	public Map<String, LineItemAttribute> getAttributes() {
		return attributes;
	}

	/**
	 * discountExcludingTax
	 *
	 * @return discountExcludingTax
	 */
	public BigDecimal getDiscountExcludingTax() {
		return discountExcludingTax;
	}

	/**
	 * discountIncludingTax
	 *
	 * @return discountIncludingTax
	 */
	public BigDecimal getDiscountIncludingTax() {
		return discountIncludingTax;
	}

	/**
	 * name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * quantity
	 *
	 * @return quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * shippingRequired
	 *
	 * @return shippingRequired
	 */
	public Boolean getShippingRequired() {
		return shippingRequired;
	}

	/**
	 * sku
	 *
	 * @return sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * taxAmount
	 *
	 * @return taxAmount
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * taxAmountPerUnit
	 *
	 * @return taxAmountPerUnit
	 */
	public BigDecimal getTaxAmountPerUnit() {
		return taxAmountPerUnit;
	}

	/**
	 * taxes
	 *
	 * @return taxes
	 */
	public List<Tax> getTaxes() {
		return taxes;
	}

	/**
	 * type
	 *
	 * @return type
	 */
	public LineItemType getType() {
		return type;
	}

	/**
	 * undiscountedAmountExcludingTax
	 *
	 * @return undiscountedAmountExcludingTax
	 */
	public BigDecimal getUndiscountedAmountExcludingTax() {
		return undiscountedAmountExcludingTax;
	}

	/**
	 * undiscountedAmountIncludingTax
	 *
	 * @return undiscountedAmountIncludingTax
	 */
	public BigDecimal getUndiscountedAmountIncludingTax() {
		return undiscountedAmountIncludingTax;
	}

	/**
	 * The unique id identifies the line item within the set of line items associated with the transaction.
	 *
	 * @return The unique id identifies the line item within the set of line items associated with the transaction.
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * unitPriceExcludingTax
	 *
	 * @return unitPriceExcludingTax
	 */
	public BigDecimal getUnitPriceExcludingTax() {
		return unitPriceExcludingTax;
	}

	/**
	 * unitPriceIncludingTax
	 *
	 * @return unitPriceIncludingTax
	 */
	public BigDecimal getUnitPriceIncludingTax() {
		return unitPriceIncludingTax;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineItem lineItem = (LineItem) o;
		return Objects.equals(this.aggregatedTaxRate, lineItem.aggregatedTaxRate) &&
				Objects.equals(this.amountExcludingTax, lineItem.amountExcludingTax) &&
				Objects.equals(this.amountIncludingTax, lineItem.amountIncludingTax) &&
				Objects.equals(this.attributes, lineItem.attributes) &&
				Objects.equals(this.discountExcludingTax, lineItem.discountExcludingTax) &&
				Objects.equals(this.discountIncludingTax, lineItem.discountIncludingTax) &&
				Objects.equals(this.name, lineItem.name) &&
				Objects.equals(this.quantity, lineItem.quantity) &&
				Objects.equals(this.shippingRequired, lineItem.shippingRequired) &&
				Objects.equals(this.sku, lineItem.sku) &&
				Objects.equals(this.taxAmount, lineItem.taxAmount) &&
				Objects.equals(this.taxAmountPerUnit, lineItem.taxAmountPerUnit) &&
				Objects.equals(this.taxes, lineItem.taxes) &&
				Objects.equals(this.type, lineItem.type) &&
				Objects.equals(this.undiscountedAmountExcludingTax, lineItem.undiscountedAmountExcludingTax) &&
				Objects.equals(this.undiscountedAmountIncludingTax, lineItem.undiscountedAmountIncludingTax) &&
				Objects.equals(this.uniqueId, lineItem.uniqueId) &&
				Objects.equals(this.unitPriceExcludingTax, lineItem.unitPriceExcludingTax) &&
				Objects.equals(this.unitPriceIncludingTax, lineItem.unitPriceIncludingTax);
	}

	@Override
	public int hashCode() {
		return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, attributes, discountExcludingTax, discountIncludingTax, name, quantity, shippingRequired, sku, taxAmount, taxAmountPerUnit, taxes, type, undiscountedAmountExcludingTax, undiscountedAmountIncludingTax, uniqueId, unitPriceExcludingTax, unitPriceIncludingTax);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineItem {\n");
		
		sb.append("		aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
		sb.append("		amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
		sb.append("		amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
		sb.append("		attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("		discountExcludingTax: ").append(toIndentedString(discountExcludingTax)).append("\n");
		sb.append("		discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
		sb.append("		shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
		sb.append("		sku: ").append(toIndentedString(sku)).append("\n");
		sb.append("		taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
		sb.append("		taxAmountPerUnit: ").append(toIndentedString(taxAmountPerUnit)).append("\n");
		sb.append("		taxes: ").append(toIndentedString(taxes)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
		sb.append("		undiscountedAmountExcludingTax: ").append(toIndentedString(undiscountedAmountExcludingTax)).append("\n");
		sb.append("		undiscountedAmountIncludingTax: ").append(toIndentedString(undiscountedAmountIncludingTax)).append("\n");
		sb.append("		uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
		sb.append("		unitPriceExcludingTax: ").append(toIndentedString(unitPriceExcludingTax)).append("\n");
		sb.append("		unitPriceIncludingTax: ").append(toIndentedString(unitPriceIncludingTax)).append("\n");
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

