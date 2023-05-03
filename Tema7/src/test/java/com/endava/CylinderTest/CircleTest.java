package com.endava.CylinderTest;

import com.endava.Cylinder.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void circleTest() {

        Circle circleTest1 = new Circle(5.4);
        Circle circleTest2 = new Circle(-3);

        Assert.assertEquals(0, circleTest2.getRadius(), 0.1);

        Assert.assertEquals(91.6, circleTest1.getArea(), 0.1);
        Assert.assertEquals(0, circleTest2.getArea(), 0.1);
    }
}
