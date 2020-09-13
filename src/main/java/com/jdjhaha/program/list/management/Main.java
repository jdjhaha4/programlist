package com.jdjhaha.program.list.management;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdjhaha.program.list.management.config.ProgramManagementConfig;
import com.jdjhaha.program.list.management.logger.MyLogger;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProgramManagementConfig.class);
		
		MyLogger multiLineLogger = context.getBean("multiLineLogger", MyLogger.class);
		System.out.println(multiLineLogger.getLogPath());
		
	}

}
