package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.LongestSequence.longestSequence;

public class LongestSequenceTest {

    @Test
    public void longestSequenceTest() {
        Integer[] testArray1 = {1, 2, 4, 5, 7, 8, 9};
        Integer[] testArray2 = {9, 7, 5, -2, 0, -1, 1, 3, 8, 10, 11};


        Assert.assertEquals(3, longestSequence(testArray1));
        Assert.assertEquals(5, longestSequence(testArray2));
    }
}
