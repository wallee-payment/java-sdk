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
import com.wallee.sdk.model.AbstractSubscriptionAffiliateUpdate;
import com.wallee.sdk.model.CreationEntityState;
import java.util.List;
import java.util.Map;

/**
 * SubscriptionAffiliateCreate
 */
public class SubscriptionAffiliateCreate extends AbstractSubscriptionAffiliateUpdate {

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("reference")
	private String reference = null;

	public SubscriptionAffiliateCreate externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 *
	 * @return The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 */
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public SubscriptionAffiliateCreate reference(String reference) {
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

	@Override
	public SubscriptionAffiliateCreate language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public SubscriptionAffiliateCreate metaData(Map<String, String> metaData) {
		super.metaData(metaData);
		return this;
	}

	@Override
	public SubscriptionAffiliateCreate putMetaDataItem(String key, String metaDataItem) {
		super.putMetaDataItem(key, metaDataItem);
		return this;
	}

	@Override
	public SubscriptionAffiliateCreate name(String name) {
		super.name(name);
		return this;
	}

	@Override
	public SubscriptionAffiliateCreate state(CreationEntityState state) {
		super.state(state);
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
		SubscriptionAffiliateCreate subscriptionAffiliateCreate = (SubscriptionAffiliateCreate) o;
		return Objects.equals(this.externalId, subscriptionAffiliateCreate.externalId) &&
				Objects.equals(this.reference, subscriptionAffiliateCreate.reference) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(externalId, reference, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionAffiliateCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
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

