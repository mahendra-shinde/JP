package com.jUnit010Basics.basics030equalsCompare;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCompare_junit4 {
	private Book book1;
	private Book book2;
	private Book book3;
	private Book book4;
	
	@Before
	public void initBeforeTest() throws Exception {
		System.out.println("\tRun initBeforeTest()");
		book1 = new Book(50, "Java Programmiing", 400);
		book2 = new Book(100, "Java Programmiing", 400);
		book3 = new Book(100, "Java Programmiing", 400);
		book4 = new Book(200, "ServletJSP", 600);
	}

	@After
	public void cleanAfterTest() throws Exception {
		book1 = null;
		book2 = null;
		book3 = null;
		book4 = null;
	}

	@Test
	public void compareLessThanTrue() {
		Assert.assertTrue(book1.compareTo(book2)<0);
	}
	
	@Test
	public void compareLessThanFalse() {
		Assert.assertFalse(book2.compareTo(book1)<0);
	}
	
	@Test
	public void compareEqualityTrue() {	
		Assert.assertTrue(book2.compareTo(book3)==0);
	}
	
	@Test
	public void compareEqualityFalse() {	
		Assert.assertFalse(book2.compareTo(book4)==0);
	}
	
	public void compareGreaterThanTrue() {
		Assert.assertTrue(book4.compareTo(book3)>0);
	}
	
	@Test
	public void compareGreaterThanFalse() {
		Assert.assertFalse(book3.compareTo(book4)>0);
	}
}
