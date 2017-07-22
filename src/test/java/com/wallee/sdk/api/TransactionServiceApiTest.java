/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
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
 */


package com.wallee.sdk.api;

import com.wallee.sdk.ApiException;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionPending;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.TransactionCreate;
import com.wallee.sdk.model.TokenVersion;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.RenderedDocument;
import com.wallee.sdk.model.TransactionLineItemVersion;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.TransactionLineItemUpdateRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionServiceApi
 */
public class TransactionServiceApiTest {

    private final TransactionServiceApi api = new TransactionServiceApi();

    
    /**
     * Build JavaScript URL
     *
     * This operation creates the URL which can be used to embed the JavaScript for handling the iFrame checkout flow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void buildJavaScriptUrlTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // String response = api.buildJavaScriptUrl(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * Build Mobile SDK URL with Credentials
     *
     * This operation builds the URL which is used to load the payment form within a WebView on a mobile device. This operation is typically called through the mobile SDK.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void buildMobileSdkUrlWithCredentialsTest() throws ApiException {
        String credentials = null;
        // String response = api.buildMobileSdkUrlWithCredentials(credentials);

        // TODO: test validations
    }
    
    /**
     * Build Payment Page URL
     *
     * This operation creates the URL to which the user should be redirected to when the payment page should be used.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void buildPaymentPageUrlTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // String response = api.buildPaymentPageUrl(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * Confirm
     *
     * The confirm operation marks the transaction as confirmed. Once the transaction is confirmed no more changes can be applied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmTest() throws ApiException {
        Long spaceId = null;
        TransactionPending transactionModel = null;
        // Transaction response = api.confirm(spaceId, transactionModel);

        // TODO: test validations
    }
    
    /**
     * Count
     *
     * Counts the number of items in the database as restricted by the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countTest() throws ApiException {
        Long spaceId = null;
        EntityQueryFilter filter = null;
        // Long response = api.count(spaceId, filter);

        // TODO: test validations
    }
    
    /**
     * Create
     *
     * Creates the entity with the given properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Long spaceId = null;
        TransactionCreate transaction = null;
        // Transaction response = api.create(spaceId, transaction);

        // TODO: test validations
    }
    
    /**
     * Create Transaction Credentials
     *
     * This operation allows to create transaction credentials to delegate temporarily the access to the web service API for this particular transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTransactionCredentialsTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // String response = api.createTransactionCredentials(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * Delete One-Click Token with Credentials
     *
     * This operation removes the given token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOneClickTokenWithCredentialsTest() throws ApiException {
        String credentials = null;
        Long tokenId = null;
        // api.deleteOneClickTokenWithCredentials(credentials, tokenId);

        // TODO: test validations
    }
    
    /**
     * Fetch One Click Tokens with Credentials
     *
     * This operation returns the token version objects which references the tokens usable as one-click payment tokens for the provided transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneClickTokensWithCredentialsTest() throws ApiException {
        String credentials = null;
        // List<TokenVersion> response = api.fetchOneClickTokensWithCredentials(credentials);

        // TODO: test validations
    }
    
    /**
     * Fetch Possible Payment Methods
     *
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchPossiblePaymentMethodsTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // List<PaymentMethodConfiguration> response = api.fetchPossiblePaymentMethods(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * Fetch Possible Payment Methods with Credentials
     *
     * This operation allows to get the payment method configurations which can be used with the provided transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchPossiblePaymentMethodsWithCredentialsTest() throws ApiException {
        String credentials = null;
        // List<PaymentMethodConfiguration> response = api.fetchPossiblePaymentMethodsWithCredentials(credentials);

        // TODO: test validations
    }
    
    /**
     * getInvoiceDocument
     *
     * Returns the PDF document for the transaction invoice with given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceDocumentTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // RenderedDocument response = api.getInvoiceDocument(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * getLatestTransactionLineItemVersion
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestTransactionLineItemVersionTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // TransactionLineItemVersion response = api.getLatestTransactionLineItemVersion(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * getPackingSlip
     *
     * Returns the packing slip for the transaction with given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackingSlipTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // RenderedDocument response = api.getPackingSlip(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * Process One-Click Token with Credentials
     *
     * This operation assigns the given token to the transaction and process it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processOneClickTokenWithCredentialsTest() throws ApiException {
        String credentials = null;
        Long tokenId = null;
        // Transaction response = api.processOneClickTokenWithCredentials(credentials, tokenId);

        // TODO: test validations
    }
    
    /**
     * Read
     *
     * Reads the entity with the given &#39;id&#39; and returns it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // Transaction response = api.read(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * Read With Credentials
     *
     * Reads the transaction with the given &#39;id&#39; and returns it. This method uses the credentials to authenticate and identify the transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readWithCredentialsTest() throws ApiException {
        String credentials = null;
        // Transaction response = api.readWithCredentials(credentials);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * Searches for the entities as specified by the given query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        Long spaceId = null;
        EntityQuery query = null;
        // List<Transaction> response = api.search(spaceId, query);

        // TODO: test validations
    }
    
    /**
     * Update
     *
     * This updates the entity with the given properties. Only those properties which should be updated can be provided. The &#39;id&#39; and &#39;version&#39; are required to identify the entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        Long spaceId = null;
        TransactionPending entity = null;
        // Transaction response = api.update(spaceId, entity);

        // TODO: test validations
    }
    
    /**
     * updateTransactionLineItems
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTransactionLineItemsTest() throws ApiException {
        Long spaceId = null;
        TransactionLineItemUpdateRequest updateRequest = null;
        // TransactionLineItemVersion response = api.updateTransactionLineItems(spaceId, updateRequest);

        // TODO: test validations
    }
    
}
