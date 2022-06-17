package com.liuyong.serviceprovide02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProvide02Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvide02Application.class, args);
    }

}
