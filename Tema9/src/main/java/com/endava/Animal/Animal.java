package com.endava.Animal;

public abstract class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("It walks on " + legs + " legs.");
    }
}
