package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    //Test code provided by Udemy
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    @Test
    public void ageTest() {
        Person personTest1 = new Person();
        Person personTest2 = new Person();
        Person personTest3 = new Person();
        Person personTest4 = new Person();

        personTest1.setAge(67);
        personTest2.setAge(18);
        personTest3.setAge(101);
        personTest4.setAge(-10);

        Assert.assertEquals(67, personTest1.getAge());
        Assert.assertEquals(18, personTest2.getAge());
        Assert.assertEquals(0, personTest3.getAge());
        Assert.assertEquals(0, personTest4.getAge());

        Assert.assertEquals(false, personTest1.isTeen());
        Assert.assertEquals(true, personTest2.isTeen());
    }

    @Test
    public void nameTest() {
        Person personTest1 = new Person();
        Person personTest2 = new Person();
        Person personTest3 = new Person();
        Person personTest4 = new Person();

        personTest1.setFirstName("Alexandru");
        personTest1.setLastName("Chirila");

        personTest2.setFirstName("Serban");
        personTest2.setLastName("");

        personTest3.setFirstName("");
        personTest3.setLastName("Popescu");

        personTest4.setFirstName("");
        personTest4.setLastName("");

        Assert.assertEquals("Alexandru Chirila", personTest1.getFullName());
        Assert.assertEquals("Serban", personTest2.getFullName());
        Assert.assertEquals("Popescu", personTest3.getFullName());
        Assert.assertEquals("", personTest4.getFullName());
    }
}
