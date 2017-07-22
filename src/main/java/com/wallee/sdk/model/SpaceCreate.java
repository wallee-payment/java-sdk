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
import com.wallee.sdk.model.AbstractSpaceUpdate;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SpaceAddressCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SpaceCreate extends AbstractSpaceUpdate {
	@SerializedName("account")
	private Long account = null;

	public SpaceCreate account(Long account) {
		this.account = account;
		return this;
	}

	/**
	 * The account to which the space belongs to.
	 *
	 * @return The account to which the space belongs to.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The account to which the space belongs to.")
	public Long getAccount() {
		return account;
	}

	public void setAccount(Long account) {
		this.account = account;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SpaceCreate spaceCreate = (SpaceCreate) o;
		return Objects.equals(this.account, spaceCreate.account) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SpaceCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		account: ").append(toIndentedString(account)).append("\n");
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

