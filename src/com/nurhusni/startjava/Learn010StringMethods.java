package com.nurhusni.startjava;

public class Learn010StringMethods {

    public static void main(String[] args) {

        String name = "Panji";
        String emptyArr = "";

        boolean isEqual = name.equals("panji"); // false
        boolean isEqualIgnoreCase = name.equalsIgnoreCase("panji"); // true
        int stringLength = name.length(); // 5
        char charAtIndex = name.charAt(0); // 'P'
        int indexOfWord = name.indexOf("P"); // 0

        String replaceChar = name.replace('a', 'i'); // "Pinji"

        boolean isNameEmpty = name.isEmpty(); // false
        boolean isEmptyArrEmpty = emptyArr.isEmpty(); // true

        String nameUpperCase = name.toUpperCase(); // "PANJI"
        String nameLowerCase = name.toLowerCase(); // "panji"

        String emptySpaces = "     test     ";
        String trimEmptySpaces = emptySpaces.trim(); // "test"

    }
}
