package com.endava;

public class Encrypter {

    public static String encrypt(String inputString) {

        char[] charArrayContainingTheString = inputString.toCharArray();
        int tempIntValue;

        for (int i = 0; i < charArrayContainingTheString.length; i++) {
            tempIntValue = charArrayContainingTheString[i] + 1;
            charArrayContainingTheString[i] = (char) tempIntValue;
        }

        return String.valueOf(charArrayContainingTheString);

    }

    public static String decprypt(String inputString) {

        char[] charArrayContainingTheString = inputString.toCharArray();
        int tempIntValue;

        for (int i = 0; i < charArrayContainingTheString.length; i++) {
            tempIntValue = charArrayContainingTheString[i] - 1;
            charArrayContainingTheString[i] = (char) tempIntValue;
        }

        return String.valueOf(charArrayContainingTheString);
    }

}
