package com.producer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerApplication {
    public static void main(String[] args) {
        System.setProperty("user.timezone", "Asia/Shanghai");
        SpringApplication.run(ProducerApplication.class, args);
    }
}
