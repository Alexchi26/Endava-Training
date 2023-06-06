package com.endava.Animal;

public class Fish extends Animal {

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating");
    }

    @Override
    public void walk() {
        System.out.println("The fish cannot walk because it has " + legs + " legs.");
    }
}
