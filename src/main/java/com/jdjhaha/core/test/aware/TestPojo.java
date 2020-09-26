package com.jdjhaha.core.test.aware;

import org.springframework.beans.factory.BeanNameAware;

public class TestPojo implements BeanNameAware{
	
	String myName;
	
	public void doSomeThing() {
		System.out.println("나는 스프링 IoC 컨테이너에 "+myName+"으로 등록된 빈 입니다");
	}
	
	public void init() {
		System.out.println("빈 초기화 직후 콜백 메서드 실행 시점");
	}
	
	public void destroy() {
		System.out.println("빈 폐기 직전 콜백 메서드 실행 시점");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Aware 인터페이스 세터메서드 호출 시점");
		System.out.println("TestPojo 빈의 이름 : "+name);
		myName = name;
	}
}
