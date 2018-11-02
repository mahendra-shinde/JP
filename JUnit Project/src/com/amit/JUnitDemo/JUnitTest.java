package com.amit.JUnitDemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest {

    @Test
    public void testEquals(){

        assertEquals(12, 13);
    }


    @Test
    public void testEquals2(){

        assertEquals(12, 12);
    }

    @Test
    public void testEquals3(){

        assertEquals(12.20, 12.30, 0.11);
    }

}
