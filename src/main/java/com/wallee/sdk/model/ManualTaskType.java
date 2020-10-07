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

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The manual task type indicates what kind of manual task is required to be executed by the human.
 */
@ApiModel(description = "The manual task type indicates what kind of manual task is required to be executed by the human.")

public class ManualTaskType extends Indentable {

    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("features")
    protected List<Long> features;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("name")
    protected Map<String, String> name;


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDescription() {
        return description;
    }


    /**
     * @return features
     **/
    @ApiModelProperty(value = "")
    public List<Long> getFeatures() {
        return features;
    }


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
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManualTaskType manualTaskType = (ManualTaskType) o;
        return Objects.equals(this.description, manualTaskType.description) &&
                Objects.equals(this.features, manualTaskType.features) &&
                Objects.equals(this.id, manualTaskType.id) &&
                Objects.equals(this.name, manualTaskType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, features, id, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManualTaskType {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

