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

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AbstractTokenUpdate
 */

public class AbstractTokenUpdate extends Indentable {

    @JsonProperty("customerEmailAddress")
    protected String customerEmailAddress;


    @JsonProperty("customerId")
    protected String customerId;


    @JsonProperty("enabledForOneClickPayment")
    protected Boolean enabledForOneClickPayment;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("tokenReference")
    protected String tokenReference;


    public AbstractTokenUpdate customerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        return this;
    }

    /**
     * The customer email address is the email address of the customer.
     *
     * @return customerEmailAddress
     **/
    @ApiModelProperty(value = "The customer email address is the email address of the customer.")
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }


    public AbstractTokenUpdate customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it.
     *
     * @return customerId
     **/
    @ApiModelProperty(value = "The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it.")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public AbstractTokenUpdate enabledForOneClickPayment(Boolean enabledForOneClickPayment) {
        this.enabledForOneClickPayment = enabledForOneClickPayment;
        return this;
    }

    /**
     * When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments.
     *
     * @return enabledForOneClickPayment
     **/
    @ApiModelProperty(value = "When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments.")
    public Boolean isEnabledForOneClickPayment() {
        return enabledForOneClickPayment;
    }

    public void setEnabledForOneClickPayment(Boolean enabledForOneClickPayment) {
        this.enabledForOneClickPayment = enabledForOneClickPayment;
    }


    public AbstractTokenUpdate language(String language) {
        this.language = language;
        return this;
    }

    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public AbstractTokenUpdate timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.
     *
     * @return timeZone
     **/
    @ApiModelProperty(value = "The time zone defines in which time zone the customer is located in. The time zone may affects how dates are formatted when interacting with the customer.")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    public AbstractTokenUpdate tokenReference(String tokenReference) {
        this.tokenReference = tokenReference;
        return this;
    }

    /**
     * Use something that it is easy to identify and may help you find the token (e.g. customer id, email address).
     *
     * @return tokenReference
     **/
    @ApiModelProperty(value = "Use something that it is easy to identify and may help you find the token (e.g. customer id, email address).")
    public String getTokenReference() {
        return tokenReference;
    }

    public void setTokenReference(String tokenReference) {
        this.tokenReference = tokenReference;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractTokenUpdate abstractTokenUpdate = (AbstractTokenUpdate) o;
        return Objects.equals(this.customerEmailAddress, abstractTokenUpdate.customerEmailAddress) &&
                Objects.equals(this.customerId, abstractTokenUpdate.customerId) &&
                Objects.equals(this.enabledForOneClickPayment, abstractTokenUpdate.enabledForOneClickPayment) &&
                Objects.equals(this.language, abstractTokenUpdate.language) &&
                Objects.equals(this.timeZone, abstractTokenUpdate.timeZone) &&
                Objects.equals(this.tokenReference, abstractTokenUpdate.tokenReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerEmailAddress, customerId, enabledForOneClickPayment, language, timeZone, tokenReference);
    }


    @Override
    public String toString() {

        return "class AbstractTokenUpdate { \n" +
            "    customerEmailAddress: " + toIndentedString(customerEmailAddress) + " \n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    enabledForOneClickPayment: " + toIndentedString(enabledForOneClickPayment) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    tokenReference: " + toIndentedString(tokenReference) + " \n" +
            "}";
    }

}

