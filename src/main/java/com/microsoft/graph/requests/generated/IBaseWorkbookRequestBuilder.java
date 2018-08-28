// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookRequest;
import com.microsoft.graph.requests.extensions.IWorkbookApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCreateSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCloseSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRefreshSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookProcessQueryRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Request Builder.
 */
public interface IBaseWorkbookRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookRequest instance
     */
    IWorkbookRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRequest instance
     */
    IWorkbookRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for WorkbookApplication
     *
     * @return the IWorkbookApplicationRequestBuilder instance
     */
    IWorkbookApplicationRequestBuilder application();

    IWorkbookNamedItemCollectionRequestBuilder names();

    IWorkbookNamedItemRequestBuilder names(final String id);

    IWorkbookTableCollectionRequestBuilder tables();

    IWorkbookTableRequestBuilder tables(final String id);

    IWorkbookWorksheetCollectionRequestBuilder worksheets();

    IWorkbookWorksheetRequestBuilder worksheets(final String id);

    /**
     * Gets the request builder for WorkbookFunctions
     *
     * @return the IWorkbookFunctionsRequestBuilder instance
     */
    IWorkbookFunctionsRequestBuilder functions();
    IWorkbookCreateSessionRequestBuilder createSession(final Boolean persistChanges);
    IWorkbookCloseSessionRequestBuilder closeSession();
    IWorkbookRefreshSessionRequestBuilder refreshSession();
    IWorkbookProcessQueryRequestBuilder processQuery(final byte[] input);

}
