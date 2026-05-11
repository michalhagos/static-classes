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

    // this is a format method that accepts a single full name string and parses it
// my input should be in this order: Prefix FirstName MiddleName LastName, Suffix

    public static String format(String fullName) {
        // split on ", " first to separate the suffix from the rest of the name

        String suffix = "";
        String[] suffixSplit = fullName.split(", ");
        if (suffixSplit.length > 1) {
            suffix = suffixSplit[1].trim();
            fullName = suffixSplit[0].trim();
        }

// split the remaining name into individual parts by space
//
        String[] parts = fullName.split(" ");

// check if the first part is a prefix by looking for a period at the end for example: "Dr." ends with "." so it is a prefix
        String prefix = "";
        int startIndex = 0;
        if (parts[0].endsWith(".")) {
            prefix = parts[0];
            startIndex = 1;
        }
// last part is always the last name regardless of how many parts there are so just added it and the index is length -1
        String lastName = parts[parts.length - 1];

// the first name always comes right after the prefix or at index 0 if no prefix
        String firstName = parts[startIndex];

// middle name is everything between the first name and last name
// using StringBuilder to combine multiple middle name parts if needed
        StringBuilder middleName = new StringBuilder();
        for (int i = startIndex + 1; i < parts.length - 1; i++) {
            middleName.append(parts[i]).append(" ");
        }


    }














}
