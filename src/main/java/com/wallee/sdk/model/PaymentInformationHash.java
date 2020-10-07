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

/**
 * A payment information hash is calculated based on the information entered by the user. The same input leads to the same hash. The hash is collision free.
 */
@ApiModel(description = "A payment information hash is calculated based on the information entered by the user. The same input leads to the same hash. The hash is collision free.")

public class PaymentInformationHash extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("type")
    protected PaymentInformationHashType type;


    @JsonProperty("value")
    protected String value;


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * @return type
     **/
    @ApiModelProperty(value = "")
    public PaymentInformationHashType getType() {
        return type;
    }


    /**
     * @return value
     **/
    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentInformationHash paymentInformationHash = (PaymentInformationHash) o;
        return Objects.equals(this.id, paymentInformationHash.id) &&
                Objects.equals(this.type, paymentInformationHash.type) &&
                Objects.equals(this.value, paymentInformationHash.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentInformationHash {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

