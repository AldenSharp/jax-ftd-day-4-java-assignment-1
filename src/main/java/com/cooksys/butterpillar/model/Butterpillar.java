package com.cooksys.butterpillar.model;

public class Butterpillar {

	private double length;
	private double leavesEaten;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten;
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}

	public boolean equals(Butterpillar b) {
		if (b.getLength() != length) {
			return false;
		}
		if (b.getLeavesEaten() != leavesEaten) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Butterpillar: {length=" + length + "; leavesEaten=" + leavesEaten + "}";
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
