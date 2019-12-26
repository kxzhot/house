package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {GsonAutoConfiguration.class})
@EnableEurekaClient
public class SpringbootHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHouseApplication.class, args);
    }

}
