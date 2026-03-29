package org.example;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String result = CharCounter.countChars(text);

        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}