package com.cooksys.butterpillar.model;

public class Butterpillar {
	
	// any instance fields should be private

	public double getLength() {
		return 0; // TODO: to be implemented
	}

	public void setLength(double length) {
		// TODO: to be implemented
	}

	public double getLeavesEaten() {
		return 0; // TODO: to be implemented
	}

	public void setLeavesEaten(double leavesEaten) {
		// TODO: to be implemented
	}
	
	public boolean equals(Butterpillar b) {
		return false; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}
