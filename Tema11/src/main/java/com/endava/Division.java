package com.endava;

public class Division {

    public static double division(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("It's not possible to divide by 0.");
        }
        return dividend / divisor;
    }
}