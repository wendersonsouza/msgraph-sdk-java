// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IEnrollmentConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Enrollment Configuration Assignment Collection Page.
 */
public class BaseEnrollmentConfigurationAssignmentCollectionPage extends BaseCollectionPage<EnrollmentConfigurationAssignment, IEnrollmentConfigurationAssignmentCollectionRequestBuilder> implements IBaseEnrollmentConfigurationAssignmentCollectionPage {

    /**
     * A collection page for EnrollmentConfigurationAssignment
     *
     * @param response the serialized BaseEnrollmentConfigurationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseEnrollmentConfigurationAssignmentCollectionPage(final BaseEnrollmentConfigurationAssignmentCollectionResponse response, final IEnrollmentConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
