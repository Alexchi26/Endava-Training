package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTest {

    @Test
    public void calculatorTest() {

        SimpleCalculator testObject = new SimpleCalculator();

        testObject.setFirstNumber(7.8);
        testObject.setSecondNumber(6.4);

        Assert.assertEquals(7.8, testObject.getFirstNumber(), 0);

        Assert.assertEquals(6.4, testObject.getSecondNumber(), 0);

        Assert.assertEquals(14.2, testObject.getAdditionResult(), 0);

        Assert.assertEquals(1.4, testObject.getSubtractionResult(), 1);

        Assert.assertEquals(49.92, testObject.getMultiplicationResult(), 0);

        Assert.assertEquals(1.21875, testObject.getDivisionResult(), 0);
    }
}
