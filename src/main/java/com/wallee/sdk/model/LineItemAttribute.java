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

public class LineItemAttribute extends Indentable {

    @JsonProperty("label")
    protected String label;


    @JsonProperty("value")
    protected String value;


    /**
     *
     * @return label
     **/
    @ApiModelProperty(value = "")
    public String getLabel() {
        return label;
    }


    /**
     *
     * @return value
     **/
    @ApiModelProperty(value = "")
    public String getValue() {
        return name();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LineItemAttribute lineItemAttribute = (LineItemAttribute) o;
        return Objects.equals(this.label, lineItemAttribute.label) &&
                Objects.equals(this.value, lineItemAttribute.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineItemAttribute {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

