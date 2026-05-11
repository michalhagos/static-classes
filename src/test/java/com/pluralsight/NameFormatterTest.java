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





}