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
import com.wallee.sdk.model.LocalizedString;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LegalOrganizationForm
 */
@JsonPropertyOrder({
  LegalOrganizationForm.JSON_PROPERTY_COUNTRY,
  LegalOrganizationForm.JSON_PROPERTY_SHORTCUT,
  LegalOrganizationForm.JSON_PROPERTY_ENGLISH_DESCRIPTION,
  LegalOrganizationForm.JSON_PROPERTY_DESCRIPTION,
  LegalOrganizationForm.JSON_PROPERTY_ID
})

public class LegalOrganizationForm {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_SHORTCUT = "shortcut";
  private Set<LocalizedString> shortcut = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ENGLISH_DESCRIPTION = "englishDescription";
  private String englishDescription;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Set<LocalizedString> description = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public LegalOrganizationForm() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public LegalOrganizationForm(
    @JsonProperty(JSON_PROPERTY_COUNTRY) String country, 
    @JsonProperty(JSON_PROPERTY_SHORTCUT) Set<LocalizedString> shortcut, 
    @JsonProperty(JSON_PROPERTY_ENGLISH_DESCRIPTION) String englishDescription, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Set<LocalizedString> description, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.country = country;
    this.shortcut = shortcut;
    this.englishDescription = englishDescription;
    this.description = description;
    this.id = id;
  }

   /**
   * The two-letter code of the country the legal organization form is used in (ISO 3166-1 alpha-2 format).
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }



   /**
   * The localized shortcuts of the legal organization form.
   * @return shortcut
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORTCUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<LocalizedString> getShortcut() {
    return shortcut;
  }



   /**
   * The English name of the legal organization form.
   * @return englishDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENGLISH_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnglishDescription() {
    return englishDescription;
  }



   /**
   * The localized descriptions of the legal organization form.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<LocalizedString> getDescription() {
    return description;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalOrganizationForm legalOrganizationForm = (LegalOrganizationForm) o;
    return Objects.equals(this.country, legalOrganizationForm.country) &&
        Objects.equals(this.shortcut, legalOrganizationForm.shortcut) &&
        Objects.equals(this.englishDescription, legalOrganizationForm.englishDescription) &&
        Objects.equals(this.description, legalOrganizationForm.description) &&
        Objects.equals(this.id, legalOrganizationForm.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, shortcut, englishDescription, description, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalOrganizationForm {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    shortcut: ").append(toIndentedString(shortcut)).append("\n");
    sb.append("    englishDescription: ").append(toIndentedString(englishDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      try {
        joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shortcut` to the URL query string
    if (getShortcut() != null) {
      int i = 0;
      for (LocalizedString _item : getShortcut()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sshortcut%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `englishDescription` to the URL query string
    if (getEnglishDescription() != null) {
      try {
        joiner.add(String.format("%senglishDescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnglishDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      int i = 0;
      for (LocalizedString _item : getDescription()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sdescription%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

