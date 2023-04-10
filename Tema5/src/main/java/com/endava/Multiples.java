package com.endava;

public class Multiples {

    public static void main(String[] args) {

        System.out.println("This are the numbers from 1 to 1000 that are multiples of 3 and 5.");

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
