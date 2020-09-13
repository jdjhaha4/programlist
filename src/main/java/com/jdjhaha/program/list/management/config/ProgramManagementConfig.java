package com.jdjhaha.program.list.management.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.jdjhaha.program.list.management.ProgramManager;
import com.jdjhaha.program.list.management.logger.MyConsoleLogger;
import com.jdjhaha.program.list.management.logger.MyLogger;

@Configuration
@PropertySource("classpath:program_manager.properties")
public class ProgramManagementConfig {
	
	@Value("${logpath:C:/Users}")
	private String logPath;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	@Scope("prototype")
	public ProgramManager programManager() {
		return new ProgramManager();
	}
	
	@Bean
	public MyLogger multiLineLogger() {
		MyLogger logger = new MyConsoleLogger(true);
		logger.setLogPath(logPath);
		return logger;
	}
	
	@Bean
	public MyLogger singleLineLogger() {
		MyLogger logger = new MyConsoleLogger(false);
		logger.setLogPath(logPath);
		return logger;
	}
}
