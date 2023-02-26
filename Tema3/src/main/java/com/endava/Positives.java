package com.endava;

import java.util.Scanner;

public class Positives {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti primul numar:");
        int primulNumar = input.nextInt();

        System.out.println("Introduceti al doilea numar:");
        int alDoileaNumar = input.nextInt();

        int amountOfPositives = 0;
        if (primulNumar > 0) {
            amountOfPositives++;
        }
        if (alDoileaNumar > 0) {
            amountOfPositives++;
        }

        int amountOfPositives1 = (primulNumar > 0 ? 1 : 0) + (alDoileaNumar > 0 ? 1 : 0);

        System.out.println("Ati introdus " + amountOfPositives + " numere pozitive.");
        System.out.println("Ati introdus " + amountOfPositives1 + " numere pozitive.");
    }
}
