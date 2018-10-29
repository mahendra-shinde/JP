package com.jUnit010Basics.basics015ExceptionTimeOut;

public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CustomException(String arg0) {
		super(arg0);
	}
}
