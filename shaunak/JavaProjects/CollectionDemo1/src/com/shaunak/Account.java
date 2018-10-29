package com.shaunak;

import java.util.Comparator;

public class Account {
    private int accountNo;
    private String accountType;
    private String accHolderName;
    private String branchName;
    private double currentBalance;


    public Account(int accountNo, String accountType, String accHolderName, String branchName, double currentBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accHolderName = accHolderName;
        this.branchName = branchName;
        this.currentBalance = currentBalance;
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

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
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
    @Override
    public String toString(){
        return ("Account Holder: " +accHolderName+ " Has A/C No: "+ accountNo+ " of A/C Type: "+accountType+" having Balance of: "+currentBalance);
    }


    }

class sortbyAccNumber implements Comparator<Account> {

    public int compare(Account a, Account b) {

        return a.getAccountNo() - b.getAccountNo();
    }
}

class sortbyAccName implements Comparator<Account> {

    public int compare(Account a, Account b) {

        return a.getAccHolderName().compareTo(b.getAccHolderName());
    }
}