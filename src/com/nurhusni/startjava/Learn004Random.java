package com.nurhusni.startjava;

import java.util.Random;

public class Learn004Random {

    public static void main(String[] args) {

        // Create an instance of the Random class
        Random random = new Random();

        // To find a random integer, use nextInt() method
        // The value of nextInt() limits the value range (optional)
        // The value '6' generates a value between 0 and 5
        int x = random.nextInt(6);

        // nextDouble() method generates value between 0 and 1
        double y = random.nextDouble();
    }
}
