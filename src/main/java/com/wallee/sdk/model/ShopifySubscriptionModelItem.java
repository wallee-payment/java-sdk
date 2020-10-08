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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class ShopifySubscriptionModelItem extends Indentable {

    @JsonProperty("priceIncludingTax")
    protected BigDecimal priceIncludingTax;


    @JsonProperty("productId")
    protected Long productId;


    @JsonProperty("quantity")
    protected BigDecimal quantity;


    @JsonProperty("recalculatePrice")
    protected Boolean recalculatePrice;


    @JsonProperty("taxLines")
    protected List<ShopifySubscriptionModelTaxLine> taxLines;


    public ShopifySubscriptionModelItem priceIncludingTax(BigDecimal priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
        return this;
    }

    /**
     * @return priceIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getPriceIncludingTax() {
        return priceIncludingTax;
    }

    public void setPriceIncludingTax(BigDecimal priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
    }


    public ShopifySubscriptionModelItem productId(Long productId) {
        this.productId = productId;
        return this;
    }

    /**
     * @return productId
     **/
    @ApiModelProperty(value = "")
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }


    public ShopifySubscriptionModelItem quantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * @return quantity
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }


    public ShopifySubscriptionModelItem recalculatePrice(Boolean recalculatePrice) {
        this.recalculatePrice = recalculatePrice;
        return this;
    }

    /**
     * @return recalculatePrice
     **/
    @ApiModelProperty(value = "")
    public Boolean isRecalculatePrice() {
        return recalculatePrice;
    }

    public void setRecalculatePrice(Boolean recalculatePrice) {
        this.recalculatePrice = recalculatePrice;
    }


    public ShopifySubscriptionModelItem taxLines(List<ShopifySubscriptionModelTaxLine> taxLines) {
        this.taxLines = taxLines;
        return this;
    }

    public ShopifySubscriptionModelItem addTaxLinesItem(ShopifySubscriptionModelTaxLine taxLinesItem) {
        if (this.taxLines == null) {
            this.taxLines = new ArrayList<>();
        }
        this.taxLines.add(taxLinesItem);
        return this;
    }

    /**
     * @return taxLines
     **/
    @ApiModelProperty(value = "")
    public List<ShopifySubscriptionModelTaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<ShopifySubscriptionModelTaxLine> taxLines) {
        this.taxLines = taxLines;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShopifySubscriptionModelItem shopifySubscriptionModelItem = (ShopifySubscriptionModelItem) o;
        return Objects.equals(this.priceIncludingTax, shopifySubscriptionModelItem.priceIncludingTax) &&
                Objects.equals(this.productId, shopifySubscriptionModelItem.productId) &&
                Objects.equals(this.quantity, shopifySubscriptionModelItem.quantity) &&
                Objects.equals(this.recalculatePrice, shopifySubscriptionModelItem.recalculatePrice) &&
                Objects.equals(this.taxLines, shopifySubscriptionModelItem.taxLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceIncludingTax, productId, quantity, recalculatePrice, taxLines);
    }


    @Override
    public String toString() {

        return "class ShopifySubscriptionModelItem { \n" +
            "    priceIncludingTax: " +  toIndentedString(priceIncludingTax) + " \n" +
            "    productId: " + toIndentedString(productId) + " \n" +
            "    quantity: " + toIndentedString(quantity) + " \n" +
            "    recalculatePrice: " + toIndentedString(recalculatePrice) +  " \n" +
            "    taxLines: " + toIndentedString(taxLines) + " \n" +
            "}";
        }


}

