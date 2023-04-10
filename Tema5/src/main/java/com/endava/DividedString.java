package com.endava;

public class DividedString {

    public static void main(String[] args) {

        String inputString = "This is a test string";
        int counter = 0;
        int startSubString = 0;
        int numberToDivide = 7;

        if (inputString.length() % numberToDivide != 0) {
            System.out.println("The string cannot be divede in " + numberToDivide + " equal parts.");
            return;
        }

        for (int i = 0; i <= inputString.length(); i++) {
            if (counter == numberToDivide) {
                System.out.println(inputString.substring(startSubString, i));
                startSubString = i;
                counter = 0;
            }
            counter++;
        }
    }
}
