package com.anywhere.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("beans.xml")
public class SimpleServiceConfiguration {

    /**
     * Spring App entrypoint
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SimpleServiceConfiguration.class, args);
    }

}
