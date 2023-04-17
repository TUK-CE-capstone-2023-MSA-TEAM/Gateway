package com.example.chieegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ChieegatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChieegatewayApplication.class, args);
    }

}
