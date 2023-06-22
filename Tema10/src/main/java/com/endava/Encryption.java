package com.endava;

import java.io.*;
import static com.endava.Encrypter.encrypt;

public class Encryption {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You need to provide two file names while running the program. One for input and one for output.");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String encryptedLine = encrypt(line);
                writer.write(encryptedLine);
                writer.newLine();
            }

            System.out.println("The encryption was done successfully.");

        } catch (IOException e) {
            System.out.println("Error while encrypting: " + e.getMessage());
        }
    }
}
