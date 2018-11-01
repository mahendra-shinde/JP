package com.amit.Salary_Junit;

import com.amit.Salary_Junit.SalaryCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalaryCalculatorTest {

    SalaryCalculator sc = null;
    @Before
    public void setObject(){
         sc = new SalaryCalculator();
    }


    @Test
    public void salmore(){

        double aTax = sc.calcTax(350000,0.085);
        assertEquals(4250.0, aTax, 0.0);

    }


//Run the below test for pass scenario
    /*@Test
    public void salmoreValid(){
        //private static final double TAX_FREE=0; set this variable to 300000
        double aTax = sc.calcTax(350000,0.085);
        assertEquals(4250.0, aTax, 0.0);

    }*/

    @After
    public void tearDown(){
        sc = null;
    }


}



/*
output:
        junit.framework.AssertionFailedError:
        Expected :4250.0
        Actual   :29750.000000000004
*/
