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
import com.wallee.sdk.model.Subscriber;
import com.wallee.sdk.model.SubscriptionAffiliate;
import com.wallee.sdk.model.SubscriptionState;
import com.wallee.sdk.model.Token;
import java.time.OffsetDateTime;

/**
 * Subscription
 */
public class Subscription {

	@SerializedName("activatedOn")
	private OffsetDateTime activatedOn = null;

	@SerializedName("affiliate")
	private SubscriptionAffiliate affiliate = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("initializedOn")
	private OffsetDateTime initializedOn = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("plannedTerminationDate")
	private OffsetDateTime plannedTerminationDate = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("state")
	private SubscriptionState state = null;

	@SerializedName("subscriber")
	private Subscriber subscriber = null;

	@SerializedName("terminatedOn")
	private OffsetDateTime terminatedOn = null;

	@SerializedName("terminatingOn")
	private OffsetDateTime terminatingOn = null;

	@SerializedName("token")
	private Token token = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * activatedOn
	 *
	 * @return activatedOn
	 */
	public OffsetDateTime getActivatedOn() {
		return activatedOn;
	}

	/**
	 * affiliate
	 *
	 * @return affiliate
	 */
	public SubscriptionAffiliate getAffiliate() {
		return affiliate;
	}

	/**
	 * createdOn
	 *
	 * @return createdOn
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * description
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * initializedOn
	 *
	 * @return initializedOn
	 */
	public OffsetDateTime getInitializedOn() {
		return initializedOn;
	}

	/**
	 * language
	 *
	 * @return language
	 */
	public String getLanguage() {
		return language;
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
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * plannedTerminationDate
	 *
	 * @return plannedTerminationDate
	 */
	public OffsetDateTime getPlannedTerminationDate() {
		return plannedTerminationDate;
	}

	/**
	 * reference
	 *
	 * @return reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public SubscriptionState getState() {
		return state;
	}

	/**
	 * subscriber
	 *
	 * @return subscriber
	 */
	public Subscriber getSubscriber() {
		return subscriber;
	}

	/**
	 * terminatedOn
	 *
	 * @return terminatedOn
	 */
	public OffsetDateTime getTerminatedOn() {
		return terminatedOn;
	}

	/**
	 * terminatingOn
	 *
	 * @return terminatingOn
	 */
	public OffsetDateTime getTerminatingOn() {
		return terminatingOn;
	}

	/**
	 * token
	 *
	 * @return token
	 */
	public Token getToken() {
		return token;
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
		Subscription subscription = (Subscription) o;
		return Objects.equals(this.activatedOn, subscription.activatedOn) &&
				Objects.equals(this.affiliate, subscription.affiliate) &&
				Objects.equals(this.createdOn, subscription.createdOn) &&
				Objects.equals(this.description, subscription.description) &&
				Objects.equals(this.id, subscription.id) &&
				Objects.equals(this.initializedOn, subscription.initializedOn) &&
				Objects.equals(this.language, subscription.language) &&
				Objects.equals(this.linkedSpaceId, subscription.linkedSpaceId) &&
				Objects.equals(this.plannedPurgeDate, subscription.plannedPurgeDate) &&
				Objects.equals(this.plannedTerminationDate, subscription.plannedTerminationDate) &&
				Objects.equals(this.reference, subscription.reference) &&
				Objects.equals(this.state, subscription.state) &&
				Objects.equals(this.subscriber, subscription.subscriber) &&
				Objects.equals(this.terminatedOn, subscription.terminatedOn) &&
				Objects.equals(this.terminatingOn, subscription.terminatingOn) &&
				Objects.equals(this.token, subscription.token) &&
				Objects.equals(this.version, subscription.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activatedOn, affiliate, createdOn, description, id, initializedOn, language, linkedSpaceId, plannedPurgeDate, plannedTerminationDate, reference, state, subscriber, terminatedOn, terminatingOn, token, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Subscription {\n");
		
		sb.append("		activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
		sb.append("		affiliate: ").append(toIndentedString(affiliate)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		initializedOn: ").append(toIndentedString(initializedOn)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		subscriber: ").append(toIndentedString(subscriber)).append("\n");
		sb.append("		terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
		sb.append("		terminatingOn: ").append(toIndentedString(terminatingOn)).append("\n");
		sb.append("		token: ").append(toIndentedString(token)).append("\n");
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

