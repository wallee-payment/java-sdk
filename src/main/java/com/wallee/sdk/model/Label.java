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

public class Label extends Indentable {

    @JsonProperty("content")
    protected Object content;


    @JsonProperty("contentAsString")
    protected String contentAsString;


    @JsonProperty("descriptor")
    protected LabelDescriptor descriptor;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return content
     **/
    @ApiModelProperty(value = "")
    public Object getContent() {
        return content;
    }


    /**
     * @return contentAsString
     **/
    @ApiModelProperty(value = "")
    public String getContentAsString() {
        return contentAsString;
    }


    /**
     * @return descriptor
     **/
    @ApiModelProperty(value = "")
    public LabelDescriptor getDescriptor() {
        return descriptor;
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
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Label label = (Label) o;
        return Objects.equals(this.content, label.content) &&
                Objects.equals(this.contentAsString, label.contentAsString) &&
                Objects.equals(this.descriptor, label.descriptor) &&
                Objects.equals(this.id, label.id) &&
                Objects.equals(this.version, label.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, contentAsString, descriptor, id, version);
    }


    @Override
    public String toString() {

        return "class Label { \n" +
            "    content: " + toIndentedString(content) + " \n" +
            "    contentAsString: " + toIndentedString(contentAsString) + " \n" +
            "    descriptor: " + toIndentedString(descriptor) +  " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

