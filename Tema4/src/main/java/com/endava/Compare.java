package com.endava;

import java.util.Objects;

public class Compare {

    public static boolean compareStrings(String firstString, String secondString) {
        boolean result;

        if (Objects.equals(firstString, secondString)) {
            System.out.println("The two arrays introduced are lexicographically equal.");
            result = true;
        } else {
            System.out.println("The two arrays introduced are NOT lexicographically equal.");
            result = false;
        }

        return result;
    }
}
