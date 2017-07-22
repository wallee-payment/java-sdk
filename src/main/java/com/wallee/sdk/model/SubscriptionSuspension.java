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
import com.wallee.sdk.model.SubscriptionSuspensionAction;
import com.wallee.sdk.model.SubscriptionSuspensionReason;
import com.wallee.sdk.model.SubscriptionSuspensionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionSuspension {
	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("effectiveEndDate")
	private DateTime effectiveEndDate = null;

	@SerializedName("endAction")
	private SubscriptionSuspensionAction endAction = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("note")
	private String note = null;

	@SerializedName("periodBill")
	private Long periodBill = null;

	@SerializedName("plannedEndDate")
	private DateTime plannedEndDate = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("reason")
	private SubscriptionSuspensionReason reason = null;

	@SerializedName("state")
	private SubscriptionSuspensionState state = null;

	@SerializedName("subscription")
	private Long subscription = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	@ApiModelProperty(example = "null", value = "The created on date indicates the date on which the entity was stored into the database.")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getEffectiveEndDate() {
		return effectiveEndDate;
	}

	public SubscriptionSuspension endAction(SubscriptionSuspensionAction endAction) {
		this.endAction = endAction;
		return this;
	}

	/**
	 * When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.
	 *
	 * @return When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.
	 */
	@ApiModelProperty(example = "null", value = "When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.")
	public SubscriptionSuspensionAction getEndAction() {
		return endAction;
	}

	public void setEndAction(SubscriptionSuspensionAction endAction) {
		this.endAction = endAction;
	}

	public SubscriptionSuspension id(Long id) {
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
	 * The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber.
	 *
	 * @return The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber.
	 */
	@ApiModelProperty(example = "null", value = "The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber.")
	public String getNote() {
		return note;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getPeriodBill() {
		return periodBill;
	}

	/**
	 * The planned end date of the suspension identifies the date on which the suspension will be ended automatically.
	 *
	 * @return The planned end date of the suspension identifies the date on which the suspension will be ended automatically.
	 */
	@ApiModelProperty(example = "null", value = "The planned end date of the suspension identifies the date on which the suspension will be ended automatically.")
	public DateTime getPlannedEndDate() {
		return plannedEndDate;
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

	public SubscriptionSuspension reason(SubscriptionSuspensionReason reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * The suspension reason indicates why a suspension has been created.
	 *
	 * @return The suspension reason indicates why a suspension has been created.
	 */
	@ApiModelProperty(example = "null", value = "The suspension reason indicates why a suspension has been created.")
	public SubscriptionSuspensionReason getReason() {
		return reason;
	}

	public void setReason(SubscriptionSuspensionReason reason) {
		this.reason = reason;
	}

	public SubscriptionSuspension state(SubscriptionSuspensionState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionSuspensionState getState() {
		return state;
	}

	public void setState(SubscriptionSuspensionState state) {
		this.state = state;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getSubscription() {
		return subscription;
	}

	public SubscriptionSuspension version(Integer version) {
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
		SubscriptionSuspension subscriptionSuspension = (SubscriptionSuspension) o;
		return Objects.equals(this.createdOn, subscriptionSuspension.createdOn) &&
				Objects.equals(this.effectiveEndDate, subscriptionSuspension.effectiveEndDate) &&
				Objects.equals(this.endAction, subscriptionSuspension.endAction) &&
				Objects.equals(this.id, subscriptionSuspension.id) &&
				Objects.equals(this.language, subscriptionSuspension.language) &&
				Objects.equals(this.linkedSpaceId, subscriptionSuspension.linkedSpaceId) &&
				Objects.equals(this.note, subscriptionSuspension.note) &&
				Objects.equals(this.periodBill, subscriptionSuspension.periodBill) &&
				Objects.equals(this.plannedEndDate, subscriptionSuspension.plannedEndDate) &&
				Objects.equals(this.plannedPurgeDate, subscriptionSuspension.plannedPurgeDate) &&
				Objects.equals(this.reason, subscriptionSuspension.reason) &&
				Objects.equals(this.state, subscriptionSuspension.state) &&
				Objects.equals(this.subscription, subscriptionSuspension.subscription) &&
				Objects.equals(this.version, subscriptionSuspension.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, effectiveEndDate, endAction, id, language, linkedSpaceId, note, periodBill, plannedEndDate, plannedPurgeDate, reason, state, subscription, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionSuspension {\n");
		
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
		sb.append("		endAction: ").append(toIndentedString(endAction)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		note: ").append(toIndentedString(note)).append("\n");
		sb.append("		periodBill: ").append(toIndentedString(periodBill)).append("\n");
		sb.append("		plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		reason: ").append(toIndentedString(reason)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		subscription: ").append(toIndentedString(subscription)).append("\n");
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

