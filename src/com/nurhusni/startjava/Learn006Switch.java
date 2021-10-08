package com.nurhusni.startjava;

public class Learn006Switch {

    public static void main(String[] args) {

        String day = "Friday";

        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            default:
                System.out.println("It is " + day);
        }
    }
}
