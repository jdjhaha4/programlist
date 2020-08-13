package com.jdjhaha.program.list.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jdjhaha.program.list.management.logger.MyConsoleLogger;
import com.jdjhaha.program.list.management.logger.MyLogger;

@Configuration
@ComponentScan(value="com.jdjhaha.program.list.management")
public class ProgramManagementConfig {
	
	@Bean
	public MyLogger multiLineLogger() {
		MyLogger logger = new MyConsoleLogger(true);
		return logger;
	}
	
	@Bean
	public MyLogger singleLineLogger() {
		MyLogger logger = new MyConsoleLogger(false);
		return logger;
	}
}
