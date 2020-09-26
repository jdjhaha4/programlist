package com.jdjhaha.core.test.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestPojoPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.startsWith("myTestPojo")) {
			System.out.println("BeanPostProcessor postProcessBeforeInitialization() 실행됨");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.startsWith("myTestPojo")) {
			System.out.println("BeanPostProcessor postProcessAfterInitialization");
		}
		return bean;
	}
	
}
