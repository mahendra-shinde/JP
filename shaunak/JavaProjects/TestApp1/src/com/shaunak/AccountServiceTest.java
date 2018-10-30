package com.shaunak;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AccountServiceTest {

    AccountService service = null;

    @Before
    public void setUp(){
        service = new AccountService();
        Map<Integer,Account> accounts = new HashMap<Integer, Account>();
        accounts.put(1001,new Account("Abhishek",12300.2));
        accounts.put(1002,new Account("Amitabh",340080.12));
        accounts.put(1003,new Account("Jaya",123000));
        service.SetData(accounts);
    }

    @After
    public void tearDown(){
        service = null;
    }
    //A Test case, which expect an Exception to be thrown
    //If no exception is thrown, test case is marked as FAILED
    @Test (expected = RuntimeException.class)
    public void testNonExistingAccount(){
        Account acc = service.findAccount(1004);
    }


    //Test withdrawal of amount higher than balance
    @Test //(expected = NoSufficientFundException.class)
    public void testWithdraw() {
        double beforeAmount = service.findAccount(1001).getAmount();
        try {
            service.withdraw(1001, beforeAmount + 1000);
        }catch (NoSufficientFundException ex){
            System.out.println(ex.getMessage());
        }
        double afterAmount = service.findAccount(1001).getAmount();
        assertEquals(afterAmount, beforeAmount,0);
    }

    @Test
    public void testDeposit() {
        double beforeAmount = service.findAccount(1001).getAmount();
        service.deposit(1001, 1000);
        System.out.println(beforeAmount);

        double afterAmount = service.findAccount(1001).getAmount();
        assertEquals(beforeAmount+1000, afterAmount, 0);
        System.out.println(afterAmount);
    }

}
