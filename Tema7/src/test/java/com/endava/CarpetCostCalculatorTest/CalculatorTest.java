package com.endava.CarpetCostCalculatorTest;

import com.endava.CarpetCostCalculator.Calculator;
import com.endava.CarpetCostCalculator.Carpet;
import com.endava.CarpetCostCalculator.Floor;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorTest() {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("total= " + calculator.getTotalCost());

        Assert.assertEquals(38.5, calculator.getTotalCost(), 0.1);

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        System.out.println("total= " + calculator.getTotalCost());

        Assert.assertEquals(36.45, calculator.getTotalCost(), 0.1);
    }
}
