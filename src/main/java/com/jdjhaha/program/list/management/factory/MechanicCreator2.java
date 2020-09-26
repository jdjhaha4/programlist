package com.jdjhaha.program.list.management.factory;

import java.util.Map;

public class MechanicCreator2 {
	
	private Map<String,Mechanic> mechanics;
	
	public void setMechanics(Map<String, Mechanic> mechanics) {
		this.mechanics = mechanics;
	}

	public Mechanic createMechanic(String name) {
		Mechanic mechanic = mechanics.get(name);
		if(mechanic != null) {
			return mechanic;
		}
		throw new IllegalArgumentException("Unknown mechanic");
	}
}
