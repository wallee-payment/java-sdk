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

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.ChargeAttemptEnvironment;
import com.wallee.sdk.model.enums.ChargeAttemptState;

@ApiModel(description = "")

public class ChargeAttempt extends TransactionAwareEntity {

    @JsonProperty("charge")
    protected Charge charge;


    @JsonProperty("connectorConfiguration")
    protected PaymentConnectorConfiguration connectorConfiguration;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("environment")
    protected ChargeAttemptEnvironment environment;


    @JsonProperty("failedOn")
    protected OffsetDateTime failedOn;


    @JsonProperty("failureReason")
    protected FailureReason failureReason;


    @JsonProperty("initializingTokenVersion")
    protected Boolean initializingTokenVersion;


    @JsonProperty("invocation")
    protected ConnectorInvocation invocation;


    @JsonProperty("labels")
    protected List<Label> labels;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("nextUpdateOn")
    protected OffsetDateTime nextUpdateOn;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("redirectionUrl")
    protected String redirectionUrl;


    @JsonProperty("salesChannel")
    protected Long salesChannel;


    @JsonProperty("spaceViewId")
    protected Long spaceViewId;


    @JsonProperty("state")
    protected ChargeAttemptState state;


    @JsonProperty("succeededOn")
    protected OffsetDateTime succeededOn;


    @JsonProperty("terminal")
    protected PaymentTerminal terminal;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("timeoutOn")
    protected OffsetDateTime timeoutOn;


    @JsonProperty("tokenVersion")
    protected TokenVersion tokenVersion;


    @JsonProperty("userFailureMessage")
    protected String userFailureMessage;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return charge
     **/
    @ApiModelProperty(value = "")
    public Charge getCharge() {
        return charge;
    }


    /**
     * @return connectorConfiguration
     **/
    @ApiModelProperty(value = "")
    public PaymentConnectorConfiguration getConnectorConfiguration() {
        return connectorConfiguration;
    }


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return environment
     **/
    @ApiModelProperty(value = "")
    public ChargeAttemptEnvironment getEnvironment() {
        return environment;
    }


    /**
     * @return failedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getFailedOn() {
        return failedOn;
    }


    /**
     * @return failureReason
     **/
    @ApiModelProperty(value = "")
    public FailureReason getFailureReason() {
        return failureReason;
    }


    /**
     * @return initializingTokenVersion
     **/
    @ApiModelProperty(value = "")
    public Boolean isInitializingTokenVersion() {
        return initializingTokenVersion;
    }


    /**
     * @return invocation
     **/
    @ApiModelProperty(value = "")
    public ConnectorInvocation getInvocation() {
        return invocation;
    }


    /**
     * @return labels
     **/
    @ApiModelProperty(value = "")
    public List<Label> getLabels() {
        return labels;
    }


    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * @return nextUpdateOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getNextUpdateOn() {
        return nextUpdateOn;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return redirectionUrl
     **/
    @ApiModelProperty(value = "")
    public String getRedirectionUrl() {
        return redirectionUrl;
    }


    /**
     * @return salesChannel
     **/
    @ApiModelProperty(value = "")
    public Long getSalesChannel() {
        return salesChannel;
    }


    /**
     * @return spaceViewId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceViewId() {
        return spaceViewId;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ChargeAttemptState getState() {
        return state;
    }


    /**
     * @return succeededOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getSucceededOn() {
        return succeededOn;
    }


    /**
     * @return terminal
     **/
    @ApiModelProperty(value = "")
    public PaymentTerminal getTerminal() {
        return terminal;
    }


    /**
     * @return timeZone
     **/
    @ApiModelProperty(value = "")
    public String getTimeZone() {
        return timeZone;
    }


    /**
     * @return timeoutOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTimeoutOn() {
        return timeoutOn;
    }


    /**
     * @return tokenVersion
     **/
    @ApiModelProperty(value = "")
    public TokenVersion getTokenVersion() {
        return tokenVersion;
    }


    /**
     * The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.
     *
     * @return userFailureMessage
     **/
    @ApiModelProperty(value = "The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.")
    public String getUserFailureMessage() {
        return userFailureMessage;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
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
        return Objects.equals(this.id, chargeAttempt.id) &&
                Objects.equals(this.linkedSpaceId, chargeAttempt.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, chargeAttempt.linkedTransaction) &&
                Objects.equals(this.charge, chargeAttempt.charge) &&
                Objects.equals(this.connectorConfiguration, chargeAttempt.connectorConfiguration) &&
                Objects.equals(this.createdOn, chargeAttempt.createdOn) && this.environment == chargeAttempt.environment &&
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
                Objects.equals(this.spaceViewId, chargeAttempt.spaceViewId) && this.state == chargeAttempt.state &&
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
        return "class ChargeAttempt { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    charge: " +  toIndentedString(charge) + " \n" +
            "    connectorConfiguration: " + toIndentedString(connectorConfiguration) +  " \n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    environment: " +  toIndentedString(environment) + " \n" +
            "    failedOn: " + toIndentedString(failedOn) + " \n" +
            "    failureReason: " + toIndentedString(failureReason) + " \n" +
            "    initializingTokenVersion: " +  toIndentedString(initializingTokenVersion) + " \n" +
            "    invocation: " + toIndentedString(invocation) + " \n" +
            "    labels: " + toIndentedString(labels) + " \n" +
            "    language: " + toIndentedString(language) +  " \n" +
            "    nextUpdateOn: " + toIndentedString(nextUpdateOn) + " \n" +
            "    plannedPurgeDate: " +  toIndentedString(plannedPurgeDate) + " \n" +
            "    redirectionUrl: " + toIndentedString(redirectionUrl) +  " \n" +
            "    salesChannel: " + toIndentedString(salesChannel) + " \n" +
            "    spaceViewId: " +  toIndentedString(spaceViewId) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    succeededOn: " + toIndentedString(succeededOn) + " \n" +
            "    terminal: " + toIndentedString(terminal) +  " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    timeoutOn: " + toIndentedString(timeoutOn) + " \n" +
            "    tokenVersion: " + toIndentedString(tokenVersion) + " \n" +
            "    userFailureMessage: " + toIndentedString(userFailureMessage) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

