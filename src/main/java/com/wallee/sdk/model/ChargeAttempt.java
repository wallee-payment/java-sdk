/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.Charge;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.ChargeAttemptState;
import com.wallee.sdk.model.ConnectorInvocation;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentTerminal;
import com.wallee.sdk.model.TokenVersion;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class ChargeAttempt extends TransactionAwareEntity {
  
  @SerializedName("charge")
  protected Charge charge = null;

  
  @SerializedName("connectorConfiguration")
  protected PaymentConnectorConfiguration connectorConfiguration = null;

  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("environment")
  protected ChargeAttemptEnvironment environment = null;

  
  @SerializedName("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @SerializedName("failureReason")
  protected FailureReason failureReason = null;

  
  @SerializedName("initializingTokenVersion")
  protected Boolean initializingTokenVersion = null;

  
  @SerializedName("invocation")
  protected ConnectorInvocation invocation = null;

  
  @SerializedName("labels")
  protected List<Label> labels = null;

  
  @SerializedName("language")
  protected String language = null;

  
  @SerializedName("nextUpdateOn")
  protected OffsetDateTime nextUpdateOn = null;

  
  @SerializedName("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @SerializedName("redirectionUrl")
  protected String redirectionUrl = null;

  
  @SerializedName("salesChannel")
  protected Long salesChannel = null;

  
  @SerializedName("spaceViewId")
  protected Long spaceViewId = null;

  
  @SerializedName("state")
  protected ChargeAttemptState state = null;

  
  @SerializedName("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @SerializedName("terminal")
  protected PaymentTerminal terminal = null;

  
  @SerializedName("timeZone")
  protected String timeZone = null;

  
  @SerializedName("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @SerializedName("tokenVersion")
  protected TokenVersion tokenVersion = null;

  
  @SerializedName("userFailureMessage")
  protected String userFailureMessage = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
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
   * @return connectorConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentConnectorConfiguration getConnectorConfiguration() {
    return connectorConfiguration;
  }

  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * 
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Label> getLabels() {
    return labels;
  }

  
   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
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
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
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
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
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
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
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
        Objects.equals(this.connectorConfiguration, chargeAttempt.connectorConfiguration) &&
        Objects.equals(this.createdOn, chargeAttempt.createdOn) &&
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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, charge, connectorConfiguration, createdOn, environment, failedOn, failureReason, initializingTokenVersion, invocation, labels, language, nextUpdateOn, plannedPurgeDate, redirectionUrl, salesChannel, spaceViewId, state, succeededOn, terminal, timeZone, timeoutOn, tokenVersion, userFailureMessage, version, super.hashCode());
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
    sb.append("    connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

