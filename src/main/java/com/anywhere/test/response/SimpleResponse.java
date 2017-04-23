package com.anywhere.test.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleResponse {

    @JsonProperty("original")
    private String original;

    @JsonProperty("revert")
    private String reverse;

    @JsonProperty("dateTime")
    private DateTime dateTime;

    /**
     * Constructor.
     *
     * @param original original string from request
     * @param reverse  reversed string
     * @param dateTime datetime
     */
    SimpleResponse(String original, String reverse, DateTime dateTime) {
        this.original = original;
        this.reverse = reverse;
        this.dateTime = dateTime;
    }

    /**
     * Get original string from request
     *
     * @return original string
     */
    public String getOriginal() {
        return original;
    }

    /**
     * Get reversed string from request
     *
     * @return reversed string
     */
    public String getReverse() {
        return reverse;
    }

    /**
     * Get datetime
     *
     * @return current datetime
     */
    public DateTime getDateTime() {
        return dateTime;
    }
}
