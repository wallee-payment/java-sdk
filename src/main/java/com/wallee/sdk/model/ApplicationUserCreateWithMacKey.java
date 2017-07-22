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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.ApplicationUser;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.Scope;
import com.wallee.sdk.model.UserType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class ApplicationUserCreateWithMacKey extends ApplicationUser {
	@SerializedName("macKey")
	private String macKey = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getMacKey() {
		return macKey;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApplicationUserCreateWithMacKey applicationUserCreateWithMacKey = (ApplicationUserCreateWithMacKey) o;
		return Objects.equals(this.macKey, applicationUserCreateWithMacKey.macKey) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(macKey, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApplicationUserCreateWithMacKey {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		macKey: ").append(toIndentedString(macKey)).append("\n");
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

