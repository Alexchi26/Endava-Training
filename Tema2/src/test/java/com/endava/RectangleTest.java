package com.endava;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void test() {
        Rectangle rectangle = new Rectangle(2, 3);
        double area = rectangle.computeArea();
        double perimeter = rectangle.computePerimeter();
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
