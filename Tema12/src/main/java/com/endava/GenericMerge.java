package com.endava;

import java.util.Arrays;

public class GenericMerge {

    public static <T> T[] mergeArrays(T[] array1, T[] array2) {

        T[] mergeArray = Arrays.copyOf(array1, array1.length + array2.length);

        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);

        return mergeArray;
    }

    public static void main(String[] args) {

        Integer[] intArray1 = {0, -2, 789};
        Integer[] intArray2 = {45, 5534, -6};
        Integer[] mergedIntArray = mergeArrays(intArray1, intArray2);

        System.out.println("Integer arrays merged:");
        System.out.println(Arrays.toString(mergedIntArray));


        String[] stringArray1 = {"This", "is"};
        String[] stringArray2 = {"a", "test", "string"};
        String[] mergedStringArray = mergeArrays(stringArray1, stringArray2);

        System.out.println("\n" + "String arrays merged:");
        System.out.println(Arrays.toString(mergedStringArray));


        Double[] doubleArray1 = {0.0, -5.3};
        Double[] doubleArray2 = {2.3, 5.33, 787.44};
        Double[] mergedDoubleArray = mergeArrays(doubleArray1, doubleArray2);

        System.out.println("\n" + "Double arrays merged:");
        System.out.println(Arrays.toString(mergedDoubleArray));
    }
}
