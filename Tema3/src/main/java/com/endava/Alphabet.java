package com.endava;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti litera: ");
        String input = null;

        do {
            input = keyboard.next();
            if(!Character.isLetter(input.charAt(0)) || input.length() > 1){
                System.out.println("Incercati din nou!");
            }
        } while (!Character.isLetter(input.charAt(0)) || input.length() > 1);

       if (input.charAt(0) != 'a' && input.charAt(0) != 'e' && input.charAt(0) != 'i' && input.charAt(0) != 'o' && input.charAt(0) != 'u' &&
               input.charAt(0) != 'A' && input.charAt(0) != 'E' && input.charAt(0) != 'I' && input.charAt(0) != 'O' && input.charAt(0) != 'U') {
            System.out.println("Litera " + input.charAt(0) + " este Consoana.");
        } else {
            System.out.println("Litera " + input.charAt(0) + " este Vocala.");
        }
    }
}
