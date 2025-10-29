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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ChargeAttempt
 */
@JsonPropertyOrder({
  ChargeAttempt.JSON_PROPERTY_LANGUAGE,
  ChargeAttempt.JSON_PROPERTY_SALES_CHANNEL,
  ChargeAttempt.JSON_PROPERTY_CREATED_ON,
  ChargeAttempt.JSON_PROPERTY_INITIALIZING_TOKEN_VERSION,
  ChargeAttempt.JSON_PROPERTY_TOKEN_VERSION,
  ChargeAttempt.JSON_PROPERTY_SUCCEEDED_ON,
  ChargeAttempt.JSON_PROPERTY_ID,
  ChargeAttempt.JSON_PROPERTY_STATE,
  ChargeAttempt.JSON_PROPERTY_LINKED_TRANSACTION,
  ChargeAttempt.JSON_PROPERTY_REDIRECTION_URL,
  ChargeAttempt.JSON_PROPERTY_CHARGE,
  ChargeAttempt.JSON_PROPERTY_WALLET,
  ChargeAttempt.JSON_PROPERTY_PLANNED_PURGE_DATE,
  ChargeAttempt.JSON_PROPERTY_TIME_ZONE,
  ChargeAttempt.JSON_PROPERTY_SPACE_VIEW_ID,
  ChargeAttempt.JSON_PROPERTY_TERMINAL,
  ChargeAttempt.JSON_PROPERTY_USER_FAILURE_MESSAGE,
  ChargeAttempt.JSON_PROPERTY_COMPLETION_BEHAVIOR,
  ChargeAttempt.JSON_PROPERTY_VERSION,
  ChargeAttempt.JSON_PROPERTY_LABELS,
  ChargeAttempt.JSON_PROPERTY_LINKED_SPACE_ID,
  ChargeAttempt.JSON_PROPERTY_TIMEOUT_ON,
  ChargeAttempt.JSON_PROPERTY_ENVIRONMENT,
  ChargeAttempt.JSON_PROPERTY_INVOCATION,
  ChargeAttempt.JSON_PROPERTY_CONNECTOR_CONFIGURATION,
  ChargeAttempt.JSON_PROPERTY_NEXT_UPDATE_ON,
  ChargeAttempt.JSON_PROPERTY_FAILURE_REASON,
  ChargeAttempt.JSON_PROPERTY_CUSTOMERS_PRESENCE,
  ChargeAttempt.JSON_PROPERTY_FAILED_ON
})

public class ChargeAttempt {
  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SALES_CHANNEL = "salesChannel";
  private Long salesChannel;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_INITIALIZING_TOKEN_VERSION = "initializingTokenVersion";
  private Boolean initializingTokenVersion;

  public static final String JSON_PROPERTY_TOKEN_VERSION = "tokenVersion";
  private TokenVersion tokenVersion;

  public static final String JSON_PROPERTY_SUCCEEDED_ON = "succeededOn";
  private OffsetDateTime succeededOn;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private ChargeAttemptState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_REDIRECTION_URL = "redirectionUrl";
  private String redirectionUrl;

  public static final String JSON_PROPERTY_CHARGE = "charge";
  private Charge charge;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  private WalletType wallet;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_TERMINAL = "terminal";
  private PaymentTerminal terminal;

  public static final String JSON_PROPERTY_USER_FAILURE_MESSAGE = "userFailureMessage";
  private String userFailureMessage;

  public static final String JSON_PROPERTY_COMPLETION_BEHAVIOR = "completionBehavior";
  private TransactionCompletionBehavior completionBehavior;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Set<Label> labels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TIMEOUT_ON = "timeoutOn";
  private OffsetDateTime timeoutOn;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private ChargeAttemptEnvironment environment;

  public static final String JSON_PROPERTY_INVOCATION = "invocation";
  private ConnectorInvocation invocation;

  public static final String JSON_PROPERTY_CONNECTOR_CONFIGURATION = "connectorConfiguration";
  private PaymentConnectorConfiguration connectorConfiguration;

  public static final String JSON_PROPERTY_NEXT_UPDATE_ON = "nextUpdateOn";
  private OffsetDateTime nextUpdateOn;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  private FailureReason failureReason;

  public static final String JSON_PROPERTY_CUSTOMERS_PRESENCE = "customersPresence";
  private CustomersPresence customersPresence;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  private OffsetDateTime failedOn;

  public ChargeAttempt() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public ChargeAttempt(
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_SALES_CHANNEL) Long salesChannel, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_INITIALIZING_TOKEN_VERSION) Boolean initializingTokenVersion, 
    @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON) OffsetDateTime succeededOn, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_REDIRECTION_URL) String redirectionUrl, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_USER_FAILURE_MESSAGE) String userFailureMessage, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LABELS) Set<Label> labels, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TIMEOUT_ON) OffsetDateTime timeoutOn, 
    @JsonProperty(JSON_PROPERTY_NEXT_UPDATE_ON) OffsetDateTime nextUpdateOn, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn
  ) {
    this();
    this.language = language;
    this.salesChannel = salesChannel;
    this.createdOn = createdOn;
    this.initializingTokenVersion = initializingTokenVersion;
    this.succeededOn = succeededOn;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
    this.redirectionUrl = redirectionUrl;
    this.plannedPurgeDate = plannedPurgeDate;
    this.timeZone = timeZone;
    this.spaceViewId = spaceViewId;
    this.userFailureMessage = userFailureMessage;
    this.version = version;
    this.labels = labels;
    this.linkedSpaceId = linkedSpaceId;
    this.timeoutOn = timeoutOn;
    this.nextUpdateOn = nextUpdateOn;
    this.failedOn = failedOn;
  }

   /**
   * The language that is linked to the object.
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



   /**
   * The sales channel through which the charge attempt was made.
   * @return salesChannel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALES_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSalesChannel() {
    return salesChannel;
  }



   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * Whether a new token version is being initialized.
   * @return initializingTokenVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIALIZING_TOKEN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInitializingTokenVersion() {
    return initializingTokenVersion;
  }



  public ChargeAttempt tokenVersion(TokenVersion tokenVersion) {
    
    this.tokenVersion = tokenVersion;
    return this;
  }

   /**
   * Get tokenVersion
   * @return tokenVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenVersion getTokenVersion() {
    return tokenVersion;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenVersion(TokenVersion tokenVersion) {
    this.tokenVersion = tokenVersion;
  }

   /**
   * The date and time when the charge attempt succeeded.
   * @return succeededOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSucceededOn() {
    return succeededOn;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public ChargeAttempt state(ChargeAttemptState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(ChargeAttemptState state) {
    this.state = state;
  }

   /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



   /**
   * The URL to redirect the customer to after payment processing.
   * @return redirectionUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECTION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedirectionUrl() {
    return redirectionUrl;
  }



  public ChargeAttempt charge(Charge charge) {
    
    this.charge = charge;
    return this;
  }

   /**
   * Get charge
   * @return charge
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Charge getCharge() {
    return charge;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharge(Charge charge) {
    this.charge = charge;
  }

  public ChargeAttempt wallet(WalletType wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WalletType getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWallet(WalletType wallet) {
    this.wallet = wallet;
  }

   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * The time zone that this object is associated with.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
  }



  public ChargeAttempt terminal(PaymentTerminal terminal) {
    
    this.terminal = terminal;
    return this;
  }

   /**
   * Get terminal
   * @return terminal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminal getTerminal() {
    return terminal;
  }


  @JsonProperty(JSON_PROPERTY_TERMINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminal(PaymentTerminal terminal) {
    this.terminal = terminal;
  }

   /**
   * The message that can be displayed to the customer explaining why the charge attempt failed, in the customer&#39;s language.
   * @return userFailureMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserFailureMessage() {
    return userFailureMessage;
  }



  public ChargeAttempt completionBehavior(TransactionCompletionBehavior completionBehavior) {
    
    this.completionBehavior = completionBehavior;
    return this;
  }

   /**
   * Get completionBehavior
   * @return completionBehavior
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionBehavior(TransactionCompletionBehavior completionBehavior) {
    this.completionBehavior = completionBehavior;
  }

   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * The labels providing additional information about the object.
   * @return labels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Label> getLabels() {
    return labels;
  }



   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



   /**
   * The date and time when the object will expire.
   * @return timeoutOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }



  public ChargeAttempt environment(ChargeAttemptEnvironment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptEnvironment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(ChargeAttemptEnvironment environment) {
    this.environment = environment;
  }

  public ChargeAttempt invocation(ConnectorInvocation invocation) {
    
    this.invocation = invocation;
    return this;
  }

   /**
   * Get invocation
   * @return invocation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectorInvocation getInvocation() {
    return invocation;
  }


  @JsonProperty(JSON_PROPERTY_INVOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvocation(ConnectorInvocation invocation) {
    this.invocation = invocation;
  }

  public ChargeAttempt connectorConfiguration(PaymentConnectorConfiguration connectorConfiguration) {
    
    this.connectorConfiguration = connectorConfiguration;
    return this;
  }

   /**
   * Get connectorConfiguration
   * @return connectorConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentConnectorConfiguration getConnectorConfiguration() {
    return connectorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectorConfiguration(PaymentConnectorConfiguration connectorConfiguration) {
    this.connectorConfiguration = connectorConfiguration;
  }

   /**
   * The date and time when the next update of the object&#39;s state is planned.
   * @return nextUpdateOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_UPDATE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getNextUpdateOn() {
    return nextUpdateOn;
  }



  public ChargeAttempt failureReason(FailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(FailureReason failureReason) {
    this.failureReason = failureReason;
  }

  public ChargeAttempt customersPresence(CustomersPresence customersPresence) {
    
    this.customersPresence = customersPresence;
    return this;
  }

   /**
   * Get customersPresence
   * @return customersPresence
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMERS_PRESENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomersPresence getCustomersPresence() {
    return customersPresence;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMERS_PRESENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomersPresence(CustomersPresence customersPresence) {
    this.customersPresence = customersPresence;
  }

   /**
   * The date and time when the charge attempt failed.
   * @return failedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeAttempt chargeAttempt = (ChargeAttempt) o;
    return Objects.equals(this.language, chargeAttempt.language) &&
        Objects.equals(this.salesChannel, chargeAttempt.salesChannel) &&
        Objects.equals(this.createdOn, chargeAttempt.createdOn) &&
        Objects.equals(this.initializingTokenVersion, chargeAttempt.initializingTokenVersion) &&
        Objects.equals(this.tokenVersion, chargeAttempt.tokenVersion) &&
        Objects.equals(this.succeededOn, chargeAttempt.succeededOn) &&
        Objects.equals(this.id, chargeAttempt.id) &&
        Objects.equals(this.state, chargeAttempt.state) &&
        Objects.equals(this.linkedTransaction, chargeAttempt.linkedTransaction) &&
        Objects.equals(this.redirectionUrl, chargeAttempt.redirectionUrl) &&
        Objects.equals(this.charge, chargeAttempt.charge) &&
        Objects.equals(this.wallet, chargeAttempt.wallet) &&
        Objects.equals(this.plannedPurgeDate, chargeAttempt.plannedPurgeDate) &&
        Objects.equals(this.timeZone, chargeAttempt.timeZone) &&
        Objects.equals(this.spaceViewId, chargeAttempt.spaceViewId) &&
        Objects.equals(this.terminal, chargeAttempt.terminal) &&
        Objects.equals(this.userFailureMessage, chargeAttempt.userFailureMessage) &&
        Objects.equals(this.completionBehavior, chargeAttempt.completionBehavior) &&
        Objects.equals(this.version, chargeAttempt.version) &&
        Objects.equals(this.labels, chargeAttempt.labels) &&
        Objects.equals(this.linkedSpaceId, chargeAttempt.linkedSpaceId) &&
        Objects.equals(this.timeoutOn, chargeAttempt.timeoutOn) &&
        Objects.equals(this.environment, chargeAttempt.environment) &&
        Objects.equals(this.invocation, chargeAttempt.invocation) &&
        Objects.equals(this.connectorConfiguration, chargeAttempt.connectorConfiguration) &&
        Objects.equals(this.nextUpdateOn, chargeAttempt.nextUpdateOn) &&
        Objects.equals(this.failureReason, chargeAttempt.failureReason) &&
        Objects.equals(this.customersPresence, chargeAttempt.customersPresence) &&
        Objects.equals(this.failedOn, chargeAttempt.failedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, salesChannel, createdOn, initializingTokenVersion, tokenVersion, succeededOn, id, state, linkedTransaction, redirectionUrl, charge, wallet, plannedPurgeDate, timeZone, spaceViewId, terminal, userFailureMessage, completionBehavior, version, labels, linkedSpaceId, timeoutOn, environment, invocation, connectorConfiguration, nextUpdateOn, failureReason, customersPresence, failedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAttempt {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    initializingTokenVersion: ").append(toIndentedString(initializingTokenVersion)).append("\n");
    sb.append("    tokenVersion: ").append(toIndentedString(tokenVersion)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    invocation: ").append(toIndentedString(invocation)).append("\n");
    sb.append("    connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
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

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `salesChannel` to the URL query string
    if (getSalesChannel() != null) {
      try {
        joiner.add(String.format("%ssalesChannel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSalesChannel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `initializingTokenVersion` to the URL query string
    if (getInitializingTokenVersion() != null) {
      try {
        joiner.add(String.format("%sinitializingTokenVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInitializingTokenVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenVersion` to the URL query string
    if (getTokenVersion() != null) {
      joiner.add(getTokenVersion().toUrlQueryString(prefix + "tokenVersion" + suffix));
    }

    // add `succeededOn` to the URL query string
    if (getSucceededOn() != null) {
      try {
        joiner.add(String.format("%ssucceededOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSucceededOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectionUrl` to the URL query string
    if (getRedirectionUrl() != null) {
      try {
        joiner.add(String.format("%sredirectionUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectionUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `charge` to the URL query string
    if (getCharge() != null) {
      joiner.add(getCharge().toUrlQueryString(prefix + "charge" + suffix));
    }

    // add `wallet` to the URL query string
    if (getWallet() != null) {
      joiner.add(getWallet().toUrlQueryString(prefix + "wallet" + suffix));
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spaceViewId` to the URL query string
    if (getSpaceViewId() != null) {
      try {
        joiner.add(String.format("%sspaceViewId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceViewId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `terminal` to the URL query string
    if (getTerminal() != null) {
      joiner.add(getTerminal().toUrlQueryString(prefix + "terminal" + suffix));
    }

    // add `userFailureMessage` to the URL query string
    if (getUserFailureMessage() != null) {
      try {
        joiner.add(String.format("%suserFailureMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserFailureMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionBehavior` to the URL query string
    if (getCompletionBehavior() != null) {
      try {
        joiner.add(String.format("%scompletionBehavior%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionBehavior()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      int i = 0;
      for (Label _item : getLabels()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%slabels%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeoutOn` to the URL query string
    if (getTimeoutOn() != null) {
      try {
        joiner.add(String.format("%stimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `invocation` to the URL query string
    if (getInvocation() != null) {
      joiner.add(getInvocation().toUrlQueryString(prefix + "invocation" + suffix));
    }

    // add `connectorConfiguration` to the URL query string
    if (getConnectorConfiguration() != null) {
      joiner.add(getConnectorConfiguration().toUrlQueryString(prefix + "connectorConfiguration" + suffix));
    }

    // add `nextUpdateOn` to the URL query string
    if (getNextUpdateOn() != null) {
      try {
        joiner.add(String.format("%snextUpdateOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextUpdateOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      joiner.add(getFailureReason().toUrlQueryString(prefix + "failureReason" + suffix));
    }

    // add `customersPresence` to the URL query string
    if (getCustomersPresence() != null) {
      try {
        joiner.add(String.format("%scustomersPresence%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomersPresence()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedOn` to the URL query string
    if (getFailedOn() != null) {
      try {
        joiner.add(String.format("%sfailedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

