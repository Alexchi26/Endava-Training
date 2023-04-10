package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.MaxOccurChar.maxOccurChar;

public class MaxOccurCharTest {

    @Test
    public void maxOccurCharTest() {
        String inputString = "test string";
        char expectedChar = 't';

        char resultChar = maxOccurChar(inputString);

        Assert.assertEquals(expectedChar, resultChar);
    }
}
