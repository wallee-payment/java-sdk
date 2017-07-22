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


/**
 * The primary risk taker will have the main loss when one party of the contract does not fulfill the contractual duties.
 */
public enum PaymentPrimaryRiskTaker {
	
	@SerializedName("CUSTOMER")
	CUSTOMER("CUSTOMER"),
	
	@SerializedName("MERCHANT")
	MERCHANT("MERCHANT"),
	
	@SerializedName("THIRD_PARTY")
	THIRD_PARTY("THIRD_PARTY");

	private String value;

	PaymentPrimaryRiskTaker(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

