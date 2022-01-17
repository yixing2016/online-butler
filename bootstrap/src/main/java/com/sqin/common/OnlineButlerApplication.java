package com.sqin.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Spring boot:
 * EntityScan: customize entity scanning locations
 */
@SpringBootApplication
@EntityScan("com.sqin.entity")
public class OnlineButlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineButlerApplication.class, args);
    }

}
