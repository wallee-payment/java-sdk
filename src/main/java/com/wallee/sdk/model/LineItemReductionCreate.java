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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LineItemReductionCreate
 */
@JsonPropertyOrder({
  LineItemReductionCreate.JSON_PROPERTY_QUANTITY_REDUCTION,
  LineItemReductionCreate.JSON_PROPERTY_UNIT_PRICE_REDUCTION,
  LineItemReductionCreate.JSON_PROPERTY_LINE_ITEM_UNIQUE_ID
})
@JsonTypeName("LineItemReduction.Create")

public class LineItemReductionCreate {
  public static final String JSON_PROPERTY_QUANTITY_REDUCTION = "quantityReduction";
  private BigDecimal quantityReduction;

  public static final String JSON_PROPERTY_UNIT_PRICE_REDUCTION = "unitPriceReduction";
  private BigDecimal unitPriceReduction;

  public static final String JSON_PROPERTY_LINE_ITEM_UNIQUE_ID = "lineItemUniqueId";
  private String lineItemUniqueId;

  public LineItemReductionCreate() {
  }

  public LineItemReductionCreate quantityReduction(BigDecimal quantityReduction) {
    
    this.quantityReduction = quantityReduction;
    return this;
  }

   /**
   * The quantity removed or reduced from the line item. This value reflects the decrease in the item count due to the reduction.
   * @return quantityReduction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY_REDUCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getQuantityReduction() {
    return quantityReduction;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY_REDUCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantityReduction(BigDecimal quantityReduction) {
    this.quantityReduction = quantityReduction;
  }

  public LineItemReductionCreate unitPriceReduction(BigDecimal unitPriceReduction) {
    
    this.unitPriceReduction = unitPriceReduction;
    return this;
  }

   /**
   * The monetary amount by which the line item&#39;s unit price is discounted. This reduction adjusts the price without altering the quantity.
   * @return unitPriceReduction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIT_PRICE_REDUCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getUnitPriceReduction() {
    return unitPriceReduction;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_PRICE_REDUCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitPriceReduction(BigDecimal unitPriceReduction) {
    this.unitPriceReduction = unitPriceReduction;
  }

  public LineItemReductionCreate lineItemUniqueId(String lineItemUniqueId) {
    
    this.lineItemUniqueId = lineItemUniqueId;
    return this;
  }

   /**
   * The unique identifier of the line item to which the reduction is applied. This ID ensures the reduction is accurately associated with the correct item.
   * @return lineItemUniqueId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINE_ITEM_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLineItemUniqueId() {
    return lineItemUniqueId;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEM_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLineItemUniqueId(String lineItemUniqueId) {
    this.lineItemUniqueId = lineItemUniqueId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItemReductionCreate lineItemReductionCreate = (LineItemReductionCreate) o;
    return Objects.equals(this.quantityReduction, lineItemReductionCreate.quantityReduction) &&
        Objects.equals(this.unitPriceReduction, lineItemReductionCreate.unitPriceReduction) &&
        Objects.equals(this.lineItemUniqueId, lineItemReductionCreate.lineItemUniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityReduction, unitPriceReduction, lineItemUniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemReductionCreate {\n");
    sb.append("    quantityReduction: ").append(toIndentedString(quantityReduction)).append("\n");
    sb.append("    unitPriceReduction: ").append(toIndentedString(unitPriceReduction)).append("\n");
    sb.append("    lineItemUniqueId: ").append(toIndentedString(lineItemUniqueId)).append("\n");
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

    // add `quantityReduction` to the URL query string
    if (getQuantityReduction() != null) {
      try {
        joiner.add(String.format("%squantityReduction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantityReduction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unitPriceReduction` to the URL query string
    if (getUnitPriceReduction() != null) {
      try {
        joiner.add(String.format("%sunitPriceReduction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnitPriceReduction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lineItemUniqueId` to the URL query string
    if (getLineItemUniqueId() != null) {
      try {
        joiner.add(String.format("%slineItemUniqueId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLineItemUniqueId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

