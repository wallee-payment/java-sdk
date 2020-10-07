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

public class CustomerCommentCreate extends AbstractCustomerCommentActive {

    @JsonProperty("customer")
    protected Long customer;


    public CustomerCommentCreate customer(Long customer) {
        this.customer = customer;
        return this;
    }

    /**
     *
     * @return customer
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer) {
        this.customer = customer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerCommentCreate customerCommentCreate = (CustomerCommentCreate) o;
        return Objects.equals(this.content, customerCommentCreate.content) &&
                Objects.equals(this.customer, customerCommentCreate.customer) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, customer, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerCommentCreate {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

