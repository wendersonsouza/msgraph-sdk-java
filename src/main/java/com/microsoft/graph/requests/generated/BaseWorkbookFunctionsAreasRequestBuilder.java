// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAreasRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAreasRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Areas Request Builder.
 */
public class BaseWorkbookFunctionsAreasRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAreas
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param reference the reference
     */
    public BaseWorkbookFunctionsAreasRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement reference) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("reference", reference);
    }

    /**
     * Creates the IWorkbookFunctionsAreasRequest
     *
     * @return the IWorkbookFunctionsAreasRequest instance
     */
    public IWorkbookFunctionsAreasRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAreasRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAreasRequest instance
     */
    public IWorkbookFunctionsAreasRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsAreasRequest request = new WorkbookFunctionsAreasRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reference")) {
            request.body.reference = getParameter("reference");
        }

        return request;
    }
}
