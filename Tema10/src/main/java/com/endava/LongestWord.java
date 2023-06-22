package com.endava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {

    public static void main (String[] args) {

        String pathOfFile = "C:/Users/chiri/OneDrive/Desktop/TestFile.txt"; //Replace with a path from your computer.

        try (BufferedReader reader = new BufferedReader(new FileReader(pathOfFile))) {
            String line;
            String longestWord = "";

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");


                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            System.out.println("The longest word is: " + longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
