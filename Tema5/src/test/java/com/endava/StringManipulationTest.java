package com.endava;

import org.junit.Assert;
import org.junit.Test;

import static com.endava.StringManipulation.*;

public class StringManipulationTest {

    @Test
    public void UppercaseATest() {

        String inputString = "ana are ananas";
        String expectedString = "AnA are anAnAs";

        String modifiedString = UppercaseA(inputString);

        Assert.assertEquals(expectedString, modifiedString);

    }

    @Test
    public void initialsDisplayTest() {

        String inputString = "Alexandru Chirila Alexandru";
        String expectedString = "A C A";

        String actualString = initialsDisply(inputString);

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void oddAndEvenTransformationTest() {

        String inputString = "Acesta este un sir de test.";
        String expectedString = "aCeStA EsTe uN SiR De tEsT.";

        String modifiedString = oddAndEvenTransformation(inputString);

        Assert.assertEquals(expectedString, modifiedString);
    }


}
