/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.LineItemType;

@ApiModel(description = "")

public class LineItem extends Indentable {

    @JsonProperty("aggregatedTaxRate")
    protected BigDecimal aggregatedTaxRate;


    @JsonProperty("amountExcludingTax")
    protected BigDecimal amountExcludingTax;


    @JsonProperty("amountIncludingTax")
    protected BigDecimal amountIncludingTax;


    @JsonProperty("attributes")
    protected Map<String, LineItemAttribute> attributes;


    @JsonProperty("discountExcludingTax")
    protected BigDecimal discountExcludingTax;


    @JsonProperty("discountIncludingTax")
    protected BigDecimal discountIncludingTax;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("quantity")
    protected BigDecimal quantity;


    @JsonProperty("shippingRequired")
    protected Boolean shippingRequired;


    @JsonProperty("sku")
    protected String sku;


    @JsonProperty("taxAmount")
    protected BigDecimal taxAmount;


    @JsonProperty("taxAmountPerUnit")
    protected BigDecimal taxAmountPerUnit;


    @JsonProperty("taxes")
    protected List<Tax> taxes;


    @JsonProperty("type")
    protected LineItemType type;


    @JsonProperty("undiscountedAmountExcludingTax")
    protected BigDecimal undiscountedAmountExcludingTax;


    @JsonProperty("undiscountedAmountIncludingTax")
    protected BigDecimal undiscountedAmountIncludingTax;


    @JsonProperty("undiscountedUnitPriceExcludingTax")
    protected BigDecimal undiscountedUnitPriceExcludingTax;


    @JsonProperty("undiscountedUnitPriceIncludingTax")
    protected BigDecimal undiscountedUnitPriceIncludingTax;


    @JsonProperty("uniqueId")
    protected String uniqueId;


    @JsonProperty("unitPriceExcludingTax")
    protected BigDecimal unitPriceExcludingTax;


    @JsonProperty("unitPriceIncludingTax")
    protected BigDecimal unitPriceIncludingTax;


    /**
     * The aggregated tax rate is the sum of all tax rates of the line item.
     *
     * @return aggregatedTaxRate
     **/
    @ApiModelProperty(value = "The aggregated tax rate is the sum of all tax rates of the line item.")
    public BigDecimal getAggregatedTaxRate() {
        return aggregatedTaxRate;
    }


    /**
     * @return amountExcludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmountExcludingTax() {
        return amountExcludingTax;
    }


    /**
     * @return amountIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmountIncludingTax() {
        return amountIncludingTax;
    }


    /**
     * @return attributes
     **/
    @ApiModelProperty(value = "")
    public Map<String, LineItemAttribute> getAttributes() {
        return attributes;
    }


    /**
     * @return discountExcludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getDiscountExcludingTax() {
        return discountExcludingTax;
    }


    /**
     * @return discountIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getDiscountIncludingTax() {
        return discountIncludingTax;
    }


    /**
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }


    /**
     * @return quantity
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * @return shippingRequired
     **/
    @ApiModelProperty(value = "")
    public Boolean isShippingRequired() {
        return shippingRequired;
    }


    /**
     * @return sku
     **/
    @ApiModelProperty(value = "")
    public String getSku() {
        return sku;
    }


    /**
     * @return taxAmount
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * @return taxAmountPerUnit
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getTaxAmountPerUnit() {
        return taxAmountPerUnit;
    }


    /**
     * @return taxes
     **/
    @ApiModelProperty(value = "")
    public List<Tax> getTaxes() {
        return taxes;
    }


    /**
     * @return type
     **/
    @ApiModelProperty(value = "")
    public LineItemType getType() {
        return type;
    }


    /**
     * @return undiscountedAmountExcludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getUndiscountedAmountExcludingTax() {
        return undiscountedAmountExcludingTax;
    }


    /**
     * @return undiscountedAmountIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getUndiscountedAmountIncludingTax() {
        return undiscountedAmountIncludingTax;
    }


    /**
     * @return undiscountedUnitPriceExcludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getUndiscountedUnitPriceExcludingTax() {
        return undiscountedUnitPriceExcludingTax;
    }


    /**
     * @return undiscountedUnitPriceIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getUndiscountedUnitPriceIncludingTax() {
        return undiscountedUnitPriceIncludingTax;
    }


    /**
     * The unique id identifies the line item within the set of line items associated with the transaction.
     *
     * @return uniqueId
     **/
    @ApiModelProperty(value = "The unique id identifies the line item within the set of line items associated with the transaction.")
    public String getUniqueId() {
        return uniqueId;
    }


    /**
     * @return unitPriceExcludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getUnitPriceExcludingTax() {
        return unitPriceExcludingTax;
    }


    /**
     * @return unitPriceIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getUnitPriceIncludingTax() {
        return unitPriceIncludingTax;
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
                Objects.equals(this.taxes, lineItem.taxes) && this.type == lineItem.type &&
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

        return "class LineItem {\n" +
            "    aggregatedTaxRate: " + toIndentedString(aggregatedTaxRate) +  "\n" +
            "    amountExcludingTax: " + toIndentedString(amountExcludingTax) + "\n" +
            "    amountIncludingTax: " + toIndentedString(amountIncludingTax) + "\n" +
            "    attributes: " + toIndentedString(attributes) +  "\n" +
            "    discountExcludingTax: " + toIndentedString(discountExcludingTax) + "\n" +
            "    discountIncludingTax: " + toIndentedString(discountIncludingTax) + "\n" +
            "    name: " + toIndentedString(name) +  "\n" +
            "    quantity: " + toIndentedString(quantity) + "\n" +
            "    shippingRequired: " +  toIndentedString(shippingRequired) + "\n" +
            "    sku: " + toIndentedString(sku) + "\n" +
            "    taxAmount: " +  toIndentedString(taxAmount) + "\n" +
            "    taxAmountPerUnit: " + toIndentedString(taxAmountPerUnit) + "\n" +
            "    taxes: " + toIndentedString(taxes) + "\n" +
            "    type: " + toIndentedString(type) +  "\n" +
            "    undiscountedAmountExcludingTax: " + toIndentedString(undiscountedAmountExcludingTax) +  "\n" +
            "    undiscountedAmountIncludingTax: " + toIndentedString(undiscountedAmountIncludingTax) +  "\n" +
            "    undiscountedUnitPriceExcludingTax: " + toIndentedString(undiscountedUnitPriceExcludingTax) +  "\n" +
            "    undiscountedUnitPriceIncludingTax: " + toIndentedString(undiscountedUnitPriceIncludingTax) +  "\n" +
            "    uniqueId: " + toIndentedString(uniqueId) + "\n" +
            "    unitPriceExcludingTax: " +  toIndentedString(unitPriceExcludingTax) + "\n" +
            "    unitPriceIncludingTax: " + toIndentedString(unitPriceIncludingTax) + "\n" +
            "}";
        }


}

