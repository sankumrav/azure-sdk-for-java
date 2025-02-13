// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.orbital.fluent.models.AvailableGroundStationInner;
import com.azure.resourcemanager.orbital.models.CapabilityParameter;

/** An instance of this class provides access to all the operations defined in AvailableGroundStationsClient. */
public interface AvailableGroundStationsClient {
    /**
     * Returns list of available ground stations.
     *
     * @param capability Ground Station Capability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the AvailableGroundStations API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailableGroundStationInner> list(CapabilityParameter capability);

    /**
     * Returns list of available ground stations.
     *
     * @param capability Ground Station Capability.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the AvailableGroundStations API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailableGroundStationInner> list(CapabilityParameter capability, Context context);

    /**
     * Gets the specified available ground station.
     *
     * @param groundStationName Ground Station name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified available ground station.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailableGroundStationInner get(String groundStationName);

    /**
     * Gets the specified available ground station.
     *
     * @param groundStationName Ground Station name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified available ground station along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvailableGroundStationInner> getWithResponse(String groundStationName, Context context);
}
