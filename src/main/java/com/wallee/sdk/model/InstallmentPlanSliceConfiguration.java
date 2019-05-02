/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author   customweb GmbH (www.customweb.com)
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.InstallmentPlanConfiguration;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * The installment plan slice defines a single slice of an installment plan.
 */
public class InstallmentPlanSliceConfiguration {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("lineItemTitle")
	private DatabaseTranslatedString lineItemTitle = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("period")
	private String period = null;

	@SerializedName("plan")
	private InstallmentPlanConfiguration plan = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("priority")
	private Integer priority = null;

	@SerializedName("proportion")
	private BigDecimal proportion = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * The title of this slices line items. The title is visible to the buyer.
	 *
	 * @return The title of this slices line items. The title is visible to the buyer.
	 */
	public DatabaseTranslatedString getLineItemTitle() {
		return lineItemTitle;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The period defines how much time passes between the last slice and this slice. The charge is triggered at the end of the period. When the slice should be charged immediately the period needs to be zero.
	 *
	 * @return The period defines how much time passes between the last slice and this slice. The charge is triggered at the end of the period. When the slice should be charged immediately the period needs to be zero.
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * The installment plan this slice belongs to.
	 *
	 * @return The installment plan this slice belongs to.
	 */
	public InstallmentPlanConfiguration getPlan() {
		return plan;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The priority controls in which order the slices are applied. The lower the value the higher the precedence.
	 *
	 * @return The priority controls in which order the slices are applied. The lower the value the higher the precedence.
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * The proportion defines how much of the total installment payment has to be paid in this slice. The value is summed up with the other slices and the ratio of all proportions compared to proportion of this slice determines how much the buyer has to pay in this slice.
	 *
	 * @return The proportion defines how much of the total installment payment has to be paid in this slice. The value is summed up with the other slices and the ratio of all proportions compared to proportion of this slice determines how much the buyer has to pay in this slice.
	 */
	public BigDecimal getProportion() {
		return proportion;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
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
		InstallmentPlanSliceConfiguration installmentPlanSliceConfiguration = (InstallmentPlanSliceConfiguration) o;
		return Objects.equals(this.id, installmentPlanSliceConfiguration.id) &&
				Objects.equals(this.lineItemTitle, installmentPlanSliceConfiguration.lineItemTitle) &&
				Objects.equals(this.linkedSpaceId, installmentPlanSliceConfiguration.linkedSpaceId) &&
				Objects.equals(this.period, installmentPlanSliceConfiguration.period) &&
				Objects.equals(this.plan, installmentPlanSliceConfiguration.plan) &&
				Objects.equals(this.plannedPurgeDate, installmentPlanSliceConfiguration.plannedPurgeDate) &&
				Objects.equals(this.priority, installmentPlanSliceConfiguration.priority) &&
				Objects.equals(this.proportion, installmentPlanSliceConfiguration.proportion) &&
				Objects.equals(this.state, installmentPlanSliceConfiguration.state) &&
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
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		lineItemTitle: ").append(toIndentedString(lineItemTitle)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		period: ").append(toIndentedString(period)).append("\n");
		sb.append("		plan: ").append(toIndentedString(plan)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("		proportion: ").append(toIndentedString(proportion)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
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
		return o.toString().replace("\n", "\n		");
	}

}

