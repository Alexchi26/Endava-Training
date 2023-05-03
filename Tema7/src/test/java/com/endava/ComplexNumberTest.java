package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class ComplexNumberTest {

    @Test
    public void complexNumberTest() {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);

        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        Assert.assertEquals(2.0, one.getReal(), 0.1);
        Assert.assertEquals(2.0, one.getImaginary(), 0.1);

        one.subtract(number);

        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());

        Assert.assertEquals(-0.5, one.getReal(), 0.1);
        Assert.assertEquals(3.5, one.getImaginary(), 0.1);

        number.subtract(one);

        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        Assert.assertEquals(3.0, number.getReal(), 0.1);
        Assert.assertEquals(-5.0, number.getImaginary(), 0.1);
    }
}
