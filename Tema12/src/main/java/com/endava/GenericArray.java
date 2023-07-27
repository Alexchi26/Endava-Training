package com.endava;

public class GenericArray {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {0, 1, 2, 3, 4, 5};
        System.out.println("Integer array:");
        printArray(intArray);


        String[] stringArray = {"This", "is", "a", "generic", "string"};
        System.out.println("\n" + "String array:");
        printArray(stringArray);


        Double[] doubleArray = {0.0, 3.56, 2.543, 4.6544, 10.343};
        System.out.println("\n" + "Double array:");
        printArray(doubleArray);
    }
}
