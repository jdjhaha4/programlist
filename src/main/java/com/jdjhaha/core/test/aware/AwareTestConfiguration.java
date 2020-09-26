package com.jdjhaha.core.test.aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwareTestConfiguration {
	
	@Bean(initMethod="init",destroyMethod ="destroy")
	public TestPojo myTestPojo() {
		TestPojo testPojo = new TestPojo();
		return testPojo;
	}
	
	@Bean
	public TestPojoPostProcessor testPojoPostProcessor() {
		return new TestPojoPostProcessor();
	}
}
