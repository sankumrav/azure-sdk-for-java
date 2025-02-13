// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.models.TransparentDataEncryptionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the properties of a database transparent data encryption. */
@Fluent
public final class TransparentDataEncryptionProperties {
    /*
     * The status of the database transparent data encryption.
     */
    @JsonProperty(value = "status")
    private TransparentDataEncryptionStatus status;

    /**
     * Get the status property: The status of the database transparent data encryption.
     *
     * @return the status value.
     */
    public TransparentDataEncryptionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the database transparent data encryption.
     *
     * @param status the status value to set.
     * @return the TransparentDataEncryptionProperties object itself.
     */
    public TransparentDataEncryptionProperties withStatus(TransparentDataEncryptionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
