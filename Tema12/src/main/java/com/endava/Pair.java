package com.endava;

import java.util.Arrays;
import java.util.List;

public class Pair<T, S> {
    private T firstObject;
    private S secondObject;

    public Pair(T firstObject, S secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public static void main(String[] args) {

        Pair<Integer, Integer> intPair = new Pair<>(10, 20);

        System.out.println("Integer values");

        System.out.println("First value: " + intPair.getFirstObject());
        System.out.println("Second value: " + intPair.getSecondObject());

        intPair.setValues(0, -90);

        System.out.println("First value after reassignment : " + intPair.getFirstObject());
        System.out.println("Second value after reassignment: " + intPair.getSecondObject() + "\n");


        Pair<String, String> stringPair = new Pair<>("Hello", "World");

        System.out.println("String values");

        System.out.println("First value: " + stringPair.getFirstObject());
        System.out.println("Second value: " + stringPair.getSecondObject());

        stringPair.setValues(null, "");

        System.out.println("First value after reassignment: " + stringPair.getFirstObject());
        System.out.println("Second value after reassignment: " + stringPair.getSecondObject() + "\n");


        Pair<Double, Double> doublePair = new Pair<>(3.14, 1.6);

        System.out.println("Double values");

        System.out.println("First value: " + doublePair.getFirstObject());
        System.out.println("Second value: " + doublePair.getSecondObject());

        doublePair.setValues(0.0, -3.45);

        System.out.println("First value after reassignment: " + doublePair.getFirstObject());
        System.out.println("Second value after reassignment: " + doublePair.getSecondObject() + "\n");


        Pair<List<Integer>, List<Integer>> listPair = new Pair<>(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));

        System.out.println("List values");

        System.out.println("First value: " + listPair.getFirstObject());
        System.out.println("Second value: " + listPair.getSecondObject());

        listPair.setValues(Arrays.asList(), Arrays.asList(0));

        System.out.println("First value after reassignment: " + listPair.getFirstObject());
        System.out.println("Second value after reassignment: " + listPair.getSecondObject());
    }

    public void setValues(T firstObject, S secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirstObject() {
        return firstObject;
    }

    public S getSecondObject() {
        return secondObject;
    }
}

