package com.endava;

import java.util.Scanner;

public class Negatives {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti primul numar:");
        int primulNumar = input.nextInt();

        System.out.println("Introduceti al doilea numar:");
        int alDoileaNumar = input.nextInt();

        if(primulNumar < 0 && alDoileaNumar < 0){
            System.out.println("Amandoua numerele sunt negative.");
        } else {
            System.out.println("Cel putin un numar nu este negativ.");
        }
    }
}
