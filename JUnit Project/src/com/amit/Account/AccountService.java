package com.amit.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountService {

    private Map<Integer,Account> accounts = new HashMap<Integer,Account>();

    /*public AccountService(){
        accounts.put(1001,new Account("Abhishek",12300.2));
        accounts.put(1002,new Account("Amitabh",340080.12));
        accounts.put(1003,new Account("Jaya",123000));
    }*/

    public void setData(Map<Integer,Account> accounts){
        this.accounts=accounts;

    }

    public Account findAccount(int accountNo)throws AccountNotFoundException{
        if(accounts.containsKey(accountNo)){
            return accounts.get(accountNo);
        }
        else throw new  AccountNotFoundException();
    }

    public void withdraw(int accountNo, double amount)throws AccountException {
        Account acc = accounts.get(accountNo);
        if(acc.getAmount()<amount)
            //System.out.println("Withdrawal failed");
            throw new AccountException();
        else
            acc.setAmount( acc.getAmount()-amount );
    }

    public void deposit(int accountNo, double amount) {

        Account account = findAccount(accountNo);

        account.setAmount(account.getAmount()+ amount);
    }
}
