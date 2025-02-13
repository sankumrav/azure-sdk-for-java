// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ServiceEndpointPolicyDefinitions Get. */
public final class ServiceEndpointPolicyDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ServiceEndpointPolicyDefinitionGet.json
     */
    /**
     * Sample code: Get service endpoint definition in service endpoint policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getServiceEndpointDefinitionInServiceEndpointPolicy(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceEndpointPolicyDefinitions()
            .getWithResponse("rg1", "testPolicy", "testDefinition", Context.NONE);
    }
}
