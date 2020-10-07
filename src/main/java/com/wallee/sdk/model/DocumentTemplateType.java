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

import java.util.Map;
import java.util.Objects;


@ApiModel(description = "")

public class DocumentTemplateType extends Indentable {

    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("feature")
    protected Long feature;


    @JsonProperty("group")
    protected DocumentTemplateTypeGroup group;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("title")
    protected Map<String, String> title;


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDescription() {
        return description;
    }


    /**
     * @return feature
     **/
    @ApiModelProperty(value = "")
    public Long getFeature() {
        return feature;
    }


    /**
     * @return group
     **/
    @ApiModelProperty(value = "")
    public DocumentTemplateTypeGroup getGroup() {
        return group;
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
     * @return title
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getTitle() {
        return title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocumentTemplateType documentTemplateType = (DocumentTemplateType) o;
        return Objects.equals(this.description, documentTemplateType.description) &&
                Objects.equals(this.feature, documentTemplateType.feature) &&
                Objects.equals(this.group, documentTemplateType.group) &&
                Objects.equals(this.id, documentTemplateType.id) &&
                Objects.equals(this.title, documentTemplateType.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, feature, group, id, title);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentTemplateType {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

