package com.jdjhaha.program.list.management.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.startsWith("test")) {
			System.out.println(beanName+" 빈 초기화 콜백 함수 호출 직전 호출 함수");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.startsWith("test")) {
			System.out.println(beanName+" 빈 초기화 콜백 함수 호출 직후 호출 함수");
		}
		return bean;
	}
	
}
