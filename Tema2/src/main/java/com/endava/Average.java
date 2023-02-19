package com.endava;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Calculate the average of three numbers that you input next.");
        System.out.println("Please insert the first number:");
        double firstNumber = keyboard.nextDouble();
        System.out.println("Please insert the second number:");
        double secondNumber = keyboard.nextDouble();
        System.out.println("Please insert the third number:");
        double thirdNumber = keyboard.nextDouble();
        double average = calculateAverage(firstNumber, secondNumber, thirdNumber);
        System.out.println("The average of the three numbers you put in is: " + average);
    }
    public static double calculateAverage(double firstNumber, double secondNumber, double thirdNumber){
        return (firstNumber + secondNumber + thirdNumber) / 3 ;
    }
}