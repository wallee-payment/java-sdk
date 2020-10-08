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

import java.util.Objects;

import io.swagger.annotations.ApiModel;


@ApiModel(description = "")

public class SubscriptionAffiliateDeleting extends SubscriptionAffiliateDeleted {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionAffiliateDeleting subscriptionAffiliateDeleting = (SubscriptionAffiliateDeleting) o;
        return Objects.equals(this.externalId, subscriptionAffiliateDeleting.externalId) &&
                Objects.equals(this.id, subscriptionAffiliateDeleting.id) &&
                Objects.equals(this.language, subscriptionAffiliateDeleting.language) &&
                Objects.equals(this.linkedSpaceId, subscriptionAffiliateDeleting.linkedSpaceId) &&
                Objects.equals(this.metaData, subscriptionAffiliateDeleting.metaData) &&
                Objects.equals(this.name, subscriptionAffiliateDeleting.name) &&
                Objects.equals(this.plannedPurgeDate, subscriptionAffiliateDeleting.plannedPurgeDate) &&
                Objects.equals(this.reference, subscriptionAffiliateDeleting.reference) && this.state
                == subscriptionAffiliateDeleting.state &&
                Objects.equals(this.version, subscriptionAffiliateDeleting.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, id, language, linkedSpaceId, metaData, name, plannedPurgeDate, reference, state, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionAffiliateDeleting { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    externalId: " + toIndentedString(externalId) + " \n" +
            "    id: " + toIndentedString(id) +  " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    linkedSpaceId: " +  toIndentedString(linkedSpaceId) + " \n" +
            "    metaData: " + toIndentedString(metaData) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) +  " \n" +
            "    reference: " + toIndentedString(reference) + " \n" +
            "    state: " + toIndentedString(state) +  " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

