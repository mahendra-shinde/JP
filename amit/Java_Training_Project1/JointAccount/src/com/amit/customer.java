package com.amit;

public class customer {

    private String customerName;
    private double balance;
    private String actNo;


    public customer(String customerName, double balance, String actNo) {
        this.customerName = customerName;
        this.balance = balance;
        this.actNo = actNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustNo() {
        return actNo;
    }

    public void setCustNo(String custNo) {
        this.actNo = custNo;
    }
}
