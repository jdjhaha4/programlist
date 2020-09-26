package com.jdjhaha.program.list.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdjhaha.program.list.management.factory.MechanicFactoryBean;

@Configuration
public class FactoryConfiguration3 {
	
	@Bean
	public MechanicFactoryBean tank() {
		MechanicFactoryBean factory = new MechanicFactoryBean();
		factory.setMechnicName("tank");
		return factory;
	}
	
	@Bean
	public MechanicFactoryBean vulture() {
		MechanicFactoryBean factory = new MechanicFactoryBean();
		factory.setMechnicName("vulture");
		return factory;
	}
}
