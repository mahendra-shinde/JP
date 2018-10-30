package com.jUnit010Basics.basics040Assert;

import org.junit.Assert;
import org.junit.Test;

public class TestDao_junit4 {
	private EmpDao dao = new EmpDao();
	
	@Test
	public void testAssertNull() {	
		Assert.assertNull(dao.getEmpOnEmpId(102));
	}
	
	@Test
	public void testAssertEqualObject() {
		Assert.assertEquals("", dao.getEmpOnEmpId(100),  new Emp(100, "", 0.0f, true));
		Assert.assertEquals("", dao.getEmpOnEmpId(108),  new Emp(108, "", 0.0f, true));
	}
	
	@Test
	public void testAssertEqualArray() {
		dao.getEmpsOnSalRange(5000, 10000);
		Object[] expectedList = {
				new Emp(109, "", 50000, true),
				new Emp(101, "", 60000, false),
				new Emp(106, "", 70000, true),
				new Emp(107, "", 80000, false),
				new Emp(110, "", 90000, true),
				new Emp(112, "", 100000, false)
		};
		Assert.assertArrayEquals(expectedList, dao.getEmpsOnSalRange(50000, 100000).toArray());
	}
	
	@Test
	public void testAssertBoolean() {
		Assert.assertTrue("", dao.isEmpPermanant(100));
		Assert.assertFalse("", dao.isEmpPermanant(105));
	}
	
	@Test
	public void testAssertSame() {
		FactoryDataSource expectDataSource = FactoryDataSource.getInstance();
		Assert.assertSame(expectDataSource, FactoryDataSource.getInstance());
	}
}
