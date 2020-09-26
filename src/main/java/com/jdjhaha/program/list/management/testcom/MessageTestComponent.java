package com.jdjhaha.program.list.management.testcom;

import java.util.Locale;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class MessageTestComponent {
	@Autowired
	MessageSource messageSource;
	
	public void printMessage() {
		String hello = messageSource.getMessage("hello", null, Locale.KOREA);
		String hello_args = messageSource.getMessage("hello.args", new Object[] {"Hyeon Woo", "Dong Jin"}, Locale.KOREA);
		
		System.out.println(hello);
		System.out.println(hello_args);
	}
	
//	@PostConstruct
	public void initCheck() {
		System.out.println("initCheck() 함수 실행 됨");
	}
}
