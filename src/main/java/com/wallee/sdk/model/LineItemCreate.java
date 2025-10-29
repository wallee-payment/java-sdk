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
import com.wallee.sdk.model.LineItemAttributeCreate;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.TaxCreate;
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
 * LineItemCreate
 */
@JsonPropertyOrder({
  LineItemCreate.JSON_PROPERTY_SHIPPING_REQUIRED,
  LineItemCreate.JSON_PROPERTY_QUANTITY,
  LineItemCreate.JSON_PROPERTY_NAME,
  LineItemCreate.JSON_PROPERTY_TAXES,
  LineItemCreate.JSON_PROPERTY_ATTRIBUTES,
  LineItemCreate.JSON_PROPERTY_AMOUNT_INCLUDING_TAX,
  LineItemCreate.JSON_PROPERTY_DISCOUNT_INCLUDING_TAX,
  LineItemCreate.JSON_PROPERTY_SKU,
  LineItemCreate.JSON_PROPERTY_TYPE,
  LineItemCreate.JSON_PROPERTY_UNIQUE_ID
})
@JsonTypeName("LineItem.Create")

public class LineItemCreate {
  public static final String JSON_PROPERTY_SHIPPING_REQUIRED = "shippingRequired";
  private Boolean shippingRequired;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private Set<TaxCreate> taxes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, LineItemAttributeCreate> attributes = new HashMap<>();

  public static final String JSON_PROPERTY_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  private BigDecimal amountIncludingTax;

  public static final String JSON_PROPERTY_DISCOUNT_INCLUDING_TAX = "discountIncludingTax";
  private BigDecimal discountIncludingTax;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LineItemType type;

  public static final String JSON_PROPERTY_UNIQUE_ID = "uniqueId";
  private String uniqueId;

  public LineItemCreate() {
  }

  public LineItemCreate shippingRequired(Boolean shippingRequired) {
    
    this.shippingRequired = shippingRequired;
    return this;
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


  @JsonProperty(JSON_PROPERTY_SHIPPING_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingRequired(Boolean shippingRequired) {
    this.shippingRequired = shippingRequired;
  }

  public LineItemCreate quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items that were purchased.
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public LineItemCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the product, ideally in the customer&#39;s language.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }

  public LineItemCreate taxes(Set<TaxCreate> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public LineItemCreate addTaxesItem(TaxCreate taxesItem) {
    if (this.taxes == null) {
      this.taxes = new LinkedHashSet<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * A set of tax lines, each of which specifies a tax applied to the item.
   * @return taxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TaxCreate> getTaxes() {
    return taxes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxes(Set<TaxCreate> taxes) {
    this.taxes = taxes;
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, LineItemAttributeCreate> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(Map<String, LineItemAttributeCreate> attributes) {
    this.attributes = attributes;
  }

  public LineItemCreate amountIncludingTax(BigDecimal amountIncludingTax) {
    
    this.amountIncludingTax = amountIncludingTax;
    return this;
  }

   /**
   * The line item price with discounts applied, including taxes.
   * @return amountIncludingTax
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountIncludingTax(BigDecimal amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
  }

  public LineItemCreate discountIncludingTax(BigDecimal discountIncludingTax) {
    
    this.discountIncludingTax = discountIncludingTax;
    return this;
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


  @JsonProperty(JSON_PROPERTY_DISCOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscountIncludingTax(BigDecimal discountIncludingTax) {
    this.discountIncludingTax = discountIncludingTax;
  }

  public LineItemCreate sku(String sku) {
    
    this.sku = sku;
    return this;
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


  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSku(String sku) {
    this.sku = sku;
  }

  public LineItemCreate type(LineItemType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LineItemType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemCreate lineItemCreate = (LineItemCreate) o;
    return Objects.equals(this.shippingRequired, lineItemCreate.shippingRequired) &&
        Objects.equals(this.quantity, lineItemCreate.quantity) &&
        Objects.equals(this.name, lineItemCreate.name) &&
        Objects.equals(this.taxes, lineItemCreate.taxes) &&
        Objects.equals(this.attributes, lineItemCreate.attributes) &&
        Objects.equals(this.amountIncludingTax, lineItemCreate.amountIncludingTax) &&
        Objects.equals(this.discountIncludingTax, lineItemCreate.discountIncludingTax) &&
        Objects.equals(this.sku, lineItemCreate.sku) &&
        Objects.equals(this.type, lineItemCreate.type) &&
        Objects.equals(this.uniqueId, lineItemCreate.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingRequired, quantity, name, taxes, attributes, amountIncludingTax, discountIncludingTax, sku, type, uniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemCreate {\n");
    sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    discountIncludingTax: ").append(toIndentedString(discountIncludingTax)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `shippingRequired` to the URL query string
    if (getShippingRequired() != null) {
      try {
        joiner.add(String.format("%sshippingRequired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShippingRequired()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxes` to the URL query string
    if (getTaxes() != null) {
      int i = 0;
      for (TaxCreate _item : getTaxes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

