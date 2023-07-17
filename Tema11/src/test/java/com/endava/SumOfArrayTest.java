package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.SumOfArray.sumOfArrayElements;

public class SumOfArrayTest {

    @Test
    public void sumTest() {

        int[] array1 = {1, 2, 3, 4, 5};
        int sum1 = sumOfArrayElements(array1);

        int[] array2 = {1, 2, 0, 4, 323323442};
        int sum2 = sumOfArrayElements(array2);

        int[] array3 = null;
        int sum3 = sumOfArrayElements(array3);

        Assert.assertEquals(15, sum1);
        Assert.assertEquals(323323449, sum2);
        Assert.assertEquals(0, sum3);
    }
}
