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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class PersistableCurrencyAmount extends Indentable {

    @JsonProperty("amount")
    protected BigDecimal amount;


    @JsonProperty("currency")
    protected String currency;


    /**
     * @return amount
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmount() {
        return amount;
    }


    /**
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public String getCurrency() {
        return currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistableCurrencyAmount persistableCurrencyAmount = (PersistableCurrencyAmount) o;
        return Objects.equals(this.amount, persistableCurrencyAmount.amount) &&
                Objects.equals(this.currency, persistableCurrencyAmount.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }


    @Override
    public String toString() {

        return "class PersistableCurrencyAmount { \n" +
            "    amount: " + toIndentedString(amount) +  "\n" +
            "    currency: " + toIndentedString(currency) + " \n" +
            "}";
        }


}

