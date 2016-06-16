package com.cooksys.butterpillar.test.model;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cooksys.butterpillar.model.Butterpillar;
import com.cooksys.butterpillar.model.Catterfly;
import com.cooksys.butterpillar.model.GrowthModel;

public class GrowthModelTest {

	private GrowthModel model;
	private List<Butterpillar> butterpillars;
	private List<Catterfly> catterflies;

	@Before
	public void before() {
		this.model = new GrowthModel();
		this.model.setLengthToWingspan(1.2);
		this.model.setLeavesEatenToWeight(0.25);

		this.butterpillars = new ArrayList<>();

		Butterpillar b1 = new Butterpillar();
		b1.setLength(0.5);
		b1.setLeavesEaten(20);
		butterpillars.add(b1);

		Butterpillar b2 = new Butterpillar();
		b2.setLength(0.6);
		b2.setLeavesEaten(17);
		butterpillars.add(b2);

		Butterpillar b3 = new Butterpillar();
		b3.setLength(0.5);
		b3.setLeavesEaten(21);
		butterpillars.add(b3);

		Butterpillar b4 = new Butterpillar();
		b4.setLength(0.4);
		b4.setLeavesEaten(20);
		butterpillars.add(b4);

		Butterpillar b5 = new Butterpillar();
		b5.setLength(0.7);
		b5.setLeavesEaten(18);
		butterpillars.add(b5);

		this.catterflies = new ArrayList<>();

		Catterfly c1 = new Catterfly();
		c1.setWingspan(0.6);
		c1.setWeight(5);
		catterflies.add(c1);

		Catterfly c2 = new Catterfly();
		c2.setWingspan(0.72);
		c2.setWeight(4.25);
		catterflies.add(c2);

		Catterfly c3 = new Catterfly();
		c3.setWingspan(0.6);
		c3.setWeight(5.25);
		catterflies.add(c3);

		Catterfly c4 = new Catterfly();
		c4.setWingspan(0.48);
		c4.setWeight(5.0);
		catterflies.add(c4);

		Catterfly c5 = new Catterfly();
		c5.setWingspan(0.84);
		c5.setWeight(4.5);
		catterflies.add(c5);
	}

	@After
	public void after() {
		this.model = null;

		this.butterpillars.clear();
		this.butterpillars = null;

		this.catterflies.clear();
		this.catterflies = null;
	}

	@Test
	public void testButterpillarToCatterfly() {
		for (int i = 0; i < 5; i++) {
			Catterfly converted = this.model.butterpillarToCatterfly(this.butterpillars.get(i));
			Assert.assertEquals(this.catterflies.get(i), converted);
		}
	}

	@Test
	public void testCatterflyToButterpillar() {
		for (int i = 0; i < 5; i++) {
			Butterpillar converted = this.model.catterflyToButterpillar(this.catterflies.get(i));
			Assert.assertEquals(this.butterpillars.get(i), converted);
		}
	}

}
