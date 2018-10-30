package com.jUnit010Basics.basics020lifeCycle;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * How to get the name of the method being tested?  How to call getName() method.
 */
public class TestCalculator_junit4 {
	
	@BeforeClass
	public static void initBeforeRun() throws Exception {
		System.out.println("Run initBeforeRun()");
	}
	
	public TestCalculator_junit4(){
		System.out.println("\tIn constructor");
	}
	
	@AfterClass
	public static void cleanAfterRun() throws Exception {
		System.out.println("Run cleanAfterRun()");
	}
	
	@Before
	public void initBeforeTest() throws Exception {
		System.out.println("\tRun initBeforeTest()");
	}

	@After
	public void cleanAfterTest() throws Exception {
		System.out.println("\tRun cleanAfterTest()");
	}

	@Test
	public void add1() {
		System.out.println("\t\tIn add1()");
		Calculator calc = new Calculator();
		double result = calc.add(10, 50);
		assertEquals(60.0, result, 0);
	}
	
	@Test
	public void add2() {	
		System.out.println("\t\tIn add2()");
		Calculator calc = new Calculator();
		double result = calc.add(100, 50);
		assertEquals(150, result, 0);
	}
}
