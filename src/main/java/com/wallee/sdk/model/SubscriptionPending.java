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
import com.wallee.sdk.model.SubscriptionUpdate;
import java.time.OffsetDateTime;

/**
 * SubscriptionPending
 */
public class SubscriptionPending extends SubscriptionUpdate {

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("subscriber")
	private Long subscriber = null;

	@SerializedName("token")
	private Long token = null;

	public SubscriptionPending reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * reference
	 *
	 * @return reference
	 */
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public SubscriptionPending subscriber(Long subscriber) {
		this.subscriber = subscriber;
		return this;
	}

	/**
	 * subscriber
	 *
	 * @return subscriber
	 */
	public Long getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Long subscriber) {
		this.subscriber = subscriber;
	}

	public SubscriptionPending token(Long token) {
		this.token = token;
		return this;
	}

	/**
	 * token
	 *
	 * @return token
	 */
	public Long getToken() {
		return token;
	}

	public void setToken(Long token) {
		this.token = token;
	}

	@Override
	public SubscriptionPending id(Long id) {
		super.id(id);
		return this;
	}

	@Override
	public SubscriptionPending version(Long version) {
		super.version(version);
		return this;
	}

	@Override
	public SubscriptionPending description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public SubscriptionPending plannedTerminationDate(OffsetDateTime plannedTerminationDate) {
		super.plannedTerminationDate(plannedTerminationDate);
		return this;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionPending subscriptionPending = (SubscriptionPending) o;
		return Objects.equals(this.reference, subscriptionPending.reference) &&
				Objects.equals(this.subscriber, subscriptionPending.subscriber) &&
				Objects.equals(this.token, subscriptionPending.token) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reference, subscriber, token, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionPending {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		subscriber: ").append(toIndentedString(subscriber)).append("\n");
		sb.append("		token: ").append(toIndentedString(token)).append("\n");
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

