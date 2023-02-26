package com.endava;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti genul angajatului (Male/Female):");
        String gen = input.next();

        System.out.println("Introduceti numarul de ani lucrati ai angajatului:");
        int aniExperienta = input.nextInt();

        System.out.println("Introduceti gradul de calificare al angajatului (Post-Graduate/Graduate):");
        String calificare = input.next();

        System.out.println("Un salariat " + gen + " cu " + aniExperienta + " ani de experienta si calificarea " + calificare
                + " castiga salariul de " + salariu(gen, aniExperienta, calificare) + ".");
    }

    public static int salariu(String gen, int aniExperienta, String calificare) {
        if (gen.equals("Male")) {
            if (aniExperienta >= 10) {
                if (calificare.equals("Post-Graduate")) {
                    return 15000;
                } else {
                    return 10000;
                }
            } else {
                if (calificare.equals("Post-Graduate")) {
                    return 10000;
                } else {
                    return 7000;
                }
            }
        } else {
            if (aniExperienta >= 10) {
                if (calificare.equals("Post-Graduate")) {
                    return 12000;
                } else {
                    return 9000;
                }
            } else {
                if (calificare.equals("Post-Graduate")) {
                    return 10000;
                } else {
                    return 6000;
                }
            }
        }
    }
}
