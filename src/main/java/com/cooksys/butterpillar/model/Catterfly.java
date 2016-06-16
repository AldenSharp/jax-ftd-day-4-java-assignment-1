package com.cooksys.butterpillar.model;

public class Catterfly {
	
	// any instance fields should be private

	public double getWingspan() {
		return 0; // to be implemented
	}

	public void setWingspan(double wingspan) {
		// to be implemented
	}

	public double getWeight() {
		return 0; // TODO: to be implemented
	}

	public void setWeight(double weight) {
		// TODO: to be implemented
	}
	
	public boolean equals(Catterfly c) {
		return false; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}
