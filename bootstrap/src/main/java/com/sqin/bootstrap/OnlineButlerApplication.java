package com.sqin.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring boot:
 * EntityScan: customize entity scanning locations
 */
@SpringBootApplication
@EntityScan("com.sqin.entity")
@ComponentScan("com.sqin.*")
public class OnlineButlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineButlerApplication.class, args);
    }

}
