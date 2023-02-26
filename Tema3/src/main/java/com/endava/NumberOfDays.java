package com.endava;

import java.time.YearMonth;
import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti numarul lunii: ");
        int numarulLunii = keyboard.nextInt();
        System.out.println("Introduceti anul: ");
        int anul = keyboard.nextInt();

        System.out.println(numeleLunii(numarulLunii) + " " + anul + " has " + numarulDeZile(anul, numarulLunii) + " days.");

    }

    public static int numarulDeZile(int anul, int numarulLunii) {

        YearMonth yearMonthObject = YearMonth.of(anul, numarulLunii);
        return yearMonthObject.lengthOfMonth();
    }

    public static String numeleLunii(int numarulLunii) {

        return switch (numarulLunii) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Enter valid month.";
        };
    }
}
