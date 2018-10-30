package com.jUnit010Basics.basics020lifeCycle;

import junit.framework.TestCase;
public class TestCalculator_junit3 extends TestCase {
	
	public TestCalculator_junit3(){
		System.out.println("In constructor");
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Run setUp() for "+this.getName());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Run tearDown() for "+this.getName());
	}

	public void testAdd1() {
		System.out.println("\tIn testAdd1()");
		Calculator calc = new Calculator();
		double result = calc.add(10, 50);
		assertEquals(60.0, result);
	}
	
	public void testAdd2() {	
		System.out.println("\tIn testAdd2()");
		Calculator calc = new Calculator();
		double result = calc.add(100, 50);
		assertEquals(150, result, 0);
	}
}