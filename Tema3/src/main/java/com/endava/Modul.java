package com.endava;

import java.util.Scanner;

public class Modul {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti numarul:");
        double numar = input.nextDouble();

        if (numar >= 0) {
            System.out.println("Valoarea absoluta a numarului este:" + numar);
        } else {
            System.out.println("Valoarea absoluta a numarului este:" + -numar);
        }

        System.out.println("Valoare absoluta a numarului este:" + (numar >= 0 ? numar : -numar));
    }
}
