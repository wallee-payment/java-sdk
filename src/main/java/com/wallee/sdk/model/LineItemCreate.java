/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class LineItemCreate {
  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @JsonProperty("attributes")
  protected Map<String, LineItemAttributeCreate> attributes = null;

  
  @JsonProperty("discountIncludingTax")
  protected BigDecimal discountIncludingTax = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("quantity")
  protected BigDecimal quantity = null;

  
  @JsonProperty("shippingRequired")
  protected Boolean shippingRequired = null;

  
  @JsonProperty("sku")
  protected String sku = null;

  
  @JsonProperty("taxes")
  protected List<TaxCreate> taxes = null;

  
  @JsonProperty("type")
  protected LineItemType type = null;

  
  @JsonProperty("uniqueId")
  protected String uniqueId = null;

  
  
  public LineItemCreate amountIncludingTax(BigDecimal amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
    return this;
  }

   /**
   * The line item price with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(required = true, value = "The line item price with discounts applied, including taxes.")
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
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * A map of custom information for the item.
   * @return attributes
  **/
  @ApiModelProperty(value = "A map of custom information for the item.")
  public Map<String, LineItemAttributeCreate> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, LineItemAttributeCreate> attributes) {
    this.attributes = attributes;
  }

  
  public LineItemCreate discountIncludingTax(BigDecimal discountIncludingTax) {
    this.discountIncludingTax = discountIncludingTax;
    return this;
  }

   /**
   * The discount allocated to the item, including taxes.
   * @return discountIncludingTax
  **/
  @ApiModelProperty(value = "The discount allocated to the item, including taxes.")
  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }

  public void setDiscountIncludingTax(BigDecimal discountIncludingTax) {
    this.discountIncludingTax = discountIncludingTax;
  }

  
  public LineItemCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the product, ideally in the customer&#39;s language.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the product, ideally in the customer's language.")
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
   * The number of items that were purchased.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of items that were purchased.")
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
   * Whether the item required shipping.
   * @return shippingRequired
  **/
  @ApiModelProperty(value = "Whether the item required shipping.")
  public Boolean isShippingRequired() {
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
   * The SKU (stock-keeping unit) of the product.
   * @return sku
  **/
  @ApiModelProperty(value = "The SKU (stock-keeping unit) of the product.")
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
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * A set of tax lines, each of which specifies a tax applied to the item.
   * @return taxes
  **/
  @ApiModelProperty(value = "A set of tax lines, each of which specifies a tax applied to the item.")
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
   * The type of the line item.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the line item.")
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
   * The unique identifier of the line item within the set of line items.
   * @return uniqueId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the line item within the set of line items.")
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
        Objects.equals(this.discountIncludingTax, lineItemCreate.discountIncludingTax) &&
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
    return Objects.hash(amountIncludingTax, attributes, discountIncludingTax, name, quantity, shippingRequired, sku, taxes, type, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemCreate {\n");
    
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

