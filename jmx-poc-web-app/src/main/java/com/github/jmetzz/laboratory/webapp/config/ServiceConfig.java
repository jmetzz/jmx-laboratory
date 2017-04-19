package com.github.jmetzz.laboratory.webapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.github.jmetzz.laboratory.jmx.service")
public class ServiceConfig {
}
