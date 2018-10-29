package com.jUnit010Basics.basics010tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator_junit4 {
	@Test
	public void addDataSet01() {	
		Calculator calc = new Calculator();
		double result = calc.add(10, 50);
		assertEquals(60.0, result, 0);
	}
	
	@Test
	public void addDataSet02() {	
		Calculator calc = new Calculator();
		double result = calc.add(100, 50);
		assertEquals(150, result, 0);
	}
}
