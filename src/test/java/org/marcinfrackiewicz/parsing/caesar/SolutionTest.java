package org.marcinfrackiewicz.parsing.caesar;

import static org.marcinfrackiewicz.parsing.caesar.Solution.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void nonLetterCharacterPassed_ThrowsIllegalArgumentException() {
        Throwable exception =
                assertThrows(IllegalArgumentException.class, () -> caesarEncoder("4", 5));
        assertEquals("Characters have to be alphabet letters", exception.getMessage());
    }

    @Test
    void noCharactersPassed_ReturnsEmptyString() {
        String result = caesarEncoder("", 5);
        assertEquals("", result);
    }

    @Test
    void keyValueIsZero_ReturnsTheSameString() {
        String test = "abad";
        String result = caesarEncoder(test, 0);
        assertEquals(test, result);
    }

    @Test
    void keyValueBelowZero_ThrowsIllegalArgumentException() {
        String test = "abad";
        Throwable exception =
                assertThrows(IllegalArgumentException.class, () -> caesarEncoder(test, -2));
        assertEquals("Key has to be a positive number", exception.getMessage());
    }

    @Test
    void stringPassed_ReturnsEncodedString() {
        String test = "abad";
        String result = caesarEncoder(test, 3);
        assertEquals("dedg", result);
    }

    @Test
    void keyIsGreaterThan25_ReturnsEncodedString() {
        String test = "abad";
        String result = caesarEncoder(test, 26);
        assertEquals("bcbe", result);
    }

    @Test
    void keyIsGreaterThan50_ReturnsEncodedString() {
        String test = "bcbe";
        String result = caesarEncoder(test, 51);
        assertEquals("cdcf", result);
    }

    @Test
    void someCharactersAreUnderflowed_ReturnsDecodedString() {
        String test = "abad";
        String result = caesarDecoder(test, 1);
        assertEquals("zazc", result);
    }

    @Test
    void keyIsGreaterThan25_ReturnsDecodedString() {
        String test = "abad";
        String result = caesarDecoder(test, 26);
        assertEquals("zazc", result);
    }

    @Test
    void keyIsGreaterThan50_ReturnsDecodedString() {
        String test = "abad";
        String result = caesarDecoder(test, 51);
        assertEquals("zazc", result);
    }

    @Test
    void stringPassed_ReturnsDecodedString() {
        String test = "cdcf";
        String result = caesarDecoder(test, 2);
        assertEquals("abad", result);
    }

    @Test
    void stringsPassed_ReturnsEncodedStrings() {
        String[] data = {"abad", "bcbe", "dedg"};
        String[] results = {"cdcf", "dedg", "fgfi"};
        for (int i = 0; i < data.length; i++) {
            String result = caesarEncoder(data[i], 2);
            assertEquals(results[i], result);
        }
    }
}