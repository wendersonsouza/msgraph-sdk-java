// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequest;
import com.microsoft.graph.models.extensions.WorkbookChartLineFormat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Line Format Request.
 */
public class BaseWorkbookChartLineFormatRequest extends BaseRequest implements IBaseWorkbookChartLineFormatRequest {

    /**
     * The request for the WorkbookChartLineFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookChartLineFormatRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookChartLineFormat> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartLineFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookChartLineFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartLineFormat from the service
     *
     * @return the WorkbookChartLineFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartLineFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookChartLineFormat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartLineFormat with a source
     *
     * @param sourceWorkbookChartLineFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartLineFormat sourceWorkbookChartLineFormat, final ICallback<WorkbookChartLineFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartLineFormat);
    }

    /**
     * Patches this WorkbookChartLineFormat with a source
     *
     * @param sourceWorkbookChartLineFormat the source object with updates
     * @return the updated WorkbookChartLineFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartLineFormat patch(final WorkbookChartLineFormat sourceWorkbookChartLineFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartLineFormat);
    }

    /**
     * Creates a WorkbookChartLineFormat with a new object
     *
     * @param newWorkbookChartLineFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartLineFormat newWorkbookChartLineFormat, final ICallback<WorkbookChartLineFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartLineFormat);
    }

    /**
     * Creates a WorkbookChartLineFormat with a new object
     *
     * @param newWorkbookChartLineFormat the new object to create
     * @return the created WorkbookChartLineFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartLineFormat post(final WorkbookChartLineFormat newWorkbookChartLineFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartLineFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartLineFormatRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartLineFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartLineFormatRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartLineFormatRequest)this;
     }

}

