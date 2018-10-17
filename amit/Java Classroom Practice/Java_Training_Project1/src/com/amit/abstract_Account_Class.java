package com.amit;

public abstract class abstract_Account_Class {

    protected int accountNo;
    protected String accountHolder;
    protected  double balance;

    public abstract_Account_Class(int accountNo, String accountHolder,double balance ){

        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNo() {
        return accountNo;
    }

}
