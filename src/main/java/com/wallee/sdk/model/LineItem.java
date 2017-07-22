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
import com.wallee.sdk.model.LineItemAttribute;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class LineItem {
	@SerializedName("aggregatedTaxRate")
	private BigDecimal aggregatedTaxRate = null;

	@SerializedName("amountExcludingTax")
	private BigDecimal amountExcludingTax = null;

	@SerializedName("amountIncludingTax")
	private BigDecimal amountIncludingTax = null;

	@SerializedName("attributes")
	private Map<String, LineItemAttribute> attributes = new HashMap<String, LineItemAttribute>();

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
	@ApiModelProperty(example = "null", value = "The aggregated tax rate is the sum of all tax rates of the line item.")
	public BigDecimal getAggregatedTaxRate() {
		return aggregatedTaxRate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getAmountExcludingTax() {
		return amountExcludingTax;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getAmountIncludingTax() {
		return amountIncludingTax;
	}

	public LineItem attributes(Map<String, LineItemAttribute> attributes) {
		this.attributes = attributes;
		return this;
	}

	public LineItem putAttributesItem(String key, LineItemAttribute attributesItem) {
		this.attributes.put(key, attributesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, LineItemAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, LineItemAttribute> attributes) {
		this.attributes = attributes;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getName() {
		return name;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Boolean getShippingRequired() {
		return shippingRequired;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getSku() {
		return sku;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getTaxAmountPerUnit() {
		return taxAmountPerUnit;
	}

	public LineItem taxes(List<Tax> taxes) {
		this.taxes = taxes;
		return this;
	}

	public LineItem addTaxesItem(Tax taxesItem) {
		this.taxes.add(taxesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Tax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}

	public LineItem type(LineItemType type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public LineItemType getType() {
		return type;
	}

	public void setType(LineItemType type) {
		this.type = type;
	}

	/**
	 * The unique id identifies the line item within the set of line items associated with the transaction.
	 *
	 * @return The unique id identifies the line item within the set of line items associated with the transaction.
	 */
	@ApiModelProperty(example = "null", value = "The unique id identifies the line item within the set of line items associated with the transaction.")
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getUnitPriceExcludingTax() {
		return unitPriceExcludingTax;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
				Objects.equals(this.name, lineItem.name) &&
				Objects.equals(this.quantity, lineItem.quantity) &&
				Objects.equals(this.shippingRequired, lineItem.shippingRequired) &&
				Objects.equals(this.sku, lineItem.sku) &&
				Objects.equals(this.taxAmount, lineItem.taxAmount) &&
				Objects.equals(this.taxAmountPerUnit, lineItem.taxAmountPerUnit) &&
				Objects.equals(this.taxes, lineItem.taxes) &&
				Objects.equals(this.type, lineItem.type) &&
				Objects.equals(this.uniqueId, lineItem.uniqueId) &&
				Objects.equals(this.unitPriceExcludingTax, lineItem.unitPriceExcludingTax) &&
				Objects.equals(this.unitPriceIncludingTax, lineItem.unitPriceIncludingTax);
	}

	@Override
	public int hashCode() {
		return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, attributes, name, quantity, shippingRequired, sku, taxAmount, taxAmountPerUnit, taxes, type, uniqueId, unitPriceExcludingTax, unitPriceIncludingTax);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineItem {\n");
		
		sb.append("		aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
		sb.append("		amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
		sb.append("		amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
		sb.append("		attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
		sb.append("		shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
		sb.append("		sku: ").append(toIndentedString(sku)).append("\n");
		sb.append("		taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
		sb.append("		taxAmountPerUnit: ").append(toIndentedString(taxAmountPerUnit)).append("\n");
		sb.append("		taxes: ").append(toIndentedString(taxes)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

