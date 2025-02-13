// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

// This class exists so that the public APIs don't directly consume a generated type and so that we can avoid exposing a validate() method
// that the generated type comes with when client side validation is enabled.

/**
 * The EventRoute model. Event routes are used for defining where published telemetry gets sent to. As an example, an
 * event route can point towards an Azure EventHub as a consumer of published telemetry.
 */
@Fluent
public final class DigitalTwinsImportJob {
    /*
     * The identifier of the bulk import job.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The path to the input Azure storage blob that contains file(s)
     * describing the operations to perform in the job.
     */
    @JsonProperty(value = "inputBlobUri", required = true)
    private final String inputBlobUri;

    /*
     * The path to the output Azure storage blob that will contain the errors
     * and progress logs of import job.
     */
    @JsonProperty(value = "outputBlobUri", required = true)
    private final String outputBlobUri;

    /*
     * Status of the job.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /*
     * Start time of the job. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * Last time service performed any action from the job. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "lastActionDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastActionDateTime;

    /*
     * End time of the job. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "finishedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime finishedDateTime;

    /*
     * Time at which job will be purged by the service from the system. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "purgeDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime purgeDateTime;

    /*
     * Details of the error(s) that occurred executing the bulk job.
     */
    @JsonProperty(value = "error")
    private ErrorInformation errorInformation;

    /**
     * Creates an instance of BulkImportJob class.
     *
     * @param inputBlobUri the inputBlobUri value to set.
     * @param outputBlobUri the outputBlobUri value to set.
     */
    @JsonCreator
    public DigitalTwinsImportJob(
            @JsonProperty(value = "inputBlobUri", required = true) String inputBlobUri,
            @JsonProperty(value = "outputBlobUri", required = true) String outputBlobUri) {
        this.inputBlobUri = inputBlobUri;
        this.outputBlobUri = outputBlobUri;
    }

    /**
     * Creates an instance of BulkImportJob class.
     *
     * @param id id of the import job
     * @param inputBlobUri Input file for the import job
     * @param outputBlobUri Output file for the import job
     * @param status Status of the import job
     * @param createdDateTime Import job created time
     * @param lastActionDateTime Import Job's last update time
     * @param finishedDateTime Import job finish time
     * @param purgeDateTime Import Job Purge time
     * @param errorInformation Error details for the import job
     */
    public DigitalTwinsImportJob(String id,
                                 String inputBlobUri,
                                 String outputBlobUri,
                                 Status status,
                                 OffsetDateTime createdDateTime,
                                 OffsetDateTime lastActionDateTime,
                                 OffsetDateTime finishedDateTime,
                                 OffsetDateTime purgeDateTime,
                                 ErrorInformation errorInformation) {
        this.id = id;
        this.inputBlobUri = inputBlobUri;
        this.outputBlobUri = outputBlobUri;
        this.status = status;
        this.createdDateTime = createdDateTime;
        this.lastActionDateTime = lastActionDateTime;
        this.finishedDateTime = finishedDateTime;
        this.purgeDateTime = purgeDateTime;
        this.errorInformation = errorInformation;
    }

    /**
     * Get the id property: The identifier of the bulk import job.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the inputBlobUri property: The path to the input Azure storage blob that contains file(s) describing the
     * operations to perform in the job.
     *
     * @return the inputBlobUri value.
     */
    public String getInputBlobUri() {
        return this.inputBlobUri;
    }

    /**
     * Get the outputBlobUri property: The path to the output Azure storage blob that will contain the errors and
     * progress logs of import job.
     *
     * @return the outputBlobUri value.
     */
    public String getOutputBlobUri() {
        return this.outputBlobUri;
    }

    /**
     * Get the status property: Status of the job.
     *
     * @return the status value.
     */
    public Status getStatus() {
        return this.status;
    }

    /**
     * Get the createdDateTime property: Start time of the job. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the lastActionDateTime property: Last time service performed any action from the job. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Get the finishedDateTime property: End time of the job. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the finishedDateTime value.
     */
    public OffsetDateTime getFinishedDateTime() {
        return this.finishedDateTime;
    }

    /**
     * Get the purgeDateTime property: Time at which job will be purged by the service from the system. The timestamp is
     * in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the purgeDateTime value.
     */
    public OffsetDateTime getPurgeDateTime() {
        return this.purgeDateTime;
    }

    /**
     * Get the error property: Details of the error(s) that occurred executing the bulk job.
     *
     * @return the error value.
     */
    public ErrorInformation getError() {
        return this.errorInformation;
    }

    /**
     * Set the error property: Details of the error(s) that occurred executing the bulk job.
     *
     * @param errorInformation the error value to set.
     * @return the BulkImportJob object itself.
     */
    public DigitalTwinsImportJob setError(ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
        return this;
    }
}
