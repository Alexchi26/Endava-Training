package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.endava.Reverse.reverseElements;

public class ReverseTest {
    @Test
    public void swapElementsTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of(4, 6, 7, 2, 6, 96, 0, 78));
        ArrayList<Integer> expectedList = new ArrayList<>(List.of(78, 0, 96, 6, 2, 7, 6, 4));

        System.out.println("The list before reversing: " + list);

        reverseElements(list);
        System.out.println("The list after reversing: " + list);

        Assert.assertEquals(expectedList, list);
    }
}
