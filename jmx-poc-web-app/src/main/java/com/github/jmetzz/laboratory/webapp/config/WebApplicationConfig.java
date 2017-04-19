package com.github.jmetzz.laboratory.webapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.github.jmetzz.laboratory.webapp.support.WebAppHeaderInterceptor;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Import({ServiceConfig.class, ControllerConfig.class })
@ComponentScan(basePackages = { "com.github.jmetzz.laboratory.webapp.support" })
@PropertySource(
		value = {
				"classpath:application.properties",
				"classpath:application-${env}.properties"
		},
		ignoreResourceNotFound = true)
public class WebApplicationConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private WebAppHeaderInterceptor webAppHeaderInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(webAppHeaderInterceptor).addPathPatterns("/salesOrder/**").addPathPatterns("/security/**");
	}

}
