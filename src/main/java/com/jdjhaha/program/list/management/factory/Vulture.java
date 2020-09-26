package com.jdjhaha.program.list.management.factory;

public class Vulture extends Mechanic {
	
	private int numberOfMines;
	private boolean speedUp;
	
	@Override
	void repair() {

	}
	
	public Vulture(String name, int hp) {
		super(name, hp);
	}

	public int getNumberOfMines() {
		return numberOfMines;
	}

	public void setNumberOfMines(int numberOfMines) {
		this.numberOfMines = numberOfMines;
	}

	public boolean isSpeedUp() {
		return speedUp;
	}

	public void setSpeedUp(boolean speedUp) {
		this.speedUp = speedUp;
	}
	
	@Override
	public String toString() {
		return "name: "+this.getName()+", HP: "+this.getHp()+", number of mines: "+this.getNumberOfMines();
	}
}
