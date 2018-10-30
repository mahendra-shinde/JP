package com.jUnit020Collection.collect010Array;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayItems {
	private static Items items;
	
	@BeforeClass
	public static void initArray() throws Exception {
		items = new Items();
	}
	
	@AfterClass
	public static void cleanArray() throws Exception {
		items = null;
	}
	
	@Before
	public void initBeforeTest() throws Exception {
		items.setItemList(new Integer[]{100, 109, 107, 111, 102, 108, 103, 101});
	}
	
	@Test
	public void testEquality() { // It does bother about the order of numbers.
		Integer[] arrayExpected = {100, 109, 107, 111, 102, 108, 103, 101};
		
		Assert.assertArrayEquals(arrayExpected, items.getItemList());
	}
	
	@Test
	public void testOnRange() {
		Integer[] arrayExpected = {109, 107, 111, 108};
		
		Assert.assertArrayEquals(arrayExpected, items.getItemsInRange(105, 120));
	}
}
