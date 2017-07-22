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
 * AbstractAccountUpdate
 */
public class AbstractAccountUpdate {
	@SerializedName("name")
	private String name = null;

	@SerializedName("subaccountLimit")
	private Long subaccountLimit = null;

	public AbstractAccountUpdate name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the account identifies the account within the administrative interface.
	 *
	 * @return The name of the account identifies the account within the administrative interface.
	 */
	@ApiModelProperty(example = "null", value = "The name of the account identifies the account within the administrative interface.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbstractAccountUpdate subaccountLimit(Long subaccountLimit) {
		this.subaccountLimit = subaccountLimit;
		return this;
	}

	/**
	 * This property restricts the number of subaccounts which can be created within this account.
	 *
	 * @return This property restricts the number of subaccounts which can be created within this account.
	 */
	@ApiModelProperty(example = "null", value = "This property restricts the number of subaccounts which can be created within this account.")
	public Long getSubaccountLimit() {
		return subaccountLimit;
	}

	public void setSubaccountLimit(Long subaccountLimit) {
		this.subaccountLimit = subaccountLimit;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbstractAccountUpdate abstractAccountUpdate = (AbstractAccountUpdate) o;
		return Objects.equals(this.name, abstractAccountUpdate.name) &&
				Objects.equals(this.subaccountLimit, abstractAccountUpdate.subaccountLimit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, subaccountLimit);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbstractAccountUpdate {\n");
		
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		subaccountLimit: ").append(toIndentedString(subaccountLimit)).append("\n");
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

