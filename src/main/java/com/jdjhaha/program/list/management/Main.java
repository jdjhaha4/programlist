package com.jdjhaha.program.list.management;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdjhaha.program.list.management.config.ProgramManagementConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProgramManagementConfig.class);
		
		ProgramManager programManager = context.getBean(ProgramManager.class);
//		ProgramManager programManager = (ProgramManager) context.getBean("programManager");
//		ProgramManager programManager = (ProgramManager) context.getBean("programManager",ProgramManager.class);
		
		ProgramVO programVO = programManager.getProgram(1);
		System.out.println(programVO);
	}

}
