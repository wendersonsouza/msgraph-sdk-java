// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsReplaceRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsReplaceRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Replace Request Builder.
 */
public class BaseWorkbookFunctionsReplaceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReplace
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param oldText the oldText
     * @param startNum the startNum
     * @param numChars the numChars
     * @param newText the newText
     */
    public BaseWorkbookFunctionsReplaceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement oldText, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numChars, final com.google.gson.JsonElement newText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("oldText", oldText);
        bodyParams.put("startNum", startNum);
        bodyParams.put("numChars", numChars);
        bodyParams.put("newText", newText);
    }

    /**
     * Creates the IWorkbookFunctionsReplaceRequest
     *
     * @return the IWorkbookFunctionsReplaceRequest instance
     */
    public IWorkbookFunctionsReplaceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsReplaceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsReplaceRequest instance
     */
    public IWorkbookFunctionsReplaceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsReplaceRequest request = new WorkbookFunctionsReplaceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("oldText")) {
            request.body.oldText = getParameter("oldText");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        if (hasParameter("numChars")) {
            request.body.numChars = getParameter("numChars");
        }

        if (hasParameter("newText")) {
            request.body.newText = getParameter("newText");
        }

        return request;
    }
}
