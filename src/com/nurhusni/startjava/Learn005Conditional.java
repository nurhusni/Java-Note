package com.nurhusni.startjava;

public class Learn005Conditional {

    public static void main(String[] args) {

        int age = 22;

        if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age > 10 || age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a kid");
        }
    }
}
