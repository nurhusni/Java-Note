package com.nurhusni.startjavabc;

import javax.swing.JOptionPane;

public class BC03GUI {

    public static void main(String[] args) {

        // Show dialog with a string input
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

        // Show dialog with an integer input (or other data types)
        // showInputDialog returns string, you need to parse the return value
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in cm)"));
        JOptionPane.showMessageDialog(
                null,
                "You're " + age + " years old and " + height + " cm tall"
        );
    }
}
