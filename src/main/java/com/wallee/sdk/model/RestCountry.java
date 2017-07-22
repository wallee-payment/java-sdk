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
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class RestCountry {
	@SerializedName("ISOCode2Letter")
	private String iSOCode2Letter = null;

	@SerializedName("ISOCode3Letter")
	private String iSOCode3Letter = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("numericCode")
	private String numericCode = null;

	@SerializedName("stateCodes")
	private List<String> stateCodes = new ArrayList<String>();

	/**
	 * The ISO code 2 letter identifies the country by two chars as defined in ISO 3166-1 (e.g. US, DE, CH).
	 *
	 * @return The ISO code 2 letter identifies the country by two chars as defined in ISO 3166-1 (e.g. US, DE, CH).
	 */
	@ApiModelProperty(example = "null", value = "The ISO code 2 letter identifies the country by two chars as defined in ISO 3166-1 (e.g. US, DE, CH).")
	public String getISOCode2Letter() {
		return iSOCode2Letter;
	}

	/**
	 * The ISO code 3 letter identifies the country by three chars as defined in ISO 3166-1 (e.g. CHE, USA, GBR).
	 *
	 * @return The ISO code 3 letter identifies the country by three chars as defined in ISO 3166-1 (e.g. CHE, USA, GBR).
	 */
	@ApiModelProperty(example = "null", value = "The ISO code 3 letter identifies the country by three chars as defined in ISO 3166-1 (e.g. CHE, USA, GBR).")
	public String getISOCode3Letter() {
		return iSOCode3Letter;
	}

	/**
	 * The name labels the country by a name in English.
	 *
	 * @return The name labels the country by a name in English.
	 */
	@ApiModelProperty(example = "null", value = "The name labels the country by a name in English.")
	public String getName() {
		return name;
	}

	/**
	 * The numeric code identifies the country by a three digit number as defined in ISO 3166-1 (e.g. 840, 826, 756).
	 *
	 * @return The numeric code identifies the country by a three digit number as defined in ISO 3166-1 (e.g. 840, 826, 756).
	 */
	@ApiModelProperty(example = "null", value = "The numeric code identifies the country by a three digit number as defined in ISO 3166-1 (e.g. 840, 826, 756).")
	public String getNumericCode() {
		return numericCode;
	}

	public RestCountry stateCodes(List<String> stateCodes) {
		this.stateCodes = stateCodes;
		return this;
	}

	public RestCountry addStateCodesItem(String stateCodesItem) {
		this.stateCodes.add(stateCodesItem);
		return this;
	}

	/**
	 * The state codes field is a list of all states associated with this country. The list contains the identifiers of the states. The identifiers corresponds to the ISO 3166-2 subdivision identifier.
	 *
	 * @return The state codes field is a list of all states associated with this country. The list contains the identifiers of the states. The identifiers corresponds to the ISO 3166-2 subdivision identifier.
	 */
	@ApiModelProperty(example = "null", value = "The state codes field is a list of all states associated with this country. The list contains the identifiers of the states. The identifiers corresponds to the ISO 3166-2 subdivision identifier.")
	public List<String> getStateCodes() {
		return stateCodes;
	}

	public void setStateCodes(List<String> stateCodes) {
		this.stateCodes = stateCodes;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RestCountry restCountry = (RestCountry) o;
		return Objects.equals(this.iSOCode2Letter, restCountry.iSOCode2Letter) &&
				Objects.equals(this.iSOCode3Letter, restCountry.iSOCode3Letter) &&
				Objects.equals(this.name, restCountry.name) &&
				Objects.equals(this.numericCode, restCountry.numericCode) &&
				Objects.equals(this.stateCodes, restCountry.stateCodes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(iSOCode2Letter, iSOCode3Letter, name, numericCode, stateCodes);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestCountry {\n");
		
		sb.append("		iSOCode2Letter: ").append(toIndentedString(iSOCode2Letter)).append("\n");
		sb.append("		iSOCode3Letter: ").append(toIndentedString(iSOCode3Letter)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		numericCode: ").append(toIndentedString(numericCode)).append("\n");
		sb.append("		stateCodes: ").append(toIndentedString(stateCodes)).append("\n");
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

