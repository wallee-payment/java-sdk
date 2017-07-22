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
import com.wallee.sdk.model.LineItemAttributeCreate;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.TaxCreate;
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
public class LineItemCreate {
	@SerializedName("amountIncludingTax")
	private BigDecimal amountIncludingTax = null;

	@SerializedName("attributes")
	private Map<String, LineItemAttributeCreate> attributes = new HashMap<String, LineItemAttributeCreate>();

	@SerializedName("name")
	private String name = null;

	@SerializedName("quantity")
	private BigDecimal quantity = null;

	@SerializedName("shippingRequired")
	private Boolean shippingRequired = null;

	@SerializedName("sku")
	private String sku = null;

	@SerializedName("taxes")
	private List<TaxCreate> taxes = new ArrayList<TaxCreate>();

	@SerializedName("type")
	private LineItemType type = null;

	@SerializedName("uniqueId")
	private String uniqueId = null;

	public LineItemCreate amountIncludingTax(BigDecimal amountIncludingTax) {
		this.amountIncludingTax = amountIncludingTax;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public BigDecimal getAmountIncludingTax() {
		return amountIncludingTax;
	}

	public void setAmountIncludingTax(BigDecimal amountIncludingTax) {
		this.amountIncludingTax = amountIncludingTax;
	}

	public LineItemCreate attributes(Map<String, LineItemAttributeCreate> attributes) {
		this.attributes = attributes;
		return this;
	}

	public LineItemCreate putAttributesItem(String key, LineItemAttributeCreate attributesItem) {
		this.attributes.put(key, attributesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, LineItemAttributeCreate> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, LineItemAttributeCreate> attributes) {
		this.attributes = attributes;
	}

	public LineItemCreate name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LineItemCreate quantity(BigDecimal quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public LineItemCreate shippingRequired(Boolean shippingRequired) {
		this.shippingRequired = shippingRequired;
		return this;
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

	public void setShippingRequired(Boolean shippingRequired) {
		this.shippingRequired = shippingRequired;
	}

	public LineItemCreate sku(String sku) {
		this.sku = sku;
		return this;
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

	public void setSku(String sku) {
		this.sku = sku;
	}

	public LineItemCreate taxes(List<TaxCreate> taxes) {
		this.taxes = taxes;
		return this;
	}

	public LineItemCreate addTaxesItem(TaxCreate taxesItem) {
		this.taxes.add(taxesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<TaxCreate> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<TaxCreate> taxes) {
		this.taxes = taxes;
	}

	public LineItemCreate type(LineItemType type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public LineItemType getType() {
		return type;
	}

	public void setType(LineItemType type) {
		this.type = type;
	}

	public LineItemCreate uniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
		return this;
	}

	/**
	 * The unique id identifies the line item within the set of line items associated with the transaction.
	 *
	 * @return The unique id identifies the line item within the set of line items associated with the transaction.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The unique id identifies the line item within the set of line items associated with the transaction.")
	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LineItemCreate lineItemCreate = (LineItemCreate) o;
		return Objects.equals(this.amountIncludingTax, lineItemCreate.amountIncludingTax) &&
				Objects.equals(this.attributes, lineItemCreate.attributes) &&
				Objects.equals(this.name, lineItemCreate.name) &&
				Objects.equals(this.quantity, lineItemCreate.quantity) &&
				Objects.equals(this.shippingRequired, lineItemCreate.shippingRequired) &&
				Objects.equals(this.sku, lineItemCreate.sku) &&
				Objects.equals(this.taxes, lineItemCreate.taxes) &&
				Objects.equals(this.type, lineItemCreate.type) &&
				Objects.equals(this.uniqueId, lineItemCreate.uniqueId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountIncludingTax, attributes, name, quantity, shippingRequired, sku, taxes, type, uniqueId);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LineItemCreate {\n");
		
		sb.append("		amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
		sb.append("		attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
		sb.append("		shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
		sb.append("		sku: ").append(toIndentedString(sku)).append("\n");
		sb.append("		taxes: ").append(toIndentedString(taxes)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
		sb.append("		uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

