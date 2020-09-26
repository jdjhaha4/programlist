package com.jdjhaha.program.list.management.config;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.jdjhaha.program.list.management.BannerLoader;
import com.jdjhaha.program.list.management.ProgramManager;
import com.jdjhaha.program.list.management.logger.MyConsoleLogger;
import com.jdjhaha.program.list.management.logger.MyLogger;
import com.jdjhaha.program.list.management.testcom.MessageTestComponent;
import com.jdjhaha.program.list.management.testcom.TestComponent;

@Configuration
@PropertySource("classpath:program_manager.properties")
public class ProgramManagementConfig {
	
	@Value("${logpath:C:/Users}")
	private String logPath;
	
//	@Value("classpath:banner.txt")
	/*
	 * @Value("file:E:/banner.txt") private Resource banner;
	 */
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:messages");
		messageSource.setCacheSeconds(1);
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	@Bean
	public Resource fileSystemResource() {
		Resource fileSystemResource = new FileSystemResource("E:/banner.txt");
		return fileSystemResource;
	}
	
	@Bean
	public Resource UrlResource() {
		
		Resource urlResource = null;
		
		try {
			urlResource = new org.springframework.core.io.UrlResource("https://www.naver.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return urlResource;
	}
	
	@Bean
	public BannerLoader bannerLoader() {
		BannerLoader bl = new BannerLoader();
		bl.setBanner(fileSystemResource());
		//bl.setBanner(UrlResource());
		return bl;
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
	
	@Bean
	@Lazy
	public TestComponent testComponent() {
		TestComponent testComponent = new TestComponent();
		return testComponent;
	}
	
	@Bean
	public MessageTestComponent messageTestComponent() {
		MessageTestComponent messageTestComponent = new MessageTestComponent();
		return messageTestComponent;
	}
}
