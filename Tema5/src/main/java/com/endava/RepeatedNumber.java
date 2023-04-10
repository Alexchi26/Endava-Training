package com.endava;

import java.util.Scanner;

public class RepeatedNumber {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Please input the number you would like to be repeated:");
        int numberToBeRepeated = keyboardInput.nextInt();

        System.out.println("Please input the number of times the number just introduced will be repeated:");
        int numberOfRepetition = keyboardInput.nextInt();

        for (int i = 0; i < numberOfRepetition; i++) {
            System.out.print(numberToBeRepeated);
        }

        System.out.println();

        int j = 0;
        while (j < numberOfRepetition) {
            System.out.print(numberToBeRepeated);
            j++;
        }

        System.out.println();

        int k = 0;
        do {
            System.out.print(numberToBeRepeated);
            k++;
        } while(k < numberOfRepetition);
    }
}
