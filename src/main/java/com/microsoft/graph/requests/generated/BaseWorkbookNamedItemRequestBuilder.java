// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRequest;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRequest;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRangeRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Named Item Request Builder.
 */
public class BaseWorkbookNamedItemRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookNamedItemRequestBuilder {

    /**
     * The request builder for the WorkbookNamedItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookNamedItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookNamedItemRequest instance
     */
    public IWorkbookNamedItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookNamedItemRequest instance
     */
    public IWorkbookNamedItemRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookNamedItemRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    public IWorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }

    public IWorkbookNamedItemRangeRequestBuilder range() {
        return new WorkbookNamedItemRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }
}

