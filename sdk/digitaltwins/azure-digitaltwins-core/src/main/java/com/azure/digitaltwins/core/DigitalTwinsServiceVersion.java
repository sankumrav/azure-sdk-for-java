// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core;

import com.azure.core.util.ServiceVersion;

/**
 * The service API versions of Azure Digital Twins that are supported by this client.
 */
public enum DigitalTwinsServiceVersion implements ServiceVersion {
    /**
     * Service version {@code 2020-10-31}.
     */
    V2020_10_31("2020-10-31"),

    /**
     * Service version {@code 2022-05-31}.
     */
    V2022_05_31("2022-05-31"),

    /**
     * Service version {@code 2023-02-27-preview}.
     */
    V2023_02_27_Preview("2023-02-27-preview");

    private final String version;

    DigitalTwinsServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service API version of Azure Digital Twins that is supported by this client.
     * @return The latest service API version of Azure Digital Twins that is supported by this client.
     */
    public static DigitalTwinsServiceVersion getLatest() {
        return V2023_02_27_Preview;
    }
}
