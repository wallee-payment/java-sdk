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
import com.wallee.sdk.model.PersistableCurrencyAmountUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class ProductMeteredTierFeeUpdate {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	@SerializedName("fee")
	private List<PersistableCurrencyAmountUpdate> fee = new ArrayList<PersistableCurrencyAmountUpdate>();

	@SerializedName("meteredFee")
	private Long meteredFee = null;

	@SerializedName("startRange")
	private BigDecimal startRange = null;

	public ProductMeteredTierFeeUpdate id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductMeteredTierFeeUpdate version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public ProductMeteredTierFeeUpdate fee(List<PersistableCurrencyAmountUpdate> fee) {
		this.fee = fee;
		return this;
	}

	public ProductMeteredTierFeeUpdate addFeeItem(PersistableCurrencyAmountUpdate feeItem) {
		this.fee.add(feeItem);
		return this;
	}

	/**
	 * The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.
	 *
	 * @return The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.
	 */
	@ApiModelProperty(example = "null", value = "The fee determines the amount which is charged. The consumed metric is multiplied by the defined fee. The resulting amount is charged at the end of the period.")
	public List<PersistableCurrencyAmountUpdate> getFee() {
		return fee;
	}

	public void setFee(List<PersistableCurrencyAmountUpdate> fee) {
		this.fee = fee;
	}

	public ProductMeteredTierFeeUpdate meteredFee(Long meteredFee) {
		this.meteredFee = meteredFee;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getMeteredFee() {
		return meteredFee;
	}

	public void setMeteredFee(Long meteredFee) {
		this.meteredFee = meteredFee;
	}

	public ProductMeteredTierFeeUpdate startRange(BigDecimal startRange) {
		this.startRange = startRange;
		return this;
	}

	/**
	 * The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.
	 *
	 * @return The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.
	 */
	@ApiModelProperty(example = "null", value = "The start range defines the metered consumption of the metric from which on the defined fee gets applied. This means when a subscription consumes a value of 10 or more and the start range is set to 10 the fee defined on the tier will be applied.")
	public BigDecimal getStartRange() {
		return startRange;
	}

	public void setStartRange(BigDecimal startRange) {
		this.startRange = startRange;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProductMeteredTierFeeUpdate productMeteredTierFeeUpdate = (ProductMeteredTierFeeUpdate) o;
		return Objects.equals(this.id, productMeteredTierFeeUpdate.id) &&
				Objects.equals(this.version, productMeteredTierFeeUpdate.version) &&
				Objects.equals(this.fee, productMeteredTierFeeUpdate.fee) &&
				Objects.equals(this.meteredFee, productMeteredTierFeeUpdate.meteredFee) &&
				Objects.equals(this.startRange, productMeteredTierFeeUpdate.startRange);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, fee, meteredFee, startRange);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductMeteredTierFeeUpdate {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
		sb.append("		fee: ").append(toIndentedString(fee)).append("\n");
		sb.append("		meteredFee: ").append(toIndentedString(meteredFee)).append("\n");
		sb.append("		startRange: ").append(toIndentedString(startRange)).append("\n");
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

