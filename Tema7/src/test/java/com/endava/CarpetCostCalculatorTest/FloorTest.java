package com.endava.CarpetCostCalculatorTest;

import com.endava.CarpetCostCalculator.Floor;
import org.junit.Assert;
import org.junit.Test;

public class FloorTest {

    @Test
    public void floorTest() {
        Floor floorTest1 = new Floor(6.5, 4.3);
        Floor floorTest2 = new Floor(-0.5, 4.3);

        Assert.assertEquals(27.95, floorTest1.getArea(), 0.1);
        Assert.assertEquals(0, floorTest2.getArea(), 0.1);
    }
}
