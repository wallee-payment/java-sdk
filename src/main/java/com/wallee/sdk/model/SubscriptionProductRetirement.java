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
import com.wallee.sdk.model.SubscriptionProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionProductRetirement {
	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("product")
	private SubscriptionProduct product = null;

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
	@ApiModelProperty(example = "null", value = "The created on date indicates the date on which the entity was stored into the database.")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	public SubscriptionProductRetirement id(Long id) {
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
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The linked space id holds the ID of the space to which the entity belongs to.")
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	public SubscriptionProductRetirement product(SubscriptionProduct product) {
		this.product = product;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProduct getProduct() {
		return product;
	}

	public void setProduct(SubscriptionProduct product) {
		this.product = product;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Boolean getRespectTerminiationPeriodsEnabled() {
		return respectTerminiationPeriodsEnabled;
	}

	public SubscriptionProductRetirement targetProduct(SubscriptionProduct targetProduct) {
		this.targetProduct = targetProduct;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProduct getTargetProduct() {
		return targetProduct;
	}

	public void setTargetProduct(SubscriptionProduct targetProduct) {
		this.targetProduct = targetProduct;
	}

	public SubscriptionProductRetirement version(Integer version) {
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
		SubscriptionProductRetirement subscriptionProductRetirement = (SubscriptionProductRetirement) o;
		return Objects.equals(this.createdOn, subscriptionProductRetirement.createdOn) &&
				Objects.equals(this.id, subscriptionProductRetirement.id) &&
				Objects.equals(this.linkedSpaceId, subscriptionProductRetirement.linkedSpaceId) &&
				Objects.equals(this.product, subscriptionProductRetirement.product) &&
				Objects.equals(this.respectTerminiationPeriodsEnabled, subscriptionProductRetirement.respectTerminiationPeriodsEnabled) &&
				Objects.equals(this.targetProduct, subscriptionProductRetirement.targetProduct) &&
				Objects.equals(this.version, subscriptionProductRetirement.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, id, linkedSpaceId, product, respectTerminiationPeriodsEnabled, targetProduct, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductRetirement {\n");
		
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		product: ").append(toIndentedString(product)).append("\n");
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

