package com.neha;

public class Account {
    private int accountNo;
    private String accountType;
    private String accountHolderName;
    private String branchName;
    private double currentBalance;

    public Account(int accountNo, String accountType, String accountHolderName, String branchName, double currentBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountHolderName = accountHolderName;
        this.branchName = branchName;
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}
