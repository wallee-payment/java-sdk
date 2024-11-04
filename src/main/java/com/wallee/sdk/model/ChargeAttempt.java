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
import com.wallee.sdk.model.Charge;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.ChargeAttemptState;
import com.wallee.sdk.model.ConnectorInvocation;
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentTerminal;
import com.wallee.sdk.model.TokenVersion;
import com.wallee.sdk.model.TransactionAwareEntity;
import com.wallee.sdk.model.TransactionCompletionBehavior;
import com.wallee.sdk.model.WalletType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ChargeAttempt extends TransactionAwareEntity {
  
  @JsonProperty("charge")
  protected Charge charge = null;

  
  @JsonProperty("completionBehavior")
  protected TransactionCompletionBehavior completionBehavior = null;

  
  @JsonProperty("connectorConfiguration")
  protected PaymentConnectorConfiguration connectorConfiguration = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("customersPresence")
  protected CustomersPresence customersPresence = null;

  
  @JsonProperty("environment")
  protected ChargeAttemptEnvironment environment = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("initializingTokenVersion")
  protected Boolean initializingTokenVersion = null;

  
  @JsonProperty("invocation")
  protected ConnectorInvocation invocation = null;

  
  @JsonProperty("labels")
  protected List<Label> labels = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("nextUpdateOn")
  protected OffsetDateTime nextUpdateOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("redirectionUrl")
  protected String redirectionUrl = null;

  
  @JsonProperty("salesChannel")
  protected Long salesChannel = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected ChargeAttemptState state = null;

  
  @JsonProperty("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @JsonProperty("terminal")
  protected PaymentTerminal terminal = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("tokenVersion")
  protected TokenVersion tokenVersion = null;

  
  @JsonProperty("userFailureMessage")
  protected String userFailureMessage = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  @JsonProperty("wallet")
  protected WalletType wallet = null;

  
  
   /**
   * 
   * @return charge
  **/
  @ApiModelProperty(value = "")
  public Charge getCharge() {
    return charge;
  }

  
   /**
   * 
   * @return completionBehavior
  **/
  @ApiModelProperty(value = "")
  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }

  
   /**
   * 
   * @return connectorConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentConnectorConfiguration getConnectorConfiguration() {
    return connectorConfiguration;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The customer&#39;s presence indicates which kind of customer interaction was used during the charge attempt.
   * @return customersPresence
  **/
  @ApiModelProperty(value = "The customer's presence indicates which kind of customer interaction was used during the charge attempt.")
  public CustomersPresence getCustomersPresence() {
    return customersPresence;
  }

  
   /**
   * 
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }

  
   /**
   * 
   * @return failedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * 
   * @return failureReason
  **/
  @ApiModelProperty(value = "")
  public FailureReason getFailureReason() {
    return failureReason;
  }

  
   /**
   * 
   * @return initializingTokenVersion
  **/
  @ApiModelProperty(value = "")
  public Boolean isInitializingTokenVersion() {
    return initializingTokenVersion;
  }

  
   /**
   * 
   * @return invocation
  **/
  @ApiModelProperty(value = "")
  public ConnectorInvocation getInvocation() {
    return invocation;
  }

  
   /**
   * The labels providing additional information about the object.
   * @return labels
  **/
  @ApiModelProperty(value = "The labels providing additional information about the object.")
  public List<Label> getLabels() {
    return labels;
  }

  
   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * 
   * @return nextUpdateOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getNextUpdateOn() {
    return nextUpdateOn;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return redirectionUrl
  **/
  @ApiModelProperty(value = "")
  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  
   /**
   * 
   * @return salesChannel
  **/
  @ApiModelProperty(value = "")
  public Long getSalesChannel() {
    return salesChannel;
  }

  
   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public ChargeAttemptState getState() {
    return state;
  }

  
   /**
   * 
   * @return succeededOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSucceededOn() {
    return succeededOn;
  }

  
   /**
   * 
   * @return terminal
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminal getTerminal() {
    return terminal;
  }

  
   /**
   * 
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * 
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * 
   * @return tokenVersion
  **/
  @ApiModelProperty(value = "")
  public TokenVersion getTokenVersion() {
    return tokenVersion;
  }

  
   /**
   * The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.
   * @return userFailureMessage
  **/
  @ApiModelProperty(value = "The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.")
  public String getUserFailureMessage() {
    return userFailureMessage;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  
   /**
   * 
   * @return wallet
  **/
  @ApiModelProperty(value = "")
  public WalletType getWallet() {
    return wallet;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeAttempt chargeAttempt = (ChargeAttempt) o;
    return Objects.equals(this.id, chargeAttempt.id) &&
        Objects.equals(this.linkedSpaceId, chargeAttempt.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, chargeAttempt.linkedTransaction) &&
        Objects.equals(this.charge, chargeAttempt.charge) &&
        Objects.equals(this.completionBehavior, chargeAttempt.completionBehavior) &&
        Objects.equals(this.connectorConfiguration, chargeAttempt.connectorConfiguration) &&
        Objects.equals(this.createdOn, chargeAttempt.createdOn) &&
        Objects.equals(this.customersPresence, chargeAttempt.customersPresence) &&
        Objects.equals(this.environment, chargeAttempt.environment) &&
        Objects.equals(this.failedOn, chargeAttempt.failedOn) &&
        Objects.equals(this.failureReason, chargeAttempt.failureReason) &&
        Objects.equals(this.initializingTokenVersion, chargeAttempt.initializingTokenVersion) &&
        Objects.equals(this.invocation, chargeAttempt.invocation) &&
        Objects.equals(this.labels, chargeAttempt.labels) &&
        Objects.equals(this.language, chargeAttempt.language) &&
        Objects.equals(this.nextUpdateOn, chargeAttempt.nextUpdateOn) &&
        Objects.equals(this.plannedPurgeDate, chargeAttempt.plannedPurgeDate) &&
        Objects.equals(this.redirectionUrl, chargeAttempt.redirectionUrl) &&
        Objects.equals(this.salesChannel, chargeAttempt.salesChannel) &&
        Objects.equals(this.spaceViewId, chargeAttempt.spaceViewId) &&
        Objects.equals(this.state, chargeAttempt.state) &&
        Objects.equals(this.succeededOn, chargeAttempt.succeededOn) &&
        Objects.equals(this.terminal, chargeAttempt.terminal) &&
        Objects.equals(this.timeZone, chargeAttempt.timeZone) &&
        Objects.equals(this.timeoutOn, chargeAttempt.timeoutOn) &&
        Objects.equals(this.tokenVersion, chargeAttempt.tokenVersion) &&
        Objects.equals(this.userFailureMessage, chargeAttempt.userFailureMessage) &&
        Objects.equals(this.version, chargeAttempt.version) &&
        Objects.equals(this.wallet, chargeAttempt.wallet) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, charge, completionBehavior, connectorConfiguration, createdOn, customersPresence, environment, failedOn, failureReason, initializingTokenVersion, invocation, labels, language, nextUpdateOn, plannedPurgeDate, redirectionUrl, salesChannel, spaceViewId, state, succeededOn, terminal, timeZone, timeoutOn, tokenVersion, userFailureMessage, version, wallet, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAttempt {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    initializingTokenVersion: ").append(toIndentedString(initializingTokenVersion)).append("\n");
    sb.append("    invocation: ").append(toIndentedString(invocation)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
    sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    tokenVersion: ").append(toIndentedString(tokenVersion)).append("\n");
    sb.append("    userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

