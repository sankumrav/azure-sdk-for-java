// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionContainerResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of ProtectionContainer resources. */
@Fluent
public final class ProtectionContainerResourceList extends ResourceList {
    /*
     * List of resources.
     */
    @JsonProperty(value = "value")
    private List<ProtectionContainerResourceInner> value;

    /** Creates an instance of ProtectionContainerResourceList class. */
    public ProtectionContainerResourceList() {
    }

    /**
     * Get the value property: List of resources.
     *
     * @return the value value.
     */
    public List<ProtectionContainerResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     *
     * @param value the value value to set.
     * @return the ProtectionContainerResourceList object itself.
     */
    public ProtectionContainerResourceList withValue(List<ProtectionContainerResourceInner> value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectionContainerResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
