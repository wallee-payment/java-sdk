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
public class RestCurrency {
	@SerializedName("currencyCode")
	private String currencyCode = null;

	@SerializedName("fractionDigits")
	private Integer fractionDigits = null;

	@SerializedName("numericCode")
	private Integer numericCode = null;

	/**
	 * The currency code identifies the currency with the three char long ISO 4217 code (e.g. USD, CHF, EUR).
	 *
	 * @return The currency code identifies the currency with the three char long ISO 4217 code (e.g. USD, CHF, EUR).
	 */
	@ApiModelProperty(example = "null", value = "The currency code identifies the currency with the three char long ISO 4217 code (e.g. USD, CHF, EUR).")
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * The fraction digits indicates how many places the currency has. This also indicates with which precision we calculate internally when we do calculations with this currency.
	 *
	 * @return The fraction digits indicates how many places the currency has. This also indicates with which precision we calculate internally when we do calculations with this currency.
	 */
	@ApiModelProperty(example = "null", value = "The fraction digits indicates how many places the currency has. This also indicates with which precision we calculate internally when we do calculations with this currency.")
	public Integer getFractionDigits() {
		return fractionDigits;
	}

	/**
	 * The numeric code identifies the currency with the three digit long ISO 4217 code (e.g. 978, 756, 840).
	 *
	 * @return The numeric code identifies the currency with the three digit long ISO 4217 code (e.g. 978, 756, 840).
	 */
	@ApiModelProperty(example = "null", value = "The numeric code identifies the currency with the three digit long ISO 4217 code (e.g. 978, 756, 840).")
	public Integer getNumericCode() {
		return numericCode;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RestCurrency restCurrency = (RestCurrency) o;
		return Objects.equals(this.currencyCode, restCurrency.currencyCode) &&
				Objects.equals(this.fractionDigits, restCurrency.fractionDigits) &&
				Objects.equals(this.numericCode, restCurrency.numericCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currencyCode, fractionDigits, numericCode);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestCurrency {\n");
		
		sb.append("		currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
		sb.append("		fractionDigits: ").append(toIndentedString(fractionDigits)).append("\n");
		sb.append("		numericCode: ").append(toIndentedString(numericCode)).append("\n");
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

