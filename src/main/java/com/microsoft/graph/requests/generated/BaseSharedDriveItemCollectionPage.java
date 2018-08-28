// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.SharedDriveItem;
import com.microsoft.graph.requests.extensions.ISharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Shared Drive Item Collection Page.
 */
public class BaseSharedDriveItemCollectionPage extends BaseCollectionPage<SharedDriveItem, ISharedDriveItemCollectionRequestBuilder> implements IBaseSharedDriveItemCollectionPage {

    /**
     * A collection page for SharedDriveItem
     *
     * @param response the serialized BaseSharedDriveItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseSharedDriveItemCollectionPage(final BaseSharedDriveItemCollectionResponse response, final ISharedDriveItemCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
