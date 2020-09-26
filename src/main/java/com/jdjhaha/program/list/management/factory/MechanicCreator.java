package com.jdjhaha.program.list.management.factory;

public class MechanicCreator {
	
	public static Mechanic createMechanic(String name) {
		if("tank".equals(name)) {
			return new Tank(name, 150);
		} else if("vulture".equals(name)) {
			Vulture vulture = new Vulture(name, 100);
			vulture.setNumberOfMines(3);
			vulture.setSpeedUp(true);
			return vulture;
		}
		throw new IllegalArgumentException("Unknown mechanic");
	}
}
