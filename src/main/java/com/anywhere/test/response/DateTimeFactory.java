package com.anywhere.test.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Date;

@Component
class DateTimeFactory {

    private DateFormat format;

    @Autowired
    public DateTimeFactory(DateFormat format) {
        this.format = format;
    }

    DateTime create(Date date) {
        return new DateTime(format.format(date), date.getTime());
    }
}
