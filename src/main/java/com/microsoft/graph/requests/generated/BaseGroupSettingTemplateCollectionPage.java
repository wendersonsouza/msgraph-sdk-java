// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.GroupSettingTemplate;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group Setting Template Collection Page.
 */
public class BaseGroupSettingTemplateCollectionPage extends BaseCollectionPage<GroupSettingTemplate, IGroupSettingTemplateCollectionRequestBuilder> implements IBaseGroupSettingTemplateCollectionPage {

    /**
     * A collection page for GroupSettingTemplate
     *
     * @param response the serialized BaseGroupSettingTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseGroupSettingTemplateCollectionPage(final BaseGroupSettingTemplateCollectionResponse response, final IGroupSettingTemplateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
