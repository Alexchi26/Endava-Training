package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.endava.CopyArray.copyElements;

public class CopyArrayTest {
    @Test
    public void swapElementsTest() {
        ArrayList<Integer> sourceList = new ArrayList<>(List.of(4, 6, 7, 2, 6, 96, 0, 78));
        ArrayList<Integer> destinationList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> expectedList = new ArrayList<>(List.of(4, 6, 7, 2, 6, 96, 0, 78));

        System.out.println("The destination list before receiving the source list copy: " + destinationList);

        copyElements(destinationList, sourceList);

        System.out.println("The destination list after receiving the source list copy: " + destinationList);

        Assert.assertEquals(expectedList, destinationList);
    }
}
