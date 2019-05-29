package com.arithmetic;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArithmeticTest {

    @Test
    public void testAddition(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 10;
        float actualResult =  arithmetic.add(4,6);
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void testSubtraction(){
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 2;
        float actualResult =  arithmetic.subtract(6,4);
        assertEquals (expectedResult, actualResult);
    }
}
