package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.Sort.numericSort;


public class SortTest {

    @Test
    public void numericSortTest() {

        Integer[] numberArray = new Integer[]{7, -5, 6, 4, 2, -5, 0, 1};
        Integer[] expectedResult = new Integer[]{-5, -5, 0, 1, 2, 4, 6, 7};

        Assert.assertEquals(expectedResult, numericSort(numberArray));

    }

    @Test
    public void stringSortTest() {

        String[] stringArray = new String[]{"Robert", "John", "Xena", "alex", "Alexandru"};
        String[] expectedResult = new String[]{"Alexandru", "John", "Robert", "Xena", "alex"};

        Assert.assertEquals(expectedResult, numericSort(stringArray));

    }
}