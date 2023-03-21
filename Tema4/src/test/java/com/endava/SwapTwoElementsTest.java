package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.endava.SwapTwoElements.swapElements;

public class SwapTwoElementsTest {
    @Test
    public void swapElementsTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of(4, 6, 7, 2, 6, 96, 0, 78));
        ArrayList<Integer> expectedList = new ArrayList<>(List.of(4, 0, 7, 2, 6, 96, 6, 78));

        System.out.println("The list before the swap: " + list);

        swapElements(list, 1,6);
        System.out.println("The list after swapping the element at the index 1 with the element at index 6: " + list);

        Assert.assertEquals(expectedList, list);
    }
}
