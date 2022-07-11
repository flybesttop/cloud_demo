package com.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSvcApplication.class, args);
    }

}
