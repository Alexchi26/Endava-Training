package com.endava;


import java.util.Scanner;

public class Login {
    private static final int CORRECT_USER = 12;
    private static final int CORRECT_PASSWORD = 1234;
    private static int numberOfTries = 3;

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        int introducedUser = 0;
        int introducedPassword = 0;

        while (numberOfTries != 0) {

            System.out.println("Introduce your user:");

            while (!keyboardInput.hasNextInt()) {
                System.out.println("Please introduce only integers! Try again:");
                keyboardInput.next();
            }

            introducedUser = keyboardInput.nextInt();

            System.out.println("Introduce your password:");

            while (!keyboardInput.hasNextInt()) {
                System.out.println("Please introduce only integers! Try again:");
                keyboardInput.next();
            }
            introducedPassword = keyboardInput.nextInt();

            if (introducedUser == CORRECT_USER && introducedPassword == CORRECT_PASSWORD) {
                System.out.println("The credentials introduced are correct!\n");
                return;
            } else {
                System.out.println("The credentials introduced are NOT correct!\n");
                numberOfTries--;
            }
        }

        if (numberOfTries == 0) {
            System.out.println("Maximum number of tries exceeded!");
        }
    }
}
