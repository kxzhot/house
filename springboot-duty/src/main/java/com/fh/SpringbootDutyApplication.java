package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootDutyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDutyApplication.class, args);
    }

}
