// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

/** Samples for Monitors Delete. */
public final class MonitorsDeleteSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/preview/2022-11-01-preview/examples/workloadmonitor/monitors_Delete.json
     */
    /**
     * Sample code: Deletes a SAP monitor.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void deletesASAPMonitor(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.monitors().delete("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
