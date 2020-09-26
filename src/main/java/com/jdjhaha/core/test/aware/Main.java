package com.jdjhaha.core.test.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareTestConfiguration.class);
		
		TestPojo testPojo = context.getBean(TestPojo.class);
		testPojo.doSomeThing();
		
		context.close();
	}
}
