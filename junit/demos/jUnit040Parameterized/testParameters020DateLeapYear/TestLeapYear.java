package com.jUnit040Parameterized.testParameters020DateLeapYear;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestLeapYear {
	private MyDateServices dateService = new MyDateServices();
	private boolean expected;
	private int testId;
	private int testYear;
	
	public TestLeapYear(boolean expected, int testId, int testYear) {
		System.out.println("Object created: ParameterizedTest");
		this.expected = expected;
		this.testId = testId;
		this.testYear = testYear;
	}
	
	@Parameters
	public static Collection<Object[]> getTestParameters() {
		return Arrays.asList(new Object[][] { 
				{true, 1, 1600}, 
				{false, 2, 1700},
				{false, 3, 1800},
				{false, 4, 1900},
				{true, 5, 2000},
				{false, 6, 2100},
				{false, 7, 2200},
				{false, 8, 2300},
				{true, 9, 2400},
				{false, 10, 2500},
				{false, 11, 2600},
				{false, 12, 2700},
				{true, 13, 2800},
				{false, 14, 2900},
				{false, 15, 3000}
		});
	}
	
	@Test
	public void leapYear() {
		assertEquals("TestCase: "+testId, expected, dateService.isLeapYear(testYear));
	}
}
