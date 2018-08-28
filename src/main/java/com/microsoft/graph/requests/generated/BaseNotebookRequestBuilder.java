// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.INotebookRequest;
import com.microsoft.graph.requests.extensions.NotebookRequest;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookCopyNotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookCopyNotebookRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Notebook Request Builder.
 */
public class BaseNotebookRequestBuilder extends BaseRequestBuilder implements IBaseNotebookRequestBuilder {

    /**
     * The request builder for the Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseNotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the INotebookRequest instance
     */
    public INotebookRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the INotebookRequest instance
     */
    public INotebookRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new NotebookRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOnenoteSectionCollectionRequestBuilder sections() {
        return new OnenoteSectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections"), getClient(), null);
    }

    public IOnenoteSectionRequestBuilder sections(final String id) {
        return new OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections") + "/" + id, getClient(), null);
    }
    public ISectionGroupCollectionRequestBuilder sectionGroups() {
        return new SectionGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups"), getClient(), null);
    }

    public ISectionGroupRequestBuilder sectionGroups(final String id) {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups") + "/" + id, getClient(), null);
    }

    public INotebookCopyNotebookRequestBuilder copyNotebook(final String groupId, final String renameAs, final String notebookFolder, final String siteCollectionId, final String siteId) {
        return new NotebookCopyNotebookRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyNotebook"), getClient(), null, groupId, renameAs, notebookFolder, siteCollectionId, siteId);
    }
}

