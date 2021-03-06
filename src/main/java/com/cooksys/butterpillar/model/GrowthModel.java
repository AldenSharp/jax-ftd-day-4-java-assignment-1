package com.cooksys.butterpillar.model;

public class GrowthModel {

	private double lengthToWingspan;
	private double leavesEatenToWeight;

	public double getLengthToWingspan() {
		return lengthToWingspan;
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight;
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		this.leavesEatenToWeight = leavesEatenToWeight;
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		Catterfly catterfly = new Catterfly();
		catterfly.setWingspan(butterpillar.getLength() * lengthToWingspan);
		catterfly.setWeight(butterpillar.getLeavesEaten() * leavesEatenToWeight);
		return catterfly;
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		Butterpillar butterpillar = new Butterpillar();
		butterpillar.setLength(catterfly.getWingspan() / lengthToWingspan);
		butterpillar.setLeavesEaten(catterfly.getWeight() / leavesEatenToWeight);
		return butterpillar;
	}

	public boolean equals(GrowthModel g) {
		if (g.getLengthToWingspan() != lengthToWingspan) {
			return false;
		}
		if (g.getLeavesEatenToWeight() != leavesEatenToWeight) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "GrowthModel: {lengthToWingspan=" + lengthToWingspan + "; leavesEatenToWeight=" + leavesEatenToWeight
				+ "}";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
