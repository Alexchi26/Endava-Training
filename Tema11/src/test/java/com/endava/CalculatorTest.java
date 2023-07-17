package com.endava;

import org.junit.Assert;
import org.junit.Test;
import static com.endava.Calculator.divide;

public class CalculatorTest {
    @Test
    public void calculatorTest() {
        try {
            int result = divide(10, 0);
            Assert.assertEquals(0, result);
        } catch (CustomDivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
