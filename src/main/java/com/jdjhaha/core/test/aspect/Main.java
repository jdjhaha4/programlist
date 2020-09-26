package com.jdjhaha.core.test.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AspectTestConfiguration.class);
		TestPojo testPojo = context.getBean(TestPojo.class);
		testPojo.doSomeThing();
	}

}
