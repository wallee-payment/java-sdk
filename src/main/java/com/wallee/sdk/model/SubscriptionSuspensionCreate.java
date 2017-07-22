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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionSuspensionCreate {
	@SerializedName("endAction")
	private SubscriptionSuspensionAction endAction = null;

	@SerializedName("note")
	private String note = null;

	@SerializedName("plannedEndDate")
	private DateTime plannedEndDate = null;

	@SerializedName("subscription")
	private Long subscription = null;

	public SubscriptionSuspensionCreate endAction(SubscriptionSuspensionAction endAction) {
		this.endAction = endAction;
		return this;
	}

	/**
	 * When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.
	 *
	 * @return When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.
	 */
	@ApiModelProperty(example = "null", required = true, value = "When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.")
	public SubscriptionSuspensionAction getEndAction() {
		return endAction;
	}

	public void setEndAction(SubscriptionSuspensionAction endAction) {
		this.endAction = endAction;
	}

	public SubscriptionSuspensionCreate note(String note) {
		this.note = note;
		return this;
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

	public void setNote(String note) {
		this.note = note;
	}

	public SubscriptionSuspensionCreate plannedEndDate(DateTime plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
		return this;
	}

	/**
	 * The planned end date of the suspension identifies the date on which the suspension will be ended automatically.
	 *
	 * @return The planned end date of the suspension identifies the date on which the suspension will be ended automatically.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The planned end date of the suspension identifies the date on which the suspension will be ended automatically.")
	public DateTime getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(DateTime plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public SubscriptionSuspensionCreate subscription(Long subscription) {
		this.subscription = subscription;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public Long getSubscription() {
		return subscription;
	}

	public void setSubscription(Long subscription) {
		this.subscription = subscription;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionSuspensionCreate subscriptionSuspensionCreate = (SubscriptionSuspensionCreate) o;
		return Objects.equals(this.endAction, subscriptionSuspensionCreate.endAction) &&
				Objects.equals(this.note, subscriptionSuspensionCreate.note) &&
				Objects.equals(this.plannedEndDate, subscriptionSuspensionCreate.plannedEndDate) &&
				Objects.equals(this.subscription, subscriptionSuspensionCreate.subscription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(endAction, note, plannedEndDate, subscription);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionSuspensionCreate {\n");
		
		sb.append("		endAction: ").append(toIndentedString(endAction)).append("\n");
		sb.append("		note: ").append(toIndentedString(note)).append("\n");
		sb.append("		plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
		sb.append("		subscription: ").append(toIndentedString(subscription)).append("\n");
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

