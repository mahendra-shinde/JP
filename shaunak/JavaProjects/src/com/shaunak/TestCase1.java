package com.shaunak;

import org.junit.*;
import static org.junit.Assert.*;


public class TestCase1 {

    @Test
    public void testEquals1(){
        assertEquals(12.20,12.30,0.11);

        assertEquals(12,13);

    }

    @Test
    public void testEquals2(){

        assertEquals(12,13);
    }

}
