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


@ApiModel(description = "")

public class TransactionInvoiceCommentCreate extends AbstractTransactionInvoiceCommentActive {

    @JsonProperty("transactionInvoice")
    protected Long transactionInvoice;


    public TransactionInvoiceCommentCreate transactionInvoice(Long transactionInvoice) {
        this.transactionInvoice = transactionInvoice;
        return this;
    }

    /**
     * @return transactionInvoice
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getTransactionInvoice() {
        return transactionInvoice;
    }

    public void setTransactionInvoice(Long transactionInvoice) {
        this.transactionInvoice = transactionInvoice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionInvoiceCommentCreate transactionInvoiceCommentCreate = (TransactionInvoiceCommentCreate) o;
        return Objects.equals(this.content, transactionInvoiceCommentCreate.content) &&
                Objects.equals(this.transactionInvoice, transactionInvoiceCommentCreate.transactionInvoice) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, transactionInvoice, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TransactionInvoiceCommentCreate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    content: " + toIndentedString(content) + " \n" +
            "    transactionInvoice: " +  toIndentedString(transactionInvoice) + "\n" +
            "}";
        }


}

