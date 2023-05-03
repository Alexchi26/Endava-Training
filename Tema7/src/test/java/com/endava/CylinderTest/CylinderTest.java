package com.endava.CylinderTest;

import com.endava.Cylinder.Circle;
import com.endava.Cylinder.Cylinder;
import org.junit.Assert;
import org.junit.Test;

public class CylinderTest {

    @Test
    public void cylinderTest() {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Assert.assertEquals(3.75, circle.getRadius(), 0.1);
        Assert.assertEquals(44.178646691106465, circle.getArea(), 0.1);

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Assert.assertEquals(5.55, cylinder.getRadius(), 0.1);
        Assert.assertEquals(7.25, cylinder.getHeight(), 0.1);
        Assert.assertEquals(96.76890771219959, cylinder.getArea(), 0.1);
        Assert.assertEquals(701.574580913447, cylinder.getVolume(), 0.1);
    }
}
