package com.endava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoreContent {

    public static void main (String[] args) {

        String pathOfFile = "C:/Users/chiri/OneDrive/Desktop/TestFile.txt"; //Replace with a path from your computer.

        try (BufferedReader reader = new BufferedReader(new FileReader(pathOfFile))) {
            String line;

            List<String> lines = new ArrayList<>();

            while ((line = reader.readLine()) != null ) {
                lines.add(line);
            }

            for (String item : lines) {
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
