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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@ApiModel(description = "")

public class ChargeFlowLevelPaymentLink extends TransactionAwareEntity {

    @JsonProperty("chargeFlowLevel")
    protected ChargeFlowLevel chargeFlowLevel;


    @JsonProperty("paymentLink")
    protected String paymentLink;


    /**
     * @return chargeFlowLevel
     **/
    @ApiModelProperty(value = "")
    public ChargeFlowLevel getChargeFlowLevel() {
        return chargeFlowLevel;
    }


    /**
     * @return paymentLink
     **/
    @ApiModelProperty(value = "")
    public String getPaymentLink() {
        return paymentLink;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChargeFlowLevelPaymentLink chargeFlowLevelPaymentLink = (ChargeFlowLevelPaymentLink) o;
        return Objects.equals(this.id, chargeFlowLevelPaymentLink.id) &&
                Objects.equals(this.linkedSpaceId, chargeFlowLevelPaymentLink.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, chargeFlowLevelPaymentLink.linkedTransaction) &&
                Objects.equals(this.chargeFlowLevel, chargeFlowLevelPaymentLink.chargeFlowLevel) &&
                Objects.equals(this.paymentLink, chargeFlowLevelPaymentLink.paymentLink) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, chargeFlowLevel, paymentLink, super.hashCode());
    }


    @Override
    public String toString() {
        return "class ChargeFlowLevelPaymentLink { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    chargeFlowLevel: " + toIndentedString(chargeFlowLevel) + " \n" +
            "    paymentLink: " + toIndentedString(paymentLink) +  "\n" +
            "}";
        }


}

