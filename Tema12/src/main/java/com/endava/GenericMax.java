package com.endava;

public class GenericMax {

    public static <T extends Comparable<T>> T getMax(T[] array) {

        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Integer[] intArray = {0, 1, 2, 3, 4};
        Integer maxInt = getMax(intArray);
        System.out.println("Max: " + maxInt);


        String[] stringArray = {"This", "is", "a", "generic", "string"};
        String maxString = getMax(stringArray);
        System.out.println("Max: " + maxString);


        Double[] doubleArray = {0.0, 3.56, 2.543, 4.6544, 10.343};
        Double maxDouble = getMax(doubleArray);
        System.out.println("Max: " + maxDouble);
    }
}
