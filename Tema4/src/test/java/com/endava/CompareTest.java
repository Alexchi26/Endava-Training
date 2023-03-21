package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.Compare.compareStrings;

public class CompareTest {
    @Test
    public void compareTest(){
        String firstString = "dDaaaAAAaA23'";
        String secondString = "dDaaaAAAaA23'";

        Assert.assertTrue(compareStrings(firstString, secondString));
    }
}
