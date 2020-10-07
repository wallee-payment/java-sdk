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

public class DatabaseTranslatedStringCreate extends Indentable {

    @JsonProperty("items")
    protected List<DatabaseTranslatedStringItemCreate> items;


    public DatabaseTranslatedStringCreate items(List<DatabaseTranslatedStringItemCreate> items) {
        this.items = items;
        return this;
    }

    public DatabaseTranslatedStringCreate addItemsItem(DatabaseTranslatedStringItemCreate itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * @return items
     **/
    @ApiModelProperty(value = "")
    public List<DatabaseTranslatedStringItemCreate> getItems() {
        return items;
    }

    public void setItems(List<DatabaseTranslatedStringItemCreate> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseTranslatedStringCreate databaseTranslatedStringCreate = (DatabaseTranslatedStringCreate) o;
        return Objects.equals(this.items, databaseTranslatedStringCreate.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseTranslatedStringCreate {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

