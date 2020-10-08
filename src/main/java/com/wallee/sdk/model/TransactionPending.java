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

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class TransactionPending extends AbstractTransactionPending {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public TransactionPending id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public TransactionPending version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionPending transactionPending = (TransactionPending) o;
        return Objects.equals(this.allowedPaymentMethodBrands, transactionPending.allowedPaymentMethodBrands) &&
                Objects.equals(this.allowedPaymentMethodConfigurations, transactionPending.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.billingAddress, transactionPending.billingAddress) &&
                Objects.equals(this.currency, transactionPending.currency) &&
                Objects.equals(this.customerEmailAddress, transactionPending.customerEmailAddress) &&
                Objects.equals(this.customerId, transactionPending.customerId) &&
                Objects.equals(this.failedUrl, transactionPending.failedUrl) &&
                Objects.equals(this.invoiceMerchantReference, transactionPending.invoiceMerchantReference) &&
                Objects.equals(this.language, transactionPending.language) &&
                Objects.equals(this.lineItems, transactionPending.lineItems) &&
                Objects.equals(this.merchantReference, transactionPending.merchantReference) &&
                Objects.equals(this.metaData, transactionPending.metaData) &&
                Objects.equals(this.shippingAddress, transactionPending.shippingAddress) &&
                Objects.equals(this.shippingMethod, transactionPending.shippingMethod) &&
                Objects.equals(this.successUrl, transactionPending.successUrl) &&
                Objects.equals(this.timeZone, transactionPending.timeZone) &&
                Objects.equals(this.token, transactionPending.token) && this.tokenizationMode
                == transactionPending.tokenizationMode &&
                Objects.equals(this.id, transactionPending.id) &&
                Objects.equals(this.version, transactionPending.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, billingAddress, currency, customerEmailAddress, customerId, failedUrl, invoiceMerchantReference, language, lineItems, merchantReference, metaData, shippingAddress, shippingMethod, successUrl, timeZone, token, tokenizationMode, id, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TransactionPending {\n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    allowedPaymentMethodBrands: " + toIndentedString(allowedPaymentMethodBrands) +  "\n" +
            "    allowedPaymentMethodConfigurations: " + toIndentedString(allowedPaymentMethodConfigurations) +  "\n" +
            "    billingAddress: " + toIndentedString(billingAddress) + "\n" +
            "    currency: " +  toIndentedString(currency) + "\n" +
            "    customerEmailAddress: " + toIndentedString(customerEmailAddress) +  "\n" +
            "    customerId: " + toIndentedString(customerId) + "\n" +
            "    failedUrl: " + toIndentedString(failedUrl) + "\n" +
            "    invoiceMerchantReference: " + toIndentedString(invoiceMerchantReference) +  "\n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    lineItems: " + toIndentedString(lineItems) + "\n" +
            "    merchantReference: " + toIndentedString(merchantReference) + "\n" +
            "    metaData: " + toIndentedString(metaData) + "\n" +
            "    shippingAddress: " + toIndentedString(shippingAddress) +  "\n" +
            "    shippingMethod: " + toIndentedString(shippingMethod) + "\n" +
            "    successUrl: " +  toIndentedString(successUrl) + "\n" +
            "    timeZone: " + toIndentedString(timeZone) + "\n" +
            "    token: " +  toIndentedString(token) + "\n" +
            "    tokenizationMode: " + toIndentedString(tokenizationMode) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

