package com.jdjhaha.program.list.management.factory;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class MechanicFactoryBean extends AbstractFactoryBean<Mechanic> {
	
	private String mechnicName;

	public void setMechnicName(String mechnicName) {
		this.mechnicName = mechnicName;
	}

	@Override
	public Class<?> getObjectType() {
		return Mechanic.class;
	}

	@Override
	protected Mechanic createInstance() throws Exception {
		if("tank".equals(mechnicName)) {
			return new Tank(mechnicName, 150);
		} else if("vulture".equals(mechnicName)) {
			Vulture vulture = new Vulture(mechnicName, 100);
			vulture.setNumberOfMines(3);
			vulture.setSpeedUp(true);
			return vulture;
		}
		throw new IllegalArgumentException("Unknown mechanic");
	}
	
}
