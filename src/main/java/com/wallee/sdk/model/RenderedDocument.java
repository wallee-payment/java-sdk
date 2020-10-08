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

import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class RenderedDocument extends Indentable {

    @JsonProperty("data")
    protected List<byte[]> data;


    @JsonProperty("documentTemplateType")
    protected Long documentTemplateType;


    @JsonProperty("mimeType")
    protected String mimeType;


    @JsonProperty("title")
    protected String title;


    /**
     * @return data
     **/
    @ApiModelProperty(value = "")
    public List<byte[]> getData() {
        return data;
    }


    /**
     * @return documentTemplateType
     **/
    @ApiModelProperty(value = "")
    public Long getDocumentTemplateType() {
        return documentTemplateType;
    }


    /**
     * @return mimeType
     **/
    @ApiModelProperty(value = "")
    public String getMimeType() {
        return mimeType;
    }


    /**
     * @return title
     **/
    @ApiModelProperty(value = "")
    public String getTitle() {
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
        RenderedDocument renderedDocument = (RenderedDocument) o;
        return Objects.equals(this.data, renderedDocument.data) &&
                Objects.equals(this.documentTemplateType, renderedDocument.documentTemplateType) &&
                Objects.equals(this.mimeType, renderedDocument.mimeType) &&
                Objects.equals(this.title, renderedDocument.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, documentTemplateType, mimeType, title);
    }


    @Override
    public String toString() {

        return "class RenderedDocument {\n" +
            "    data: " + toIndentedString(data) +  "\n" +
            "    documentTemplateType: " + toIndentedString(documentTemplateType) + "\n" +
            "    mimeType: " + toIndentedString(mimeType) + "\n" +
            "    title: " + toIndentedString(title) + "\n" +
            "}";
        }


}

