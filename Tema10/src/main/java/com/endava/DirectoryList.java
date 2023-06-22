package com.endava;

import java.io.File;

public class DirectoryList {
    public static void main(String[] args) {

        String pathOfDirectory = "D:/torrent"; //Replace with a path from your computer.

        File directory = new File(pathOfDirectory);

        File[] directories = directory.listFiles();

        if (directories != null) {
            for (File item : directories) {
                System.out.println(item.getName());
            }
        } else {
            System.out.println("The directory doesn't exist!");
        }
    }
}