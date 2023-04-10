package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.CheckLetters.lettersInTheFirstString;

public class CheckLettersTest {

    @Test
    public void checkLettersTest() {

        String firstString = "Java";
        String secondString = "Ja";

        Boolean expectedResult = true;
        Boolean actualResult = lettersInTheFirstString(firstString, secondString);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
