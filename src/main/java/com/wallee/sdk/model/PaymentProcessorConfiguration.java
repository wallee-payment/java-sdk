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
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class PaymentProcessorConfiguration extends Indentable {

    @JsonProperty("contractId")
    protected Long contractId;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("processor")
    protected Long processor;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The contract links the processor configuration with the contract that is used to process payments.
     *
     * @return contractId
     **/
    @ApiModelProperty(value = "The contract links the processor configuration with the contract that is used to process payments.")
    public Long getContractId() {
        return contractId;
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
     * The processor configuration name is used internally to identify a specific processor configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The processor configuration name is used internally to identify a specific processor configuration. For example the name is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
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
     * A processor handles the connection to a third part company (a Payment Service Provider) that technically manages the transaction and therefore processes the payment. For the same processor multiple processor configuration can be setup.
     *
     * @return processor
     **/
    @ApiModelProperty(value = "A processor handles the connection to a third part company (a Payment Service Provider) that technically manages the transaction and therefore processes the payment. For the same processor multiple processor configuration can be setup.")
    public Long getProcessor() {
        return processor;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
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
        PaymentProcessorConfiguration paymentProcessorConfiguration = (PaymentProcessorConfiguration) o;
        return Objects.equals(this.contractId, paymentProcessorConfiguration.contractId) &&
                Objects.equals(this.id, paymentProcessorConfiguration.id) &&
                Objects.equals(this.linkedSpaceId, paymentProcessorConfiguration.linkedSpaceId) &&
                Objects.equals(this.name, paymentProcessorConfiguration.name) &&
                Objects.equals(this.plannedPurgeDate, paymentProcessorConfiguration.plannedPurgeDate) &&
                Objects.equals(this.processor, paymentProcessorConfiguration.processor) && this.state
                == paymentProcessorConfiguration.state &&
                Objects.equals(this.version, paymentProcessorConfiguration.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractId, id, linkedSpaceId, name, plannedPurgeDate, processor, state, version);
    }


    @Override
    public String toString() {

        return "class PaymentProcessorConfiguration { \n" +
            "    contractId: " + toIndentedString(contractId) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    plannedPurgeDate: " +  toIndentedString(plannedPurgeDate) + "\n" +
            "    processor: " + toIndentedString(processor) + "\n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

