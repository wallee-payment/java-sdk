/**
*  SDK
*
* This library allows to interact with the  payment service.
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


package com.wallee.sdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import com.wallee.sdk.model.*;
import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
          .registerTypeSelector(AbstractAccountUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Account.Create".toUpperCase(), AccountCreate.class);
                classByDiscriminatorValue.put("Account.Update".toUpperCase(), AccountUpdate.class);
                classByDiscriminatorValue.put("AbstractAccountUpdate".toUpperCase(), AbstractAccountUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(User.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("ApplicationUser".toUpperCase(), ApplicationUser.class);
                classByDiscriminatorValue.put("User".toUpperCase(), User.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractApplicationUserUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("ApplicationUser.Create".toUpperCase(), ApplicationUserCreate.class);
                classByDiscriminatorValue.put("ApplicationUser.Update".toUpperCase(), ApplicationUserUpdate.class);
                classByDiscriminatorValue.put("AbstractApplicationUserUpdate".toUpperCase(), AbstractApplicationUserUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(TransactionAwareEntity.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Charge".toUpperCase(), Charge.class);
                classByDiscriminatorValue.put("ChargeAttempt".toUpperCase(), ChargeAttempt.class);
                classByDiscriminatorValue.put("ChargeFlowLevel".toUpperCase(), ChargeFlowLevel.class);
                classByDiscriminatorValue.put("ChargeFlowLevelPaymentLink".toUpperCase(), ChargeFlowLevelPaymentLink.class);
                classByDiscriminatorValue.put("ConnectorInvocation".toUpperCase(), ConnectorInvocation.class);
                classByDiscriminatorValue.put("DeliveryIndication".toUpperCase(), DeliveryIndication.class);
                classByDiscriminatorValue.put("InstallmentPaymentSlice".toUpperCase(), InstallmentPaymentSlice.class);
                classByDiscriminatorValue.put("ShopifyRecurringOrder".toUpperCase(), ShopifyRecurringOrder.class);
                classByDiscriminatorValue.put("ShopifyTransaction".toUpperCase(), ShopifyTransaction.class);
                classByDiscriminatorValue.put("TransactionCompletion".toUpperCase(), TransactionCompletion.class);
                classByDiscriminatorValue.put("TransactionInvoice".toUpperCase(), TransactionInvoice.class);
                classByDiscriminatorValue.put("TransactionLineItemVersion".toUpperCase(), TransactionLineItemVersion.class);
                classByDiscriminatorValue.put("TransactionVoid".toUpperCase(), TransactionVoid.class);
                classByDiscriminatorValue.put("TransactionAwareEntity".toUpperCase(), TransactionAwareEntity.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractCustomerActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Customer.Active".toUpperCase(), CustomerActive.class);
                classByDiscriminatorValue.put("Customer.Create".toUpperCase(), CustomerCreate.class);
                classByDiscriminatorValue.put("AbstractCustomerActive".toUpperCase(), AbstractCustomerActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractCustomerAddressActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("CustomerAddress.Active".toUpperCase(), CustomerAddressActive.class);
                classByDiscriminatorValue.put("CustomerAddress.Create".toUpperCase(), CustomerAddressCreate.class);
                classByDiscriminatorValue.put("AbstractCustomerAddressActive".toUpperCase(), AbstractCustomerAddressActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractCustomerCommentActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("CustomerComment.Active".toUpperCase(), CustomerCommentActive.class);
                classByDiscriminatorValue.put("CustomerComment.Create".toUpperCase(), CustomerCommentCreate.class);
                classByDiscriminatorValue.put("AbstractCustomerCommentActive".toUpperCase(), AbstractCustomerCommentActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractDebtCollectionCaseUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("DebtCollectionCase.Create".toUpperCase(), DebtCollectionCaseCreate.class);
                classByDiscriminatorValue.put("DebtCollectionCase.Update".toUpperCase(), DebtCollectionCaseUpdate.class);
                classByDiscriminatorValue.put("AbstractDebtCollectionCaseUpdate".toUpperCase(), AbstractDebtCollectionCaseUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractHumanUserUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("HumanUser.Create".toUpperCase(), HumanUserCreate.class);
                classByDiscriminatorValue.put("HumanUser.Update".toUpperCase(), HumanUserUpdate.class);
                classByDiscriminatorValue.put("AbstractHumanUserUpdate".toUpperCase(), AbstractHumanUserUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(PaymentLinkUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("PaymentLink.Active".toUpperCase(), PaymentLinkActive.class);
                classByDiscriminatorValue.put("PaymentLinkUpdate".toUpperCase(), PaymentLinkUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractPaymentLinkUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("PaymentLink.Create".toUpperCase(), PaymentLinkCreate.class);
                classByDiscriminatorValue.put("AbstractPaymentLinkUpdate".toUpperCase(), AbstractPaymentLinkUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractRefundCommentActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("RefundComment.Active".toUpperCase(), RefundCommentActive.class);
                classByDiscriminatorValue.put("RefundComment.Create".toUpperCase(), RefundCommentCreate.class);
                classByDiscriminatorValue.put("AbstractRefundCommentActive".toUpperCase(), AbstractRefundCommentActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(Address.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("ShopifySubscriptionAddress".toUpperCase(), ShopifySubscriptionAddress.class);
                classByDiscriminatorValue.put("Address".toUpperCase(), Address.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractShopifySubscriptionProductActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("ShopifySubscriptionProduct.Active".toUpperCase(), ShopifySubscriptionProductActive.class);
                classByDiscriminatorValue.put("ShopifySubscriptionProduct.Create".toUpperCase(), ShopifySubscriptionProductCreate.class);
                classByDiscriminatorValue.put("AbstractShopifySubscriptionProductActive".toUpperCase(), AbstractShopifySubscriptionProductActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractSpaceUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Space.Create".toUpperCase(), SpaceCreate.class);
                classByDiscriminatorValue.put("Space.Update".toUpperCase(), SpaceUpdate.class);
                classByDiscriminatorValue.put("AbstractSpaceUpdate".toUpperCase(), AbstractSpaceUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(SubscriberUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Subscriber.Active".toUpperCase(), SubscriberActive.class);
                classByDiscriminatorValue.put("SubscriberUpdate".toUpperCase(), SubscriberUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractSubscriberUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Subscriber.Create".toUpperCase(), SubscriberCreate.class);
                classByDiscriminatorValue.put("AbstractSubscriberUpdate".toUpperCase(), AbstractSubscriberUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractSubscriptionAffiliateUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionAffiliate.Create".toUpperCase(), SubscriptionAffiliateCreate.class);
                classByDiscriminatorValue.put("AbstractSubscriptionAffiliateUpdate".toUpperCase(), AbstractSubscriptionAffiliateUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(SubscriptionAffiliate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionAffiliate.Deleted".toUpperCase(), SubscriptionAffiliateDeleted.class);
                classByDiscriminatorValue.put("SubscriptionAffiliate".toUpperCase(), SubscriptionAffiliate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(SubscriptionAffiliateUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionAffiliate.Inactive".toUpperCase(), SubscriptionAffiliateInactive.class);
                classByDiscriminatorValue.put("SubscriptionAffiliateUpdate".toUpperCase(), SubscriptionAffiliateUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(SubscriptionMetricUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionMetric.Active".toUpperCase(), SubscriptionMetricActive.class);
                classByDiscriminatorValue.put("SubscriptionMetricUpdate".toUpperCase(), SubscriptionMetricUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractSubscriptionMetricUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionMetric.Create".toUpperCase(), SubscriptionMetricCreate.class);
                classByDiscriminatorValue.put("AbstractSubscriptionMetricUpdate".toUpperCase(), AbstractSubscriptionMetricUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(SubscriptionUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Subscription.Pending".toUpperCase(), SubscriptionPending.class);
                classByDiscriminatorValue.put("SubscriptionUpdate".toUpperCase(), SubscriptionUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractSubscriptionProductActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionProduct.Active".toUpperCase(), SubscriptionProductActive.class);
                classByDiscriminatorValue.put("SubscriptionProduct.Create".toUpperCase(), SubscriptionProductCreate.class);
                classByDiscriminatorValue.put("AbstractSubscriptionProductActive".toUpperCase(), AbstractSubscriptionProductActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(SubscriptionSuspension.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionSuspension.Running".toUpperCase(), SubscriptionSuspensionRunning.class);
                classByDiscriminatorValue.put("SubscriptionSuspension".toUpperCase(), SubscriptionSuspension.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractTokenUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Token.Create".toUpperCase(), TokenCreate.class);
                classByDiscriminatorValue.put("Token.Update".toUpperCase(), TokenUpdate.class);
                classByDiscriminatorValue.put("AbstractTokenUpdate".toUpperCase(), AbstractTokenUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractTransactionCommentActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("TransactionComment.Active".toUpperCase(), TransactionCommentActive.class);
                classByDiscriminatorValue.put("TransactionComment.Create".toUpperCase(), TransactionCommentCreate.class);
                classByDiscriminatorValue.put("AbstractTransactionCommentActive".toUpperCase(), AbstractTransactionCommentActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractTransactionPending.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("Transaction.Create".toUpperCase(), TransactionCreate.class);
                classByDiscriminatorValue.put("Transaction.Pending".toUpperCase(), TransactionPending.class);
                classByDiscriminatorValue.put("AbstractTransactionPending".toUpperCase(), AbstractTransactionPending.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractTransactionInvoiceCommentActive.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("TransactionInvoiceComment.Active".toUpperCase(), TransactionInvoiceCommentActive.class);
                classByDiscriminatorValue.put("TransactionInvoiceComment.Create".toUpperCase(), TransactionInvoiceCommentCreate.class);
                classByDiscriminatorValue.put("AbstractTransactionInvoiceCommentActive".toUpperCase(), AbstractTransactionInvoiceCommentActive.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractWebhookListenerUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("WebhookListener.Create".toUpperCase(), WebhookListenerCreate.class);
                classByDiscriminatorValue.put("WebhookListener.Update".toUpperCase(), WebhookListenerUpdate.class);
                classByDiscriminatorValue.put("AbstractWebhookListenerUpdate".toUpperCase(), AbstractWebhookListenerUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(AbstractWebhookUrlUpdate.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("WebhookUrl.Create".toUpperCase(), WebhookUrlCreate.class);
                classByDiscriminatorValue.put("WebhookUrl.Update".toUpperCase(), WebhookUrlUpdate.class);
                classByDiscriminatorValue.put("AbstractWebhookUrlUpdate".toUpperCase(), AbstractWebhookUrlUpdate.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(ApplicationUser.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("ApplicationUser.CreateWithMacKey".toUpperCase(), ApplicationUserCreateWithMacKey.class);
                classByDiscriminatorValue.put("ApplicationUser".toUpperCase(), ApplicationUser.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
          .registerTypeSelector(SubscriptionAffiliateDeleted.class, new TypeSelector() {
            @Override
            public Class getClassForElement(JsonElement readElement) {
                Map classByDiscriminatorValue = new HashMap();
                classByDiscriminatorValue.put("SubscriptionAffiliate.Deleting".toUpperCase(), SubscriptionAffiliateDeleting.class);
                classByDiscriminatorValue.put("SubscriptionAffiliateDeleted".toUpperCase(), SubscriptionAffiliateDeleted.class);
                return getClassByDiscriminator(
                                           classByDiscriminatorValue,
                                           getDiscriminatorValue(readElement, ""));
            }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if(null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue.toUpperCase());
        if(null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class))
                return (T) body;
            else throw (e);
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {
        }

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {
        }

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}
