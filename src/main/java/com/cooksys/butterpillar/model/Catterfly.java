package com.cooksys.butterpillar.model;

public class Catterfly {

	private double wingspan;
	private double weight;

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean equals(Catterfly c) {
		if (c.getWingspan() != wingspan) {
			return false;
		}
		if (c.getWeight() != weight) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Catterfly: {wingspan=" + wingspan + "; weight=" + weight + "}";
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
