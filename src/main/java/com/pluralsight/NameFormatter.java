package com.pluralsight;

public class NameFormatter {
    // the private constructor that will not allow me to create a new instance of a class
    private NameFormatter() {
    }

    // this is the first format method that only deals with the first and last name
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    // here is full format method that handles all five name parts
// prefix, middleName, and suffix are optional so empty string means not provided
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        // using StringBuilder for string building

        StringBuilder result = new StringBuilder();

        // lastName is always required so we always append it first added a comma for the format
        result.append(lastName).append(", ");


// only add prefix if one was provided for example "Dr." gets added before the first name
// example: "Dr." gets added before the first name
        if (!prefix.isEmpty()) {
            result.append(prefix).append(" ");
        }

// firstName is always required so we always append it
        result.append(firstName);

// only add middle name if one was provided for example "H" gets added after the first name with a space

        if (!middleName.isEmpty()) {
            result.append(" ").append(middleName);
        }

        // only add suffix if one was provided suffix is separated by a comma per the

        if (!suffix.isEmpty()) {
            result.append(", ").append(suffix);
        }

// this converts StringBuilder to a regular String and return it as completed name format
        return result.toString();


    }
}
