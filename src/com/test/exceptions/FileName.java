package com.test.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileName {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "nonexistentfile.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//        try {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (IOException e) {
//            // Handle the exception
//            e.printStackTrace();
//        }
    }
}