package com.jdjhaha.program.list.management.dependson;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"testA","testB"})
public class TestC {
	
	@Autowired
	TestA testA;
	
	@Autowired
	TestB testB;
	
	public void testC() {
		testA.testA();
		testB.testB();
		System.out.println("나는 TestC 입니다!");
	}
	
	@PostConstruct
	public void testCInit() {
		System.out.println("testC 초기화 됨");
	}
}
