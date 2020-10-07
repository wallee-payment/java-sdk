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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.CustomersPresence;
import com.wallee.sdk.model.enums.Environment;
import com.wallee.sdk.model.enums.TransactionEnvironmentSelectionStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "")

public class TransactionCreate extends AbstractTransactionPending {

    @JsonProperty("autoConfirmationEnabled")
    protected Boolean autoConfirmationEnabled;


    @JsonProperty("chargeRetryEnabled")
    protected Boolean chargeRetryEnabled;


    @JsonProperty("customersPresence")
    protected CustomersPresence customersPresence;


    @JsonProperty("deviceSessionIdentifier")
    protected String deviceSessionIdentifier;


    @JsonProperty("emailsDisabled")
    protected Boolean emailsDisabled;


    @JsonProperty("environment")
    protected Environment environment;


    @JsonProperty("environmentSelectionStrategy")
    protected TransactionEnvironmentSelectionStrategy environmentSelectionStrategy;


    @JsonProperty("spaceViewId")
    protected Long spaceViewId;


    public TransactionCreate autoConfirmationEnabled(Boolean autoConfirmationEnabled) {
        this.autoConfirmationEnabled = autoConfirmationEnabled;
        return this;
    }

    /**
     * When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.
     *
     * @return autoConfirmationEnabled
     **/
    @ApiModelProperty(value = "When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.")
    public Boolean isAutoConfirmationEnabled() {
        return autoConfirmationEnabled;
    }

    public void setAutoConfirmationEnabled(Boolean autoConfirmationEnabled) {
        this.autoConfirmationEnabled = autoConfirmationEnabled;
    }


    public TransactionCreate chargeRetryEnabled(Boolean chargeRetryEnabled) {
        this.chargeRetryEnabled = chargeRetryEnabled;
        return this;
    }

    /**
     * When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
     *
     * @return chargeRetryEnabled
     **/
    @ApiModelProperty(value = "When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.")
    public Boolean isChargeRetryEnabled() {
        return chargeRetryEnabled;
    }

    public void setChargeRetryEnabled(Boolean chargeRetryEnabled) {
        this.chargeRetryEnabled = chargeRetryEnabled;
    }


    public TransactionCreate customersPresence(CustomersPresence customersPresence) {
        this.customersPresence = customersPresence;
        return this;
    }

    /**
     * The customer&#39;s presence indicates what kind of authentication methods can be used during the authorization of the transaction. If no value is provided, &#39;Virtually Present&#39; is used by default.
     *
     * @return customersPresence
     **/
    @ApiModelProperty(value = "The customer's presence indicates what kind of authentication methods can be used during the authorization of the transaction. If no value is provided, 'Virtually Present' is used by default.")
    public CustomersPresence getCustomersPresence() {
        return customersPresence;
    }

    public void setCustomersPresence(CustomersPresence customersPresence) {
        this.customersPresence = customersPresence;
    }


    public TransactionCreate deviceSessionIdentifier(String deviceSessionIdentifier) {
        this.deviceSessionIdentifier = deviceSessionIdentifier;
        return this;
    }

    /**
     * The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.
     *
     * @return deviceSessionIdentifier
     **/
    @ApiModelProperty(value = "The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.")
    public String getDeviceSessionIdentifier() {
        return deviceSessionIdentifier;
    }

    public void setDeviceSessionIdentifier(String deviceSessionIdentifier) {
        this.deviceSessionIdentifier = deviceSessionIdentifier;
    }


    public TransactionCreate emailsDisabled(Boolean emailsDisabled) {
        this.emailsDisabled = emailsDisabled;
        return this;
    }

    /**
     * Flag indicating whether email sending is disabled for this particular transaction. Defaults to false.
     *
     * @return emailsDisabled
     **/
    @ApiModelProperty(value = "Flag indicating whether email sending is disabled for this particular transaction. Defaults to false.")
    public Boolean isEmailsDisabled() {
        return emailsDisabled;
    }

    public void setEmailsDisabled(Boolean emailsDisabled) {
        this.emailsDisabled = emailsDisabled;
    }


    public TransactionCreate environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * @return environment
     **/
    @ApiModelProperty(value = "")
    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


    public TransactionCreate environmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
        this.environmentSelectionStrategy = environmentSelectionStrategy;
        return this;
    }

    /**
     * The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.
     *
     * @return environmentSelectionStrategy
     **/
    @ApiModelProperty(value = "The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.")
    public TransactionEnvironmentSelectionStrategy getEnvironmentSelectionStrategy() {
        return environmentSelectionStrategy;
    }

    public void setEnvironmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
        this.environmentSelectionStrategy = environmentSelectionStrategy;
    }


    public TransactionCreate spaceViewId(Long spaceViewId) {
        this.spaceViewId = spaceViewId;
        return this;
    }

    /**
     * @return spaceViewId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceViewId() {
        return spaceViewId;
    }

    public void setSpaceViewId(Long spaceViewId) {
        this.spaceViewId = spaceViewId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionCreate transactionCreate = (TransactionCreate) o;
        return Objects.equals(this.allowedPaymentMethodBrands, transactionCreate.allowedPaymentMethodBrands) &&
                Objects.equals(this.allowedPaymentMethodConfigurations, transactionCreate.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.billingAddress, transactionCreate.billingAddress) &&
                Objects.equals(this.currency, transactionCreate.currency) &&
                Objects.equals(this.customerEmailAddress, transactionCreate.customerEmailAddress) &&
                Objects.equals(this.customerId, transactionCreate.customerId) &&
                Objects.equals(this.failedUrl, transactionCreate.failedUrl) &&
                Objects.equals(this.invoiceMerchantReference, transactionCreate.invoiceMerchantReference) &&
                Objects.equals(this.language, transactionCreate.language) &&
                Objects.equals(this.lineItems, transactionCreate.lineItems) &&
                Objects.equals(this.merchantReference, transactionCreate.merchantReference) &&
                Objects.equals(this.metaData, transactionCreate.metaData) &&
                Objects.equals(this.shippingAddress, transactionCreate.shippingAddress) &&
                Objects.equals(this.shippingMethod, transactionCreate.shippingMethod) &&
                Objects.equals(this.successUrl, transactionCreate.successUrl) &&
                Objects.equals(this.timeZone, transactionCreate.timeZone) &&
                Objects.equals(this.token, transactionCreate.token) && this.tokenizationMode
                == transactionCreate.tokenizationMode &&
                Objects.equals(this.autoConfirmationEnabled, transactionCreate.autoConfirmationEnabled) &&
                Objects.equals(this.chargeRetryEnabled, transactionCreate.chargeRetryEnabled) && this.customersPresence
                == transactionCreate.customersPresence &&
                Objects.equals(this.deviceSessionIdentifier, transactionCreate.deviceSessionIdentifier) &&
                Objects.equals(this.emailsDisabled, transactionCreate.emailsDisabled) && this.environment
                == transactionCreate.environment
                && this.environmentSelectionStrategy == transactionCreate.environmentSelectionStrategy &&
                Objects.equals(this.spaceViewId, transactionCreate.spaceViewId) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, billingAddress, currency, customerEmailAddress, customerId, failedUrl, invoiceMerchantReference, language, lineItems, merchantReference, metaData, shippingAddress, shippingMethod, successUrl, timeZone, token, tokenizationMode, autoConfirmationEnabled, chargeRetryEnabled, customersPresence, deviceSessionIdentifier, emailsDisabled, environment, environmentSelectionStrategy, spaceViewId, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TransactionCreate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    allowedPaymentMethodBrands: " + toIndentedString(allowedPaymentMethodBrands) +  " \n" +
            "    allowedPaymentMethodConfigurations: " + toIndentedString(allowedPaymentMethodConfigurations) +  " \n" +
            "    billingAddress: " + toIndentedString(billingAddress) + " \n" +
            "    currency: " +  toIndentedString(currency) + " \n" +
            "    customerEmailAddress: " + toIndentedString(customerEmailAddress) +  " \n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    failedUrl: " + toIndentedString(failedUrl) + "\n" +
            "    invoiceMerchantReference: " + toIndentedString(invoiceMerchantReference) +  " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    lineItems: " + toIndentedString(lineItems) + "\n" +
            "    merchantReference: " + toIndentedString(merchantReference) + " \n" +
            "    metaData: " + toIndentedString(metaData) + " \n" +
            "    shippingAddress: " + toIndentedString(shippingAddress) +  " \n" +
            "    shippingMethod: " + toIndentedString(shippingMethod) + " \n" +
            "    successUrl: " +  toIndentedString(successUrl) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    token: " +  toIndentedString(token) + " \n" +
            "    tokenizationMode: " + toIndentedString(tokenizationMode) +  " \n" +
            "    autoConfirmationEnabled: " + toIndentedString(autoConfirmationEnabled) +  " \n" +
            "    chargeRetryEnabled: " + toIndentedString(chargeRetryEnabled) + " \n" +
            "    customersPresence: " + toIndentedString(customersPresence) + " \n" +
            "    deviceSessionIdentifier: " +  toIndentedString(deviceSessionIdentifier) + " \n" +
            "    emailsDisabled: " + toIndentedString(emailsDisabled) +  " \n" +
            "    environment: " + toIndentedString(environment) + " \n" +
            "    environmentSelectionStrategy: " + toIndentedString(environmentSelectionStrategy) + " \n" +
            "    spaceViewId: " + toIndentedString(spaceViewId) + "\n" +
            "}";
        }


}

