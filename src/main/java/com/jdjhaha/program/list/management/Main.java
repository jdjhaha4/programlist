package com.jdjhaha.program.list.management;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdjhaha.program.list.management.config.FactoryConfiguration3;
import com.jdjhaha.program.list.management.factory.Mechanic;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryConfiguration3.class);
		
		Mechanic tank = context.getBean("tank", Mechanic.class);
		Mechanic vulture = context.getBean("vulture", Mechanic.class);
		
		System.out.println(tank);
		System.out.println(vulture);
	}

}
