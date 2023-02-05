package com.endava;

import java.io.PrintStream;
import java.net.SocketOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduceti numarul exercitiului pentru care doriti solutia:\nIn caz ca doriti sa iesiti din executie introduceti 9.");
        Scanner keyboard = new Scanner(System.in);
        double primulNumar;
        double alDoileaNumar;
        int numarulExercitiuluiIntrodus;
        do {

            numarulExercitiuluiIntrodus = keyboard.nextInt();
            System.out.print("\n");
            switch (numarulExercitiuluiIntrodus) {
                case 1:
                    exercitiul1();
                    break;
                case 2:
                    System.out.println("Introduceti primul numar:");
                    primulNumar = keyboard.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    alDoileaNumar = keyboard.nextDouble();
                    exercitiul2(primulNumar, alDoileaNumar);
                    break;
                case 3:
                    System.out.println("Introduceti primul numar:");
                    primulNumar = keyboard.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    alDoileaNumar = keyboard.nextDouble();
                    exercitiul3(primulNumar, alDoileaNumar);
                    break;
                case 4:
                    break;
                case 5:
                    exercitiul5();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Ati iesit din program.");
                    break;
                default:
                    System.out.println("Numarul introdus este gresit.");
            }
            if (numarulExercitiuluiIntrodus != 9) {
                System.out.println("\n+++++++++++++++++++++++++++++++++\nAlegeti alt numar:");
            }
        } while (numarulExercitiuluiIntrodus != 9);
    }

    private static void exercitiul1() {
        System.out.println("Hello\nAlexandru Chirila");
    }

    private static void exercitiul2(double primulNumar, double alDoileaNumar) {

        Double suma = primulNumar + alDoileaNumar;
        System.out.printf("Suma este: %f\n", suma);
    }

    private static void exercitiul3(double primulNumar, double alDoileaNumar) {


        double suma = primulNumar + alDoileaNumar;
        double scadere = primulNumar - alDoileaNumar;
        double inmultire = primulNumar * alDoileaNumar;
        double impartire = primulNumar / alDoileaNumar;
        double restul = primulNumar % alDoileaNumar;
        String rezultatulSumei = Double.toString(primulNumar) + " + " + Double.toString(alDoileaNumar) + " = " + Double.toString(suma);
        String rezultatulScaderii = Double.toString(primulNumar) + " - " + Double.toString(alDoileaNumar) + " = " + Double.toString(scadere);
        String rezultatulInmultirii = Double.toString(primulNumar) + " * " + Double.toString(alDoileaNumar) + " = " + Double.toString(inmultire);
        String rezultatulImpartirii = Double.toString(primulNumar) + " / " + Double.toString(alDoileaNumar) + " = " + Double.toString(impartire);
        String rezultatulRestului = Double.toString(primulNumar) + " % " + Double.toString(alDoileaNumar) + " = " + Double.toString(restul);
        System.out.println("Rezultatul operatiilor este:");
        System.out.println(rezultatulSumei + "\n"
                + rezultatulScaderii + "\n"
                + rezultatulInmultirii + "\n"
                + rezultatulImpartirii + "\n"
                + rezultatulRestului);
    }

    private static void exercitiul5() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
}
