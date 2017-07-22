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
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class RestCountryState {
	@SerializedName("code")
	private String code = null;

	@SerializedName("countryCode")
	private String countryCode = null;

	@SerializedName("id")
	private String id = null;

	@SerializedName("name")
	private String name = null;

	/**
	 * The code of the state identifies the state. The code is typically used within addresses. Some countries may not provide a code. For those the field is null.
	 *
	 * @return The code of the state identifies the state. The code is typically used within addresses. Some countries may not provide a code. For those the field is null.
	 */
	@ApiModelProperty(example = "null", value = "The code of the state identifies the state. The code is typically used within addresses. Some countries may not provide a code. For those the field is null.")
	public String getCode() {
		return code;
	}

	/**
	 * The country code in ISO two letter format (e.g. UK, DE, CH, US).
	 *
	 * @return The country code in ISO two letter format (e.g. UK, DE, CH, US).
	 */
	@ApiModelProperty(example = "null", value = "The country code in ISO two letter format (e.g. UK, DE, CH, US).")
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * The ID of the state corresponds to the subdivision identifier defined in ISO 3166-2. The format consists of the country code followed by a dash and a subdivision identifier.
	 *
	 * @return The ID of the state corresponds to the subdivision identifier defined in ISO 3166-2. The format consists of the country code followed by a dash and a subdivision identifier.
	 */
	@ApiModelProperty(example = "null", value = "The ID of the state corresponds to the subdivision identifier defined in ISO 3166-2. The format consists of the country code followed by a dash and a subdivision identifier.")
	public String getId() {
		return id;
	}

	/**
	 * The name is a human readable label of the state in the language of the region.
	 *
	 * @return The name is a human readable label of the state in the language of the region.
	 */
	@ApiModelProperty(example = "null", value = "The name is a human readable label of the state in the language of the region.")
	public String getName() {
		return name;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RestCountryState restCountryState = (RestCountryState) o;
		return Objects.equals(this.code, restCountryState.code) &&
				Objects.equals(this.countryCode, restCountryState.countryCode) &&
				Objects.equals(this.id, restCountryState.id) &&
				Objects.equals(this.name, restCountryState.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, countryCode, id, name);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestCountryState {\n");
		
		sb.append("		code: ").append(toIndentedString(code)).append("\n");
		sb.append("		countryCode: ").append(toIndentedString(countryCode)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
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

