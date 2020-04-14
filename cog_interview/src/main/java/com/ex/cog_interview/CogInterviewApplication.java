package com.ex.cog_interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CogInterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(CogInterviewApplication.class, args);
    }

}
