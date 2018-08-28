// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Series Collection Page.
 */
public class BaseWorkbookChartSeriesCollectionPage extends BaseCollectionPage<WorkbookChartSeries, IWorkbookChartSeriesCollectionRequestBuilder> implements IBaseWorkbookChartSeriesCollectionPage {

    /**
     * A collection page for WorkbookChartSeries
     *
     * @param response the serialized BaseWorkbookChartSeriesCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseWorkbookChartSeriesCollectionPage(final BaseWorkbookChartSeriesCollectionResponse response, final IWorkbookChartSeriesCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
