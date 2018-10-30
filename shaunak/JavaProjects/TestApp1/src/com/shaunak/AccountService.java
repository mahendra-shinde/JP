package com.shaunak;

import java.util.*;

public class AccountService {

    private Map<Integer,Account> accounts = new HashMap<Integer,Account>();

    public AccountService(){

    }

    public void SetData(Map<Integer,Account> accounts){
        this.accounts=accounts;
    }

    public Account findAccount(int accountNo){
        if(accounts.containsKey(accountNo)){
            return accounts.get(accountNo);
        }
        else throw new RuntimeException("Account No "+accountNo+" does not exists!");
    }

    public void withdraw(int accountNo, double amount){
        Account acc = accounts.get(accountNo);
        if(acc.getAmount()<amount) {
            System.out.println("Withdrawal failed");
            throw new NoSufficientFundException(accountNo);

        }
        else
            acc.setAmount( acc.getAmount()-amount );
    }

    public void deposit(int accountNo, double amount){
        Account account = findAccount(accountNo);
        account.setAmount(account.getAmount()+ amount);
    }
}
