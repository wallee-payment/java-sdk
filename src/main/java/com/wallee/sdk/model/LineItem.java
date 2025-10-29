/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.LineItemAttribute;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.Tax;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LineItem
 */
@JsonPropertyOrder({
  LineItem.JSON_PROPERTY_TAX_AMOUNT_PER_UNIT,
  LineItem.JSON_PROPERTY_UNDISCOUNTED_AMOUNT_EXCLUDING_TAX,
  LineItem.JSON_PROPERTY_QUANTITY,
  LineItem.JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_INCLUDING_TAX,
  LineItem.JSON_PROPERTY_AMOUNT_EXCLUDING_TAX,
  LineItem.JSON_PROPERTY_UNDISCOUNTED_AMOUNT_INCLUDING_TAX,
  LineItem.JSON_PROPERTY_TAXES,
  LineItem.JSON_PROPERTY_TYPE,
  LineItem.JSON_PROPERTY_UNIT_PRICE_INCLUDING_TAX,
  LineItem.JSON_PROPERTY_DISCOUNT_EXCLUDING_TAX,
  LineItem.JSON_PROPERTY_SHIPPING_REQUIRED,
  LineItem.JSON_PROPERTY_UNIT_PRICE_EXCLUDING_TAX,
  LineItem.JSON_PROPERTY_NAME,
  LineItem.JSON_PROPERTY_ATTRIBUTES,
  LineItem.JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_EXCLUDING_TAX,
  LineItem.JSON_PROPERTY_AMOUNT_INCLUDING_TAX,
  LineItem.JSON_PROPERTY_DISCOUNT_INCLUDING_TAX,
  LineItem.JSON_PROPERTY_SKU,
  LineItem.JSON_PROPERTY_TAX_AMOUNT,
  LineItem.JSON_PROPERTY_AGGREGATED_TAX_RATE,
  LineItem.JSON_PROPERTY_UNIQUE_ID
})

public class LineItem {
  public static final String JSON_PROPERTY_TAX_AMOUNT_PER_UNIT = "taxAmountPerUnit";
  private BigDecimal taxAmountPerUnit;

  public static final String JSON_PROPERTY_UNDISCOUNTED_AMOUNT_EXCLUDING_TAX = "undiscountedAmountExcludingTax";
  private BigDecimal undiscountedAmountExcludingTax;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_INCLUDING_TAX = "undiscountedUnitPriceIncludingTax";
  private BigDecimal undiscountedUnitPriceIncludingTax;

  public static final String JSON_PROPERTY_AMOUNT_EXCLUDING_TAX = "amountExcludingTax";
  private BigDecimal amountExcludingTax;

  public static final String JSON_PROPERTY_UNDISCOUNTED_AMOUNT_INCLUDING_TAX = "undiscountedAmountIncludingTax";
  private BigDecimal undiscountedAmountIncludingTax;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private Set<Tax> taxes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private LineItemType type;

  public static final String JSON_PROPERTY_UNIT_PRICE_INCLUDING_TAX = "unitPriceIncludingTax";
  private BigDecimal unitPriceIncludingTax;

  public static final String JSON_PROPERTY_DISCOUNT_EXCLUDING_TAX = "discountExcludingTax";
  private BigDecimal discountExcludingTax;

  public static final String JSON_PROPERTY_SHIPPING_REQUIRED = "shippingRequired";
  private Boolean shippingRequired;

  public static final String JSON_PROPERTY_UNIT_PRICE_EXCLUDING_TAX = "unitPriceExcludingTax";
  private BigDecimal unitPriceExcludingTax;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, LineItemAttribute> attributes = new HashMap<>();

  public static final String JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_EXCLUDING_TAX = "undiscountedUnitPriceExcludingTax";
  private BigDecimal undiscountedUnitPriceExcludingTax;

  public static final String JSON_PROPERTY_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  private BigDecimal amountIncludingTax;

  public static final String JSON_PROPERTY_DISCOUNT_INCLUDING_TAX = "discountIncludingTax";
  private BigDecimal discountIncludingTax;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "taxAmount";
  private BigDecimal taxAmount;

  public static final String JSON_PROPERTY_AGGREGATED_TAX_RATE = "aggregatedTaxRate";
  private BigDecimal aggregatedTaxRate;

  public static final String JSON_PROPERTY_UNIQUE_ID = "uniqueId";
  private String uniqueId;

  public LineItem() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public LineItem(
    @JsonProperty(JSON_PROPERTY_TAX_AMOUNT_PER_UNIT) BigDecimal taxAmountPerUnit, 
    @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_AMOUNT_EXCLUDING_TAX) BigDecimal undiscountedAmountExcludingTax, 
    @JsonProperty(JSON_PROPERTY_QUANTITY) BigDecimal quantity, 
    @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_INCLUDING_TAX) BigDecimal undiscountedUnitPriceIncludingTax, 
    @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX) BigDecimal amountExcludingTax, 
    @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_AMOUNT_INCLUDING_TAX) BigDecimal undiscountedAmountIncludingTax, 
    @JsonProperty(JSON_PROPERTY_TAXES) Set<Tax> taxes, 
    @JsonProperty(JSON_PROPERTY_UNIT_PRICE_INCLUDING_TAX) BigDecimal unitPriceIncludingTax, 
    @JsonProperty(JSON_PROPERTY_DISCOUNT_EXCLUDING_TAX) BigDecimal discountExcludingTax, 
    @JsonProperty(JSON_PROPERTY_SHIPPING_REQUIRED) Boolean shippingRequired, 
    @JsonProperty(JSON_PROPERTY_UNIT_PRICE_EXCLUDING_TAX) BigDecimal unitPriceExcludingTax, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES) Map<String, LineItemAttribute> attributes, 
    @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_EXCLUDING_TAX) BigDecimal undiscountedUnitPriceExcludingTax, 
    @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX) BigDecimal amountIncludingTax, 
    @JsonProperty(JSON_PROPERTY_DISCOUNT_INCLUDING_TAX) BigDecimal discountIncludingTax, 
    @JsonProperty(JSON_PROPERTY_SKU) String sku, 
    @JsonProperty(JSON_PROPERTY_TAX_AMOUNT) BigDecimal taxAmount, 
    @JsonProperty(JSON_PROPERTY_AGGREGATED_TAX_RATE) BigDecimal aggregatedTaxRate, 
    @JsonProperty(JSON_PROPERTY_UNIQUE_ID) String uniqueId
  ) {
    this();
    this.taxAmountPerUnit = taxAmountPerUnit;
    this.undiscountedAmountExcludingTax = undiscountedAmountExcludingTax;
    this.quantity = quantity;
    this.undiscountedUnitPriceIncludingTax = undiscountedUnitPriceIncludingTax;
    this.amountExcludingTax = amountExcludingTax;
    this.undiscountedAmountIncludingTax = undiscountedAmountIncludingTax;
    this.taxes = taxes;
    this.unitPriceIncludingTax = unitPriceIncludingTax;
    this.discountExcludingTax = discountExcludingTax;
    this.shippingRequired = shippingRequired;
    this.unitPriceExcludingTax = unitPriceExcludingTax;
    this.name = name;
    this.attributes = attributes;
    this.undiscountedUnitPriceExcludingTax = undiscountedUnitPriceExcludingTax;
    this.amountIncludingTax = amountIncludingTax;
    this.discountIncludingTax = discountIncludingTax;
    this.sku = sku;
    this.taxAmount = taxAmount;
    this.aggregatedTaxRate = aggregatedTaxRate;
    this.uniqueId = uniqueId;
  }

   /**
   * The calculated tax amount per unit.
   * @return taxAmountPerUnit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT_PER_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxAmountPerUnit() {
    return taxAmountPerUnit;
  }



   /**
   * The line item price with discounts not applied, excluding taxes.
   * @return undiscountedAmountExcludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_AMOUNT_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUndiscountedAmountExcludingTax() {
    return undiscountedAmountExcludingTax;
  }



   /**
   * The number of items that were purchased.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuantity() {
    return quantity;
  }



   /**
   * The calculated price per unit with discounts not applied, including taxes.
   * @return undiscountedUnitPriceIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUndiscountedUnitPriceIncludingTax() {
    return undiscountedUnitPriceIncludingTax;
  }



   /**
   * The line item price with discounts applied, excluding taxes.
   * @return amountExcludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }



   /**
   * The line item price with discounts not applied, including taxes.
   * @return undiscountedAmountIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUndiscountedAmountIncludingTax() {
    return undiscountedAmountIncludingTax;
  }



   /**
   * A set of tax lines, each of which specifies a tax applied to the item.
   * @return taxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Tax> getTaxes() {
    return taxes;
  }



  public LineItem type(LineItemType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LineItemType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(LineItemType type) {
    this.type = type;
  }

   /**
   * The calculated price per unit with discounts applied, including taxes.
   * @return unitPriceIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT_PRICE_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnitPriceIncludingTax() {
    return unitPriceIncludingTax;
  }



   /**
   * The discount allocated to the item, excluding taxes.
   * @return discountExcludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDiscountExcludingTax() {
    return discountExcludingTax;
  }



   /**
   * Whether the item required shipping.
   * @return shippingRequired
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShippingRequired() {
    return shippingRequired;
  }



   /**
   * The calculated price per unit with discounts applied, excluding taxes.
   * @return unitPriceExcludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT_PRICE_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnitPriceExcludingTax() {
    return unitPriceExcludingTax;
  }



   /**
   * The name of the product, ideally in the customer&#39;s language.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



   /**
   * A map of custom information for the item.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, LineItemAttribute> getAttributes() {
    return attributes;
  }



   /**
   * The calculated price per unit with discounts not applied, excluding taxes.
   * @return undiscountedUnitPriceExcludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNDISCOUNTED_UNIT_PRICE_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUndiscountedUnitPriceExcludingTax() {
    return undiscountedUnitPriceExcludingTax;
  }



   /**
   * The line item price with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }



   /**
   * The discount allocated to the item, including taxes.
   * @return discountIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDiscountIncludingTax() {
    return discountIncludingTax;
  }



   /**
   * The SKU (stock-keeping unit) of the product.
   * @return sku
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSku() {
    return sku;
  }



   /**
   * The sum of all taxes applied to the item.
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }



   /**
   * The total tax rate applied to the item, calculated from the rates of all tax lines.
   * @return aggregatedTaxRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATED_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAggregatedTaxRate() {
    return aggregatedTaxRate;
  }



   /**
   * The unique identifier of the line item within the set of line items.
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.taxAmountPerUnit, lineItem.taxAmountPerUnit) &&
        Objects.equals(this.undiscountedAmountExcludingTax, lineItem.undiscountedAmountExcludingTax) &&
        Objects.equals(this.quantity, lineItem.quantity) &&
        Objects.equals(this.undiscountedUnitPriceIncludingTax, lineItem.undiscountedUnitPriceIncludingTax) &&
        Objects.equals(this.amountExcludingTax, lineItem.amountExcludingTax) &&
        Objects.equals(this.undiscountedAmountIncludingTax, lineItem.undiscountedAmountIncludingTax) &&
        Objects.equals(this.taxes, lineItem.taxes) &&
        Objects.equals(this.type, lineItem.type) &&
        Objects.equals(this.unitPriceIncludingTax, lineItem.unitPriceIncludingTax) &&
        Objects.equals(this.discountExcludingTax, lineItem.discountExcludingTax) &&
        Objects.equals(this.shippingRequired, lineItem.shippingRequired) &&
        Objects.equals(this.unitPriceExcludingTax, lineItem.unitPriceExcludingTax) &&
        Objects.equals(this.name, lineItem.name) &&
        Objects.equals(this.attributes, lineItem.attributes) &&
        Objects.equals(this.undiscountedUnitPriceExcludingTax, lineItem.undiscountedUnitPriceExcludingTax) &&
        Objects.equals(this.amountIncludingTax, lineItem.amountIncludingTax) &&
        Objects.equals(this.discountIncludingTax, lineItem.discountIncludingTax) &&
        Objects.equals(this.sku, lineItem.sku) &&
        Objects.equals(this.taxAmount, lineItem.taxAmount) &&
        Objects.equals(this.aggregatedTaxRate, lineItem.aggregatedTaxRate) &&
        Objects.equals(this.uniqueId, lineItem.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxAmountPerUnit, undiscountedAmountExcludingTax, quantity, undiscountedUnitPriceIncludingTax, amountExcludingTax, undiscountedAmountIncludingTax, taxes, type, unitPriceIncludingTax, discountExcludingTax, shippingRequired, unitPriceExcludingTax, name, attributes, undiscountedUnitPriceExcludingTax, amountIncludingTax, discountIncludingTax, sku, taxAmount, aggregatedTaxRate, uniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    taxAmountPerUnit: ").append(toIndentedString(taxAmountPerUnit)).append("\n");
    sb.append("    undiscountedAmountExcludingTax: ").append(toIndentedString(undiscountedAmountExcludingTax)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    undiscountedUnitPriceIncludingTax: ").append(toIndentedString(undiscountedUnitPriceIncludingTax)).append("\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    undiscountedAmountIncludingTax: ").append(toIndentedString(undiscountedAmountIncludingTax)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitPriceIncludingTax: ").append(toIndentedString(unitPriceIncludingTax)).append("\n");
    sb.append("    discountExcludingTax: ").append(toIndentedString(discountExcludingTax)).append("\n");
    sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
    sb.append("    unitPriceExcludingTax: ").append(toIndentedString(unitPriceExcludingTax)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    undiscountedUnitPriceExcludingTax: ").append(toIndentedString(undiscountedUnitPriceExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `taxAmountPerUnit` to the URL query string
    if (getTaxAmountPerUnit() != null) {
      try {
        joiner.add(String.format("%staxAmountPerUnit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxAmountPerUnit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `undiscountedAmountExcludingTax` to the URL query string
    if (getUndiscountedAmountExcludingTax() != null) {
      try {
        joiner.add(String.format("%sundiscountedAmountExcludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUndiscountedAmountExcludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `undiscountedUnitPriceIncludingTax` to the URL query string
    if (getUndiscountedUnitPriceIncludingTax() != null) {
      try {
        joiner.add(String.format("%sundiscountedUnitPriceIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUndiscountedUnitPriceIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amountExcludingTax` to the URL query string
    if (getAmountExcludingTax() != null) {
      try {
        joiner.add(String.format("%samountExcludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountExcludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `undiscountedAmountIncludingTax` to the URL query string
    if (getUndiscountedAmountIncludingTax() != null) {
      try {
        joiner.add(String.format("%sundiscountedAmountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUndiscountedAmountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxes` to the URL query string
    if (getTaxes() != null) {
      int i = 0;
      for (Tax _item : getTaxes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unitPriceIncludingTax` to the URL query string
    if (getUnitPriceIncludingTax() != null) {
      try {
        joiner.add(String.format("%sunitPriceIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnitPriceIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `discountExcludingTax` to the URL query string
    if (getDiscountExcludingTax() != null) {
      try {
        joiner.add(String.format("%sdiscountExcludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiscountExcludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingRequired` to the URL query string
    if (getShippingRequired() != null) {
      try {
        joiner.add(String.format("%sshippingRequired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShippingRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unitPriceExcludingTax` to the URL query string
    if (getUnitPriceExcludingTax() != null) {
      try {
        joiner.add(String.format("%sunitPriceExcludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnitPriceExcludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `attributes` to the URL query string
    if (getAttributes() != null) {
      for (String _key : getAttributes().keySet()) {
        if (getAttributes().get(_key) != null) {
          joiner.add(getAttributes().get(_key).toUrlQueryString(String.format("%sattributes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `undiscountedUnitPriceExcludingTax` to the URL query string
    if (getUndiscountedUnitPriceExcludingTax() != null) {
      try {
        joiner.add(String.format("%sundiscountedUnitPriceExcludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUndiscountedUnitPriceExcludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amountIncludingTax` to the URL query string
    if (getAmountIncludingTax() != null) {
      try {
        joiner.add(String.format("%samountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `discountIncludingTax` to the URL query string
    if (getDiscountIncludingTax() != null) {
      try {
        joiner.add(String.format("%sdiscountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiscountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sku` to the URL query string
    if (getSku() != null) {
      try {
        joiner.add(String.format("%ssku%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSku()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxAmount` to the URL query string
    if (getTaxAmount() != null) {
      try {
        joiner.add(String.format("%staxAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `aggregatedTaxRate` to the URL query string
    if (getAggregatedTaxRate() != null) {
      try {
        joiner.add(String.format("%saggregatedTaxRate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAggregatedTaxRate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueId` to the URL query string
    if (getUniqueId() != null) {
      try {
        joiner.add(String.format("%suniqueId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

