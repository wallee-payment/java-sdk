/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This model holds the card data in plain.
 */
@ApiModel(description = "This model holds the card data in plain.")

public class UnencryptedCardDataCreate extends Indentable {

    @JsonProperty("cardHolderName")
    protected String cardHolderName;


    @JsonProperty("cardVerificationCode")
    protected String cardVerificationCode;


    @JsonProperty("expiryDate")
    protected String expiryDate;


    @JsonProperty("primaryAccountNumber")
    protected String primaryAccountNumber;


    public UnencryptedCardDataCreate cardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        return this;
    }

    /**
     * The card holder name is the name printed onto the card. It identifies the person who owns the card.
     *
     * @return cardHolderName
     **/
    @ApiModelProperty(value = "The card holder name is the name printed onto the card. It identifies the person who owns the card.")
    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }


    public UnencryptedCardDataCreate cardVerificationCode(String cardVerificationCode) {
        this.cardVerificationCode = cardVerificationCode;
        return this;
    }

    /**
     * The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.
     *
     * @return cardVerificationCode
     **/
    @ApiModelProperty(value = "The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.")
    public String getCardVerificationCode() {
        return cardVerificationCode;
    }

    public void setCardVerificationCode(String cardVerificationCode) {
        this.cardVerificationCode = cardVerificationCode;
    }


    public UnencryptedCardDataCreate expiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).
     *
     * @return expiryDate
     **/
    @ApiModelProperty(value = "The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).")
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    public UnencryptedCardDataCreate primaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
        return this;
    }

    /**
     * The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.
     *
     * @return primaryAccountNumber
     **/
    @ApiModelProperty(required = true, value = "The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.")
    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnencryptedCardDataCreate unencryptedCardDataCreate = (UnencryptedCardDataCreate) o;
        return Objects.equals(this.cardHolderName, unencryptedCardDataCreate.cardHolderName) &&
                Objects.equals(this.cardVerificationCode, unencryptedCardDataCreate.cardVerificationCode) &&
                Objects.equals(this.expiryDate, unencryptedCardDataCreate.expiryDate) &&
                Objects.equals(this.primaryAccountNumber, unencryptedCardDataCreate.primaryAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardHolderName, cardVerificationCode, expiryDate, primaryAccountNumber);
    }


    @Override
    public String toString() {

        return "class UnencryptedCardDataCreate { \n" +
            "    cardHolderName: " + toIndentedString(cardHolderName) + "\n" +
            "    cardVerificationCode: " + toIndentedString(cardVerificationCode) + " \n" +
            "    expiryDate: " + toIndentedString(expiryDate) + " \n" +
            "    primaryAccountNumber: " + toIndentedString(primaryAccountNumber) + "\n" +
            "}";
        }


}

