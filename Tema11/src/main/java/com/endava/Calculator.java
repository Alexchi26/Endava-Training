package com.endava;

public class Calculator {
    public static int divide(int dividend, int divisor) throws CustomDivisionException {
        if (divisor == 0) {
            throw new CustomDivisionException("Division by 0 is not possible");
        }
        return dividend / divisor;
    }
}
