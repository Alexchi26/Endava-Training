package com.endava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayContents {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("You need to provide a file name while running this program.");
            return;
        }

        String fileName = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }
}
