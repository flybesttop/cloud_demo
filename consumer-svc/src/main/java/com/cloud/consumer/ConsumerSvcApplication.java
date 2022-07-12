package com.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cloud.consumer.client"})
public class ConsumerSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSvcApplication.class, args);
    }

}
