package com.endava;

import java.util.ArrayList;
import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Introduceti primul numar:");
        int primulNumar = input.nextInt();
        lista.add(primulNumar);

        System.out.println("Introduceti al doilea numar:");
        int alDoileaNumar = input.nextInt();
        lista.add(alDoileaNumar);

        System.out.println("Introduceti al treilea numar:");
        int alTreileaNumar = input.nextInt();
        lista.add(alTreileaNumar);

        int max = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }

        System.out.println("Cel mai mare numar este: " + max);
    }
}
