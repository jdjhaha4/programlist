package com.jdjhaha.program.list.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdjhaha.program.list.management.factory.Mechanic;
import com.jdjhaha.program.list.management.factory.MechanicCreator;

@Configuration
public class FactoryConfiguration {
	
	@Bean
	public Mechanic tank() {
		return MechanicCreator.createMechanic("tank");
	}
	
	@Bean
	public Mechanic vulture() {
		return MechanicCreator.createMechanic("vulture");
	}
}
