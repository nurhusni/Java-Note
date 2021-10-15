package com.nurhusni.startjava;

import java.util.ArrayList;

public class Learn012ArrayList {

    public static void main(String[] args) {

        // Arrays are fixed-sized. The size of array has to be initialized first.
        // Collections aren't fixed sized.
        // Items on collections can be added or removed.
        // List is an interface and one of Collections.
        // ArrayList is the implementation of List.
        // ArrayList stores reference data types or wrapper class.

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<String> carBrands = new ArrayList<String>();

        // =========================================================
        // Add items to ArrayList
        // Below add Integer into the ArrayList
        intArrayList.add(2021);
        intArrayList.add(2022);
        carBrands.add("Toyota");
        carBrands.add("Volkswagen");
        carBrands.add("Ford");
        carBrands.add(3, "BMW"); // Add item on index 3
        carBrands.add(1, "Porsche"); // Add item on index 1 and pushes items on 1, 2, ... to the next index

        // =========================================================
        // Replace items
        carBrands.set(0, "Lexus"); // Replace item on index 0 ("Toyota") with "Lexus"
        intArrayList.remove(1); // Remove item on index 1
        intArrayList.clear(); // Remove all items

        // =========================================================
        // Loop through ArrayList
        // Enhanced for for Integer
        for (Integer item : intArrayList) {
            System.out.println(item);
        }

        // Enhanced for for String
        for (String carBrand : carBrands) {
            System.out.println(carBrand);
        }

        for (int i = 0; i < carBrands.size(); i++) {
            System.out.println(carBrands.get(i));
        }

        for (int i = carBrands.size() - 1; i >= 0; i--) {
            System.out.println(carBrands.get(i));
        }
    }
}
