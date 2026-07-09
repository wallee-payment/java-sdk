/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.RelatedPerson;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MerchantRelatedPersonsDto
 */
@JsonPropertyOrder({
  MerchantRelatedPersonsDto.JSON_PROPERTY_RELATED_PERSONS
})

public class MerchantRelatedPersonsDto {
  public static final String JSON_PROPERTY_RELATED_PERSONS = "relatedPersons";
  @javax.annotation.Nullable
  private Set<RelatedPerson> relatedPersons = new LinkedHashSet<>();

  public MerchantRelatedPersonsDto() {
  }

  public MerchantRelatedPersonsDto relatedPersons(@javax.annotation.Nullable Set<RelatedPerson> relatedPersons) {
    
    this.relatedPersons = relatedPersons;
    return this;
  }

  public MerchantRelatedPersonsDto addRelatedPersonsItem(RelatedPerson relatedPersonsItem) {
    if (this.relatedPersons == null) {
      this.relatedPersons = new LinkedHashSet<>();
    }
    this.relatedPersons.add(relatedPersonsItem);
    return this;
  }

  /**
   * The people who own, control, direct, or represent the merchant company.
   * @return relatedPersons
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_PERSONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<RelatedPerson> getRelatedPersons() {
    return relatedPersons;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_RELATED_PERSONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedPersons(@javax.annotation.Nullable Set<RelatedPerson> relatedPersons) {
    this.relatedPersons = relatedPersons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantRelatedPersonsDto merchantRelatedPersonsDto = (MerchantRelatedPersonsDto) o;
    return Objects.equals(this.relatedPersons, merchantRelatedPersonsDto.relatedPersons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedPersons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantRelatedPersonsDto {\n");
    sb.append("    relatedPersons: ").append(toIndentedString(relatedPersons)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `relatedPersons` to the URL query string
    if (getRelatedPersons() != null) {
      int i = 0;
      for (RelatedPerson _item : getRelatedPersons()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%srelatedPersons%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

