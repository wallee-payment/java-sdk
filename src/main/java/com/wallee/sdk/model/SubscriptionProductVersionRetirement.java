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
import com.wallee.sdk.model.SubscriptionProduct;
import com.wallee.sdk.model.SubscriptionProductVersion;
import java.time.OffsetDateTime;

/**
 * SubscriptionProductVersionRetirement
 */
public class SubscriptionProductVersionRetirement {

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("productVersion")
	private SubscriptionProductVersion productVersion = null;

	@SerializedName("respectTerminiationPeriodsEnabled")
	private Boolean respectTerminiationPeriodsEnabled = null;

	@SerializedName("targetProduct")
	private SubscriptionProduct targetProduct = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
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
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * productVersion
	 *
	 * @return productVersion
	 */
	public SubscriptionProductVersion getProductVersion() {
		return productVersion;
	}

	/**
	 * respectTerminiationPeriodsEnabled
	 *
	 * @return respectTerminiationPeriodsEnabled
	 */
	public Boolean getRespectTerminiationPeriodsEnabled() {
		return respectTerminiationPeriodsEnabled;
	}

	/**
	 * targetProduct
	 *
	 * @return targetProduct
	 */
	public SubscriptionProduct getTargetProduct() {
		return targetProduct;
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
		SubscriptionProductVersionRetirement subscriptionProductVersionRetirement = (SubscriptionProductVersionRetirement) o;
		return Objects.equals(this.createdOn, subscriptionProductVersionRetirement.createdOn) &&
				Objects.equals(this.id, subscriptionProductVersionRetirement.id) &&
				Objects.equals(this.linkedSpaceId, subscriptionProductVersionRetirement.linkedSpaceId) &&
				Objects.equals(this.productVersion, subscriptionProductVersionRetirement.productVersion) &&
				Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductVersionRetirement.respectTerminiationPeriodsEnabled) &&
				Objects.equals(this.targetProduct, subscriptionProductVersionRetirement.targetProduct) &&
				Objects.equals(this.version, subscriptionProductVersionRetirement.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, id, linkedSpaceId, productVersion, respectTerminiationPeriodsEnabled, targetProduct, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductVersionRetirement {\n");
		
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		productVersion: ").append(toIndentedString(productVersion)).append("\n");
		sb.append("		respectTerminiationPeriodsEnabled: ").append(toIndentedString(respectTerminiationPeriodsEnabled)).append("\n");
		sb.append("		targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

