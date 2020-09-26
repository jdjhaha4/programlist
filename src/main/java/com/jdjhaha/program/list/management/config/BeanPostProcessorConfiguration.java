package com.jdjhaha.program.list.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jdjhaha.program.list.management.beanpostprocessor.TestC;

@Configuration
@ComponentScan("com.jdjhaha.program.list.management.beanpostprocessor")
public class BeanPostProcessorConfiguration {
	
	@Bean
	public TestC testC() {
		TestC testC = new TestC();
		testC.setMyName("testC");
		return testC;
	}
}
