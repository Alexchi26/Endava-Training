package com.endava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of the file you want to be opened: ");
        String fileName = keyboard.nextLine();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Access denied: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("File successfully opened and read.");
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            } else {
                System.out.println("Error: File could not be opened or read.");
            }
        }

        keyboard.close();
    }
}
