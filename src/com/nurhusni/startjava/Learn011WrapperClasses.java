package com.nurhusni.startjava;

public class Learn011WrapperClasses {

    public static void main(String[] args) {

        // Wrapper class converts primitive data types to reference data types
        // Used to make use of the methods on reference data types

        // Primitive => Wrapper
        // boolean => Boolean
        // char => Character
        // int => Integer
        // double => Double
        // etc

        // Autoboxing: Automatic conversion from primitive to wrapper by inferring the data type
        // Unboxing: Automatic conversion from wrapper to primitive

        // Autoboxing
        Boolean boolWrapper = true;
        Character charWrapper = 'a';
        Integer intWrapper = 123;
        Double doubleWrapper = 2.718;

        // Unboxing
        // It still treats wrapper as primitive
        if (boolWrapper) {
            System.out.println("Wrapper unboxed");
        }
    }
}
