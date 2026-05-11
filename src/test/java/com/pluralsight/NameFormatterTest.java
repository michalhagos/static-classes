package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void format_should_returnLastNameFirst_whenGivenFirstAndLastName() {
        // arrange
        String expected = "Bennett, Marcus";
        // act
        String result = NameFormatter.format("Marcus", "Bennett");
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void format_should_includePrefixAndSuffix_whenAllFivePartsProvided() {
        // arrange
        String expected = "Ramirez, Dr. Sofia Elena, PhD";
        // act
        String result = NameFormatter.format("Dr.", "Sofia", "Elena", "Ramirez", "PhD");
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void format_should_excludePrefix_whenPrefixIsEmpty() {
        // arrange
        String expected = "Nakamura, Aiden James, PhD";
        // act
        String result = NameFormatter.format("", "Aiden", "James", "Nakamura", "PhD");
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void format_should_excludeMiddleNameAndSuffix_whenBothAreEmpty() {
        // arrange
        String expected = "Hassan, Layla";
        // act
        String result = NameFormatter.format("", "Layla", "", "Hassan", "");
        // assert
        assertEquals(expected, result);
    }


    @Test
    public void format_should_parseFullName_withPrefixAndSuffix() {
        // arrange
        String expected = "Okafor, Dr. Nadia Simone, PhD";
        // act
        String result = NameFormatter.format("Dr. Nadia Simone Okafor, PhD");
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void format_should_parseFullName_withSuffixOnly() {
        // arrange
        String expected = "Petrov, Carlos Andre, Jr";
        // act
        String result = NameFormatter.format("Carlos Andre Petrov, Jr");
        // assert
        assertEquals(expected, result);
    }








}