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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AbstractTokenUpdate
 */
public class AbstractTokenUpdate {
	@SerializedName("customerEmailAddress")
	private String customerEmailAddress = null;

	@SerializedName("customerId")
	private String customerId = null;

	@SerializedName("enabledForOneClickPayment")
	private Boolean enabledForOneClickPayment = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("tokenReference")
	private String tokenReference = null;

	public AbstractTokenUpdate customerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
		return this;
	}

	/**
	 * The customer email address is the email address of the customer.
	 *
	 * @return The customer email address is the email address of the customer.
	 */
	@ApiModelProperty(example = "null", value = "The customer email address is the email address of the customer.")
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public AbstractTokenUpdate customerId(String customerId) {
		this.customerId = customerId;
		return this;
	}

	/**
	 * The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it.
	 *
	 * @return The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it.
	 */
	@ApiModelProperty(example = "null", value = "The customer ID identifies the customer in the merchant system. In case the customer ID has been provided it has to correspond with the customer ID provided on the transaction. The customer ID will not be changed automatically. The merchant system has to provide it.")
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public AbstractTokenUpdate enabledForOneClickPayment(Boolean enabledForOneClickPayment) {
		this.enabledForOneClickPayment = enabledForOneClickPayment;
		return this;
	}

	/**
	 * When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments.
	 *
	 * @return When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments.
	 */
	@ApiModelProperty(example = "null", value = "When a token is enabled for one-click payments the buyer will be able to select the token within the iFrame or on the payment page to pay with the token. The usage of the token will reduce the number of steps the buyer has to go through. The buyer is linked via the customer ID on the transaction with the token. Means the token will be visible for buyers with the same customer ID. Additionally the payment method has to be configured to allow the one-click payments.")
	public Boolean getEnabledForOneClickPayment() {
		return enabledForOneClickPayment;
	}

	public void setEnabledForOneClickPayment(Boolean enabledForOneClickPayment) {
		this.enabledForOneClickPayment = enabledForOneClickPayment;
	}

	public AbstractTokenUpdate language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public AbstractTokenUpdate tokenReference(String tokenReference) {
		this.tokenReference = tokenReference;
		return this;
	}

	/**
	 * Use something that it is easy to identify and may help you find the token (e.g. customer id, email address).
	 *
	 * @return Use something that it is easy to identify and may help you find the token (e.g. customer id, email address).
	 */
	@ApiModelProperty(example = "null", value = "Use something that it is easy to identify and may help you find the token (e.g. customer id, email address).")
	public String getTokenReference() {
		return tokenReference;
	}

	public void setTokenReference(String tokenReference) {
		this.tokenReference = tokenReference;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbstractTokenUpdate abstractTokenUpdate = (AbstractTokenUpdate) o;
		return Objects.equals(this.customerEmailAddress, abstractTokenUpdate.customerEmailAddress) &&
				Objects.equals(this.customerId, abstractTokenUpdate.customerId) &&
				Objects.equals(this.enabledForOneClickPayment, abstractTokenUpdate.enabledForOneClickPayment) &&
				Objects.equals(this.language, abstractTokenUpdate.language) &&
				Objects.equals(this.tokenReference, abstractTokenUpdate.tokenReference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerEmailAddress, customerId, enabledForOneClickPayment, language, tokenReference);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbstractTokenUpdate {\n");
		
		sb.append("		customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
		sb.append("		customerId: ").append(toIndentedString(customerId)).append("\n");
		sb.append("		enabledForOneClickPayment: ").append(toIndentedString(enabledForOneClickPayment)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		tokenReference: ").append(toIndentedString(tokenReference)).append("\n");
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

