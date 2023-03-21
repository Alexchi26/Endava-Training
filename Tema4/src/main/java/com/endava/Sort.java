package com.endava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {

    public static Integer[] numericSort(Integer[] arrayToBeSorted) {
        Arrays.sort(arrayToBeSorted);
        System.out.println("The array that you introduced sorted looks like this: " + Arrays.toString(arrayToBeSorted));
        return arrayToBeSorted;
    }

    public static String[] numericSort(String[] arrayToBeSorted) {
        Arrays.sort(arrayToBeSorted);
        System.out.println("The array that you introduced sorted looks like this: " + Arrays.toString(arrayToBeSorted));
        return arrayToBeSorted;
    }
}
