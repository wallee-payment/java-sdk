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
import com.wallee.sdk.model.PaymentTerminalAddress;
import com.wallee.sdk.model.PaymentTerminalLocation;
import com.wallee.sdk.model.PaymentTerminalLocationVersionState;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentTerminalLocationVersion
 */
@JsonPropertyOrder({
  PaymentTerminalLocationVersion.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentTerminalLocationVersion.JSON_PROPERTY_ADDRESS,
  PaymentTerminalLocationVersion.JSON_PROPERTY_CREATED_BY,
  PaymentTerminalLocationVersion.JSON_PROPERTY_PLANNED_PURGE_DATE,
  PaymentTerminalLocationVersion.JSON_PROPERTY_CONTACT_ADDRESS,
  PaymentTerminalLocationVersion.JSON_PROPERTY_LOCATION,
  PaymentTerminalLocationVersion.JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY,
  PaymentTerminalLocationVersion.JSON_PROPERTY_ID,
  PaymentTerminalLocationVersion.JSON_PROPERTY_STATE,
  PaymentTerminalLocationVersion.JSON_PROPERTY_CREATED_ON,
  PaymentTerminalLocationVersion.JSON_PROPERTY_VERSION
})

public class PaymentTerminalLocationVersion {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private PaymentTerminalAddress address;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_CONTACT_ADDRESS = "contactAddress";
  @javax.annotation.Nullable
  private PaymentTerminalAddress contactAddress;

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nullable
  private PaymentTerminalLocation location;

  public static final String JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY = "versionAppliedImmediately";
  @javax.annotation.Nullable
  private Boolean versionAppliedImmediately;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private PaymentTerminalLocationVersionState state;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public PaymentTerminalLocationVersion() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentTerminalLocationVersion(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY) Boolean versionAppliedImmediately, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.createdBy = createdBy;
    this.plannedPurgeDate = plannedPurgeDate;
    this.versionAppliedImmediately = versionAppliedImmediately;
    this.id = id;
    this.createdOn = createdOn;
    this.version = version;
  }

  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public PaymentTerminalLocationVersion address(@javax.annotation.Nullable PaymentTerminalAddress address) {
    
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(@javax.annotation.Nullable PaymentTerminalAddress address) {
    this.address = address;
  }

  /**
   * The ID of the user the payment terminal location version was created by.
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  public PaymentTerminalLocationVersion contactAddress(@javax.annotation.Nullable PaymentTerminalAddress contactAddress) {
    
    this.contactAddress = contactAddress;
    return this;
  }

  /**
   * Get contactAddress
   * @return contactAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalAddress getContactAddress() {
    return contactAddress;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactAddress(@javax.annotation.Nullable PaymentTerminalAddress contactAddress) {
    this.contactAddress = contactAddress;
  }

  public PaymentTerminalLocationVersion location(@javax.annotation.Nullable PaymentTerminalLocation location) {
    
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(@javax.annotation.Nullable PaymentTerminalLocation location) {
    this.location = location;
  }

  /**
   * Whether payment terminals are immediately updated to this configuration version. If not, it will be applied during the maintenance window.
   * @return versionAppliedImmediately
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVersionAppliedImmediately() {
    return versionAppliedImmediately;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public PaymentTerminalLocationVersion state(@javax.annotation.Nullable PaymentTerminalLocationVersionState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalLocationVersionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable PaymentTerminalLocationVersionState state) {
    this.state = state;
  }

  /**
   * The date and time when the object was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    PaymentTerminalLocationVersion paymentTerminalLocationVersion = (PaymentTerminalLocationVersion) o;
    return Objects.equals(this.linkedSpaceId, paymentTerminalLocationVersion.linkedSpaceId) &&
        Objects.equals(this.address, paymentTerminalLocationVersion.address) &&
        Objects.equals(this.createdBy, paymentTerminalLocationVersion.createdBy) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminalLocationVersion.plannedPurgeDate) &&
        Objects.equals(this.contactAddress, paymentTerminalLocationVersion.contactAddress) &&
        Objects.equals(this.location, paymentTerminalLocationVersion.location) &&
        Objects.equals(this.versionAppliedImmediately, paymentTerminalLocationVersion.versionAppliedImmediately) &&
        Objects.equals(this.id, paymentTerminalLocationVersion.id) &&
        Objects.equals(this.state, paymentTerminalLocationVersion.state) &&
        Objects.equals(this.createdOn, paymentTerminalLocationVersion.createdOn) &&
        Objects.equals(this.version, paymentTerminalLocationVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, address, createdBy, plannedPurgeDate, contactAddress, location, versionAppliedImmediately, id, state, createdOn, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalLocationVersion {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    versionAppliedImmediately: ").append(toIndentedString(versionAppliedImmediately)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contactAddress` to the URL query string
    if (getContactAddress() != null) {
      joiner.add(getContactAddress().toUrlQueryString(prefix + "contactAddress" + suffix));
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(getLocation().toUrlQueryString(prefix + "location" + suffix));
    }

    // add `versionAppliedImmediately` to the URL query string
    if (getVersionAppliedImmediately() != null) {
      try {
        joiner.add(String.format("%sversionAppliedImmediately%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersionAppliedImmediately()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

