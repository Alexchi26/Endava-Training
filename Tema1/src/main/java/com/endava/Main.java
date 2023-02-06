package com.endava;

import java.io.PrintStream;
import java.net.SocketOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduceti numarul exercitiului pentru care doriti solutia:\n" +
                "1 - Afisare mesaj Hello si numele.\n" +
                "2 - Calculul sumei a doua numere.\n" +
                "3 - Calculul a 5 operatii pentru doua numere.\n" +
                "4 - Afisarea steagului Americii.\n" +
                "5 - Afisarea datelor din Java.\n" +
                "6 - Calculul perimetrului si ariei pentru un cerc.\n" +
                "7 - Calculul mediei a trei numere.\n" +
                "8 - Calculul perimetrului si ariei unui dreptunghi.\n" +
                "In caz ca doriti sa iesiti din executie introduceti 9.\n");

        Scanner keyboard = new Scanner(System.in);
        double primulNumar;
        double alDoileaNumar;
        double alTreileaNumar;
        double raza;
        double latime;
        double lungime;
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
                    exercitiul4();
                    break;
                case 5:
                    exercitiul5();
                    break;
                case 6:
                    System.out.println("Introduceti raza cercului pentru care doriti sa calculati perimetrul si aria:");
                    raza = keyboard.nextDouble();
                    exercitiul6(raza);
                    break;
                case 7:
                    System.out.println("Introduceti primul numar:");
                    primulNumar = keyboard.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    alDoileaNumar = keyboard.nextDouble();
                    System.out.println("Introduceti al treilea numar:");
                    alTreileaNumar = keyboard.nextDouble();
                    exercitiul7(primulNumar, alDoileaNumar, alTreileaNumar);
                    break;
                case 8:
                    System.out.println("Introduceti latimea dreptunghiului:");
                    latime = keyboard.nextDouble();
                    System.out.println("Introduceti lungimea dreptunghiului:");
                    lungime = keyboard.nextDouble();
                    exercitiul8(latime, lungime);
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

    private static void exercitiul4() {
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * *   ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * *   ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * *   ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("* * * * *   ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }

    private static void exercitiul5() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }

    private static void exercitiul6(double raza) {

        Double perimetru = 2 * Math.PI * raza;
        Double aria = Math.PI * Math.pow(raza, 2);
        System.out.printf("Perimeter is = %f\n", perimetru);
        System.out.printf("Area is = %f\n", aria);

    }

    private static void exercitiul7(double primulNumar, double alDoileaNumar, double alTreileaNumar) {

        Double average = (primulNumar + alDoileaNumar + alTreileaNumar)/3;
        System.out.printf("The average for the 3 numbers is: %f\n", average);

    }

    private static void exercitiul8(double lungime, double latime) {

        Double perimetru = 2 * (lungime + latime);
        Double aria = lungime * latime;
        System.out.printf("Area is %f * %f = %f\n", latime, lungime, aria);
        System.out.printf("Perimeter is 2 * (%f * %f) = %f\n", latime, lungime, perimetru);

    }
}