package com.skycommunity.actorservice.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.skycommunity.actorservice.mapper")
public class MabitisConfig {
}
