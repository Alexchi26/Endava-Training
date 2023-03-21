package com.endava;

import java.util.Arrays;

public class LongestSequence {

    public static int longestSequence(Integer[] givenArray) {
        Arrays.sort(givenArray);

        int sizeOfLongestSequence = 1, currentSize = 1;
        for (int i = 1; i <= givenArray.length - 1; i++) {
            if (givenArray[i] == givenArray[i - 1] + 1) {
                currentSize++;
                sizeOfLongestSequence = currentSize;
            } else {
                currentSize = 1;
            }
        }

        if (sizeOfLongestSequence == 1){
            System.out.println("We don't have a valid sequence!");
        }
        System.out.println("The longest sequence found has a length of: " + sizeOfLongestSequence);
        return sizeOfLongestSequence;
    }
}
