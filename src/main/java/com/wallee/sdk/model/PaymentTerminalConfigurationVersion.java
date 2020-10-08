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
import com.wallee.sdk.model.enums.PaymentTerminalConfigurationVersionState;

@ApiModel(description = "")

public class PaymentTerminalConfigurationVersion extends Indentable {

    @JsonProperty("configuration")
    protected PaymentTerminalConfiguration _configuration;


    @JsonProperty("connectorConfigurations")
    protected List<Long> connectorConfigurations;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("maintenanceWindowDuration")
    protected String maintenanceWindowDuration;


    @JsonProperty("maintenanceWindowStart")
    protected String maintenanceWindowStart;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected PaymentTerminalConfigurationVersionState state;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("version")
    protected Integer version;


    @JsonProperty("versionAppliedImmediately")
    protected Boolean versionAppliedImmediately;


    /**
     * @return _configuration
     **/
    @ApiModelProperty(value = "")
    public PaymentTerminalConfiguration getConfiguration() {
        return _configuration;
    }


    /**
     * @return connectorConfigurations
     **/
    @ApiModelProperty(value = "")
    public List<Long> getConnectorConfigurations() {
        return connectorConfigurations;
    }


    /**
     * @return createdBy
     **/
    @ApiModelProperty(value = "")
    public Long getCreatedBy() {
        return createdBy;
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
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * @return maintenanceWindowDuration
     **/
    @ApiModelProperty(value = "")
    public String getMaintenanceWindowDuration() {
        return maintenanceWindowDuration;
    }


    /**
     * @return maintenanceWindowStart
     **/
    @ApiModelProperty(value = "")
    public String getMaintenanceWindowStart() {
        return maintenanceWindowStart;
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
     * @return state
     **/
    @ApiModelProperty(value = "")
    public PaymentTerminalConfigurationVersionState getState() {
        return state;
    }


    /**
     * @return timeZone
     **/
    @ApiModelProperty(value = "")
    public String getTimeZone() {
        return timeZone;
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


    /**
     * @return versionAppliedImmediately
     **/
    @ApiModelProperty(value = "")
    public Boolean isVersionAppliedImmediately() {
        return versionAppliedImmediately;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentTerminalConfigurationVersion paymentTerminalConfigurationVersion = (PaymentTerminalConfigurationVersion) o;
        return Objects.equals(this._configuration, paymentTerminalConfigurationVersion._configuration) &&
                Objects.equals(this.connectorConfigurations, paymentTerminalConfigurationVersion.connectorConfigurations) &&
                Objects.equals(this.createdBy, paymentTerminalConfigurationVersion.createdBy) &&
                Objects.equals(this.createdOn, paymentTerminalConfigurationVersion.createdOn) &&
                Objects.equals(this.id, paymentTerminalConfigurationVersion.id) &&
                Objects.equals(this.linkedSpaceId, paymentTerminalConfigurationVersion.linkedSpaceId) &&
                Objects.equals(this.maintenanceWindowDuration, paymentTerminalConfigurationVersion.maintenanceWindowDuration) &&
                Objects.equals(this.maintenanceWindowStart, paymentTerminalConfigurationVersion.maintenanceWindowStart) &&
                Objects.equals(this.plannedPurgeDate, paymentTerminalConfigurationVersion.plannedPurgeDate) && this.state
                == paymentTerminalConfigurationVersion.state &&
                Objects.equals(this.timeZone, paymentTerminalConfigurationVersion.timeZone) &&
                Objects.equals(this.version, paymentTerminalConfigurationVersion.version) &&
                Objects.equals(this.versionAppliedImmediately, paymentTerminalConfigurationVersion.versionAppliedImmediately);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration, connectorConfigurations, createdBy, createdOn, id, linkedSpaceId, maintenanceWindowDuration, maintenanceWindowStart, plannedPurgeDate, state, timeZone, version, versionAppliedImmediately);
    }


    @Override
    public String toString() {

        return "class PaymentTerminalConfigurationVersion { \n" +
            "    _configuration: " +  toIndentedString(_configuration) + "\n" +
            "    connectorConfigurations: " + toIndentedString(connectorConfigurations) +  " \n" +
            "    createdBy: " + toIndentedString(createdBy) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    maintenanceWindowDuration: " + toIndentedString(maintenanceWindowDuration) +  " \n" +
            "    maintenanceWindowStart: " + toIndentedString(maintenanceWindowStart) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    state: " + toIndentedString(state) +  " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    version: " + toIndentedString(version) +  " \n" +
            "    versionAppliedImmediately: " + toIndentedString(versionAppliedImmediately) + " \n" +
            "}";
        }


}

