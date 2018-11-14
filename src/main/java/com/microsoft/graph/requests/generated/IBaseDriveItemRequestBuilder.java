// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDriveItemRequest;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemStreamRequestBuilder;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.requests.extensions.IDriveItemCopyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCreateLinkRequestBuilder;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.requests.extensions.IDriveItemCreateUploadSessionRequestBuilder;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.requests.extensions.IDriveItemInviteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemPreviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemSearchCollectionRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Request Builder.
 */
public interface IBaseDriveItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDriveItemRequest instance
     */
    IDriveItemRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemRequest instance
     */
    IDriveItemRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDriveItemCollectionRequestBuilder children();

    IDriveItemRequestBuilder children(final String id);

    /**
     * Gets the request builder for ListItem
     *
     * @return the IListItemRequestBuilder instance
     */
    IListItemRequestBuilder listItem();

    IPermissionCollectionRequestBuilder permissions();

    IPermissionRequestBuilder permissions(final String id);

    IThumbnailSetCollectionRequestBuilder thumbnails();

    IThumbnailSetRequestBuilder thumbnails(final String id);

    IDriveItemVersionCollectionRequestBuilder versions();

    IDriveItemVersionRequestBuilder versions(final String id);

    /**
     * Gets the request builder for Workbook
     *
     * @return the IWorkbookRequestBuilder instance
     */
    IWorkbookRequestBuilder workbook();

    IDriveItemStreamRequestBuilder content();
    IDriveItemCopyRequestBuilder copy(final String name, final ItemReference parentReference);
    IDriveItemCreateLinkRequestBuilder createLink(final String type, final String scope);
    IDriveItemCreateUploadSessionRequestBuilder createUploadSession(final DriveItemUploadableProperties item);

    IDriveItemInviteCollectionRequestBuilder invite(final Boolean requireSignIn, final java.util.List<String> roles, final Boolean sendInvitation, final String message, final java.util.List<DriveRecipient> recipients);
    IDriveItemPreviewRequestBuilder preview(final String page, final Double zoom);

    IDriveItemDeltaCollectionRequestBuilder delta(final String token);

    IDriveItemDeltaCollectionRequestBuilder delta();

    IDriveItemSearchCollectionRequestBuilder search(final String q);

}
