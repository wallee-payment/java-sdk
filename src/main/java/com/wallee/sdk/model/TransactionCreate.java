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
import com.wallee.sdk.model.AbstractTransactionPending;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentMethodBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class TransactionCreate extends AbstractTransactionPending {
	@SerializedName("billingAddress")
	private AddressCreate billingAddress = null;

	@SerializedName("chargeRetryEnabled")
	private Boolean chargeRetryEnabled = null;

	@SerializedName("customersPresence")
	private CustomersPresence customersPresence = null;

	@SerializedName("lineItems")
	private List<LineItemCreate> lineItems = new ArrayList<LineItemCreate>();

	@SerializedName("shippingAddress")
	private AddressCreate shippingAddress = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("token")
	private Long token = null;

	public TransactionCreate billingAddress(AddressCreate billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public AddressCreate getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(AddressCreate billingAddress) {
		this.billingAddress = billingAddress;
	}

	public TransactionCreate chargeRetryEnabled(Boolean chargeRetryEnabled) {
		this.chargeRetryEnabled = chargeRetryEnabled;
		return this;
	}

	/**
	 * When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 *
	 * @return When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 */
	@ApiModelProperty(example = "null", value = "When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.")
	public Boolean getChargeRetryEnabled() {
		return chargeRetryEnabled;
	}

	public void setChargeRetryEnabled(Boolean chargeRetryEnabled) {
		this.chargeRetryEnabled = chargeRetryEnabled;
	}

	public TransactionCreate customersPresence(CustomersPresence customersPresence) {
		this.customersPresence = customersPresence;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public CustomersPresence getCustomersPresence() {
		return customersPresence;
	}

	public void setCustomersPresence(CustomersPresence customersPresence) {
		this.customersPresence = customersPresence;
	}

	public TransactionCreate lineItems(List<LineItemCreate> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public TransactionCreate addLineItemsItem(LineItemCreate lineItemsItem) {
		this.lineItems.add(lineItemsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public List<LineItemCreate> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItemCreate> lineItems) {
		this.lineItems = lineItems;
	}

	public TransactionCreate shippingAddress(AddressCreate shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public AddressCreate getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressCreate shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public TransactionCreate spaceViewId(Long spaceViewId) {
		this.spaceViewId = spaceViewId;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	public void setSpaceViewId(Long spaceViewId) {
		this.spaceViewId = spaceViewId;
	}

	public TransactionCreate token(Long token) {
		this.token = token;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getToken() {
		return token;
	}

	public void setToken(Long token) {
		this.token = token;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TransactionCreate transactionCreate = (TransactionCreate) o;
		return Objects.equals(this.billingAddress, transactionCreate.billingAddress) &&
				Objects.equals(this.chargeRetryEnabled, transactionCreate.chargeRetryEnabled) &&
				Objects.equals(this.customersPresence, transactionCreate.customersPresence) &&
				Objects.equals(this.lineItems, transactionCreate.lineItems) &&
				Objects.equals(this.shippingAddress, transactionCreate.shippingAddress) &&
				Objects.equals(this.spaceViewId, transactionCreate.spaceViewId) &&
				Objects.equals(this.token, transactionCreate.token) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(billingAddress, chargeRetryEnabled, customersPresence, lineItems, shippingAddress, spaceViewId, token, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
		sb.append("		chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
		sb.append("		customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
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

