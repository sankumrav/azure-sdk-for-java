// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The definition of a forecast. */
@Fluent
public final class ForecastDefinition {
    /*
     * The type of the forecast.
     */
    @JsonProperty(value = "type", required = true)
    private ForecastType type;

    /*
     * The time frame for pulling data for the forecast. If custom, then a specific time period must be provided.
     */
    @JsonProperty(value = "timeframe", required = true)
    private ForecastTimeframeType timeframe;

    /*
     * Has time period for pulling data for the forecast.
     */
    @JsonProperty(value = "timePeriod")
    private QueryTimePeriod timePeriod;

    /*
     * Has definition for data in this forecast.
     */
    @JsonProperty(value = "dataset", required = true)
    private ForecastDataset dataset;

    /*
     * a boolean determining if actualCost will be included
     */
    @JsonProperty(value = "includeActualCost")
    private Boolean includeActualCost;

    /*
     * a boolean determining if FreshPartialCost will be included
     */
    @JsonProperty(value = "includeFreshPartialCost")
    private Boolean includeFreshPartialCost;

    /** Creates an instance of ForecastDefinition class. */
    public ForecastDefinition() {
    }

    /**
     * Get the type property: The type of the forecast.
     *
     * @return the type value.
     */
    public ForecastType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the forecast.
     *
     * @param type the type value to set.
     * @return the ForecastDefinition object itself.
     */
    public ForecastDefinition withType(ForecastType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the timeframe property: The time frame for pulling data for the forecast. If custom, then a specific time
     * period must be provided.
     *
     * @return the timeframe value.
     */
    public ForecastTimeframeType timeframe() {
        return this.timeframe;
    }

    /**
     * Set the timeframe property: The time frame for pulling data for the forecast. If custom, then a specific time
     * period must be provided.
     *
     * @param timeframe the timeframe value to set.
     * @return the ForecastDefinition object itself.
     */
    public ForecastDefinition withTimeframe(ForecastTimeframeType timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    /**
     * Get the timePeriod property: Has time period for pulling data for the forecast.
     *
     * @return the timePeriod value.
     */
    public QueryTimePeriod timePeriod() {
        return this.timePeriod;
    }

    /**
     * Set the timePeriod property: Has time period for pulling data for the forecast.
     *
     * @param timePeriod the timePeriod value to set.
     * @return the ForecastDefinition object itself.
     */
    public ForecastDefinition withTimePeriod(QueryTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get the dataset property: Has definition for data in this forecast.
     *
     * @return the dataset value.
     */
    public ForecastDataset dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Has definition for data in this forecast.
     *
     * @param dataset the dataset value to set.
     * @return the ForecastDefinition object itself.
     */
    public ForecastDefinition withDataset(ForecastDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the includeActualCost property: a boolean determining if actualCost will be included.
     *
     * @return the includeActualCost value.
     */
    public Boolean includeActualCost() {
        return this.includeActualCost;
    }

    /**
     * Set the includeActualCost property: a boolean determining if actualCost will be included.
     *
     * @param includeActualCost the includeActualCost value to set.
     * @return the ForecastDefinition object itself.
     */
    public ForecastDefinition withIncludeActualCost(Boolean includeActualCost) {
        this.includeActualCost = includeActualCost;
        return this;
    }

    /**
     * Get the includeFreshPartialCost property: a boolean determining if FreshPartialCost will be included.
     *
     * @return the includeFreshPartialCost value.
     */
    public Boolean includeFreshPartialCost() {
        return this.includeFreshPartialCost;
    }

    /**
     * Set the includeFreshPartialCost property: a boolean determining if FreshPartialCost will be included.
     *
     * @param includeFreshPartialCost the includeFreshPartialCost value to set.
     * @return the ForecastDefinition object itself.
     */
    public ForecastDefinition withIncludeFreshPartialCost(Boolean includeFreshPartialCost) {
        this.includeFreshPartialCost = includeFreshPartialCost;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ForecastDefinition"));
        }
        if (timeframe() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeframe in model ForecastDefinition"));
        }
        if (timePeriod() != null) {
            timePeriod().validate();
        }
        if (dataset() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataset in model ForecastDefinition"));
        } else {
            dataset().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ForecastDefinition.class);
}
