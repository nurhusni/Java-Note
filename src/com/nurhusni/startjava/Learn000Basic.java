package com.nurhusni.startjava;

public class Learn000Basic {

    public static void main(String[] args) {

        // Note from learning Java
        System.out.println("Hello World!");

        // Data types and how to assign variables
        // String is reference type (stores data)
        // The others are primitive types (stores address in the memory)
        boolean booleanType = true; // 1 bit | true or false

        byte byteType = 127; // 1 byte | -127 to 127
        short shortType = 32767; // 2 bytes | -32,768 to 32,767
        int integerType = 2147483647; // 4 bytes | from -2,147,483,648
        long longType = 9223372036854775807L; // 8 bytes | from -9,223,372,036,854,775,808 | ends with 'L'

        float floatType = 3.141592f; // 4 bytes | 6-7 decimal digits | ends with 'f'
        double doubleType = 3.14653589793; // 8 bytes | 15 decimal digits

        char characterType = 'a'; // 2 bytes | single character or ASCII values | single quotes
        String stringType = "kata"; // various | multiple characters | double quotes

        // Escape sequences
        String newLine = "\n";
        String tab = "\t";
        String doubleQuote = "\"";
        String backslash = "\\";
    }
}
