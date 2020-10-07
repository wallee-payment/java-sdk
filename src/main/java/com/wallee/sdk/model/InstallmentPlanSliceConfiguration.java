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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The installment plan slice defines a single slice of an installment plan.
 */
@ApiModel(description = "The installment plan slice defines a single slice of an installment plan.")

public class InstallmentPlanSliceConfiguration extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("lineItemTitle")
    protected DatabaseTranslatedString lineItemTitle;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("period")
    protected String period;


    @JsonProperty("plan")
    protected InstallmentPlanConfiguration plan;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("priority")
    protected Integer priority;


    @JsonProperty("proportion")
    protected BigDecimal proportion;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("version")
    protected Integer version;


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
     * The title of this slices line items. The title is visible to the buyer.
     *
     * @return lineItemTitle
     **/
    @ApiModelProperty(value = "The title of this slices line items. The title is visible to the buyer.")
    public DatabaseTranslatedString getLineItemTitle() {
        return lineItemTitle;
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
     * The period defines how much time passes between the last slice and this slice. The charge is triggered at the end of the period. When the slice should be charged immediately the period needs to be zero.
     *
     * @return period
     **/
    @ApiModelProperty(value = "The period defines how much time passes between the last slice and this slice. The charge is triggered at the end of the period. When the slice should be charged immediately the period needs to be zero.")
    public String getPeriod() {
        return period;
    }


    /**
     * The installment plan this slice belongs to.
     *
     * @return plan
     **/
    @ApiModelProperty(value = "The installment plan this slice belongs to.")
    public InstallmentPlanConfiguration getPlan() {
        return plan;
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
     * The priority controls in which order the slices are applied. The lower the value the higher the precedence.
     *
     * @return priority
     **/
    @ApiModelProperty(value = "The priority controls in which order the slices are applied. The lower the value the higher the precedence.")
    public Integer getPriority() {
        return priority;
    }


    /**
     * The proportion defines how much of the total installment payment has to be paid in this slice. The value is summed up with the other slices and the ratio of all proportions compared to proportion of this slice determines how much the buyer has to pay in this slice.
     *
     * @return proportion
     **/
    @ApiModelProperty(value = "The proportion defines how much of the total installment payment has to be paid in this slice. The value is summed up with the other slices and the ratio of all proportions compared to proportion of this slice determines how much the buyer has to pay in this slice.")
    public BigDecimal getProportion() {
        return proportion;
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
        InstallmentPlanSliceConfiguration installmentPlanSliceConfiguration = (InstallmentPlanSliceConfiguration) o;
        return Objects.equals(this.id, installmentPlanSliceConfiguration.id) &&
                Objects.equals(this.lineItemTitle, installmentPlanSliceConfiguration.lineItemTitle) &&
                Objects.equals(this.linkedSpaceId, installmentPlanSliceConfiguration.linkedSpaceId) &&
                Objects.equals(this.period, installmentPlanSliceConfiguration.period) &&
                Objects.equals(this.plan, installmentPlanSliceConfiguration.plan) &&
                Objects.equals(this.plannedPurgeDate, installmentPlanSliceConfiguration.plannedPurgeDate) &&
                Objects.equals(this.priority, installmentPlanSliceConfiguration.priority) &&
                Objects.equals(this.proportion, installmentPlanSliceConfiguration.proportion) && this.state
                == installmentPlanSliceConfiguration.state &&
                Objects.equals(this.version, installmentPlanSliceConfiguration.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lineItemTitle, linkedSpaceId, period, plan, plannedPurgeDate, priority, proportion, state, version);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallmentPlanSliceConfiguration {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lineItemTitle: ").append(toIndentedString(lineItemTitle)).append("\n");
        sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
        sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    proportion: ").append(toIndentedString(proportion)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

