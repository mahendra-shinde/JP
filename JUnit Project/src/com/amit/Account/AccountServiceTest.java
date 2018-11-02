package com.amit.Account;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;
import static junit.framework.TestCase.assertEquals;


public class AccountServiceTest {

    //String a;
    AccountService service = null;


    @Before
    public void setData(){
        service = new AccountService();
        Map<Integer, Account> accounts = new HashMap<Integer, Account>();
        accounts.put(1001,new Account("Abhishek",12300.2));
        accounts.put(1002,new Account("Amitabh",340080.12));
        accounts.put(1003,new Account("Jaya",123000));
        service.setData(accounts);
    }


    @After
    public void tearown(){
        service=null;
    }

    //A Test case, which expect an Exception to be thrown
    //If no exception is thrown, test case is marked as FAILED
    @Test(expected = RuntimeException.class)
    public void testNonExistingAccount(){
        Account acc = service.findAccount(1004);
    }


    //Test withdrawal of amount higher than balance
   @Test(expected = AccountException.class)
    //@Test
    public void testWithdraw(){
        double beforeAmount = service.findAccount(1001).getAmount();

            service.withdraw(1001,beforeAmount+1000);
            double afterAmount = service.findAccount(1001).getAmount();
            assertEquals(afterAmount, beforeAmount,0);

    }

    //@Test(expected = AccountNotFoundException.class)
    //@Test (timeout = 10, expected = AccountNotFoundException.class)
    @Test @Ignore
    public void testDeposit(){

        double beforeAmount = service.findAccount(1001).getAmount();
        service.deposit(1001,1000);
        double afterAmount = service.findAccount(1001).getAmount();
        assertEquals(afterAmount, beforeAmount+1000,0);

    }



}
