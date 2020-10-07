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

public class SubscriptionPending extends SubscriptionUpdate {

    @JsonProperty("reference")
    protected String reference;


    @JsonProperty("subscriber")
    protected Long subscriber;


    @JsonProperty("token")
    protected Long token;


    public SubscriptionPending reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * @return reference
     **/
    @ApiModelProperty(value = "")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    public SubscriptionPending subscriber(Long subscriber) {
        this.subscriber = subscriber;
        return this;
    }

    /**
     * @return subscriber
     **/
    @ApiModelProperty(value = "")
    public Long getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Long subscriber) {
        this.subscriber = subscriber;
    }


    public SubscriptionPending token(Long token) {
        this.token = token;
        return this;
    }

    /**
     * @return token
     **/
    @ApiModelProperty(value = "")
    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionPending subscriptionPending = (SubscriptionPending) o;
        return Objects.equals(this.id, subscriptionPending.id) &&
                Objects.equals(this.version, subscriptionPending.version) &&
                Objects.equals(this.affiliate, subscriptionPending.affiliate) &&
                Objects.equals(this.description, subscriptionPending.description) &&
                Objects.equals(this.plannedTerminationDate, subscriptionPending.plannedTerminationDate) &&
                Objects.equals(this.reference, subscriptionPending.reference) &&
                Objects.equals(this.subscriber, subscriptionPending.subscriber) &&
                Objects.equals(this.token, subscriptionPending.token) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, affiliate, description, plannedTerminationDate, reference, subscriber, token, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionPending {\n" +
            "    " + toIndentedString(super.toString()) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "    affiliate: " + toIndentedString(affiliate) + "\n" +
            "    description: " + toIndentedString(description) +  "\n" +
            "    plannedTerminationDate: " + toIndentedString(plannedTerminationDate) + "\n" +
            "    reference: " + toIndentedString(reference) + "\n" +
            "    subscriber: " + toIndentedString(subscriber) +  "\n" +
            "    token: " + toIndentedString(token) + "\n" +
            "}";
        }


}

