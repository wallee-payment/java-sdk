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
public enum CriteriaOperator {
	
	@SerializedName("EQUALS")
	EQUALS("EQUALS"),
	
	@SerializedName("GREATER_THAN")
	GREATER_THAN("GREATER_THAN"),
	
	@SerializedName("GREATER_THAN_OR_EQUAL")
	GREATER_THAN_OR_EQUAL("GREATER_THAN_OR_EQUAL"),
	
	@SerializedName("LESS_THAN")
	LESS_THAN("LESS_THAN"),
	
	@SerializedName("LESS_THAN_OR_EQUAL")
	LESS_THAN_OR_EQUAL("LESS_THAN_OR_EQUAL"),
	
	@SerializedName("CONTAINS")
	CONTAINS("CONTAINS"),
	
	@SerializedName("NOT_EQUALS")
	NOT_EQUALS("NOT_EQUALS"),
	
	@SerializedName("NOT_CONTAINS")
	NOT_CONTAINS("NOT_CONTAINS"),
	
	@SerializedName("IS_NULL")
	IS_NULL("IS_NULL");

	private String value;

	CriteriaOperator(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

