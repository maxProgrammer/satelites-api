package com.maxprogramer.api.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SateliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SateliteApplication.class, args);
    }



}
