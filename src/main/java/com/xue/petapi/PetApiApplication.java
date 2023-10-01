package com.xue.petapi;

import com.xue.petapi.service.DogService;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.xue.petapi.model.Dog;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PetApiApplication{
    public static Logger logger = LoggerFactory.getLogger(PetApiApplication.class);

    @PostConstruct
    public void intt() {
        logger.info("Application started...");
    }


    public static void main(String[] args) {
        logger.info("Application executed...");
        SpringApplication.run(PetApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        DogService dogService1 = ctx.getBean(DogService.class);
        List<Dog> dogs = dogService1.getAllJobInfo();
        System.out.println("------");
        dogs.forEach(a -> System.out.println(a.toString()));
        System.out.println("------");
        return null;
    }
}
