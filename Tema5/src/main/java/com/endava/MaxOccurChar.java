package com.endava;

public class MaxOccurChar {

    public static char maxOccurChar(String inputString) {

        System.out.println("This is the input string " + inputString);

        int[] counter = new int[256];
        char theMostOccuring = ' ';
        int max = 0;


        for (int i = 0; i < inputString.length(); i++) {
            counter[inputString.charAt(i)]++;
        }

        for (int i = 0; i < inputString.length(); i++) {
            if (max < counter[inputString.charAt(i)]) {
                max = counter[inputString.charAt(i)];
                theMostOccuring = inputString.charAt(i);
            }
        }

        System.out.println("The most occurring character in the input string is: " + theMostOccuring + " with " + max + " occurrences.");
        return theMostOccuring;
    }
}
