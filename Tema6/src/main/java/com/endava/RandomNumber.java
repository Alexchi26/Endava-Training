package com.endava;

import java.util.Random;

public class RandomNumber {

    private static int m = 233280;
    private static int a = 9301;
    private static int c = 49297;
    private static int seed = 1;

    public static int getFloat() {
        seed = (seed * a + c) % m;
        return Math.abs(seed / m);
    }

    public static int getInt(int max) {
        return Math.round(max * getFloat());
    }

    public static int getInt(int min, int max) {
        Random randomNumber = new Random();
        return randomNumber.nextInt(max - min + 1) + min;
    }

}
