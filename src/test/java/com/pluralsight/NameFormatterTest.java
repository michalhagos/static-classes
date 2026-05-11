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





}