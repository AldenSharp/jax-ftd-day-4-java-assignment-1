package com.cooksys.butterpillar.model;

public class GrowthModel {

	// any instance fields should be private

	public double getLengthToWingspan() {
		return 0; // to be implemented
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		// to be implemented
	}

	public double getLeavesEatenToWeight() {
		return 0; // to be implemented
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		// to be implemented
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		return null; // to be implemented
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		return null; // to be implemented
	}
	
	public boolean equals(GrowthModel g) {
		return false; // TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
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
