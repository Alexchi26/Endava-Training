package com.endava.CarpetCostCalculatorTest;

import com.endava.CarpetCostCalculator.Carpet;
import org.junit.Assert;
import org.junit.Test;

public class CarpetTest {

    @Test
    public void carpetTest() {

        Carpet carpetTest1 = new Carpet(500.3);
        Carpet carpetTest2 = new Carpet(-56);

        Assert.assertEquals(500.3, carpetTest1.getCost(), 0.1);
        Assert.assertEquals(0, carpetTest2.getCost(), 0.1);
    }
}
