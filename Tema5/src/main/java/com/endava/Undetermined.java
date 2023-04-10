package com.endava;

import java.util.Scanner;

public class Undetermined {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Please insert numbers, take in consideration that if you input 0 the sequence will end.");

        double number = keyboardInput.nextDouble();

        while (number != 0) {
            number = keyboardInput.nextDouble();
        }
    }
}