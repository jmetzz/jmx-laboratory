package com.github.jmetzz.laboratory.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

import com.github.jmetzz.laboratory.helpers.AServiceClass;

/**
 * Created by jean on 16/03/2017.
 */
@Configuration
@ComponentScan(basePackages = "com.github.jmetzz.laboratory")
public class JMXConfig {

	@Autowired
	private AServiceClass aService;

	@Bean
	public MBeanExporter mBeanExporter() {
		MBeanExporter mBeanExporter = new MBeanExporter();
		mBeanExporter.setAllowEagerInit(false);
		mBeanExporter.setAutodetect(true);
		Map<String, Object> beansMap = new HashMap<>();
		beansMap.put("bean:name=service1", aService);
		mBeanExporter.setBeans(beansMap);

		return mBeanExporter;
	}
}
