package com.endava;

public class StringUtils {
    public static String reverse(String inputString) {

        String reversedString = "";
        char tempChar;

        System.out.println("This is the string that was introduced: " + inputString);

        for (int i = 0; i < inputString.length(); i++) {
            tempChar = inputString.charAt(i);
            reversedString = tempChar + reversedString;
        }

        System.out.println("This is the string reversed: " + reversedString);
        return reversedString;
    }
}