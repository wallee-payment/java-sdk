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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@ApiModel(description = "")

public class TransactionLineItemUpdateRequest extends Indentable {

    @JsonProperty("newLineItems")
    protected List<LineItemCreate> newLineItems;


    @JsonProperty("transactionId")
    protected Long transactionId;


    public TransactionLineItemUpdateRequest newLineItems(List<LineItemCreate> newLineItems) {
        this.newLineItems = newLineItems;
        return this;
    }

    public TransactionLineItemUpdateRequest addNewLineItemsItem(LineItemCreate newLineItemsItem) {
        if (this.newLineItems == null) {
            this.newLineItems = new ArrayList<>();
        }
        this.newLineItems.add(newLineItemsItem);
        return this;
    }

    /**
     * @return newLineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItemCreate> getNewLineItems() {
        return newLineItems;
    }

    public void setNewLineItems(List<LineItemCreate> newLineItems) {
        this.newLineItems = newLineItems;
    }


    public TransactionLineItemUpdateRequest transactionId(Long transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * @return transactionId
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionLineItemUpdateRequest transactionLineItemUpdateRequest = (TransactionLineItemUpdateRequest) o;
        return Objects.equals(this.newLineItems, transactionLineItemUpdateRequest.newLineItems) &&
                Objects.equals(this.transactionId, transactionLineItemUpdateRequest.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newLineItems, transactionId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionLineItemUpdateRequest {\n");

        sb.append("    newLineItems: ").append(toIndentedString(newLineItems)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

