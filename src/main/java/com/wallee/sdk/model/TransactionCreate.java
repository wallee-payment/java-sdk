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
import com.wallee.sdk.model.AbstractTransactionPending;
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.TransactionEnvironmentSelectionStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionCreate extends AbstractTransactionPending {
  
  @JsonProperty("autoConfirmationEnabled")
  protected Boolean autoConfirmationEnabled = null;

  
  @JsonProperty("chargeRetryEnabled")
  protected Boolean chargeRetryEnabled = null;

  
  @JsonProperty("customersPresence")
  protected CustomersPresence customersPresence = null;

  
  @JsonProperty("deviceSessionIdentifier")
  protected String deviceSessionIdentifier = null;

  
  @JsonProperty("emailsDisabled")
  protected Boolean emailsDisabled = null;

  
  @JsonProperty("environment")
  protected Environment environment = null;

  
  @JsonProperty("environmentSelectionStrategy")
  protected TransactionEnvironmentSelectionStrategy environmentSelectionStrategy = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  
  public TransactionCreate autoConfirmationEnabled(Boolean autoConfirmationEnabled) {
    this.autoConfirmationEnabled = autoConfirmationEnabled;
    return this;
  }

   /**
   * Whether the transaction can be confirmed automatically or whether this must be done explicitly via the API. Default is true.
   * @return autoConfirmationEnabled
  **/
  @ApiModelProperty(value = "Whether the transaction can be confirmed automatically or whether this must be done explicitly via the API. Default is true.")
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
   * Whether the customer can make further payment attempts if the first one has failed. Default is true.
   * @return chargeRetryEnabled
  **/
  @ApiModelProperty(value = "Whether the customer can make further payment attempts if the first one has failed. Default is true.")
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
   * The customer&#39;s presence indicates whether and in what way the transaction&#39;s customer is present. Default is VIRTUAL_PRESENT.
   * @return customersPresence
  **/
  @ApiModelProperty(value = "The customer's presence indicates whether and in what way the transaction's customer is present. Default is VIRTUAL_PRESENT.")
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
   * Allows to link the transaction to the data collected from the customer&#39;s device.
   * @return deviceSessionIdentifier
  **/
  @ApiModelProperty(value = "Allows to link the transaction to the data collected from the customer's device.")
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
   * Whether email sending is deactivated for the transaction. Default is false.
   * @return emailsDisabled
  **/
  @ApiModelProperty(value = "Whether email sending is deactivated for the transaction. Default is false.")
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
   * The environment used when rendering resources.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment used when rendering resources.")
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
   * The strategy for determining whether the transaction is to be processed in the test or production environment.
   * @return environmentSelectionStrategy
  **/
  @ApiModelProperty(value = "The strategy for determining whether the transaction is to be processed in the test or production environment.")
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
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  public void setSpaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.completionBehavior, transactionCreate.completionBehavior) &&
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
        Objects.equals(this.token, transactionCreate.token) &&
        Objects.equals(this.tokenizationMode, transactionCreate.tokenizationMode) &&
        Objects.equals(this.autoConfirmationEnabled, transactionCreate.autoConfirmationEnabled) &&
        Objects.equals(this.chargeRetryEnabled, transactionCreate.chargeRetryEnabled) &&
        Objects.equals(this.customersPresence, transactionCreate.customersPresence) &&
        Objects.equals(this.deviceSessionIdentifier, transactionCreate.deviceSessionIdentifier) &&
        Objects.equals(this.emailsDisabled, transactionCreate.emailsDisabled) &&
        Objects.equals(this.environment, transactionCreate.environment) &&
        Objects.equals(this.environmentSelectionStrategy, transactionCreate.environmentSelectionStrategy) &&
        Objects.equals(this.spaceViewId, transactionCreate.spaceViewId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, billingAddress, completionBehavior, currency, customerEmailAddress, customerId, failedUrl, invoiceMerchantReference, language, lineItems, merchantReference, metaData, shippingAddress, shippingMethod, successUrl, timeZone, token, tokenizationMode, autoConfirmationEnabled, chargeRetryEnabled, customersPresence, deviceSessionIdentifier, emailsDisabled, environment, environmentSelectionStrategy, spaceViewId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowedPaymentMethodBrands: ").append(toIndentedString(allowedPaymentMethodBrands)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenizationMode: ").append(toIndentedString(tokenizationMode)).append("\n");
    sb.append("    autoConfirmationEnabled: ").append(toIndentedString(autoConfirmationEnabled)).append("\n");
    sb.append("    chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    deviceSessionIdentifier: ").append(toIndentedString(deviceSessionIdentifier)).append("\n");
    sb.append("    emailsDisabled: ").append(toIndentedString(emailsDisabled)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    environmentSelectionStrategy: ").append(toIndentedString(environmentSelectionStrategy)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
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

