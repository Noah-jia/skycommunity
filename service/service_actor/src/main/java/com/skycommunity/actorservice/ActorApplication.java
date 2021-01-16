package com.skycommunity.actorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = "com.skycommunity")
@EnableSwagger2
public class ActorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActorApplication.class, args);
    }
}
