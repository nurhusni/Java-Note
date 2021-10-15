package com.nurhusni.startjava;

public class Learn015OverloadedMethods {

    public static void main(String[] args) {

        // Overloaded methods are the methods that have the same name but different parameters.
        // This works because it depends on the method signature.
        // Method signature is the method name + parameters.

        int a = 5;
        int b = 10;

        int c = add(a, b);
        int d = add(a, b, c);
        int e = add(a, b, c, d);

        System.out.println(e);
    }

    static int add(int a, int b) {
        return a + b;
    }

    // Return & parameter types are same, but the number of parameters aren't
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Return type is same, but one of parameter type isn't
    static int add(double a, int b) {
        return (int) (a + b);
    }

    // Return type is same, but both parameter types aren't
    static int add(double a, double b) {
        return (int) (a + b);
    }

    // Both return type and parameter types aren't the same
    static double add(double a, double b, double c) {
        return (int) (a + b + c);
    }
}
