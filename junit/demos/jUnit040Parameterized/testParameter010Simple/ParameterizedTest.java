package com.jUnit040Parameterized.testParameter010Simple;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {
	private Calculator calc = new Calculator();
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	public ParameterizedTest(double expected, double valueOne, double valueTwo) {
		System.out.println("Object created: ParameterizedTest");
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][] { 
				{ 2, 1, 1 }, // expected, valueOne, valueTwo
				{ 3, 2, 1 }, 
				{ 4, 3, 1 }
		});
	}
	
	@Test
	public void sum() {
		assertEquals(expected, calc.add(valueOne, valueTwo), 0);
	}
}