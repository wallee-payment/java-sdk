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

public class DatabaseTranslatedStringItem extends Indentable {

    @JsonProperty("language")
    protected String language;


    @JsonProperty("languageCode")
    protected String languageCode;


    @JsonProperty("translation")
    protected String translation;


    /**
     *
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     *
     * @return languageCode
     **/
    @ApiModelProperty(value = "")
    public String getLanguageCode() {
        return languageCode;
    }


    /**
     *
     * @return translation
     **/
    @ApiModelProperty(value = "")
    public String getTranslation() {
        return translation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseTranslatedStringItem databaseTranslatedStringItem = (DatabaseTranslatedStringItem) o;
        return Objects.equals(this.language, databaseTranslatedStringItem.language) &&
                Objects.equals(this.languageCode, databaseTranslatedStringItem.languageCode) &&
                Objects.equals(this.translation, databaseTranslatedStringItem.translation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, languageCode, translation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseTranslatedStringItem {\n");

        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

