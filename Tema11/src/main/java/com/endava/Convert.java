package com.endava;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = keyboard.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted string: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please insert only integers.");
        }
    }
}
