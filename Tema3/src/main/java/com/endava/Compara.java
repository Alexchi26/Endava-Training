package com.endava;

import java.util.Scanner;

public class Compara {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Acest program returneaza numarul mai mare dintre cele doua care vor fi introduse.\n" +
                "Daca restul impartirii la 6 a celor doua numere este egal, programul va returna numarul mai mic.\n" +
                "Daca numerele sunt egal se va returna 0.\n");

        System.out.println("Introduceti primul numar:");
        int primulNumar = keyboard.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int alDoileaNumar = keyboard.nextInt();

        System.out.println("Rezultatul compararii este:" + compara(primulNumar, alDoileaNumar));
    }

    public static int compara(int primulNumar, int alDoileaNumar) {
        int compara = Integer.compare(primulNumar, alDoileaNumar);
        if ((primulNumar % 6) == (alDoileaNumar % 6)) {
            System.out.println("Cele doua numere au restul impartirii la 6 similar.");
            if (compara > 0) {
                return alDoileaNumar;
            } else if (compara < 0) {
                return primulNumar;
            } else {
                return 0;
            }
        } else {
            if (compara > 0) {
                return primulNumar;
            } else if (compara < 0) {
                return alDoileaNumar;
            } else {
                return 0;
            }
        }
    }
}