package com.anywhere.test.response;

import com.fasterxml.jackson.annotation.JsonProperty;

class DateTime {

    @JsonProperty("ISO")
    private String iso;

    @JsonProperty("epoch")
    private long epoch;

    /**
     * Simple constructor
     *
     * @param iso   ISO-formatted date string
     * @param epoch number of millis from Unix epoch
     */
    DateTime(String iso, long epoch) {
        this.iso = iso;
        this.epoch = epoch;
    }

    /**
     * Get ISO-formatted date string
     *
     * @return date string
     */
    public String getIso() {
        return iso;
    }

    /**
     * Get number of millis from Unix epoch
     *
     * @return millis
     */
    public long getEpoch() {
        return epoch;
    }
}
