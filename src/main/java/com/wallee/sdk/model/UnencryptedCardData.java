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
 * This model holds the card data in plain.
 */
public class UnencryptedCardData {

	@SerializedName("cardHolderName")
	private String cardHolderName = null;

	@SerializedName("cardVerificationCode")
	private String cardVerificationCode = null;

	@SerializedName("expiryDate")
	private String expiryDate = null;

	@SerializedName("primaryAccountNumber")
	private String primaryAccountNumber = null;

	/**
	 * The card holder name is the name printed onto the card. It identifies the person who owns the card.
	 *
	 * @return The card holder name is the name printed onto the card. It identifies the person who owns the card.
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.
	 *
	 * @return The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.
	 */
	public String getCardVerificationCode() {
		return cardVerificationCode;
	}

	/**
	 * The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).
	 *
	 * @return The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.
	 *
	 * @return The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.
	 */
	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UnencryptedCardData unencryptedCardData = (UnencryptedCardData) o;
		return Objects.equals(this.cardHolderName, unencryptedCardData.cardHolderName) &&
				Objects.equals(this.cardVerificationCode, unencryptedCardData.cardVerificationCode) &&
				Objects.equals(this.expiryDate, unencryptedCardData.expiryDate) &&
				Objects.equals(this.primaryAccountNumber, unencryptedCardData.primaryAccountNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardHolderName, cardVerificationCode, expiryDate, primaryAccountNumber);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UnencryptedCardData {\n");
		
		sb.append("		cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
		sb.append("		cardVerificationCode: ").append(toIndentedString(cardVerificationCode)).append("\n");
		sb.append("		expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
		sb.append("		primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
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

