package com.github.jmetzz.laboratory.jmx.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.export.MBeanExporter;

import com.github.jmetzz.laboratory.jmx.service.AServiceClass;

@Configuration
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
