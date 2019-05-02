/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author   customweb GmbH (www.customweb.com)
 */

package com.wallee.sdk.test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.wallee.sdk.service.TransactionService;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.Gender;
import com.wallee.sdk.model.RenderedDocument;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.LineItemType;
import com.wallee.sdk.model.TaxCreate;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCreate;

/**
 * Test of {@link TransactionService}.
 * 
 */
public class TransactionServiceTest {

	private TransactionService transactionService;

	@Before
	public void setup() {
		long applicationUserId = 512;
		String authenticationKey = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";

		ApiClient apiClient = new ApiClient(applicationUserId, authenticationKey);
		apiClient.setBasePath("https://app-wallee.com/api");

		transactionService = new TransactionService(apiClient);
	}
	
	@Test
	public void testDocumentDownload() {
		Long spaceId = 405l;
		//@formatter:off
		TransactionCreate transactionCreate = new TransactionCreate()
				.customerEmailAddress("test@wallee.com")
				.customerId("cutomer-x")
				.merchantReference(UUID.randomUUID().toString())
				.invoiceMerchantReference("order-1")
				.successUrl("http://localhost/success?orderId=1")
				.failedUrl("http://localhost/failed?orderId=1")
				.shippingMethod("Test Shipping")
				.chargeRetryEnabled(false)
				.allowedPaymentMethodConfigurations(Arrays.asList(8656l))
				.language("en-US")
				.currency("CHF")
				.billingAddress(new AddressCreate()
						.salutation("Ms")
						.givenName("Good")
						.familyName("Customer")
						.gender(Gender.FEMALE)
						.country("CH")
						.city("Winterthur")
						.postCode("8400")
						.dateOfBirth(LocalDate.of(1991, 1, 11))
						.organizationName("Test GmbH")
						.mobilePhoneNumber("+41791234567")
						.emailAddress("test@wallee.com"))
				.shippingAddress(new AddressCreate()
						.salutation("Ms")
						.givenName("Good")
						.familyName("Customer")
						.gender(Gender.FEMALE)
						.country("CH")
						.city("Winterthur")
						.postCode("8400")
						.dateOfBirth(LocalDate.of(1991, 1, 11))
						.organizationName("Test GmbH")
						.mobilePhoneNumber("+41791234567")
						.emailAddress("test@wallee.com"))
				.addLineItemsItem(
						new LineItemCreate()
						.sku("item-1")
						.name("Item 1")
						.uniqueId("unique-id-item-1")
						.type(LineItemType.PRODUCT)
						.quantity(BigDecimal.ONE)
						.shippingRequired(true)
						.amountIncludingTax(new BigDecimal("67.47"))
						.addTaxesItem(new TaxCreate()
										.title("VAT")
										.rate(new BigDecimal(8))))
				.addLineItemsItem(
						new LineItemCreate()
						.sku("test-shipping")
						.name("Shipping")
						.uniqueId("unique-id-test-shipping")
						.type(LineItemType.SHIPPING)
						.quantity(BigDecimal.ONE)
						.amountIncludingTax(new BigDecimal("3.12"))
						.addTaxesItem(new TaxCreate()
										.title("VAT")
										.rate(new BigDecimal(8))));
		//@formatter:on
		
		try {
			ApiResponse<Transaction> response = transactionService.createWithHttpInfo(spaceId, transactionCreate);
			Assert.assertEquals(response.getStatusCode(), 200);
			Assert.assertEquals(spaceId, response.getData().getLinkedSpaceId());
			Assert.assertEquals(new BigDecimal("70.59"), response.getData().getAuthorizationAmount());
			
			// By this operation we enforce the processing without requiring to put any data into the form.
			transactionService.processWithoutUserInteraction(spaceId, response.getData().getId());
			
			// We need to wait here because the invoice document is not generated instantly.
			Thread.sleep(2000);
			
			RenderedDocument document = transactionService.getInvoiceDocument(spaceId, response.getData().getId());
			
			Assert.assertEquals(true, document.getData() != null);
			Assert.assertEquals(true, document.getData().length > 0);

		} catch (ApiException e) {
			Assert.fail("Failed to create transaction. Reason: " + e.getMessage() + " Details: " + e.getResponseBody());
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

	@Test
	public void testTransactionCreate() {
		Long spaceId = 405l;

		//@formatter:off
		TransactionCreate transactionCreate = new TransactionCreate()
				.customerEmailAddress("test@wallee.com")
				.customerId("cutomer-x")
				.merchantReference(UUID.randomUUID().toString())
				.invoiceMerchantReference("order-1")
				.successUrl("http://localhost/success?orderId=1")
				.failedUrl("http://localhost/failed?orderId=1")
				.shippingMethod("Test Shipping")
				.chargeRetryEnabled(false)
				.language("en-US")
				.currency("EUR")
				.billingAddress(new AddressCreate()
						.salutation("Ms")
						.givenName("Jane")
						.familyName("Doe")
						.gender(Gender.FEMALE)
						.country("CH")
						.city("Winterthur")
						.postCode("8400")
						.dateOfBirth(LocalDate.of(1991, 1, 11))
						.organizationName("Test GmbH")
						.mobilePhoneNumber("+41791234567")
						.emailAddress("test@wallee.com"))
				.addLineItemsItem(
						new LineItemCreate()
						.sku("item-1")
						.name("Item 1")
						.uniqueId("unique-id-item-1")
						.type(LineItemType.PRODUCT)
						.quantity(BigDecimal.ONE)
						.shippingRequired(true)
						.amountIncludingTax(new BigDecimal("67.47"))
						.addTaxesItem(new TaxCreate()
										.title("VAT")
										.rate(new BigDecimal(8))))
				.addLineItemsItem(
						new LineItemCreate()
						.sku("test-shipping")
						.name("Shipping")
						.uniqueId("unique-id-test-shipping")
						.type(LineItemType.SHIPPING)
						.quantity(BigDecimal.ONE)
						.amountIncludingTax(new BigDecimal("3.12"))
						.addTaxesItem(new TaxCreate()
										.title("VAT")
										.rate(new BigDecimal(8))));
		//@formatter:on

		try {
			ApiResponse<Transaction> response = transactionService.createWithHttpInfo(spaceId, transactionCreate);
			Assert.assertEquals(response.getStatusCode(), 200);
			Assert.assertEquals(spaceId, response.getData().getLinkedSpaceId());
			Assert.assertEquals(new BigDecimal("70.59"), response.getData().getAuthorizationAmount());

		} catch (ApiException e) {
			Assert.fail("Failed to create transaction. Reason: " + e.getMessage());
		}
	}
}