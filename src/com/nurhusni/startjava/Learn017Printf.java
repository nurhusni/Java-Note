package com.nurhusni.startjava;

import java.util.Scanner;

public class Learn017Printf {

    public static void main(String[] args) {

        // printf() is a method to format printed texts on terminal.
        // It needs
        // [-flag] [-width field] [-precision] [conversion characters]

        // ----------------------------------------------------------------
        // List of conversion characters:
        // %b = boolean
        // %d = integers and other whole number types
        // %f = double and other floating number types
        // %c = char
        // %s = String

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("What's your age? ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("My name is %s \n", name);
        System.out.printf("My age is %d years old \n", 22);

        // ----------------------------------------------------------------
        // Width field will print [n-number of chars]-number of blank spaces
        String hello = "Hello";
        // Below prints 5 blank spaces BEFORE the string
        // 5 blank spaces because it wants 10 width field (5 blanks + 5 chars of "Hello")
        System.out.printf("%10s World \n", hello); // "     Hello World"
        // Give "-" as the flag for the reverse (left-justify)
        // Below prints 5 blank spaces AFTER the string
        System.out.printf("%-10s World \n", hello); // "Hello      World"

        // ----------------------------------------------------------------
        // Precision specifies number of significant figures for floating numbers
        double hundredDoubles = 100;
        System.out.printf("%f \n", hundredDoubles); // "100.000000"
        System.out.printf("%.0f \n", hundredDoubles); // "100"
        System.out.printf("%.2f \n",hundredDoubles); // "100.00"
        System.out.printf("%.10f \n", hundredDoubles); // "100.0000000000"
        // It can be used with width field
        System.out.printf("%10.1f \n", hundredDoubles); // "     100.0"
        System.out.printf("%-10.1f\n", hundredDoubles); // "100.0     "
        // But if the number of precision is more than width field,
        // width field will not work
        System.out.printf("%5.10f \n", hundredDoubles); // "100.0000000000"

        // ----------------------------------------------------------------
        // Flag gives certain effect to the output
        // - : left-justify (like on using width field)

        // + : output a plus (+) or minus (-) sign for numeric or floating values
        // If the number is positive, it'll give plus sign
        // If it's negative, it'll give negative sign
        int hundred = 100;
        int minusHundred = -100;
        System.out.printf("%+d \n", hundred); // "+100"
        System.out.printf("%+d \n", minusHundred); // "-100"

        // 0 : numeric values are zero-padded for width-field
        // It'll give "0" instead of blank spaces
        System.out.printf("%05d \n", hundred); // "00100"

        // , : gives comma separator if numbers > 1000
        int million = 1000000;
        System.out.printf("%,d \n", million); // "1,000,000"

        scanner.close();
    }
}
