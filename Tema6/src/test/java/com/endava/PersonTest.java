package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void personTest(){

        Person firstPerson = new Person("Alexandru", 27);

        String expectedName = "Alexandru";
        int expectedAge = 27;

        String actualName = firstPerson.getName();
        int actualAge = firstPerson.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, expectedAge);
    }
}
