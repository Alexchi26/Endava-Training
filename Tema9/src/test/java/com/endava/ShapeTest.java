package com.endava;

import com.endava.Shape.Circle;
import com.endava.Shape.Rectangle;
import com.endava.Shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

    @Test
    public void shepeTest() {

        Rectangle rectangle = new Rectangle(4.5, 2.5);
        Circle circle = new Circle(2.9);
        Triangle triangle = new Triangle(2.4, 7.3);

        Assert.assertEquals(11.25, rectangle.getArea(), 0.1);
        Assert.assertEquals(26.42, circle.getArea(), 0.1);
        Assert.assertEquals(8.76, triangle.getArea(), 0.1);
    }
}
