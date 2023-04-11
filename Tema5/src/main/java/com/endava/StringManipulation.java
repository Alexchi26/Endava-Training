package com.endava;

import java.util.ArrayList;

public class StringManipulation {

    static String UppercaseA(String inputString) {
        System.out.println("This is the initial string introduced:" + inputString);

        char[] charactersOfTheString = inputString.toCharArray();

        boolean isTheCharASpace = true;

        if (charactersOfTheString[0] == 'a') {
            charactersOfTheString[0] = Character.toUpperCase(charactersOfTheString[0]);
        }

        for (int i = 0; i < charactersOfTheString.length; i++) {
            if (Character.isLetter(charactersOfTheString[i])) {
                if (isTheCharASpace) {
                    isTheCharASpace = false;
                } else {
                    if (charactersOfTheString[i] == 'a') {
                        charactersOfTheString[i] = Character.toUpperCase(charactersOfTheString[i]);
                    }
                }
            } else if (charactersOfTheString[i] == ' ') {
                isTheCharASpace = true;
            }
        }

        String stringModified = String.valueOf(charactersOfTheString);
        System.out.println("This is the string modified:" + stringModified);

        return stringModified;
    }

    static String initialsDisply(String inputString) {
        System.out.println("This is the inital string introduced:" + inputString);

        char[] charactersOfTheString = inputString.toCharArray();
        ArrayList<String> listContainingTheInitials = new ArrayList<String>();

        boolean isTheCharASpace = true;

        for (int i = 0; i < charactersOfTheString.length; i++) {
            if (Character.isLetter(charactersOfTheString[i])) {
                if (isTheCharASpace) {
                    listContainingTheInitials.add(String.valueOf(charactersOfTheString[i]));
                    isTheCharASpace = false;
                }
            } else if (charactersOfTheString[i] == ' ') {
                isTheCharASpace = true;
            }
        }

        String stringContainingTheInitials = String.join(" ", listContainingTheInitials);

        System.out.println("This are the initials:" + stringContainingTheInitials);

        return stringContainingTheInitials;
    }

    static String oddAndEvenTransformation(String inputString) {
        System.out.println("This is the inital string introduced:" + inputString);

        char[] charactersOfTheString = inputString.toCharArray();

        for (int i = 0; i < charactersOfTheString.length; i++) {
            if (i % 2 != 0) {
                charactersOfTheString[i] = Character.toUpperCase(charactersOfTheString[i]);
            } else {
                charactersOfTheString[i] = Character.toLowerCase(charactersOfTheString[i]);
            }
        }

        String stringModified = String.valueOf(charactersOfTheString);
        System.out.println("This is the string modified:" + stringModified);

        return stringModified;
    }


}
