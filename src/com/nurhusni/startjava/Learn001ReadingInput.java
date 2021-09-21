package com.nurhusni.startjava;

import java.util.Scanner;

public class Learn001ReadingInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reading string
        String name = sc.nextLine();

        // Reading integer (or other data types)
        // First way
        int age = sc.nextInt();
        sc.nextLine(); // nextInt() doesn't clear out value, so this needs to be done

        // Second way
        int birthYear = Integer.parseInt(sc.nextLine());

        sc.close();
    }
}
