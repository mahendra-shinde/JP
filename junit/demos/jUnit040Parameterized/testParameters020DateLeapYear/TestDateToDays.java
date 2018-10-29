package com.jUnit040Parameterized.testParameters020DateLeapYear;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestDateToDays {
	private MyDateServices dateService = new MyDateServices();
	private long expected;
	private int testId;
	private int testDay;
	private int testMonth;
	private int testYear;
	
	public TestDateToDays(long expected, int testId, int testDay, int testMonth, int testYear) {
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
				{ 2588, 1,31, 1,2007},
				{ 2616, 2,28, 2,2007},
				{ 2647, 3,31, 3,2007},
				{ 2677, 4,30, 4,2007},
				{ 2708, 5,31, 5,2007},
				{ 2738, 6,30, 6,2007},
				{ 2769, 7,31, 7,2007},
				{ 2800, 8,31, 8,2007},
				{ 2830, 9,30, 9,2007},
				{ 2861, 10,31,10,2007},
				{ 2891, 11,30,11,2007},
				{ 2922, 12,31,12,2007},
				{ -1,13,32, 1,2007},
				{ -1,14,29, 2,2007}, 
				{ -1,15,30, 2,2007},
				{ -1,16,31, 4,2007},
				{ -1,17,31, 6,2007},
				{ -1,18,31, 9,2007},
				{ -1,19, 31,11,2007},
				{ -1,20,30, 2,2008},
				{ 2982, 21,29, 2,2008}
		});
	}
	
	@Test
	public void dateToDays() {
		MyDate dt = new MyDate(testDay, testMonth, testYear);
		assertEquals("TestCase: "+testId, expected, dateService.toDays(dt));
	}
}
