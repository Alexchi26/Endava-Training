package com.endava;

import com.endava.Animal.*;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void testAnimals() {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        System.out.println();

        Assert.assertEquals("Fluffy", c.getName());
        c.setName("Tom");
        Assert.assertEquals("Tom", c.getName());
        c.play();
        c.eat();
        c.walk();
        System.out.println();

        a.eat();
        a.walk();
        System.out.println();

        e.walk();
        e.eat();
        System.out.println();

        Assert.assertEquals("", p.getName());
        p.setName("Fluffy");
        Assert.assertEquals("Fluffy", p.getName());
        p.play();
    }
}
