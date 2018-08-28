// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDollarFrRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Dollar Fr Request Builder.
 */
public interface IBaseWorkbookFunctionsDollarFrRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDollarFrRequest
     *
     * @return the IWorkbookFunctionsDollarFrRequest instance
     */
    IWorkbookFunctionsDollarFrRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsDollarFrRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDollarFrRequest instance
     */
    IWorkbookFunctionsDollarFrRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
