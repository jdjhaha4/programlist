package com.jdjhaha.program.list.management.beanpostprocessor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class TestC {
	
	private String myName;
	
	public void testC() {
		System.out.println("testC() 함수 실행!");
		System.out.println("My name is "+myName);
	}
	
	@PostConstruct
	public void testCInit() {
		System.out.println("testC 초기화 됨");
	}

	@Required
	public void setMyName(String myName) {
		this.myName = myName;
	}
}
