package com.jUnit040Parameterized.testParameters020DateLeapYear;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestDateDifference {
	private MyDateServices dateService = new MyDateServices();
	private long expected;
	private int testId;
	private int testDay1;
	private int testMonth1;
	private int testYear1;
	private int testDay2;
	private int testMonth2;
	private int testYear2;
	
	public TestDateDifference(int testId, long expected, int testDay1, int testMonth1, int testYear1, int testDay2, int testMonth2, int testYear2) {
		System.out.println("Object created: ParameterizedTest");
		this.expected = expected;
		this.testId = testId;
		this.testDay1 = testDay1;
		this.testMonth1 = testMonth1;
		this.testYear1 = testYear1;
		this.testDay2 = testDay2;
		this.testMonth2 = testMonth2;
		this.testYear2 = testYear2;
	}
	
	@Parameters
	public static Collection<Object[]> getTestParameters() {
		return Arrays.asList(new Object[][] { 
			  { 1,     0, 21, 9,2007,21, 9,2007},
			  { 2,     1, 21, 9,2007,22, 9,2007},
			  { 3,     1, 30, 9,2007, 1,10,2007},
			  { 4,     1, 28, 2,2007, 1, 3,2007},
			  { 5,     1, 31,12,2007, 1, 1,2008},
			  { 6,     2, 28, 2,2008, 1, 3,2008},
			  { 7,     5, 23, 7,2007,28, 7,2007},
			  { 8,    -3, 23, 7,2007,20, 7,2007},
			  { 9,     8, 23, 7,2007,31, 7,2007},
			  {10,     9, 23, 7,2007, 1, 8,2007},
			  {11,    13, 23, 7,2007, 5, 8,2007},
			  {12,    44, 23, 7,2007, 5, 9,2007},
			  {13,    74, 23, 7,2007, 5,10,2007},
			  {14,   105, 23, 7,2007, 5,11,2007},
			  {15,   135, 23, 7,2007, 5,12,2007},
			  {16,   166, 23, 7,2007, 5, 1,2008},
			  {17,   197, 23, 7,2007, 5, 2,2008},
			  {18,   226, 23, 7,2007, 5, 3,2008},
			  {19,   257, 23, 7,2007, 5, 4,2008},
			  {20,   287, 23, 7,2007, 5, 5,2008},
			  {21,   318, 23, 7,2007, 5, 6,2008},
			  {22,   348, 23, 7,2007, 5, 7,2008},
			  {23,   397, 23, 7,2007,23, 8,2008},
			  {24,   379, 23, 7,2007, 5, 8,2008},
			  {25,   744, 23, 7,2007, 5, 8,2009},
			  {26,  1109, 23, 7,2007, 5, 8,2010},
			  {27,  1474, 23, 7,2007, 5, 8,2011},
			  {28,  1840, 23, 7,2007, 5, 8,2012},
			  {29, 38364, 23, 7,2007, 5, 8,2112},
			  {30, 74888, 23, 7,2007, 5, 8,2212},
			  {31,111412, 23, 7,2007, 5, 8,2312},
			  {32,147937, 23, 7,2007, 5, 8,2412}
		});
	}
	@Test
	public void dateDifference() {
		MyDate d1 = new MyDate(testDay1, testMonth1, testYear1);
		MyDate d2 = new MyDate(testDay2, testMonth2, testYear2);
		assertEquals("TestCase: "+testId, expected, dateService.diffDate(d1, d2));
	}
}

