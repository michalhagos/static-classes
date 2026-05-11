package com.pluralsight;

public class NameFormatter {
    // the private constructor that will not allow me to create a new instance of a class
    private NameFormatter(){}

    // this is the first format method that only deals with the first and last name
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    // here is full format method that handles all five name parts
// prefix, middleName, and suffix are optional so empty string means not provided
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        // using StringBuilder for string building

        StringBuilder result = new StringBuilder();
    }








}
