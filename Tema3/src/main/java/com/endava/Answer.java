package com.endava;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti primul numar:");
        int primulNumar = input.nextInt();

        System.out.println("Introduceti al doilea numar:");
        int alDoileaNumar = input.nextInt();

        String primulNumarPozitiv = primulNumar > 0 ? "Primul numar este pozitiv" : "Primul numar este negativ";
        System.out.println(primulNumarPozitiv);

        String alDoileaNumarPozitiv = alDoileaNumar > 0 ? "Al doilea numar este pozitiv" : "Al doilea numar este negativ";
        System.out.println(alDoileaNumarPozitiv);

        String numereleSuntPozitive = (primulNumar > 0) && (alDoileaNumar > 0) ? "Amandoua numerele sunt pozitive" : "Nu sunt pozitive amandoua numerele";
        System.out.println(numereleSuntPozitive);

        int min = primulNumar > alDoileaNumar ? primulNumar : alDoileaNumar;
        System.out.println("Numarul mai mic este: " + min);
    }
}
