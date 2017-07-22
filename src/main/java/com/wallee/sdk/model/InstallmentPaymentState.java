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
 * 
 */
public enum InstallmentPaymentState {
	
	@SerializedName("CREATE")
	CREATE("CREATE"),
	
	@SerializedName("CONFIRMED")
	CONFIRMED("CONFIRMED"),
	
	@SerializedName("AUTHORIZED")
	AUTHORIZED("AUTHORIZED"),
	
	@SerializedName("REJECTED")
	REJECTED("REJECTED"),
	
	@SerializedName("COMPLETED")
	COMPLETED("COMPLETED"),
	
	@SerializedName("RUNNING")
	RUNNING("RUNNING"),
	
	@SerializedName("DONE")
	DONE("DONE"),
	
	@SerializedName("DEFAULTED")
	DEFAULTED("DEFAULTED");

	private String value;

	InstallmentPaymentState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

