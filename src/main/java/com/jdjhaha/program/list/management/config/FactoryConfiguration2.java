package com.jdjhaha.program.list.management.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdjhaha.program.list.management.factory.Mechanic;
import com.jdjhaha.program.list.management.factory.MechanicCreator2;
import com.jdjhaha.program.list.management.factory.Tank;
import com.jdjhaha.program.list.management.factory.Vulture;

@Configuration
public class FactoryConfiguration2 {
	
	@Bean
	public MechanicCreator2 mechanicCreatorFactory() {
		MechanicCreator2 factory = new MechanicCreator2();
		Map<String, Mechanic> mechanics = new HashMap<>();
		
		mechanics.put("tank", new Tank("tank", 150));
		
		Vulture vulture = new Vulture("vulture", 100);
		vulture.setNumberOfMines(3);
		vulture.setSpeedUp(true);
		mechanics.put("vulture", new Tank("vulture", 150));
		factory.setMechanics(mechanics);
		return factory;
	}
	
	@Bean
	public Mechanic tank() {
		return mechanicCreatorFactory().createMechanic("tank");
	}
	
	@Bean
	public Mechanic vulture() {
		return mechanicCreatorFactory().createMechanic("vulture");
	}
}
