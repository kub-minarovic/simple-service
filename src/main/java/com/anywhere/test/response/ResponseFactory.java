package com.anywhere.test.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ResponseFactory {

    @Autowired
    private DateTimeFactory dateTimeFactory;

    /**
     * Create response
     *
     * @param original origin string from request
     * @param date     current datetime
     * @return the response
     */
    public SimpleResponse create(String original, Date date) {
        String revert = new StringBuilder(original).reverse().toString();
        return new SimpleResponse(original, revert, dateTimeFactory.create(date));
    }
}
