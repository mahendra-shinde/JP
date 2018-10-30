package com.shaunak;

public class Transaction implements Runnable {

	private Customer customer;
	private float amount;
	
	
	
	public Transaction(Customer customer, float amount) {
		super();
		this.customer = customer;
		this.amount = amount;
	}



	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println( name+" Performing withdrawal operation ");
		customer.withdraw(amount);
	}

}
