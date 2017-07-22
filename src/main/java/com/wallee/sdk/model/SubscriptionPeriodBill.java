/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
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
 */


package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.SubscriptionPeriodBillState;
import com.wallee.sdk.model.SubscriptionVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionPeriodBill {
	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("effectivePeriodEndDate")
	private DateTime effectivePeriodEndDate = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("periodStartDate")
	private DateTime periodStartDate = null;

	@SerializedName("plannedPeriodEndDate")
	private DateTime plannedPeriodEndDate = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("state")
	private SubscriptionPeriodBillState state = null;

	@SerializedName("subscriptionVersion")
	private SubscriptionVersion subscriptionVersion = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getEffectivePeriodEndDate() {
		return effectivePeriodEndDate;
	}

	public SubscriptionPeriodBill id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getLanguage() {
		return language;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The linked space id holds the ID of the space to which the entity belongs to.")
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getPeriodStartDate() {
		return periodStartDate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getPlannedPeriodEndDate() {
		return plannedPeriodEndDate;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	public SubscriptionPeriodBill state(SubscriptionPeriodBillState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionPeriodBillState getState() {
		return state;
	}

	public void setState(SubscriptionPeriodBillState state) {
		this.state = state;
	}

	public SubscriptionPeriodBill subscriptionVersion(SubscriptionVersion subscriptionVersion) {
		this.subscriptionVersion = subscriptionVersion;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionVersion getSubscriptionVersion() {
		return subscriptionVersion;
	}

	public void setSubscriptionVersion(SubscriptionVersion subscriptionVersion) {
		this.subscriptionVersion = subscriptionVersion;
	}

	public SubscriptionPeriodBill version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionPeriodBill subscriptionPeriodBill = (SubscriptionPeriodBill) o;
		return Objects.equals(this.createdOn, subscriptionPeriodBill.createdOn) &&
				Objects.equals(this.effectivePeriodEndDate, subscriptionPeriodBill.effectivePeriodEndDate) &&
				Objects.equals(this.id, subscriptionPeriodBill.id) &&
				Objects.equals(this.language, subscriptionPeriodBill.language) &&
				Objects.equals(this.linkedSpaceId, subscriptionPeriodBill.linkedSpaceId) &&
				Objects.equals(this.periodStartDate, subscriptionPeriodBill.periodStartDate) &&
				Objects.equals(this.plannedPeriodEndDate, subscriptionPeriodBill.plannedPeriodEndDate) &&
				Objects.equals(this.plannedPurgeDate, subscriptionPeriodBill.plannedPurgeDate) &&
				Objects.equals(this.state, subscriptionPeriodBill.state) &&
				Objects.equals(this.subscriptionVersion, subscriptionPeriodBill.subscriptionVersion) &&
				Objects.equals(this.version, subscriptionPeriodBill.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, effectivePeriodEndDate, id, language, linkedSpaceId, periodStartDate, plannedPeriodEndDate, plannedPurgeDate, state, subscriptionVersion, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionPeriodBill {\n");
		
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		effectivePeriodEndDate: ").append(toIndentedString(effectivePeriodEndDate)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
		sb.append("		plannedPeriodEndDate: ").append(toIndentedString(plannedPeriodEndDate)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
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

