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

public class LocalizedString extends Indentable {

    @JsonProperty("displayName")
    protected String displayName;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("string")
    protected String string;


    /**
     * @return displayName
     **/
    @ApiModelProperty(value = "")
    public String getDisplayName() {
        return displayName;
    }


    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * @return string
     **/
    @ApiModelProperty(value = "")
    public String getString() {
        return string;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalizedString localizedString = (LocalizedString) o;
        return Objects.equals(this.displayName, localizedString.displayName) &&
                Objects.equals(this.language, localizedString.language) &&
                Objects.equals(this.string, localizedString.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, language, string);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalizedString {\n");

        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    string: ").append(toIndentedString(string)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

