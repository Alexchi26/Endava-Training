package com.endava;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.endava.Division.division;

public class DivisionTest {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("Please introduce the dividend:");
            int divident = keyboard.nextInt();

            System.out.println("Please introduce the divisor:");
            int divisor = keyboard.nextInt();

            double divisionResult = division(divident, divisor);
            System.out.println("The division result of the 2 numbers you introduced is: " + divisionResult);

        } catch (InputMismatchException e) {
            System.out.println("The numbers introduced must be an integer.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        keyboard.close();
    }
}
