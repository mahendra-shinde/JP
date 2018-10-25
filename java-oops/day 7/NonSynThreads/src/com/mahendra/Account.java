package com.mahendra;

public class Account {
	private int accNo;
	private float balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Account(int accNo, float balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
}
