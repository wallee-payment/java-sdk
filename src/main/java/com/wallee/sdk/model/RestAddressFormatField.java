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

import com.google.gson.annotations.SerializedName;


/**
 * RestAddressFormatField
 */
public enum RestAddressFormatField {
	
	@SerializedName("GIVEN_NAME")
	GIVEN_NAME("GIVEN_NAME"),
	
	@SerializedName("FAMILY_NAME")
	FAMILY_NAME("FAMILY_NAME"),
	
	@SerializedName("ORGANIZATION_NAME")
	ORGANIZATION_NAME("ORGANIZATION_NAME"),
	
	@SerializedName("STREET")
	STREET("STREET"),
	
	@SerializedName("DEPENDENT_LOCALITY")
	DEPENDENT_LOCALITY("DEPENDENT_LOCALITY"),
	
	@SerializedName("CITY")
	CITY("CITY"),
	
	@SerializedName("POSTAL_STATE")
	POSTAL_STATE("POSTAL_STATE"),
	
	@SerializedName("POST_CODE")
	POST_CODE("POST_CODE"),
	
	@SerializedName("SORTING_CODE")
	SORTING_CODE("SORTING_CODE"),
	
	@SerializedName("COUNTRY")
	COUNTRY("COUNTRY");

	private String value;

	private RestAddressFormatField(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

