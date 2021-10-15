package com.nurhusni.startjava;

import java.util.ArrayList;

public class Learn013TwoDimensionalArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> carModels = new ArrayList<>();

        ArrayList<String> toyotaCars = new ArrayList<>();
        toyotaCars.add("Innova");
        toyotaCars.add("Alphard");
        toyotaCars.add("Camry");

        ArrayList<String> volkswagenCars = new ArrayList<>();
        volkswagenCars.add("Scirocco");
        volkswagenCars.add("Polo");

        carModels.add(toyotaCars);
        carModels.add(volkswagenCars);

        System.out.println(carModels.get(0).get(0)); // "Innova"

    }
}
