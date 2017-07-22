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
import com.wallee.sdk.model.AbstractAccountUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class AccountCreate extends AbstractAccountUpdate {
	@SerializedName("parentAccount")
	private Long parentAccount = null;

	public AccountCreate parentAccount(Long parentAccount) {
		this.parentAccount = parentAccount;
		return this;
	}

	/**
	 * The account which is responsible for administering the account.
	 *
	 * @return The account which is responsible for administering the account.
	 */
	@ApiModelProperty(example = "null", value = "The account which is responsible for administering the account.")
	public Long getParentAccount() {
		return parentAccount;
	}

	public void setParentAccount(Long parentAccount) {
		this.parentAccount = parentAccount;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountCreate accountCreate = (AccountCreate) o;
		return Objects.equals(this.parentAccount, accountCreate.parentAccount) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(parentAccount, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
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

