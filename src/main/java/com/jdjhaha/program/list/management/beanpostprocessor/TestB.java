package com.jdjhaha.program.list.management.beanpostprocessor;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class TestB {
	public void testB() {
		System.out.println("testB() 함수 실행!");
	}
	
	@PostConstruct
	public void testAInit() {
		System.out.println("testB 초기화 됨");
	}
}
