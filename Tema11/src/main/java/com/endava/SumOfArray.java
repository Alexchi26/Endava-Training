package com.endava;

public class SumOfArray {

    public static int sumOfArrayElements(int[] array) {
        try{
            int sum = 0;

            if (array == null) {
                throw new IllegalArgumentException("The array is null!");
            }

            for (int number : array) {
                sum = sum + number;
            }

            return sum;
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: You must only enter integers.");
        }

        return 0;
    }
}
