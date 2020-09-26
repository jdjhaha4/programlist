package com.jdjhaha.program.list.management.factory;

public class Tank extends Mechanic {
	
	private boolean seizeMode;
	
	@Override
	void repair() {
		
	}
	
	public Tank(String name, int hp) {
		super(name, hp);
	}
	
	public boolean isSeizeMode() {
		return seizeMode;
	}

	public void setSeizeMode(boolean seizeMode) {
		this.seizeMode = seizeMode;
	}

	@Override
	public String toString() {
		return "name: "+this.getName()+", HP: "+this.getHp();
	}
	
	
}
