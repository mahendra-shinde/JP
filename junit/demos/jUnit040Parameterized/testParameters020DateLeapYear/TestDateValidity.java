package com.jUnit040Parameterized.testParameters020DateLeapYear;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestDateValidity {
	private MyDateServices dateService = new MyDateServices();
	private boolean expected;
	private int testId;
	private int testDay;
	private int testMonth;
	private int testYear;
	
	public TestDateValidity(boolean expected, int testId, int testDay, int testMonth, int testYear) {
		System.out.println("Object created: ParameterizedTest");
		this.expected = expected;
		this.testId = testId;
		this.testDay = testDay;
		this.testMonth = testMonth;
		this.testYear = testYear;
	}
	
	@Parameters
	public static Collection<Object[]> getTestParameters() {
		return Arrays.asList(new Object[][] { 
				{ true, 1,31, 1,2007},
				{ true, 2,28, 2,2007},
				{ true, 3,31, 3,2007},
				{ true, 4,30, 4,2007},
				{ true, 5,31, 5,2007},
				{ true, 6,30, 6,2007},
				{ true, 7,31, 7,2007},
				{ true, 8,31, 8,2007},
				{ true, 9,30, 9,2007},
				{ true, 10,31,10,2007},
				{ true, 11,30,11,2007},
				{ true, 12,31,12,2007},
				{ false,13,32, 1,2007},
				{ false,14,29, 2,2007}, 
				{ false,15,30, 2,2007},
				{ false,16,31, 4,2007},
				{ false,17,31, 6,2007},
				{ false,18,31, 9,2007},
				{ false,19, 31,11,2007},
				{ false,20,30, 2,2008},
				{ true, 21,29, 2,2008}
		});
	}
	
	@Test
	public void dateValidity() {
		MyDate dt = new MyDate(testDay, testMonth, testYear);
		assertEquals("TestCase: "+testId, expected, dateService.isValid(dt));
	}
}
