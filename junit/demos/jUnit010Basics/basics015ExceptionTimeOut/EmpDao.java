package com.jUnit010Basics.basics015ExceptionTimeOut;

public class EmpDao {

	public void methodThrowingException() {
		throw new RuntimeException();
	}
	
	public void methodThrowingSubException() {
		throw new ArithmeticException();
	}
	
	public void methodThrowingCustomException() throws CustomException {
		throw new CustomException("Custom Exception");
	}
	
	public void methodTimeOut()  {
		for(int i=0; i<100; i++){
			for(int j=0; j<100; j++){
				for(int k=0; k<1000; k++){
					double x = Math.pow(i, j);
				}
			}
		}
	}
	
	public void methodTimeOutAndException() throws CustomException  {
		for(int i=0; i<100; i++){
			for(int j=0; j<100; j++){
				for(int k=0; k<1000; k++){
					double x = Math.pow(i, j);
				}
			}
		}
		throw new CustomException("Exception");
	}
}
