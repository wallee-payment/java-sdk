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
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.ProductFeeType;
import com.wallee.sdk.model.ProductMeteredTierPricing;
import com.wallee.sdk.model.SubscriptionMetric;
import com.wallee.sdk.model.SubscriptionProductComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class ProductMeteredFee {
	@SerializedName("component")
	private SubscriptionProductComponent component = null;

	@SerializedName("description")
	private DatabaseTranslatedString description = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("metric")
	private SubscriptionMetric metric = null;

	@SerializedName("name")
	private DatabaseTranslatedString name = null;

	@SerializedName("tierPricing")
	private ProductMeteredTierPricing tierPricing = null;

	@SerializedName("type")
	private ProductFeeType type = null;

	@SerializedName("version")
	private Integer version = null;

	public ProductMeteredFee component(SubscriptionProductComponent component) {
		this.component = component;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProductComponent getComponent() {
		return component;
	}

	public void setComponent(SubscriptionProductComponent component) {
		this.component = component;
	}

	public ProductMeteredFee description(DatabaseTranslatedString description) {
		this.description = description;
		return this;
	}

	/**
	 * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
	 *
	 * @return The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
	 */
	@ApiModelProperty(example = "null", value = "The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.")
	public DatabaseTranslatedString getDescription() {
		return description;
	}

	public void setDescription(DatabaseTranslatedString description) {
		this.description = description;
	}

	public ProductMeteredFee id(Long id) {
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

	public ProductMeteredFee metric(SubscriptionMetric metric) {
		this.metric = metric;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionMetric getMetric() {
		return metric;
	}

	public void setMetric(SubscriptionMetric metric) {
		this.metric = metric;
	}

	public ProductMeteredFee name(DatabaseTranslatedString name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the fee should describe for the subscriber in few words for what the fee is for.
	 *
	 * @return The name of the fee should describe for the subscriber in few words for what the fee is for.
	 */
	@ApiModelProperty(example = "null", value = "The name of the fee should describe for the subscriber in few words for what the fee is for.")
	public DatabaseTranslatedString getName() {
		return name;
	}

	public void setName(DatabaseTranslatedString name) {
		this.name = name;
	}

	public ProductMeteredFee tierPricing(ProductMeteredTierPricing tierPricing) {
		this.tierPricing = tierPricing;
		return this;
	}

	/**
	 * The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.
	 *
	 * @return The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.
	 */
	@ApiModelProperty(example = "null", value = "The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.")
	public ProductMeteredTierPricing getTierPricing() {
		return tierPricing;
	}

	public void setTierPricing(ProductMeteredTierPricing tierPricing) {
		this.tierPricing = tierPricing;
	}

	public ProductMeteredFee type(ProductFeeType type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public ProductFeeType getType() {
		return type;
	}

	public void setType(ProductFeeType type) {
		this.type = type;
	}

	public ProductMeteredFee version(Integer version) {
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
		ProductMeteredFee productMeteredFee = (ProductMeteredFee) o;
		return Objects.equals(this.component, productMeteredFee.component) &&
				Objects.equals(this.description, productMeteredFee.description) &&
				Objects.equals(this.id, productMeteredFee.id) &&
				Objects.equals(this.linkedSpaceId, productMeteredFee.linkedSpaceId) &&
				Objects.equals(this.metric, productMeteredFee.metric) &&
				Objects.equals(this.name, productMeteredFee.name) &&
				Objects.equals(this.tierPricing, productMeteredFee.tierPricing) &&
				Objects.equals(this.type, productMeteredFee.type) &&
				Objects.equals(this.version, productMeteredFee.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(component, description, id, linkedSpaceId, metric, name, tierPricing, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductMeteredFee {\n");
		
		sb.append("		component: ").append(toIndentedString(component)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		metric: ").append(toIndentedString(metric)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		tierPricing: ").append(toIndentedString(tierPricing)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

