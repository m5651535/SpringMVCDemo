package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.controllers")
public class AppConfig {
    // 其他配置和Bean定义
}
