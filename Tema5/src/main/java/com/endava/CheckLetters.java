package com.endava;

public class CheckLetters {

    public static boolean lettersInTheFirstString(String firstString, String secondString) {

        boolean result = false;

        for (int i = 0; i < firstString.length(); i++) {
            for (int j = 0; j < secondString.length(); j++) {
                result = firstString.charAt(i) == secondString.charAt(j);
            }
        }

        if (result) {
            System.out.println("All the letters in the second string are also in the first string");
        } else {
            System.out.println("NOT all the letters in the second string are also in the first string");
        }

        return result;
    }
}
