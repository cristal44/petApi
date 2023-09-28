package com.xue.petapi;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetApiApplication {

    public static Logger logger = LoggerFactory.getLogger(PetApiApplication.class);

    @PostConstruct
    public void intt() {
        logger.info("Application started...");
    }


    public static void main(String[] args) {
        logger.info("Application executed...");
        SpringApplication.run(PetApiApplication.class, args);
    }

}
