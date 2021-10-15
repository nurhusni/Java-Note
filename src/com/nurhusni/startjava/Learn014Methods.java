package com.nurhusni.startjava;

import java.util.Scanner;

public class Learn014Methods {

    public static void main(String[] args) {
        helloWorld();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        hiYou(name);

        int age = askAge();
        System.out.println("Your age is " + age);

        scanner.close();
    }

    static void helloWorld() {
        System.out.println("Hello World!");
    }

    static void hiYou(String name) {
        System.out.println("Hi, " + name);
    }

    static int askAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your age? ");
        int age = Integer.parseInt(scanner.nextLine());

        scanner.close();

        return age;
    }
}
