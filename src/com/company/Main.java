package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //*Načte input.txt*//
        File file = new File("input.txt");
        try {
            //*Čte přímo z file pomocí scanneru*//
            Scanner in = new Scanner(file);
            //*Pokud input.txt obsahuje prvek, vrátí true a pokračuje do loopu*//
            while (in.hasNext()) {
                String line = in.nextLine();
                //*Pokud line obsahuje ab a zároveň ba vypíše line*//
                if (line.contains("ab") && line.contains("ba")) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
