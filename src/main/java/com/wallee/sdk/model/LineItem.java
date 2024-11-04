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
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class LineItem {
  
  @JsonProperty("aggregatedTaxRate")
  protected BigDecimal aggregatedTaxRate = null;

  
  @JsonProperty("amountExcludingTax")
  protected BigDecimal amountExcludingTax = null;

  
  @JsonProperty("amountIncludingTax")
  protected BigDecimal amountIncludingTax = null;

  
  @JsonProperty("attributes")
  protected Map<String, LineItemAttribute> attributes = null;

  
  @JsonProperty("discountExcludingTax")
  protected BigDecimal discountExcludingTax = null;

  
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

  
  @JsonProperty("taxAmount")
  protected BigDecimal taxAmount = null;

  
  @JsonProperty("taxAmountPerUnit")
  protected BigDecimal taxAmountPerUnit = null;

  
  @JsonProperty("taxes")
  protected List<Tax> taxes = null;

  
  @JsonProperty("type")
  protected LineItemType type = null;

  
  @JsonProperty("undiscountedAmountExcludingTax")
  protected BigDecimal undiscountedAmountExcludingTax = null;

  
  @JsonProperty("undiscountedAmountIncludingTax")
  protected BigDecimal undiscountedAmountIncludingTax = null;

  
  @JsonProperty("undiscountedUnitPriceExcludingTax")
  protected BigDecimal undiscountedUnitPriceExcludingTax = null;

  
  @JsonProperty("undiscountedUnitPriceIncludingTax")
  protected BigDecimal undiscountedUnitPriceIncludingTax = null;

  
  @JsonProperty("uniqueId")
  protected String uniqueId = null;

  
  @JsonProperty("unitPriceExcludingTax")
  protected BigDecimal unitPriceExcludingTax = null;

  
  @JsonProperty("unitPriceIncludingTax")
  protected BigDecimal unitPriceIncludingTax = null;

  
  
   /**
   * The total tax rate applied to the item, calculated from the rates of all tax lines.
   * @return aggregatedTaxRate
  **/
  @ApiModelProperty(value = "The total tax rate applied to the item, calculated from the rates of all tax lines.")
  public BigDecimal getAggregatedTaxRate() {
    return aggregatedTaxRate;
  }

  
   /**
   * The line item price with discounts applied, excluding taxes.
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "The line item price with discounts applied, excluding taxes.")
  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }

  
   /**
   * The line item price with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "The line item price with discounts applied, including taxes.")
  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }

  
   /**
   * A map of custom information for the item.
   * @return attributes
  **/
  @ApiModelProperty(value = "A map of custom information for the item.")
  public Map<String, LineItemAttribute> getAttributes() {
    return attributes;
  }

  
   /**
   * The discount allocated to the item, excluding taxes.
   * @return discountExcludingTax
  **/
  @ApiModelProperty(value = "The discount allocated to the item, excluding taxes.")
  public BigDecimal getDiscountExcludingTax() {
    return discountExcludingTax;
  }

  
   /**
   * The discount allocated to the item, including taxes.
   * @return discountIncludingTax
  **/
  @ApiModelProperty(value = "The discount allocated to the item, including taxes.")
  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }

  
   /**
   * The name of the product, ideally in the customer&#39;s language.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the product, ideally in the customer's language.")
  public String getName() {
    return name;
  }

  
   /**
   * The number of items that were purchased.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of items that were purchased.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  
   /**
   * Whether the item required shipping.
   * @return shippingRequired
  **/
  @ApiModelProperty(value = "Whether the item required shipping.")
  public Boolean isShippingRequired() {
    return shippingRequired;
  }

  
   /**
   * The SKU (stock-keeping unit) of the product.
   * @return sku
  **/
  @ApiModelProperty(value = "The SKU (stock-keeping unit) of the product.")
  public String getSku() {
    return sku;
  }

  
   /**
   * The sum of all taxes applied to the item.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The sum of all taxes applied to the item.")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * The calculated tax amount per unit.
   * @return taxAmountPerUnit
  **/
  @ApiModelProperty(value = "The calculated tax amount per unit.")
  public BigDecimal getTaxAmountPerUnit() {
    return taxAmountPerUnit;
  }

  
   /**
   * A set of tax lines, each of which specifies a tax applied to the item.
   * @return taxes
  **/
  @ApiModelProperty(value = "A set of tax lines, each of which specifies a tax applied to the item.")
  public List<Tax> getTaxes() {
    return taxes;
  }

  
   /**
   * The type of the line item.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the line item.")
  public LineItemType getType() {
    return type;
  }

  
   /**
   * The line item price with discounts not applied, excluding taxes.
   * @return undiscountedAmountExcludingTax
  **/
  @ApiModelProperty(value = "The line item price with discounts not applied, excluding taxes.")
  public BigDecimal getUndiscountedAmountExcludingTax() {
    return undiscountedAmountExcludingTax;
  }

  
   /**
   * The line item price with discounts not applied, including taxes.
   * @return undiscountedAmountIncludingTax
  **/
  @ApiModelProperty(value = "The line item price with discounts not applied, including taxes.")
  public BigDecimal getUndiscountedAmountIncludingTax() {
    return undiscountedAmountIncludingTax;
  }

  
   /**
   * The calculated price per unit with discounts not applied, excluding taxes.
   * @return undiscountedUnitPriceExcludingTax
  **/
  @ApiModelProperty(value = "The calculated price per unit with discounts not applied, excluding taxes.")
  public BigDecimal getUndiscountedUnitPriceExcludingTax() {
    return undiscountedUnitPriceExcludingTax;
  }

  
   /**
   * The calculated price per unit with discounts not applied, including taxes.
   * @return undiscountedUnitPriceIncludingTax
  **/
  @ApiModelProperty(value = "The calculated price per unit with discounts not applied, including taxes.")
  public BigDecimal getUndiscountedUnitPriceIncludingTax() {
    return undiscountedUnitPriceIncludingTax;
  }

  
   /**
   * The unique identifier of the line item within the set of line items.
   * @return uniqueId
  **/
  @ApiModelProperty(value = "The unique identifier of the line item within the set of line items.")
  public String getUniqueId() {
    return uniqueId;
  }

  
   /**
   * The calculated price per unit with discounts applied, excluding taxes.
   * @return unitPriceExcludingTax
  **/
  @ApiModelProperty(value = "The calculated price per unit with discounts applied, excluding taxes.")
  public BigDecimal getUnitPriceExcludingTax() {
    return unitPriceExcludingTax;
  }

  
   /**
   * The calculated price per unit with discounts applied, including taxes.
   * @return unitPriceIncludingTax
  **/
  @ApiModelProperty(value = "The calculated price per unit with discounts applied, including taxes.")
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
        Objects.equals(this.undiscountedUnitPriceExcludingTax, lineItem.undiscountedUnitPriceExcludingTax) &&
        Objects.equals(this.undiscountedUnitPriceIncludingTax, lineItem.undiscountedUnitPriceIncludingTax) &&
        Objects.equals(this.uniqueId, lineItem.uniqueId) &&
        Objects.equals(this.unitPriceExcludingTax, lineItem.unitPriceExcludingTax) &&
        Objects.equals(this.unitPriceIncludingTax, lineItem.unitPriceIncludingTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, attributes, discountExcludingTax, discountIncludingTax, name, quantity, shippingRequired, sku, taxAmount, taxAmountPerUnit, taxes, type, undiscountedAmountExcludingTax, undiscountedAmountIncludingTax, undiscountedUnitPriceExcludingTax, undiscountedUnitPriceIncludingTax, uniqueId, unitPriceExcludingTax, unitPriceIncludingTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    
    sb.append("    aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    discountExcludingTax: ").append(toIndentedString(discountExcludingTax)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxAmountPerUnit: ").append(toIndentedString(taxAmountPerUnit)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    undiscountedAmountExcludingTax: ").append(toIndentedString(undiscountedAmountExcludingTax)).append("\n");
    sb.append("    undiscountedAmountIncludingTax: ").append(toIndentedString(undiscountedAmountIncludingTax)).append("\n");
    sb.append("    undiscountedUnitPriceExcludingTax: ").append(toIndentedString(undiscountedUnitPriceExcludingTax)).append("\n");
    sb.append("    undiscountedUnitPriceIncludingTax: ").append(toIndentedString(undiscountedUnitPriceIncludingTax)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    unitPriceExcludingTax: ").append(toIndentedString(unitPriceExcludingTax)).append("\n");
    sb.append("    unitPriceIncludingTax: ").append(toIndentedString(unitPriceIncludingTax)).append("\n");
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

