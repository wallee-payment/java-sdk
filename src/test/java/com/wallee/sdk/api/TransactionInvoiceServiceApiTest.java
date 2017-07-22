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
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.RenderedDocument;
import com.wallee.sdk.model.TransactionInvoice;
import com.wallee.sdk.model.TransactionInvoiceReplacement;
import com.wallee.sdk.model.EntityQuery;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionInvoiceServiceApi
 */
public class TransactionInvoiceServiceApiTest {

    private final TransactionInvoiceServiceApi api = new TransactionInvoiceServiceApi();

    
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
     * isReplacementPossible
     *
     * Returns whether the transaction invoice with the given id can be replaced.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isReplacementPossibleTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // Boolean response = api.isReplacementPossible(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * Mark as Paid
     *
     * Marks the transaction invoice with the given id as paid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void markAsPaidTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        // TransactionInvoice response = api.markAsPaid(spaceId, id);

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
        // TransactionInvoice response = api.read(spaceId, id);

        // TODO: test validations
    }
    
    /**
     * replace
     *
     * Replaces the transaction invoice with given id with the replacement and returns the new transaction invoice.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceTest() throws ApiException {
        Long spaceId = null;
        Long id = null;
        TransactionInvoiceReplacement replacement = null;
        // TransactionInvoice response = api.replace(spaceId, id, replacement);

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
        // List<TransactionInvoice> response = api.search(spaceId, query);

        // TODO: test validations
    }
    
}
