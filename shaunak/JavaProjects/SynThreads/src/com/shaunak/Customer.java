package com.shaunak;

public class Customer {
	private Account account;
	private String name;
private static final int MIN_BAL = 1000;
	public Customer(Account account, String name) {
		super();
		this.account = account;
		this.name = name;
	}
	
	public void withdraw(float amt) {
		delay();
		//calculate balance after withdrawal
		synchronized(account){ //Lock the account object
			float temp = account.getBalance() - amt;
			if (temp > MIN_BAL) {
				System.out.println("Hi " + name + ", Withdrawal was successful!");
				account.setBalance(temp);
			} else
				System.out.println("Hi " + name + ", withdrawal failed!");
			delay();
		}
		System.out.println("Hi "+name+", your balance now is "+account.getBalance());
	}
	
	//Simulate delay of 0.10 seconds
	private void delay() {
		try {
			Thread.sleep(100);
		}catch(InterruptedException ex) {}
		
	}
}
