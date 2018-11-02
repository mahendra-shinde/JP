package com.amit.Calculator;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class junit_Test {

    Calc c = new Calc();

    @Before
    public void setUp(){
        System.out.println("Before each test case");
    }

    @BeforeClass
    public static void setUpClass(){

        System.out.println("Before Class");

    }

    @After
    public void setUpAfter(){
        System.out.println("After each testcase");
    }

    @AfterClass

    public static void setUpAfterClass(){

        System.out.println("After class");
    }

    @Test @Ignore
    public void validateAddCalc01(){

      //  double aa = c.add(11.5, 25.3);
      //  assertEquals(36.8, aa,0);

    }

    @Test @Ignore
    public void validateAddCalc02(){

      //  double bb = c.add(11.0, 25.0);
     //   assertEquals(36.0, bb,0);

    }

    @Test
    public void validateAddCalc03(){

        long bb = c.add(11, 25);
        assertEquals(36, bb,0);

    }


}
