package com.jUnit010Basics.basics030equalsCompare;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEquility_junit4 {
	private CompactDisk cd1;
	private CompactDisk cd2;
	private CompactDisk cd3;
	
	@Before
	public void initBeforeTest() throws Exception {
		System.out.println("\tRun initBeforeTest()");
		cd1 = new CompactDisk(100, "Java Programmiing", 400);
		cd2 = new CompactDisk(100, "Java Programmiing", 400);
		cd3 = new CompactDisk(200, "ServletJSP", 600);
	}

	@After
	public void cleanAfterTest() throws Exception {
		cd1 = null;
		cd2 = null;
		cd3 = null;
	}

	@Test
	public void equalityForSameReference() {
		Assert.assertTrue(cd1.equals(cd1));
	}
	
	@Test
	public void equalityForNotNull() {	
		Assert.assertFalse(cd1.equals(null));
	}
	
	@Test
	public void equalityForDiffInstance() {	
		Assert.assertFalse(cd1.equals("aaa"));
	}
	
	@Test
	public void equalityForSameId() {	
		Assert.assertTrue(cd1.equals(cd2));
	}
	
	@Test
	public void equalityForDifferentId() {	
		Assert.assertFalse(cd1.equals(cd3));
	}
}
