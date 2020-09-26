package com.jdjhaha.program.list.management.dependson;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("testB")
public class TestA {
	public void testA() {
		System.out.println("TestC 는 TestA 기능이 필요하지!");
	}
	
	@PostConstruct
	public void testAInit() {
		System.out.println("testA 초기화 됨");
	}
}
