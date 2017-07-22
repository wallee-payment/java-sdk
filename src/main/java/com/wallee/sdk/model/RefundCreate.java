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
import com.wallee.sdk.model.LineItemReductionCreate;
import com.wallee.sdk.model.RefundType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).
 */
@io.swagger.annotations.ApiModel(description = "The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).")
public class RefundCreate {
	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("merchantReference")
	private String merchantReference = null;

	@SerializedName("reductions")
	private List<LineItemReductionCreate> reductions = new ArrayList<LineItemReductionCreate>();

	@SerializedName("transaction")
	private Long transaction = null;

	@SerializedName("type")
	private RefundType type = null;

	public RefundCreate externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.
	 *
	 * @return The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.")
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public RefundCreate merchantReference(String merchantReference) {
		this.merchantReference = merchantReference;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getMerchantReference() {
		return merchantReference;
	}

	public void setMerchantReference(String merchantReference) {
		this.merchantReference = merchantReference;
	}

	public RefundCreate reductions(List<LineItemReductionCreate> reductions) {
		this.reductions = reductions;
		return this;
	}

	public RefundCreate addReductionsItem(LineItemReductionCreate reductionsItem) {
		this.reductions.add(reductionsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public List<LineItemReductionCreate> getReductions() {
		return reductions;
	}

	public void setReductions(List<LineItemReductionCreate> reductions) {
		this.reductions = reductions;
	}

	public RefundCreate transaction(Long transaction) {
		this.transaction = transaction;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public Long getTransaction() {
		return transaction;
	}

	public void setTransaction(Long transaction) {
		this.transaction = transaction;
	}

	public RefundCreate type(RefundType type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public RefundType getType() {
		return type;
	}

	public void setType(RefundType type) {
		this.type = type;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RefundCreate refundCreate = (RefundCreate) o;
		return Objects.equals(this.externalId, refundCreate.externalId) &&
				Objects.equals(this.merchantReference, refundCreate.merchantReference) &&
				Objects.equals(this.reductions, refundCreate.reductions) &&
				Objects.equals(this.transaction, refundCreate.transaction) &&
				Objects.equals(this.type, refundCreate.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(externalId, merchantReference, reductions, transaction, type);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RefundCreate {\n");
		
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
		sb.append("		reductions: ").append(toIndentedString(reductions)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

