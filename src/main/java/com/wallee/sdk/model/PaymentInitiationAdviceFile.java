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
import com.wallee.sdk.model.PaymentInitiationAdviceFileState;
import com.wallee.sdk.model.PaymentProcessor;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentInitiationAdviceFile
 */
@JsonPropertyOrder({
  PaymentInitiationAdviceFile.JSON_PROPERTY_FORWARDED_ON,
  PaymentInitiationAdviceFile.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentInitiationAdviceFile.JSON_PROPERTY_PROCESSED_ON,
  PaymentInitiationAdviceFile.JSON_PROPERTY_FILE_GENERATED_ON,
  PaymentInitiationAdviceFile.JSON_PROPERTY_NAME,
  PaymentInitiationAdviceFile.JSON_PROPERTY_ID,
  PaymentInitiationAdviceFile.JSON_PROPERTY_STATE,
  PaymentInitiationAdviceFile.JSON_PROPERTY_CREATED_ON,
  PaymentInitiationAdviceFile.JSON_PROPERTY_FAILURE_MESSAGE,
  PaymentInitiationAdviceFile.JSON_PROPERTY_PROCESSOR
})

public class PaymentInitiationAdviceFile {
  public static final String JSON_PROPERTY_FORWARDED_ON = "forwardedOn";
  @javax.annotation.Nullable
  private OffsetDateTime forwardedOn;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_PROCESSED_ON = "processedOn";
  @javax.annotation.Nullable
  private OffsetDateTime processedOn;

  public static final String JSON_PROPERTY_FILE_GENERATED_ON = "fileGeneratedOn";
  @javax.annotation.Nullable
  private OffsetDateTime fileGeneratedOn;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private PaymentInitiationAdviceFileState state;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_FAILURE_MESSAGE = "failureMessage";
  @javax.annotation.Nullable
  private String failureMessage;

  public static final String JSON_PROPERTY_PROCESSOR = "processor";
  @javax.annotation.Nullable
  private PaymentProcessor processor;

  public PaymentInitiationAdviceFile() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentInitiationAdviceFile(
    @JsonProperty(JSON_PROPERTY_FORWARDED_ON) OffsetDateTime forwardedOn, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_PROCESSED_ON) OffsetDateTime processedOn, 
    @JsonProperty(JSON_PROPERTY_FILE_GENERATED_ON) OffsetDateTime fileGeneratedOn, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE) String failureMessage
  ) {
    this();
    this.forwardedOn = forwardedOn;
    this.linkedSpaceId = linkedSpaceId;
    this.processedOn = processedOn;
    this.fileGeneratedOn = fileGeneratedOn;
    this.name = name;
    this.id = id;
    this.createdOn = createdOn;
    this.failureMessage = failureMessage;
  }

  /**
   * The shipping date indicates the date on which the pain file was transferred to an external processing system.
   * @return forwardedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORWARDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getForwardedOn() {
    return forwardedOn;
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



  /**
   * Get processedOn
   * @return processedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getProcessedOn() {
    return processedOn;
  }



  /**
   * Get fileGeneratedOn
   * @return fileGeneratedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_GENERATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFileGeneratedOn() {
    return fileGeneratedOn;
  }



  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
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



  public PaymentInitiationAdviceFile state(@javax.annotation.Nullable PaymentInitiationAdviceFileState state) {
    
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

  public PaymentInitiationAdviceFileState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable PaymentInitiationAdviceFileState state) {
    this.state = state;
  }

  /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * Get failureMessage
   * @return failureMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureMessage() {
    return failureMessage;
  }



  public PaymentInitiationAdviceFile processor(@javax.annotation.Nullable PaymentProcessor processor) {
    
    this.processor = processor;
    return this;
  }

  /**
   * Get processor
   * @return processor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProcessor getProcessor() {
    return processor;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessor(@javax.annotation.Nullable PaymentProcessor processor) {
    this.processor = processor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationAdviceFile paymentInitiationAdviceFile = (PaymentInitiationAdviceFile) o;
    return Objects.equals(this.forwardedOn, paymentInitiationAdviceFile.forwardedOn) &&
        Objects.equals(this.linkedSpaceId, paymentInitiationAdviceFile.linkedSpaceId) &&
        Objects.equals(this.processedOn, paymentInitiationAdviceFile.processedOn) &&
        Objects.equals(this.fileGeneratedOn, paymentInitiationAdviceFile.fileGeneratedOn) &&
        Objects.equals(this.name, paymentInitiationAdviceFile.name) &&
        Objects.equals(this.id, paymentInitiationAdviceFile.id) &&
        Objects.equals(this.state, paymentInitiationAdviceFile.state) &&
        Objects.equals(this.createdOn, paymentInitiationAdviceFile.createdOn) &&
        Objects.equals(this.failureMessage, paymentInitiationAdviceFile.failureMessage) &&
        Objects.equals(this.processor, paymentInitiationAdviceFile.processor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardedOn, linkedSpaceId, processedOn, fileGeneratedOn, name, id, state, createdOn, failureMessage, processor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationAdviceFile {\n");
    sb.append("    forwardedOn: ").append(toIndentedString(forwardedOn)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    processedOn: ").append(toIndentedString(processedOn)).append("\n");
    sb.append("    fileGeneratedOn: ").append(toIndentedString(fileGeneratedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
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

    // add `forwardedOn` to the URL query string
    if (getForwardedOn() != null) {
      try {
        joiner.add(String.format("%sforwardedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForwardedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processedOn` to the URL query string
    if (getProcessedOn() != null) {
      try {
        joiner.add(String.format("%sprocessedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fileGeneratedOn` to the URL query string
    if (getFileGeneratedOn() != null) {
      try {
        joiner.add(String.format("%sfileGeneratedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileGeneratedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `failureMessage` to the URL query string
    if (getFailureMessage() != null) {
      try {
        joiner.add(String.format("%sfailureMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailureMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processor` to the URL query string
    if (getProcessor() != null) {
      joiner.add(getProcessor().toUrlQueryString(prefix + "processor" + suffix));
    }

    return joiner.toString();
  }

}

