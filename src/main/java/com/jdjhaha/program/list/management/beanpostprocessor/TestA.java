package com.jdjhaha.program.list.management.beanpostprocessor;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class TestA {
	public void testA() {
		System.out.println("testA() 함수 실행!");
	}
	
	@PostConstruct
	public void testAInit() {
		System.out.println("testA 초기화 됨");
	}
}
