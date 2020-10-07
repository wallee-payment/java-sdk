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

import io.swagger.annotations.ApiModel;

import java.util.Objects;

/**
 * A metric represents the usage of a resource that can be measured.
 */
@ApiModel(description = "A metric represents the usage of a resource that can be measured.")

public class SubscriptionMetricActive extends SubscriptionMetricUpdate {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionMetricActive subscriptionMetricActive = (SubscriptionMetricActive) o;
        return Objects.equals(this.id, subscriptionMetricActive.id) &&
                Objects.equals(this.version, subscriptionMetricActive.version) &&
                Objects.equals(this.description, subscriptionMetricActive.description) &&
                Objects.equals(this.name, subscriptionMetricActive.name) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, description, name, super.hashCode());
    }


    @Override
    public String toString() {
        return "class SubscriptionMetricActive { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) +  "\n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    name: " + toIndentedString(name) +  "\n" +
            "}";
        }


}

