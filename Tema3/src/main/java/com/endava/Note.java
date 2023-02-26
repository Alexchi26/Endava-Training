package com.endava;

import java.util.Scanner;

public class Note {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti nota numeric:");
        int notaNumerica = input.nextInt();

        if (notaNumerica == 9 || notaNumerica == 10) {
            System.out.println("Outstanding");
        } else if (notaNumerica == 7 || notaNumerica == 8) {
            System.out.println("Remarkable");
        } else if (notaNumerica == 6) {
            System.out.println("Good");
        } else if (notaNumerica == 5) {
            System.out.println("Accepted");
        } else if (notaNumerica >= 0 && notaNumerica <= 4) {
            System.out.println("Failed");
        }

        switch (notaNumerica) {
            case 0, 1, 2, 3, 4:
                System.out.println("Failed");
                break;
            case 5:
                System.out.println("Accepted");
                break;
            case 6:
                System.out.println("Good");
                break;
            case 7, 8:
                System.out.println("Remarkable");
                break;
            case 9, 10:
                System.out.println("Outstanding");
                break;
            default:
                System.out.println("Nu ati introdus o nota corecta!");
                break;
        }
    }
}
