package com.endava;

import java.io.*;
import java.util.Scanner;

public class WriteInFile {

    public static void main(String[] args) {

        String pathOfFile = "C:/Users/chiri/OneDrive/Desktop/TestFile.txt"; //Replace with a path from your computer.

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathOfFile, true))) {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Please enter some sentences:\n" +
                    "To exit the execution press enter.");

            while (true) {
                String sentence = keyboard.nextLine();

                if (sentence.isEmpty()) {
                    break;
                }

                writer.write(sentence);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
