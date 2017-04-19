package com.github.jmetzz.laboratory.webapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "com.github.jmetzz.laboratory.jmx.webapp.controller")
@EnableWebMvc
@EnableAspectJAutoProxy
public class ControllerConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private Environment environment;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
				.addResourceLocations("classpath:/static/")
				.resourceChain(isProductionEnvironment());
	}

	private Boolean isProductionEnvironment() {
		return Boolean.valueOf(environment.getProperty("production", "false"));
	}

}
