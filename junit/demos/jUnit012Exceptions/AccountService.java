

import java.util.*;

public class AccountService {

    private Map<Integer,Account> accounts = new HashMap<Integer,Account>();

    public AccountService(){
        accounts.put(1001,new Account("Abhishek",12300.2));
        accounts.put(1002,new Account("Amitabh",340080.12));
        accounts.put(1003,new Account("Jaya",123000));
    }

    public Account findAccount(int accountNo){
        if(accounts.containsKey(accountNo)){
            return accounts.get(accountNo);
        }
        else throw new RuntimeException("Account No "+accountNo+" does not exists!");
    }

    public void withdraw(int accountNo, double amount){
        Account acc = accounts.get(accountNo);
        if(acc.getAmount()<amount)
            System.out.println("Withdrawal failed");
        else
            acc.setAmount( acc.getAmount()-amount );
    }
}
