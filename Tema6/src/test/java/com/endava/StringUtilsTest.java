package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.StringUtils.reverse;

public class StringUtilsTest {

    @Test
    public void reverseTest(){

        String inputString = "This is a test string!";
        String expectedString = "!gnirts tset a si sihT";

        String  reversedInput = reverse(inputString);

        Assert.assertEquals(expectedString, reversedInput);
    }
}
