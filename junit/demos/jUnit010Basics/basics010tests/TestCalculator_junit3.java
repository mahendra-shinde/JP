package com.jUnit010Basics.basics010tests;


import junit.framework.TestCase;
public class TestCalculator_junit3 extends TestCase {
	
	public void testAdd1() {	
		Calculator calc = new Calculator();
		double result = calc.add(10, 50);
		assertEquals(60.0, result);
	}
	
	public void testAdd2() {	
		Calculator calc = new Calculator();
		double result = calc.add(100, 50);
		assertEquals(150, result, 0);
	}
}