package com.shaunak;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryCalculatorTest {
    SalaryCalculator scalc = null;

    @Before
    public void setUp() {
        scalc = new SalaryCalculator();
    }

   @Test
   //Calculating Tax and using asset equal I am comparing expected vs Actual
    public void testCaclTax() {
        double tax = scalc.calcTax(350000,0.085);
        System.out.println(tax);
        assertEquals(4250,tax,0);
    }

    @After
    public void tearDown(){
        scalc = null;
    }
}
