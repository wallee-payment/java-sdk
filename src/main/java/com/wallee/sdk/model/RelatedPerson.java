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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.IdentityInfo;
import com.wallee.sdk.model.RepresentativeInfo;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RelatedPerson
 */
@JsonPropertyOrder({
  RelatedPerson.JSON_PROPERTY_EMAIL_ADDRESS,
  RelatedPerson.JSON_PROPERTY_IS_SELECTED_SHAREHOLDER_OR_DIRECTOR,
  RelatedPerson.JSON_PROPERTY_PLACE_OF_BIRTH,
  RelatedPerson.JSON_PROPERTY_IDENTITY_INFO,
  RelatedPerson.JSON_PROPERTY_NATIONALITY,
  RelatedPerson.JSON_PROPERTY_CONTACT_LANGUAGE,
  RelatedPerson.JSON_PROPERTY_IS_DIRECTOR,
  RelatedPerson.JSON_PROPERTY_REPRESENTATIVE_INFO,
  RelatedPerson.JSON_PROPERTY_JOB_ROLE,
  RelatedPerson.JSON_PROPERTY_ID,
  RelatedPerson.JSON_PROPERTY_COMPANY_SHARE,
  RelatedPerson.JSON_PROPERTY_RESIDENCE_ADDRESS
})

public class RelatedPerson {
  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  @javax.annotation.Nullable
  private String emailAddress;

  public static final String JSON_PROPERTY_IS_SELECTED_SHAREHOLDER_OR_DIRECTOR = "isSelectedShareholderOrDirector";
  @javax.annotation.Nullable
  private Boolean isSelectedShareholderOrDirector;

  public static final String JSON_PROPERTY_PLACE_OF_BIRTH = "placeOfBirth";
  @javax.annotation.Nullable
  private String placeOfBirth;

  public static final String JSON_PROPERTY_IDENTITY_INFO = "identityInfo";
  @javax.annotation.Nullable
  private IdentityInfo identityInfo;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  @javax.annotation.Nullable
  private String nationality;

  public static final String JSON_PROPERTY_CONTACT_LANGUAGE = "contactLanguage";
  @javax.annotation.Nullable
  private String contactLanguage;

  public static final String JSON_PROPERTY_IS_DIRECTOR = "isDirector";
  @javax.annotation.Nullable
  private Boolean isDirector;

  public static final String JSON_PROPERTY_REPRESENTATIVE_INFO = "representativeInfo";
  @javax.annotation.Nullable
  private RepresentativeInfo representativeInfo;

  public static final String JSON_PROPERTY_JOB_ROLE = "jobRole";
  @javax.annotation.Nullable
  private String jobRole;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_COMPANY_SHARE = "companyShare";
  @javax.annotation.Nullable
  private BigDecimal companyShare;

  public static final String JSON_PROPERTY_RESIDENCE_ADDRESS = "residenceAddress";
  @javax.annotation.Nullable
  private Address residenceAddress;

  public RelatedPerson() {
  }

  public RelatedPerson emailAddress(@javax.annotation.Nullable String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(@javax.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public RelatedPerson isSelectedShareholderOrDirector(@javax.annotation.Nullable Boolean isSelectedShareholderOrDirector) {
    
    this.isSelectedShareholderOrDirector = isSelectedShareholderOrDirector;
    return this;
  }

  /**
   * Get isSelectedShareholderOrDirector
   * @return isSelectedShareholderOrDirector
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SELECTED_SHAREHOLDER_OR_DIRECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSelectedShareholderOrDirector() {
    return isSelectedShareholderOrDirector;
  }


  @JsonProperty(JSON_PROPERTY_IS_SELECTED_SHAREHOLDER_OR_DIRECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSelectedShareholderOrDirector(@javax.annotation.Nullable Boolean isSelectedShareholderOrDirector) {
    this.isSelectedShareholderOrDirector = isSelectedShareholderOrDirector;
  }

  public RelatedPerson placeOfBirth(@javax.annotation.Nullable String placeOfBirth) {
    
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * Get placeOfBirth
   * @return placeOfBirth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_PLACE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceOfBirth(@javax.annotation.Nullable String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public RelatedPerson identityInfo(@javax.annotation.Nullable IdentityInfo identityInfo) {
    
    this.identityInfo = identityInfo;
    return this;
  }

  /**
   * Get identityInfo
   * @return identityInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentityInfo getIdentityInfo() {
    return identityInfo;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityInfo(@javax.annotation.Nullable IdentityInfo identityInfo) {
    this.identityInfo = identityInfo;
  }

  public RelatedPerson nationality(@javax.annotation.Nullable String nationality) {
    
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNationality() {
    return nationality;
  }


  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
  }

  public RelatedPerson contactLanguage(@javax.annotation.Nullable String contactLanguage) {
    
    this.contactLanguage = contactLanguage;
    return this;
  }

  /**
   * Get contactLanguage
   * @return contactLanguage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactLanguage() {
    return contactLanguage;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactLanguage(@javax.annotation.Nullable String contactLanguage) {
    this.contactLanguage = contactLanguage;
  }

  public RelatedPerson isDirector(@javax.annotation.Nullable Boolean isDirector) {
    
    this.isDirector = isDirector;
    return this;
  }

  /**
   * Get isDirector
   * @return isDirector
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DIRECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDirector() {
    return isDirector;
  }


  @JsonProperty(JSON_PROPERTY_IS_DIRECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDirector(@javax.annotation.Nullable Boolean isDirector) {
    this.isDirector = isDirector;
  }

  public RelatedPerson representativeInfo(@javax.annotation.Nullable RepresentativeInfo representativeInfo) {
    
    this.representativeInfo = representativeInfo;
    return this;
  }

  /**
   * Get representativeInfo
   * @return representativeInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPRESENTATIVE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepresentativeInfo getRepresentativeInfo() {
    return representativeInfo;
  }


  @JsonProperty(JSON_PROPERTY_REPRESENTATIVE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepresentativeInfo(@javax.annotation.Nullable RepresentativeInfo representativeInfo) {
    this.representativeInfo = representativeInfo;
  }

  public RelatedPerson jobRole(@javax.annotation.Nullable String jobRole) {
    
    this.jobRole = jobRole;
    return this;
  }

  /**
   * Get jobRole
   * @return jobRole
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobRole() {
    return jobRole;
  }


  @JsonProperty(JSON_PROPERTY_JOB_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobRole(@javax.annotation.Nullable String jobRole) {
    this.jobRole = jobRole;
  }

  public RelatedPerson id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public RelatedPerson companyShare(@javax.annotation.Nullable BigDecimal companyShare) {
    
    this.companyShare = companyShare;
    return this;
  }

  /**
   * Get companyShare
   * @return companyShare
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCompanyShare() {
    return companyShare;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyShare(@javax.annotation.Nullable BigDecimal companyShare) {
    this.companyShare = companyShare;
  }

  public RelatedPerson residenceAddress(@javax.annotation.Nullable Address residenceAddress) {
    
    this.residenceAddress = residenceAddress;
    return this;
  }

  /**
   * Get residenceAddress
   * @return residenceAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESIDENCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getResidenceAddress() {
    return residenceAddress;
  }


  @JsonProperty(JSON_PROPERTY_RESIDENCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResidenceAddress(@javax.annotation.Nullable Address residenceAddress) {
    this.residenceAddress = residenceAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPerson relatedPerson = (RelatedPerson) o;
    return Objects.equals(this.emailAddress, relatedPerson.emailAddress) &&
        Objects.equals(this.isSelectedShareholderOrDirector, relatedPerson.isSelectedShareholderOrDirector) &&
        Objects.equals(this.placeOfBirth, relatedPerson.placeOfBirth) &&
        Objects.equals(this.identityInfo, relatedPerson.identityInfo) &&
        Objects.equals(this.nationality, relatedPerson.nationality) &&
        Objects.equals(this.contactLanguage, relatedPerson.contactLanguage) &&
        Objects.equals(this.isDirector, relatedPerson.isDirector) &&
        Objects.equals(this.representativeInfo, relatedPerson.representativeInfo) &&
        Objects.equals(this.jobRole, relatedPerson.jobRole) &&
        Objects.equals(this.id, relatedPerson.id) &&
        Objects.equals(this.companyShare, relatedPerson.companyShare) &&
        Objects.equals(this.residenceAddress, relatedPerson.residenceAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, isSelectedShareholderOrDirector, placeOfBirth, identityInfo, nationality, contactLanguage, isDirector, representativeInfo, jobRole, id, companyShare, residenceAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPerson {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    isSelectedShareholderOrDirector: ").append(toIndentedString(isSelectedShareholderOrDirector)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    identityInfo: ").append(toIndentedString(identityInfo)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    contactLanguage: ").append(toIndentedString(contactLanguage)).append("\n");
    sb.append("    isDirector: ").append(toIndentedString(isDirector)).append("\n");
    sb.append("    representativeInfo: ").append(toIndentedString(representativeInfo)).append("\n");
    sb.append("    jobRole: ").append(toIndentedString(jobRole)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyShare: ").append(toIndentedString(companyShare)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
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

    // add `emailAddress` to the URL query string
    if (getEmailAddress() != null) {
      try {
        joiner.add(String.format("%semailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isSelectedShareholderOrDirector` to the URL query string
    if (getIsSelectedShareholderOrDirector() != null) {
      try {
        joiner.add(String.format("%sisSelectedShareholderOrDirector%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsSelectedShareholderOrDirector()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `placeOfBirth` to the URL query string
    if (getPlaceOfBirth() != null) {
      try {
        joiner.add(String.format("%splaceOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlaceOfBirth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `identityInfo` to the URL query string
    if (getIdentityInfo() != null) {
      joiner.add(getIdentityInfo().toUrlQueryString(prefix + "identityInfo" + suffix));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      try {
        joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNationality()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contactLanguage` to the URL query string
    if (getContactLanguage() != null) {
      try {
        joiner.add(String.format("%scontactLanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContactLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isDirector` to the URL query string
    if (getIsDirector() != null) {
      try {
        joiner.add(String.format("%sisDirector%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDirector()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `representativeInfo` to the URL query string
    if (getRepresentativeInfo() != null) {
      joiner.add(getRepresentativeInfo().toUrlQueryString(prefix + "representativeInfo" + suffix));
    }

    // add `jobRole` to the URL query string
    if (getJobRole() != null) {
      try {
        joiner.add(String.format("%sjobRole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJobRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `companyShare` to the URL query string
    if (getCompanyShare() != null) {
      try {
        joiner.add(String.format("%scompanyShare%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompanyShare()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `residenceAddress` to the URL query string
    if (getResidenceAddress() != null) {
      joiner.add(getResidenceAddress().toUrlQueryString(prefix + "residenceAddress" + suffix));
    }

    return joiner.toString();
  }

}

