package com.jUnit010Basics.basics015ExceptionTimeOut;

import org.junit.Ignore;
import org.junit.Test;

public class TestDao_junit4 {
	
	@Test(expected=RuntimeException.class)
	public void testRuntimeException() {	
		EmpDao dao = new EmpDao();
		dao.methodThrowingException();
	}
	
	@Test(expected=RuntimeException.class)
	public void testSubException() {	
		EmpDao dao = new EmpDao();
		dao.methodThrowingSubException();
	}
	
	@Test(expected=CustomException.class)
	public void testCustomException() throws CustomException {	
		EmpDao dao = new EmpDao();
		dao.methodThrowingCustomException();
	}
	
	@Test(timeout=200)
	//@Test(timeout=100)
	public void testTimeOut() {	
		EmpDao dao = new EmpDao();
		dao.methodTimeOut();
	}
	
	@Test(timeout=200, expected=CustomException.class)
	//@Test(timeout=50, expected=CustomException.class)
	public void testTimeOutAndException() throws CustomException {	
		EmpDao dao = new EmpDao();
		dao.methodTimeOutAndException();
	}
	
	@Test(timeout=200)
	@Ignore
	public void testToIgnore()  {	
		System.out.println("Do not see this message as this test is ignored.");
		
	}
}
