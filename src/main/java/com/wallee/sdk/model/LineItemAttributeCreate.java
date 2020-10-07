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

public class LineItemAttributeCreate extends Indentable {

    @JsonProperty("label")
    protected String label;


    @JsonProperty("value")
    protected String value;


    public LineItemAttributeCreate label(String label) {
        this.label = label;
        return this;
    }

    /**
     * @return label
     **/
    @ApiModelProperty(required = true, value = "")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public LineItemAttributeCreate value(String value) {
        this.value = value;
        return this;
    }

    /**
     * @return value
     **/
    @ApiModelProperty(required = true, value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LineItemAttributeCreate lineItemAttributeCreate = (LineItemAttributeCreate) o;
        return Objects.equals(this.label, lineItemAttributeCreate.label) &&
                Objects.equals(this.value, lineItemAttributeCreate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, value);
    }


    @Override
    public String toString() {

        return "class LineItemAttributeCreate { \n" +
            "    label: " + toIndentedString(label) +  "\n" +
            "    value: " + toIndentedString(value) + " \n" +
            "}";
        }


}

