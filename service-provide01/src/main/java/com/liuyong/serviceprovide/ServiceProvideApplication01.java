package com.liuyong.serviceprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProvideApplication01 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvideApplication01.class, args);
    }

}
