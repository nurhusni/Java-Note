package com.nurhusni.startjavabc;

public class BC01Basic {

    public static void main(String[] args) {

        // Note from learning Java from BroCode
        System.out.println("Hello World!");

        // Data types and how to assign variables
        // String is reference type (stores data)
        // The others are primitive types (stores address in the memory)
        boolean booleanType = true; // 1 bit true or false

        byte byteType = 127; // 1 byte -127 to 127
        short shortType = 32767; // 2 bytes -32768 to 32767
        int integerType = 2000000000; // 4 bytes 2 billion
        long longType = 9000000000000000000L; // 8 bytes 9 quintillion with 'L' at the end

        float floatType = 3.141592f; // 4 bytes 6-7 digits with 'f' at the end
        double doubleType = 3.14653589793; // 8 bytes 15 digits

        char characterType = 'a'; // 2 bytes single character
        String stringType = "kata";

        // Escape sequences
        String newLine = "\n";
        String tab = "\t";
        String doubleQuote = "\"";
        String backslash = "\\";
    }
}
