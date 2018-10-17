package com.mahendra;

public abstract class Account {

    protected int accountNo;
    protected String accountHolder;
    protected double balance;

    Account(int accountNo, String accountHolder, double balance){
        this.accountNo=accountNo;
        this.balance= balance;
        this.accountHolder=accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

}
