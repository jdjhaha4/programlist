package com.jdjhaha.program.list.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.jdjhaha.program.list.management.ProgramManager;
import com.jdjhaha.program.list.management.logger.MyConsoleLogger;
import com.jdjhaha.program.list.management.logger.MyLogger;

@Configuration
public class ProgramManagementConfig {
	
	@Bean
	public ProgramManager programManager() {
		return new ProgramManager();
	}
	
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
