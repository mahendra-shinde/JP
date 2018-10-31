package com.shaunak;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountParameterizedTest {
    AccountService service = null;

    private Integer input;
    private Double expectedOutput;
    private double inputAmount;

    //Arg sequence should MATCH with Parameter collection
    public AccountParameterizedTest(Integer input, Double inputAmount, Double expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
        this.inputAmount = inputAmount;
    }

    @Before
    public  void setUp(){
        service  = new AccountService();
        Map<Integer,Account> accounts = new HashMap<Integer,Account>();
        accounts.put(1001,new Account("Abhishek",20000));
        accounts.put(1002,new Account("Amitabh",30000));
        accounts.put(1003,new Account("Jaya",40000));
        service.SetData(accounts);
    }

    @After
    public void tearDown(){
        service = null;
    }

    @Parameterized.Parameters
    public static Collection params(){
        List data = new ArrayList();
        //After withdrawing 20000 from A/c 1001, balance should be 0
        data.add(new Object[]{1001,20000D,0D});

        //After withdrawing 20000 from A/c 1002, balance should be 10000
        data.add(new Object[]{1002,20000D,10000D});

        //After withdrawing 20000 from A/c 1003, balance should be 20000
        data.add(new Object[]{1003,20000D,20000D});
        return data;
    }

    @Test
    public void testWithdraw(){
        service.withdraw(input,inputAmount);
        assertEquals(expectedOutput,service.findAccount(input).getAmount() ,0.1);
    }

    public long sum(long x, long y){return x+y;}

    @Test
    public void sum(){
        assertEquals(4, sum(2,2));
    }
}
