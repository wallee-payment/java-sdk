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

public class ChargeAttempt {
  
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

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("initializingTokenVersion")
  protected Boolean initializingTokenVersion = null;

  
  @JsonProperty("invocation")
  protected ConnectorInvocation invocation = null;

  
  @JsonProperty("labels")
  protected List<Label> labels = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
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
   * The charge that the charge attempt belongs to.
   * @return charge
  **/
  @ApiModelProperty(value = "The charge that the charge attempt belongs to.")
  public Charge getCharge() {
    return charge;
  }

  
   /**
   * The behavior that controls when the transaction is completed.
   * @return completionBehavior
  **/
  @ApiModelProperty(value = "The behavior that controls when the transaction is completed.")
  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }

  
   /**
   * The payment connector configuration that was used for the charge attempt.
   * @return connectorConfiguration
  **/
  @ApiModelProperty(value = "The payment connector configuration that was used for the charge attempt.")
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
   * The customer&#39;s presence indicates whether and in what way the charge attempt&#39;s customer is present.
   * @return customersPresence
  **/
  @ApiModelProperty(value = "The customer's presence indicates whether and in what way the charge attempt's customer is present.")
  public CustomersPresence getCustomersPresence() {
    return customersPresence;
  }

  
   /**
   * The environment in which the charge attempt is executed.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment in which the charge attempt is executed.")
  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }

  
   /**
   * The date and time when the charge attempt failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the charge attempt failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * The reason for the failure of the charge attempt.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the failure of the charge attempt.")
  public FailureReason getFailureReason() {
    return failureReason;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * Whether a new token version is being initialized.
   * @return initializingTokenVersion
  **/
  @ApiModelProperty(value = "Whether a new token version is being initialized.")
  public Boolean isInitializingTokenVersion() {
    return initializingTokenVersion;
  }

  
   /**
   * The connector invocation that the charge attempt belongs to.
   * @return invocation
  **/
  @ApiModelProperty(value = "The connector invocation that the charge attempt belongs to.")
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @ApiModelProperty(value = "The payment transaction this object is linked to.")
  public Long getLinkedTransaction() {
    return linkedTransaction;
  }

  
   /**
   * The date and time when the next update of the object&#39;s state is planned.
   * @return nextUpdateOn
  **/
  @ApiModelProperty(value = "The date and time when the next update of the object's state is planned.")
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
   * The URL to redirect the customer to after payment processing.
   * @return redirectionUrl
  **/
  @ApiModelProperty(value = "The URL to redirect the customer to after payment processing.")
  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  
   /**
   * The sales channel through which the charge attempt was made.
   * @return salesChannel
  **/
  @ApiModelProperty(value = "The sales channel through which the charge attempt was made.")
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
   * The date and time when the charge attempt succeeded.
   * @return succeededOn
  **/
  @ApiModelProperty(value = "The date and time when the charge attempt succeeded.")
  public OffsetDateTime getSucceededOn() {
    return succeededOn;
  }

  
   /**
   * The payment terminal through which the charge attempt was made.
   * @return terminal
  **/
  @ApiModelProperty(value = "The payment terminal through which the charge attempt was made.")
  public PaymentTerminal getTerminal() {
    return terminal;
  }

  
   /**
   * The time zone that this object is associated with.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone that this object is associated with.")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * The date and time when the object will expire.
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "The date and time when the object will expire.")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * The token version used for the charge attempt.
   * @return tokenVersion
  **/
  @ApiModelProperty(value = "The token version used for the charge attempt.")
  public TokenVersion getTokenVersion() {
    return tokenVersion;
  }

  
   /**
   * The message that can be displayed to the customer explaining why the charge attempt failed, in the customer&#39;s language.
   * @return userFailureMessage
  **/
  @ApiModelProperty(value = "The message that can be displayed to the customer explaining why the charge attempt failed, in the customer's language.")
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
   * The type of wallet used to make the charge attempt.
   * @return wallet
  **/
  @ApiModelProperty(value = "The type of wallet used to make the charge attempt.")
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
    return Objects.equals(this.charge, chargeAttempt.charge) &&
        Objects.equals(this.completionBehavior, chargeAttempt.completionBehavior) &&
        Objects.equals(this.connectorConfiguration, chargeAttempt.connectorConfiguration) &&
        Objects.equals(this.createdOn, chargeAttempt.createdOn) &&
        Objects.equals(this.customersPresence, chargeAttempt.customersPresence) &&
        Objects.equals(this.environment, chargeAttempt.environment) &&
        Objects.equals(this.failedOn, chargeAttempt.failedOn) &&
        Objects.equals(this.failureReason, chargeAttempt.failureReason) &&
        Objects.equals(this.id, chargeAttempt.id) &&
        Objects.equals(this.initializingTokenVersion, chargeAttempt.initializingTokenVersion) &&
        Objects.equals(this.invocation, chargeAttempt.invocation) &&
        Objects.equals(this.labels, chargeAttempt.labels) &&
        Objects.equals(this.language, chargeAttempt.language) &&
        Objects.equals(this.linkedSpaceId, chargeAttempt.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, chargeAttempt.linkedTransaction) &&
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
        Objects.equals(this.wallet, chargeAttempt.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charge, completionBehavior, connectorConfiguration, createdOn, customersPresence, environment, failedOn, failureReason, id, initializingTokenVersion, invocation, labels, language, linkedSpaceId, linkedTransaction, nextUpdateOn, plannedPurgeDate, redirectionUrl, salesChannel, spaceViewId, state, succeededOn, terminal, timeZone, timeoutOn, tokenVersion, userFailureMessage, version, wallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAttempt {\n");
    
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initializingTokenVersion: ").append(toIndentedString(initializingTokenVersion)).append("\n");
    sb.append("    invocation: ").append(toIndentedString(invocation)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
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

