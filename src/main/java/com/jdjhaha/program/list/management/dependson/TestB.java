package com.jdjhaha.program.list.management.dependson;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class TestB {
	public void testB() {
		System.out.println("TestC 는 TestB 기능도 필요하지!");
	}
	
	@PostConstruct
	public void testAInit() {
		System.out.println("testB 초기화 됨");
	}
}
