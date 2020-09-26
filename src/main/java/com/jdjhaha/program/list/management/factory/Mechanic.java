package com.jdjhaha.program.list.management.factory;

public abstract class Mechanic {

	private String name;
	private int hp;

	abstract void repair();

	public Mechanic() {
	}

	public Mechanic(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
