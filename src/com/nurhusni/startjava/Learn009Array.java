package com.nurhusni.startjava;

import java.util.Arrays;

public class Learn009Array {

    public static void main(String[] args) {

        // There are two ways to create an array

        // First Way
        // This creates a fixed-sized arrays
        // Array size is determined on String[size]
        int[] intArr = new int[5]; // [0, 0, 0, 0, 0]
        double[] doubleArr = new double[3]; // [0.0, 0.0, 0.0]
        boolean[] boolArr = new boolean[3]; // [false, false, false]
        char[] charArr = new char[3]; // null characters or '\u0000' (wouldn't be properly displayed)
        String[] stringArr = new String[3]; // [null, null, null]

        System.out.println(Arrays.toString(stringArr));

        // Second Way
        // This creates a fixed-sized array with 4 items
        // Array size is determined by how many items are initialized
        String[] carBrands = {"Toyota", "Volkswagen", "Tesla", "Lexus"};

        // Change the value
        carBrands[0] = "Tesla"; // change the item on index 0 to "Tesla"

        // =========================================================
        // Multi-dimensional array
        int[][] multiArray = new int[5][5];

        String[][] carModels = {
                {"Innova", "Alphard", "Fortuner"},
                {"Golf", "Polo", "Scirocco"},
                {"Model S", "Model ", "Cybertruck"},
                {"RX", "LS", "LM"},
        };

        carModels[0][2] = "Camry";

        // =========================================================
        // Print out arrays to command line

        // You CAN'T do it this way
        // This prints out the array's ADDRESS on memory
        System.out.println(carBrands); // prints out [Ljava.lang.String;@e9e54c2

        // You HAVE to do it this way
        System.out.println(Arrays.toString(carBrands));

        // For multi-dimensional array, use .deepToString()
        System.out.println(Arrays.deepToString(carModels));

        // =========================================================
        // Loop through array

        // Enhanced for
        // Shortcut: carBrands.for
        for (String car : carBrands) {
            System.out.println(car);
        }

        // For loop
        // Shortcut: carBrands.fori
        for (int i = 0; i < carBrands.length; i++) {
            System.out.println(carBrands[i]);
        }

        // Reverse for loop
        // Shortcut: carBrands.forr
        for (int i = carBrands.length - 1; i >= 0; i--) {
            System.out.println(carBrands[i]);
        }

    }
}
