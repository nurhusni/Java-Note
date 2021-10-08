package com.nurhusni.startjava;

import java.util.Scanner;

public class Learn008Loop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        // While Loop
        // Executes as long as the condition is true
        // Executes the code after checking the condition
        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // Do Loop
        // Executes the code first, and then checks the condition for the next iteration
        do {
            System.out.print("Enter your age: ");
            age = Integer.parseInt(scanner.nextLine());
        } while (name.isBlank());

        // For Loop
        // Executes based on iteration range
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
