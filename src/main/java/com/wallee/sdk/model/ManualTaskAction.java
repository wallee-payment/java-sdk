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

import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.ManualTaskActionStyle;

@ApiModel(description = "")

public class ManualTaskAction extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("label")
    protected Map<String, String> label;


    @JsonProperty("style")
    protected ManualTaskActionStyle style;


    @JsonProperty("taskType")
    protected Long taskType;


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
     * @return label
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getLabel() {
        return label;
    }


    /**
     * @return style
     **/
    @ApiModelProperty(value = "")
    public ManualTaskActionStyle getStyle() {
        return style;
    }


    /**
     * @return taskType
     **/
    @ApiModelProperty(value = "")
    public Long getTaskType() {
        return taskType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManualTaskAction manualTaskAction = (ManualTaskAction) o;
        return Objects.equals(this.id, manualTaskAction.id) &&
                Objects.equals(this.label, manualTaskAction.label) && this.style == manualTaskAction.style &&
                Objects.equals(this.taskType, manualTaskAction.taskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, style, taskType);
    }


    @Override
    public String toString() {

        return "class ManualTaskAction { \n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    label: " + toIndentedString(label) + " \n" +
            "    style: " + toIndentedString(style) + "\n" +
            "    taskType: " + toIndentedString(taskType) + " \n" +
            "}";
        }


}

