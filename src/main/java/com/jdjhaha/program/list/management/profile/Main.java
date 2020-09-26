package com.jdjhaha.program.list.management.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext();
		 * context.getEnvironment().setActiveProfiles("dev");
		 * context.scan("com.jdjhaha.program.list.management.profile");
		 * context.refresh();
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.jdjhaha.program.list.management.profile");
	}
}
