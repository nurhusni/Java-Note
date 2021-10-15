package com.nurhusni.startjava;

import java.util.Scanner;

public class Learn015TernaryOperators {

    public static void main(String[] args) {

        // Shorten conditional statements by using ternary operators
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = Integer.parseInt(scanner.nextLine());

        // Ternary Operators
        String message = age >= 18 ? "You're adult" : "You're still a kid";
        System.out.println(message);
    }
}
